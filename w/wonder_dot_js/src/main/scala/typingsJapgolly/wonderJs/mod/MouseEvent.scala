package typingsJapgolly.wonderJs.mod

import typingsJapgolly.wonderJs.ieventdataMod.IMouseEventData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015", "MouseEvent")
@js.native
class MouseEvent ()
  extends typingsJapgolly.wonderJs.mouseEventMod.MouseEvent

/* static members */
@JSImport("wonder.js/dist/es2015", "MouseEvent")
@js.native
object MouseEvent extends js.Object {
  def create(event: IMouseEventData, eventName: typingsJapgolly.wonderJs.eventNameHandlerMod.EEventName): typingsJapgolly.wonderJs.mouseEventMod.MouseEvent = js.native
}

