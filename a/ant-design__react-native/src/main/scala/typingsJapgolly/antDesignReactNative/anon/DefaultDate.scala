package typingsJapgolly.antDesignReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultDate extends StObject {
  
  var date: Any
  
  var defaultDate: Any
}
object DefaultDate {
  
  inline def apply(date: Any, defaultDate: Any): DefaultDate = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], defaultDate = defaultDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultDate]
  }
  
  extension [Self <: DefaultDate](x: Self) {
    
    inline def setDate(value: Any): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDefaultDate(value: Any): Self = StObject.set(x, "defaultDate", value.asInstanceOf[js.Any])
  }
}
