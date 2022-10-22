package typingsJapgolly.gapiCalendar.anon

import typingsJapgolly.gapiCalendar.gapi.client.calendar.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Minutes extends StObject {
  
  var method: String
  
  var minutes: integer
}
object Minutes {
  
  inline def apply(method: String, minutes: integer): Minutes = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Minutes]
  }
  
  extension [Self <: Minutes](x: Self) {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMinutes(value: integer): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
  }
}
