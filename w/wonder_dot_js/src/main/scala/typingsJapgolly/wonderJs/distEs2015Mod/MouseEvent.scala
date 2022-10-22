package typingsJapgolly.wonderJs.distEs2015Mod

import typingsJapgolly.wonderJs.distEs2015EventInterfaceIeventdataMod.IMouseEventData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder.js/dist/es2015", "MouseEvent")
@js.native
open class MouseEvent protected ()
  extends typingsJapgolly.wonderJs.distEs2015EventObjectMouseEventMod.MouseEvent {
  def this(
    event: Any,
    eventName: typingsJapgolly.wonderJs.distEs2015EventObjectEventNameHandlerMod.EEventName
  ) = this()
}
/* static members */
object MouseEvent {
  
  @JSImport("wonder.js/dist/es2015", "MouseEvent")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(
    event: IMouseEventData,
    eventName: typingsJapgolly.wonderJs.distEs2015EventObjectEventNameHandlerMod.EEventName
  ): typingsJapgolly.wonderJs.distEs2015EventObjectMouseEventMod.MouseEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(event.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.wonderJs.distEs2015EventObjectMouseEventMod.MouseEvent]
}
