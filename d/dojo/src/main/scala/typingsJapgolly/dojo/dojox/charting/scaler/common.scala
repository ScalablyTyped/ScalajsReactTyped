package typingsJapgolly.dojo.dojox.charting.scaler

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/charting/scaler/common.html
  *
  *
  */
trait common extends js.Object {
  /**
    *
    * @param moduleName
    * @param ifloaded
    * @param ifnotloaded
    */
  def doIfLoaded(moduleName: js.Any, ifloaded: js.Any, ifnotloaded: js.Any): js.Any
  /**
    *
    * @param number
    * @param precision
    * @param kwArgs
    */
  def getNumericLabel(number: Double, precision: Double, kwArgs: js.Object): js.Any
}

object common {
  @scala.inline
  def apply(
    doIfLoaded: (js.Any, js.Any, js.Any) => CallbackTo[js.Any],
    getNumericLabel: (Double, Double, js.Object) => CallbackTo[js.Any]
  ): common = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("doIfLoaded")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Any) => doIfLoaded(t0, t1, t2).runNow()))
    __obj.updateDynamic("getNumericLabel")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: js.Object) => getNumericLabel(t0, t1, t2).runNow()))
    __obj.asInstanceOf[common]
  }
}

