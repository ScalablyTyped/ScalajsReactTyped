package typingsJapgolly.mobx.mod

import typingsJapgolly.mobx.computedvalueMod.IComputedValue
import typingsJapgolly.mobx.observablearrayMod.IArrayChange
import typingsJapgolly.mobx.observablearrayMod.IArraySplice
import typingsJapgolly.mobx.observablearrayMod.IObservableArray
import typingsJapgolly.mobx.observablemapMod.IMapDidChange
import typingsJapgolly.mobx.observableobjectMod.IObjectDidChange
import typingsJapgolly.mobx.observablesetMod.ISetDidChange
import typingsJapgolly.mobx.observablevalueMod.IObservableValue
import typingsJapgolly.mobx.observablevalueMod.IValueDidChange
import typingsJapgolly.mobx.utilsMod.Lambda
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx", "observe")
@js.native
object observe extends js.Object {
  def apply(`object`: js.Object, listener: js.Function1[/* change */ IObjectDidChange, Unit]): Lambda = js.native
  def apply(
    `object`: js.Object,
    listener: js.Function1[/* change */ IObjectDidChange, Unit],
    fireImmediately: Boolean
  ): Lambda = js.native
  def apply[T](
    observableArray: IObservableArray[T],
    listener: js.Function1[/* change */ IArrayChange[T] | IArraySplice[T], Unit]
  ): Lambda = js.native
  def apply[T](
    observableArray: IObservableArray[T],
    listener: js.Function1[/* change */ IArrayChange[T] | IArraySplice[T], Unit],
    fireImmediately: Boolean
  ): Lambda = js.native
  def apply[V](
    observableMap: typingsJapgolly.mobx.internalMod.ObservableSet[V],
    listener: js.Function1[/* change */ ISetDidChange[V], Unit]
  ): Lambda = js.native
  def apply[V](
    observableMap: typingsJapgolly.mobx.internalMod.ObservableSet[V],
    listener: js.Function1[/* change */ ISetDidChange[V], Unit],
    fireImmediately: Boolean
  ): Lambda = js.native
  def apply[T](value: IComputedValue[T], listener: js.Function1[/* change */ IValueDidChange[T], Unit]): Lambda = js.native
  def apply[T](
    value: IComputedValue[T],
    listener: js.Function1[/* change */ IValueDidChange[T], Unit],
    fireImmediately: Boolean
  ): Lambda = js.native
  def apply[T](value: IObservableValue[T], listener: js.Function1[/* change */ IValueDidChange[T], Unit]): Lambda = js.native
  def apply[T](
    value: IObservableValue[T],
    listener: js.Function1[/* change */ IValueDidChange[T], Unit],
    fireImmediately: Boolean
  ): Lambda = js.native
  def apply[T, K /* <: String */](
    `object`: T,
    property: K,
    listener: js.Function1[
      /* change */ IValueDidChange[
        /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
      ], 
      Unit
    ]
  ): Lambda = js.native
  def apply[T, K /* <: String */](
    `object`: T,
    property: K,
    listener: js.Function1[
      /* change */ IValueDidChange[
        /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
      ], 
      Unit
    ],
    fireImmediately: Boolean
  ): Lambda = js.native
  def apply[K, V](
    observableMap: typingsJapgolly.mobx.internalMod.ObservableMap[K, V],
    listener: js.Function1[/* change */ IMapDidChange[K, V], Unit]
  ): Lambda = js.native
  def apply[K, V](
    observableMap: typingsJapgolly.mobx.internalMod.ObservableMap[K, V],
    listener: js.Function1[/* change */ IMapDidChange[K, V], Unit],
    fireImmediately: Boolean
  ): Lambda = js.native
  def apply[K, V](
    observableMap: typingsJapgolly.mobx.internalMod.ObservableMap[K, V],
    property: K,
    listener: js.Function1[/* change */ IValueDidChange[V], Unit]
  ): Lambda = js.native
  def apply[K, V](
    observableMap: typingsJapgolly.mobx.internalMod.ObservableMap[K, V],
    property: K,
    listener: js.Function1[/* change */ IValueDidChange[V], Unit],
    fireImmediately: Boolean
  ): Lambda = js.native
}

