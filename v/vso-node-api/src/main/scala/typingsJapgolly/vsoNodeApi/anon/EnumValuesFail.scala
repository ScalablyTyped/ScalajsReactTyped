package typingsJapgolly.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesFail extends StObject {
  
  var enumValues: Fail
}
object EnumValuesFail {
  
  inline def apply(enumValues: Fail): EnumValuesFail = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesFail]
  }
  
  extension [Self <: EnumValuesFail](x: Self) {
    
    inline def setEnumValues(value: Fail): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
