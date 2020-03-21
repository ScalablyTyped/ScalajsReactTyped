package typingsJapgolly.asymmetrikLeafletD3.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HexbinHoverHandler_ extends js.Object {
  def mouseout(hexLayer: HexbinLayer_, data: js.Any): Unit
  def mouseover(hexLayer: HexbinLayer_, data: js.Any): Unit
}

object HexbinHoverHandler_ {
  @scala.inline
  def apply(mouseout: (HexbinLayer_, js.Any) => Callback, mouseover: (HexbinLayer_, js.Any) => Callback): HexbinHoverHandler_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("mouseout")(js.Any.fromFunction2((t0: typingsJapgolly.asymmetrikLeafletD3.mod.HexbinLayer_, t1: js.Any) => mouseout(t0, t1).runNow()))
    __obj.updateDynamic("mouseover")(js.Any.fromFunction2((t0: typingsJapgolly.asymmetrikLeafletD3.mod.HexbinLayer_, t1: js.Any) => mouseover(t0, t1).runNow()))
    __obj.asInstanceOf[HexbinHoverHandler_]
  }
}

