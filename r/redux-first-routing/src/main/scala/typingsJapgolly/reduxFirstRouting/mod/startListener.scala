package typingsJapgolly.reduxFirstRouting.mod

import typingsJapgolly.history.mod.History
import typingsJapgolly.history.mod.LocationState
import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-first-routing", "startListener")
@js.native
object startListener extends js.Object {
  def apply(history: History[LocationState], store: Store[_, AnyAction]): Unit = js.native
}

