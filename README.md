## reverseGram

Experimental **third-party** Telegram client based on [exteraGram](https://github.com/exteraSquad/exteraGram).

[![Github Stars](https://img.shields.io/github/stars/Reeversee/reverseGram?color=%2364f573&style=for-the-badge)](https://github.com/Reeversee/reverseGram/stargazers) 
 [![Github License](https://img.shields.io/github/license/Reeversee/reverseGram?color=%2364f573&style=for-the-badge)](https://github.com/Reeversee/reverseGram/blob/master/COPYING) 
 [![Github Downloads](https://img.shields.io/github/downloads/Reeversee/reverseGram/total.svg?color=%23f5ad64&style=for-the-badge)](https://github.com/Reeversee/reverseGram/releases/) 
 [![Github Latest](https://img.shields.io/github/v/release/Reeversee/reverseGram?display_name=tag&color=%23f5ad64&style=for-the-badge)](https://github.com/Reeversee/reverseGram/releases/latest)

## Importing API hash and keys 
 - You should get **YOUR OWN API KEY AND HASH** here: https://core.telegram.org/api/obtaining_api_id and create a file called `API_KEYS` in the source root directory. 
 - Also you should get **YOUR OWN MAPS API KEY** here: https://console.cloud.google.com/google/maps-apis/credentials and add it to this file. 
 - And you need to generate **SIGNING KEY**: https://developer.android.com/studio/publish/app-signing#generate-key 
  
 The file content should look like this: 
 ``` 
 APP_ID = 123456 
 APP_HASH = abcdef0123456789 (32 chars) 
 MAPS_V2_API = abcdef01234567-abcdef012345678910111213 
  
 SIGNING_KEY_PASSWORD = A1BcDEFHJ2KLMn3oP 
 SIGNING_KEY_ALIAS = abcdefghjklm 
 SIGNING_KEY_STORE_PASSWORD = Z9yXDEFHJ6KRqn7oP 
 ``` 
  
 ## Compilation Guide 
 1. Clone reverseGram's source code using `git clone https://github.com/Reeversee/reverseGram.git` 
 2. Fill out values in `API_KEYS` like [here](https://github.com/Reeversee/reverseGram#importing-api-hash-and-keys) 
 3. Open the project in Android Studio. It should be opened, **not imported** 
 4. You are ready to compile `reverseGram` 
  
 - **reverseGram** can be built with **Android Studio** or from the command line with **Gradle**: 
 ``` 
 ./gradlew assembleAfatRelease 
 ``` 

## Thanks to:
- [Telegram](https://github.com/DrKLO/Telegram)
- [exteraGram](https://github.com/exteraSquad/exteraGram)