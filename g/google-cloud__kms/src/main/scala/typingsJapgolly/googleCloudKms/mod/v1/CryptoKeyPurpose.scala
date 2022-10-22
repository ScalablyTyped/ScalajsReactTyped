package typingsJapgolly.googleCloudKms.mod.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CryptoKeyPurpose extends StObject
@JSImport("@google-cloud/kms", "v1.CryptoKeyPurpose")
@js.native
object CryptoKeyPurpose extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CryptoKeyPurpose & Double] = js.native
  
  // [CryptoKeys][google.cloud.kms.v1.CryptoKey] with this purpose may be used with
  // [AsymmetricDecrypt][google.cloud.kms.v1.KeyManagementService.AsymmetricDecrypt] and
  // [GetPublicKey][google.cloud.kms.v1.KeyManagementService.GetPublicKey].
  @js.native
  sealed trait ASYMMETRIC_DECRYPT
    extends StObject
       with CryptoKeyPurpose
  /* 6 */ val ASYMMETRIC_DECRYPT: typingsJapgolly.googleCloudKms.mod.v1.CryptoKeyPurpose.ASYMMETRIC_DECRYPT & Double = js.native
  
  // [CryptoKeys][google.cloud.kms.v1.CryptoKey] with this purpose may be used with
  // [AsymmetricSign][google.cloud.kms.v1.KeyManagementService.AsymmetricSign] and
  // [GetPublicKey][google.cloud.kms.v1.KeyManagementService.GetPublicKey].
  @js.native
  sealed trait ASYMMETRIC_SIGN
    extends StObject
       with CryptoKeyPurpose
  /* 5 */ val ASYMMETRIC_SIGN: typingsJapgolly.googleCloudKms.mod.v1.CryptoKeyPurpose.ASYMMETRIC_SIGN & Double = js.native
  
  // Not specified.
  @js.native
  sealed trait CRYPTO_KEY_PURPOSE_UNSPECIFIED
    extends StObject
       with CryptoKeyPurpose
  /* 0 */ val CRYPTO_KEY_PURPOSE_UNSPECIFIED: typingsJapgolly.googleCloudKms.mod.v1.CryptoKeyPurpose.CRYPTO_KEY_PURPOSE_UNSPECIFIED & Double = js.native
  
  // [CryptoKeys][google.cloud.kms.v1.CryptoKey] with this purpose may be used with
  // [Encrypt][google.cloud.kms.v1.KeyManagementService.Encrypt] and
  // [Decrypt][google.cloud.kms.v1.KeyManagementService.Decrypt].
  @js.native
  sealed trait ENCRYPT_DECRYPT
    extends StObject
       with CryptoKeyPurpose
  /* 1 */ val ENCRYPT_DECRYPT: typingsJapgolly.googleCloudKms.mod.v1.CryptoKeyPurpose.ENCRYPT_DECRYPT & Double = js.native
}
