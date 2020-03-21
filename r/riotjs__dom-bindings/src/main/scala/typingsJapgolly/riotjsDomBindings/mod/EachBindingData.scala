package typingsJapgolly.riotjsDomBindings.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EachBindingData
  extends BaseBindingData
     with BindingData {
  var condition: js.UndefOr[(js.Function1[/* scope */ js.Any, _]) | Null] = js.undefined
  var getKey: js.UndefOr[(js.Function1[/* scope */ js.Any, _]) | Null] = js.undefined
  var indexName: js.UndefOr[Double] = js.undefined
  var itemName: String
  var template: TemplateChunk[_, _]
}

object EachBindingData {
  @scala.inline
  def apply(
    itemName: String,
    template: TemplateChunk[_, _],
    condition: /* scope */ js.Any => CallbackTo[js.Any] = null,
    evaluate: /* scope */ js.Any => CallbackTo[js.Any] = null,
    getKey: /* scope */ js.Any => CallbackTo[js.Any] = null,
    indexName: Int | Double = null,
    redundantAttribute: String = null,
    selector: String = null,
    `type`: BindingType = null
  ): EachBindingData = {
    val __obj = js.Dynamic.literal(itemName = itemName.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    if (condition != null) __obj.updateDynamic("condition")(js.Any.fromFunction1((t0: /* scope */ js.Any) => condition(t0).runNow()))
    if (evaluate != null) __obj.updateDynamic("evaluate")(js.Any.fromFunction1((t0: /* scope */ js.Any) => evaluate(t0).runNow()))
    if (getKey != null) __obj.updateDynamic("getKey")(js.Any.fromFunction1((t0: /* scope */ js.Any) => getKey(t0).runNow()))
    if (indexName != null) __obj.updateDynamic("indexName")(indexName.asInstanceOf[js.Any])
    if (redundantAttribute != null) __obj.updateDynamic("redundantAttribute")(redundantAttribute.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EachBindingData]
  }
}

