package typingsJapgolly.mobx.mod

import typingsJapgolly.mobx.observablearrayMod.IObservableArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx", "has")
@js.native
object has extends js.Object {
  def apply[T /* <: js.Object */](obj: T, key: String): Boolean = js.native
  def apply[K](obj: typingsJapgolly.mobx.internalMod.ObservableMap[K, _], key: K): Boolean = js.native
  def apply[T](obj: typingsJapgolly.mobx.internalMod.ObservableSet[T], key: T): Boolean = js.native
  def apply[T](obj: IObservableArray[T], index: Double): Boolean = js.native
}

