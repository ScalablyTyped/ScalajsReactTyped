package typingsJapgolly.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesCancelledFailed extends StObject {
  
  var enumValues: CancelledFailed
}
object EnumValuesCancelledFailed {
  
  inline def apply(enumValues: CancelledFailed): EnumValuesCancelledFailed = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesCancelledFailed]
  }
  
  extension [Self <: EnumValuesCancelledFailed](x: Self) {
    
    inline def setEnumValues(value: CancelledFailed): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
