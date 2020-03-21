package typingsJapgolly.reduxPersist

import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Store
import typingsJapgolly.reduxPersist.typesMod.Persistor
import typingsJapgolly.reduxPersist.typesMod.PersistorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-persist/lib/persistStore", JSImport.Namespace)
@js.native
object libPersistStoreMod extends js.Object {
  def default(store: Store[_, AnyAction]): Persistor = js.native
  def default(store: Store[_, AnyAction], persistorOptions: Null, callback: js.Function0[_]): Persistor = js.native
  def default(store: Store[_, AnyAction], persistorOptions: PersistorOptions): Persistor = js.native
  def default(store: Store[_, AnyAction], persistorOptions: PersistorOptions, callback: js.Function0[_]): Persistor = js.native
}

