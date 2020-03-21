package typingsJapgolly.surveyKnockout.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISurveyElement extends js.Object {
  var containsErrors: Boolean
  var isPage: Boolean
  var isPanel: Boolean
  var isReadOnly: Boolean
  var isVisible: Boolean
  var name: String
  def delete(): js.Any
  def getType(): String
  def locStrsChanged(): js.Any
  def onFirstRendering(): js.Any
  def onSurveyLoad(): js.Any
  def setSurveyImpl(value: ISurveyImpl): js.Any
  def setVisibleIndex(value: Double): Double
}

object ISurveyElement {
  @scala.inline
  def apply(
    containsErrors: Boolean,
    delete: CallbackTo[js.Any],
    getType: CallbackTo[String],
    isPage: Boolean,
    isPanel: Boolean,
    isReadOnly: Boolean,
    isVisible: Boolean,
    locStrsChanged: CallbackTo[js.Any],
    name: String,
    onFirstRendering: CallbackTo[js.Any],
    onSurveyLoad: CallbackTo[js.Any],
    setSurveyImpl: ISurveyImpl => CallbackTo[js.Any],
    setVisibleIndex: Double => CallbackTo[Double]
  ): ISurveyElement = {
    val __obj = js.Dynamic.literal(containsErrors = containsErrors.asInstanceOf[js.Any], isPage = isPage.asInstanceOf[js.Any], isPanel = isPanel.asInstanceOf[js.Any], isReadOnly = isReadOnly.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("delete")(delete.toJsFn)
    __obj.updateDynamic("getType")(getType.toJsFn)
    __obj.updateDynamic("locStrsChanged")(locStrsChanged.toJsFn)
    __obj.updateDynamic("onFirstRendering")(onFirstRendering.toJsFn)
    __obj.updateDynamic("onSurveyLoad")(onSurveyLoad.toJsFn)
    __obj.updateDynamic("setSurveyImpl")(js.Any.fromFunction1((t0: typingsJapgolly.surveyKnockout.mod.ISurveyImpl) => setSurveyImpl(t0).runNow()))
    __obj.updateDynamic("setVisibleIndex")(js.Any.fromFunction1((t0: scala.Double) => setVisibleIndex(t0).runNow()))
    __obj.asInstanceOf[ISurveyElement]
  }
}

