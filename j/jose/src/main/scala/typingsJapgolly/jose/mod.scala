package typingsJapgolly.jose

import typingsJapgolly.jose.distTypesJweCompactDecryptMod.CompactDecryptGetKey
import typingsJapgolly.jose.distTypesJweFlattenedDecryptMod.FlattenedDecryptGetKey
import typingsJapgolly.jose.distTypesJweGeneralDecryptMod.GeneralDecryptGetKey
import typingsJapgolly.jose.distTypesJwksRemoteMod.RemoteJWKSetOptions
import typingsJapgolly.jose.distTypesJwksRemoteMod.URL
import typingsJapgolly.jose.distTypesJwsCompactVerifyMod.CompactVerifyGetKey
import typingsJapgolly.jose.distTypesJwsFlattenedVerifyMod.FlattenedVerifyGetKey
import typingsJapgolly.jose.distTypesJwsGeneralVerifyMod.GeneralVerifyGetKey
import typingsJapgolly.jose.distTypesJwtDecryptMod.JWTDecryptGetKey
import typingsJapgolly.jose.distTypesJwtDecryptMod.JWTDecryptOptions
import typingsJapgolly.jose.distTypesJwtUnsecuredMod.UnsecuredResult
import typingsJapgolly.jose.distTypesJwtVerifyMod.JWTVerifyGetKey
import typingsJapgolly.jose.distTypesJwtVerifyMod.JWTVerifyOptions
import typingsJapgolly.jose.distTypesKeyGenerateKeyPairMod.GenerateKeyPairOptions
import typingsJapgolly.jose.distTypesKeyGenerateKeyPairMod.GenerateKeyPairResult
import typingsJapgolly.jose.distTypesKeyGenerateSecretMod.GenerateSecretOptions
import typingsJapgolly.jose.distTypesKeyImportMod.PEMImportOptions
import typingsJapgolly.jose.distTypesTypesMod.CompactDecryptResult
import typingsJapgolly.jose.distTypesTypesMod.CompactVerifyResult
import typingsJapgolly.jose.distTypesTypesMod.DecryptOptions
import typingsJapgolly.jose.distTypesTypesMod.FlattenedDecryptResult
import typingsJapgolly.jose.distTypesTypesMod.FlattenedJWE
import typingsJapgolly.jose.distTypesTypesMod.FlattenedJWSInput
import typingsJapgolly.jose.distTypesTypesMod.FlattenedVerifyResult
import typingsJapgolly.jose.distTypesTypesMod.GeneralDecryptResult
import typingsJapgolly.jose.distTypesTypesMod.GeneralJWE
import typingsJapgolly.jose.distTypesTypesMod.GeneralJWSInput
import typingsJapgolly.jose.distTypesTypesMod.GeneralVerifyResult
import typingsJapgolly.jose.distTypesTypesMod.GetKeyFunction
import typingsJapgolly.jose.distTypesTypesMod.JSONWebKeySet
import typingsJapgolly.jose.distTypesTypesMod.JWK
import typingsJapgolly.jose.distTypesTypesMod.JWSHeaderParameters
import typingsJapgolly.jose.distTypesTypesMod.JWTClaimVerificationOptions
import typingsJapgolly.jose.distTypesTypesMod.JWTDecryptResult
import typingsJapgolly.jose.distTypesTypesMod.JWTPayload
import typingsJapgolly.jose.distTypesTypesMod.JWTVerifyResult
import typingsJapgolly.jose.distTypesTypesMod.KeyLike
import typingsJapgolly.jose.distTypesTypesMod.ResolvedKey
import typingsJapgolly.jose.distTypesTypesMod.VerifyOptions
import typingsJapgolly.jose.distTypesUtilBase64urlMod.Base64UrlDecode
import typingsJapgolly.jose.distTypesUtilBase64urlMod.Base64UrlEncode
import typingsJapgolly.jose.distTypesUtilDecodeProtectedHeaderMod.ProtectedHeaderParameters
import typingsJapgolly.jose.joseStrings.sha256
import typingsJapgolly.jose.joseStrings.sha384
import typingsJapgolly.jose.joseStrings.sha512
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jose", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("jose", "CompactEncrypt")
  @js.native
  open class CompactEncrypt protected ()
    extends typingsJapgolly.jose.distTypesJweCompactEncryptMod.CompactEncrypt {
    /** @param plaintext Binary representation of the plaintext to encrypt. */
    def this(plaintext: js.typedarray.Uint8Array) = this()
  }
  
  @JSImport("jose", "CompactSign")
  @js.native
  open class CompactSign protected ()
    extends typingsJapgolly.jose.distTypesJwsCompactSignMod.CompactSign {
    /** @param payload Binary representation of the payload to sign. */
    def this(payload: js.typedarray.Uint8Array) = this()
  }
  
  inline def EmbeddedJWK(protectedHeader: JWSHeaderParameters, token: FlattenedJWSInput): js.Promise[KeyLike] = (^.asInstanceOf[js.Dynamic].applyDynamic("EmbeddedJWK")(protectedHeader.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KeyLike]]
  
  @JSImport("jose", "EncryptJWT")
  @js.native
  open class EncryptJWT protected ()
    extends typingsJapgolly.jose.distTypesJwtEncryptMod.EncryptJWT {
    /** @param payload The JWT Claims Set object. */
    def this(payload: JWTPayload) = this()
  }
  
  @JSImport("jose", "FlattenedEncrypt")
  @js.native
  open class FlattenedEncrypt protected ()
    extends typingsJapgolly.jose.distTypesJweFlattenedEncryptMod.FlattenedEncrypt {
    /** @param plaintext Binary representation of the plaintext to encrypt. */
    def this(plaintext: js.typedarray.Uint8Array) = this()
  }
  
  @JSImport("jose", "FlattenedSign")
  @js.native
  open class FlattenedSign protected ()
    extends typingsJapgolly.jose.distTypesJwsFlattenedSignMod.FlattenedSign {
    /** @param payload Binary representation of the payload to sign. */
    def this(payload: js.typedarray.Uint8Array) = this()
  }
  
  @JSImport("jose", "GeneralEncrypt")
  @js.native
  open class GeneralEncrypt protected ()
    extends typingsJapgolly.jose.distTypesJweGeneralEncryptMod.GeneralEncrypt {
    /** @param plaintext Binary representation of the plaintext to encrypt. */
    def this(plaintext: js.typedarray.Uint8Array) = this()
  }
  
  @JSImport("jose", "GeneralSign")
  @js.native
  open class GeneralSign protected ()
    extends typingsJapgolly.jose.distTypesJwsGeneralSignMod.GeneralSign {
    /** @param payload Binary representation of the payload to sign. */
    def this(payload: js.typedarray.Uint8Array) = this()
  }
  
  @JSImport("jose", "ProduceJWT")
  @js.native
  open class ProduceJWT protected ()
    extends typingsJapgolly.jose.distTypesJwtProduceMod.ProduceJWT {
    /** @param payload The JWT Claims Set object. */
    def this(payload: JWTPayload) = this()
  }
  
  @JSImport("jose", "SignJWT")
  @js.native
  open class SignJWT protected ()
    extends typingsJapgolly.jose.distTypesJwtSignMod.SignJWT {
    /** @param payload The JWT Claims Set object. */
    def this(payload: JWTPayload) = this()
  }
  
  @JSImport("jose", "UnsecuredJWT")
  @js.native
  open class UnsecuredJWT protected ()
    extends typingsJapgolly.jose.distTypesJwtUnsecuredMod.UnsecuredJWT {
    /** @param payload The JWT Claims Set object. */
    def this(payload: JWTPayload) = this()
  }
  /* static members */
  object UnsecuredJWT {
    
    @JSImport("jose", "UnsecuredJWT")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Decodes an unsecured JWT.
      *
      * @param jwt Unsecured JWT to decode the payload of.
      * @param options JWT Claims Set validation options.
      */
    inline def decode(jwt: String): UnsecuredResult = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(jwt.asInstanceOf[js.Any]).asInstanceOf[UnsecuredResult]
    inline def decode(jwt: String, options: JWTClaimVerificationOptions): UnsecuredResult = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(jwt.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[UnsecuredResult]
  }
  
  object base64url {
    
    @JSImport("jose", "base64url.decode")
    @js.native
    val decode: Base64UrlDecode = js.native
    
    @JSImport("jose", "base64url.encode")
    @js.native
    val encode: Base64UrlEncode = js.native
  }
  
  inline def calculateJwkThumbprint(jwk: JWK): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateJwkThumbprint")(jwk.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def calculateJwkThumbprint(jwk: JWK, digestAlgorithm: sha256 | sha384 | sha512): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateJwkThumbprint")(jwk.asInstanceOf[js.Any], digestAlgorithm.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def calculateJwkThumbprintUri(jwk: JWK): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateJwkThumbprintUri")(jwk.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def calculateJwkThumbprintUri(jwk: JWK, digestAlgorithm: sha256 | sha384 | sha512): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateJwkThumbprintUri")(jwk.asInstanceOf[js.Any], digestAlgorithm.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def compactDecrypt(jwe: String, getKey: CompactDecryptGetKey): js.Promise[CompactDecryptResult & ResolvedKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactDecrypt")(jwe.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactDecryptResult & ResolvedKey]]
  inline def compactDecrypt(jwe: String, getKey: CompactDecryptGetKey, options: DecryptOptions): js.Promise[CompactDecryptResult & ResolvedKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactDecrypt")(jwe.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactDecryptResult & ResolvedKey]]
  inline def compactDecrypt(jwe: String, key: js.typedarray.Uint8Array): js.Promise[CompactDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactDecryptResult]]
  inline def compactDecrypt(jwe: String, key: js.typedarray.Uint8Array, options: DecryptOptions): js.Promise[CompactDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactDecryptResult]]
  inline def compactDecrypt(jwe: String, key: KeyLike): js.Promise[CompactDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactDecryptResult]]
  inline def compactDecrypt(jwe: String, key: KeyLike, options: DecryptOptions): js.Promise[CompactDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactDecryptResult]]
  inline def compactDecrypt(jwe: js.typedarray.Uint8Array, getKey: CompactDecryptGetKey): js.Promise[CompactDecryptResult & ResolvedKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactDecrypt")(jwe.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactDecryptResult & ResolvedKey]]
  inline def compactDecrypt(jwe: js.typedarray.Uint8Array, getKey: CompactDecryptGetKey, options: DecryptOptions): js.Promise[CompactDecryptResult & ResolvedKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactDecrypt")(jwe.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactDecryptResult & ResolvedKey]]
  inline def compactDecrypt(jwe: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.Promise[CompactDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactDecryptResult]]
  inline def compactDecrypt(jwe: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array, options: DecryptOptions): js.Promise[CompactDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactDecryptResult]]
  inline def compactDecrypt(jwe: js.typedarray.Uint8Array, key: KeyLike): js.Promise[CompactDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactDecryptResult]]
  inline def compactDecrypt(jwe: js.typedarray.Uint8Array, key: KeyLike, options: DecryptOptions): js.Promise[CompactDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactDecryptResult]]
  
  inline def compactVerify(jws: String, getKey: CompactVerifyGetKey): js.Promise[CompactVerifyResult & ResolvedKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactVerify")(jws.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactVerifyResult & ResolvedKey]]
  inline def compactVerify(jws: String, getKey: CompactVerifyGetKey, options: VerifyOptions): js.Promise[CompactVerifyResult & ResolvedKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactVerify")(jws.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactVerifyResult & ResolvedKey]]
  inline def compactVerify(jws: String, key: js.typedarray.Uint8Array): js.Promise[CompactVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactVerifyResult]]
  inline def compactVerify(jws: String, key: js.typedarray.Uint8Array, options: VerifyOptions): js.Promise[CompactVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactVerifyResult]]
  inline def compactVerify(jws: String, key: KeyLike): js.Promise[CompactVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactVerifyResult]]
  inline def compactVerify(jws: String, key: KeyLike, options: VerifyOptions): js.Promise[CompactVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactVerifyResult]]
  inline def compactVerify(jws: js.typedarray.Uint8Array, getKey: CompactVerifyGetKey): js.Promise[CompactVerifyResult & ResolvedKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactVerify")(jws.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactVerifyResult & ResolvedKey]]
  inline def compactVerify(jws: js.typedarray.Uint8Array, getKey: CompactVerifyGetKey, options: VerifyOptions): js.Promise[CompactVerifyResult & ResolvedKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactVerify")(jws.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactVerifyResult & ResolvedKey]]
  inline def compactVerify(jws: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.Promise[CompactVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactVerifyResult]]
  inline def compactVerify(jws: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array, options: VerifyOptions): js.Promise[CompactVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactVerifyResult]]
  inline def compactVerify(jws: js.typedarray.Uint8Array, key: KeyLike): js.Promise[CompactVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactVerifyResult]]
  inline def compactVerify(jws: js.typedarray.Uint8Array, key: KeyLike, options: VerifyOptions): js.Promise[CompactVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactVerifyResult]]
  
  inline def createLocalJWKSet(jwks: JSONWebKeySet): GetKeyFunction[JWSHeaderParameters, FlattenedJWSInput] = ^.asInstanceOf[js.Dynamic].applyDynamic("createLocalJWKSet")(jwks.asInstanceOf[js.Any]).asInstanceOf[GetKeyFunction[JWSHeaderParameters, FlattenedJWSInput]]
  
  inline def createRemoteJWKSet(url: URL): GetKeyFunction[JWSHeaderParameters, FlattenedJWSInput] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRemoteJWKSet")(url.asInstanceOf[js.Any]).asInstanceOf[GetKeyFunction[JWSHeaderParameters, FlattenedJWSInput]]
  inline def createRemoteJWKSet(url: URL, options: RemoteJWKSetOptions): GetKeyFunction[JWSHeaderParameters, FlattenedJWSInput] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRemoteJWKSet")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[GetKeyFunction[JWSHeaderParameters, FlattenedJWSInput]]
  
  inline def decodeJwt(jwt: String): JWTPayload = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeJwt")(jwt.asInstanceOf[js.Any]).asInstanceOf[JWTPayload]
  
  inline def decodeProtectedHeader(token: String): ProtectedHeaderParameters = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeProtectedHeader")(token.asInstanceOf[js.Any]).asInstanceOf[ProtectedHeaderParameters]
  inline def decodeProtectedHeader(token: js.Object): ProtectedHeaderParameters = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeProtectedHeader")(token.asInstanceOf[js.Any]).asInstanceOf[ProtectedHeaderParameters]
  
  object errors {
    
    @JSImport("jose", "errors.JOSEAlgNotAllowed")
    @js.native
    open class JOSEAlgNotAllowed ()
      extends typingsJapgolly.jose.distTypesUtilErrorsMod.JOSEAlgNotAllowed {
      def this(message: String) = this()
    }
    
    @JSImport("jose", "errors.JOSEError")
    @js.native
    open class JOSEError ()
      extends typingsJapgolly.jose.distTypesUtilErrorsMod.JOSEError {
      def this(message: String) = this()
    }
    
    @JSImport("jose", "errors.JOSENotSupported")
    @js.native
    open class JOSENotSupported ()
      extends typingsJapgolly.jose.distTypesUtilErrorsMod.JOSENotSupported {
      def this(message: String) = this()
    }
    
    @JSImport("jose", "errors.JWEDecryptionFailed")
    @js.native
    open class JWEDecryptionFailed ()
      extends typingsJapgolly.jose.distTypesUtilErrorsMod.JWEDecryptionFailed {
      def this(message: String) = this()
    }
    
    @JSImport("jose", "errors.JWEInvalid")
    @js.native
    open class JWEInvalid ()
      extends typingsJapgolly.jose.distTypesUtilErrorsMod.JWEInvalid {
      def this(message: String) = this()
    }
    
    @JSImport("jose", "errors.JWKInvalid")
    @js.native
    open class JWKInvalid ()
      extends typingsJapgolly.jose.distTypesUtilErrorsMod.JWKInvalid {
      def this(message: String) = this()
    }
    
    @JSImport("jose", "errors.JWKSInvalid")
    @js.native
    open class JWKSInvalid ()
      extends typingsJapgolly.jose.distTypesUtilErrorsMod.JWKSInvalid {
      def this(message: String) = this()
    }
    
    @JSImport("jose", "errors.JWKSMultipleMatchingKeys")
    @js.native
    open class JWKSMultipleMatchingKeys ()
      extends typingsJapgolly.jose.distTypesUtilErrorsMod.JWKSMultipleMatchingKeys {
      def this(message: String) = this()
    }
    
    @JSImport("jose", "errors.JWKSNoMatchingKey")
    @js.native
    open class JWKSNoMatchingKey ()
      extends typingsJapgolly.jose.distTypesUtilErrorsMod.JWKSNoMatchingKey {
      def this(message: String) = this()
    }
    
    @JSImport("jose", "errors.JWKSTimeout")
    @js.native
    open class JWKSTimeout ()
      extends typingsJapgolly.jose.distTypesUtilErrorsMod.JWKSTimeout {
      def this(message: String) = this()
    }
    
    @JSImport("jose", "errors.JWSInvalid")
    @js.native
    open class JWSInvalid ()
      extends typingsJapgolly.jose.distTypesUtilErrorsMod.JWSInvalid {
      def this(message: String) = this()
    }
    
    @JSImport("jose", "errors.JWSSignatureVerificationFailed")
    @js.native
    open class JWSSignatureVerificationFailed ()
      extends typingsJapgolly.jose.distTypesUtilErrorsMod.JWSSignatureVerificationFailed {
      def this(message: String) = this()
    }
    
    @JSImport("jose", "errors.JWTClaimValidationFailed")
    @js.native
    open class JWTClaimValidationFailed protected ()
      extends typingsJapgolly.jose.distTypesUtilErrorsMod.JWTClaimValidationFailed {
      def this(message: String) = this()
      def this(message: String, claim: String) = this()
      def this(message: String, claim: String, reason: String) = this()
      def this(message: String, claim: Unit, reason: String) = this()
    }
    
    @JSImport("jose", "errors.JWTExpired")
    @js.native
    open class JWTExpired protected ()
      extends typingsJapgolly.jose.distTypesUtilErrorsMod.JWTExpired {
      def this(message: String) = this()
      def this(message: String, claim: String) = this()
      def this(message: String, claim: String, reason: String) = this()
      def this(message: String, claim: Unit, reason: String) = this()
    }
    
    @JSImport("jose", "errors.JWTInvalid")
    @js.native
    open class JWTInvalid ()
      extends typingsJapgolly.jose.distTypesUtilErrorsMod.JWTInvalid {
      def this(message: String) = this()
    }
  }
  
  inline def exportJWK(key: js.typedarray.Uint8Array): js.Promise[JWK] = ^.asInstanceOf[js.Dynamic].applyDynamic("exportJWK")(key.asInstanceOf[js.Any]).asInstanceOf[js.Promise[JWK]]
  inline def exportJWK(key: KeyLike): js.Promise[JWK] = ^.asInstanceOf[js.Dynamic].applyDynamic("exportJWK")(key.asInstanceOf[js.Any]).asInstanceOf[js.Promise[JWK]]
  
  inline def exportPKCS8(key: KeyLike): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("exportPKCS8")(key.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def exportSPKI(key: KeyLike): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("exportSPKI")(key.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def flattenedDecrypt(jwe: FlattenedJWE, getKey: FlattenedDecryptGetKey): js.Promise[FlattenedDecryptResult & ResolvedKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenedDecrypt")(jwe.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FlattenedDecryptResult & ResolvedKey]]
  inline def flattenedDecrypt(jwe: FlattenedJWE, getKey: FlattenedDecryptGetKey, options: DecryptOptions): js.Promise[FlattenedDecryptResult & ResolvedKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenedDecrypt")(jwe.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FlattenedDecryptResult & ResolvedKey]]
  inline def flattenedDecrypt(jwe: FlattenedJWE, key: js.typedarray.Uint8Array): js.Promise[FlattenedDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenedDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FlattenedDecryptResult]]
  inline def flattenedDecrypt(jwe: FlattenedJWE, key: js.typedarray.Uint8Array, options: DecryptOptions): js.Promise[FlattenedDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenedDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FlattenedDecryptResult]]
  inline def flattenedDecrypt(jwe: FlattenedJWE, key: KeyLike): js.Promise[FlattenedDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenedDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FlattenedDecryptResult]]
  inline def flattenedDecrypt(jwe: FlattenedJWE, key: KeyLike, options: DecryptOptions): js.Promise[FlattenedDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenedDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FlattenedDecryptResult]]
  
  inline def flattenedVerify(jws: FlattenedJWSInput, getKey: FlattenedVerifyGetKey): js.Promise[FlattenedVerifyResult & ResolvedKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenedVerify")(jws.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FlattenedVerifyResult & ResolvedKey]]
  inline def flattenedVerify(jws: FlattenedJWSInput, getKey: FlattenedVerifyGetKey, options: VerifyOptions): js.Promise[FlattenedVerifyResult & ResolvedKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenedVerify")(jws.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FlattenedVerifyResult & ResolvedKey]]
  inline def flattenedVerify(jws: FlattenedJWSInput, key: js.typedarray.Uint8Array): js.Promise[FlattenedVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenedVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FlattenedVerifyResult]]
  inline def flattenedVerify(jws: FlattenedJWSInput, key: js.typedarray.Uint8Array, options: VerifyOptions): js.Promise[FlattenedVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenedVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FlattenedVerifyResult]]
  inline def flattenedVerify(jws: FlattenedJWSInput, key: KeyLike): js.Promise[FlattenedVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenedVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FlattenedVerifyResult]]
  inline def flattenedVerify(jws: FlattenedJWSInput, key: KeyLike, options: VerifyOptions): js.Promise[FlattenedVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenedVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FlattenedVerifyResult]]
  
  inline def generalDecrypt(jwe: GeneralJWE, getKey: GeneralDecryptGetKey): js.Promise[GeneralDecryptResult & ResolvedKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("generalDecrypt")(jwe.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeneralDecryptResult & ResolvedKey]]
  inline def generalDecrypt(jwe: GeneralJWE, getKey: GeneralDecryptGetKey, options: DecryptOptions): js.Promise[GeneralDecryptResult & ResolvedKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("generalDecrypt")(jwe.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeneralDecryptResult & ResolvedKey]]
  inline def generalDecrypt(jwe: GeneralJWE, key: js.typedarray.Uint8Array): js.Promise[GeneralDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("generalDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeneralDecryptResult]]
  inline def generalDecrypt(jwe: GeneralJWE, key: js.typedarray.Uint8Array, options: DecryptOptions): js.Promise[GeneralDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("generalDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeneralDecryptResult]]
  inline def generalDecrypt(jwe: GeneralJWE, key: KeyLike): js.Promise[GeneralDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("generalDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeneralDecryptResult]]
  inline def generalDecrypt(jwe: GeneralJWE, key: KeyLike, options: DecryptOptions): js.Promise[GeneralDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("generalDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeneralDecryptResult]]
  
  inline def generalVerify(jws: GeneralJWSInput, getKey: GeneralVerifyGetKey): js.Promise[GeneralVerifyResult & ResolvedKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("generalVerify")(jws.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeneralVerifyResult & ResolvedKey]]
  inline def generalVerify(jws: GeneralJWSInput, getKey: GeneralVerifyGetKey, options: VerifyOptions): js.Promise[GeneralVerifyResult & ResolvedKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("generalVerify")(jws.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeneralVerifyResult & ResolvedKey]]
  inline def generalVerify(jws: GeneralJWSInput, key: js.typedarray.Uint8Array): js.Promise[GeneralVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("generalVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeneralVerifyResult]]
  inline def generalVerify(jws: GeneralJWSInput, key: js.typedarray.Uint8Array, options: VerifyOptions): js.Promise[GeneralVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("generalVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeneralVerifyResult]]
  inline def generalVerify(jws: GeneralJWSInput, key: KeyLike): js.Promise[GeneralVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("generalVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeneralVerifyResult]]
  inline def generalVerify(jws: GeneralJWSInput, key: KeyLike, options: VerifyOptions): js.Promise[GeneralVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("generalVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeneralVerifyResult]]
  
  inline def generateKeyPair(alg: String): js.Promise[GenerateKeyPairResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(alg.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GenerateKeyPairResult]]
  inline def generateKeyPair(alg: String, options: GenerateKeyPairOptions): js.Promise[GenerateKeyPairResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(alg.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GenerateKeyPairResult]]
  
  inline def generateSecret(alg: String): js.Promise[KeyLike | js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateSecret")(alg.asInstanceOf[js.Any]).asInstanceOf[js.Promise[KeyLike | js.typedarray.Uint8Array]]
  inline def generateSecret(alg: String, options: GenerateSecretOptions): js.Promise[KeyLike | js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateSecret")(alg.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KeyLike | js.typedarray.Uint8Array]]
  
  inline def importJWK(jwk: JWK): js.Promise[KeyLike | js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("importJWK")(jwk.asInstanceOf[js.Any]).asInstanceOf[js.Promise[KeyLike | js.typedarray.Uint8Array]]
  inline def importJWK(jwk: JWK, alg: String): js.Promise[KeyLike | js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("importJWK")(jwk.asInstanceOf[js.Any], alg.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KeyLike | js.typedarray.Uint8Array]]
  inline def importJWK(jwk: JWK, alg: String, octAsKeyObject: Boolean): js.Promise[KeyLike | js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("importJWK")(jwk.asInstanceOf[js.Any], alg.asInstanceOf[js.Any], octAsKeyObject.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KeyLike | js.typedarray.Uint8Array]]
  inline def importJWK(jwk: JWK, alg: Unit, octAsKeyObject: Boolean): js.Promise[KeyLike | js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("importJWK")(jwk.asInstanceOf[js.Any], alg.asInstanceOf[js.Any], octAsKeyObject.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KeyLike | js.typedarray.Uint8Array]]
  
  inline def importPKCS8(pkcs8: String, alg: String): js.Promise[KeyLike] = (^.asInstanceOf[js.Dynamic].applyDynamic("importPKCS8")(pkcs8.asInstanceOf[js.Any], alg.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KeyLike]]
  inline def importPKCS8(pkcs8: String, alg: String, options: PEMImportOptions): js.Promise[KeyLike] = (^.asInstanceOf[js.Dynamic].applyDynamic("importPKCS8")(pkcs8.asInstanceOf[js.Any], alg.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KeyLike]]
  
  inline def importSPKI(spki: String, alg: String): js.Promise[KeyLike] = (^.asInstanceOf[js.Dynamic].applyDynamic("importSPKI")(spki.asInstanceOf[js.Any], alg.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KeyLike]]
  inline def importSPKI(spki: String, alg: String, options: PEMImportOptions): js.Promise[KeyLike] = (^.asInstanceOf[js.Dynamic].applyDynamic("importSPKI")(spki.asInstanceOf[js.Any], alg.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KeyLike]]
  
  inline def importX509(x509: String, alg: String): js.Promise[KeyLike] = (^.asInstanceOf[js.Dynamic].applyDynamic("importX509")(x509.asInstanceOf[js.Any], alg.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KeyLike]]
  inline def importX509(x509: String, alg: String, options: PEMImportOptions): js.Promise[KeyLike] = (^.asInstanceOf[js.Dynamic].applyDynamic("importX509")(x509.asInstanceOf[js.Any], alg.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KeyLike]]
  
  inline def jwtDecrypt(jwt: String, getKey: JWTDecryptGetKey): js.Promise[JWTDecryptResult & ResolvedKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtDecrypt")(jwt.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTDecryptResult & ResolvedKey]]
  inline def jwtDecrypt(jwt: String, getKey: JWTDecryptGetKey, options: JWTDecryptOptions): js.Promise[JWTDecryptResult & ResolvedKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtDecrypt")(jwt.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTDecryptResult & ResolvedKey]]
  inline def jwtDecrypt(jwt: String, key: js.typedarray.Uint8Array): js.Promise[JWTDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtDecrypt")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTDecryptResult]]
  inline def jwtDecrypt(jwt: String, key: js.typedarray.Uint8Array, options: JWTDecryptOptions): js.Promise[JWTDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtDecrypt")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTDecryptResult]]
  inline def jwtDecrypt(jwt: String, key: KeyLike): js.Promise[JWTDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtDecrypt")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTDecryptResult]]
  inline def jwtDecrypt(jwt: String, key: KeyLike, options: JWTDecryptOptions): js.Promise[JWTDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtDecrypt")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTDecryptResult]]
  inline def jwtDecrypt(jwt: js.typedarray.Uint8Array, getKey: JWTDecryptGetKey): js.Promise[JWTDecryptResult & ResolvedKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtDecrypt")(jwt.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTDecryptResult & ResolvedKey]]
  inline def jwtDecrypt(jwt: js.typedarray.Uint8Array, getKey: JWTDecryptGetKey, options: JWTDecryptOptions): js.Promise[JWTDecryptResult & ResolvedKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtDecrypt")(jwt.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTDecryptResult & ResolvedKey]]
  inline def jwtDecrypt(jwt: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.Promise[JWTDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtDecrypt")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTDecryptResult]]
  inline def jwtDecrypt(jwt: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array, options: JWTDecryptOptions): js.Promise[JWTDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtDecrypt")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTDecryptResult]]
  inline def jwtDecrypt(jwt: js.typedarray.Uint8Array, key: KeyLike): js.Promise[JWTDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtDecrypt")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTDecryptResult]]
  inline def jwtDecrypt(jwt: js.typedarray.Uint8Array, key: KeyLike, options: JWTDecryptOptions): js.Promise[JWTDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtDecrypt")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTDecryptResult]]
  
  inline def jwtVerify(jwt: String, getKey: JWTVerifyGetKey): js.Promise[JWTVerifyResult & ResolvedKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtVerify")(jwt.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTVerifyResult & ResolvedKey]]
  inline def jwtVerify(jwt: String, getKey: JWTVerifyGetKey, options: JWTVerifyOptions): js.Promise[JWTVerifyResult & ResolvedKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtVerify")(jwt.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTVerifyResult & ResolvedKey]]
  inline def jwtVerify(jwt: String, key: js.typedarray.Uint8Array): js.Promise[JWTVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtVerify")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTVerifyResult]]
  inline def jwtVerify(jwt: String, key: js.typedarray.Uint8Array, options: JWTVerifyOptions): js.Promise[JWTVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtVerify")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTVerifyResult]]
  inline def jwtVerify(jwt: String, key: KeyLike): js.Promise[JWTVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtVerify")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTVerifyResult]]
  inline def jwtVerify(jwt: String, key: KeyLike, options: JWTVerifyOptions): js.Promise[JWTVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtVerify")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTVerifyResult]]
  inline def jwtVerify(jwt: js.typedarray.Uint8Array, getKey: JWTVerifyGetKey): js.Promise[JWTVerifyResult & ResolvedKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtVerify")(jwt.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTVerifyResult & ResolvedKey]]
  inline def jwtVerify(jwt: js.typedarray.Uint8Array, getKey: JWTVerifyGetKey, options: JWTVerifyOptions): js.Promise[JWTVerifyResult & ResolvedKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtVerify")(jwt.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTVerifyResult & ResolvedKey]]
  inline def jwtVerify(jwt: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.Promise[JWTVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtVerify")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTVerifyResult]]
  inline def jwtVerify(jwt: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array, options: JWTVerifyOptions): js.Promise[JWTVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtVerify")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTVerifyResult]]
  inline def jwtVerify(jwt: js.typedarray.Uint8Array, key: KeyLike): js.Promise[JWTVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtVerify")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTVerifyResult]]
  inline def jwtVerify(jwt: js.typedarray.Uint8Array, key: KeyLike, options: JWTVerifyOptions): js.Promise[JWTVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtVerify")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTVerifyResult]]
}
