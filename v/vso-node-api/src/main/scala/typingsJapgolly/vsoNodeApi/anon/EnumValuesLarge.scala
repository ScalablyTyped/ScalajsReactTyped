package typingsJapgolly.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesLarge extends StObject {
  
  var enumValues: Large
}
object EnumValuesLarge {
  
  inline def apply(enumValues: Large): EnumValuesLarge = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesLarge]
  }
  
  extension [Self <: EnumValuesLarge](x: Self) {
    
    inline def setEnumValues(value: Large): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
