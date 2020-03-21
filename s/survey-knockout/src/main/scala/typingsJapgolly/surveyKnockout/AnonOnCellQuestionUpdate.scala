package typingsJapgolly.surveyKnockout

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnCellQuestionUpdate extends js.Object {
  var properties: js.Array[String]
  def onCellQuestionUpdate(cellQuestion: js.Any, column: js.Any, question: js.Any, data: js.Any): Unit
}

object AnonOnCellQuestionUpdate {
  @scala.inline
  def apply(onCellQuestionUpdate: (js.Any, js.Any, js.Any, js.Any) => Callback, properties: js.Array[String]): AnonOnCellQuestionUpdate = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("onCellQuestionUpdate")(js.Any.fromFunction4((t0: js.Any, t1: js.Any, t2: js.Any, t3: js.Any) => onCellQuestionUpdate(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[AnonOnCellQuestionUpdate]
  }
}

