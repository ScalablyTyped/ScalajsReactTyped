package typingsJapgolly.googleAppsScript.GoogleAppsScript.Forms

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A DataValidationBuilder for a ParagraphTextValidation.
  *
  *     // Add a paragraph text item to a form and require the answer to be at least 100 characters.
  *     var paragraphTextItem = form.addParagraphTextItem().setTitle('Describe yourself:');
  *     var paragraphtextValidation = FormApp.createParagraphTextValidation()
  *       .setHelpText(“Answer must be more than 100 characters.”)
  *       .requireTextLengthGreatherThan(100);
  *     paragraphTextItem.setValidation(paragraphtextValidation);
  */
trait ParagraphTextValidationBuilder extends js.Object {
  def requireTextContainsPattern(pattern: String): ParagraphTextValidationBuilder
  def requireTextDoesNotContainPattern(pattern: String): ParagraphTextValidationBuilder
  def requireTextDoesNotMatchPattern(pattern: String): ParagraphTextValidationBuilder
  def requireTextLengthGreaterThanOrEqualTo(number: Integer): ParagraphTextValidationBuilder
  def requireTextLengthLessThanOrEqualTo(number: Integer): ParagraphTextValidationBuilder
  def requireTextMatchesPattern(pattern: String): ParagraphTextValidationBuilder
}

object ParagraphTextValidationBuilder {
  @scala.inline
  def apply(
    requireTextContainsPattern: String => CallbackTo[ParagraphTextValidationBuilder],
    requireTextDoesNotContainPattern: String => CallbackTo[ParagraphTextValidationBuilder],
    requireTextDoesNotMatchPattern: String => CallbackTo[ParagraphTextValidationBuilder],
    requireTextLengthGreaterThanOrEqualTo: Integer => CallbackTo[ParagraphTextValidationBuilder],
    requireTextLengthLessThanOrEqualTo: Integer => CallbackTo[ParagraphTextValidationBuilder],
    requireTextMatchesPattern: String => CallbackTo[ParagraphTextValidationBuilder]
  ): ParagraphTextValidationBuilder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("requireTextContainsPattern")(js.Any.fromFunction1((t0: java.lang.String) => requireTextContainsPattern(t0).runNow()))
    __obj.updateDynamic("requireTextDoesNotContainPattern")(js.Any.fromFunction1((t0: java.lang.String) => requireTextDoesNotContainPattern(t0).runNow()))
    __obj.updateDynamic("requireTextDoesNotMatchPattern")(js.Any.fromFunction1((t0: java.lang.String) => requireTextDoesNotMatchPattern(t0).runNow()))
    __obj.updateDynamic("requireTextLengthGreaterThanOrEqualTo")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => requireTextLengthGreaterThanOrEqualTo(t0).runNow()))
    __obj.updateDynamic("requireTextLengthLessThanOrEqualTo")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => requireTextLengthLessThanOrEqualTo(t0).runNow()))
    __obj.updateDynamic("requireTextMatchesPattern")(js.Any.fromFunction1((t0: java.lang.String) => requireTextMatchesPattern(t0).runNow()))
    __obj.asInstanceOf[ParagraphTextValidationBuilder]
  }
}

