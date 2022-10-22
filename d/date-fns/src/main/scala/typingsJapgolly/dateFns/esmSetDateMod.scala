package typingsJapgolly.dateFns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmSetDateMod {
  
  object default {
    
    inline def apply(date: js.Date, dayOfMonth: Double): js.Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any])).asInstanceOf[js.Date]
    inline def apply(date: Double, dayOfMonth: Double): js.Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any])).asInstanceOf[js.Date]
    
    @JSImport("date-fns/esm/setDate", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
