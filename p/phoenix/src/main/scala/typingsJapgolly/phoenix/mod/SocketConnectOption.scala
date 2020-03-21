package typingsJapgolly.phoenix.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketConnectOption extends js.Object {
  var binaryType: BinaryType
  var heartbeatIntervalMs: Double
  var longpollerTimeout: Double
  var params: js.Object | js.Function0[js.Object]
  var timeout: Double
  var transport: String
  def decode(payload: String, callback: js.Function1[/* decoded */ js.Any, Unit]): Unit
  def encode(payload: js.Object, callback: js.Function1[/* encoded */ js.Any, Unit]): Unit
  def logger(kind: String, message: String, data: js.Any): Unit
  def reconnectAfterMs(tries: Double): Double
  def rejoinAfterMs(tries: Double): Double
}

object SocketConnectOption {
  @scala.inline
  def apply(
    binaryType: BinaryType,
    decode: (String, js.Function1[/* decoded */ js.Any, Unit]) => Callback,
    encode: (js.Object, js.Function1[/* encoded */ js.Any, Unit]) => Callback,
    heartbeatIntervalMs: Double,
    logger: (String, String, js.Any) => Callback,
    longpollerTimeout: Double,
    params: js.Object | js.Function0[js.Object],
    reconnectAfterMs: Double => CallbackTo[Double],
    rejoinAfterMs: Double => CallbackTo[Double],
    timeout: Double,
    transport: String
  ): SocketConnectOption = {
    val __obj = js.Dynamic.literal(binaryType = binaryType.asInstanceOf[js.Any], heartbeatIntervalMs = heartbeatIntervalMs.asInstanceOf[js.Any], longpollerTimeout = longpollerTimeout.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], transport = transport.asInstanceOf[js.Any])
    __obj.updateDynamic("decode")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* decoded */ js.Any, scala.Unit]) => decode(t0, t1).runNow()))
    __obj.updateDynamic("encode")(js.Any.fromFunction2((t0: js.Object, t1: js.Function1[/* encoded */ js.Any, scala.Unit]) => encode(t0, t1).runNow()))
    __obj.updateDynamic("logger")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: js.Any) => logger(t0, t1, t2).runNow()))
    __obj.updateDynamic("reconnectAfterMs")(js.Any.fromFunction1((t0: scala.Double) => reconnectAfterMs(t0).runNow()))
    __obj.updateDynamic("rejoinAfterMs")(js.Any.fromFunction1((t0: scala.Double) => rejoinAfterMs(t0).runNow()))
    __obj.asInstanceOf[SocketConnectOption]
  }
}

