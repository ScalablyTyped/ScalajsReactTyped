package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait hasLabels extends js.Object {
  def applyLabel(name: String): Unit
  def labels(): AdWordsSelector[Label]
  def removeLabel(name: String): Unit
}

object hasLabels {
  @scala.inline
  def apply(
    applyLabel: String => Callback,
    labels: CallbackTo[AdWordsSelector[Label]],
    removeLabel: String => Callback
  ): hasLabels = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("applyLabel")(js.Any.fromFunction1((t0: java.lang.String) => applyLabel(t0).runNow()))
    __obj.updateDynamic("labels")(labels.toJsFn)
    __obj.updateDynamic("removeLabel")(js.Any.fromFunction1((t0: java.lang.String) => removeLabel(t0).runNow()))
    __obj.asInstanceOf[hasLabels]
  }
}

