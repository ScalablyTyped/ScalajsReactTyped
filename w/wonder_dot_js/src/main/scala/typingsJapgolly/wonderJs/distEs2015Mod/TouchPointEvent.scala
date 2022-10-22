package typingsJapgolly.wonderJs.distEs2015Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder.js/dist/es2015", "TouchPointEvent")
@js.native
open class TouchPointEvent protected ()
  extends typingsJapgolly.wonderJs.distEs2015EventObjectTouchPointEventMod.TouchPointEvent {
  def this(
    event: Any,
    eventName: typingsJapgolly.wonderJs.distEs2015EventObjectEventNameHandlerMod.EEventName
  ) = this()
}
/* static members */
object TouchPointEvent {
  
  @JSImport("wonder.js/dist/es2015", "TouchPointEvent")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(eventName: typingsJapgolly.wonderJs.distEs2015EventObjectEventNameHandlerMod.EEventName): typingsJapgolly.wonderJs.distEs2015EventObjectTouchPointEventMod.TouchPointEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(eventName.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.wonderJs.distEs2015EventObjectTouchPointEventMod.TouchPointEvent]
}
