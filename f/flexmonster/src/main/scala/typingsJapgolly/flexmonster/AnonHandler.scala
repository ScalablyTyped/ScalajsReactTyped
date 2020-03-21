package typingsJapgolly.flexmonster

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHandler extends js.Object {
  var handler: js.UndefOr[js.Function0[Unit]] = js.undefined
  var label: String
}

object AnonHandler {
  @scala.inline
  def apply(label: String, handler: js.UndefOr[Callback] = js.undefined): AnonHandler = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    handler.foreach(p => __obj.updateDynamic("handler")(p.toJsFn))
    __obj.asInstanceOf[AnonHandler]
  }
}

