package typingsJapgolly.waypoints

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFindByElement extends js.Object {
  def findByElement(element: HTMLElement): js.UndefOr[WaypointContext]
}

object AnonFindByElement {
  @scala.inline
  def apply(findByElement: HTMLElement => CallbackTo[js.UndefOr[WaypointContext]]): AnonFindByElement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("findByElement")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.HTMLElement) => findByElement(t0).runNow()))
    __obj.asInstanceOf[AnonFindByElement]
  }
}

