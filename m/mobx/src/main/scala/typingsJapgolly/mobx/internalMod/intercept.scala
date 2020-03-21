package typingsJapgolly.mobx.internalMod

import typingsJapgolly.mobx.interceptUtilsMod.IInterceptor
import typingsJapgolly.mobx.observablearrayMod.IArrayWillChange
import typingsJapgolly.mobx.observablearrayMod.IArrayWillSplice
import typingsJapgolly.mobx.observablearrayMod.IObservableArray
import typingsJapgolly.mobx.observablemapMod.IMapWillChange
import typingsJapgolly.mobx.observableobjectMod.IObjectWillChange
import typingsJapgolly.mobx.observablesetMod.ISetWillChange
import typingsJapgolly.mobx.observablevalueMod.IObservableValue
import typingsJapgolly.mobx.observablevalueMod.IValueWillChange
import typingsJapgolly.mobx.utilsMod.Lambda
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/internal", "intercept")
@js.native
object intercept extends js.Object {
  def apply(`object`: js.Object, handler: IInterceptor[IObjectWillChange]): Lambda = js.native
  def apply[T](
    observableArray: IObservableArray[T],
    handler: IInterceptor[IArrayWillChange[T] | IArrayWillSplice[T]]
  ): Lambda = js.native
  def apply[V](observableMap: ObservableSet[V], handler: IInterceptor[ISetWillChange[V]]): Lambda = js.native
  def apply[T](value: IObservableValue[T], handler: IInterceptor[IValueWillChange[T]]): Lambda = js.native
  def apply[T /* <: js.Object */, K /* <: String */](`object`: T, property: K, handler: IInterceptor[IValueWillChange[_]]): Lambda = js.native
  def apply[K, V](observableMap: ObservableMap[K, V], handler: IInterceptor[IMapWillChange[K, V]]): Lambda = js.native
  def apply[K, V](observableMap: ObservableMap[K, V], property: K, handler: IInterceptor[IValueWillChange[V]]): Lambda = js.native
}

