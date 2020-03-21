package typingsJapgolly.stompit.connectFailoverMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.stompit.connectMod.ConnectOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectFailoverOptions extends js.Object {
  // Override the connect function
  var connectFunction: js.UndefOr[
    js.Function2[
      /* options */ ConnectOptions, 
      /* connectionListener */ js.UndefOr[
        js.Function2[/* err */ js.Error | Null, /* client */ typingsJapgolly.stompit.clientMod.^, Unit]
      ], 
      typingsJapgolly.stompit.clientMod.^
    ]
  ] = js.undefined
  // Milliseconds delay of the first reconnect
  var initialReconnectDelay: js.UndefOr[Double] = js.undefined
  // Maximum milliseconds delay of any reconnect
  var maxReconnectDelay: js.UndefOr[Double] = js.undefined
  // Maximum number of reconnects
  var maxReconnects: js.UndefOr[Double] = js.undefined
  // Randomly choose a server to use for reconnect
  var randomize: js.UndefOr[Boolean] = js.undefined
  // The exponent used in the exponential backoff attempts
  var reconnectDelayExponent: js.UndefOr[Double] = js.undefined
  // Exponential increase of the reconnect delay
  var useExponentialBackOff: js.UndefOr[Boolean] = js.undefined
}

object ConnectFailoverOptions {
  @scala.inline
  def apply(
    connectFunction: (/* options */ ConnectOptions, /* connectionListener */ js.UndefOr[
      js.Function2[/* err */ js.Error | Null, /* client */ typingsJapgolly.stompit.clientMod.^, Unit]
    ]) => CallbackTo[typingsJapgolly.stompit.clientMod.^] = null,
    initialReconnectDelay: Int | Double = null,
    maxReconnectDelay: Int | Double = null,
    maxReconnects: Int | Double = null,
    randomize: js.UndefOr[Boolean] = js.undefined,
    reconnectDelayExponent: Int | Double = null,
    useExponentialBackOff: js.UndefOr[Boolean] = js.undefined
  ): ConnectFailoverOptions = {
    val __obj = js.Dynamic.literal()
    if (connectFunction != null) __obj.updateDynamic("connectFunction")(js.Any.fromFunction2((t0: /* options */ typingsJapgolly.stompit.connectMod.ConnectOptions, t1: /* connectionListener */ js.UndefOr[
  js.Function2[
    /* err */ js.Error | scala.Null, 
    /* client */ typingsJapgolly.stompit.clientMod.^, 
    scala.Unit
  ]]) => connectFunction(t0, t1).runNow()))
    if (initialReconnectDelay != null) __obj.updateDynamic("initialReconnectDelay")(initialReconnectDelay.asInstanceOf[js.Any])
    if (maxReconnectDelay != null) __obj.updateDynamic("maxReconnectDelay")(maxReconnectDelay.asInstanceOf[js.Any])
    if (maxReconnects != null) __obj.updateDynamic("maxReconnects")(maxReconnects.asInstanceOf[js.Any])
    if (!js.isUndefined(randomize)) __obj.updateDynamic("randomize")(randomize.asInstanceOf[js.Any])
    if (reconnectDelayExponent != null) __obj.updateDynamic("reconnectDelayExponent")(reconnectDelayExponent.asInstanceOf[js.Any])
    if (!js.isUndefined(useExponentialBackOff)) __obj.updateDynamic("useExponentialBackOff")(useExponentialBackOff.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectFailoverOptions]
  }
}

