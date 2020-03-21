package typingsJapgolly.jsplumb.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Connection extends js.Object {
  var endpoints: js.Tuple2[Endpoint, Endpoint]
  var id: ConnectionId
  def getElement(): Connection
  def getOverlay(s: String): Overlay
  def hideOverlay(s: String): Unit
  def repaint(): Unit
  def setDetachable(detachable: Boolean): Unit
  def setLabel(s: String): Unit
  def setParameter(name: String, value: js.Any): Unit
  def showOverlay(s: String): Unit
}

object Connection {
  @scala.inline
  def apply(
    endpoints: js.Tuple2[Endpoint, Endpoint],
    getElement: CallbackTo[Connection],
    getOverlay: String => CallbackTo[Overlay],
    hideOverlay: String => Callback,
    id: ConnectionId,
    repaint: Callback,
    setDetachable: Boolean => Callback,
    setLabel: String => Callback,
    setParameter: (String, js.Any) => Callback,
    showOverlay: String => Callback
  ): Connection = {
    val __obj = js.Dynamic.literal(endpoints = endpoints.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("getElement")(getElement.toJsFn)
    __obj.updateDynamic("getOverlay")(js.Any.fromFunction1((t0: java.lang.String) => getOverlay(t0).runNow()))
    __obj.updateDynamic("hideOverlay")(js.Any.fromFunction1((t0: java.lang.String) => hideOverlay(t0).runNow()))
    __obj.updateDynamic("repaint")(repaint.toJsFn)
    __obj.updateDynamic("setDetachable")(js.Any.fromFunction1((t0: scala.Boolean) => setDetachable(t0).runNow()))
    __obj.updateDynamic("setLabel")(js.Any.fromFunction1((t0: java.lang.String) => setLabel(t0).runNow()))
    __obj.updateDynamic("setParameter")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => setParameter(t0, t1).runNow()))
    __obj.updateDynamic("showOverlay")(js.Any.fromFunction1((t0: java.lang.String) => showOverlay(t0).runNow()))
    __obj.asInstanceOf[Connection]
  }
}

