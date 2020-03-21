package typingsJapgolly.multivariateNormal.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Distribution extends js.Object {
  def getCov(): js.Array[js.Array[Double]]
  def getMean(): js.Array[Double]
  def sample(): js.Array[Double]
  def setCov(newCov: js.Array[js.Array[Double]]): Distribution
  def setMean(newMean: js.Array[Double]): Distribution
}

object Distribution {
  @scala.inline
  def apply(
    getCov: CallbackTo[js.Array[js.Array[Double]]],
    getMean: CallbackTo[js.Array[Double]],
    sample: CallbackTo[js.Array[Double]],
    setCov: js.Array[js.Array[Double]] => CallbackTo[Distribution],
    setMean: js.Array[Double] => CallbackTo[Distribution]
  ): Distribution = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getCov")(getCov.toJsFn)
    __obj.updateDynamic("getMean")(getMean.toJsFn)
    __obj.updateDynamic("sample")(sample.toJsFn)
    __obj.updateDynamic("setCov")(js.Any.fromFunction1((t0: js.Array[js.Array[scala.Double]]) => setCov(t0).runNow()))
    __obj.updateDynamic("setMean")(js.Any.fromFunction1((t0: js.Array[scala.Double]) => setMean(t0).runNow()))
    __obj.asInstanceOf[Distribution]
  }
}

