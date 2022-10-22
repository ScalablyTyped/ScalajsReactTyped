package typingsJapgolly.akamaiEdgeworkers

import typingsJapgolly.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The crypto module is available to use in your EdgeWorkers code bundles to expose support for a Javascript crypto API based on the Web Crypto API.
  * See: https://techdocs.akamai.com/edgeworkers/docs/crypto
  */
object cryptoMod {
  
  @JSImport("crypto", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("crypto", "crypto")
  @js.native
  val crypto: Crypto_ = js.native
  
  inline def pem2ab(pemEncodedKey: String): js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("pem2ab")(pemEncodedKey.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer]
  
  type BufferSource = js.typedarray.ArrayBufferView | js.typedarray.ArrayBuffer
  
  trait CryptoKey extends StObject {
    
    val algorithm: js.Object
    
    val extractable: Boolean
    
    val `type`: String
    
    val usages: js.Array[Usages]
  }
  object CryptoKey {
    
    inline def apply(algorithm: js.Object, extractable: Boolean, `type`: String, usages: js.Array[Usages]): CryptoKey = {
      val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], extractable = extractable.asInstanceOf[js.Any], usages = usages.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CryptoKey]
    }
    
    extension [Self <: CryptoKey](x: Self) {
      
      inline def setAlgorithm(value: js.Object): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setExtractable(value: Boolean): Self = StObject.set(x, "extractable", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUsages(value: js.Array[Usages]): Self = StObject.set(x, "usages", value.asInstanceOf[js.Any])
      
      inline def setUsagesVarargs(value: Usages*): Self = StObject.set(x, "usages", js.Array(value*))
    }
  }
  
  trait Crypto_ extends StObject {
    
    /**
      * A function that allows you to get cryptographically strong random values
      * @param array: An integer-based TypedArray
      *
      * @returns The same array passed as typedArray but with its contents replaced with the newly generated random numbers
      */
    def getRandomValues(array: Exclude[TypedArray, js.typedarray.Float32Array | js.typedarray.Float64Array]): TypedArray
    
    val subtle: SubtleCrypto
  }
  object Crypto_ {
    
    inline def apply(
      getRandomValues: Exclude[TypedArray, js.typedarray.Float32Array | js.typedarray.Float64Array] => TypedArray,
      subtle: SubtleCrypto
    ): Crypto_ = {
      val __obj = js.Dynamic.literal(getRandomValues = js.Any.fromFunction1(getRandomValues), subtle = subtle.asInstanceOf[js.Any])
      __obj.asInstanceOf[Crypto_]
    }
    
    extension [Self <: Crypto_](x: Self) {
      
      inline def setGetRandomValues(value: Exclude[TypedArray, js.typedarray.Float32Array | js.typedarray.Float64Array] => TypedArray): Self = StObject.set(x, "getRandomValues", js.Any.fromFunction1(value))
      
