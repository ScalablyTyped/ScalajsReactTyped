package typingsJapgolly.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesAddAdd extends StObject {
  
  var enumValues: AddAdd
}
object EnumValuesAddAdd {
  
  inline def apply(enumValues: AddAdd): EnumValuesAddAdd = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAddAdd]
  }
  
  extension [Self <: EnumValuesAddAdd](x: Self) {
    
    inline def setEnumValues(value: AddAdd): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
