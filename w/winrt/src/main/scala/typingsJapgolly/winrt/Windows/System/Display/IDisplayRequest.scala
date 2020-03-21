package typingsJapgolly.winrt.Windows.System.Display

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDisplayRequest extends js.Object {
  def requestActive(): Unit
  def requestRelease(): Unit
}

object IDisplayRequest {
  @scala.inline
  def apply(requestActive: Callback, requestRelease: Callback): IDisplayRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("requestActive")(requestActive.toJsFn)
    __obj.updateDynamic("requestRelease")(requestRelease.toJsFn)
    __obj.asInstanceOf[IDisplayRequest]
  }
}

