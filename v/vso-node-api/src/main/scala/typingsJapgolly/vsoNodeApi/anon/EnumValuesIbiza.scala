package typingsJapgolly.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesIbiza extends StObject {
  
  var enumValues: Ibiza
}
object EnumValuesIbiza {
  
  inline def apply(enumValues: Ibiza): EnumValuesIbiza = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesIbiza]
  }
  
  extension [Self <: EnumValuesIbiza](x: Self) {
    
    inline def setEnumValues(value: Ibiza): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
