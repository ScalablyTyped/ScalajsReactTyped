package typingsJapgolly.autobahn.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITransports extends js.Object {
  def get(name: TransportType): ITransportFactoryFactory
  def isRegistered(name: TransportType): Boolean
  def list(): js.Array[TransportType]
  def register(name: TransportType, factory: ITransportFactoryFactory): Unit
}

object ITransports {
  @scala.inline
  def apply(
    get: TransportType => CallbackTo[ITransportFactoryFactory],
    isRegistered: TransportType => CallbackTo[Boolean],
    list: CallbackTo[js.Array[TransportType]],
    register: (TransportType, ITransportFactoryFactory) => Callback
  ): ITransports = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.autobahn.mod.TransportType) => get(t0).runNow()))
    __obj.updateDynamic("isRegistered")(js.Any.fromFunction1((t0: typingsJapgolly.autobahn.mod.TransportType) => isRegistered(t0).runNow()))
    __obj.updateDynamic("list")(list.toJsFn)
    __obj.updateDynamic("register")(js.Any.fromFunction2((t0: typingsJapgolly.autobahn.mod.TransportType, t1: typingsJapgolly.autobahn.mod.ITransportFactoryFactory) => register(t0, t1).runNow()))
    __obj.asInstanceOf[ITransports]
  }
}

