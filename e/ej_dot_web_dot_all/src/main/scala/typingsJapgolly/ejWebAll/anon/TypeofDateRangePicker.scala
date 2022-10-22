package typingsJapgolly.ejWebAll.anon

import typingsJapgolly.ejWebAll.ej.DateRangePicker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofDateRangePicker extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: DateRangePicker
}
object TypeofDateRangePicker {
  
  inline def apply(Locale: Any, fn: DateRangePicker): TypeofDateRangePicker = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofDateRangePicker]
  }
  
  extension [Self <: TypeofDateRangePicker](x: Self) {
    
    inline def setFn(value: DateRangePicker): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
