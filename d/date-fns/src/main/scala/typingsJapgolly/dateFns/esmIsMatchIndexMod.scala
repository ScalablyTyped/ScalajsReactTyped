package typingsJapgolly.dateFns

import typingsJapgolly.dateFns.anon.UseAdditionalWeekYearTokensWeekStartsOn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmIsMatchIndexMod {
  
  object default {
    
    inline def apply(dateString: String, formatString: String): Boolean = (^.asInstanceOf[js.Dynamic].apply(dateString.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def apply(dateString: String, formatString: String, options: UseAdditionalWeekYearTokensWeekStartsOn): Boolean = (^.asInstanceOf[js.Dynamic].apply(dateString.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @JSImport("date-fns/esm/isMatch/index", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
