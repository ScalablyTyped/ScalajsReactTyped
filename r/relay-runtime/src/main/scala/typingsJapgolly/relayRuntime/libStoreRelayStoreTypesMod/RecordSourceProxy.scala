package typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.DataID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecordSourceProxy extends StObject {
  
  def create(dataID: DataID, typeName: String): RecordProxy[js.Object]
  
  def delete(dataID: DataID): Unit
  
  // tslint:disable-next-line:no-unnecessary-generics
  def get[T](dataID: DataID): js.UndefOr[RecordProxy[T] | Null]
  
  def getRoot(): RecordProxy[js.Object]
}
object RecordSourceProxy {
  
  inline def apply(
    create: (DataID, String) => RecordProxy[js.Object],
    delete: DataID => Callback,
    get: DataID => js.UndefOr[RecordProxy[Any] | Null],
    getRoot: CallbackTo[RecordProxy[js.Object]]
  ): RecordSourceProxy = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create), delete = js.Any.fromFunction1((t0: DataID) => delete(t0).runNow()), get = js.Any.fromFunction1(get), getRoot = getRoot.toJsFn)
    __obj.asInstanceOf[RecordSourceProxy]
  }
  
  extension [Self <: RecordSourceProxy](x: Self) {
    
    inline def setCreate(value: (DataID, String) => RecordProxy[js.Object]): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
    
    inline def setDelete(value: DataID => Callback): Self = StObject.set(x, "delete", js.Any.fromFunction1((t0: DataID) => value(t0).runNow()))
    
    inline def setGet(value: DataID => js.UndefOr[RecordProxy[Any] | Null]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setGetRoot(value: CallbackTo[RecordProxy[js.Object]]): Self = StObject.set(x, "getRoot", value.toJsFn)
  }
}
