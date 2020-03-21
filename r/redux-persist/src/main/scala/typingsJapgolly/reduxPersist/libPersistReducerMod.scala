package typingsJapgolly.reduxPersist

import typingsJapgolly.redux.mod.Action
import typingsJapgolly.redux.mod.Reducer
import typingsJapgolly.reduxPersist.persistReducerMod.PersistPartial
import typingsJapgolly.reduxPersist.typesMod.PersistConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-persist/lib/persistReducer", JSImport.Namespace)
@js.native
object libPersistReducerMod extends js.Object {
  def default[S, A /* <: Action[_] */](config: PersistConfig[S, _, _, _], baseReducer: Reducer[S, A]): Reducer[S with PersistPartial, A] = js.native
}

