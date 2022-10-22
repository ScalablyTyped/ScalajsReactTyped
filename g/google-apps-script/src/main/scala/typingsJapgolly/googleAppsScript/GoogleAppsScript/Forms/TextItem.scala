package typingsJapgolly.googleAppsScript.GoogleAppsScript.Forms

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A question item that allows the respondent to enter a single line of text. Items can be accessed
  * or created from a Form. When used in a quiz, these items are graded.
  *
  *     // Open a form by ID and add a new text item.
  *     var form = FormApp.openById('1234567890abcdefghijklmnopqrstuvwxyz');
  *     var item = form.addTextItem();
  *     item.setTitle('What is your name?');
  */
trait TextItem extends StObject {
  
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
  
  inline def apply(
    clearValidation: CallbackTo[TextItem],
    createResponse: String => ItemResponse,
    duplicate: CallbackTo[TextItem],
    getGeneralFeedback: CallbackTo[QuizFeedback],
    getHelpText: CallbackTo[String],
    getId: CallbackTo[Integer],
    getIndex: CallbackTo[Integer],
    getPoints: CallbackTo[Integer],
    getTitle: CallbackTo[String],
    getType: CallbackTo[ItemType],
    isRequired: CallbackTo[Boolean],
    setGeneralFeedback: QuizFeedback => TextItem,
    setHelpText: String => TextItem,
    setPoints: Integer => TextItem,
    setRequired: Boolean => TextItem,
    setTitle: String => TextItem,
    setValidation: TextValidation => TextItem
  ): TextItem = {
    val __obj = js.Dynamic.literal(clearValidation = clearValidation.toJsFn, createResponse = js.Any.fromFunction1(createResponse), duplicate = duplicate.toJsFn, getGeneralFeedback = getGeneralFeedback.toJsFn, getHelpText = getHelpText.toJsFn, getId = getId.toJsFn, getIndex = getIndex.toJsFn, getPoints = getPoints.toJsFn, getTitle = getTitle.toJsFn, getType = getType.toJsFn, isRequired = isRequired.toJsFn, setGeneralFeedback = js.Any.fromFunction1(setGeneralFeedback), setHelpText = js.Any.fromFunction1(setHelpText), setPoints = js.Any.fromFunction1(setPoints), setRequired = js.Any.fromFunction1(setRequired), setTitle = js.Any.fromFunction1(setTitle), setValidation = js.Any.fromFunction1(setValidation))
    __obj.asInstanceOf[TextItem]
  }
  
  extension [Self <: TextItem](x: Self) {
    
    inline def setClearValidation(value: CallbackTo[TextItem]): Self = StObject.set(x, "clearValidation", value.toJsFn)
    
    inline def setCreateResponse(value: String => ItemResponse): Self = StObject.set(x, "createResponse", js.Any.fromFunction1(value))
    
    inline def setDuplicate(value: CallbackTo[TextItem]): Self = StObject.set(x, "duplicate", value.toJsFn)
    
    inline def setGetGeneralFeedback(value: CallbackTo[QuizFeedback]): Self = StObject.set(x, "getGeneralFeedback", value.toJsFn)
    
    inline def setGetHelpText(value: CallbackTo[String]): Self = StObject.set(x, "getHelpText", value.toJsFn)
    
    inline def setGetId(value: CallbackTo[Integer]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetIndex(value: CallbackTo[Integer]): Self = StObject.set(x, "getIndex", value.toJsFn)
    
    inline def setGetPoints(value: CallbackTo[Integer]): Self = StObject.set(x, "getPoints", value.toJsFn)
    
    inline def setGetTitle(value: CallbackTo[String]): Self = StObject.set(x, "getTitle", value.toJsFn)
    
    inline def setGetType(value: CallbackTo[ItemType]): Self = StObject.set(x, "getType", value.toJsFn)
    
    inline def setIsRequired(value: CallbackTo[Boolean]): Self = StObject.set(x, "isRequired", value.toJsFn)
    
    inline def setSetGeneralFeedback(value: QuizFeedback => TextItem): Self = StObject.set(x, "setGeneralFeedback", js.Any.fromFunction1(value))
    
    inline def setSetHelpText(value: String => TextItem): Self = StObject.set(x, "setHelpText", js.Any.fromFunction1(value))
    
    inline def setSetPoints(value: Integer => TextItem): Self = StObject.set(x, "setPoints", js.Any.fromFunction1(value))
    
    inline def setSetRequired(value: Boolean => TextItem): Self = StObject.set(x, "setRequired", js.Any.fromFunction1(value))
    
    inline def setSetTitle(value: String => TextItem): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
    
    inline def setSetValidation(value: TextValidation => TextItem): Self = StObject.set(x, "setValidation", js.Any.fromFunction1(value))
  }
}
