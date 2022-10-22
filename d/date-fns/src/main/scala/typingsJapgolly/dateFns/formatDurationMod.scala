package typingsJapgolly.dateFns

import typingsJapgolly.dateFns.anon.Delimiter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatDurationMod {
  
  object default {
    
    inline def apply(duration: typingsJapgolly.dateFns.mod.Duration): String = ^.asInstanceOf[js.Dynamic].apply(duration.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def apply(duration: typingsJapgolly.dateFns.mod.Duration, options: Delimiter): String = (^.asInstanceOf[js.Dynamic].apply(duration.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("date-fns/formatDuration", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
