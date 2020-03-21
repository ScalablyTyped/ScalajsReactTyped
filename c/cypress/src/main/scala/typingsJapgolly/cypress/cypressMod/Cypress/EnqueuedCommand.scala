package typingsJapgolly.cypress.cypressMod.Cypress

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnqueuedCommand extends js.Object {
  var args: js.Array[_]
  var chainerId: String
  var name: String
  var `type`: String
  def fn(args: js.Any*): js.Any
}

object EnqueuedCommand {
  @scala.inline
  def apply(
    args: js.Array[_],
    chainerId: String,
    fn: /* repeated */ js.Any => CallbackTo[js.Any],
    name: String,
    `type`: String
  ): EnqueuedCommand = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], chainerId = chainerId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("fn")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => fn(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnqueuedCommand]
  }
}

