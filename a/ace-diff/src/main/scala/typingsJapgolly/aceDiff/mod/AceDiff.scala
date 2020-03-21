package typingsJapgolly.aceDiff.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.aceDiff.AnonLeft
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AceDiff extends js.Object {
  def destroy(): Unit
  def diff(): Unit
  def getEditors(): AnonLeft
  def getNumDiffs(): Double
  def setOptions(options: AceDiffOpts): Unit
}

object AceDiff {
  @scala.inline
  def apply(
    destroy: Callback,
    diff: Callback,
    getEditors: CallbackTo[AnonLeft],
    getNumDiffs: CallbackTo[Double],
    setOptions: AceDiffOpts => Callback
  ): AceDiff = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("diff")(diff.toJsFn)
    __obj.updateDynamic("getEditors")(getEditors.toJsFn)
    __obj.updateDynamic("getNumDiffs")(getNumDiffs.toJsFn)
    __obj.updateDynamic("setOptions")(js.Any.fromFunction1((t0: typingsJapgolly.aceDiff.mod.AceDiffOpts) => setOptions(t0).runNow()))
    __obj.asInstanceOf[AceDiff]
  }
}

