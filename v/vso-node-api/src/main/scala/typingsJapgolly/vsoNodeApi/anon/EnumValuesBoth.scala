package typingsJapgolly.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesBoth extends StObject {
  
  var enumValues: Both
}
object EnumValuesBoth {
  
  inline def apply(enumValues: Both): EnumValuesBoth = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesBoth]
  }
  
  extension [Self <: EnumValuesBoth](x: Self) {
    
    inline def setEnumValues(value: Both): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
