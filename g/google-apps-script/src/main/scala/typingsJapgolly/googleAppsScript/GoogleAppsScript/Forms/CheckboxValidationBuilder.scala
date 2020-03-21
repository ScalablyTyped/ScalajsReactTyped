package typingsJapgolly.googleAppsScript.GoogleAppsScript.Forms

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A DataValidationBuilder for a CheckboxValidation.
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
trait CheckboxValidationBuilder extends js.Object {
  def requireSelectAtLeast(number: Integer): CheckboxValidationBuilder
  def requireSelectAtMost(number: Integer): CheckboxValidationBuilder
  def requireSelectExactly(number: Integer): CheckboxValidationBuilder
}

object CheckboxValidationBuilder {
  @scala.inline
  def apply(
    requireSelectAtLeast: Integer => CallbackTo[CheckboxValidationBuilder],
    requireSelectAtMost: Integer => CallbackTo[CheckboxValidationBuilder],
    requireSelectExactly: Integer => CallbackTo[CheckboxValidationBuilder]
  ): CheckboxValidationBuilder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("requireSelectAtLeast")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => requireSelectAtLeast(t0).runNow()))
    __obj.updateDynamic("requireSelectAtMost")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => requireSelectAtMost(t0).runNow()))
    __obj.updateDynamic("requireSelectExactly")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => requireSelectExactly(t0).runNow()))
    __obj.asInstanceOf[CheckboxValidationBuilder]
  }
}

