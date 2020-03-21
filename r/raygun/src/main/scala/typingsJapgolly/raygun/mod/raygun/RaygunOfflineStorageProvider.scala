package typingsJapgolly.raygun.mod.raygun

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RaygunOfflineStorageProvider[TTransportItem, TStorageItem] extends js.Object {
  def init(options: js.Any): RaygunOfflineStorageProvider[RaygunPayload, String]
  def retrieve(callback: js.Function2[/* error */ js.Error, /* storageItems */ js.Array[TStorageItem], Unit]): Unit
  def save(item: TTransportItem, callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): Unit
  def send(callback: js.Function2[/* error */ js.Error, /* sendItems */ js.Array[TStorageItem], Unit]): Unit
}

object RaygunOfflineStorageProvider {
  @scala.inline
  def apply[TTransportItem, TStorageItem](
    init: js.Any => CallbackTo[RaygunOfflineStorageProvider[RaygunPayload, String]],
    retrieve: js.Function2[/* error */ js.Error, /* storageItems */ js.Array[TStorageItem], Unit] => Callback,
    save: (TTransportItem, js.Function1[/* error */ js.UndefOr[js.Error], Unit]) => Callback,
    send: js.Function2[/* error */ js.Error, /* sendItems */ js.Array[TStorageItem], Unit] => Callback
  ): RaygunOfflineStorageProvider[TTransportItem, TStorageItem] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("init")(js.Any.fromFunction1((t0: js.Any) => init(t0).runNow()))
    __obj.updateDynamic("retrieve")(js.Any.fromFunction1((t0: js.Function2[/* error */ js.Error, /* storageItems */ js.Array[TStorageItem], scala.Unit]) => retrieve(t0).runNow()))
    __obj.updateDynamic("save")(js.Any.fromFunction2((t0: TTransportItem, t1: js.Function1[/* error */ js.UndefOr[js.Error], scala.Unit]) => save(t0, t1).runNow()))
    __obj.updateDynamic("send")(js.Any.fromFunction1((t0: js.Function2[/* error */ js.Error, /* sendItems */ js.Array[TStorageItem], scala.Unit]) => send(t0).runNow()))
    __obj.asInstanceOf[RaygunOfflineStorageProvider[TTransportItem, TStorageItem]]
  }
}

