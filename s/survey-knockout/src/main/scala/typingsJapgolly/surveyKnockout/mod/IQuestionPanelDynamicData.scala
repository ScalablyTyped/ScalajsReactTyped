package typingsJapgolly.surveyKnockout.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IQuestionPanelDynamicData extends js.Object {
  def getItemIndex(item: ISurveyData): Double
  def getPanelItemData(item: ISurveyData): js.Any
  def getRootData(): ISurveyData
  def getSharedQuestionFromArray(name: String, panelIndex: Double): Question
  def getSurvey(): ISurvey
  def setPanelItemData(item: ISurveyData, name: String, `val`: js.Any): js.Any
}

object IQuestionPanelDynamicData {
  @scala.inline
  def apply(
    getItemIndex: ISurveyData => CallbackTo[Double],
    getPanelItemData: ISurveyData => CallbackTo[js.Any],
    getRootData: CallbackTo[ISurveyData],
    getSharedQuestionFromArray: (String, Double) => CallbackTo[Question],
    getSurvey: CallbackTo[ISurvey],
    setPanelItemData: (ISurveyData, String, js.Any) => CallbackTo[js.Any]
  ): IQuestionPanelDynamicData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getItemIndex")(js.Any.fromFunction1((t0: typingsJapgolly.surveyKnockout.mod.ISurveyData) => getItemIndex(t0).runNow()))
    __obj.updateDynamic("getPanelItemData")(js.Any.fromFunction1((t0: typingsJapgolly.surveyKnockout.mod.ISurveyData) => getPanelItemData(t0).runNow()))
    __obj.updateDynamic("getRootData")(getRootData.toJsFn)
    __obj.updateDynamic("getSharedQuestionFromArray")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => getSharedQuestionFromArray(t0, t1).runNow()))
    __obj.updateDynamic("getSurvey")(getSurvey.toJsFn)
    __obj.updateDynamic("setPanelItemData")(js.Any.fromFunction3((t0: typingsJapgolly.surveyKnockout.mod.ISurveyData, t1: java.lang.String, t2: js.Any) => setPanelItemData(t0, t1, t2).runNow()))
    __obj.asInstanceOf[IQuestionPanelDynamicData]
  }
}

