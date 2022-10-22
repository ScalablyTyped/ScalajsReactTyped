package typingsJapgolly.dateFns

import typingsJapgolly.dateFns.anon.AdditionalDigits
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseISOMod {
  
  object default {
    
    inline def apply(argument: String): js.Date = ^.asInstanceOf[js.Dynamic].apply(argument.asInstanceOf[js.Any]).asInstanceOf[js.Date]
    inline def apply(argument: String, options: AdditionalDigits): js.Date = (^.asInstanceOf[js.Dynamic].apply(argument.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Date]
    
    @JSImport("date-fns/parseISO", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
