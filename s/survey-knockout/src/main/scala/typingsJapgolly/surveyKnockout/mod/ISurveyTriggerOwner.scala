package typingsJapgolly.surveyKnockout.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISurveyTriggerOwner extends js.Object {
  def copyTriggerValue(name: String, fromName: String): js.Any
  def focusQuestion(name: String): Boolean
  def getObjects(pages: js.Array[String], questions: js.Array[String]): js.Array[_]
  def setCompleted(): js.Any
  def setTriggerValue(name: String, value: js.Any, isVariable: Boolean): js.Any
}

object ISurveyTriggerOwner {
  @scala.inline
  def apply(
    copyTriggerValue: (String, String) => CallbackTo[js.Any],
    focusQuestion: String => CallbackTo[Boolean],
    getObjects: (js.Array[String], js.Array[String]) => CallbackTo[js.Array[js.Any]],
    setCompleted: CallbackTo[js.Any],
    setTriggerValue: (String, js.Any, Boolean) => CallbackTo[js.Any]
  ): ISurveyTriggerOwner = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("copyTriggerValue")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => copyTriggerValue(t0, t1).runNow()))
    __obj.updateDynamic("focusQuestion")(js.Any.fromFunction1((t0: java.lang.String) => focusQuestion(t0).runNow()))
    __obj.updateDynamic("getObjects")(js.Any.fromFunction2((t0: js.Array[java.lang.String], t1: js.Array[java.lang.String]) => getObjects(t0, t1).runNow()))
    __obj.updateDynamic("setCompleted")(setCompleted.toJsFn)
    __obj.updateDynamic("setTriggerValue")(js.Any.fromFunction3((t0: java.lang.String, t1: js.Any, t2: scala.Boolean) => setTriggerValue(t0, t1, t2).runNow()))
    __obj.asInstanceOf[ISurveyTriggerOwner]
  }
}

