package typingsJapgolly.relayRuntime.relayStoreTypesMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.relayRuntime.relayRecordStateMod.RecordState
import typingsJapgolly.relayRuntime.relayRuntimeTypesMod.DataID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecordSource extends js.Object {
  def get(dataID: DataID): js.UndefOr[Record | Null]
  def getRecordIDs(): js.Array[DataID]
  def getStatus(dataID: DataID): RecordState
  def has(dataID: DataID): Boolean
  def size(): Double
  def toJSON(): StringDictionary[Record]
}

object RecordSource {
  @scala.inline
  def apply(
    get: DataID => CallbackTo[js.UndefOr[Record | Null]],
    getRecordIDs: CallbackTo[js.Array[DataID]],
    getStatus: DataID => CallbackTo[RecordState],
    has: DataID => CallbackTo[Boolean],
    size: CallbackTo[Double],
    toJSON: CallbackTo[StringDictionary[Record]]
  ): RecordSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.relayRuntime.relayRuntimeTypesMod.DataID) => get(t0).runNow()))
    __obj.updateDynamic("getRecordIDs")(getRecordIDs.toJsFn)
    __obj.updateDynamic("getStatus")(js.Any.fromFunction1((t0: typingsJapgolly.relayRuntime.relayRuntimeTypesMod.DataID) => getStatus(t0).runNow()))
    __obj.updateDynamic("has")(js.Any.fromFunction1((t0: typingsJapgolly.relayRuntime.relayRuntimeTypesMod.DataID) => has(t0).runNow()))
    __obj.updateDynamic("size")(size.toJsFn)
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.asInstanceOf[RecordSource]
  }
}

