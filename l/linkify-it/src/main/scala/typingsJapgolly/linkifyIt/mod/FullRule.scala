package typingsJapgolly.linkifyIt.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FullRule extends js.Object {
  var normalize: js.UndefOr[js.Function1[/* match */ Match, Unit]] = js.undefined
  var validate: String | js.RegExp | Validate
}

object FullRule {
  @scala.inline
  def apply(validate: String | js.RegExp | Validate, normalize: /* match */ Match => Callback = null): FullRule = {
    val __obj = js.Dynamic.literal(validate = validate.asInstanceOf[js.Any])
    if (normalize != null) __obj.updateDynamic("normalize")(js.Any.fromFunction1((t0: /* match */ typingsJapgolly.linkifyIt.mod.Match) => normalize(t0).runNow()))
    __obj.asInstanceOf[FullRule]
  }
}

