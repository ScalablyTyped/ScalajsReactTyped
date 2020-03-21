package typingsJapgolly.reactIntlRedux.mod

import typingsJapgolly.redux.mod.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntlAction
  extends Action[js.Any] {
  var payload: js.UndefOr[IntlState] = js.undefined
}

object IntlAction {
  @scala.inline
  def apply(`type`: js.Any, payload: IntlState = null): IntlAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntlAction]
  }
}

