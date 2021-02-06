# StayAtHome-Deobfuscator / Cerberus
Android App to deobfuscate StayAtHome/Cerberus MRAT String

### How to use

1. Clone this repo or import this project in Android Studio
```
https://github.com/NullException0/StayAtHome-Deobfuscator.git
```
2. Open this project with Android Studio.
3. In MainActivity.java, change e and d value with encryption key found in StayAtHome/Cerberus sample.
4. Build and run on the emulator.
5. If didn't work, well you have to reverse your sample.

### How to get the decryption class?
You have to reverse the malware itself, find the key located in its java class, this encryption method is based on this hash sample

Dropper:
```
9c4c5035012b3b8a88d8bbe5a2f94baa
b61c8f5157a38a1b40b4294be3e8cb29
548bae857891cc7e578031922def6c5a
8ff52a49b6efc41c5bd3f77c406297f3
69efe778721dcd66bbd7ed1eaf2ae116
```

Main Module:
```
4ab5a95e8443dd5a98bccff50a49d0cc
086aa916e3de9133415dab0075deeced
97d31fb3c830f7a441288e1853371c07
```

### MyCERT advisory
```
https://www.mycert.org.my/portal/advisory?id=MA-788.062020
```
