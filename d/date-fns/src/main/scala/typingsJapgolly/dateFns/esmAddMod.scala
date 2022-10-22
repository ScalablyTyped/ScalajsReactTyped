package typingsJapgolly.dateFns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmAddMod {
  
  object default {
    
    inline def apply(date: js.Date, duration: typingsJapgolly.dateFns.mod.Duration | Duration): js.Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[js.Date]
    inline def apply(date: Double, duration: typingsJapgolly.dateFns.mod.Duration | Duration): js.Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[js.Date]
    
    @JSImport("date-fns/esm/add", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
