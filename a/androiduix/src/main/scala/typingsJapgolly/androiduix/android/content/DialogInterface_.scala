package typingsJapgolly.androiduix.android.content

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogInterface_ extends js.Object {
  def cancel(): Unit
  def dismiss(): Unit
}

object DialogInterface_ {
  @scala.inline
  def apply(cancel: Callback, dismiss: Callback): DialogInterface_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel.toJsFn)
    __obj.updateDynamic("dismiss")(dismiss.toJsFn)
    __obj.asInstanceOf[DialogInterface_]
  }
}

