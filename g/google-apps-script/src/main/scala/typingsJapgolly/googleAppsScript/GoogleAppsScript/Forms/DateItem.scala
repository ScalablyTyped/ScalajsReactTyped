package typingsJapgolly.googleAppsScript.GoogleAppsScript.Forms

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Date
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A question item that allows the respondent to indicate a date. Items can be accessed or created
  * from a Form. When used in a quiz, these items are graded.
  *
  *     // Open a form by ID and add a new date item.
  *     var form = FormApp.openById('1234567890abcdefghijklmnopqrstuvwxyz');
  *     var item = form.addDateItem();
  *     item.setTitle('When were you born?');
  */
trait DateItem extends js.Object {
  def createResponse(response: Date): ItemResponse
  def duplicate(): DateItem
  def getGeneralFeedback(): QuizFeedback
  def getHelpText(): String
  def getId(): Integer
  def getIndex(): Integer
  def getPoints(): Integer
  def getTitle(): String
  def getType(): ItemType
  def includesYear(): Boolean
  def isRequired(): Boolean
  def setGeneralFeedback(feedback: QuizFeedback): DateItem
  def setHelpText(text: String): DateItem
  def setIncludesYear(enableYear: Boolean): DateItem
  def setPoints(points: Integer): DateItem
  def setRequired(enabled: Boolean): DateItem
  def setTitle(title: String): DateItem
}

object DateItem {
  @scala.inline
  def apply(
    createResponse: Date => CallbackTo[ItemResponse],
    duplicate: CallbackTo[DateItem],
    getGeneralFeedback: CallbackTo[QuizFeedback],
    getHelpText: CallbackTo[String],
    getId: CallbackTo[Integer],
    getIndex: CallbackTo[Integer],
    getPoints: CallbackTo[Integer],
    getTitle: CallbackTo[String],
    getType: CallbackTo[ItemType],
    includesYear: CallbackTo[Boolean],
    isRequired: CallbackTo[Boolean],
    setGeneralFeedback: QuizFeedback => CallbackTo[DateItem],
    setHelpText: String => CallbackTo[DateItem],
    setIncludesYear: Boolean => CallbackTo[DateItem],
    setPoints: Integer => CallbackTo[DateItem],
    setRequired: Boolean => CallbackTo[DateItem],
    setTitle: String => CallbackTo[DateItem]
  ): DateItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createResponse")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Date) => createResponse(t0).runNow()))
    __obj.updateDynamic("duplicate")(duplicate.toJsFn)
    __obj.updateDynamic("getGeneralFeedback")(getGeneralFeedback.toJsFn)
    __obj.updateDynamic("getHelpText")(getHelpText.toJsFn)
    __obj.updateDynamic("getId")(getId.toJsFn)
    __obj.updateDynamic("getIndex")(getIndex.toJsFn)
    __obj.updateDynamic("getPoints")(getPoints.toJsFn)
    __obj.updateDynamic("getTitle")(getTitle.toJsFn)
    __obj.updateDynamic("getType")(getType.toJsFn)
    __obj.updateDynamic("includesYear")(includesYear.toJsFn)
    __obj.updateDynamic("isRequired")(isRequired.toJsFn)
    __obj.updateDynamic("setGeneralFeedback")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Forms.QuizFeedback) => setGeneralFeedback(t0).runNow()))
    __obj.updateDynamic("setHelpText")(js.Any.fromFunction1((t0: java.lang.String) => setHelpText(t0).runNow()))
    __obj.updateDynamic("setIncludesYear")(js.Any.fromFunction1((t0: scala.Boolean) => setIncludesYear(t0).runNow()))
    __obj.updateDynamic("setPoints")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => setPoints(t0).runNow()))
    __obj.updateDynamic("setRequired")(js.Any.fromFunction1((t0: scala.Boolean) => setRequired(t0).runNow()))
    __obj.updateDynamic("setTitle")(js.Any.fromFunction1((t0: java.lang.String) => setTitle(t0).runNow()))
    __obj.asInstanceOf[DateItem]
  }
}

