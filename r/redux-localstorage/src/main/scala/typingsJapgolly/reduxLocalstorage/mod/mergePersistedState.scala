package typingsJapgolly.reduxLocalstorage.mod

import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Reducer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-localstorage", "mergePersistedState")
@js.native
object mergePersistedState extends js.Object {
  def apply(): js.Function1[/* next */ Reducer[_, AnyAction], Reducer[_, AnyAction]] = js.native
  def apply(merge: js.Function2[/* initialState */ js.Any, /* persistentState */ js.Any, js.Any]): js.Function1[/* next */ Reducer[_, AnyAction], Reducer[_, AnyAction]] = js.native
}

