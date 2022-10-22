package typingsJapgolly.pkijs.mod

import typingsJapgolly.std.BufferSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.pkijs.mod.ContentEncryptionAesCbcParams
  - typingsJapgolly.pkijs.mod.ContentEncryptionAesGcmParams
*/
trait ContentEncryptionAlgorithm extends StObject
object ContentEncryptionAlgorithm {
  
  inline def ContentEncryptionAesCbcParams(iv: BufferSource, length: Double, name: String): typingsJapgolly.pkijs.mod.ContentEncryptionAesCbcParams = {
    val __obj = js.Dynamic.literal(iv = iv.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.pkijs.mod.ContentEncryptionAesCbcParams]
  }
  
  inline def ContentEncryptionAesGcmParams(iv: BufferSource, length: Double, name: String): typingsJapgolly.pkijs.mod.ContentEncryptionAesGcmParams = {
    val __obj = js.Dynamic.literal(iv = iv.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.pkijs.mod.ContentEncryptionAesGcmParams]
  }
}
