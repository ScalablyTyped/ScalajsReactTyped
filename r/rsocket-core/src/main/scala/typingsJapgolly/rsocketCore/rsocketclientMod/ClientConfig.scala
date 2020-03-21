package typingsJapgolly.rsocketCore.rsocketclientMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.rsocketCore.AnonDataMimeType
import typingsJapgolly.rsocketCore.rsocketleaseMod.Leases
import typingsJapgolly.rsocketCore.rsocketserializationMod.PayloadSerializers
import typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.DuplexConnection
import typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.Responder
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientConfig[D, M] extends js.Object {
  var errorHandler: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.undefined
  var leases: js.UndefOr[js.Function0[Leases[_]]] = js.undefined
  var responder: js.UndefOr[Partial[Responder[D, M]]] = js.undefined
  var serializers: js.UndefOr[PayloadSerializers[D, M]] = js.undefined
  var setup: AnonDataMimeType[D, M]
  var transport: DuplexConnection
}

object ClientConfig {
  @scala.inline
  def apply[D, M](
    setup: AnonDataMimeType[D, M],
    transport: DuplexConnection,
    errorHandler: /* error */ js.Error => Callback = null,
    leases: js.UndefOr[CallbackTo[Leases[js.Any]]] = js.undefined,
    responder: Partial[Responder[D, M]] = null,
    serializers: PayloadSerializers[D, M] = null
  ): ClientConfig[D, M] = {
    val __obj = js.Dynamic.literal(setup = setup.asInstanceOf[js.Any], transport = transport.asInstanceOf[js.Any])
    if (errorHandler != null) __obj.updateDynamic("errorHandler")(js.Any.fromFunction1((t0: /* error */ js.Error) => errorHandler(t0).runNow()))
    leases.foreach(p => __obj.updateDynamic("leases")(p.toJsFn))
    if (responder != null) __obj.updateDynamic("responder")(responder.asInstanceOf[js.Any])
    if (serializers != null) __obj.updateDynamic("serializers")(serializers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientConfig[D, M]]
  }
}

