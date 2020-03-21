package typingsJapgolly.gaeaModel.FitGaea

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.gaeaModel.AnonCurrentUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentPropsOptionsArray extends ComponentPropsGaeaEdit {
  var key: String
}

object ComponentPropsOptionsArray {
  @scala.inline
  def apply(
    editable: Boolean,
    editor: String,
    field: String,
    hideTool: Boolean,
    key: String,
    label: String,
    array: js.Array[ComponentPropsOptionsArrayValue] = null,
    emptyValue: js.Any = null,
    instance: js.Array[StringDictionary[ComponentPropsOptionValue]] = null,
    number: AnonCurrentUnit = null,
    selector: js.Array[ComponentPropsOptionsSelector] = null,
    `type`: String = null
  ): ComponentPropsOptionsArray = {
    val __obj = js.Dynamic.literal(editable = editable.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], hideTool = hideTool.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    if (array != null) __obj.updateDynamic("array")(array.asInstanceOf[js.Any])
    if (emptyValue != null) __obj.updateDynamic("emptyValue")(emptyValue.asInstanceOf[js.Any])
    if (instance != null) __obj.updateDynamic("instance")(instance.asInstanceOf[js.Any])
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentPropsOptionsArray]
  }
}

