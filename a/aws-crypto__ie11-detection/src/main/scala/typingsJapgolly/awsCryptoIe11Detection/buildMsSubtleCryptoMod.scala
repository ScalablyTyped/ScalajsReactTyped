package typingsJapgolly.awsCryptoIe11Detection

import typingsJapgolly.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.HMAC
import typingsJapgolly.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.`RSAES-PKCS1-v1_5`
import typingsJapgolly.awsCryptoIe11Detection.buildCryptoOperationMod.CryptoOperation
import typingsJapgolly.awsCryptoIe11Detection.buildKeyMod.Key
import typingsJapgolly.awsCryptoIe11Detection.buildKeyOperationMod.KeyOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildMsSubtleCryptoMod {
  
  type EncryptionOrVerificationAlgorithm = `RSAES-PKCS1-v1_5`
  
  trait HashAlgorithm extends StObject {
    
    var name: Ie11DigestAlgorithm
  }
  object HashAlgorithm {
    
    inline def apply(name: Ie11DigestAlgorithm): HashAlgorithm = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[HashAlgorithm]
    }
    
    extension [Self <: HashAlgorithm](x: Self) {
      
      inline def setName(value: Ie11DigestAlgorithm): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait HmacAlgorithm extends StObject {
    
    var hash: HashAlgorithm
    
    var name: HMAC
  }
  object HmacAlgorithm {
    
    inline def apply(hash: HashAlgorithm): HmacAlgorithm = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], name = "HMAC")
      __obj.asInstanceOf[HmacAlgorithm]
    }
    
    extension [Self <: HmacAlgorithm](x: Self) {
      
      inline def setHash(value: HashAlgorithm): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setName(value: HMAC): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.`SHA-1`
    - typingsJapgolly.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.`SHA-256`
    - typingsJapgolly.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.`SHA-384`
  */
  trait Ie11DigestAlgorithm extends StObject
  object Ie11DigestAlgorithm {
    
    inline def `SHA-1`: typingsJapgolly.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.`SHA-1` = "SHA-1".asInstanceOf[typingsJapgolly.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.`SHA-1`]
    
    inline def `SHA-256`: typingsJapgolly.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.`SHA-256` = "SHA-256".asInstanceOf[typingsJapgolly.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.`SHA-256`]
    
    inline def `SHA-384`: typingsJapgolly.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.`SHA-384` = "SHA-384".asInstanceOf[typingsJapgolly.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.`SHA-384`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.`AES-CBC`
    - typingsJapgolly.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.`AES-GCM`
    - typingsJapgolly.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.`RSA-OAEP`
    - typingsJapgolly.awsCryptoIe11Detection.buildMsSubtleCryptoMod.EncryptionOrVerificationAlgorithm
  */
  type Ie11EncryptionAlgorithm = _Ie11EncryptionAlgorithm | EncryptionOrVerificationAlgorithm
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.encrypt
    - typingsJapgolly.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.decrypt
    - typingsJapgolly.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.sign
    - typingsJapgolly.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.verify
    - typingsJapgolly.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.derive
    - typingsJapgolly.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.wrapKey
    - typingsJapgolly.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.unwrapKey
    - typingsJapgolly.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.importKey
  */
  trait KeyUsage extends StObject
  object KeyUsage {
    
    inline def decrypt: typingsJapgolly.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.decrypt = "decrypt".asInstanceOf[typingsJapgolly.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.decrypt]
    
    inline def derive: typingsJapgolly.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.derive = "derive".asInstanceOf[typingsJapgolly.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.derive]
    
    inline def encrypt: typingsJapgolly.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.encrypt = "encrypt".asInstanceOf[typingsJapgolly.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.encrypt]
    
    inline def importKey: typingsJapgolly.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.importKey = "importKey".asInstanceOf[typingsJapgolly.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.importKey]
    
    inline def sign: typingsJapgolly.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.sign = "sign".asInstanceOf[typingsJapgolly.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.sign]
    
    inline def unwrapKey: typingsJapgolly.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.unwrapKey = "unwrapKey".asInstanceOf[typingsJapgolly.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.unwrapKey]
    
    inline def verify: typingsJapgolly.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.verify = "verify".asInstanceOf[typingsJapgolly.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.verify]
    
    inline def wrapKey: typingsJapgolly.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.wrapKey = "wrapKey".asInstanceOf[typingsJapgolly.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.wrapKey]
  }
  
  @js.native
  trait MsSubtleCrypto extends StObject {
    
    def decrypt(algorithm: Ie11EncryptionAlgorithm, key: Key): CryptoOperation = js.native
    def decrypt(algorithm: Ie11EncryptionAlgorithm, key: Key, buffer: js.typedarray.ArrayBufferView): CryptoOperation = js.native
    
    def digest(algorithm: Ie11DigestAlgorithm): CryptoOperation = js.native
    def digest(algorithm: Ie11DigestAlgorithm, buffer: js.typedarray.ArrayBufferView): CryptoOperation = js.native
    
    def encrypt(algorithm: Ie11EncryptionAlgorithm, key: Key): CryptoOperation = js.native
    def encrypt(algorithm: Ie11EncryptionAlgorithm, key: Key, buffer: js.typedarray.ArrayBufferView): CryptoOperation = js.native
    
    def exportKey(format: String, key: Key): KeyOperation = js.native
    
    def generateKey(algorithm: Ie11EncryptionAlgorithm): KeyOperation = js.native
    def generateKey(algorithm: Ie11EncryptionAlgorithm, extractable: Boolean): KeyOperation = js.native
    def generateKey(algorithm: Ie11EncryptionAlgorithm, extractable: Boolean, keyUsages: js.Array[KeyUsage]): KeyOperation = js.native
    def generateKey(algorithm: Ie11EncryptionAlgorithm, extractable: Unit, keyUsages: js.Array[KeyUsage]): KeyOperation = js.native
    def generateKey(algorithm: SigningAlgorithm): KeyOperation = js.native
    def generateKey(algorithm: SigningAlgorithm, extractable: Boolean): KeyOperation = js.native
    def generateKey(algorithm: SigningAlgorithm, extractable: Boolean, keyUsages: js.Array[KeyUsage]): KeyOperation = js.native
    def generateKey(algorithm: SigningAlgorithm, extractable: Unit, keyUsages: js.Array[KeyUsage]): KeyOperation = js.native
    
    def importKey(format: String, keyData: js.typedarray.ArrayBufferView, algorithm: Any): KeyOperation = js.native
    def importKey(format: String, keyData: js.typedarray.ArrayBufferView, algorithm: Any, extractable: Boolean): KeyOperation = js.native
    def importKey(
      format: String,
      keyData: js.typedarray.ArrayBufferView,
      algorithm: Any,
      extractable: Boolean,
      keyUsages: js.Array[KeyUsage]
    ): KeyOperation = js.native
    def importKey(
      format: String,
      keyData: js.typedarray.ArrayBufferView,
      algorithm: Any,
      extractable: Unit,
      keyUsages: js.Array[KeyUsage]
    ): KeyOperation = js.native
    
    def sign(algorithm: SigningAlgorithm, key: Key): CryptoOperation = js.native
    def sign(algorithm: SigningAlgorithm, key: Key, buffer: js.typedarray.ArrayBufferView): CryptoOperation = js.native
    
    def verify(algorithm: EncryptionOrVerificationAlgorithm, key: Key, signature: js.typedarray.ArrayBufferView): CryptoOperation = js.native
    def verify(
      algorithm: EncryptionOrVerificationAlgorithm,
      key: Key,
      signature: js.typedarray.ArrayBufferView,
      buffer: js.typedarray.ArrayBufferView
    ): CryptoOperation = js.native
    def verify(algorithm: SigningAlgorithm, key: Key, signature: js.typedarray.ArrayBufferView): CryptoOperation = js.native
    def verify(
      algorithm: SigningAlgorithm,
      key: Key,
      signature: js.typedarray.ArrayBufferView,
      buffer: js.typedarray.ArrayBufferView
    ): CryptoOperation = js.native
  }
  
  type SigningAlgorithm = HmacAlgorithm
  
  trait _Ie11EncryptionAlgorithm extends StObject
}
