package typingsJapgolly.reduxLocalstorage

import japgolly.scalajs.react.Callback
import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Reducer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-localstorage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[A](): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Any]
  inline def default[A](storage: Unit, key: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(storage.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def default[A](storage: Unit, key: String, callback: js.Function): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(storage.asInstanceOf[js.Any], key.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def default[A](storage: Unit, key: Unit, callback: js.Function): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(storage.asInstanceOf[js.Any], key.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def default[A](storage: StorageAdapter[A]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(storage.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def default[A](storage: StorageAdapter[A], key: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(storage.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def default[A](storage: StorageAdapter[A], key: String, callback: js.Function): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(storage.asInstanceOf[js.Any], key.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def default[A](storage: StorageAdapter[A], key: Unit, callback: js.Function): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(storage.asInstanceOf[js.Any], key.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("redux-localstorage", "actionTypes")
  @js.native
  val actionTypes: ActionTypes_ = js.native
  
  inline def mergePersistedState(): js.Function1[/* next */ Reducer[Any, AnyAction], Reducer[Any, AnyAction]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergePersistedState")().asInstanceOf[js.Function1[/* next */ Reducer[Any, AnyAction], Reducer[Any, AnyAction]]]
  inline def mergePersistedState(merge: js.Function2[/* initialState */ Any, /* persistentState */ Any, Any]): js.Function1[/* next */ Reducer[Any, AnyAction], Reducer[Any, AnyAction]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergePersistedState")(merge.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* next */ Reducer[Any, AnyAction], Reducer[Any, AnyAction]]]
  
  inline def transformState[A1, A2](
    down: js.Array[js.Function1[/* state */ Any, Any]],
    up: js.Array[js.Function1[/* state */ Any, Any]]
  ): js.Function1[/* storage */ StorageAdapter[A1], A2] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformState")(down.asInstanceOf[js.Any], up.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* storage */ StorageAdapter[A1], A2]]
  inline def transformState[A1, A2](down: js.Array[js.Function1[/* state */ Any, Any]], up: js.Function1[/* state */ A2, A1]): js.Function1[/* storage */ StorageAdapter[A1], A2] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformState")(down.asInstanceOf[js.Any], up.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* storage */ StorageAdapter[A1], A2]]
  inline def transformState[A1, A2](down: js.Function1[/* state */ A1, A2], up: js.Array[js.Function1[/* state */ Any, Any]]): js.Function1[/* storage */ StorageAdapter[A1], A2] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformState")(down.asInstanceOf[js.Any], up.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* storage */ StorageAdapter[A1], A2]]
  inline def transformState[A1, A2](down: js.Function1[/* state */ A1, A2], up: js.Function1[/* state */ A2, A1]): js.Function1[/* storage */ StorageAdapter[A1], A2] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformState")(down.asInstanceOf[js.Any], up.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* storage */ StorageAdapter[A1], A2]]
  
  trait ActionTypes_ extends StObject {
    
    var INIT: String
  }
  object ActionTypes_ {
    
    inline def apply(INIT: String): ActionTypes_ = {
      val __obj = js.Dynamic.literal(INIT = INIT.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActionTypes_]
    }
    
    extension [Self <: ActionTypes_](x: Self) {
      
      inline def setINIT(value: String): Self = StObject.set(x, "INIT", value.asInstanceOf[js.Any])
    }
  }
  
  type AdapterCallback = js.Function2[/* err */ js.UndefOr[Any], /* result */ js.UndefOr[Any], Unit]
  
  trait StorageAdapter[A] extends StObject {
    
    var `0`: A
    
    def del(key: String, callback: AdapterCallback): Unit
    
    def get(key: String, callback: AdapterCallback): Unit
    
    def put(key: String, value: Any, callback: AdapterCallback): Unit
  }
  object StorageAdapter {
    
    inline def apply[A](
      `0`: A,
      del: (String, AdapterCallback) => Callback,
      get: (String, AdapterCallback) => Callback,
      put: (String, Any, AdapterCallback) => Callback
    ): StorageAdapter[A] = {
      val __obj = js.Dynamic.literal(del = js.Any.fromFunction2((t0: String, t1: AdapterCallback) => (del(t0, t1)).runNow()), get = js.Any.fromFunction2((t0: String, t1: AdapterCallback) => (get(t0, t1)).runNow()), put = js.Any.fromFunction3((t0: String, t1: Any, t2: AdapterCallback) => (put(t0, t1, t2)).runNow()))
      __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
      __obj.asInstanceOf[StorageAdapter[A]]
    }
    
    extension [Self <: StorageAdapter[?], A](x: Self & StorageAdapter[A]) {
      
      inline def set0(value: A): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
      
      inline def setDel(value: (String, AdapterCallback) => Callback): Self = StObject.set(x, "del", js.Any.fromFunction2((t0: String, t1: AdapterCallback) => (value(t0, t1)).runNow()))
      
      inline def setGet(value: (String, AdapterCallback) => Callback): Self = StObject.set(x, "get", js.Any.fromFunction2((t0: String, t1: AdapterCallback) => (value(t0, t1)).runNow()))
      
      inline def setPut(value: (String, Any, AdapterCallback) => Callback): Self = StObject.set(x, "put", js.Any.fromFunction3((t0: String, t1: Any, t2: AdapterCallback) => (value(t0, t1, t2)).runNow()))
    }
  }
  
  type StorageAdapterCreator[A] = js.Function1[/* storage */ A, StorageAdapter[A]]
  
  trait StorageAdapterEnhancer extends StObject
}
