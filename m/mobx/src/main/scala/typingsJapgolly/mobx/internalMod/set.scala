package typingsJapgolly.mobx.internalMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.mobx.observablearrayMod.IObservableArray
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/internal", "set")
@js.native
object set extends js.Object {
  def apply[T /* <: js.Object */](obj: T, key: PropertyKey, value: js.Any): js.Any = js.native
  def apply[T /* <: js.Object */](obj: T, values: StringDictionary[js.Any]): js.Any = js.native
  def apply[V](obj: ObservableMap[PropertyKey, V], values: StringDictionary[V]): js.Any = js.native
  def apply[T](obj: ObservableSet[T], value: T): js.Any = js.native
  def apply[T](obj: IObservableArray[T], index: Double, value: T): js.Any = js.native
  def apply[K, V](obj: ObservableMap[K, V], key: K, value: V): js.Any = js.native
}

