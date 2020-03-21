package typingsJapgolly.typescriptServices.TypeScript.Services

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScriptSnapshotShim extends js.Object {
  def getLength(): Double
  def getLineStartPositions(): String
  def getText(start: Double, end: Double): String
  def getTextChangeRangeSinceVersion(scriptVersion: Double): String
}

object IScriptSnapshotShim {
  @scala.inline
  def apply(
    getLength: CallbackTo[Double],
    getLineStartPositions: CallbackTo[String],
    getText: (Double, Double) => CallbackTo[String],
    getTextChangeRangeSinceVersion: Double => CallbackTo[String]
  ): IScriptSnapshotShim = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getLength")(getLength.toJsFn)
    __obj.updateDynamic("getLineStartPositions")(getLineStartPositions.toJsFn)
    __obj.updateDynamic("getText")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => getText(t0, t1).runNow()))
    __obj.updateDynamic("getTextChangeRangeSinceVersion")(js.Any.fromFunction1((t0: scala.Double) => getTextChangeRangeSinceVersion(t0).runNow()))
    __obj.asInstanceOf[IScriptSnapshotShim]
  }
}

