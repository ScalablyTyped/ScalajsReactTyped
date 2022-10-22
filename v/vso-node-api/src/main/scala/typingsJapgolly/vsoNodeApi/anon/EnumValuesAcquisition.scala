package typingsJapgolly.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesAcquisition extends StObject {
  
  var enumValues: Acquisition
}
object EnumValuesAcquisition {
  
  inline def apply(enumValues: Acquisition): EnumValuesAcquisition = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAcquisition]
  }
  
  extension [Self <: EnumValuesAcquisition](x: Self) {
    
    inline def setEnumValues(value: Acquisition): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
