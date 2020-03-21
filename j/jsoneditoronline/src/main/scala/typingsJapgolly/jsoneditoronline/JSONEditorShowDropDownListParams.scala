package typingsJapgolly.jsoneditoronline

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONEditorShowDropDownListParams extends js.Object {
  var node: JSONEditorNode
  var optionClassName: String
  var optionSelectedClassName: String
  var value: String
  var values: js.Array[js.Object]
  var x: Double
  var y: Double
  def callback(value: js.Any): Unit
}

object JSONEditorShowDropDownListParams {
  @scala.inline
  def apply(
    callback: js.Any => Callback,
    node: JSONEditorNode,
    optionClassName: String,
    optionSelectedClassName: String,
    value: String,
    values: js.Array[js.Object],
    x: Double,
    y: Double
  ): JSONEditorShowDropDownListParams = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], optionClassName = optionClassName.asInstanceOf[js.Any], optionSelectedClassName = optionSelectedClassName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("callback")(js.Any.fromFunction1((t0: js.Any) => callback(t0).runNow()))
    __obj.asInstanceOf[JSONEditorShowDropDownListParams]
  }
}

