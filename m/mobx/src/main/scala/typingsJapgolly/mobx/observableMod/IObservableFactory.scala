package typingsJapgolly.mobx.observableMod

import typingsJapgolly.mobx.internalMod.ObservableMap
import typingsJapgolly.mobx.internalMod.ObservableSet
import typingsJapgolly.mobx.observablearrayMod.IObservableArray
import typingsJapgolly.mobx.observableobjectMod.IObservableObject
import typingsJapgolly.std.Map
import typingsJapgolly.std.PropertyDescriptor
import typingsJapgolly.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObservableFactory extends js.Object {
  def apply(): scala.Nothing = js.native
  def apply(target: js.Object, key: String): js.Any = js.native
  def apply(target: js.Object, key: String, baseDescriptor: PropertyDescriptor): js.Any = js.native
  def apply(target: js.Object, key: js.Symbol): js.Any = js.native
  def apply(target: js.Object, key: js.Symbol, baseDescriptor: PropertyDescriptor): js.Any = js.native
  def apply(value: String): scala.Nothing = js.native
  def apply(value: Boolean): scala.Nothing = js.native
  def apply(value: Double): scala.Nothing = js.native
  def apply[T /* <: js.Object */](value: T): T with IObservableObject = js.native
  def apply[T /* <: js.Object */](
    value: T,
    decorators: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? std.Function}
    */ typingsJapgolly.mobx.mobxStrings.IObservableFactory with js.Any
  ): T with IObservableObject = js.native
  def apply[T /* <: js.Object */](
    value: T,
    decorators: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? std.Function}
    */ typingsJapgolly.mobx.mobxStrings.IObservableFactory with js.Any,
    options: CreateObservableOptions
  ): T with IObservableObject = js.native
  def apply[T](value: js.Array[T]): IObservableArray[T] = js.native
  def apply[T](value: js.Array[T], options: CreateObservableOptions): IObservableArray[T] = js.native
  def apply[T](value: Set[T]): ObservableSet[T] = js.native
  def apply[T](value: Set[T], options: CreateObservableOptions): ObservableSet[T] = js.native
  def apply[K, V](value: Map[K, V]): ObservableMap[K, V] = js.native
  def apply[K, V](value: Map[K, V], options: CreateObservableOptions): ObservableMap[K, V] = js.native
}

