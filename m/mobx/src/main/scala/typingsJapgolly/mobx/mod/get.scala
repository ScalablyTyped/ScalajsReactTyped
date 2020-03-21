package typingsJapgolly.mobx.mod

import typingsJapgolly.mobx.observablearrayMod.IObservableArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx", "get")
@js.native
object get extends js.Object {
  def apply[T /* <: js.Object */](obj: T, key: String): js.Any = js.native
  def apply[T](obj: IObservableArray[T], index: Double): js.UndefOr[T] = js.native
  def apply[K, V](obj: typingsJapgolly.mobx.internalMod.ObservableMap[K, V], key: K): js.UndefOr[V] = js.native
}

