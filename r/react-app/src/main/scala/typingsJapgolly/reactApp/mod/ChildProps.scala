package typingsJapgolly.reactApp.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChildProps extends js.Object {
  var path: String
  def action(params: js.Any): js.Any
}

object ChildProps {
  @scala.inline
  def apply(action: js.Any => CallbackTo[js.Any], path: String): ChildProps = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("action")(js.Any.fromFunction1((t0: js.Any) => action(t0).runNow()))
    __obj.asInstanceOf[ChildProps]
  }
}

