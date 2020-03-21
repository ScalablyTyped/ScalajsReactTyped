package typingsJapgolly.winrt.Windows.Graphics.Imaging

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPixelDataProvider extends js.Object {
  def detachPixelData(): scala.scalajs.js.typedarray.Uint8Array
}

object IPixelDataProvider {
  @scala.inline
  def apply(detachPixelData: CallbackTo[scala.scalajs.js.typedarray.Uint8Array]): IPixelDataProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("detachPixelData")(detachPixelData.toJsFn)
    __obj.asInstanceOf[IPixelDataProvider]
  }
}

