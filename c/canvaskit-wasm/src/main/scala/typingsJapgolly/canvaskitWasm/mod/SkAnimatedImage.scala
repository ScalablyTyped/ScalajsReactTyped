package typingsJapgolly.canvaskitWasm.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkAnimatedImage extends SkObject[SkAnimatedImage] {
  def decodeNextFrame(): Double
  def getFrameCount(): Double
  def getRepetitionCount(): Double
  def height(): Double
  def width(): Double
}

object SkAnimatedImage {
  @scala.inline
  def apply(
    decodeNextFrame: CallbackTo[Double],
    delete: Callback,
    deleteAfter: Callback,
    getFrameCount: CallbackTo[Double],
    getRepetitionCount: CallbackTo[Double],
    height: CallbackTo[Double],
    isAliasOf: js.Any => CallbackTo[Boolean],
    isDeleted: CallbackTo[Boolean],
    width: CallbackTo[Double]
  ): SkAnimatedImage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("decodeNextFrame")(decodeNextFrame.toJsFn)
    __obj.updateDynamic("delete")(delete.toJsFn)
    __obj.updateDynamic("deleteAfter")(deleteAfter.toJsFn)
    __obj.updateDynamic("getFrameCount")(getFrameCount.toJsFn)
    __obj.updateDynamic("getRepetitionCount")(getRepetitionCount.toJsFn)
    __obj.updateDynamic("height")(height.toJsFn)
    __obj.updateDynamic("isAliasOf")(js.Any.fromFunction1((t0: js.Any) => isAliasOf(t0).runNow()))
    __obj.updateDynamic("isDeleted")(isDeleted.toJsFn)
    __obj.updateDynamic("width")(width.toJsFn)
    __obj.asInstanceOf[SkAnimatedImage]
  }
}