      inline def setSubtle(value: SubtleCrypto): Self = StObject.set(x, "subtle", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.akamaiEdgeworkers.akamaiEdgeworkersStrings.raw
    - typingsJapgolly.akamaiEdgeworkers.akamaiEdgeworkersStrings.pkcs8
    - typingsJapgolly.akamaiEdgeworkers.akamaiEdgeworkersStrings.spki
    - typingsJapgolly.akamaiEdgeworkers.akamaiEdgeworkersStrings.jwk
  */
  trait Format extends StObject
  object Format {
    
    inline def jwk: typingsJapgolly.akamaiEdgeworkers.akamaiEdgeworkersStrings.jwk = "jwk".asInstanceOf[typingsJapgolly.akamaiEdgeworkers.akamaiEdgeworkersStrings.jwk]
    
    inline def pkcs8: typingsJapgolly.akamaiEdgeworkers.akamaiEdgeworkersStrings.pkcs8 = "pkcs8".asInstanceOf[typingsJapgolly.akamaiEdgeworkers.akamaiEdgeworkersStrings.pkcs8]
    
    inline def raw: typingsJapgolly.akamaiEdgeworkers.akamaiEdgeworkersStrings.raw = "raw".asInstanceOf[typingsJapgolly.akamaiEdgeworkers.akamaiEdgeworkersStrings.raw]
    
    inline def spki: typingsJapgolly.akamaiEdgeworkers.akamaiEdgeworkersStrings.spki = "spki".asInstanceOf[typingsJapgolly.akamaiEdgeworkers.akamaiEdgeworkersStrings.spki]
  }
  
  /**
    * The subtleCrypto interface provides several cryptographic functions.
    * SubtleCrypto features are obtained through the subtle property of the Crypto object you get from the Crypto property.
    * See: https://techdocs.akamai.com/edgeworkers/docs/crypto
    */
  @js.native
  trait SubtleCrypto extends StObject {
    
    /**
      * Decrypts the encrypted data
      * @param algorithm An object specifying the algorithm to be used
      * @param key A CryptoKey containing the key to be used for decryption
      * @param data An ArrayBuffer, a TypedArray or a DataView containing the data to be decrypted
      *
      * @returns A promise that fulfills with an ArrayBuffer containing the plaintext
      */
    def decrypt(algorithm: js.Object, key: CryptoKey, data: js.typedarray.ArrayBuffer): js.Promise[js.typedarray.ArrayBuffer] = js.native
    def decrypt(algorithm: js.Object, key: CryptoKey, data: js.typedarray.DataView): js.Promise[js.typedarray.ArrayBuffer] = js.native
    def decrypt(algorithm: js.Object, key: CryptoKey, data: TypedArray): js.Promise[js.typedarray.ArrayBuffer] = js.native
    
    /**
      * Generate a digest of the given data
      * @param algorithm A string or an object that includes the name property, the string names the hash functions to use
      * @param data An ArrayBuffer, a TypedArray or a DataView containing the data to be digested
      *
      * @returns A promise that fulfills with an ArrayBuffer containing the digest
      */
    def digest(algorithm: String, data: js.typedarray.ArrayBuffer): js.Promise[js.typedarray.ArrayBuffer] = js.native
    def digest(algorithm: String, data: js.typedarray.DataView): js.Promise[js.typedarray.ArrayBuffer] = js.native
    def digest(algorithm: String, data: TypedArray): js.Promise[js.typedarray.ArrayBuffer] = js.native
    def digest(algorithm: js.Object, data: js.typedarray.ArrayBuffer): js.Promise[js.typedarray.ArrayBuffer] = js.native
    def digest(algorithm: js.Object, data: js.typedarray.DataView): js.Promise[js.typedarray.ArrayBuffer] = js.native
    def digest(algorithm: js.Object, data: TypedArray): js.Promise[js.typedarray.ArrayBuffer] = js.native
    
    /**
      * Encrypts data
      * @param algorithm An object specifying the algorithm to be used
      * @param key A CryptoKey containing the key to be used for encryption
      * @param data An ArrayBuffer, a TypedArray or a DataView containing the data to be encrypted
      *
      * @returns A promise that fulfills with an ArrayBuffer containing the ciphertext
      */
    def encrypt(algorithm: js.Object, key: CryptoKey, data: js.typedarray.ArrayBuffer): js.Promise[js.typedarray.ArrayBuffer] = js.native
    def encrypt(algorithm: js.Object, key: CryptoKey, data: js.typedarray.DataView): js.Promise[js.typedarray.ArrayBuffer] = js.native
    def encrypt(algorithm: js.Object, key: CryptoKey, data: TypedArray): js.Promise[js.typedarray.ArrayBuffer] = js.native
    
    /**
      * Imports the key
      * @param format string describing the data format of the key to import
      * @param keyData An ArrayBuffer, a TypedArray, a DataView, or a JSONWebKey object containing the key
      * @param algorithm A string or object defining the type of key to import
      * @param extractable A boolean value indicating whether it will be possible to export the key
      * @param keyUsages An array indicating the operations that can be done with the key
      *
      * @returns A promise that fulfills with the imported key as a CryptoKey object.
      */
    def importKey(
      format: Format,
      keyData: BufferSource | js.Object,
      algorithm: String,
      extractable: Boolean,
      keyUsages: js.Array[Usages]
    ): js.Promise[CryptoKey] = js.native
    def importKey(
      format: Format,
      keyData: BufferSource | js.Object,
      algorithm: js.Object,
      extractable: Boolean,
      keyUsages: js.Array[Usages]
    ): js.Promise[CryptoKey] = js.native
    def importKey(
      format: Format,
      keyData: TypedArray,
      algorithm: String,
      extractable: Boolean,
      keyUsages: js.Array[Usages]
    ): js.Promise[CryptoKey] = js.native
    def importKey(
      format: Format,
      keyData: TypedArray,
      algorithm: js.Object,
      extractable: Boolean,
      keyUsages: js.Array[Usages]
    ): js.Promise[CryptoKey] = js.native
    
    /**
      * Verify a digital signature
      * @param algorithm A string or object specifying the algorithm to be used
      * @param key A CryptoKey containing the key that will be used to verify the signature
      * @param signature ArrayBuffer containing the signature to verify
      * @param data ArrayBuffer containing the data whose signature is to be verified
      *
      * @returns A promise that fulfills with a boolean value: true if the signature is valid, false otherwise
      */
    def verify(
      algorithm: String,
      key: CryptoKey,
      signature: js.typedarray.ArrayBuffer,
      data: js.typedarray.ArrayBuffer
    ): js.Promise[Boolean] = js.native
    def verify(
      algorithm: js.Object,
      key: CryptoKey,
      signature: js.typedarray.ArrayBuffer,
      data: js.typedarray.ArrayBuffer
    ): js.Promise[Boolean] = js.native
  }
  
  type TypedArray = js.typedarray.Int8Array | js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray | js.typedarray.Int16Array | js.typedarray.Uint16Array | js.typedarray.Int32Array | js.typedarray.Uint32Array | js.typedarray.Float32Array | js.typedarray.Float64Array
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.akamaiEdgeworkers.akamaiEdgeworkersStrings.encrypt
    - typingsJapgolly.akamaiEdgeworkers.akamaiEdgeworkersStrings.decrypt
    - typingsJapgolly.akamaiEdgeworkers.akamaiEdgeworkersStrings.sign
    - typingsJapgolly.akamaiEdgeworkers.akamaiEdgeworkersStrings.verify
    - typingsJapgolly.akamaiEdgeworkers.akamaiEdgeworkersStrings.deriveKey
    - typingsJapgolly.akamaiEdgeworkers.akamaiEdgeworkersStrings.deriveBits
    - typingsJapgolly.akamaiEdgeworkers.akamaiEdgeworkersStrings.wrapKey
    - typingsJapgolly.akamaiEdgeworkers.akamaiEdgeworkersStrings.unwrapKey
  */
  trait Usages extends StObject
  object Usages {
    
    inline def decrypt: typingsJapgolly.akamaiEdgeworkers.akamaiEdgeworkersStrings.decrypt = "decrypt".asInstanceOf[typingsJapgolly.akamaiEdgeworkers.akamaiEdgeworkersStrings.decrypt]
    
    inline def deriveBits: typingsJapgolly.akamaiEdgeworkers.akamaiEdgeworkersStrings.deriveBits = "deriveBits".asInstanceOf[typingsJapgolly.akamaiEdgeworkers.akamaiEdgeworkersStrings.deriveBits]
    
    inline def deriveKey: typingsJapgolly.akamaiEdgeworkers.akamaiEdgeworkersStrings.deriveKey = "deriveKey".asInstanceOf[typingsJapgolly.akamaiEdgeworkers.akamaiEdgeworkersStrings.deriveKey]
    
    inline def encrypt: typingsJapgolly.akamaiEdgeworkers.akamaiEdgeworkersStrings.encrypt = "encrypt".asInstanceOf[typingsJapgolly.akamaiEdgeworkers.akamaiEdgeworkersStrings.encrypt]
    
    inline def sign: typingsJapgolly.akamaiEdgeworkers.akamaiEdgeworkersStrings.sign = "sign".asInstanceOf[typingsJapgolly.akamaiEdgeworkers.akamaiEdgeworkersStrings.sign]
    
    inline def unwrapKey: typingsJapgolly.akamaiEdgeworkers.akamaiEdgeworkersStrings.unwrapKey = "unwrapKey".asInstanceOf[typingsJapgolly.akamaiEdgeworkers.akamaiEdgeworkersStrings.unwrapKey]
    
    inline def verify: typingsJapgolly.akamaiEdgeworkers.akamaiEdgeworkersStrings.verify = "verify".asInstanceOf[typingsJapgolly.akamaiEdgeworkers.akamaiEdgeworkersStrings.verify]
    
    inline def wrapKey: typingsJapgolly.akamaiEdgeworkers.akamaiEdgeworkersStrings.wrapKey = "wrapKey".asInstanceOf[typingsJapgolly.akamaiEdgeworkers.akamaiEdgeworkersStrings.wrapKey]
  }
}
