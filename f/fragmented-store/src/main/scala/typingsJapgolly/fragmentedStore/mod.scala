package typingsJapgolly.fragmentedStore

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.fragmentedStore.anon.Provider
import typingsJapgolly.fragmentedStore.fragmentedStoreStrings.useStore
import typingsJapgolly.react.mod.Dispatch
import typingsJapgolly.react.mod.SetStateAction
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[Store /* <: StringDictionary[Any] */](store: Store): StoreUtils[Store] = ^.asInstanceOf[js.Dynamic].apply(store.asInstanceOf[js.Any]).asInstanceOf[StoreUtils[Store]]
  
  @JSImport("fragmented-store", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type StateHook[S] = js.Function0[js.Tuple2[S, Dispatch[SetStateAction[S]]]]
  
  type StoreUtils[Store /* <: StringDictionary[Any] */] = (Omit[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof Store as / * template literal string: use${Capitalize<string&K>} * / string ]: fragmented-store.fragmented-store.StateHook<Store[K]>} */ js.Any, 
    useStore
  ]) & Provider[Store]
}
