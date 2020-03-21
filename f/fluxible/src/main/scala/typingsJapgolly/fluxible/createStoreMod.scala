package typingsJapgolly.fluxible

import typingsJapgolly.dispatchr.createStoreMod.StoreOptions
import typingsJapgolly.dispatchr.createStoreMod.StoreThis
import typingsJapgolly.dispatchr.mod.StoreClass
import typingsJapgolly.std.ThisType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fluxible/addons/createStore", JSImport.Namespace)
@js.native
object createStoreMod extends js.Object {
  def apply[T /* <: StoreOptions */](options: T with ThisType[StoreThis[T]]): StoreClass = js.native
}

