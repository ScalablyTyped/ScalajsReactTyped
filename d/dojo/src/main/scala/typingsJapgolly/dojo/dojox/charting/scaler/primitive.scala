package typingsJapgolly.dojo.dojox.charting.scaler

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/charting/scaler/primitive.html
  *
  *
  */
trait primitive extends js.Object {
  /**
    *
    * @param min
    * @param max
    * @param span
    * @param kwArgs
    */
  def buildScaler(min: Double, max: Double, span: Double, kwArgs: js.Object): js.Object
  /**
    *
    * @param scaler
    * @param kwArgs
    */
  def buildTicks(scaler: js.Object, kwArgs: js.Object): js.Object
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

object primitive {
  @scala.inline
  def apply(
    buildScaler: (Double, Double, Double, js.Object) => CallbackTo[js.Object],
    buildTicks: (js.Object, js.Object) => CallbackTo[js.Object],
    getTransformerFromModel: js.Object => CallbackTo[js.Function],
    getTransformerFromPlot: js.Object => CallbackTo[js.Function]
  ): primitive = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("buildScaler")(js.Any.fromFunction4((t0: scala.Double, t1: scala.Double, t2: scala.Double, t3: js.Object) => buildScaler(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("buildTicks")(js.Any.fromFunction2((t0: js.Object, t1: js.Object) => buildTicks(t0, t1).runNow()))
    __obj.updateDynamic("getTransformerFromModel")(js.Any.fromFunction1((t0: js.Object) => getTransformerFromModel(t0).runNow()))
    __obj.updateDynamic("getTransformerFromPlot")(js.Any.fromFunction1((t0: js.Object) => getTransformerFromPlot(t0).runNow()))
    __obj.asInstanceOf[primitive]
  }
}

