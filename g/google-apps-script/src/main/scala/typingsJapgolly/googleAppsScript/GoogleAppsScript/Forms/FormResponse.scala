package typingsJapgolly.googleAppsScript.GoogleAppsScript.Forms

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response to the form as a whole. A FormResponse can be used in three ways: to access
  * the answers submitted by a respondent (see getItemResponses()), to programmatically
  * submit a response to the form (see withItemResponse(response) and submit()), and to generate a URL for the form which pre-fills fields using the provided
  * answers. FormResponses can be created or accessed from a Form.
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
trait FormResponse extends js.Object {
  def getEditResponseUrl(): String
  def getGradableItemResponses(): js.Array[ItemResponse]
  def getGradableResponseForItem(item: Item): ItemResponse
  def getId(): String
  def getItemResponses(): js.Array[ItemResponse]
  def getRespondentEmail(): String
  def getResponseForItem(item: Item): ItemResponse
  def getTimestamp(): Date
  def submit(): FormResponse
  def toPrefilledUrl(): String
  def withItemGrade(gradedResponse: ItemResponse): FormResponse
  def withItemResponse(response: ItemResponse): FormResponse
}

object FormResponse {
  @scala.inline
  def apply(
    getEditResponseUrl: CallbackTo[String],
    getGradableItemResponses: CallbackTo[js.Array[ItemResponse]],
    getGradableResponseForItem: Item => CallbackTo[ItemResponse],
    getId: CallbackTo[String],
    getItemResponses: CallbackTo[js.Array[ItemResponse]],
    getRespondentEmail: CallbackTo[String],
    getResponseForItem: Item => CallbackTo[ItemResponse],
    getTimestamp: CallbackTo[Date],
    submit: CallbackTo[FormResponse],
    toPrefilledUrl: CallbackTo[String],
    withItemGrade: ItemResponse => CallbackTo[FormResponse],
    withItemResponse: ItemResponse => CallbackTo[FormResponse]
  ): FormResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getEditResponseUrl")(getEditResponseUrl.toJsFn)
    __obj.updateDynamic("getGradableItemResponses")(getGradableItemResponses.toJsFn)
    __obj.updateDynamic("getGradableResponseForItem")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Forms.Item) => getGradableResponseForItem(t0).runNow()))
    __obj.updateDynamic("getId")(getId.toJsFn)
    __obj.updateDynamic("getItemResponses")(getItemResponses.toJsFn)
    __obj.updateDynamic("getRespondentEmail")(getRespondentEmail.toJsFn)
    __obj.updateDynamic("getResponseForItem")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Forms.Item) => getResponseForItem(t0).runNow()))
    __obj.updateDynamic("getTimestamp")(getTimestamp.toJsFn)
    __obj.updateDynamic("submit")(submit.toJsFn)
    __obj.updateDynamic("toPrefilledUrl")(toPrefilledUrl.toJsFn)
    __obj.updateDynamic("withItemGrade")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Forms.ItemResponse) => withItemGrade(t0).runNow()))
    __obj.updateDynamic("withItemResponse")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Forms.ItemResponse) => withItemResponse(t0).runNow()))
    __obj.asInstanceOf[FormResponse]
  }
}

