package typingsJapgolly.surveyKnockout.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IQuestion
  extends IElement
     with ISurveyErrorOwner {
  var hasTitle: Boolean
  var value: js.Any
  def clearUnusedValues(): js.Any
  def clearValue(): js.Any
  def clearValueIfInvisible(): js.Any
  def getDisplayValue(keysAsText: Boolean, value: js.Any): js.Any
  def getQuestionFromArray(name: String, index: Double): IQuestion
  def getValueName(): String
  def isAnswerCorrect(): Boolean
  def isEmpty(): Boolean
  def onSurveyValueChanged(newValue: js.Any): js.Any
  def supportGoNextPageAutomatic(): Boolean
  def updateCommentFromSurvey(newValue: js.Any): js.Any
  def updateValueFromSurvey(newValue: js.Any): js.Any
  def updateValueWithDefaults(): js.Any
}

object IQuestion {
  @scala.inline
  def apply(
    clearErrors: CallbackTo[js.Any],
    clearIncorrectValues: CallbackTo[js.Any],
    clearUnusedValues: CallbackTo[js.Any],
    clearValue: CallbackTo[js.Any],
    clearValueIfInvisible: CallbackTo[js.Any],
    containsErrors: Boolean,
    delete: CallbackTo[js.Any],
    getDisplayValue: (Boolean, js.Any) => CallbackTo[js.Any],
    getErrorCustomText: (String, SurveyError) => CallbackTo[String],
    getLayoutType: CallbackTo[String],
    getLocale: CallbackTo[String],
    getMarkdownHtml: String => CallbackTo[String],
    getPanel: CallbackTo[IPanel],
    getProcessedText: String => CallbackTo[String],
    getQuestionFromArray: (String, Double) => CallbackTo[IQuestion],
    getType: CallbackTo[String],
    getValueName: CallbackTo[String],
    hasTitle: Boolean,
    isAnswerCorrect: CallbackTo[Boolean],
    isEmpty: CallbackTo[Boolean],
    isLayoutTypeSupported: String => CallbackTo[Boolean],
    isPage: Boolean,
    isPanel: Boolean,
    isReadOnly: Boolean,
    isVisible: Boolean,
    locStrsChanged: CallbackTo[js.Any],
    name: String,
    onAnyValueChanged: String => CallbackTo[js.Any],
    onFirstRendering: CallbackTo[js.Any],
    onSurveyLoad: CallbackTo[js.Any],
    onSurveyValueChanged: js.Any => CallbackTo[js.Any],
    parent: IPanel,
    removeElement: IElement => CallbackTo[Boolean],
    renderWidth: String,
    rightIndent: Double,
    runCondition: (HashTable[js.Any], HashTable[js.Any]) => CallbackTo[js.Any],
    setSurveyImpl: ISurveyImpl => CallbackTo[js.Any],
    setVisibleIndex: Double => CallbackTo[Double],
    startWithNewLine: Boolean,
    supportGoNextPageAutomatic: CallbackTo[Boolean],
    updateCommentFromSurvey: js.Any => CallbackTo[js.Any],
    updateCustomWidgets: CallbackTo[js.Any],
    updateValueFromSurvey: js.Any => CallbackTo[js.Any],
    updateValueWithDefaults: CallbackTo[js.Any],
    value: js.Any,
    visible: Boolean,
    width: String
  ): IQuestion = {
    val __obj = js.Dynamic.literal(containsErrors = containsErrors.asInstanceOf[js.Any], hasTitle = hasTitle.asInstanceOf[js.Any], isPage = isPage.asInstanceOf[js.Any], isPanel = isPanel.asInstanceOf[js.Any], isReadOnly = isReadOnly.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], renderWidth = renderWidth.asInstanceOf[js.Any], rightIndent = rightIndent.asInstanceOf[js.Any], startWithNewLine = startWithNewLine.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("clearErrors")(clearErrors.toJsFn)
    __obj.updateDynamic("clearIncorrectValues")(clearIncorrectValues.toJsFn)
    __obj.updateDynamic("clearUnusedValues")(clearUnusedValues.toJsFn)
    __obj.updateDynamic("clearValue")(clearValue.toJsFn)
    __obj.updateDynamic("clearValueIfInvisible")(clearValueIfInvisible.toJsFn)
    __obj.updateDynamic("delete")(delete.toJsFn)
    __obj.updateDynamic("getDisplayValue")(js.Any.fromFunction2((t0: scala.Boolean, t1: js.Any) => getDisplayValue(t0, t1).runNow()))
    __obj.updateDynamic("getErrorCustomText")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.surveyKnockout.mod.SurveyError) => getErrorCustomText(t0, t1).runNow()))
    __obj.updateDynamic("getLayoutType")(getLayoutType.toJsFn)
    __obj.updateDynamic("getLocale")(getLocale.toJsFn)
    __obj.updateDynamic("getMarkdownHtml")(js.Any.fromFunction1((t0: java.lang.String) => getMarkdownHtml(t0).runNow()))
    __obj.updateDynamic("getPanel")(getPanel.toJsFn)
    __obj.updateDynamic("getProcessedText")(js.Any.fromFunction1((t0: java.lang.String) => getProcessedText(t0).runNow()))
    __obj.updateDynamic("getQuestionFromArray")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => getQuestionFromArray(t0, t1).runNow()))
    __obj.updateDynamic("getType")(getType.toJsFn)
    __obj.updateDynamic("getValueName")(getValueName.toJsFn)
    __obj.updateDynamic("isAnswerCorrect")(isAnswerCorrect.toJsFn)
    __obj.updateDynamic("isEmpty")(isEmpty.toJsFn)
    __obj.updateDynamic("isLayoutTypeSupported")(js.Any.fromFunction1((t0: java.lang.String) => isLayoutTypeSupported(t0).runNow()))
    __obj.updateDynamic("locStrsChanged")(locStrsChanged.toJsFn)
    __obj.updateDynamic("onAnyValueChanged")(js.Any.fromFunction1((t0: java.lang.String) => onAnyValueChanged(t0).runNow()))
    __obj.updateDynamic("onFirstRendering")(onFirstRendering.toJsFn)
    __obj.updateDynamic("onSurveyLoad")(onSurveyLoad.toJsFn)
    __obj.updateDynamic("onSurveyValueChanged")(js.Any.fromFunction1((t0: js.Any) => onSurveyValueChanged(t0).runNow()))
    __obj.updateDynamic("removeElement")(js.Any.fromFunction1((t0: typingsJapgolly.surveyKnockout.mod.IElement) => removeElement(t0).runNow()))
    __obj.updateDynamic("runCondition")(js.Any.fromFunction2((t0: typingsJapgolly.surveyKnockout.mod.HashTable[js.Any], t1: typingsJapgolly.surveyKnockout.mod.HashTable[js.Any]) => runCondition(t0, t1).runNow()))
    __obj.updateDynamic("setSurveyImpl")(js.Any.fromFunction1((t0: typingsJapgolly.surveyKnockout.mod.ISurveyImpl) => setSurveyImpl(t0).runNow()))
    __obj.updateDynamic("setVisibleIndex")(js.Any.fromFunction1((t0: scala.Double) => setVisibleIndex(t0).runNow()))
    __obj.updateDynamic("supportGoNextPageAutomatic")(supportGoNextPageAutomatic.toJsFn)
    __obj.updateDynamic("updateCommentFromSurvey")(js.Any.fromFunction1((t0: js.Any) => updateCommentFromSurvey(t0).runNow()))
    __obj.updateDynamic("updateCustomWidgets")(updateCustomWidgets.toJsFn)
    __obj.updateDynamic("updateValueFromSurvey")(js.Any.fromFunction1((t0: js.Any) => updateValueFromSurvey(t0).runNow()))
    __obj.updateDynamic("updateValueWithDefaults")(updateValueWithDefaults.toJsFn)
    __obj.asInstanceOf[IQuestion]
  }
}

