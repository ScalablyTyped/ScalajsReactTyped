package typingsJapgolly.riotjsDomBindings.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseBindingData extends js.Object {
  var evaluate: js.UndefOr[js.Function1[/* scope */ js.Any, _]] = js.undefined
  var redundantAttribute: js.UndefOr[String] = js.undefined
  var selector: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[BindingType] = js.undefined
}

object BaseBindingData {
  @scala.inline
  def apply(
    evaluate: /* scope */ js.Any => CallbackTo[js.Any] = null,
    redundantAttribute: String = null,
    selector: String = null,
    `type`: BindingType = null
  ): BaseBindingData = {
    val __obj = js.Dynamic.literal()
    if (evaluate != null) __obj.updateDynamic("evaluate")(js.Any.fromFunction1((t0: /* scope */ js.Any) => evaluate(t0).runNow()))
    if (redundantAttribute != null) __obj.updateDynamic("redundantAttribute")(redundantAttribute.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseBindingData]
  }
}

