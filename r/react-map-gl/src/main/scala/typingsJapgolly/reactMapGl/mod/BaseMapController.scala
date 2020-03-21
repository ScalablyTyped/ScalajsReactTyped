package typingsJapgolly.reactMapGl.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseMapController extends js.Object {
  var events: js.Array[String]
  def handleEvent(event: MapControlEvent): Unit
}

object BaseMapController {
  @scala.inline
  def apply(events: js.Array[String], handleEvent: MapControlEvent => Callback): BaseMapController = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any])
    __obj.updateDynamic("handleEvent")(js.Any.fromFunction1((t0: typingsJapgolly.reactMapGl.mod.MapControlEvent) => handleEvent(t0).runNow()))
    __obj.asInstanceOf[BaseMapController]
  }
}

