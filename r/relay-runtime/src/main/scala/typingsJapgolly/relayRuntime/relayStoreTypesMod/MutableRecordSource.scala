package typingsJapgolly.relayRuntime.relayStoreTypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.relayRuntime.relayRecordStateMod.RecordState
import typingsJapgolly.relayRuntime.relayRuntimeTypesMod.DataID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MutableRecordSource extends RecordSource {
  def clear(): Unit
  def delete(dataID: DataID): Unit
  def remove(dataID: DataID): Unit
  def set(dataID: DataID, record: Record): Unit
}

object MutableRecordSource {
  @scala.inline
  def apply(
    clear: Callback,
    delete: DataID => Callback,
    get: DataID => CallbackTo[js.UndefOr[Record | Null]],
    getRecordIDs: CallbackTo[js.Array[DataID]],
    getStatus: DataID => CallbackTo[RecordState],
    has: DataID => CallbackTo[Boolean],
    remove: DataID => Callback,
    set: (DataID, Record) => Callback,
    size: CallbackTo[Double],
    toJSON: CallbackTo[StringDictionary[Record]]
  ): MutableRecordSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.relayRuntime.relayRuntimeTypesMod.DataID) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.relayRuntime.relayRuntimeTypesMod.DataID) => get(t0).runNow()))
    __obj.updateDynamic("getRecordIDs")(getRecordIDs.toJsFn)
    __obj.updateDynamic("getStatus")(js.Any.fromFunction1((t0: typingsJapgolly.relayRuntime.relayRuntimeTypesMod.DataID) => getStatus(t0).runNow()))
    __obj.updateDynamic("has")(js.Any.fromFunction1((t0: typingsJapgolly.relayRuntime.relayRuntimeTypesMod.DataID) => has(t0).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: typingsJapgolly.relayRuntime.relayRuntimeTypesMod.DataID) => remove(t0).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: typingsJapgolly.relayRuntime.relayRuntimeTypesMod.DataID, t1: typingsJapgolly.relayRuntime.relayStoreTypesMod.Record) => set(t0, t1).runNow()))
    __obj.updateDynamic("size")(size.toJsFn)
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.asInstanceOf[MutableRecordSource]
  }
}

