package typingsJapgolly.wonderJs.distEs2015Mod

import typingsJapgolly.wonderJs.distEs2015EventInterfaceIeventdataMod.ITouchEventData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder.js/dist/es2015", "TouchEvent")
@js.native
open class TouchEvent protected ()
  extends typingsJapgolly.wonderJs.distEs2015EventObjectTouchEventMod.TouchEvent {
  def this(
    event: Any,
    eventName: typingsJapgolly.wonderJs.distEs2015EventObjectEventNameHandlerMod.EEventName
  ) = this()
}
/* static members */
object TouchEvent {
  
  @JSImport("wonder.js/dist/es2015", "TouchEvent")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(
    event: ITouchEventData,
    eventName: typingsJapgolly.wonderJs.distEs2015EventObjectEventNameHandlerMod.EEventName
  ): typingsJapgolly.wonderJs.distEs2015EventObjectTouchEventMod.TouchEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(event.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.wonderJs.distEs2015EventObjectTouchEventMod.TouchEvent]
}
