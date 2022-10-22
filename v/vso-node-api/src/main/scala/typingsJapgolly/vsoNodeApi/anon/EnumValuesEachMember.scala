package typingsJapgolly.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesEachMember extends StObject {
  
  var enumValues: EachMember
}
object EnumValuesEachMember {
  
  inline def apply(enumValues: EachMember): EnumValuesEachMember = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesEachMember]
  }
  
  extension [Self <: EnumValuesEachMember](x: Self) {
    
    inline def setEnumValues(value: EachMember): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
