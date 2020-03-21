package typingsJapgolly.mobx.mod

import typingsJapgolly.mobx.observablearrayMod.IObservableArray
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx", "keys")
@js.native
object keys extends js.Object {
  def apply[T](ar: IObservableArray[T]): js.Array[Double] = js.native
  def apply[K](map: typingsJapgolly.mobx.internalMod.ObservableMap[K, _]): js.Array[K] = js.native
  def apply[T /* <: js.Object */](obj: T): js.Array[PropertyKey] = js.native
  def apply[T](set: typingsJapgolly.mobx.internalMod.ObservableSet[T]): js.Array[T] = js.native
}

