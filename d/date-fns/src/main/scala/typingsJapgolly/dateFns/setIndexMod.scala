package typingsJapgolly.dateFns

import typingsJapgolly.dateFns.anon.Hours
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setIndexMod {
  
  object default {
    
    inline def apply(date: js.Date, values: Hours): js.Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Date]
    inline def apply(date: Double, values: Hours): js.Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Date]
    
    @JSImport("date-fns/set/index", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
