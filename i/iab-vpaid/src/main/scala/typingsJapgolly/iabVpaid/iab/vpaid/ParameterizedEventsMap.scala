package typingsJapgolly.iabVpaid.iab.vpaid

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParameterizedEventsMap extends js.Object {
  def AdClickThru(url: String, id: String, playerHandles: Boolean): Unit
  def AdError(message: String): Unit
  def AdInteraction(id: String): Unit
  def AdLog(id: String): Unit
}

object ParameterizedEventsMap {
  @scala.inline
  def apply(
    AdClickThru: (String, String, Boolean) => Callback,
    AdError: String => Callback,
    AdInteraction: String => Callback,
    AdLog: String => Callback
  ): ParameterizedEventsMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AdClickThru")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: scala.Boolean) => AdClickThru(t0, t1, t2).runNow()))
    __obj.updateDynamic("AdError")(js.Any.fromFunction1((t0: java.lang.String) => AdError(t0).runNow()))
    __obj.updateDynamic("AdInteraction")(js.Any.fromFunction1((t0: java.lang.String) => AdInteraction(t0).runNow()))
    __obj.updateDynamic("AdLog")(js.Any.fromFunction1((t0: java.lang.String) => AdLog(t0).runNow()))
    __obj.asInstanceOf[ParameterizedEventsMap]
  }
}

