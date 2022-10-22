package typingsJapgolly.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "QuestionPanelDynamicTemplateSurveyImpl")
@js.native
open class QuestionPanelDynamicTemplateSurveyImpl protected ()
  extends StObject
     with ISurveyImpl {
  def this(data: IQuestionPanelDynamicData) = this()
  
  var data: IQuestionPanelDynamicData = js.native
  
  /* CompleteClass */
  override def getSurvey(): ISurvey = js.native
  
  /* CompleteClass */
  override def getSurveyData(): ISurveyData = js.native
  
  /* CompleteClass */
  override def getTextProcessor(): ITextProcessor = js.native
}
