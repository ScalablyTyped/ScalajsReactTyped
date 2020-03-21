package typingsJapgolly.tensorflowTfjsData.testUtilsMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FakeAnalyser extends js.Object {
  var fftSize: Double
  var smoothingTimeConstant: Double
  var x: js.Any
  def disconnect(): Unit
  def getFloatFrequencyData(data: scala.scalajs.js.typedarray.Float32Array): Unit
  def getFloatTimeDomainData(data: scala.scalajs.js.typedarray.Float32Array): Unit
}

object FakeAnalyser {
  @scala.inline
  def apply(
    disconnect: Callback,
    fftSize: Double,
    getFloatFrequencyData: scala.scalajs.js.typedarray.Float32Array => Callback,
    getFloatTimeDomainData: scala.scalajs.js.typedarray.Float32Array => Callback,
    smoothingTimeConstant: Double,
    x: js.Any
  ): FakeAnalyser = {
    val __obj = js.Dynamic.literal(fftSize = fftSize.asInstanceOf[js.Any], smoothingTimeConstant = smoothingTimeConstant.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any])
    __obj.updateDynamic("disconnect")(disconnect.toJsFn)
    __obj.updateDynamic("getFloatFrequencyData")(js.Any.fromFunction1((t0: scala.scalajs.js.typedarray.Float32Array) => getFloatFrequencyData(t0).runNow()))
    __obj.updateDynamic("getFloatTimeDomainData")(js.Any.fromFunction1((t0: scala.scalajs.js.typedarray.Float32Array) => getFloatTimeDomainData(t0).runNow()))
    __obj.asInstanceOf[FakeAnalyser]
  }
}

