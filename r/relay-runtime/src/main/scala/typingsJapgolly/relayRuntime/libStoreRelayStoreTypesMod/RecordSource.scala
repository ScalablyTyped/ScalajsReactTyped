package typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.relayRuntime.libStoreRelayRecordStateMod.RecordState
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.DataID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecordSource extends StObject {
  
  // tslint:disable-next-line:no-unnecessary-generics
  def get[T /* <: js.Object */](dataID: DataID): js.UndefOr[Record[T] | Null]
  
  def getRecordIDs(): js.Array[DataID]
  
  def getStatus(dataID: DataID): RecordState
  
  def has(dataID: DataID): Boolean
  
  def size(): Double
  
  def toJSON(): StringDictionary[Record[js.Object]]
}
object RecordSource {
  
  inline def apply(
    get: DataID => js.UndefOr[Record[Any] | Null],
    getRecordIDs: CallbackTo[js.Array[DataID]],
    getStatus: DataID => RecordState,
    has: DataID => Boolean,
    size: CallbackTo[Double],
    toJSON: CallbackTo[StringDictionary[Record[js.Object]]]
  ): RecordSource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), getRecordIDs = getRecordIDs.toJsFn, getStatus = js.Any.fromFunction1(getStatus), has = js.Any.fromFunction1(has), size = size.toJsFn, toJSON = toJSON.toJsFn)
    __obj.asInstanceOf[RecordSource]
  }
  
  extension [Self <: RecordSource](x: Self) {
    
    inline def setGet(value: DataID => js.UndefOr[Record[Any] | Null]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setGetRecordIDs(value: CallbackTo[js.Array[DataID]]): Self = StObject.set(x, "getRecordIDs", value.toJsFn)
    
    inline def setGetStatus(value: DataID => RecordState): Self = StObject.set(x, "getStatus", js.Any.fromFunction1(value))
    
    inline def setHas(value: DataID => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
    
    inline def setSize(value: CallbackTo[Double]): Self = StObject.set(x, "size", value.toJsFn)
    
    inline def setToJSON(value: CallbackTo[StringDictionary[Record[js.Object]]]): Self = StObject.set(x, "toJSON", value.toJsFn)
  }
}
