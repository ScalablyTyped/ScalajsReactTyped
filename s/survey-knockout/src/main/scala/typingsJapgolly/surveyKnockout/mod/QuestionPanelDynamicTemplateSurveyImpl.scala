package typingsJapgolly.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "QuestionPanelDynamicTemplateSurveyImpl")
@js.native
class QuestionPanelDynamicTemplateSurveyImpl protected () extends ISurveyImpl {
  def this(data: IQuestionPanelDynamicData) = this()
  var data: IQuestionPanelDynamicData = js.native
  /* CompleteClass */
  override def geSurveyData(): ISurveyData = js.native
  /* CompleteClass */
  override def getSurvey(): ISurvey = js.native
  /* CompleteClass */
  override def getTextProcessor(): ITextProcessor = js.native
}

