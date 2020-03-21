package typingsJapgolly.googleAppsScript.GoogleAppsScript.Forms

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A question item that allows the respondent to enter a single line of text. Items can be accessed
  * or created from a Form. When used in a quiz, these items are graded.
  *
  *     // Open a form by ID and add a new text item.
  *     var form = FormApp.openById('1234567890abcdefghijklmnopqrstuvwxyz');
  *     var item = form.addTextItem();
  *     item.setTitle('What is your name?');
  */
trait TextItem extends js.Object {
  def clearValidation(): TextItem
  def createResponse(response: String): ItemResponse
  def duplicate(): TextItem
  def getGeneralFeedback(): QuizFeedback
  def getHelpText(): String
  def getId(): Integer
  def getIndex(): Integer
  def getPoints(): Integer
  def getTitle(): String
  def getType(): ItemType
  def isRequired(): Boolean
  def setGeneralFeedback(feedback: QuizFeedback): TextItem
  def setHelpText(text: String): TextItem
  def setPoints(points: Integer): TextItem
  def setRequired(enabled: Boolean): TextItem
  def setTitle(title: String): TextItem
  def setValidation(validation: TextValidation): TextItem
}

object TextItem {
  @scala.inline
  def apply(
    clearValidation: CallbackTo[TextItem],
    createResponse: String => CallbackTo[ItemResponse],
    duplicate: CallbackTo[TextItem],
    getGeneralFeedback: CallbackTo[QuizFeedback],
    getHelpText: CallbackTo[String],
    getId: CallbackTo[Integer],
    getIndex: CallbackTo[Integer],
    getPoints: CallbackTo[Integer],
    getTitle: CallbackTo[String],
    getType: CallbackTo[ItemType],
    isRequired: CallbackTo[Boolean],
    setGeneralFeedback: QuizFeedback => CallbackTo[TextItem],
    setHelpText: String => CallbackTo[TextItem],
    setPoints: Integer => CallbackTo[TextItem],
    setRequired: Boolean => CallbackTo[TextItem],
    setTitle: String => CallbackTo[TextItem],
    setValidation: TextValidation => CallbackTo[TextItem]
  ): TextItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clearValidation")(clearValidation.toJsFn)
    __obj.updateDynamic("createResponse")(js.Any.fromFunction1((t0: java.lang.String) => createResponse(t0).runNow()))
    __obj.updateDynamic("duplicate")(duplicate.toJsFn)
    __obj.updateDynamic("getGeneralFeedback")(getGeneralFeedback.toJsFn)
    __obj.updateDynamic("getHelpText")(getHelpText.toJsFn)
    __obj.updateDynamic("getId")(getId.toJsFn)
    __obj.updateDynamic("getIndex")(getIndex.toJsFn)
    __obj.updateDynamic("getPoints")(getPoints.toJsFn)
    __obj.updateDynamic("getTitle")(getTitle.toJsFn)
    __obj.updateDynamic("getType")(getType.toJsFn)
    __obj.updateDynamic("isRequired")(isRequired.toJsFn)
    __obj.updateDynamic("setGeneralFeedback")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Forms.QuizFeedback) => setGeneralFeedback(t0).runNow()))
    __obj.updateDynamic("setHelpText")(js.Any.fromFunction1((t0: java.lang.String) => setHelpText(t0).runNow()))
    __obj.updateDynamic("setPoints")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => setPoints(t0).runNow()))
    __obj.updateDynamic("setRequired")(js.Any.fromFunction1((t0: scala.Boolean) => setRequired(t0).runNow()))
    __obj.updateDynamic("setTitle")(js.Any.fromFunction1((t0: java.lang.String) => setTitle(t0).runNow()))
    __obj.updateDynamic("setValidation")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Forms.TextValidation) => setValidation(t0).runNow()))
    __obj.asInstanceOf[TextItem]
  }
}

