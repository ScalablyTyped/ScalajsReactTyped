package typingsJapgolly.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyValueProperty
  extends StObject
     with PropBase
     with Property {
  
  @JSName("type")
  var type_KeyValueProperty: typingsJapgolly.swcCore.swcCoreStrings.KeyValueProperty
  
  var value: Expression
}
object KeyValueProperty {
  
  inline def apply(key: PropertyName, value: Expression): KeyValueProperty = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("KeyValueProperty")
    __obj.asInstanceOf[KeyValueProperty]
  }
  
  extension [Self <: KeyValueProperty](x: Self) {
    
    inline def setType(value: typingsJapgolly.swcCore.swcCoreStrings.KeyValueProperty): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Expression): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
