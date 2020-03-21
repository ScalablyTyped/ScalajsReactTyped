package typingsJapgolly.reactRedux.mod

import typingsJapgolly.redux.mod.Action
import typingsJapgolly.redux.mod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-redux", "useStore")
@js.native
object useStore extends js.Object {
  def apply[S, A /* <: Action[_] */](): Store[S, A] = js.native
}

