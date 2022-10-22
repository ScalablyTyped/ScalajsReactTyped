package typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.relayRuntime.libStoreRelayRecordStateMod.RecordState
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.DataID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MutableRecordSource
  extends StObject
     with RecordSource {
  
  def clear(): Unit
  
  def delete(dataID: DataID): Unit
  
  def remove(dataID: DataID): Unit
  
  def set(dataID: DataID, record: Record[js.Object]): Unit
}
object MutableRecordSource {
  
  inline def apply(
    clear: Callback,
    delete: DataID => Callback,
    get: DataID => js.UndefOr[Record[Any] | Null],
    getRecordIDs: CallbackTo[js.Array[DataID]],
    getStatus: DataID => RecordState,
    has: DataID => Boolean,
    remove: DataID => Callback,
    set: (DataID, Record[js.Object]) => Callback,
    size: CallbackTo[Double],
    toJSON: CallbackTo[StringDictionary[Record[js.Object]]]
  ): MutableRecordSource = {
    val __obj = js.Dynamic.literal(clear = clear.toJsFn, delete = js.Any.fromFunction1((t0: DataID) => delete(t0).runNow()), get = js.Any.fromFunction1(get), getRecordIDs = getRecordIDs.toJsFn, getStatus = js.Any.fromFunction1(getStatus), has = js.Any.fromFunction1(has), remove = js.Any.fromFunction1((t0: DataID) => remove(t0).runNow()), set = js.Any.fromFunction2((t0: DataID, t1: Record[js.Object]) => (set(t0, t1)).runNow()), size = size.toJsFn, toJSON = toJSON.toJsFn)
    __obj.asInstanceOf[MutableRecordSource]
  }
  
  extension [Self <: MutableRecordSource](x: Self) {
    
    inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
    
    inline def setDelete(value: DataID => Callback): Self = StObject.set(x, "delete", js.Any.fromFunction1((t0: DataID) => value(t0).runNow()))
    
    inline def setRemove(value: DataID => Callback): Self = StObject.set(x, "remove", js.Any.fromFunction1((t0: DataID) => value(t0).runNow()))
    
    inline def setSet(value: (DataID, Record[js.Object]) => Callback): Self = StObject.set(x, "set", js.Any.fromFunction2((t0: DataID, t1: Record[js.Object]) => (value(t0, t1)).runNow()))
  }
}
