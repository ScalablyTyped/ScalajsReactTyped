package typingsJapgolly.surveyKnockout.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISurveyImpl extends StObject {
  
  def getSurvey(): ISurvey
  
  def getSurveyData(): ISurveyData
  
  def getTextProcessor(): ITextProcessor
}
object ISurveyImpl {
  
  inline def apply(
    getSurvey: CallbackTo[ISurvey],
    getSurveyData: CallbackTo[ISurveyData],
    getTextProcessor: CallbackTo[ITextProcessor]
  ): ISurveyImpl = {
    val __obj = js.Dynamic.literal(getSurvey = getSurvey.toJsFn, getSurveyData = getSurveyData.toJsFn, getTextProcessor = getTextProcessor.toJsFn)
    __obj.asInstanceOf[ISurveyImpl]
  }
  
  extension [Self <: ISurveyImpl](x: Self) {
    
    inline def setGetSurvey(value: CallbackTo[ISurvey]): Self = StObject.set(x, "getSurvey", value.toJsFn)
    
    inline def setGetSurveyData(value: CallbackTo[ISurveyData]): Self = StObject.set(x, "getSurveyData", value.toJsFn)
    
    inline def setGetTextProcessor(value: CallbackTo[ITextProcessor]): Self = StObject.set(x, "getTextProcessor", value.toJsFn)
  }
}
