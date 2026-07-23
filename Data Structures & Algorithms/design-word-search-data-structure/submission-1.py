class Trie:
    def __init__(self):
        self.children = {}
        self.end = False

class WordDictionary:

    def __init__(self):
        self.root = Trie()

    def addWord(self, word: str) -> None:
        curr = self.root

        for c in word:
            if c not in curr.children:
                curr.children[c] = Trie()
            curr = curr.children[c]
        curr.end = True

    def search(self, word: str) -> bool:
        
        def dfs(i,curr):
            if i == len(word):
                return curr.end

            c = word[i]
            if c == '.':
                for child in curr.children.values():
                    if dfs(i+1,child):
                        return True
                return False
            else:
                if c not in curr.children:
                    return False
                return dfs(i+1,curr.children[c])

        return dfs(0,self.root)


