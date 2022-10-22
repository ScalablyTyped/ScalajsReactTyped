package typingsJapgolly.saxes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.saxes.mod.SaxesAttributeNS
  - typingsJapgolly.saxes.mod.SaxesAttributePlain
*/
trait SaxesAttribute extends StObject
object SaxesAttribute {
  
  inline def SaxesAttributeNS(local: String, name: String, prefix: String, uri: String, value: String): typingsJapgolly.saxes.mod.SaxesAttributeNS = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.saxes.mod.SaxesAttributeNS]
  }
  
  inline def SaxesAttributePlain(name: String, value: String): typingsJapgolly.saxes.mod.SaxesAttributePlain = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.saxes.mod.SaxesAttributePlain]
  }
}
