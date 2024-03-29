package typingsJapgolly.winrtUwp.global.Windows.Security.Cryptography

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Certificates.Certificate
import typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.Capi1KdfTargetAlgorithm
import typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.CryptographicPadding
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains classes that enable you to create cryptographic keys, to hash and sign content, create message authentication codes, and to encrypt or decrypt data. */
object Core {
  
  /** Contains static properties that enable you to retrieve algorithm names that can be used in the OpenAlgorithm method of the AsymmetricKeyAlgorithmProvider class. */
  /* note: abstract class */ @JSGlobal("Windows.Security.Cryptography.Core.AsymmetricAlgorithmNames")
  @js.native
  open class AsymmetricAlgorithmNames ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.AsymmetricAlgorithmNames
  object AsymmetricAlgorithmNames {
    
    @JSGlobal("Windows.Security.Cryptography.Core.AsymmetricAlgorithmNames")
    @js.native
    val ^ : js.Any = js.native
    
    /** Retrieves a string that contains "DSA_SHA1". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.AsymmetricAlgorithmNames.dsaSha1")
    @js.native
    def dsaSha1: String = js.native
    inline def dsaSha1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dsaSha1")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "DSA_SHA256". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.AsymmetricAlgorithmNames.dsaSha256")
    @js.native
    def dsaSha256: String = js.native
    inline def dsaSha256_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dsaSha256")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "ECDSA_P256_SHA256". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.AsymmetricAlgorithmNames.ecdsaP256Sha256")
    @js.native
    def ecdsaP256Sha256: String = js.native
    inline def ecdsaP256Sha256_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ecdsaP256Sha256")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "ECDSA_P384_SHA384". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.AsymmetricAlgorithmNames.ecdsaP384Sha384")
    @js.native
    def ecdsaP384Sha384: String = js.native
    inline def ecdsaP384Sha384_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ecdsaP384Sha384")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "ECDSA_P521_SHA512". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.AsymmetricAlgorithmNames.ecdsaP521Sha512")
    @js.native
    def ecdsaP521Sha512: String = js.native
    inline def ecdsaP521Sha512_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ecdsaP521Sha512")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "ECDSA_SHA256". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.AsymmetricAlgorithmNames.ecdsaSha256")
    @js.native
    def ecdsaSha256: String = js.native
    inline def ecdsaSha256_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ecdsaSha256")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "ECDSA_SHA384". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.AsymmetricAlgorithmNames.ecdsaSha384")
    @js.native
    def ecdsaSha384: String = js.native
    inline def ecdsaSha384_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ecdsaSha384")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "ECDSA_SHA512". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.AsymmetricAlgorithmNames.ecdsaSha512")
    @js.native
    def ecdsaSha512: String = js.native
    inline def ecdsaSha512_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ecdsaSha512")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "RSA_OAEP_SHA1". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.AsymmetricAlgorithmNames.rsaOaepSha1")
    @js.native
    def rsaOaepSha1: String = js.native
    inline def rsaOaepSha1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rsaOaepSha1")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "RSA_OAEP_SHA256". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.AsymmetricAlgorithmNames.rsaOaepSha256")
    @js.native
    def rsaOaepSha256: String = js.native
    inline def rsaOaepSha256_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rsaOaepSha256")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "RSA_OAEP_SHA384". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.AsymmetricAlgorithmNames.rsaOaepSha384")
    @js.native
    def rsaOaepSha384: String = js.native
    inline def rsaOaepSha384_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rsaOaepSha384")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "RSA_OAEP_SHA512". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.AsymmetricAlgorithmNames.rsaOaepSha512")
    @js.native
    def rsaOaepSha512: String = js.native
    inline def rsaOaepSha512_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rsaOaepSha512")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "RSA_PKCS1". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.AsymmetricAlgorithmNames.rsaPkcs1")
    @js.native
    def rsaPkcs1: String = js.native
    inline def rsaPkcs1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rsaPkcs1")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "RSASIGN_PKCS1_SHA1". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.AsymmetricAlgorithmNames.rsaSignPkcs1Sha1")
    @js.native
    def rsaSignPkcs1Sha1: String = js.native
    inline def rsaSignPkcs1Sha1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rsaSignPkcs1Sha1")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "RSASIGN_PKCS1_SHA256". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.AsymmetricAlgorithmNames.rsaSignPkcs1Sha256")
    @js.native
    def rsaSignPkcs1Sha256: String = js.native
    inline def rsaSignPkcs1Sha256_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rsaSignPkcs1Sha256")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "RSASIGN_PKCS1_SHA384". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.AsymmetricAlgorithmNames.rsaSignPkcs1Sha384")
    @js.native
    def rsaSignPkcs1Sha384: String = js.native
    inline def rsaSignPkcs1Sha384_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rsaSignPkcs1Sha384")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "RSASIGN_PSS_SHA512". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.AsymmetricAlgorithmNames.rsaSignPkcs1Sha512")
    @js.native
    def rsaSignPkcs1Sha512: String = js.native
    inline def rsaSignPkcs1Sha512_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rsaSignPkcs1Sha512")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "RSASIGN_PSS_SHA1". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.AsymmetricAlgorithmNames.rsaSignPssSha1")
    @js.native
    def rsaSignPssSha1: String = js.native
    inline def rsaSignPssSha1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rsaSignPssSha1")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "RSASIGN_PSS_SHA256". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.AsymmetricAlgorithmNames.rsaSignPssSha256")
    @js.native
    def rsaSignPssSha256: String = js.native
    inline def rsaSignPssSha256_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rsaSignPssSha256")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "RSASIGN_PSS_SHA384". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.AsymmetricAlgorithmNames.rsaSignPssSha384")
    @js.native
    def rsaSignPssSha384: String = js.native
    inline def rsaSignPssSha384_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rsaSignPssSha384")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "RSASIGN_PSS_SHA512". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.AsymmetricAlgorithmNames.rsaSignPssSha512")
    @js.native
    def rsaSignPssSha512: String = js.native
    inline def rsaSignPssSha512_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rsaSignPssSha512")(x.asInstanceOf[js.Any])
  }
  
  /** Represents a provider of asymmetric (public) key algorithms. For more information, see Cryptographic keys. */
  /* note: abstract class */ @JSGlobal("Windows.Security.Cryptography.Core.AsymmetricKeyAlgorithmProvider")
  @js.native
  open class AsymmetricKeyAlgorithmProvider ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.AsymmetricKeyAlgorithmProvider
  object AsymmetricKeyAlgorithmProvider {
    
    @JSGlobal("Windows.Security.Cryptography.Core.AsymmetricKeyAlgorithmProvider")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates an instance of the AsymmetricKeyAlgorithmProvider class and opens the specified algorithm for use.
      * @param algorithm Algorithm name.
      * @return Represents a public key algorithm provider.
      */
    /* static member */
    inline def openAlgorithm(algorithm: String): typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.AsymmetricKeyAlgorithmProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("openAlgorithm")(algorithm.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.AsymmetricKeyAlgorithmProvider]
  }
  
