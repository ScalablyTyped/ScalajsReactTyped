package typingsJapgolly.dispatchr.createStoreMod

import typingsJapgolly.dispatchr.mod.StoreClass
import typingsJapgolly.std.ThisType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dispatchr/addons/createStore", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply[T /* <: StoreOptions */](options: T with ThisType[StoreThis[T]]): StoreClass = js.native
}

