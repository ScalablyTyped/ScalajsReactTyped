package typingsJapgolly.surveyKnockout.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPage
  extends IPanel
     with IConditionRunner {
  var isStarted: Boolean
}

object IPage {
  @scala.inline
  def apply(
    addElement: (IElement, Double) => CallbackTo[js.Any],
    containsErrors: Boolean,
    delete: CallbackTo[js.Any],
    elementWidthChanged: IElement => CallbackTo[js.Any],
    elements: js.Array[IElement],
    getChildrenLayoutType: CallbackTo[String],
    getQuestionTitleLocation: CallbackTo[String],
    getType: CallbackTo[String],
    indexOf: IElement => CallbackTo[Double],
    isPage: Boolean,
    isPanel: Boolean,
    isReadOnly: Boolean,
    isStarted: Boolean,
    isVisible: Boolean,
    locStrsChanged: CallbackTo[js.Any],
    name: String,
    onFirstRendering: CallbackTo[js.Any],
    onSurveyLoad: CallbackTo[js.Any],
    parent: IPanel,
    removeElement: IElement => CallbackTo[Boolean],
    runCondition: (HashTable[js.Any], HashTable[js.Any]) => CallbackTo[js.Any],
    setSurveyImpl: ISurveyImpl => CallbackTo[js.Any],
    setVisibleIndex: Double => CallbackTo[Double]
  ): IPage = {
    val __obj = js.Dynamic.literal(containsErrors = containsErrors.asInstanceOf[js.Any], elements = elements.asInstanceOf[js.Any], isPage = isPage.asInstanceOf[js.Any], isPanel = isPanel.asInstanceOf[js.Any], isReadOnly = isReadOnly.asInstanceOf[js.Any], isStarted = isStarted.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("addElement")(js.Any.fromFunction2((t0: typingsJapgolly.surveyKnockout.mod.IElement, t1: scala.Double) => addElement(t0, t1).runNow()))
    __obj.updateDynamic("delete")(delete.toJsFn)
    __obj.updateDynamic("elementWidthChanged")(js.Any.fromFunction1((t0: typingsJapgolly.surveyKnockout.mod.IElement) => elementWidthChanged(t0).runNow()))
    __obj.updateDynamic("getChildrenLayoutType")(getChildrenLayoutType.toJsFn)
    __obj.updateDynamic("getQuestionTitleLocation")(getQuestionTitleLocation.toJsFn)
    __obj.updateDynamic("getType")(getType.toJsFn)
    __obj.updateDynamic("indexOf")(js.Any.fromFunction1((t0: typingsJapgolly.surveyKnockout.mod.IElement) => indexOf(t0).runNow()))
    __obj.updateDynamic("locStrsChanged")(locStrsChanged.toJsFn)
    __obj.updateDynamic("onFirstRendering")(onFirstRendering.toJsFn)
    __obj.updateDynamic("onSurveyLoad")(onSurveyLoad.toJsFn)
    __obj.updateDynamic("removeElement")(js.Any.fromFunction1((t0: typingsJapgolly.surveyKnockout.mod.IElement) => removeElement(t0).runNow()))
    __obj.updateDynamic("runCondition")(js.Any.fromFunction2((t0: typingsJapgolly.surveyKnockout.mod.HashTable[js.Any], t1: typingsJapgolly.surveyKnockout.mod.HashTable[js.Any]) => runCondition(t0, t1).runNow()))
    __obj.updateDynamic("setSurveyImpl")(js.Any.fromFunction1((t0: typingsJapgolly.surveyKnockout.mod.ISurveyImpl) => setSurveyImpl(t0).runNow()))
    __obj.updateDynamic("setVisibleIndex")(js.Any.fromFunction1((t0: scala.Double) => setVisibleIndex(t0).runNow()))
    __obj.asInstanceOf[IPage]
  }
}

