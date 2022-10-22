package typingsJapgolly.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributesValue extends StObject {
  
  var attributes: Deleted
  
  var value: String
}
object AttributesValue {
  
  inline def apply(attributes: Deleted, value: String): AttributesValue = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributesValue]
  }
  
  extension [Self <: AttributesValue](x: Self) {
    
    inline def setAttributes(value: Deleted): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
