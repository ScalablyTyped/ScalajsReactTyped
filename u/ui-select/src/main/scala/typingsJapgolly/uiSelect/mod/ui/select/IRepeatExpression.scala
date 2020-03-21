package typingsJapgolly.uiSelect.mod.ui.select

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRepeatExpression extends js.Object {
  var filters: String
  var itemName: String
  var keyName: String
  var modelMapper: String
  var source: String
  var trackByExp: String
  def repeatExpression(grouped: Boolean): String
}

object IRepeatExpression {
  @scala.inline
  def apply(
    filters: String,
    itemName: String,
    keyName: String,
    modelMapper: String,
    repeatExpression: Boolean => CallbackTo[String],
    source: String,
    trackByExp: String
  ): IRepeatExpression = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any], itemName = itemName.asInstanceOf[js.Any], keyName = keyName.asInstanceOf[js.Any], modelMapper = modelMapper.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], trackByExp = trackByExp.asInstanceOf[js.Any])
    __obj.updateDynamic("repeatExpression")(js.Any.fromFunction1((t0: scala.Boolean) => repeatExpression(t0).runNow()))
    __obj.asInstanceOf[IRepeatExpression]
  }
}

