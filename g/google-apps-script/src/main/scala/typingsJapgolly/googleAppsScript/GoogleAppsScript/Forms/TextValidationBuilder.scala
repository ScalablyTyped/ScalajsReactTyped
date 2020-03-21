package typingsJapgolly.googleAppsScript.GoogleAppsScript.Forms

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A DataValidationBuilder for a TextValidation.
  *
  *     // Add a text item to a form and require it to be a number within a range.
  *     var textItem = form.addTextItem().setTitle('Pick a number between 1 and 100?');
  *     var textValidation = FormApp.createTextValidation()
  *       .setHelpText(“Input was not a number between 1 and 100.”)
  *       .requireNumberBetween(1, 100);
  *     textItem.setValidation(textValidation);
  */
trait TextValidationBuilder extends js.Object {
  def requireNumber(): TextValidationBuilder
  def requireNumberBetween(start: Double, end: Double): TextValidationBuilder
  def requireNumberEqualTo(number: Double): TextValidationBuilder
  def requireNumberGreaterThan(number: Double): TextValidationBuilder
  def requireNumberGreaterThanOrEqualTo(number: Double): TextValidationBuilder
  def requireNumberLessThan(number: Double): TextValidationBuilder
  def requireNumberLessThanOrEqualTo(number: Double): TextValidationBuilder
  def requireNumberNotBetween(start: Double, end: Double): TextValidationBuilder
  def requireNumberNotEqualTo(number: Double): TextValidationBuilder
  def requireTextContainsPattern(pattern: String): TextValidationBuilder
  def requireTextDoesNotContainPattern(pattern: String): TextValidationBuilder
  def requireTextDoesNotMatchPattern(pattern: String): TextValidationBuilder
  def requireTextIsEmail(): TextValidationBuilder
  def requireTextIsUrl(): TextValidationBuilder
  def requireTextLengthGreaterThanOrEqualTo(number: Integer): TextValidationBuilder
  def requireTextLengthLessThanOrEqualTo(number: Integer): TextValidationBuilder
  def requireTextMatchesPattern(pattern: String): TextValidationBuilder
  def requireWholeNumber(): TextValidationBuilder
}

object TextValidationBuilder {
  @scala.inline
  def apply(
    requireNumber: CallbackTo[TextValidationBuilder],
    requireNumberBetween: (Double, Double) => CallbackTo[TextValidationBuilder],
    requireNumberEqualTo: Double => CallbackTo[TextValidationBuilder],
    requireNumberGreaterThan: Double => CallbackTo[TextValidationBuilder],
    requireNumberGreaterThanOrEqualTo: Double => CallbackTo[TextValidationBuilder],
    requireNumberLessThan: Double => CallbackTo[TextValidationBuilder],
    requireNumberLessThanOrEqualTo: Double => CallbackTo[TextValidationBuilder],
    requireNumberNotBetween: (Double, Double) => CallbackTo[TextValidationBuilder],
    requireNumberNotEqualTo: Double => CallbackTo[TextValidationBuilder],
    requireTextContainsPattern: String => CallbackTo[TextValidationBuilder],
    requireTextDoesNotContainPattern: String => CallbackTo[TextValidationBuilder],
    requireTextDoesNotMatchPattern: String => CallbackTo[TextValidationBuilder],
    requireTextIsEmail: CallbackTo[TextValidationBuilder],
    requireTextIsUrl: CallbackTo[TextValidationBuilder],
    requireTextLengthGreaterThanOrEqualTo: Integer => CallbackTo[TextValidationBuilder],
    requireTextLengthLessThanOrEqualTo: Integer => CallbackTo[TextValidationBuilder],
    requireTextMatchesPattern: String => CallbackTo[TextValidationBuilder],
    requireWholeNumber: CallbackTo[TextValidationBuilder]
  ): TextValidationBuilder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("requireNumber")(requireNumber.toJsFn)
    __obj.updateDynamic("requireNumberBetween")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => requireNumberBetween(t0, t1).runNow()))
    __obj.updateDynamic("requireNumberEqualTo")(js.Any.fromFunction1((t0: scala.Double) => requireNumberEqualTo(t0).runNow()))
    __obj.updateDynamic("requireNumberGreaterThan")(js.Any.fromFunction1((t0: scala.Double) => requireNumberGreaterThan(t0).runNow()))
    __obj.updateDynamic("requireNumberGreaterThanOrEqualTo")(js.Any.fromFunction1((t0: scala.Double) => requireNumberGreaterThanOrEqualTo(t0).runNow()))
    __obj.updateDynamic("requireNumberLessThan")(js.Any.fromFunction1((t0: scala.Double) => requireNumberLessThan(t0).runNow()))
    __obj.updateDynamic("requireNumberLessThanOrEqualTo")(js.Any.fromFunction1((t0: scala.Double) => requireNumberLessThanOrEqualTo(t0).runNow()))
    __obj.updateDynamic("requireNumberNotBetween")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => requireNumberNotBetween(t0, t1).runNow()))
    __obj.updateDynamic("requireNumberNotEqualTo")(js.Any.fromFunction1((t0: scala.Double) => requireNumberNotEqualTo(t0).runNow()))
    __obj.updateDynamic("requireTextContainsPattern")(js.Any.fromFunction1((t0: java.lang.String) => requireTextContainsPattern(t0).runNow()))
    __obj.updateDynamic("requireTextDoesNotContainPattern")(js.Any.fromFunction1((t0: java.lang.String) => requireTextDoesNotContainPattern(t0).runNow()))
    __obj.updateDynamic("requireTextDoesNotMatchPattern")(js.Any.fromFunction1((t0: java.lang.String) => requireTextDoesNotMatchPattern(t0).runNow()))
    __obj.updateDynamic("requireTextIsEmail")(requireTextIsEmail.toJsFn)
    __obj.updateDynamic("requireTextIsUrl")(requireTextIsUrl.toJsFn)
    __obj.updateDynamic("requireTextLengthGreaterThanOrEqualTo")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => requireTextLengthGreaterThanOrEqualTo(t0).runNow()))
    __obj.updateDynamic("requireTextLengthLessThanOrEqualTo")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => requireTextLengthLessThanOrEqualTo(t0).runNow()))
    __obj.updateDynamic("requireTextMatchesPattern")(js.Any.fromFunction1((t0: java.lang.String) => requireTextMatchesPattern(t0).runNow()))
    __obj.updateDynamic("requireWholeNumber")(requireWholeNumber.toJsFn)
    __obj.asInstanceOf[TextValidationBuilder]
  }
}

