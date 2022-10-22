package typingsJapgolly.usePersistedState

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.Dispatch
import typingsJapgolly.react.mod.SetStateAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall[S] extends StObject {
    
    def apply(): js.Tuple2[js.UndefOr[S], Dispatch[SetStateAction[js.UndefOr[S]]]] = js.native
    def apply(initialState: S): js.Tuple2[S, Dispatch[SetStateAction[S]]] = js.native
    def apply(initialState: js.Function0[S]): js.Tuple2[S, Dispatch[SetStateAction[S]]] = js.native
  }
  
  /* Inlined std.Pick<std.Storage, 'getItem' | 'setItem'> */
  trait PickStoragegetItemsetItem extends StObject {
    
    var getItem: js.Function1[/* key */ String, String | Null]
    
    var setItem: js.Function2[/* key */ String, /* value */ String, Unit]
  }
  object PickStoragegetItemsetItem {
    
    inline def apply(
      getItem: /* key */ String => String | Null,
      setItem: (/* key */ String, /* value */ String) => Callback
    ): PickStoragegetItemsetItem = {
      val __obj = js.Dynamic.literal(getItem = js.Any.fromFunction1(getItem), setItem = js.Any.fromFunction2((t0: /* key */ String, t1: /* value */ String) => (setItem(t0, t1)).runNow()))
      __obj.asInstanceOf[PickStoragegetItemsetItem]
    }
    
    extension [Self <: PickStoragegetItemsetItem](x: Self) {
      
      inline def setGetItem(value: /* key */ String => String | Null): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
      
      inline def setSetItem(value: (/* key */ String, /* value */ String) => Callback): Self = StObject.set(x, "setItem", js.Any.fromFunction2((t0: /* key */ String, t1: /* value */ String) => (value(t0, t1)).runNow()))
    }
  }
}
