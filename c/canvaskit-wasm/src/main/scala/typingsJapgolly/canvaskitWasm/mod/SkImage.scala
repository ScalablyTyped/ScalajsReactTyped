package typingsJapgolly.canvaskitWasm.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkImage extends SkObject[SkImage] {
  def encodeToData(): SkData
  def height(): Double
  def readPixels(info: SkImageInfo, srcX: Double, srcY: Double): scala.scalajs.js.typedarray.Uint8Array | scala.scalajs.js.typedarray.Float32Array | Null
  def width(): Double
}

object SkImage {
  @scala.inline
  def apply(
    delete: Callback,
    deleteAfter: Callback,
    encodeToData: CallbackTo[SkData],
    height: CallbackTo[Double],
    isAliasOf: js.Any => CallbackTo[Boolean],
    isDeleted: CallbackTo[Boolean],
    readPixels: (SkImageInfo, Double, Double) => CallbackTo[
      scala.scalajs.js.typedarray.Uint8Array | scala.scalajs.js.typedarray.Float32Array | Null
    ],
    width: CallbackTo[Double]
  ): SkImage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(delete.toJsFn)
    __obj.updateDynamic("deleteAfter")(deleteAfter.toJsFn)
    __obj.updateDynamic("encodeToData")(encodeToData.toJsFn)
    __obj.updateDynamic("height")(height.toJsFn)
    __obj.updateDynamic("isAliasOf")(js.Any.fromFunction1((t0: js.Any) => isAliasOf(t0).runNow()))
    __obj.updateDynamic("isDeleted")(isDeleted.toJsFn)
    __obj.updateDynamic("readPixels")(js.Any.fromFunction3((t0: typingsJapgolly.canvaskitWasm.mod.SkImageInfo, t1: scala.Double, t2: scala.Double) => readPixels(t0, t1, t2).runNow()))
    __obj.updateDynamic("width")(width.toJsFn)
    __obj.asInstanceOf[SkImage]
  }
}

