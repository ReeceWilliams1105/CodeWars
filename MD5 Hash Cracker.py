import hashlib

def crack(hash):
    for i in range(100000):
        i = f'{i:05d}'
        tempHash = hashlib.md5(i.encode())
        if str(tempHash.hexdigest()) == hash:
            return str(i)


crack("86aa400b65433b608a9db30070ec60cd")
