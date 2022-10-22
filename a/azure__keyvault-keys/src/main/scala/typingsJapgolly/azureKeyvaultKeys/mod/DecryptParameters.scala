package typingsJapgolly.azureKeyvaultKeys.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.azureKeyvaultKeys.mod.RsaDecryptParameters
  - typingsJapgolly.azureKeyvaultKeys.mod.AesGcmDecryptParameters
  - typingsJapgolly.azureKeyvaultKeys.mod.AesCbcDecryptParameters
*/
trait DecryptParameters extends StObject
object DecryptParameters {
  
  inline def AesCbcDecryptParameters(
    algorithm: AesCbcEncryptionAlgorithm,
    ciphertext: js.typedarray.Uint8Array,
    iv: js.typedarray.Uint8Array
  ): typingsJapgolly.azureKeyvaultKeys.mod.AesCbcDecryptParameters = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], ciphertext = ciphertext.asInstanceOf[js.Any], iv = iv.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.azureKeyvaultKeys.mod.AesCbcDecryptParameters]
  }
  
  inline def AesGcmDecryptParameters(
    algorithm: AesGcmEncryptionAlgorithm,
    authenticationTag: js.typedarray.Uint8Array,
    ciphertext: js.typedarray.Uint8Array,
    iv: js.typedarray.Uint8Array
  ): typingsJapgolly.azureKeyvaultKeys.mod.AesGcmDecryptParameters = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], authenticationTag = authenticationTag.asInstanceOf[js.Any], ciphertext = ciphertext.asInstanceOf[js.Any], iv = iv.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.azureKeyvaultKeys.mod.AesGcmDecryptParameters]
  }
  
  inline def RsaDecryptParameters(algorithm: RsaEncryptionAlgorithm, ciphertext: js.typedarray.Uint8Array): typingsJapgolly.azureKeyvaultKeys.mod.RsaDecryptParameters = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], ciphertext = ciphertext.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.azureKeyvaultKeys.mod.RsaDecryptParameters]
  }
}
