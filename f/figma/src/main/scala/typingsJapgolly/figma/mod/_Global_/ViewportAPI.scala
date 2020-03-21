package typingsJapgolly.figma.mod._Global_

import japgolly.scalajs.react.Callback
import typingsJapgolly.figma.AnonX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewportAPI extends js.Object {
  var center: AnonX
  var zoom: Double
  def scrollAndZoomIntoView(nodes: js.Array[BaseNode]): Unit
}

object ViewportAPI {
  @scala.inline
  def apply(center: AnonX, scrollAndZoomIntoView: js.Array[BaseNode] => Callback, zoom: Double): ViewportAPI = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.updateDynamic("scrollAndZoomIntoView")(js.Any.fromFunction1((t0: js.Array[typingsJapgolly.figma.mod._Global_.BaseNode]) => scrollAndZoomIntoView(t0).runNow()))
    __obj.asInstanceOf[ViewportAPI]
  }
}

