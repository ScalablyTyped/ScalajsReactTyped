package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScriptSnapshot extends js.Object {
  def getLength(): Double
  def getLineStartPositions(): js.Array[Double]
  def getText(start: Double, end: Double): String
  def getTextChangeRangeSinceVersion(scriptVersion: Double): TextChangeRange
}

object IScriptSnapshot {
  @scala.inline
  def apply(
    getLength: CallbackTo[Double],
    getLineStartPositions: CallbackTo[js.Array[Double]],
    getText: (Double, Double) => CallbackTo[String],
    getTextChangeRangeSinceVersion: Double => CallbackTo[TextChangeRange]
  ): IScriptSnapshot = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getLength")(getLength.toJsFn)
    __obj.updateDynamic("getLineStartPositions")(getLineStartPositions.toJsFn)
    __obj.updateDynamic("getText")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => getText(t0, t1).runNow()))
    __obj.updateDynamic("getTextChangeRangeSinceVersion")(js.Any.fromFunction1((t0: scala.Double) => getTextChangeRangeSinceVersion(t0).runNow()))
    __obj.asInstanceOf[IScriptSnapshot]
  }
}

