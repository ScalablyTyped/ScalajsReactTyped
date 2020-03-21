package typingsJapgolly.surveyKnockout.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMultipleTextData
  extends IPanel
     with ILocalizableOwner {
  def getAllValues(): js.Any
  def getIsRequiredText(): String
  def getItemDefaultValue(name: String): js.Any
  def getMultipleTextValue(name: String): js.Any
  def getSurvey(): ISurvey
  def getTextProcessor(): ITextProcessor
  def setMultipleTextValue(name: String, value: js.Any): js.Any
}

object IMultipleTextData {
  @scala.inline
  def apply(
    addElement: (IElement, Double) => CallbackTo[js.Any],
    containsErrors: Boolean,
    delete: CallbackTo[js.Any],
    elementWidthChanged: IElement => CallbackTo[js.Any],
    elements: js.Array[IElement],
    getAllValues: CallbackTo[js.Any],
    getChildrenLayoutType: CallbackTo[String],
    getIsRequiredText: CallbackTo[String],
    getItemDefaultValue: String => CallbackTo[js.Any],
    getLocale: CallbackTo[String],
    getMarkdownHtml: String => CallbackTo[String],
    getMultipleTextValue: String => CallbackTo[js.Any],
    getProcessedText: String => CallbackTo[String],
    getQuestionTitleLocation: CallbackTo[String],
    getSurvey: CallbackTo[ISurvey],
    getTextProcessor: CallbackTo[ITextProcessor],
    getType: CallbackTo[String],
    indexOf: IElement => CallbackTo[Double],
    isPage: Boolean,
    isPanel: Boolean,
    isReadOnly: Boolean,
    isVisible: Boolean,
    locStrsChanged: CallbackTo[js.Any],
    name: String,
    onFirstRendering: CallbackTo[js.Any],
    onSurveyLoad: CallbackTo[js.Any],
    parent: IPanel,
    removeElement: IElement => CallbackTo[Boolean],
    setMultipleTextValue: (String, js.Any) => CallbackTo[js.Any],
    setSurveyImpl: ISurveyImpl => CallbackTo[js.Any],
    setVisibleIndex: Double => CallbackTo[Double]
  ): IMultipleTextData = {
    val __obj = js.Dynamic.literal(containsErrors = containsErrors.asInstanceOf[js.Any], elements = elements.asInstanceOf[js.Any], isPage = isPage.asInstanceOf[js.Any], isPanel = isPanel.asInstanceOf[js.Any], isReadOnly = isReadOnly.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("addElement")(js.Any.fromFunction2((t0: typingsJapgolly.surveyKnockout.mod.IElement, t1: scala.Double) => addElement(t0, t1).runNow()))
    __obj.updateDynamic("delete")(delete.toJsFn)
    __obj.updateDynamic("elementWidthChanged")(js.Any.fromFunction1((t0: typingsJapgolly.surveyKnockout.mod.IElement) => elementWidthChanged(t0).runNow()))
    __obj.updateDynamic("getAllValues")(getAllValues.toJsFn)
    __obj.updateDynamic("getChildrenLayoutType")(getChildrenLayoutType.toJsFn)
    __obj.updateDynamic("getIsRequiredText")(getIsRequiredText.toJsFn)
    __obj.updateDynamic("getItemDefaultValue")(js.Any.fromFunction1((t0: java.lang.String) => getItemDefaultValue(t0).runNow()))
    __obj.updateDynamic("getLocale")(getLocale.toJsFn)
    __obj.updateDynamic("getMarkdownHtml")(js.Any.fromFunction1((t0: java.lang.String) => getMarkdownHtml(t0).runNow()))
    __obj.updateDynamic("getMultipleTextValue")(js.Any.fromFunction1((t0: java.lang.String) => getMultipleTextValue(t0).runNow()))
    __obj.updateDynamic("getProcessedText")(js.Any.fromFunction1((t0: java.lang.String) => getProcessedText(t0).runNow()))
    __obj.updateDynamic("getQuestionTitleLocation")(getQuestionTitleLocation.toJsFn)
    __obj.updateDynamic("getSurvey")(getSurvey.toJsFn)
    __obj.updateDynamic("getTextProcessor")(getTextProcessor.toJsFn)
    __obj.updateDynamic("getType")(getType.toJsFn)
    __obj.updateDynamic("indexOf")(js.Any.fromFunction1((t0: typingsJapgolly.surveyKnockout.mod.IElement) => indexOf(t0).runNow()))
    __obj.updateDynamic("locStrsChanged")(locStrsChanged.toJsFn)
    __obj.updateDynamic("onFirstRendering")(onFirstRendering.toJsFn)
    __obj.updateDynamic("onSurveyLoad")(onSurveyLoad.toJsFn)
    __obj.updateDynamic("removeElement")(js.Any.fromFunction1((t0: typingsJapgolly.surveyKnockout.mod.IElement) => removeElement(t0).runNow()))
    __obj.updateDynamic("setMultipleTextValue")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => setMultipleTextValue(t0, t1).runNow()))
    __obj.updateDynamic("setSurveyImpl")(js.Any.fromFunction1((t0: typingsJapgolly.surveyKnockout.mod.ISurveyImpl) => setSurveyImpl(t0).runNow()))
    __obj.updateDynamic("setVisibleIndex")(js.Any.fromFunction1((t0: scala.Double) => setVisibleIndex(t0).runNow()))
    __obj.asInstanceOf[IMultipleTextData]
  }
}

