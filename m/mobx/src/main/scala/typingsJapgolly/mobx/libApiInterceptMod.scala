package typingsJapgolly.mobx

import typingsJapgolly.mobx.libInternalMod.ObservableMap
import typingsJapgolly.mobx.libInternalMod.ObservableSet
import typingsJapgolly.mobx.libTypesInterceptDashUtilsMod.IInterceptor
import typingsJapgolly.mobx.libTypesObservablearrayMod.IArrayWillChange
import typingsJapgolly.mobx.libTypesObservablearrayMod.IArrayWillSplice
import typingsJapgolly.mobx.libTypesObservablearrayMod.IObservableArray
import typingsJapgolly.mobx.libTypesObservablemapMod.IMapWillChange
import typingsJapgolly.mobx.libTypesObservableobjectMod.IObjectWillChange
import typingsJapgolly.mobx.libTypesObservablesetMod.ISetWillChange
import typingsJapgolly.mobx.libTypesObservablevalueMod.IObservableValue
import typingsJapgolly.mobx.libTypesObservablevalueMod.IValueWillChange
import typingsJapgolly.mobx.libUtilsUtilsMod.Lambda
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/api/intercept", JSImport.Namespace)
@js.native
object libApiInterceptMod extends js.Object {
  def intercept(`object`: js.Object, handler: IInterceptor[IObjectWillChange]): Lambda = js.native
  def intercept[T](
    observableArray: IObservableArray[T],
    handler: IInterceptor[IArrayWillChange[T] | IArrayWillSplice[T]]
  ): Lambda = js.native
  def intercept[V](observableMap: ObservableSet[V], handler: IInterceptor[ISetWillChange[V]]): Lambda = js.native
  def intercept[T](value: IObservableValue[T], handler: IInterceptor[IValueWillChange[T]]): Lambda = js.native
  def intercept[T /* <: js.Object */, K /* <: String */](`object`: T, property: K, handler: IInterceptor[IValueWillChange[_]]): Lambda = js.native
  def intercept[K, V](observableMap: ObservableMap[K, V], handler: IInterceptor[IMapWillChange[K, V]]): Lambda = js.native
  def intercept[K, V](observableMap: ObservableMap[K, V], property: K, handler: IInterceptor[IValueWillChange[V]]): Lambda = js.native
}

