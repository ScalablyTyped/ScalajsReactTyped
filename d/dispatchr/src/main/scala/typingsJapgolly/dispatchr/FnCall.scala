package typingsJapgolly.dispatchr

import typingsJapgolly.dispatchr.mod.Store
import typingsJapgolly.dispatchr.mod.StoreClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCall extends js.Object {
  def apply(name: String): Store[js.Object] = js.native
  def apply[T /* <: StoreClass */](name: T): T = js.native
}

