package typingsJapgolly.keythereum

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.keythereum.anon.C
import typingsJapgolly.keythereum.anon.Dklen
import typingsJapgolly.keythereum.anon.FnCall
import typingsJapgolly.keythereum.anon.FnCallAlgorithmKeyIvOptions
import typingsJapgolly.keythereum.anon.FnCallSizeCallback
import typingsJapgolly.keythereum.anon.Iv
import typingsJapgolly.keythereum.anon.Mac
import typingsJapgolly.keythereum.keythereumInts.`3`
import typingsJapgolly.keythereum.keythereumStrings.pbkdf2
import typingsJapgolly.keythereum.keythereumStrings.scrypt
import typingsJapgolly.keythereum.mod.KeyStore.CryptoParams
import typingsJapgolly.keythereum.mod.KeyStore.KeyDeriveOptions
import typingsJapgolly.keythereum.mod.KeyStore.Type
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.bufferMod.global.BufferEncoding
import typingsJapgolly.node.cryptoMod.BinaryLike
import typingsJapgolly.node.cryptoMod.Cipher
import typingsJapgolly.node.cryptoMod.CipherCCM
import typingsJapgolly.node.cryptoMod.CipherCCMOptions
import typingsJapgolly.node.cryptoMod.CipherCCMTypes
import typingsJapgolly.node.cryptoMod.CipherGCM
import typingsJapgolly.node.cryptoMod.CipherGCMOptions
import typingsJapgolly.node.cryptoMod.CipherGCMTypes
import typingsJapgolly.node.cryptoMod.CipherKey
import typingsJapgolly.node.cryptoMod.CipherOCB
import typingsJapgolly.node.cryptoMod.CipherOCBOptions
import typingsJapgolly.node.cryptoMod.CipherOCBTypes
import typingsJapgolly.node.cryptoMod.Decipher
import typingsJapgolly.node.cryptoMod.DecipherCCM
import typingsJapgolly.node.cryptoMod.DecipherGCM
import typingsJapgolly.node.cryptoMod.DecipherOCB
import typingsJapgolly.node.streamMod.TransformOptions
import typingsJapgolly.std.Partial
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("keythereum", JSImport.Namespace)
  @js.native
  val ^ : Instance = js.native
  
  type Callback[R] = js.Function1[/* result */ R, Unit]
  
  trait Constants extends StObject {
    
    var cipher: String
    
    var ivBytes: Double
    
    var keyBytes: Double
    
    var pbkdf2: C
    
    var scrypt: Dklen
  }
  object Constants {
    
    inline def apply(cipher: String, ivBytes: Double, keyBytes: Double, pbkdf2: C, scrypt: Dklen): Constants = {
      val __obj = js.Dynamic.literal(cipher = cipher.asInstanceOf[js.Any], ivBytes = ivBytes.asInstanceOf[js.Any], keyBytes = keyBytes.asInstanceOf[js.Any], pbkdf2 = pbkdf2.asInstanceOf[js.Any], scrypt = scrypt.asInstanceOf[js.Any])
      __obj.asInstanceOf[Constants]
    }
    
    extension [Self <: Constants](x: Self) {
      
      inline def setCipher(value: String): Self = StObject.set(x, "cipher", value.asInstanceOf[js.Any])
      
      inline def setIvBytes(value: Double): Self = StObject.set(x, "ivBytes", value.asInstanceOf[js.Any])
      
      inline def setKeyBytes(value: Double): Self = StObject.set(x, "keyBytes", value.asInstanceOf[js.Any])
      
      inline def setPbkdf2(value: C): Self = StObject.set(x, "pbkdf2", value.asInstanceOf[js.Any])
      
      inline def setScrypt(value: Dklen): Self = StObject.set(x, "scrypt", value.asInstanceOf[js.Any])
    }
  }
  
  trait CryptoInstance extends StObject {
    
    def createCipheriv(algorithm: String, key: CipherKey): Cipher
    def createCipheriv(algorithm: String, key: CipherKey, iv: Null, options: TransformOptions): Cipher
    def createCipheriv(algorithm: String, key: CipherKey, iv: BinaryLike): Cipher
    def createCipheriv(algorithm: String, key: CipherKey, iv: BinaryLike, options: TransformOptions): Cipher
    def createCipheriv(algorithm: CipherCCMTypes, key: CipherKey, iv: BinaryLike, options: CipherCCMOptions): CipherCCM
    def createCipheriv(algorithm: CipherGCMTypes, key: CipherKey, iv: BinaryLike): CipherGCM
    def createCipheriv(algorithm: CipherGCMTypes, key: CipherKey, iv: BinaryLike, options: CipherGCMOptions): CipherGCM
    def createCipheriv(algorithm: CipherOCBTypes, key: CipherKey, iv: BinaryLike, options: CipherOCBOptions): CipherOCB
    @JSName("createCipheriv")
    var createCipheriv_Original: FnCall
    
    def createDecipheriv(algorithm: String, key: CipherKey): Decipher
    def createDecipheriv(algorithm: String, key: CipherKey, iv: Null, options: TransformOptions): Decipher
    def createDecipheriv(algorithm: String, key: CipherKey, iv: BinaryLike): Decipher
    def createDecipheriv(algorithm: String, key: CipherKey, iv: BinaryLike, options: TransformOptions): Decipher
    def createDecipheriv(algorithm: CipherCCMTypes, key: CipherKey, iv: BinaryLike, options: CipherCCMOptions): DecipherCCM
    def createDecipheriv(algorithm: CipherGCMTypes, key: CipherKey, iv: BinaryLike): DecipherGCM
    def createDecipheriv(algorithm: CipherGCMTypes, key: CipherKey, iv: BinaryLike, options: CipherGCMOptions): DecipherGCM
    def createDecipheriv(algorithm: CipherOCBTypes, key: CipherKey, iv: BinaryLike, options: CipherOCBOptions): DecipherOCB
    @JSName("createDecipheriv")
    var createDecipheriv_Original: FnCallAlgorithmKeyIvOptions
    
    def getCiphers(): js.Array[String]
    @JSName("getCiphers")
    var getCiphers_Original: js.Function0[js.Array[String]]
    
    var pbkdf2: js.UndefOr[
        js.Function6[
          /* password */ BinaryLike, 
          /* salt */ BinaryLike, 
          /* iterations */ Double, 
          /* keylen */ Double, 
          /* digest */ String, 
          /* callback */ js.Function2[/* err */ js.Error | Null, /* derivedKey */ Buffer, Unit], 
          Unit
        ]
      ] = js.undefined
    
    var pbkdf2Sync: js.UndefOr[
        js.Function5[
          /* password */ BinaryLike, 
          /* salt */ BinaryLike, 
          /* iterations */ Double, 
          /* keylen */ Double, 
          /* digest */ String, 
          Buffer
        ]
      ] = js.undefined
    
    def randomBytes(size: Double): Buffer
    def randomBytes(size: Double, callback: js.Function2[/* err */ js.Error | Null, /* buf */ Buffer, Unit]): Unit
    @JSName("randomBytes")
    var randomBytes_Original: FnCallSizeCallback
  }
  object CryptoInstance {
    
    inline def apply(
      createCipheriv: FnCall,
      createDecipheriv: FnCallAlgorithmKeyIvOptions,
      getCiphers: CallbackTo[js.Array[String]],
      randomBytes: FnCallSizeCallback
    ): CryptoInstance = {
      val __obj = js.Dynamic.literal(createCipheriv = createCipheriv.asInstanceOf[js.Any], createDecipheriv = createDecipheriv.asInstanceOf[js.Any], getCiphers = getCiphers.toJsFn, randomBytes = randomBytes.asInstanceOf[js.Any])
      __obj.asInstanceOf[CryptoInstance]
    }
    
    extension [Self <: CryptoInstance](x: Self) {
      
      inline def setCreateCipheriv(value: FnCall): Self = StObject.set(x, "createCipheriv", value.asInstanceOf[js.Any])
      
      inline def setCreateDecipheriv(value: FnCallAlgorithmKeyIvOptions): Self = StObject.set(x, "createDecipheriv", value.asInstanceOf[js.Any])
      
      inline def setGetCiphers(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "getCiphers", value.toJsFn)
      
      inline def setPbkdf2(
        value: (/* password */ BinaryLike, /* salt */ BinaryLike, /* iterations */ Double, /* keylen */ Double, /* digest */ String, /* callback */ js.Function2[/* err */ js.Error | Null, /* derivedKey */ Buffer, Unit]) => japgolly.scalajs.react.Callback
      ): Self = StObject.set(x, "pbkdf2", js.Any.fromFunction6((t0: /* password */ BinaryLike, t1: /* salt */ BinaryLike, t2: /* iterations */ Double, t3: /* keylen */ Double, t4: /* digest */ String, t5: /* callback */ js.Function2[/* err */ js.Error | Null, /* derivedKey */ Buffer, Unit]) => (value(t0, t1, t2, t3, t4, t5)).runNow()))
      
      inline def setPbkdf2Sync(
        value: (/* password */ BinaryLike, /* salt */ BinaryLike, /* iterations */ Double, /* keylen */ Double, /* digest */ String) => Buffer
      ): Self = StObject.set(x, "pbkdf2Sync", js.Any.fromFunction5(value))
      
      inline def setPbkdf2SyncUndefined: Self = StObject.set(x, "pbkdf2Sync", js.undefined)
      
      inline def setPbkdf2Undefined: Self = StObject.set(x, "pbkdf2", js.undefined)
      
      inline def setRandomBytes(value: FnCallSizeCallback): Self = StObject.set(x, "randomBytes", value.asInstanceOf[js.Any])
    }
  }
  
  trait CryptoOptions extends StObject {
    
    var cipher: String
  }
  object CryptoOptions {
    
    inline def apply(cipher: String): CryptoOptions = {
      val __obj = js.Dynamic.literal(cipher = cipher.asInstanceOf[js.Any])
      __obj.asInstanceOf[CryptoOptions]
    }
    
    extension [Self <: CryptoOptions](x: Self) {
      
      inline def setCipher(value: String): Self = StObject.set(x, "cipher", value.asInstanceOf[js.Any])
    }
  }
  
  type DeriveKeyOptions = Partial[CryptoOptions & KeyDeriveOptions]
  
  trait EncryptOptions extends StObject {
    
    var ivBytes: Double
    
    var keyBytes: Double
  }
  object EncryptOptions {
    
    inline def apply(ivBytes: Double, keyBytes: Double): EncryptOptions = {
      val __obj = js.Dynamic.literal(ivBytes = ivBytes.asInstanceOf[js.Any], keyBytes = keyBytes.asInstanceOf[js.Any])
      __obj.asInstanceOf[EncryptOptions]
    }
    
    extension [Self <: EncryptOptions](x: Self) {
      
      inline def setIvBytes(value: Double): Self = StObject.set(x, "ivBytes", value.asInstanceOf[js.Any])
      
      inline def setKeyBytes(value: Double): Self = StObject.set(x, "keyBytes", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Instance extends StObject {
    
    var browser: Boolean = js.native
    
    var constants: Constants = js.native
    
    def create(params: EncryptOptions): Record[String, Buffer] = js.native
    def create(params: EncryptOptions, callback: Callback[Record[String, Buffer]]): Unit = js.native
    
    var crypto: CryptoInstance = js.native
    
    def decrypt(ciphertext: String, key: String, iv: String): Buffer = js.native
    def decrypt(ciphertext: String, key: String, iv: String, algorithm: String): Buffer = js.native
    def decrypt(ciphertext: String, key: String, iv: Buffer): Buffer = js.native
    def decrypt(ciphertext: String, key: String, iv: Buffer, algorithm: String): Buffer = js.native
    def decrypt(ciphertext: String, key: Buffer, iv: String): Buffer = js.native
    def decrypt(ciphertext: String, key: Buffer, iv: String, algorithm: String): Buffer = js.native
    def decrypt(ciphertext: String, key: Buffer, iv: Buffer): Buffer = js.native
    def decrypt(ciphertext: String, key: Buffer, iv: Buffer, algorithm: String): Buffer = js.native
    def decrypt(ciphertext: Buffer, key: String, iv: String): Buffer = js.native
    def decrypt(ciphertext: Buffer, key: String, iv: String, algorithm: String): Buffer = js.native
    def decrypt(ciphertext: Buffer, key: String, iv: Buffer): Buffer = js.native
    def decrypt(ciphertext: Buffer, key: String, iv: Buffer, algorithm: String): Buffer = js.native
    def decrypt(ciphertext: Buffer, key: Buffer, iv: String): Buffer = js.native
    def decrypt(ciphertext: Buffer, key: Buffer, iv: String, algorithm: String): Buffer = js.native
    def decrypt(ciphertext: Buffer, key: Buffer, iv: Buffer): Buffer = js.native
    def decrypt(ciphertext: Buffer, key: Buffer, iv: Buffer, algorithm: String): Buffer = js.native
    
    def deriveKey(password: String, salt: String): Buffer = js.native
    def deriveKey(password: String, salt: String, options: Unit, callback: Callback[Buffer]): Unit = js.native
    def deriveKey(password: String, salt: String, options: DeriveKeyOptions): Buffer = js.native
    def deriveKey(password: String, salt: String, options: DeriveKeyOptions, callback: Callback[Buffer]): Unit = js.native
    def deriveKey(password: String, salt: Buffer): Buffer = js.native
    def deriveKey(password: String, salt: Buffer, options: Unit, callback: Callback[Buffer]): Unit = js.native
    def deriveKey(password: String, salt: Buffer, options: DeriveKeyOptions): Buffer = js.native
    def deriveKey(password: String, salt: Buffer, options: DeriveKeyOptions, callback: Callback[Buffer]): Unit = js.native
    def deriveKey(password: Buffer, salt: String): Buffer = js.native
    def deriveKey(password: Buffer, salt: String, options: Unit, callback: Callback[Buffer]): Unit = js.native
    def deriveKey(password: Buffer, salt: String, options: DeriveKeyOptions): Buffer = js.native
    def deriveKey(password: Buffer, salt: String, options: DeriveKeyOptions, callback: Callback[Buffer]): Unit = js.native
    def deriveKey(password: Buffer, salt: Buffer): Buffer = js.native
    def deriveKey(password: Buffer, salt: Buffer, options: Unit, callback: Callback[Buffer]): Unit = js.native
    def deriveKey(password: Buffer, salt: Buffer, options: DeriveKeyOptions): Buffer = js.native
    def deriveKey(password: Buffer, salt: Buffer, options: DeriveKeyOptions, callback: Callback[Buffer]): Unit = js.native
    
    def dump(derivedKey: Buffer, privateKey: Buffer, salt: Buffer, iv: Buffer): Type = js.native
    def dump(
      derivedKey: Buffer,
      privateKey: Buffer,
      salt: Buffer,
      iv: Buffer,
      options: Unit,
      callback: Callback[Type]
    ): Unit = js.native
    def dump(derivedKey: Buffer, privateKey: Buffer, salt: Buffer, iv: Buffer, options: MarshalOptions): Type = js.native
    def dump(
      derivedKey: Buffer,
      privateKey: Buffer,
      salt: Buffer,
      iv: Buffer,
      options: MarshalOptions,
      callback: Callback[Type]
    ): Unit = js.native
    
    def encrypt(plaintext: String, key: String, iv: String): Buffer = js.native
    def encrypt(plaintext: String, key: String, iv: String, algorithm: String): Buffer = js.native
    def encrypt(plaintext: String, key: String, iv: Buffer): Buffer = js.native
    def encrypt(plaintext: String, key: String, iv: Buffer, algorithm: String): Buffer = js.native
    def encrypt(plaintext: String, key: Buffer, iv: String): Buffer = js.native
    def encrypt(plaintext: String, key: Buffer, iv: String, algorithm: String): Buffer = js.native
    def encrypt(plaintext: String, key: Buffer, iv: Buffer): Buffer = js.native
    def encrypt(plaintext: String, key: Buffer, iv: Buffer, algorithm: String): Buffer = js.native
    def encrypt(plaintext: Buffer, key: String, iv: String): Buffer = js.native
    def encrypt(plaintext: Buffer, key: String, iv: String, algorithm: String): Buffer = js.native
    def encrypt(plaintext: Buffer, key: String, iv: Buffer): Buffer = js.native
    def encrypt(plaintext: Buffer, key: String, iv: Buffer, algorithm: String): Buffer = js.native
    def encrypt(plaintext: Buffer, key: Buffer, iv: String): Buffer = js.native
    def encrypt(plaintext: Buffer, key: Buffer, iv: String, algorithm: String): Buffer = js.native
    def encrypt(plaintext: Buffer, key: Buffer, iv: Buffer): Buffer = js.native
    def encrypt(plaintext: Buffer, key: Buffer, iv: Buffer, algorithm: String): Buffer = js.native
    
    def exportToFile(store: Type): String = js.native
    def exportToFile(store: Type, keystore: String): String = js.native
    def exportToFile(store: Type, keystore: String, callback: Callback[String]): Unit = js.native
    def exportToFile(store: Type, keystore: Unit, callback: Callback[String]): Unit = js.native
    
    def generateKeystoreFilename(address: String): String = js.native
    
    def getMAC(derivedKey: String, ciphertext: String): Buffer = js.native
    def getMAC(derivedKey: String, ciphertext: Buffer): Buffer = js.native
    def getMAC(derivedKey: Buffer, ciphertext: String): Buffer = js.native
    def getMAC(derivedKey: Buffer, ciphertext: Buffer): Buffer = js.native
    
    def importFromFile(address: String): Type = js.native
    def importFromFile(address: String, datadir: String): Type = js.native
    def importFromFile(address: String, datadir: String, callback: Callback[Type]): Unit = js.native
    def importFromFile(address: String, datadir: Unit, callback: Callback[Type]): Unit = js.native
    
    def isBase64(input: String): Boolean = js.native
    
    def isCipherAvailable(chiperName: String): Boolean = js.native
    
    def isHex(input: String): Boolean = js.native
    
    def marshal(derivedKey: Buffer, privateKey: Buffer, salt: Buffer, iv: Buffer): Type = js.native
    def marshal(derivedKey: Buffer, privateKey: Buffer, salt: Buffer, iv: Buffer, options: MarshalOptions): Type = js.native
    
    def privateKeyToAddress(privateKey: String): String = js.native
    def privateKeyToAddress(privateKey: Buffer): String = js.native
    
    def str2buf(input: String): Buffer = js.native
    def str2buf(input: String, encoding: BufferEncoding): Buffer = js.native
    
    var version: String = js.native
  }
  
  trait KeyStore extends StObject {
    
    var address: String
    
    var crypto: CryptoParams
    
    var id: String
    
    var version: `3`
  }
  object KeyStore {
    
    inline def apply(address: String, crypto: CryptoParams, id: String): KeyStore = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], crypto = crypto.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], version = 3)
      __obj.asInstanceOf[KeyStore]
    }
    
    type Crypto = CryptoParams & KeyDeriveOptions & Mac
    
    trait CryptoParams extends StObject {
      
      var cipher: String
      
      var cipherparams: Iv
      
      var ciphertext: String
    }
    object CryptoParams {
      
      inline def apply(cipher: String, cipherparams: Iv, ciphertext: String): CryptoParams = {
        val __obj = js.Dynamic.literal(cipher = cipher.asInstanceOf[js.Any], cipherparams = cipherparams.asInstanceOf[js.Any], ciphertext = ciphertext.asInstanceOf[js.Any])
        __obj.asInstanceOf[CryptoParams]
      }
      
      extension [Self <: CryptoParams](x: Self) {
        
        inline def setCipher(value: String): Self = StObject.set(x, "cipher", value.asInstanceOf[js.Any])
        
        inline def setCipherparams(value: Iv): Self = StObject.set(x, "cipherparams", value.asInstanceOf[js.Any])
        
        inline def setCiphertext(value: String): Self = StObject.set(x, "ciphertext", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.keythereum.mod.KeyStore.SCryptParams
      - typingsJapgolly.keythereum.mod.KeyStore.PBKDF2Params
    */
    trait KeyDeriveOptions extends StObject
    object KeyDeriveOptions {
      
      inline def PBKDF2Params(kdfparams: C): typingsJapgolly.keythereum.mod.KeyStore.PBKDF2Params = {
        val __obj = js.Dynamic.literal(kdf = "pbkdf2", kdfparams = kdfparams.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.keythereum.mod.KeyStore.PBKDF2Params]
      }
      
      inline def SCryptParams(kdfparams: Dklen): typingsJapgolly.keythereum.mod.KeyStore.SCryptParams = {
        val __obj = js.Dynamic.literal(kdf = "scrypt", kdfparams = kdfparams.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.keythereum.mod.KeyStore.SCryptParams]
      }
    }
    
    extension [Self <: KeyStore](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setCrypto(value: CryptoParams): Self = StObject.set(x, "crypto", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: `3`): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
    
    trait PBKDF2Params
      extends StObject
         with KeyDeriveOptions {
      
      var kdf: pbkdf2
      
      var kdfparams: C
    }
    object PBKDF2Params {
      
      inline def apply(kdfparams: C): PBKDF2Params = {
        val __obj = js.Dynamic.literal(kdf = "pbkdf2", kdfparams = kdfparams.asInstanceOf[js.Any])
        __obj.asInstanceOf[PBKDF2Params]
      }
      
      extension [Self <: PBKDF2Params](x: Self) {
        
        inline def setKdf(value: pbkdf2): Self = StObject.set(x, "kdf", value.asInstanceOf[js.Any])
        
        inline def setKdfparams(value: C): Self = StObject.set(x, "kdfparams", value.asInstanceOf[js.Any])
      }
    }
    
    trait SCryptParams
      extends StObject
         with KeyDeriveOptions {
      
      var kdf: scrypt
      
      var kdfparams: Dklen
    }
    object SCryptParams {
      
      inline def apply(kdfparams: Dklen): SCryptParams = {
        val __obj = js.Dynamic.literal(kdf = "scrypt", kdfparams = kdfparams.asInstanceOf[js.Any])
        __obj.asInstanceOf[SCryptParams]
      }
      
      extension [Self <: SCryptParams](x: Self) {
        
        inline def setKdf(value: scrypt): Self = StObject.set(x, "kdf", value.asInstanceOf[js.Any])
        
        inline def setKdfparams(value: Dklen): Self = StObject.set(x, "kdfparams", value.asInstanceOf[js.Any])
      }
    }
    
    trait Type extends StObject {
      
      var address: String
      
      var crypto: Crypto
      
      var id: String
      
      var version: `3`
    }
    object Type {
      
      inline def apply(address: String, crypto: Crypto, id: String): Type = {
        val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], crypto = crypto.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], version = 3)
        __obj.asInstanceOf[Type]
      }
      
      extension [Self <: Type](x: Self) {
        
        inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
        
        inline def setCrypto(value: Crypto): Self = StObject.set(x, "crypto", value.asInstanceOf[js.Any])
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setVersion(value: `3`): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      }
    }
  }
  
  type MarshalOptions = Partial[CryptoOptions & EncryptOptions & KeyDeriveOptions]
  
  type _To = Instance
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Instance = ^
}