  /** Represents information about a target algorithm. */
  @JSGlobal("Windows.Security.Cryptography.Core.Capi1KdfTargetAlgorithm")
  @js.native
  object Capi1KdfTargetAlgorithm extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.Capi1KdfTargetAlgorithm & Double
      ] = js.native
    
    /* 1 */ val aes: typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.Capi1KdfTargetAlgorithm.aes & Double = js.native
    
    /* 0 */ val notAes: typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.Capi1KdfTargetAlgorithm.notAes & Double = js.native
  }
  
  /** Encrypts, decrypts, and signs content, and verifies digital signatures. */
  /* note: abstract class */ @JSGlobal("Windows.Security.Cryptography.Core.CryptographicEngine")
  @js.native
  open class CryptographicEngine ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.CryptographicEngine
  object CryptographicEngine {
    
    @JSGlobal("Windows.Security.Cryptography.Core.CryptographicEngine")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Decrypts content that was previously encrypted by using a symmetric or asymmetric algorithm.
      * @param key Cryptographic key to use for decryption. This can be an asymmetric or a symmetric key. For more information, see AsymmetricKeyAlgorithmProvider and SymmetricKeyAlgorithmProvider .
      * @param data Buffer that contains the encrypted data.
      * @param iv Buffer that contains the initialization vector. If an initialization vector (IV) was used to encrypt the data, you must use the same IV to decrypt the data. For more information, see Encrypt .
      * @return Decrypted data.
      */
    /* static member */
    inline def decrypt(
      key: typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.CryptographicKey,
      data: IBuffer,
      iv: IBuffer
    ): IBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(key.asInstanceOf[js.Any], data.asInstanceOf[js.Any], iv.asInstanceOf[js.Any])).asInstanceOf[IBuffer]
    
    /**
      * Decrypts and authenticates data. For more information and a complete code sample, see EncryptedAndAuthenticatedData .
      * @param key Symmetric key to use.
      * @param data Data to be decrypted and authenticated.
      * @param nonce Nonce to be used. This must be the same nonce used by the EncryptAndAuthenticate method.
      * @param authenticationTag Authentication tag.
      * @param authenticatedData Authenticated data. This can be Null.
      * @return A buffer that contains the decrypted data.
      */
    /* static member */
    inline def decryptAndAuthenticate(
      key: typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.CryptographicKey,
      data: IBuffer,
      nonce: IBuffer,
      authenticationTag: IBuffer,
      authenticatedData: IBuffer
    ): IBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("decryptAndAuthenticate")(key.asInstanceOf[js.Any], data.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], authenticationTag.asInstanceOf[js.Any], authenticatedData.asInstanceOf[js.Any])).asInstanceOf[IBuffer]
    
    /**
      * Decrypts the encrypted input data using the supplied key.
      * @param key The key to use to decrypt the encrypted input data.
      * @param data The encrypted data to decrypt.
      * @param iv The initial vector for a symmetric key. For an asymmetric key, set this value to null.
      * @return The decrypted data.
      */
    /* static member */
    inline def decryptAsync(
      key: typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.CryptographicKey,
      data: IBuffer,
      iv: IBuffer
    ): IPromiseWithIAsyncOperation[IBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("decryptAsync")(key.asInstanceOf[js.Any], data.asInstanceOf[js.Any], iv.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[IBuffer]]
    
    /**
      * Derives a key from another key by using a key derivation function. For more information, see the KeyDerivationAlgorithmProvider and KeyDerivationParameters classes.
      * @param key The symmetric or secret key used for derivation.
      * @param parameters Derivation parameters. The parameters vary depending on the type of KDF algorithm used.
      * @param desiredKeySize Requested size, in bytes, of the derived key.
      * @return Buffer that contains the derived key.
      */
    /* static member */
    inline def deriveKeyMaterial(
      key: typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.CryptographicKey,
      parameters: typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.KeyDerivationParameters,
      desiredKeySize: Double
    ): IBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("deriveKeyMaterial")(key.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], desiredKeySize.asInstanceOf[js.Any])).asInstanceOf[IBuffer]
    
    /**
      * Encrypts data by using a symmetric or asymmetric algorithm.
      * @param key Cryptographic key to use for encryption. This can be an asymmetric or a symmetric key. For more information, see AsymmetricKeyAlgorithmProvider and SymmetricKeyAlgorithmProvider .
      * @param data Data to encrypt.
      * @param iv Buffer that contains the initialization vector. This can be null for a symmetric algorithm and should always be null for an asymmetric algorithm. If an initialization vector (IV) was used to encrypt the data, you must use the same IV to decrypt the data. You can use the GenerateRandom method to create an IV that contains random data. Other IVs, such as nonce-generated vectors, require custom implementation. For more information, see Cryptographic keys.
      * @return Encrypted data.
      */
    /* static member */
    inline def encrypt(
      key: typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.CryptographicKey,
      data: IBuffer,
      iv: IBuffer
    ): IBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(key.asInstanceOf[js.Any], data.asInstanceOf[js.Any], iv.asInstanceOf[js.Any])).asInstanceOf[IBuffer]
    
    /**
      * Performs authenticated encryption.
      * @param key Symmetric key to use for encryption.
      * @param data Data to be encrypted and authenticated.
      * @param nonce Nonce to be used. A nonce is a variable that has minimal chance of repeating. For example, you can use a random value that is newly generated for each use, a time stamp, a sequence number, or some combination of these. The Microsoft GCM implementation requires a 12-byte nonce. The CCM implementation requires a 7- to 13- byte nonce.
      * @param authenticatedData Authenticated data. This can be Null.
      * @return The encrypted and authenticated data.
      */
    /* static member */
    inline def encryptAndAuthenticate(
      key: typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.CryptographicKey,
      data: IBuffer,
      nonce: IBuffer,
      authenticatedData: IBuffer
    ): typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.EncryptedAndAuthenticatedData = (^.asInstanceOf[js.Dynamic].applyDynamic("encryptAndAuthenticate")(key.asInstanceOf[js.Any], data.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], authenticatedData.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.EncryptedAndAuthenticatedData]
    
    /**
      * Signs digital content. For more information, see MACs, hashes, and signatures.
      * @param key Key used for signing.
      * @param data Data to be signed.
      * @return The data's signature.
      */
    /* static member */
    inline def sign(key: typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.CryptographicKey, data: IBuffer): IBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(key.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[IBuffer]
    
    /**
      * Computes a hash for the supplied input data, and then signs the computed hash using the specified key.
      * @param key The key to use to compute and sign the hash.
      * @param data The raw input data to sign. The data is not hashed.
      * @return An asynchronous operation to retrieve the hashed and signed data.
      */
    /* static member */
    inline def signAsync(key: typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.CryptographicKey, data: IBuffer): IPromiseWithIAsyncOperation[IBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("signAsync")(key.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[IBuffer]]
    
    /**
      * Signs the hashed input data using the specified key.
      * @param key The key to use to sign the hash. This key must be an asymmetric key obtained from a PersistedKeyProvider or AsymmetricKeyAlgorithmProvider .
      * @param data The input data to sign. The data is a hashed value which can be obtained through incremental hash.
      * @return The signed data.
      */
    /* static member */
    inline def signHashedData(key: typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.CryptographicKey, data: IBuffer): IBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("signHashedData")(key.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[IBuffer]
    
    /**
      * Signs the hashed input data using the specified key.
      * @param key The key to use to sign the hash. This key must be an asymmetric key obtained from a PersistedKeyProvider or AsymmetricKeyAlgorithmProvider .
      * @param data The input data to sign. The data is a hashed value which can be obtained through incremental hash.
      * @return An asynchronous operation to retrieve the signed data.
      */
    /* static member */
    inline def signHashedDataAsync(key: typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.CryptographicKey, data: IBuffer): IPromiseWithIAsyncOperation[IBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("signHashedDataAsync")(key.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[IBuffer]]
    
    /**
      * Verifies a message signature.
      * @param key Key used for verification. This must be the same key previously used to sign the message.
      * @param data Message to be verified.
      * @param signature Signature previously computed over the message to be verified.
      * @return true if the message is verified.
      */
    /* static member */
    inline def verifySignature(
      key: typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.CryptographicKey,
      data: IBuffer,
      signature: IBuffer
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verifySignature")(key.asInstanceOf[js.Any], data.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Verifies the signature of the specified input data against a known signature.
      * @param key The key to use to retrieve the signature from the input data. This key must be an asymmetric key obtained from a PersistedKeyProvider or AsymmetricKeyAlgorithmProvider .
      * @param data The data to be verified. The data is a hashed value of raw data.
      * @param signature The known signature to use to verify the signature of the input data.
      * @return True if the signature is verified; otherwise false.
      */
    /* static member */
    inline def verifySignatureWithHashInput(
      key: typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.CryptographicKey,
      data: IBuffer,
      signature: IBuffer
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verifySignatureWithHashInput")(key.asInstanceOf[js.Any], data.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  /** Represents a reusable hashing object and contains the result of a hashing operation. */
  /* note: abstract class */ @JSGlobal("Windows.Security.Cryptography.Core.CryptographicHash")
  @js.native
  open class CryptographicHash ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.CryptographicHash {
    
    /**
      * Appends a binary encoded string to the data stored in the CryptographicHash object.
      * @param data Data to append.
      */
    /* CompleteClass */
    override def append(data: IBuffer): Unit = js.native
    
    /**
      * Gets hashed data from the CryptographicHash object and resets the object.
      * @return Hashed data.
      */
    /* CompleteClass */
    override def getValueAndReset(): IBuffer = js.native
  }
  
  /** Represents a symmetric key or an asymmetric key pair. */
  /* note: abstract class */ @JSGlobal("Windows.Security.Cryptography.Core.CryptographicKey")
  @js.native
  open class CryptographicKey ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.CryptographicKey
  
  /** Specifies a padding mode for asymmetric algorithm signature or encryption operations. */
  @JSGlobal("Windows.Security.Cryptography.Core.CryptographicPadding")
  @js.native
  object CryptographicPadding extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.CryptographicPadding & Double
      ] = js.native
    
    /* 0 */ val none: typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.CryptographicPadding.none & Double = js.native
    
    /* 1 */ val rsaOaep: typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.CryptographicPadding.rsaOaep & Double = js.native
    
    /* 2 */ val rsaPkcs1V15: typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.CryptographicPadding.rsaPkcs1V15 & Double = js.native
    
    /* 3 */ val rsaPss: typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.CryptographicPadding.rsaPss & Double = js.native
  }
  
  /** Specifies the type of the private key contained in a buffer. */
  @JSGlobal("Windows.Security.Cryptography.Core.CryptographicPrivateKeyBlobType")
  @js.native
  object CryptographicPrivateKeyBlobType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.CryptographicPrivateKeyBlobType & Double
      ] = js.native
    
    /* 4 */ val bcryptEccFullPrivateKey: typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.CryptographicPrivateKeyBlobType.bcryptEccFullPrivateKey & Double = js.native
    
    /* 2 */ val bcryptPrivateKey: typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.CryptographicPrivateKeyBlobType.bcryptPrivateKey & Double = js.native
    
    /* 3 */ val capi1PrivateKey: typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.CryptographicPrivateKeyBlobType.capi1PrivateKey & Double = js.native
    
    /* 1 */ val pkcs1RsaPrivateKey: typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.CryptographicPrivateKeyBlobType.pkcs1RsaPrivateKey & Double = js.native
    
    /* 0 */ val pkcs8RawPrivateKeyInfo: typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.CryptographicPrivateKeyBlobType.pkcs8RawPrivateKeyInfo & Double = js.native
  }
  
  /** Specifies the type of the public key contained in a buffer. */
  @JSGlobal("Windows.Security.Cryptography.Core.CryptographicPublicKeyBlobType")
  @js.native
  object CryptographicPublicKeyBlobType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.CryptographicPublicKeyBlobType & Double
      ] = js.native
    
    /* 4 */ val bcryptEccFullPublicKey: typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.CryptographicPublicKeyBlobType.bcryptEccFullPublicKey & Double = js.native
    
    /* 2 */ val bcryptPublicKey: typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.CryptographicPublicKeyBlobType.bcryptPublicKey & Double = js.native
    
    /* 3 */ val capi1PublicKey: typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.CryptographicPublicKeyBlobType.capi1PublicKey & Double = js.native
    
    /* 1 */ val pkcs1RsaPublicKey: typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.CryptographicPublicKeyBlobType.pkcs1RsaPublicKey & Double = js.native
    
    /* 0 */ val x509SubjectPublicKeyInfo: typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.CryptographicPublicKeyBlobType.x509SubjectPublicKeyInfo & Double = js.native
  }
  
  /** Contains static properties that enable you to retrieve supported elliptic curve cryptography (ECC) algorithm names. */
  /* note: abstract class */ @JSGlobal("Windows.Security.Cryptography.Core.EccCurveNames")
  @js.native
  open class EccCurveNames ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.EccCurveNames
  object EccCurveNames {
    
    @JSGlobal("Windows.Security.Cryptography.Core.EccCurveNames")
    @js.native
    val ^ : js.Any = js.native
    
    /** Gets an array of strings that represents all the curves registered on the local computer. This includes curves that were registered by the local administrator. */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.EccCurveNames.allEccCurveNames")
    @js.native
    def allEccCurveNames: IVectorView[String] = js.native
    inline def allEccCurveNames_=(x: IVectorView[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("allEccCurveNames")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "BRAINPOOLP160R1". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.EccCurveNames.brainpoolP160r1")
    @js.native
    def brainpoolP160r1: String = js.native
    inline def brainpoolP160r1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("brainpoolP160r1")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "BRAINPOOLP160T1". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.EccCurveNames.brainpoolP160t1")
    @js.native
    def brainpoolP160t1: String = js.native
    inline def brainpoolP160t1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("brainpoolP160t1")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "BRAINPOOLP192R1". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.EccCurveNames.brainpoolP192r1")
    @js.native
    def brainpoolP192r1: String = js.native
    inline def brainpoolP192r1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("brainpoolP192r1")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "BRAINPOOLP192T1". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.EccCurveNames.brainpoolP192t1")
    @js.native
    def brainpoolP192t1: String = js.native
    inline def brainpoolP192t1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("brainpoolP192t1")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "BRAINPOOLP224R1". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.EccCurveNames.brainpoolP224r1")
    @js.native
    def brainpoolP224r1: String = js.native
    inline def brainpoolP224r1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("brainpoolP224r1")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "BRAINPOOLP224T1". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.EccCurveNames.brainpoolP224t1")
    @js.native
    def brainpoolP224t1: String = js.native
    inline def brainpoolP224t1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("brainpoolP224t1")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "BRAINPOOLP256R1". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.EccCurveNames.brainpoolP256r1")
    @js.native
    def brainpoolP256r1: String = js.native
    inline def brainpoolP256r1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("brainpoolP256r1")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "BRAINPOOLP256T1". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.EccCurveNames.brainpoolP256t1")
    @js.native
    def brainpoolP256t1: String = js.native
    inline def brainpoolP256t1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("brainpoolP256t1")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "BRAINPOOLP320R1". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.EccCurveNames.brainpoolP320r1")
    @js.native
    def brainpoolP320r1: String = js.native
    inline def brainpoolP320r1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("brainpoolP320r1")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "BRAINPOOLP320T1". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.EccCurveNames.brainpoolP320t1")
    @js.native
    def brainpoolP320t1: String = js.native
    inline def brainpoolP320t1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("brainpoolP320t1")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "BRAINPOOLP384R1". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.EccCurveNames.brainpoolP384r1")
    @js.native
    def brainpoolP384r1: String = js.native
    inline def brainpoolP384r1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("brainpoolP384r1")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "BRAINPOOLP384T1". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.EccCurveNames.brainpoolP384t1")
    @js.native
    def brainpoolP384t1: String = js.native
    inline def brainpoolP384t1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("brainpoolP384t1")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "BRAINPOOLP512R1". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.EccCurveNames.brainpoolP512r1")
    @js.native
    def brainpoolP512r1: String = js.native
    inline def brainpoolP512r1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("brainpoolP512r1")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "BRAINPOOLP512T1". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.EccCurveNames.brainpoolP512t1")
    @js.native
    def brainpoolP512t1: String = js.native
    inline def brainpoolP512t1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("brainpoolP512t1")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "CURVE25519". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.EccCurveNames.curve25519")
    @js.native
    def curve25519: String = js.native
    inline def curve25519_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("curve25519")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "EC192WAPI". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.EccCurveNames.ec192wapi")
    @js.native
    def ec192wapi: String = js.native
    inline def ec192wapi_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ec192wapi")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "NISTP192". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.EccCurveNames.nistP192")
    @js.native
    def nistP192: String = js.native
    inline def nistP192_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nistP192")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "NISTP224". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.EccCurveNames.nistP224")
    @js.native
    def nistP224: String = js.native
    inline def nistP224_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nistP224")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "NISTP256". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.EccCurveNames.nistP256")
    @js.native
    def nistP256: String = js.native
    inline def nistP256_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nistP256")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "NISTP384". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.EccCurveNames.nistP384")
    @js.native
    def nistP384: String = js.native
    inline def nistP384_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nistP384")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "NISTP521". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.EccCurveNames.nistP521")
    @js.native
    def nistP521: String = js.native
    inline def nistP521_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nistP521")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "NUMSP256T1". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.EccCurveNames.numsP256t1")
    @js.native
    def numsP256t1: String = js.native
    inline def numsP256t1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("numsP256t1")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "NUMSP384T1". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.EccCurveNames.numsP384t1")
    @js.native
    def numsP384t1: String = js.native
    inline def numsP384t1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("numsP384t1")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "NUMSP512T1". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.EccCurveNames.numsP512t1")
    @js.native
    def numsP512t1: String = js.native
    inline def numsP512t1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("numsP512t1")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "SECP160K1". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.EccCurveNames.secP160k1")
    @js.native
    def secP160k1: String = js.native
    inline def secP160k1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("secP160k1")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "SECP160R1". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.EccCurveNames.secP160r1")
    @js.native
    def secP160r1: String = js.native
    inline def secP160r1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("secP160r1")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "SECP160R2". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.EccCurveNames.secP160r2")
    @js.native
    def secP160r2: String = js.native
    inline def secP160r2_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("secP160r2")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "SECP192K1". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.EccCurveNames.secP192k1")
    @js.native
    def secP192k1: String = js.native
    inline def secP192k1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("secP192k1")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "SECP192R1". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.EccCurveNames.secP192r1")
    @js.native
    def secP192r1: String = js.native
    inline def secP192r1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("secP192r1")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "SECP224K1". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.EccCurveNames.secP224k1")
    @js.native
    def secP224k1: String = js.native
    inline def secP224k1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("secP224k1")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "SECP224R1". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.EccCurveNames.secP224r1")
    @js.native
    def secP224r1: String = js.native
    inline def secP224r1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("secP224r1")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "SecP256k1". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.EccCurveNames.secP256k1")
    @js.native
    def secP256k1: String = js.native
    inline def secP256k1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("secP256k1")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "SecP256r1". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.EccCurveNames.secP256r1")
    @js.native
    def secP256r1: String = js.native
    inline def secP256r1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("secP256r1")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "SecP384r1". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.EccCurveNames.secP384r1")
    @js.native
    def secP384r1: String = js.native
    inline def secP384r1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("secP384r1")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "SecP521r1". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.EccCurveNames.secP521r1")
    @js.native
    def secP521r1: String = js.native
    inline def secP521r1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("secP521r1")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "WTLS12". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.EccCurveNames.wtls12")
    @js.native
    def wtls12: String = js.native
    inline def wtls12_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wtls12")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "WTLS7". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.EccCurveNames.wtls7")
    @js.native
    def wtls7: String = js.native
    inline def wtls7_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wtls7")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "WTLS9". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.EccCurveNames.wtls9")
    @js.native
    def wtls9: String = js.native
    inline def wtls9_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wtls9")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "X962P192v1". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.EccCurveNames.x962P192v1")
    @js.native
    def x962P192v1: String = js.native
    inline def x962P192v1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("x962P192v1")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "X962P192v2". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.EccCurveNames.x962P192v2")
    @js.native
    def x962P192v2: String = js.native
    inline def x962P192v2_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("x962P192v2")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "X962P192v3". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.EccCurveNames.x962P192v3")
    @js.native
    def x962P192v3: String = js.native
    inline def x962P192v3_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("x962P192v3")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "X962P239v1". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.EccCurveNames.x962P239v1")
    @js.native
    def x962P239v1: String = js.native
    inline def x962P239v1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("x962P239v1")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "X962P239v2". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.EccCurveNames.x962P239v2")
    @js.native
    def x962P239v2: String = js.native
    inline def x962P239v2_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("x962P239v2")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "X962P239v3". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.EccCurveNames.x962P239v3")
    @js.native
    def x962P239v3: String = js.native
    inline def x962P239v3_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("x962P239v3")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "X962P256v1". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.EccCurveNames.x962P256v1")
    @js.native
    def x962P256v1: String = js.native
    inline def x962P256v1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("x962P256v1")(x.asInstanceOf[js.Any])
  }
  
  /** Contains data that can be retrieved from encrypted and authenticated data. Authenticated encryption algorithms are opened by using the SymmetricKeyAlgorithmProvider class. */
  /* note: abstract class */ @JSGlobal("Windows.Security.Cryptography.Core.EncryptedAndAuthenticatedData")
  @js.native
  open class EncryptedAndAuthenticatedData ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.EncryptedAndAuthenticatedData {
    
    /** Gets the authentication tag. */
    /* CompleteClass */
    var authenticationTag: IBuffer = js.native
    
    /** Gets the encrypted data. */
    /* CompleteClass */
    var encryptedData: IBuffer = js.native
  }
  
  /** Contains static properties that enable you to retrieve algorithm names that can be used in the OpenAlgorithm method of the HashAlgorithmProvider class. */
  /* note: abstract class */ @JSGlobal("Windows.Security.Cryptography.Core.HashAlgorithmNames")
  @js.native
  open class HashAlgorithmNames ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.HashAlgorithmNames
  object HashAlgorithmNames {
    
    @JSGlobal("Windows.Security.Cryptography.Core.HashAlgorithmNames")
    @js.native
    val ^ : js.Any = js.native
    
    /** Retrieves a string that contains "MD5". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.HashAlgorithmNames.md5")
    @js.native
    def md5: String = js.native
    inline def md5_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("md5")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "SHA1". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.HashAlgorithmNames.sha1")
    @js.native
    def sha1: String = js.native
    inline def sha1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sha1")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "SHA256". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.HashAlgorithmNames.sha256")
    @js.native
    def sha256: String = js.native
    inline def sha256_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sha256")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "SHA384". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.HashAlgorithmNames.sha384")
    @js.native
    def sha384: String = js.native
    inline def sha384_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sha384")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "SHA512". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.HashAlgorithmNames.sha512")
    @js.native
    def sha512: String = js.native
    inline def sha512_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sha512")(x.asInstanceOf[js.Any])
  }
  
  /** Represents a cryptographic hash provider. For more information about hashes, see MACs, hashes, and signatures. */
  /* note: abstract class */ @JSGlobal("Windows.Security.Cryptography.Core.HashAlgorithmProvider")
  @js.native
  open class HashAlgorithmProvider ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.HashAlgorithmProvider {
    
    /** Gets the name of the open hash algorithm. */
    /* CompleteClass */
    var algorithmName: String = js.native
    
    /**
      * Creates a reusable CryptographicHash object.
      * @return Reusable hash object.
      */
    /* CompleteClass */
    override def createHash(): typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.CryptographicHash = js.native
    
    /**
      * Hashes binary data.
      * @param data Data to be hashed.
      * @return Hashed data.
      */
    /* CompleteClass */
    override def hashData(data: IBuffer): IBuffer = js.native
    
    /** Gets the length, in bytes, of the hash. */
    /* CompleteClass */
    var hashLength: Double = js.native
  }
  object HashAlgorithmProvider {
    
    @JSGlobal("Windows.Security.Cryptography.Core.HashAlgorithmProvider")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a HashAlgorithmProvider object and opens the specified algorithm for use.
      * @param algorithm Algorithm name.
      * @return Represents a provider that implements hash algorithms.
      */
    /* static member */
    inline def openAlgorithm(algorithm: String): typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.HashAlgorithmProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("openAlgorithm")(algorithm.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.HashAlgorithmProvider]
  }
  
  /** Contains static properties that enable you to retrieve algorithm names that can be used in the OpenAlgorithm method of the KeyDerivationAlgorithmProvider class. */
  /* note: abstract class */ @JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationAlgorithmNames")
  @js.native
  open class KeyDerivationAlgorithmNames ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.KeyDerivationAlgorithmNames
  object KeyDerivationAlgorithmNames {
    
    @JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationAlgorithmNames")
    @js.native
    val ^ : js.Any = js.native
    
    /** Retrieves a string that contains "CAPI_KDF_MD5". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationAlgorithmNames.capiKdfMd5")
    @js.native
    def capiKdfMd5: String = js.native
    inline def capiKdfMd5_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("capiKdfMd5")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "CAPI_KDF_SHA1". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationAlgorithmNames.capiKdfSha1")
    @js.native
    def capiKdfSha1: String = js.native
    inline def capiKdfSha1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("capiKdfSha1")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "CAPI_KDF_SHA256". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationAlgorithmNames.capiKdfSha256")
    @js.native
    def capiKdfSha256: String = js.native
    inline def capiKdfSha256_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("capiKdfSha256")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "CAPI_KDF_SHA384". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationAlgorithmNames.capiKdfSha384")
    @js.native
    def capiKdfSha384: String = js.native
    inline def capiKdfSha384_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("capiKdfSha384")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "CAPI_KDF_SHA512". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationAlgorithmNames.capiKdfSha512")
    @js.native
    def capiKdfSha512: String = js.native
    inline def capiKdfSha512_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("capiKdfSha512")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "PBKDF2_MD5". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationAlgorithmNames.pbkdf2Md5")
    @js.native
    def pbkdf2Md5: String = js.native
    inline def pbkdf2Md5_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pbkdf2Md5")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "PBKDF2_SHA1". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationAlgorithmNames.pbkdf2Sha1")
    @js.native
    def pbkdf2Sha1: String = js.native
    inline def pbkdf2Sha1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pbkdf2Sha1")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "PBKDF2_SHA256". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationAlgorithmNames.pbkdf2Sha256")
    @js.native
    def pbkdf2Sha256: String = js.native
    inline def pbkdf2Sha256_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pbkdf2Sha256")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "PBKDF2_SHA384". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationAlgorithmNames.pbkdf2Sha384")
    @js.native
    def pbkdf2Sha384: String = js.native
    inline def pbkdf2Sha384_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pbkdf2Sha384")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "PBKDF2_SHA512". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationAlgorithmNames.pbkdf2Sha512")
    @js.native
    def pbkdf2Sha512: String = js.native
    inline def pbkdf2Sha512_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pbkdf2Sha512")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "SP800_108_CTR_HMAC_MD5". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationAlgorithmNames.sp800108CtrHmacMd5")
    @js.native
    def sp800108CtrHmacMd5: String = js.native
    inline def sp800108CtrHmacMd5_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sp800108CtrHmacMd5")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "SP800_108_CTR_HMAC_SHA1". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationAlgorithmNames.sp800108CtrHmacSha1")
    @js.native
    def sp800108CtrHmacSha1: String = js.native
    inline def sp800108CtrHmacSha1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sp800108CtrHmacSha1")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "SP800_108_CTR_HMAC_SHA256". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationAlgorithmNames.sp800108CtrHmacSha256")
    @js.native
    def sp800108CtrHmacSha256: String = js.native
    inline def sp800108CtrHmacSha256_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sp800108CtrHmacSha256")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "SP800_108_CTR_HMAC_SHA384". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationAlgorithmNames.sp800108CtrHmacSha384")
    @js.native
    def sp800108CtrHmacSha384: String = js.native
    inline def sp800108CtrHmacSha384_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sp800108CtrHmacSha384")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "SP800_108_CTR_HMAC_SHA512". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationAlgorithmNames.sp800108CtrHmacSha512")
    @js.native
    def sp800108CtrHmacSha512: String = js.native
    inline def sp800108CtrHmacSha512_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sp800108CtrHmacSha512")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "SP800_56A_CONCAT_MD5". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationAlgorithmNames.sp80056aConcatMd5")
    @js.native
    def sp80056aConcatMd5: String = js.native
    inline def sp80056aConcatMd5_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sp80056aConcatMd5")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "SP800_56A_CONCAT_SHA1". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationAlgorithmNames.sp80056aConcatSha1")
    @js.native
    def sp80056aConcatSha1: String = js.native
    inline def sp80056aConcatSha1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sp80056aConcatSha1")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "SP800_108_CTR_HMAC_SHA256". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationAlgorithmNames.sp80056aConcatSha256")
    @js.native
    def sp80056aConcatSha256: String = js.native
    inline def sp80056aConcatSha256_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sp80056aConcatSha256")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "SP800_108_CTR_HMAC_SHA384". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationAlgorithmNames.sp80056aConcatSha384")
    @js.native
    def sp80056aConcatSha384: String = js.native
    inline def sp80056aConcatSha384_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sp80056aConcatSha384")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "SP800_56A_CONCAT_SHA512". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationAlgorithmNames.sp80056aConcatSha512")
    @js.native
    def sp80056aConcatSha512: String = js.native
    inline def sp80056aConcatSha512_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sp80056aConcatSha512")(x.asInstanceOf[js.Any])
  }
  
  /** Represents a key derivation algorithm provider. */
  /* note: abstract class */ @JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationAlgorithmProvider")
  @js.native
  open class KeyDerivationAlgorithmProvider ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.KeyDerivationAlgorithmProvider {
    
    /** Gets the name of the open key derivation function (KDF) algorithm. */
    /* CompleteClass */
    var algorithmName: String = js.native
    
    /**
      * Creates a KDF key.
      * @param keyMaterial Data used to create the key.
      * @return Represents the KDF key.
      */
    /* CompleteClass */
    override def createKey(keyMaterial: IBuffer): typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.CryptographicKey = js.native
  }
  object KeyDerivationAlgorithmProvider {
    
    @JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationAlgorithmProvider")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates an instance of the KeyDerivationAlgorithmProvider class and opens the specified algorithm for use.
      * @param algorithm Represents a KDF algorithm provider.
      * @return The algorithm provider.
      */
    /* static member */
    inline def openAlgorithm(algorithm: String): typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.KeyDerivationAlgorithmProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("openAlgorithm")(algorithm.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.KeyDerivationAlgorithmProvider]
  }
  
  /** Represents parameters used when deriving a key. */
  /* note: abstract class */ @JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationParameters")
  @js.native
  open class KeyDerivationParameters ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.KeyDerivationParameters {
    
    /** Gets or sets the Capi1KdfTargetAlgorithm . */
    /* CompleteClass */
    var capi1KdfTargetAlgorithm: Capi1KdfTargetAlgorithm = js.native
    
    /** Retrieves the number of iterations used to derive the key. For more information, see BuildForPbkdf2 . */
    /* CompleteClass */
    var iterationCount: Double = js.native
    
    /** Gets or sets the parameters used by the key derivation algorithm. */
    /* CompleteClass */
    var kdfGenericBinary: IBuffer = js.native
  }
  object KeyDerivationParameters {
    
    @JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationParameters")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a KeyDerivationParameters object for use in the target algorithm.
      * @param capi1KdfTargetAlgorithm The target algorithm.
      * @return Refers to the parameters used during key derivation.
      */
    /* static member */
    inline def buildForCapi1Kdf(capi1KdfTargetAlgorithm: Capi1KdfTargetAlgorithm): typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.KeyDerivationParameters = ^.asInstanceOf[js.Dynamic].applyDynamic("buildForCapi1Kdf")(capi1KdfTargetAlgorithm.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.KeyDerivationParameters]
    
    /**
      * Creates a KeyDerivationParameters object for use in the password-based key derivation function 2 (PBKDF2).
      * @param pbkdf2Salt The salt, a random or pseudorandom value to be combined with the password in multiple iterations. A salt is used to increase entropy above what can be obtained from using a password alone.
      * @param iterationCount Number of iterations to be used to derive a key.
      * @return Refers to the parameters used during key derivation.
      */
    /* static member */
    inline def buildForPbkdf2(pbkdf2Salt: IBuffer, iterationCount: Double): typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.KeyDerivationParameters = (^.asInstanceOf[js.Dynamic].applyDynamic("buildForPbkdf2")(pbkdf2Salt.asInstanceOf[js.Any], iterationCount.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.KeyDerivationParameters]
    
    /**
      * Creates a KeyDerivationParameters object for use in a counter mode, hash-based message authentication code (HMAC) key derivation function.
      * @param label Buffer that specifies the purpose for the derived keying material.
      * @param context Buffer that specifies information related to the derived keying material. For example, the context can identify the parties who are deriving the keying material and, optionally, a nonce known by the parties.
      * @return Refers to the parameters used during key derivation.
      */
    /* static member */
    inline def buildForSP800108(label: IBuffer, context: IBuffer): typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.KeyDerivationParameters = (^.asInstanceOf[js.Dynamic].applyDynamic("buildForSP800108")(label.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.KeyDerivationParameters]
    
    /**
      * Creates a KeyDerivationParameters object for use in the SP800-56A key derivation function.
      * @param algorithmId Specifies the intended purpose of the derived key.
      * @param partyUInfo Contains public information contributed by the initiator.
      * @param partyVInfo Contains public information contributed by the responder.
      * @param suppPubInfo Contains public information known to both initiator and responder.
      * @param suppPrivInfo Contains private information known to both initiator and responder, such as a shared secret.
      * @return Refers to the parameters used during key derivation.
      */
    /* static member */
    inline def buildForSP80056a(
      algorithmId: IBuffer,
      partyUInfo: IBuffer,
      partyVInfo: IBuffer,
      suppPubInfo: IBuffer,
      suppPrivInfo: IBuffer
    ): typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.KeyDerivationParameters = (^.asInstanceOf[js.Dynamic].applyDynamic("buildForSP80056a")(algorithmId.asInstanceOf[js.Any], partyUInfo.asInstanceOf[js.Any], partyVInfo.asInstanceOf[js.Any], suppPubInfo.asInstanceOf[js.Any], suppPrivInfo.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.KeyDerivationParameters]
  }
  
  /** Contains static properties that enable you to retrieve algorithm names that can be used in the OpenAlgorithm method of the MacAlgorithmProvider class. */
  /* note: abstract class */ @JSGlobal("Windows.Security.Cryptography.Core.MacAlgorithmNames")
  @js.native
  open class MacAlgorithmNames ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.MacAlgorithmNames
  object MacAlgorithmNames {
    
    @JSGlobal("Windows.Security.Cryptography.Core.MacAlgorithmNames")
    @js.native
    val ^ : js.Any = js.native
    
    /** Retrieves a string that contains "AES_CMAC". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.MacAlgorithmNames.aesCmac")
    @js.native
    def aesCmac: String = js.native
    inline def aesCmac_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aesCmac")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "HMAC_MD5". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.MacAlgorithmNames.hmacMd5")
    @js.native
    def hmacMd5: String = js.native
    inline def hmacMd5_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hmacMd5")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "HMAC_SHA1". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.MacAlgorithmNames.hmacSha1")
    @js.native
    def hmacSha1: String = js.native
    inline def hmacSha1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hmacSha1")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "HMAC_SHA256". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.MacAlgorithmNames.hmacSha256")
    @js.native
    def hmacSha256: String = js.native
    inline def hmacSha256_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hmacSha256")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "HMAC_SHA384". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.MacAlgorithmNames.hmacSha384")
    @js.native
    def hmacSha384: String = js.native
    inline def hmacSha384_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hmacSha384")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "HMAC_SHA512". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.MacAlgorithmNames.hmacSha512")
    @js.native
    def hmacSha512: String = js.native
    inline def hmacSha512_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hmacSha512")(x.asInstanceOf[js.Any])
  }
  
  /** Represents a message authentication code (MAC). A MAC uses symmetric key cryptography to prevent message tampering. For more information, see MACs, hashes, and signatures. */
  /* note: abstract class */ @JSGlobal("Windows.Security.Cryptography.Core.MacAlgorithmProvider")
  @js.native
  open class MacAlgorithmProvider ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.MacAlgorithmProvider {
    
    /** Gets the name of the open MAC algorithm. */
    /* CompleteClass */
    var algorithmName: String = js.native
    
    /**
      * Creates a CryptographicHash object that supports incremental hash operations.
      * @param keyMaterial Random data used to help generate the hash. You can call the GenerateRandom method to create the random data.
      * @return A CryptographicHash object that supports incremental hash operations.
      */
    /* CompleteClass */
    override def createHash(keyMaterial: IBuffer): typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.CryptographicHash = js.native
    
    /**
      * Creates a symmetric key that can be used to create the MAC value.
      * @param keyMaterial Random data used to help generate the key. You can call the GenerateRandom method to create the random data.
      * @return Symmetric key.
      */
    /* CompleteClass */
    override def createKey(keyMaterial: IBuffer): typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.CryptographicKey = js.native
    
    /** Gets the length, in bytes, of the message authentication code. */
    /* CompleteClass */
    var macLength: Double = js.native
  }
  object MacAlgorithmProvider {
    
    @JSGlobal("Windows.Security.Cryptography.Core.MacAlgorithmProvider")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a MacAlgorithmProvider object and opens the specified algorithm for use.
      * @param algorithm Algorithm name.
      * @return Represents a provider that implements MAC algorithms.
      */
    /* static member */
    inline def openAlgorithm(algorithm: String): typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.MacAlgorithmProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("openAlgorithm")(algorithm.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.MacAlgorithmProvider]
  }
  
  /** Retrieves a persisted key from a Certificate object. */
  /* note: abstract class */ @JSGlobal("Windows.Security.Cryptography.Core.PersistedKeyProvider")
  @js.native
  open class PersistedKeyProvider ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.PersistedKeyProvider
  object PersistedKeyProvider {
    
    @JSGlobal("Windows.Security.Cryptography.Core.PersistedKeyProvider")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Opens the persisted private key from the specified Certificate object.
      * @param certificate The certificate that is associated with the private key.
      * @param hashAlgorithmName The hash algorithm for signature operations. For encryption, the hash algorithm is ignored.
      * @param padding The padding mode for asymmetric algorithm signature or encryption operations.
      * @return An asynchronous operation for retrieving a private key from the supplied Certificate object.
      */
    /* static member */
    inline def openKeyPairFromCertificateAsync(certificate: Certificate, hashAlgorithmName: String, padding: CryptographicPadding): IPromiseWithIAsyncOperation[typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.CryptographicKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("openKeyPairFromCertificateAsync")(certificate.asInstanceOf[js.Any], hashAlgorithmName.asInstanceOf[js.Any], padding.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.CryptographicKey]]
    
    /**
      * Opens the persisted public key from the specified Certificate object.
      * @param certificate The certificate that contains the public key.
      * @param hashAlgorithmName The has algorithm for signature operations.
      * @param padding The padding mode for asymmetric algorithm signature or encryption operations.
      * @return The public key retrieved from the supplied Certificate object.
      */
    /* static member */
    inline def openPublicKeyFromCertificate(certificate: Certificate, hashAlgorithmName: String, padding: CryptographicPadding): typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.CryptographicKey = (^.asInstanceOf[js.Dynamic].applyDynamic("openPublicKeyFromCertificate")(certificate.asInstanceOf[js.Any], hashAlgorithmName.asInstanceOf[js.Any], padding.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.CryptographicKey]
  }
  
  /** Contains static properties that enable you to retrieve algorithm names that can be used in the OpenAlgorithm method of the SymmetricKeyAlgorithmProvider class. */
  /* note: abstract class */ @JSGlobal("Windows.Security.Cryptography.Core.SymmetricAlgorithmNames")
  @js.native
  open class SymmetricAlgorithmNames ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.SymmetricAlgorithmNames
  object SymmetricAlgorithmNames {
    
    @JSGlobal("Windows.Security.Cryptography.Core.SymmetricAlgorithmNames")
    @js.native
    val ^ : js.Any = js.native
    
    /** Retrieves a string that contains "AES_CBC". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.SymmetricAlgorithmNames.aesCbc")
    @js.native
    def aesCbc: String = js.native
    
    /** Retrieves a string that contains "AES_CBC_PKCS7". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.SymmetricAlgorithmNames.aesCbcPkcs7")
    @js.native
    def aesCbcPkcs7: String = js.native
    inline def aesCbcPkcs7_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aesCbcPkcs7")(x.asInstanceOf[js.Any])
    
    inline def aesCbc_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aesCbc")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "AES_CCM". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.SymmetricAlgorithmNames.aesCcm")
    @js.native
    def aesCcm: String = js.native
    inline def aesCcm_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aesCcm")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "AES_ECB". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.SymmetricAlgorithmNames.aesEcb")
    @js.native
    def aesEcb: String = js.native
    
    /** Retrieves a string that contains "AES_ECB_PKCS7". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.SymmetricAlgorithmNames.aesEcbPkcs7")
    @js.native
    def aesEcbPkcs7: String = js.native
    inline def aesEcbPkcs7_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aesEcbPkcs7")(x.asInstanceOf[js.Any])
    
    inline def aesEcb_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aesEcb")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "AES_CCM". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.SymmetricAlgorithmNames.aesGcm")
    @js.native
    def aesGcm: String = js.native
    inline def aesGcm_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aesGcm")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "DES_CBC". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.SymmetricAlgorithmNames.desCbc")
    @js.native
    def desCbc: String = js.native
    
    /** Retrieves a string that contains "DES_CBC_PKCS7". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.SymmetricAlgorithmNames.desCbcPkcs7")
    @js.native
    def desCbcPkcs7: String = js.native
    inline def desCbcPkcs7_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("desCbcPkcs7")(x.asInstanceOf[js.Any])
    
    inline def desCbc_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("desCbc")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "DES_ECB". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.SymmetricAlgorithmNames.desEcb")
    @js.native
    def desEcb: String = js.native
    
    /** Retrieves a string that contains "DES_ECB_PKCS7". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.SymmetricAlgorithmNames.desEcbPkcs7")
    @js.native
    def desEcbPkcs7: String = js.native
    inline def desEcbPkcs7_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("desEcbPkcs7")(x.asInstanceOf[js.Any])
    
    inline def desEcb_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("desEcb")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "RC2_CBC". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.SymmetricAlgorithmNames.rc2Cbc")
    @js.native
    def rc2Cbc: String = js.native
    
    /** Retrieves a string that contains "RC2_CBC_PKCS7". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.SymmetricAlgorithmNames.rc2CbcPkcs7")
    @js.native
    def rc2CbcPkcs7: String = js.native
    inline def rc2CbcPkcs7_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rc2CbcPkcs7")(x.asInstanceOf[js.Any])
    
    inline def rc2Cbc_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rc2Cbc")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "RC2_ECB". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.SymmetricAlgorithmNames.rc2Ecb")
    @js.native
    def rc2Ecb: String = js.native
    
    /** Retrieves a string that contains "RC2_ECB_PKCS7". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.SymmetricAlgorithmNames.rc2EcbPkcs7")
    @js.native
    def rc2EcbPkcs7: String = js.native
    inline def rc2EcbPkcs7_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rc2EcbPkcs7")(x.asInstanceOf[js.Any])
    
    inline def rc2Ecb_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rc2Ecb")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "RC4". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.SymmetricAlgorithmNames.rc4")
    @js.native
    def rc4: String = js.native
    inline def rc4_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rc4")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "3DES_CBC". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.SymmetricAlgorithmNames.tripleDesCbc")
    @js.native
    def tripleDesCbc: String = js.native
    
    /** Retrieves a string that contains "3DES_CBC_PKCS7". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.SymmetricAlgorithmNames.tripleDesCbcPkcs7")
    @js.native
    def tripleDesCbcPkcs7: String = js.native
    inline def tripleDesCbcPkcs7_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tripleDesCbcPkcs7")(x.asInstanceOf[js.Any])
    
    inline def tripleDesCbc_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tripleDesCbc")(x.asInstanceOf[js.Any])
    
    /** Retrieves a string that contains "3DES_ECB". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.SymmetricAlgorithmNames.tripleDesEcb")
    @js.native
    def tripleDesEcb: String = js.native
    
    /** Retrieves a string that contains "3DES_ECB_PKCS7". */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Core.SymmetricAlgorithmNames.tripleDesEcbPkcs7")
    @js.native
    def tripleDesEcbPkcs7: String = js.native
    inline def tripleDesEcbPkcs7_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tripleDesEcbPkcs7")(x.asInstanceOf[js.Any])
    
    inline def tripleDesEcb_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tripleDesEcb")(x.asInstanceOf[js.Any])
  }
  
  /** Represents a provider of symmetric key algorithms. For more information, see Cryptographic keys. */
  /* note: abstract class */ @JSGlobal("Windows.Security.Cryptography.Core.SymmetricKeyAlgorithmProvider")
  @js.native
  open class SymmetricKeyAlgorithmProvider ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.SymmetricKeyAlgorithmProvider {
    
    /** Gets the name of the open symmetric algorithm. */
    /* CompleteClass */
    var algorithmName: String = js.native
    
    /** Gets the size, in bytes, of the cipher block for the open algorithm. */
    /* CompleteClass */
    var blockLength: Double = js.native
    
    /**
      * Creates a symmetric key.
      * @param keyMaterial Data used to generate the key. You can call the GenerateRandom method to create random key material.
      * @return Symmetric key.
      */
    /* CompleteClass */
    override def createSymmetricKey(keyMaterial: IBuffer): typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.CryptographicKey = js.native
  }
  object SymmetricKeyAlgorithmProvider {
    
    @JSGlobal("Windows.Security.Cryptography.Core.SymmetricKeyAlgorithmProvider")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates an instance of the SymmetricKeyAlgorithmProvider class and opens the specified algorithm for use.
      * @param algorithm Algorithm name.
      * @return Represents a symmetric key algorithm provider.
      */
    /* static member */
    inline def openAlgorithm(algorithm: String): typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.SymmetricKeyAlgorithmProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("openAlgorithm")(algorithm.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core.SymmetricKeyAlgorithmProvider]
  }
}
