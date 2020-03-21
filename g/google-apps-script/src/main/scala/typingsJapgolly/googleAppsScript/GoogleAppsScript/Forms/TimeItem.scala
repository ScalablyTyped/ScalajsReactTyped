package typingsJapgolly.googleAppsScript.GoogleAppsScript.Forms

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A question item that allows the respondent to indicate a time of day. Items can be accessed or
  * created from a Form. When used in a quiz, these items are graded.
  *
  *     // Open a form by ID and add a new time item.
  *     var form = FormApp.openById('1234567890abcdefghijklmnopqrstuvwxyz');
  *     var item = form.addTimeItem();
  *     item.setTitle('What time do you usually wake up in the morning?');
  */
trait TimeItem extends js.Object {
  def createResponse(hour: Integer, minute: Integer): ItemResponse
  def duplicate(): TimeItem
  def getGeneralFeedback(): QuizFeedback
  def getHelpText(): String
  def getId(): Integer
  def getIndex(): Integer
  def getPoints(): Integer
  def getTitle(): String
  def getType(): ItemType
  def isRequired(): Boolean
  def setGeneralFeedback(feedback: QuizFeedback): TimeItem
  def setHelpText(text: String): TimeItem
  def setPoints(points: Integer): TimeItem
  def setRequired(enabled: Boolean): TimeItem
  def setTitle(title: String): TimeItem
}

object TimeItem {
  @scala.inline
  def apply(
    createResponse: (Integer, Integer) => CallbackTo[ItemResponse],
    duplicate: CallbackTo[TimeItem],
    getGeneralFeedback: CallbackTo[QuizFeedback],
    getHelpText: CallbackTo[String],
    getId: CallbackTo[Integer],
    getIndex: CallbackTo[Integer],
    getPoints: CallbackTo[Integer],
    getTitle: CallbackTo[String],
    getType: CallbackTo[ItemType],
    isRequired: CallbackTo[Boolean],
    setGeneralFeedback: QuizFeedback => CallbackTo[TimeItem],
    setHelpText: String => CallbackTo[TimeItem],
    setPoints: Integer => CallbackTo[TimeItem],
    setRequired: Boolean => CallbackTo[TimeItem],
    setTitle: String => CallbackTo[TimeItem]
  ): TimeItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createResponse")(js.Any.fromFunction2((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer, t1: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => createResponse(t0, t1).runNow()))
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
    __obj.asInstanceOf[TimeItem]
  }
}

