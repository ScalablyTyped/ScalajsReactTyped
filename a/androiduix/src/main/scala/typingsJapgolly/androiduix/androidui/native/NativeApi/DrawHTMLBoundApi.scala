package typingsJapgolly.androiduix.androidui.native.NativeApi

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawHTMLBoundApi extends js.Object {
  def hideDrawHTMLBound(viewHash: Double): Unit
  def showDrawHTMLBound(viewHash: Double, left: Double, top: Double, right: Double, bottom: Double): Unit
}

object DrawHTMLBoundApi {
  @scala.inline
  def apply(
    hideDrawHTMLBound: Double => Callback,
    showDrawHTMLBound: (Double, Double, Double, Double, Double) => Callback
  ): DrawHTMLBoundApi = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hideDrawHTMLBound")(js.Any.fromFunction1((t0: scala.Double) => hideDrawHTMLBound(t0).runNow()))
    __obj.updateDynamic("showDrawHTMLBound")(js.Any.fromFunction5((t0: scala.Double, t1: scala.Double, t2: scala.Double, t3: scala.Double, t4: scala.Double) => showDrawHTMLBound(t0, t1, t2, t3, t4).runNow()))
    __obj.asInstanceOf[DrawHTMLBoundApi]
  }
}

