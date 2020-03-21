package typingsJapgolly.eloRank.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EloRank extends js.Object {
  def getExpected(a: Double, b: Double): Double
  def getKFactor(): Double
  def setKFactor(kFactor: Double): Unit
  def updateRating(expected: Double, actual: Double, current: Double): Double
}

object EloRank {
  @scala.inline
  def apply(
    getExpected: (Double, Double) => CallbackTo[Double],
    getKFactor: CallbackTo[Double],
    setKFactor: Double => Callback,
    updateRating: (Double, Double, Double) => CallbackTo[Double]
  ): EloRank = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getExpected")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => getExpected(t0, t1).runNow()))
    __obj.updateDynamic("getKFactor")(getKFactor.toJsFn)
    __obj.updateDynamic("setKFactor")(js.Any.fromFunction1((t0: scala.Double) => setKFactor(t0).runNow()))
    __obj.updateDynamic("updateRating")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => updateRating(t0, t1, t2).runNow()))
    __obj.asInstanceOf[EloRank]
  }
}

