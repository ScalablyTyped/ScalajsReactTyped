package typingsJapgolly.jsfl

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// if FlashElement.elementType == 'instance'
trait FlashBitmapInstance extends js.Object {
  var hPixels: Double
  var vPixels: Double
  def getBits(): FlashBitmap
  def setBits(bitmap: FlashBitmap): Unit
}

object FlashBitmapInstance {
  @scala.inline
  def apply(
    getBits: CallbackTo[FlashBitmap],
    hPixels: Double,
    setBits: FlashBitmap => Callback,
    vPixels: Double
  ): FlashBitmapInstance = {
    val __obj = js.Dynamic.literal(hPixels = hPixels.asInstanceOf[js.Any], vPixels = vPixels.asInstanceOf[js.Any])
    __obj.updateDynamic("getBits")(getBits.toJsFn)
    __obj.updateDynamic("setBits")(js.Any.fromFunction1((t0: typingsJapgolly.jsfl.FlashBitmap) => setBits(t0).runNow()))
    __obj.asInstanceOf[FlashBitmapInstance]
  }
}

