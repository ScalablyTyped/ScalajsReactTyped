package typingsJapgolly.surveyKnockout.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISurveyImpl extends js.Object {
  def geSurveyData(): ISurveyData
  def getSurvey(): ISurvey
  def getTextProcessor(): ITextProcessor
}

object ISurveyImpl {
  @scala.inline
  def apply(
    geSurveyData: CallbackTo[ISurveyData],
    getSurvey: CallbackTo[ISurvey],
    getTextProcessor: CallbackTo[ITextProcessor]
  ): ISurveyImpl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("geSurveyData")(geSurveyData.toJsFn)
    __obj.updateDynamic("getSurvey")(getSurvey.toJsFn)
    __obj.updateDynamic("getTextProcessor")(getTextProcessor.toJsFn)
    __obj.asInstanceOf[ISurveyImpl]
  }
}

