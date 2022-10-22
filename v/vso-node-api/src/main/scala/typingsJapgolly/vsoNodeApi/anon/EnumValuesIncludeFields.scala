package typingsJapgolly.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesIncludeFields extends StObject {
  
  var enumValues: IncludeFields
}
object EnumValuesIncludeFields {
  
  inline def apply(enumValues: IncludeFields): EnumValuesIncludeFields = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesIncludeFields]
  }
  
  extension [Self <: EnumValuesIncludeFields](x: Self) {
    
    inline def setEnumValues(value: IncludeFields): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
