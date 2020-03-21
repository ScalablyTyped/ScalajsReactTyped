package typingsJapgolly.reactMailchimpSubscribe.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props[FormFields] extends js.Object {
  var render: js.UndefOr[js.Function1[/* hooks */ FormHooks[FormFields], Node]] = js.undefined
  var url: String
}

object Props {
  @scala.inline
  def apply[FormFields](url: String, render: /* hooks */ FormHooks[FormFields] => CallbackTo[Node] = null): Props[FormFields] = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1((t0: /* hooks */ typingsJapgolly.reactMailchimpSubscribe.mod.FormHooks[FormFields]) => render(t0).runNow()))
    __obj.asInstanceOf[Props[FormFields]]
  }
}

