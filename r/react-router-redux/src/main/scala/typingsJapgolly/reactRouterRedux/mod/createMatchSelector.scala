package typingsJapgolly.reactRouterRedux.mod

import typingsJapgolly.reactRouter.mod.`match`
import typingsJapgolly.reactRouterRedux.AnonRouter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-router-redux", "createMatchSelector")
@js.native
object createMatchSelector extends js.Object {
  def apply(path: String): js.Function1[/* state */ AnonRouter, `match`[js.Object] | Null] = js.native
}

