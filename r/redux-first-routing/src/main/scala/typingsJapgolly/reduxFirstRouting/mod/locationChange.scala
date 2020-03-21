package typingsJapgolly.reduxFirstRouting.mod

import typingsJapgolly.history.mod.Hash
import typingsJapgolly.history.mod.Pathname
import typingsJapgolly.history.mod.Search
import typingsJapgolly.reduxFirstRouting.AnonPathname
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-first-routing", "locationChange")
@js.native
object locationChange extends js.Object {
  def apply[P /* <: Pathname */, S /* <: Search */, H /* <: Hash */](_underscore: AnonPathname[P, S, H]): locationChangeAction[P, S, H] = js.native
}

