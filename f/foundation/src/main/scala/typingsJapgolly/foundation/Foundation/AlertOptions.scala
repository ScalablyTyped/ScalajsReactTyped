package typingsJapgolly.foundation.Foundation

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/docs/components/alert_boxes.html
trait AlertOptions extends js.Object {
  var callback: js.UndefOr[js.Function0[_]] = js.undefined
}

object AlertOptions {
  @scala.inline
  def apply(callback: js.UndefOr[CallbackTo[js.Any]] = js.undefined): AlertOptions = {
    val __obj = js.Dynamic.literal()
    callback.foreach(p => __obj.updateDynamic("callback")(p.toJsFn))
    __obj.asInstanceOf[AlertOptions]
  }
}

