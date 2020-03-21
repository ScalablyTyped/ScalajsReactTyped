package typingsJapgolly.storybookComponents.toolbarMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZoomProps extends js.Object {
  def resetZoom(): Unit = js.native
  def zoom(`val`: Double): Unit = js.native
}

object ZoomProps {
  @scala.inline
  def apply(resetZoom: Callback, zoom: Double => Callback): ZoomProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("resetZoom")(resetZoom.toJsFn)
    __obj.updateDynamic("zoom")(js.Any.fromFunction1((t0: scala.Double) => zoom(t0).runNow()))
    __obj.asInstanceOf[ZoomProps]
  }
}

