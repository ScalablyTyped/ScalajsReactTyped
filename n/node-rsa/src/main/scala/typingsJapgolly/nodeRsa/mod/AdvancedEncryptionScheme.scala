package typingsJapgolly.nodeRsa.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.nodeRsa.mod.AdvancedEncryptionSchemePKCS1
  - typingsJapgolly.nodeRsa.mod.AdvancedEncryptionSchemePKCS1OAEP
*/
trait AdvancedEncryptionScheme extends StObject
object AdvancedEncryptionScheme {
  
  inline def AdvancedEncryptionSchemePKCS1(padding: Double): typingsJapgolly.nodeRsa.mod.AdvancedEncryptionSchemePKCS1 = {
    val __obj = js.Dynamic.literal(padding = padding.asInstanceOf[js.Any], scheme = "pkcs1")
    __obj.asInstanceOf[typingsJapgolly.nodeRsa.mod.AdvancedEncryptionSchemePKCS1]
  }
  
  inline def AdvancedEncryptionSchemePKCS1OAEP(hash: HashingAlgorithm): typingsJapgolly.nodeRsa.mod.AdvancedEncryptionSchemePKCS1OAEP = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], scheme = "pkcs1_oaep")
    __obj.asInstanceOf[typingsJapgolly.nodeRsa.mod.AdvancedEncryptionSchemePKCS1OAEP]
  }
}
