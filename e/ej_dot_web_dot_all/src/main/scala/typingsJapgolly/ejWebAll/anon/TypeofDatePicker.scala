package typingsJapgolly.ejWebAll.anon

import typingsJapgolly.ejWebAll.ej.DatePicker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofDatePicker extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: DatePicker
}
object TypeofDatePicker {
  
  inline def apply(Locale: Any, fn: DatePicker): TypeofDatePicker = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofDatePicker]
  }
  
  extension [Self <: TypeofDatePicker](x: Self) {
    
    inline def setFn(value: DatePicker): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
