package typingsJapgolly.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesDeleted extends StObject {
  
  var enumValues: Deleted
}
object EnumValuesDeleted {
  
  inline def apply(enumValues: Deleted): EnumValuesDeleted = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesDeleted]
  }
  
  extension [Self <: EnumValuesDeleted](x: Self) {
    
    inline def setEnumValues(value: Deleted): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
