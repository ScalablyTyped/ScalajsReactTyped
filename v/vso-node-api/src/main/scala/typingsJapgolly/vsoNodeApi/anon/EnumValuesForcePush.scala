package typingsJapgolly.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesForcePush extends StObject {
  
  var enumValues: ForcePush
}
object EnumValuesForcePush {
  
  inline def apply(enumValues: ForcePush): EnumValuesForcePush = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesForcePush]
  }
  
  extension [Self <: EnumValuesForcePush](x: Self) {
    
    inline def setEnumValues(value: ForcePush): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
