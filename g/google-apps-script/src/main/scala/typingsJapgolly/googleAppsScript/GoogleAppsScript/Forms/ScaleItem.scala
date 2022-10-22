package typingsJapgolly.googleAppsScript.GoogleAppsScript.Forms

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait ScaleItem extends StObject {
  
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
  
  inline def apply(
    createResponse: Integer => ItemResponse,
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
    setBounds: (Integer, Integer) => ScaleItem,
    setGeneralFeedback: QuizFeedback => ScaleItem,
    setHelpText: String => ScaleItem,
    setLabels: (String, String) => ScaleItem,
    setPoints: Integer => ScaleItem,
    setRequired: Boolean => ScaleItem,
    setTitle: String => ScaleItem
  ): ScaleItem = {
    val __obj = js.Dynamic.literal(createResponse = js.Any.fromFunction1(createResponse), duplicate = duplicate.toJsFn, getGeneralFeedback = getGeneralFeedback.toJsFn, getHelpText = getHelpText.toJsFn, getId = getId.toJsFn, getIndex = getIndex.toJsFn, getLeftLabel = getLeftLabel.toJsFn, getLowerBound = getLowerBound.toJsFn, getPoints = getPoints.toJsFn, getRightLabel = getRightLabel.toJsFn, getTitle = getTitle.toJsFn, getType = getType.toJsFn, getUpperBound = getUpperBound.toJsFn, isRequired = isRequired.toJsFn, setBounds = js.Any.fromFunction2(setBounds), setGeneralFeedback = js.Any.fromFunction1(setGeneralFeedback), setHelpText = js.Any.fromFunction1(setHelpText), setLabels = js.Any.fromFunction2(setLabels), setPoints = js.Any.fromFunction1(setPoints), setRequired = js.Any.fromFunction1(setRequired), setTitle = js.Any.fromFunction1(setTitle))
    __obj.asInstanceOf[ScaleItem]
  }
  
  extension [Self <: ScaleItem](x: Self) {
    
    inline def setCreateResponse(value: Integer => ItemResponse): Self = StObject.set(x, "createResponse", js.Any.fromFunction1(value))
    
    inline def setDuplicate(value: CallbackTo[ScaleItem]): Self = StObject.set(x, "duplicate", value.toJsFn)
    
    inline def setGetGeneralFeedback(value: CallbackTo[QuizFeedback]): Self = StObject.set(x, "getGeneralFeedback", value.toJsFn)
    
    inline def setGetHelpText(value: CallbackTo[String]): Self = StObject.set(x, "getHelpText", value.toJsFn)
    
    inline def setGetId(value: CallbackTo[Integer]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetIndex(value: CallbackTo[Integer]): Self = StObject.set(x, "getIndex", value.toJsFn)
    
    inline def setGetLeftLabel(value: CallbackTo[String]): Self = StObject.set(x, "getLeftLabel", value.toJsFn)
    
    inline def setGetLowerBound(value: CallbackTo[Integer]): Self = StObject.set(x, "getLowerBound", value.toJsFn)
    
    inline def setGetPoints(value: CallbackTo[Integer]): Self = StObject.set(x, "getPoints", value.toJsFn)
    
    inline def setGetRightLabel(value: CallbackTo[String]): Self = StObject.set(x, "getRightLabel", value.toJsFn)
    
    inline def setGetTitle(value: CallbackTo[String]): Self = StObject.set(x, "getTitle", value.toJsFn)
    
    inline def setGetType(value: CallbackTo[ItemType]): Self = StObject.set(x, "getType", value.toJsFn)
    
    inline def setGetUpperBound(value: CallbackTo[Integer]): Self = StObject.set(x, "getUpperBound", value.toJsFn)
    
    inline def setIsRequired(value: CallbackTo[Boolean]): Self = StObject.set(x, "isRequired", value.toJsFn)
    
    inline def setSetBounds(value: (Integer, Integer) => ScaleItem): Self = StObject.set(x, "setBounds", js.Any.fromFunction2(value))
    
    inline def setSetGeneralFeedback(value: QuizFeedback => ScaleItem): Self = StObject.set(x, "setGeneralFeedback", js.Any.fromFunction1(value))
    
    inline def setSetHelpText(value: String => ScaleItem): Self = StObject.set(x, "setHelpText", js.Any.fromFunction1(value))
    
    inline def setSetLabels(value: (String, String) => ScaleItem): Self = StObject.set(x, "setLabels", js.Any.fromFunction2(value))
    
    inline def setSetPoints(value: Integer => ScaleItem): Self = StObject.set(x, "setPoints", js.Any.fromFunction1(value))
    
    inline def setSetRequired(value: Boolean => ScaleItem): Self = StObject.set(x, "setRequired", js.Any.fromFunction1(value))
    
    inline def setSetTitle(value: String => ScaleItem): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
  }
}
