package typingsJapgolly.hapiJoi.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleArgs extends js.Object {
  var assert: js.UndefOr[(js.Function1[/* value */ js.Any, Boolean]) | AnySchema] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var name: String
  /**
    * Undocumented properties
    */
  var normalize: js.UndefOr[js.Function1[/* value */ js.Any, _]] = js.undefined
  var ref: js.UndefOr[Boolean] = js.undefined
}

object RuleArgs {
  @scala.inline
  def apply(
    name: String,
    assert: (js.Function1[/* value */ js.Any, Boolean]) | AnySchema = null,
    message: String = null,
    normalize: /* value */ js.Any => CallbackTo[js.Any] = null,
    ref: js.UndefOr[Boolean] = js.undefined
  ): RuleArgs = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (assert != null) __obj.updateDynamic("assert")(assert.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (normalize != null) __obj.updateDynamic("normalize")(js.Any.fromFunction1((t0: /* value */ js.Any) => normalize(t0).runNow()))
    if (!js.isUndefined(ref)) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleArgs]
  }
}

