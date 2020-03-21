package typingsJapgolly.mobservable.mod

import typingsJapgolly.mobservable.observablemapMod.KeyValueMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobservable", "map")
@js.native
object map extends js.Object {
  def apply[V](): typingsJapgolly.mobservable.observablemapMod.ObservableMap[V] = js.native
  def apply[V](initialValues: KeyValueMap[V]): typingsJapgolly.mobservable.observablemapMod.ObservableMap[V] = js.native
  def apply[V](initialValues: KeyValueMap[V], valueModifier: js.Function): typingsJapgolly.mobservable.observablemapMod.ObservableMap[V] = js.native
}

