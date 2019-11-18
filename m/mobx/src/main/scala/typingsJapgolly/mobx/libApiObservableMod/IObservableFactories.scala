package typingsJapgolly.mobx.libApiObservableMod

import typingsJapgolly.mobx.libApiObservabledecoratorMod.IObservableDecorator
import typingsJapgolly.mobx.libInternalMod.ObservableMap
import typingsJapgolly.mobx.libInternalMod.ObservableSet
import typingsJapgolly.mobx.libTypesObservablearrayMod.IObservableArray
import typingsJapgolly.mobx.libTypesObservablemapMod.IObservableMapInitialValues
import typingsJapgolly.mobx.libTypesObservableobjectMod.IObservableObject
import typingsJapgolly.mobx.libTypesObservablesetMod.IObservableSetInitialValues
import typingsJapgolly.mobx.libTypesObservablevalueMod.IObservableValue
import typingsJapgolly.std.PropertyDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObservableFactories extends js.Object {
  @JSName("deep")
  var deep_Original: IObservableDecorator = js.native
  /**
    * Decorator that creates an observable that only observes the references, but doesn't try to turn the assigned value into an observable.ts.
    */
  @JSName("ref")
  var ref_Original: IObservableDecorator = js.native
  /**
    * Decorator that creates an observable converts its value (objects, maps or arrays) into a shallow observable structure
    */
  @JSName("shallow")
  var shallow_Original: IObservableDecorator = js.native
  @JSName("struct")
  var struct_Original: IObservableDecorator = js.native
  def array[T](): IObservableArray[T] = js.native
  def array[T](initialValues: js.Array[T]): IObservableArray[T] = js.native
  def array[T](initialValues: js.Array[T], options: CreateObservableOptions): IObservableArray[T] = js.native
  def box[T](): IObservableValue[T] = js.native
  def box[T](value: T): IObservableValue[T] = js.native
  def box[T](value: T, options: CreateObservableOptions): IObservableValue[T] = js.native
  def deep(target: js.Object, property: String): Unit = js.native
  def deep(target: js.Object, property: String, descriptor: PropertyDescriptor): Unit = js.native
  def deep(target: js.Object, property: js.Symbol): Unit = js.native
  def deep(target: js.Object, property: js.Symbol, descriptor: PropertyDescriptor): Unit = js.native
  def map[K, V](): ObservableMap[K, V] = js.native
  def map[K, V](initialValues: IObservableMapInitialValues[K, V]): ObservableMap[K, V] = js.native
  def map[K, V](initialValues: IObservableMapInitialValues[K, V], options: CreateObservableOptions): ObservableMap[K, V] = js.native
  def `object`[T](props: T): T with IObservableObject = js.native
  def `object`[T](
    props: T,
    decorators: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? std.Function}
    */ typingsJapgolly.mobx.mobxStrings.IObservableFactories with js.Any
  ): T with IObservableObject = js.native
  def `object`[T](
    props: T,
    decorators: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? std.Function}
    */ typingsJapgolly.mobx.mobxStrings.IObservableFactories with js.Any,
    options: CreateObservableOptions
  ): T with IObservableObject = js.native
  /**
    * Decorator that creates an observable that only observes the references, but doesn't try to turn the assigned value into an observable.ts.
    */
  def ref(target: js.Object, property: String): Unit = js.native
  def ref(target: js.Object, property: String, descriptor: PropertyDescriptor): Unit = js.native
  def ref(target: js.Object, property: js.Symbol): Unit = js.native
  def ref(target: js.Object, property: js.Symbol, descriptor: PropertyDescriptor): Unit = js.native
  def set[T](): ObservableSet[T] = js.native
  def set[T](initialValues: IObservableSetInitialValues[T]): ObservableSet[T] = js.native
  def set[T](initialValues: IObservableSetInitialValues[T], options: CreateObservableOptions): ObservableSet[T] = js.native
  /**
    * Decorator that creates an observable converts its value (objects, maps or arrays) into a shallow observable structure
    */
  def shallow(target: js.Object, property: String): Unit = js.native
  def shallow(target: js.Object, property: String, descriptor: PropertyDescriptor): Unit = js.native
  def shallow(target: js.Object, property: js.Symbol): Unit = js.native
  def shallow(target: js.Object, property: js.Symbol, descriptor: PropertyDescriptor): Unit = js.native
  def struct(target: js.Object, property: String): Unit = js.native
  def struct(target: js.Object, property: String, descriptor: PropertyDescriptor): Unit = js.native
  def struct(target: js.Object, property: js.Symbol): Unit = js.native
  def struct(target: js.Object, property: js.Symbol, descriptor: PropertyDescriptor): Unit = js.native
}

