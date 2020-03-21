package typingsJapgolly.zrender

import japgolly.scalajs.react.Callback
import typingsJapgolly.zrender.zrender.ColorStops
import typingsJapgolly.zrender.zrender.GlobalCoords
import typingsJapgolly.zrender.zrender.X
import typingsJapgolly.zrender.zrender.X2
import typingsJapgolly.zrender.zrender.Y
import typingsJapgolly.zrender.zrender.Y2
import typingsJapgolly.zrender.zrenderStrings.linear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddColorStop extends js.Object {
  var colorStops: ColorStops
  var globalCoord: GlobalCoords
  var `type`: linear
  var x: X
  var x2: X2
  var y: Y
  var y2: Y2
  def addColorStop(offset: Double, color: String): Unit
}

object AnonAddColorStop {
  @scala.inline
  def apply(
    addColorStop: (Double, String) => Callback,
    colorStops: ColorStops,
    globalCoord: GlobalCoords,
    `type`: linear,
    x: X,
    x2: X2,
    y: Y,
    y2: Y2
  ): AnonAddColorStop = {
    val __obj = js.Dynamic.literal(colorStops = colorStops.asInstanceOf[js.Any], globalCoord = globalCoord.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.updateDynamic("addColorStop")(js.Any.fromFunction2((t0: scala.Double, t1: java.lang.String) => addColorStop(t0, t1).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAddColorStop]
  }
}

