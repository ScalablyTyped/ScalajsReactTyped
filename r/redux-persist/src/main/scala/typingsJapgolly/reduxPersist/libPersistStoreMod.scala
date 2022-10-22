package typingsJapgolly.reduxPersist

import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Store
import typingsJapgolly.reduxPersist.esTypesMod.Persistor
import typingsJapgolly.reduxPersist.esTypesMod.PersistorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPersistStoreMod {
  
  @JSImport("redux-persist/lib/persistStore", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(store: Store[Any, AnyAction]): Persistor = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(store.asInstanceOf[js.Any]).asInstanceOf[Persistor]
  inline def default(store: Store[Any, AnyAction], persistorOptions: Null, callback: js.Function0[Any]): Persistor = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(store.asInstanceOf[js.Any], persistorOptions.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Persistor]
  inline def default(store: Store[Any, AnyAction], persistorOptions: Unit, callback: js.Function0[Any]): Persistor = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(store.asInstanceOf[js.Any], persistorOptions.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Persistor]
  inline def default(store: Store[Any, AnyAction], persistorOptions: PersistorOptions): Persistor = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(store.asInstanceOf[js.Any], persistorOptions.asInstanceOf[js.Any])).asInstanceOf[Persistor]
  inline def default(store: Store[Any, AnyAction], persistorOptions: PersistorOptions, callback: js.Function0[Any]): Persistor = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(store.asInstanceOf[js.Any], persistorOptions.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Persistor]
}
