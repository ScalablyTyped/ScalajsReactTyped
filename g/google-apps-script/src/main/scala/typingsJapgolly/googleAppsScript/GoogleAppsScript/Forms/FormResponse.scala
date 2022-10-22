package typingsJapgolly.googleAppsScript.GoogleAppsScript.Forms

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait FormResponse extends StObject {
  
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
  
  inline def apply(
    getEditResponseUrl: CallbackTo[String],
    getGradableItemResponses: CallbackTo[js.Array[ItemResponse]],
    getGradableResponseForItem: Item => ItemResponse,
    getId: CallbackTo[String],
    getItemResponses: CallbackTo[js.Array[ItemResponse]],
    getRespondentEmail: CallbackTo[String],
    getResponseForItem: Item => ItemResponse,
    getTimestamp: CallbackTo[Date],
    submit: CallbackTo[FormResponse],
    toPrefilledUrl: CallbackTo[String],
    withItemGrade: ItemResponse => FormResponse,
    withItemResponse: ItemResponse => FormResponse
  ): FormResponse = {
    val __obj = js.Dynamic.literal(getEditResponseUrl = getEditResponseUrl.toJsFn, getGradableItemResponses = getGradableItemResponses.toJsFn, getGradableResponseForItem = js.Any.fromFunction1(getGradableResponseForItem), getId = getId.toJsFn, getItemResponses = getItemResponses.toJsFn, getRespondentEmail = getRespondentEmail.toJsFn, getResponseForItem = js.Any.fromFunction1(getResponseForItem), getTimestamp = getTimestamp.toJsFn, submit = submit.toJsFn, toPrefilledUrl = toPrefilledUrl.toJsFn, withItemGrade = js.Any.fromFunction1(withItemGrade), withItemResponse = js.Any.fromFunction1(withItemResponse))
    __obj.asInstanceOf[FormResponse]
  }
  
  extension [Self <: FormResponse](x: Self) {
    
    inline def setGetEditResponseUrl(value: CallbackTo[String]): Self = StObject.set(x, "getEditResponseUrl", value.toJsFn)
    
    inline def setGetGradableItemResponses(value: CallbackTo[js.Array[ItemResponse]]): Self = StObject.set(x, "getGradableItemResponses", value.toJsFn)
    
    inline def setGetGradableResponseForItem(value: Item => ItemResponse): Self = StObject.set(x, "getGradableResponseForItem", js.Any.fromFunction1(value))
    
    inline def setGetId(value: CallbackTo[String]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetItemResponses(value: CallbackTo[js.Array[ItemResponse]]): Self = StObject.set(x, "getItemResponses", value.toJsFn)
    
    inline def setGetRespondentEmail(value: CallbackTo[String]): Self = StObject.set(x, "getRespondentEmail", value.toJsFn)
    
    inline def setGetResponseForItem(value: Item => ItemResponse): Self = StObject.set(x, "getResponseForItem", js.Any.fromFunction1(value))
    
    inline def setGetTimestamp(value: CallbackTo[Date]): Self = StObject.set(x, "getTimestamp", value.toJsFn)
    
    inline def setSubmit(value: CallbackTo[FormResponse]): Self = StObject.set(x, "submit", value.toJsFn)
    
    inline def setToPrefilledUrl(value: CallbackTo[String]): Self = StObject.set(x, "toPrefilledUrl", value.toJsFn)
    
    inline def setWithItemGrade(value: ItemResponse => FormResponse): Self = StObject.set(x, "withItemGrade", js.Any.fromFunction1(value))
    
    inline def setWithItemResponse(value: ItemResponse => FormResponse): Self = StObject.set(x, "withItemResponse", js.Any.fromFunction1(value))
  }
}
