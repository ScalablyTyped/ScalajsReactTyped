package typingsJapgolly.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesOffline extends StObject {
  
  var enumValues: Offline
}
object EnumValuesOffline {
  
  inline def apply(enumValues: Offline): EnumValuesOffline = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesOffline]
  }
  
  extension [Self <: EnumValuesOffline](x: Self) {
    
    inline def setEnumValues(value: Offline): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
