package typingsJapgolly.surveyKnockout.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IQuestionPanelDynamicData extends StObject {
  
  def getItemIndex(item: ISurveyData): Double
  
  def getPanelItemData(item: ISurveyData): Any
  
  def getRootData(): ISurveyData
  
  def getSharedQuestionFromArray(name: String, panelIndex: Double): Question
  
  def getSurvey(): ISurvey
  
  def setPanelItemData(item: ISurveyData, name: String, `val`: Any): Any
}
object IQuestionPanelDynamicData {
  
  inline def apply(
    getItemIndex: ISurveyData => Double,
    getPanelItemData: ISurveyData => Any,
    getRootData: CallbackTo[ISurveyData],
    getSharedQuestionFromArray: (String, Double) => Question,
    getSurvey: CallbackTo[ISurvey],
    setPanelItemData: (ISurveyData, String, Any) => Any
  ): IQuestionPanelDynamicData = {
    val __obj = js.Dynamic.literal(getItemIndex = js.Any.fromFunction1(getItemIndex), getPanelItemData = js.Any.fromFunction1(getPanelItemData), getRootData = getRootData.toJsFn, getSharedQuestionFromArray = js.Any.fromFunction2(getSharedQuestionFromArray), getSurvey = getSurvey.toJsFn, setPanelItemData = js.Any.fromFunction3(setPanelItemData))
    __obj.asInstanceOf[IQuestionPanelDynamicData]
  }
  
  extension [Self <: IQuestionPanelDynamicData](x: Self) {
    
    inline def setGetItemIndex(value: ISurveyData => Double): Self = StObject.set(x, "getItemIndex", js.Any.fromFunction1(value))
    
    inline def setGetPanelItemData(value: ISurveyData => Any): Self = StObject.set(x, "getPanelItemData", js.Any.fromFunction1(value))
    
    inline def setGetRootData(value: CallbackTo[ISurveyData]): Self = StObject.set(x, "getRootData", value.toJsFn)
    
    inline def setGetSharedQuestionFromArray(value: (String, Double) => Question): Self = StObject.set(x, "getSharedQuestionFromArray", js.Any.fromFunction2(value))
    
    inline def setGetSurvey(value: CallbackTo[ISurvey]): Self = StObject.set(x, "getSurvey", value.toJsFn)
    
    inline def setSetPanelItemData(value: (ISurveyData, String, Any) => Any): Self = StObject.set(x, "setPanelItemData", js.Any.fromFunction3(value))
  }
}
