package typingsJapgolly.rsocketCore.rsocketserverMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.rsocketCore.rsocketleaseMod.Leases
import typingsJapgolly.rsocketCore.rsocketserializationMod.PayloadSerializers
import typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.Payload
import typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.ReactiveSocket
import typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.Responder
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerConfig[D, M] extends js.Object {
  var errorHandler: js.UndefOr[js.Function1[/* e */ js.Error, Unit]] = js.undefined
  var leases: js.UndefOr[js.Function0[Leases[_]]] = js.undefined
  var serializers: js.UndefOr[PayloadSerializers[D, M]] = js.undefined
  var transport: TransportServer
  def getRequestHandler(socket: ReactiveSocket[D, M], payload: Payload[D, M]): Partial[Responder[D, M]]
}

object ServerConfig {
  @scala.inline
  def apply[D, M](
    getRequestHandler: (ReactiveSocket[D, M], Payload[D, M]) => CallbackTo[Partial[Responder[D, M]]],
    transport: TransportServer,
    errorHandler: /* e */ js.Error => Callback = null,
    leases: js.UndefOr[CallbackTo[Leases[js.Any]]] = js.undefined,
    serializers: PayloadSerializers[D, M] = null
  ): ServerConfig[D, M] = {
    val __obj = js.Dynamic.literal(transport = transport.asInstanceOf[js.Any])
    __obj.updateDynamic("getRequestHandler")(js.Any.fromFunction2((t0: typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.ReactiveSocket[D, M], t1: typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.Payload[D, M]) => getRequestHandler(t0, t1).runNow()))
    if (errorHandler != null) __obj.updateDynamic("errorHandler")(js.Any.fromFunction1((t0: /* e */ js.Error) => errorHandler(t0).runNow()))
    leases.foreach(p => __obj.updateDynamic("leases")(p.toJsFn))
    if (serializers != null) __obj.updateDynamic("serializers")(serializers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerConfig[D, M]]
  }
}

