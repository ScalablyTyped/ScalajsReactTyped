package typingsJapgolly.googleAppsScript.GoogleAppsScript.Forms

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A question item that allows the respondent to choose one option from a numbered sequence of radio
  * buttons. Items can be accessed or created from a Form. When used in a quiz, these items
  * are graded.
  *
  *     // Open a form by ID and add a new scale item.
  *     var form = FormApp.openById('1234567890abcdefghijklmnopqrstuvwxyz');
  *     var item = form.addScaleItem();
  *     item.setTitle('Pick a number between 1 and 10')
  *         .setBounds(1, 10);
  */
trait ScaleItem extends js.Object {
  def createResponse(response: Integer): ItemResponse
  def duplicate(): ScaleItem
  def getGeneralFeedback(): QuizFeedback
  def getHelpText(): String
  def getId(): Integer
  def getIndex(): Integer
  def getLeftLabel(): String
  def getLowerBound(): Integer
  def getPoints(): Integer
  def getRightLabel(): String
  def getTitle(): String
  def getType(): ItemType
  def getUpperBound(): Integer
  def isRequired(): Boolean
  def setBounds(lower: Integer, upper: Integer): ScaleItem
  def setGeneralFeedback(feedback: QuizFeedback): ScaleItem
  def setHelpText(text: String): ScaleItem
  def setLabels(lower: String, upper: String): ScaleItem
  def setPoints(points: Integer): ScaleItem
  def setRequired(enabled: Boolean): ScaleItem
  def setTitle(title: String): ScaleItem
}

object ScaleItem {
  @scala.inline
  def apply(
    createResponse: Integer => CallbackTo[ItemResponse],
    duplicate: CallbackTo[ScaleItem],
    getGeneralFeedback: CallbackTo[QuizFeedback],
    getHelpText: CallbackTo[String],
    getId: CallbackTo[Integer],
    getIndex: CallbackTo[Integer],
    getLeftLabel: CallbackTo[String],
    getLowerBound: CallbackTo[Integer],
    getPoints: CallbackTo[Integer],
    getRightLabel: CallbackTo[String],
    getTitle: CallbackTo[String],
    getType: CallbackTo[ItemType],
    getUpperBound: CallbackTo[Integer],
    isRequired: CallbackTo[Boolean],
    setBounds: (Integer, Integer) => CallbackTo[ScaleItem],
    setGeneralFeedback: QuizFeedback => CallbackTo[ScaleItem],
    setHelpText: String => CallbackTo[ScaleItem],
    setLabels: (String, String) => CallbackTo[ScaleItem],
    setPoints: Integer => CallbackTo[ScaleItem],
    setRequired: Boolean => CallbackTo[ScaleItem],
    setTitle: String => CallbackTo[ScaleItem]
  ): ScaleItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createResponse")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => createResponse(t0).runNow()))
    __obj.updateDynamic("duplicate")(duplicate.toJsFn)
    __obj.updateDynamic("getGeneralFeedback")(getGeneralFeedback.toJsFn)
    __obj.updateDynamic("getHelpText")(getHelpText.toJsFn)
    __obj.updateDynamic("getId")(getId.toJsFn)
    __obj.updateDynamic("getIndex")(getIndex.toJsFn)
    __obj.updateDynamic("getLeftLabel")(getLeftLabel.toJsFn)
    __obj.updateDynamic("getLowerBound")(getLowerBound.toJsFn)
    __obj.updateDynamic("getPoints")(getPoints.toJsFn)
    __obj.updateDynamic("getRightLabel")(getRightLabel.toJsFn)
    __obj.updateDynamic("getTitle")(getTitle.toJsFn)
    __obj.updateDynamic("getType")(getType.toJsFn)
    __obj.updateDynamic("getUpperBound")(getUpperBound.toJsFn)
    __obj.updateDynamic("isRequired")(isRequired.toJsFn)
    __obj.updateDynamic("setBounds")(js.Any.fromFunction2((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer, t1: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => setBounds(t0, t1).runNow()))
    __obj.updateDynamic("setGeneralFeedback")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Forms.QuizFeedback) => setGeneralFeedback(t0).runNow()))
    __obj.updateDynamic("setHelpText")(js.Any.fromFunction1((t0: java.lang.String) => setHelpText(t0).runNow()))
    __obj.updateDynamic("setLabels")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => setLabels(t0, t1).runNow()))
    __obj.updateDynamic("setPoints")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => setPoints(t0).runNow()))
    __obj.updateDynamic("setRequired")(js.Any.fromFunction1((t0: scala.Boolean) => setRequired(t0).runNow()))
    __obj.updateDynamic("setTitle")(js.Any.fromFunction1((t0: java.lang.String) => setTitle(t0).runNow()))
    __obj.asInstanceOf[ScaleItem]
  }
}

