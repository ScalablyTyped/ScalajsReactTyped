package typingsJapgolly.gaeaModel.FitGaea

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventActionCall extends js.Object {
  var functionName: js.UndefOr[String] = js.undefined
}

object EventActionCall {
  @scala.inline
  def apply(functionName: String = null): EventActionCall = {
    val __obj = js.Dynamic.literal()
    if (functionName != null) __obj.updateDynamic("functionName")(functionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventActionCall]
  }
}

