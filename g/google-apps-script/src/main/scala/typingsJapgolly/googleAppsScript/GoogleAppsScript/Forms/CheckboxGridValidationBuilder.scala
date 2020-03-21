package typingsJapgolly.googleAppsScript.GoogleAppsScript.Forms

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A DataValidationBuilder for a CheckboxGridValidation.
  *
  *     // Add a checkbox grid item to a form and restrict it to one response per column.
  *     var checkboxGridItem = form.addCheckboxGridItem();
  *     checkboxGridItem.setTitle('Where did you celebrate New Years?')
  *       .setRows(['New York', 'San Francisco', 'London'])
  *       .setColumns(['2014', '2015', '2016', '2017']);
  *     var checkboxGridValidation = FormApp.createcheckboxGridValidation()
  *       .setHelpText(“Select one item per column.”)
  *       .requireLimitOneResponsePerColumn()
  *       .build();
  *     checkboxGridItem.setValidation(checkboxGridValidation);
  */
trait CheckboxGridValidationBuilder extends js.Object {
  def requireLimitOneResponsePerColumn(): CheckboxGridValidationBuilder
}

object CheckboxGridValidationBuilder {
  @scala.inline
  def apply(requireLimitOneResponsePerColumn: CallbackTo[CheckboxGridValidationBuilder]): CheckboxGridValidationBuilder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("requireLimitOneResponsePerColumn")(requireLimitOneResponsePerColumn.toJsFn)
    __obj.asInstanceOf[CheckboxGridValidationBuilder]
  }
}

