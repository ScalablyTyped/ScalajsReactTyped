package typingsJapgolly.googleAppsScript.GoogleAppsScript.Forms

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A DataValidation for a CheckboxItem.
  *
  *     // Add a checkBox item to a form and require exactly two selections.
  *     var checkBoxItem = form.addCheckboxItem();
  *     checkBoxItem.setTitle('What two condiments would you like on your hot dog?');
  *     checkBoxItem.setChoices([
  *       checkBoxItem.createChoice('Ketchup'),
  *       checkBoxItem.createChoice('Mustard'),
  *       checkBoxItem.createChoice('Relish')
  *     ]);
  *     var checkBoxValidation = FormApp.createCheckboxValidation()
  *       .setHelpText(“Select two condiments.”)
  *       .requireSelectExactly(2)
  *       .build();
  *     checkBoxItem.setValidation(checkBoxValidation);
  */
trait CheckboxValidation extends js.Object {
  def requireSelectAtLeast(number: Integer): CheckboxValidation
  def requireSelectAtMost(number: Integer): CheckboxValidation
  def requireSelectExactly(number: Integer): CheckboxValidation
}

object CheckboxValidation {
  @scala.inline
  def apply(
    requireSelectAtLeast: Integer => CallbackTo[CheckboxValidation],
    requireSelectAtMost: Integer => CallbackTo[CheckboxValidation],
    requireSelectExactly: Integer => CallbackTo[CheckboxValidation]
  ): CheckboxValidation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("requireSelectAtLeast")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => requireSelectAtLeast(t0).runNow()))
    __obj.updateDynamic("requireSelectAtMost")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => requireSelectAtMost(t0).runNow()))
    __obj.updateDynamic("requireSelectExactly")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => requireSelectExactly(t0).runNow()))
    __obj.asInstanceOf[CheckboxValidation]
  }
}

