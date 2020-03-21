package typingsJapgolly.riotjsDomBindings.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IfBindingData
  extends BaseBindingData
     with BindingData {
  var template: TemplateChunk[_, _]
}

object IfBindingData {
  @scala.inline
  def apply(
    template: TemplateChunk[_, _],
    evaluate: /* scope */ js.Any => CallbackTo[js.Any] = null,
    redundantAttribute: String = null,
    selector: String = null,
    `type`: BindingType = null
  ): IfBindingData = {
    val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
    if (evaluate != null) __obj.updateDynamic("evaluate")(js.Any.fromFunction1((t0: /* scope */ js.Any) => evaluate(t0).runNow()))
    if (redundantAttribute != null) __obj.updateDynamic("redundantAttribute")(redundantAttribute.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IfBindingData]
  }
}

