package typingsJapgolly.rrule

import typingsJapgolly.rrule.anon.PartialIterArgs
import typingsJapgolly.rrule.rruleStrings.all
import typingsJapgolly.rrule.rruleStrings.between
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmCallbackiterresultMod {
  
  @JSImport("rrule/dist/esm/callbackiterresult", JSImport.Default)
  @js.native
  open class default protected () extends CallbackIterResult {
    def this(method: all | between, args: PartialIterArgs, iterator: Iterator) = this()
  }
  
  @js.native
  trait CallbackIterResult
    extends typingsJapgolly.rrule.distEsmIterresultMod.default[all | between] {
    
    /* private */ var iterator: Any = js.native
  }
  
  type Iterator = js.Function2[/* d */ js.Date, /* len */ Double, Boolean]
}
