package typingsJapgolly.googleAppsScript.GoogleAppsScript.Forms

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Date
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A question item that allows the respondent to indicate a date. Items can be accessed or created
  * from a Form. When used in a quiz, these items are graded.
  *
  *     // Open a form by ID and add a new date item.
  *     var form = FormApp.openById('1234567890abcdefghijklmnopqrstuvwxyz');
  *     var item = form.addDateItem();
  *     item.setTitle('When were you born?');
  */
trait DateItem extends StObject {
  
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
  
  inline def apply(
    createResponse: Date => ItemResponse,
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
    setGeneralFeedback: QuizFeedback => DateItem,
    setHelpText: String => DateItem,
    setIncludesYear: Boolean => DateItem,
    setPoints: Integer => DateItem,
    setRequired: Boolean => DateItem,
    setTitle: String => DateItem
  ): DateItem = {
    val __obj = js.Dynamic.literal(createResponse = js.Any.fromFunction1(createResponse), duplicate = duplicate.toJsFn, getGeneralFeedback = getGeneralFeedback.toJsFn, getHelpText = getHelpText.toJsFn, getId = getId.toJsFn, getIndex = getIndex.toJsFn, getPoints = getPoints.toJsFn, getTitle = getTitle.toJsFn, getType = getType.toJsFn, includesYear = includesYear.toJsFn, isRequired = isRequired.toJsFn, setGeneralFeedback = js.Any.fromFunction1(setGeneralFeedback), setHelpText = js.Any.fromFunction1(setHelpText), setIncludesYear = js.Any.fromFunction1(setIncludesYear), setPoints = js.Any.fromFunction1(setPoints), setRequired = js.Any.fromFunction1(setRequired), setTitle = js.Any.fromFunction1(setTitle))
    __obj.asInstanceOf[DateItem]
  }
  
  extension [Self <: DateItem](x: Self) {
    
    inline def setCreateResponse(value: Date => ItemResponse): Self = StObject.set(x, "createResponse", js.Any.fromFunction1(value))
    
    inline def setDuplicate(value: CallbackTo[DateItem]): Self = StObject.set(x, "duplicate", value.toJsFn)
    
    inline def setGetGeneralFeedback(value: CallbackTo[QuizFeedback]): Self = StObject.set(x, "getGeneralFeedback", value.toJsFn)
    
    inline def setGetHelpText(value: CallbackTo[String]): Self = StObject.set(x, "getHelpText", value.toJsFn)
    
    inline def setGetId(value: CallbackTo[Integer]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetIndex(value: CallbackTo[Integer]): Self = StObject.set(x, "getIndex", value.toJsFn)
    
    inline def setGetPoints(value: CallbackTo[Integer]): Self = StObject.set(x, "getPoints", value.toJsFn)
    
    inline def setGetTitle(value: CallbackTo[String]): Self = StObject.set(x, "getTitle", value.toJsFn)
    
    inline def setGetType(value: CallbackTo[ItemType]): Self = StObject.set(x, "getType", value.toJsFn)
    
    inline def setIncludesYear(value: CallbackTo[Boolean]): Self = StObject.set(x, "includesYear", value.toJsFn)
    
    inline def setIsRequired(value: CallbackTo[Boolean]): Self = StObject.set(x, "isRequired", value.toJsFn)
    
    inline def setSetGeneralFeedback(value: QuizFeedback => DateItem): Self = StObject.set(x, "setGeneralFeedback", js.Any.fromFunction1(value))
    
    inline def setSetHelpText(value: String => DateItem): Self = StObject.set(x, "setHelpText", js.Any.fromFunction1(value))
    
    inline def setSetIncludesYear(value: Boolean => DateItem): Self = StObject.set(x, "setIncludesYear", js.Any.fromFunction1(value))
    
    inline def setSetPoints(value: Integer => DateItem): Self = StObject.set(x, "setPoints", js.Any.fromFunction1(value))
    
    inline def setSetRequired(value: Boolean => DateItem): Self = StObject.set(x, "setRequired", js.Any.fromFunction1(value))
    
    inline def setSetTitle(value: String => DateItem): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
  }
}
