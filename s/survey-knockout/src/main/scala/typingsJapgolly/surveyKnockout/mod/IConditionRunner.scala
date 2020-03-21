package typingsJapgolly.surveyKnockout.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConditionRunner extends js.Object {
  def runCondition(values: HashTable[_], properties: HashTable[_]): js.Any
}

object IConditionRunner {
  @scala.inline
  def apply(runCondition: (HashTable[js.Any], HashTable[js.Any]) => CallbackTo[js.Any]): IConditionRunner = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("runCondition")(js.Any.fromFunction2((t0: typingsJapgolly.surveyKnockout.mod.HashTable[js.Any], t1: typingsJapgolly.surveyKnockout.mod.HashTable[js.Any]) => runCondition(t0, t1).runNow()))
    __obj.asInstanceOf[IConditionRunner]
  }
}

