package typingsJapgolly.riotjsDomBindings.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagBindingData
  extends BaseBindingData
     with BindingData {
  var attributes: js.Array[AttributeExpressionData]
  var slots: js.Array[SlotBindingData]
  def getComponent(name: String): TemplateChunk[_, _]
}

object TagBindingData {
  @scala.inline
  def apply(
    attributes: js.Array[AttributeExpressionData],
    getComponent: String => CallbackTo[TemplateChunk[js.Any, js.Any]],
    slots: js.Array[SlotBindingData],
    evaluate: /* scope */ js.Any => CallbackTo[js.Any] = null,
    redundantAttribute: String = null,
    selector: String = null,
    `type`: BindingType = null
  ): TagBindingData = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any])
    __obj.updateDynamic("getComponent")(js.Any.fromFunction1((t0: java.lang.String) => getComponent(t0).runNow()))
    if (evaluate != null) __obj.updateDynamic("evaluate")(js.Any.fromFunction1((t0: /* scope */ js.Any) => evaluate(t0).runNow()))
    if (redundantAttribute != null) __obj.updateDynamic("redundantAttribute")(redundantAttribute.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagBindingData]
  }
}

