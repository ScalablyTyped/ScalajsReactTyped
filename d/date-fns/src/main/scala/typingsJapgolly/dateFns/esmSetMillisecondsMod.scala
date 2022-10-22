package typingsJapgolly.dateFns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmSetMillisecondsMod {
  
  object default {
    
    inline def apply(date: js.Date, milliseconds: Double): js.Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], milliseconds.asInstanceOf[js.Any])).asInstanceOf[js.Date]
    inline def apply(date: Double, milliseconds: Double): js.Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], milliseconds.asInstanceOf[js.Any])).asInstanceOf[js.Date]
    
    @JSImport("date-fns/esm/setMilliseconds", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
