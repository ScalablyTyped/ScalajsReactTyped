package typingsJapgolly.nodeRsa.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.nodeRsa.mod.AdvancedSigningSchemePSS
  - typingsJapgolly.nodeRsa.mod.AdvancedSigningSchemePKCS1
*/
trait AdvancedSigningScheme extends StObject
object AdvancedSigningScheme {
  
  inline def AdvancedSigningSchemePKCS1(hash: HashingAlgorithm): typingsJapgolly.nodeRsa.mod.AdvancedSigningSchemePKCS1 = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], scheme = "pkcs1")
    __obj.asInstanceOf[typingsJapgolly.nodeRsa.mod.AdvancedSigningSchemePKCS1]
  }
  
  inline def AdvancedSigningSchemePSS(hash: HashingAlgorithm, saltLength: Double): typingsJapgolly.nodeRsa.mod.AdvancedSigningSchemePSS = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], saltLength = saltLength.asInstanceOf[js.Any], scheme = "pss")
    __obj.asInstanceOf[typingsJapgolly.nodeRsa.mod.AdvancedSigningSchemePSS]
  }
}
