package typingsJapgolly.reduxPersist

import typingsJapgolly.redux.mod.Action
import typingsJapgolly.redux.mod.Reducer
import typingsJapgolly.redux.mod.ReducersMapObject
import typingsJapgolly.reduxPersist.persistReducerMod.PersistPartial
import typingsJapgolly.reduxPersist.typesMod.PersistConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-persist/es/persistCombineReducers", JSImport.Namespace)
@js.native
object persistCombineReducersMod extends js.Object {
  def default[S, A /* <: Action[_] */](config: PersistConfig[S, _, _, _], reducers: ReducersMapObject[S, A]): Reducer[S with PersistPartial, A] = js.native
}

