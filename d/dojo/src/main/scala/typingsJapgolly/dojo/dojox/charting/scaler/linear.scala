package typingsJapgolly.dojo.dojox.charting.scaler

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/charting/scaler/linear.html
  *
  *
  */
trait linear extends js.Object {
  /**
    *
    * @param min
    * @param max
    * @param span
    * @param kwArgs
    * @param delta               Optional
    * @param minorDelta               Optional
    */
  def buildScaler(min: Double, max: Double, span: Double, kwArgs: js.Object, delta: Double, minorDelta: Double): js.Any
  /**
    *
    * @param scaler
    * @param kwArgs
    */
  def buildTicks(scaler: js.Object, kwArgs: js.Object): js.Any
  /**
    *
    * @param scaler
    */
  def getTransformerFromModel(scaler: js.Object): js.Function
  /**
    *
    * @param scaler
    */
  def getTransformerFromPlot(scaler: js.Object): js.Function
}

object linear {
  @scala.inline
  def apply(
    buildScaler: (Double, Double, Double, js.Object, Double, Double) => CallbackTo[js.Any],
    buildTicks: (js.Object, js.Object) => CallbackTo[js.Any],
    getTransformerFromModel: js.Object => CallbackTo[js.Function],
    getTransformerFromPlot: js.Object => CallbackTo[js.Function]
  ): linear = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("buildScaler")(js.Any.fromFunction6((t0: scala.Double, t1: scala.Double, t2: scala.Double, t3: js.Object, t4: scala.Double, t5: scala.Double) => buildScaler(t0, t1, t2, t3, t4, t5).runNow()))
    __obj.updateDynamic("buildTicks")(js.Any.fromFunction2((t0: js.Object, t1: js.Object) => buildTicks(t0, t1).runNow()))
    __obj.updateDynamic("getTransformerFromModel")(js.Any.fromFunction1((t0: js.Object) => getTransformerFromModel(t0).runNow()))
    __obj.updateDynamic("getTransformerFromPlot")(js.Any.fromFunction1((t0: js.Object) => getTransformerFromPlot(t0).runNow()))
    __obj.asInstanceOf[linear]
  }
}

