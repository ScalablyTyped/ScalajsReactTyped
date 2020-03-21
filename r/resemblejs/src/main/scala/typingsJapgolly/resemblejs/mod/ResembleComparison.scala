package typingsJapgolly.resemblejs.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResembleComparison extends js.Object {
  def ignoreAntialiasing(): ResembleComparison
  def ignoreColors(): ResembleComparison
  def ignoreNothing(): ResembleComparison
  /**
    * Run the analysis and get the comparison result
    */
  def onComplete(callback: js.Function1[/* result */ ResembleComparisonResult, Unit]): Unit
  def repaint(): ResembleComparison
}

object ResembleComparison {
  @scala.inline
  def apply(
    ignoreAntialiasing: CallbackTo[ResembleComparison],
    ignoreColors: CallbackTo[ResembleComparison],
    ignoreNothing: CallbackTo[ResembleComparison],
    onComplete: js.Function1[/* result */ ResembleComparisonResult, Unit] => Callback,
    repaint: CallbackTo[ResembleComparison]
  ): ResembleComparison = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ignoreAntialiasing")(ignoreAntialiasing.toJsFn)
    __obj.updateDynamic("ignoreColors")(ignoreColors.toJsFn)
    __obj.updateDynamic("ignoreNothing")(ignoreNothing.toJsFn)
    __obj.updateDynamic("onComplete")(js.Any.fromFunction1((t0: js.Function1[/* result */ typingsJapgolly.resemblejs.mod.ResembleComparisonResult, scala.Unit]) => onComplete(t0).runNow()))
    __obj.updateDynamic("repaint")(repaint.toJsFn)
    __obj.asInstanceOf[ResembleComparison]
  }
}

