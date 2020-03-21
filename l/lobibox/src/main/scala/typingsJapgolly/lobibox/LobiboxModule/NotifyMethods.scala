package typingsJapgolly.lobibox.LobiboxModule

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotifyMethods extends js.Object {
  var remove: js.UndefOr[js.Function0[_]] = js.undefined
}

object NotifyMethods {
  @scala.inline
  def apply(remove: js.UndefOr[CallbackTo[js.Any]] = js.undefined): NotifyMethods = {
    val __obj = js.Dynamic.literal()
    remove.foreach(p => __obj.updateDynamic("remove")(p.toJsFn))
    __obj.asInstanceOf[NotifyMethods]
  }
}

