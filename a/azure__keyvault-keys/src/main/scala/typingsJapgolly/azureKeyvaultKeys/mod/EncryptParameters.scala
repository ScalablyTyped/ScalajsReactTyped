package typingsJapgolly.azureKeyvaultKeys.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.azureKeyvaultKeys.mod.RsaEncryptParameters
  - typingsJapgolly.azureKeyvaultKeys.mod.AesGcmEncryptParameters
  - typingsJapgolly.azureKeyvaultKeys.mod.AesCbcEncryptParameters
*/
trait EncryptParameters extends StObject
object EncryptParameters {
  
  inline def AesCbcEncryptParameters(algorithm: AesCbcEncryptionAlgorithm, plaintext: js.typedarray.Uint8Array): typingsJapgolly.azureKeyvaultKeys.mod.AesCbcEncryptParameters = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], plaintext = plaintext.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.azureKeyvaultKeys.mod.AesCbcEncryptParameters]
  }
  
  inline def AesGcmEncryptParameters(algorithm: AesGcmEncryptionAlgorithm, plaintext: js.typedarray.Uint8Array): typingsJapgolly.azureKeyvaultKeys.mod.AesGcmEncryptParameters = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], plaintext = plaintext.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.azureKeyvaultKeys.mod.AesGcmEncryptParameters]
  }
  
  inline def RsaEncryptParameters(algorithm: RsaEncryptionAlgorithm, plaintext: js.typedarray.Uint8Array): typingsJapgolly.azureKeyvaultKeys.mod.RsaEncryptParameters = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], plaintext = plaintext.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.azureKeyvaultKeys.mod.RsaEncryptParameters]
  }
}
