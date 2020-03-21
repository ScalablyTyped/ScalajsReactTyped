package typingsJapgolly.googleAppsScript.GoogleAppsScript.Forms

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response to one question item within a form. Item responses can be accessed from FormResponse and created from any Item that asks the respondent to answer a question.
  *
  *     // Open a form by ID and log the responses to each question.
  *     var form = FormApp.openById('1234567890abcdefghijklmnopqrstuvwxyz');
  *     var formResponses = form.getResponses();
  *     for (var i = 0; i < formResponses.length; i++) {
  *       var formResponse = formResponses[i];
  *       var itemResponses = formResponse.getItemResponses();
  *       for (var j = 0; j < itemResponses.length; j++) {
  *         var itemResponse = itemResponses[j];
  *         Logger.log('Response #%s to the question "%s" was "%s"',
  *             (i + 1).toString(),
  *             itemResponse.getItem().getTitle(),
  *             itemResponse.getResponse());
  *       }
  *     }
  */
trait ItemResponse extends js.Object {
  def getFeedback(): QuizFeedback
  def getItem(): Item
  def getResponse(): (js.Array[js.Array[String] | String]) | String
  def getScore(): Double
  def setFeedback(feedback: js.Any): ItemResponse
  def setScore(score: js.Any): ItemResponse
}

object ItemResponse {
  @scala.inline
  def apply(
    getFeedback: CallbackTo[QuizFeedback],
    getItem: CallbackTo[Item],
    getResponse: CallbackTo[(js.Array[js.Array[String] | String]) | String],
    getScore: CallbackTo[Double],
    setFeedback: js.Any => CallbackTo[ItemResponse],
    setScore: js.Any => CallbackTo[ItemResponse]
  ): ItemResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getFeedback")(getFeedback.toJsFn)
    __obj.updateDynamic("getItem")(getItem.toJsFn)
    __obj.updateDynamic("getResponse")(getResponse.toJsFn)
    __obj.updateDynamic("getScore")(getScore.toJsFn)
    __obj.updateDynamic("setFeedback")(js.Any.fromFunction1((t0: js.Any) => setFeedback(t0).runNow()))
    __obj.updateDynamic("setScore")(js.Any.fromFunction1((t0: js.Any) => setScore(t0).runNow()))
    __obj.asInstanceOf[ItemResponse]
  }
}

