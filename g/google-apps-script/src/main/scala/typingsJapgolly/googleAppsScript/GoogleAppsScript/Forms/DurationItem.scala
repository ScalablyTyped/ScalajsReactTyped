package typingsJapgolly.googleAppsScript.GoogleAppsScript.Forms

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A question item that allows the respondent to indicate a length of time. Items can be accessed or
  * created from a Form. When used in a quiz, these items are graded.
  *
  *     // Open a form by ID and add a new duration item.
  *     var form = FormApp.openById('1234567890abcdefghijklmnopqrstuvwxyz');
  *     var item = form.addDurationItem();
  *     item.setTitle('How long can you hold your breath?');
  */
trait DurationItem extends StObject {
  
  def createResponse(hours: Integer, minutes: Integer, seconds: Integer): ItemResponse
  
  def duplicate(): DurationItem
  
  def getGeneralFeedback(): QuizFeedback
  
  def getHelpText(): String
  
  def getId(): Integer
  
  def getIndex(): Integer
  
  def getPoints(): Integer
  
  def getTitle(): String
  
  def getType(): ItemType
  
  def isRequired(): Boolean
  
  def setGeneralFeedback(feedback: QuizFeedback): DurationItem
  
  def setHelpText(text: String): DurationItem
  
  def setPoints(points: Integer): DurationItem
  
  def setRequired(enabled: Boolean): DurationItem
  
  def setTitle(title: String): DurationItem
}
object DurationItem {
  
  inline def apply(
    createResponse: (Integer, Integer, Integer) => ItemResponse,
    duplicate: CallbackTo[DurationItem],
    getGeneralFeedback: CallbackTo[QuizFeedback],
    getHelpText: CallbackTo[String],
    getId: CallbackTo[Integer],
    getIndex: CallbackTo[Integer],
    getPoints: CallbackTo[Integer],
    getTitle: CallbackTo[String],
    getType: CallbackTo[ItemType],
    isRequired: CallbackTo[Boolean],
    setGeneralFeedback: QuizFeedback => DurationItem,
    setHelpText: String => DurationItem,
    setPoints: Integer => DurationItem,
    setRequired: Boolean => DurationItem,
    setTitle: String => DurationItem
  ): DurationItem = {
    val __obj = js.Dynamic.literal(createResponse = js.Any.fromFunction3(createResponse), duplicate = duplicate.toJsFn, getGeneralFeedback = getGeneralFeedback.toJsFn, getHelpText = getHelpText.toJsFn, getId = getId.toJsFn, getIndex = getIndex.toJsFn, getPoints = getPoints.toJsFn, getTitle = getTitle.toJsFn, getType = getType.toJsFn, isRequired = isRequired.toJsFn, setGeneralFeedback = js.Any.fromFunction1(setGeneralFeedback), setHelpText = js.Any.fromFunction1(setHelpText), setPoints = js.Any.fromFunction1(setPoints), setRequired = js.Any.fromFunction1(setRequired), setTitle = js.Any.fromFunction1(setTitle))
    __obj.asInstanceOf[DurationItem]
  }
  
  extension [Self <: DurationItem](x: Self) {
    
    inline def setCreateResponse(value: (Integer, Integer, Integer) => ItemResponse): Self = StObject.set(x, "createResponse", js.Any.fromFunction3(value))
    
    inline def setDuplicate(value: CallbackTo[DurationItem]): Self = StObject.set(x, "duplicate", value.toJsFn)
    
    inline def setGetGeneralFeedback(value: CallbackTo[QuizFeedback]): Self = StObject.set(x, "getGeneralFeedback", value.toJsFn)
    
    inline def setGetHelpText(value: CallbackTo[String]): Self = StObject.set(x, "getHelpText", value.toJsFn)
    
    inline def setGetId(value: CallbackTo[Integer]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetIndex(value: CallbackTo[Integer]): Self = StObject.set(x, "getIndex", value.toJsFn)
    
    inline def setGetPoints(value: CallbackTo[Integer]): Self = StObject.set(x, "getPoints", value.toJsFn)
    
    inline def setGetTitle(value: CallbackTo[String]): Self = StObject.set(x, "getTitle", value.toJsFn)
    
    inline def setGetType(value: CallbackTo[ItemType]): Self = StObject.set(x, "getType", value.toJsFn)
    
    inline def setIsRequired(value: CallbackTo[Boolean]): Self = StObject.set(x, "isRequired", value.toJsFn)
    
    inline def setSetGeneralFeedback(value: QuizFeedback => DurationItem): Self = StObject.set(x, "setGeneralFeedback", js.Any.fromFunction1(value))
    
    inline def setSetHelpText(value: String => DurationItem): Self = StObject.set(x, "setHelpText", js.Any.fromFunction1(value))
    
    inline def setSetPoints(value: Integer => DurationItem): Self = StObject.set(x, "setPoints", js.Any.fromFunction1(value))
    
    inline def setSetRequired(value: Boolean => DurationItem): Self = StObject.set(x, "setRequired", js.Any.fromFunction1(value))
    
    inline def setSetTitle(value: String => DurationItem): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
  }
}
