package typingsJapgolly.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesAllow extends StObject {
  
  var enumValues: Allow
}
object EnumValuesAllow {
  
  inline def apply(enumValues: Allow): EnumValuesAllow = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAllow]
  }
  
  extension [Self <: EnumValuesAllow](x: Self) {
    
    inline def setEnumValues(value: Allow): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
