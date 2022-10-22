package typingsJapgolly.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesBit extends StObject {
  
  var enumValues: Bit
}
object EnumValuesBit {
  
  inline def apply(enumValues: Bit): EnumValuesBit = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesBit]
  }
  
  extension [Self <: EnumValuesBit](x: Self) {
    
    inline def setEnumValues(value: Bit): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
