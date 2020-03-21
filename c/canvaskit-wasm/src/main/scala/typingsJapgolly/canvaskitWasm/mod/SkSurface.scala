package typingsJapgolly.canvaskitWasm.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkSurface extends SkObject[SkSurface] {
  def captureFrameAsSkPicture(drawFrame: js.Function1[/* canvas */ SkCanvas, Unit]): SkPicture
  def dispose(): Unit
  def flush(): Unit
  def getCanvas(): SkCanvas
  def height(): Double
  def makeImageSnapshot(): SkImage
  def makeSurface(info: SkImageInfo): SkSurface
  def width(): Double
}

object SkSurface {
  @scala.inline
  def apply(
    captureFrameAsSkPicture: js.Function1[/* canvas */ SkCanvas, Unit] => CallbackTo[SkPicture],
    delete: Callback,
    deleteAfter: Callback,
    dispose: Callback,
    flush: Callback,
    getCanvas: CallbackTo[SkCanvas],
    height: CallbackTo[Double],
    isAliasOf: js.Any => CallbackTo[Boolean],
    isDeleted: CallbackTo[Boolean],
    makeImageSnapshot: CallbackTo[SkImage],
    makeSurface: SkImageInfo => CallbackTo[SkSurface],
    width: CallbackTo[Double]
  ): SkSurface = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("captureFrameAsSkPicture")(js.Any.fromFunction1((t0: js.Function1[/* canvas */ typingsJapgolly.canvaskitWasm.mod.SkCanvas, scala.Unit]) => captureFrameAsSkPicture(t0).runNow()))
    __obj.updateDynamic("delete")(delete.toJsFn)
    __obj.updateDynamic("deleteAfter")(deleteAfter.toJsFn)
    __obj.updateDynamic("dispose")(dispose.toJsFn)
    __obj.updateDynamic("flush")(flush.toJsFn)
    __obj.updateDynamic("getCanvas")(getCanvas.toJsFn)
    __obj.updateDynamic("height")(height.toJsFn)
    __obj.updateDynamic("isAliasOf")(js.Any.fromFunction1((t0: js.Any) => isAliasOf(t0).runNow()))
    __obj.updateDynamic("isDeleted")(isDeleted.toJsFn)
    __obj.updateDynamic("makeImageSnapshot")(makeImageSnapshot.toJsFn)
    __obj.updateDynamic("makeSurface")(js.Any.fromFunction1((t0: typingsJapgolly.canvaskitWasm.mod.SkImageInfo) => makeSurface(t0).runNow()))
    __obj.updateDynamic("width")(width.toJsFn)
    __obj.asInstanceOf[SkSurface]
  }
}

