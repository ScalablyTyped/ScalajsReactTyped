package typingsJapgolly.terminalKit.rectMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rect extends js.Object {
  val height: Double
  val isNull: Boolean
  val width: Double
  val xmax: Double
  val xmin: Double
  val ymax: Double
  val ymin: Double
  def clip(dstRect: Rect, offsetX: Double, offsetY: Double, dstClipping: Boolean): Unit
  def set(obj: Region): Unit
}

object Rect {
  @scala.inline
  def apply(
    clip: (Rect, Double, Double, Boolean) => Callback,
    height: Double,
    isNull: Boolean,
    set: Region => Callback,
    width: Double,
    xmax: Double,
    xmin: Double,
    ymax: Double,
    ymin: Double
  ): Rect = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], isNull = isNull.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], xmax = xmax.asInstanceOf[js.Any], xmin = xmin.asInstanceOf[js.Any], ymax = ymax.asInstanceOf[js.Any], ymin = ymin.asInstanceOf[js.Any])
    __obj.updateDynamic("clip")(js.Any.fromFunction4((t0: typingsJapgolly.terminalKit.rectMod.Rect, t1: scala.Double, t2: scala.Double, t3: scala.Boolean) => clip(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction1((t0: typingsJapgolly.terminalKit.rectMod.Region) => set(t0).runNow()))
    __obj.asInstanceOf[Rect]
  }
}

