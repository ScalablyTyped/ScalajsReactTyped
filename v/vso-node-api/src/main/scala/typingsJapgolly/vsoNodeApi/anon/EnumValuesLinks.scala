package typingsJapgolly.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesLinks extends StObject {
  
  var enumValues: Links
}
object EnumValuesLinks {
  
  inline def apply(enumValues: Links): EnumValuesLinks = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesLinks]
  }
  
  extension [Self <: EnumValuesLinks](x: Self) {
    
    inline def setEnumValues(value: Links): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
