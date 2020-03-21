package typingsJapgolly.surveyKnockout.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IElement
  extends IConditionRunner
     with ISurveyElement {
  var parent: IPanel
  var renderWidth: String
  var rightIndent: Double
  var startWithNewLine: Boolean
  var visible: Boolean
  var width: String
  def clearErrors(): js.Any
  def clearIncorrectValues(): js.Any
  def getLayoutType(): String
  def getPanel(): IPanel
  def isLayoutTypeSupported(layoutType: String): Boolean
  def onAnyValueChanged(name: String): js.Any
  def removeElement(el: IElement): Boolean
  def updateCustomWidgets(): js.Any
}

object IElement {
  @scala.inline
  def apply(
    clearErrors: CallbackTo[js.Any],
    clearIncorrectValues: CallbackTo[js.Any],
    containsErrors: Boolean,
    delete: CallbackTo[js.Any],
    getLayoutType: CallbackTo[String],
    getPanel: CallbackTo[IPanel],
    getType: CallbackTo[String],
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
    parent: IPanel,
    removeElement: IElement => CallbackTo[Boolean],
    renderWidth: String,
    rightIndent: Double,
    runCondition: (HashTable[js.Any], HashTable[js.Any]) => CallbackTo[js.Any],
    setSurveyImpl: ISurveyImpl => CallbackTo[js.Any],
    setVisibleIndex: Double => CallbackTo[Double],
    startWithNewLine: Boolean,
    updateCustomWidgets: CallbackTo[js.Any],
    visible: Boolean,
    width: String
  ): IElement = {
    val __obj = js.Dynamic.literal(containsErrors = containsErrors.asInstanceOf[js.Any], isPage = isPage.asInstanceOf[js.Any], isPanel = isPanel.asInstanceOf[js.Any], isReadOnly = isReadOnly.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], renderWidth = renderWidth.asInstanceOf[js.Any], rightIndent = rightIndent.asInstanceOf[js.Any], startWithNewLine = startWithNewLine.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("clearErrors")(clearErrors.toJsFn)
    __obj.updateDynamic("clearIncorrectValues")(clearIncorrectValues.toJsFn)
    __obj.updateDynamic("delete")(delete.toJsFn)
    __obj.updateDynamic("getLayoutType")(getLayoutType.toJsFn)
    __obj.updateDynamic("getPanel")(getPanel.toJsFn)
    __obj.updateDynamic("getType")(getType.toJsFn)
    __obj.updateDynamic("isLayoutTypeSupported")(js.Any.fromFunction1((t0: java.lang.String) => isLayoutTypeSupported(t0).runNow()))
    __obj.updateDynamic("locStrsChanged")(locStrsChanged.toJsFn)
    __obj.updateDynamic("onAnyValueChanged")(js.Any.fromFunction1((t0: java.lang.String) => onAnyValueChanged(t0).runNow()))
    __obj.updateDynamic("onFirstRendering")(onFirstRendering.toJsFn)
    __obj.updateDynamic("onSurveyLoad")(onSurveyLoad.toJsFn)
    __obj.updateDynamic("removeElement")(js.Any.fromFunction1((t0: typingsJapgolly.surveyKnockout.mod.IElement) => removeElement(t0).runNow()))
    __obj.updateDynamic("runCondition")(js.Any.fromFunction2((t0: typingsJapgolly.surveyKnockout.mod.HashTable[js.Any], t1: typingsJapgolly.surveyKnockout.mod.HashTable[js.Any]) => runCondition(t0, t1).runNow()))
    __obj.updateDynamic("setSurveyImpl")(js.Any.fromFunction1((t0: typingsJapgolly.surveyKnockout.mod.ISurveyImpl) => setSurveyImpl(t0).runNow()))
    __obj.updateDynamic("setVisibleIndex")(js.Any.fromFunction1((t0: scala.Double) => setVisibleIndex(t0).runNow()))
    __obj.updateDynamic("updateCustomWidgets")(updateCustomWidgets.toJsFn)
    __obj.asInstanceOf[IElement]
  }
}

