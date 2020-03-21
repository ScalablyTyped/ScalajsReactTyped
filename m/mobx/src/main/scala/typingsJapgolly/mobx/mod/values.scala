package typingsJapgolly.mobx.mod

import typingsJapgolly.mobx.observablearrayMod.IObservableArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx", "values")
@js.native
object values extends js.Object {
  def apply[T](ar: IObservableArray[T]): js.Array[T] = js.native
  def apply[T](obj: T): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def apply[T](set: typingsJapgolly.mobx.internalMod.ObservableSet[T]): js.Array[T] = js.native
  def apply[K, T](map: typingsJapgolly.mobx.internalMod.ObservableMap[K, T]): js.Array[T] = js.native
}

