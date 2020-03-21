package typingsJapgolly.relayRuntime.relayStoreTypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.relayRuntime.relayRuntimeTypesMod.DataID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecordSourceProxy extends js.Object {
  def create(dataID: DataID, typeName: String): RecordProxy[js.Object]
  def delete(dataID: DataID): Unit
  // tslint:disable-next-line
  def get[T](dataID: DataID): js.UndefOr[RecordProxy[T] | Null]
  def getRoot(): RecordProxy[js.Object]
}

object RecordSourceProxy {
  @scala.inline
  def apply(
    create: (DataID, String) => CallbackTo[RecordProxy[js.Object]],
    delete: DataID => Callback,
    get: DataID => CallbackTo[js.UndefOr[RecordProxy[js.Any] | Null]],
    getRoot: CallbackTo[RecordProxy[js.Object]]
  ): RecordSourceProxy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction2((t0: typingsJapgolly.relayRuntime.relayRuntimeTypesMod.DataID, t1: java.lang.String) => create(t0, t1).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.relayRuntime.relayRuntimeTypesMod.DataID) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.relayRuntime.relayRuntimeTypesMod.DataID) => get(t0).runNow()))
    __obj.updateDynamic("getRoot")(getRoot.toJsFn)
    __obj.asInstanceOf[RecordSourceProxy]
  }
}

