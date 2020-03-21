package typingsJapgolly.canvaskitWasm.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkAnimation extends SkObject[SkAnimation] {
  def duration(): Double
  def fps(): Double
  def render(canvas: SkCanvas, bounds: SkRect): Unit
  def seek(time: Double): Unit
  def seekFrame(frame: Double): Unit
  def size(): SkSize
  def version(): String
}

object SkAnimation {
  @scala.inline
  def apply(
    delete: Callback,
    deleteAfter: Callback,
    duration: CallbackTo[Double],
    fps: CallbackTo[Double],
    isAliasOf: js.Any => CallbackTo[Boolean],
    isDeleted: CallbackTo[Boolean],
    render: (SkCanvas, SkRect) => Callback,
    seek: Double => Callback,
    seekFrame: Double => Callback,
    size: CallbackTo[SkSize],
    version: CallbackTo[String]
  ): SkAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(delete.toJsFn)
    __obj.updateDynamic("deleteAfter")(deleteAfter.toJsFn)
    __obj.updateDynamic("duration")(duration.toJsFn)
    __obj.updateDynamic("fps")(fps.toJsFn)
    __obj.updateDynamic("isAliasOf")(js.Any.fromFunction1((t0: js.Any) => isAliasOf(t0).runNow()))
    __obj.updateDynamic("isDeleted")(isDeleted.toJsFn)
    __obj.updateDynamic("render")(js.Any.fromFunction2((t0: typingsJapgolly.canvaskitWasm.mod.SkCanvas, t1: typingsJapgolly.canvaskitWasm.mod.SkRect) => render(t0, t1).runNow()))
    __obj.updateDynamic("seek")(js.Any.fromFunction1((t0: scala.Double) => seek(t0).runNow()))
    __obj.updateDynamic("seekFrame")(js.Any.fromFunction1((t0: scala.Double) => seekFrame(t0).runNow()))
    __obj.updateDynamic("size")(size.toJsFn)
    __obj.updateDynamic("version")(version.toJsFn)
    __obj.asInstanceOf[SkAnimation]
  }
}

