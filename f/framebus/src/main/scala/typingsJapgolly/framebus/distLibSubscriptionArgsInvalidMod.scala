package typingsJapgolly.framebus

import typingsJapgolly.framebus.distLibTypesMod.FramebusOnHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibSubscriptionArgsInvalidMod {
  
  @JSImport("framebus/dist/lib/subscription-args-invalid", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def subscriptionArgsInvalid(event: String, fn: FramebusOnHandler, origin: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("subscriptionArgsInvalid")(event.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
