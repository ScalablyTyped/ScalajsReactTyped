package typingsJapgolly.phoenix

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.phoenix.mod.BinaryType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<phoenix.phoenix.SocketConnectOption> */
trait PartialSocketConnectOptio extends js.Object {
  var binaryType: js.UndefOr[BinaryType] = js.undefined
  var decode: js.UndefOr[
    js.Function2[/* payload */ String, /* callback */ js.Function1[/* decoded */ js.Any, Unit], Unit]
  ] = js.undefined
  var encode: js.UndefOr[
    js.Function2[
      /* payload */ js.Object, 
      /* callback */ js.Function1[/* encoded */ js.Any, Unit], 
      Unit
    ]
  ] = js.undefined
  var heartbeatIntervalMs: js.UndefOr[Double] = js.undefined
  var logger: js.UndefOr[js.Function3[/* kind */ String, /* message */ String, /* data */ js.Any, Unit]] = js.undefined
  var longpollerTimeout: js.UndefOr[Double] = js.undefined
  var params: js.UndefOr[js.Object | js.Function0[js.Object]] = js.undefined
  var reconnectAfterMs: js.UndefOr[js.Function1[/* tries */ Double, Double]] = js.undefined
  var rejoinAfterMs: js.UndefOr[js.Function1[/* tries */ Double, Double]] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var transport: js.UndefOr[String] = js.undefined
}

object PartialSocketConnectOptio {
  @scala.inline
  def apply(
    binaryType: BinaryType = null,
    decode: (/* payload */ String, /* callback */ js.Function1[/* decoded */ js.Any, Unit]) => Callback = null,
    encode: (/* payload */ js.Object, /* callback */ js.Function1[/* encoded */ js.Any, Unit]) => Callback = null,
    heartbeatIntervalMs: Int | Double = null,
    logger: (/* kind */ String, /* message */ String, /* data */ js.Any) => Callback = null,
    longpollerTimeout: Int | Double = null,
    params: js.Object | js.Function0[js.Object] = null,
    reconnectAfterMs: /* tries */ Double => CallbackTo[Double] = null,
    rejoinAfterMs: /* tries */ Double => CallbackTo[Double] = null,
    timeout: Int | Double = null,
    transport: String = null
  ): PartialSocketConnectOptio = {
    val __obj = js.Dynamic.literal()
    if (binaryType != null) __obj.updateDynamic("binaryType")(binaryType.asInstanceOf[js.Any])
    if (decode != null) __obj.updateDynamic("decode")(js.Any.fromFunction2((t0: /* payload */ java.lang.String, t1: /* callback */ js.Function1[/* decoded */ js.Any, scala.Unit]) => decode(t0, t1).runNow()))
    if (encode != null) __obj.updateDynamic("encode")(js.Any.fromFunction2((t0: /* payload */ js.Object, t1: /* callback */ js.Function1[/* encoded */ js.Any, scala.Unit]) => encode(t0, t1).runNow()))
    if (heartbeatIntervalMs != null) __obj.updateDynamic("heartbeatIntervalMs")(heartbeatIntervalMs.asInstanceOf[js.Any])
    if (logger != null) __obj.updateDynamic("logger")(js.Any.fromFunction3((t0: /* kind */ java.lang.String, t1: /* message */ java.lang.String, t2: /* data */ js.Any) => logger(t0, t1, t2).runNow()))
    if (longpollerTimeout != null) __obj.updateDynamic("longpollerTimeout")(longpollerTimeout.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (reconnectAfterMs != null) __obj.updateDynamic("reconnectAfterMs")(js.Any.fromFunction1((t0: /* tries */ scala.Double) => reconnectAfterMs(t0).runNow()))
    if (rejoinAfterMs != null) __obj.updateDynamic("rejoinAfterMs")(js.Any.fromFunction1((t0: /* tries */ scala.Double) => rejoinAfterMs(t0).runNow()))
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (transport != null) __obj.updateDynamic("transport")(transport.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialSocketConnectOptio]
  }
}

