package typingsJapgolly.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesDeclined extends StObject {
  
  var enumValues: Declined
}
object EnumValuesDeclined {
  
  inline def apply(enumValues: Declined): EnumValuesDeclined = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesDeclined]
  }
  
  extension [Self <: EnumValuesDeclined](x: Self) {
    
    inline def setEnumValues(value: Declined): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
