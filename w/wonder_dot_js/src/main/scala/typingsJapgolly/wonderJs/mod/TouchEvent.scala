package typingsJapgolly.wonderJs.mod

import typingsJapgolly.wonderJs.ieventdataMod.ITouchEventData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015", "TouchEvent")
@js.native
class TouchEvent ()
  extends typingsJapgolly.wonderJs.touchEventMod.TouchEvent

/* static members */
@JSImport("wonder.js/dist/es2015", "TouchEvent")
@js.native
object TouchEvent extends js.Object {
  def create(event: ITouchEventData, eventName: typingsJapgolly.wonderJs.eventNameHandlerMod.EEventName): typingsJapgolly.wonderJs.touchEventMod.TouchEvent = js.native
}

