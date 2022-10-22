package typingsJapgolly.sentryTypes.anon

import typingsJapgolly.sentryTypes.typesExceptionMod.Exception
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Values extends StObject {
  
  var values: js.UndefOr[js.Array[Exception]] = js.undefined
}
object Values {
  
  inline def apply(): Values = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Values]
  }
  
  extension [Self <: Values](x: Self) {
    
    inline def setValues(value: js.Array[Exception]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: Exception*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
