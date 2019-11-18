package typingsJapgolly.mobx

import typingsJapgolly.mobx.libApiInterceptDashReadMod.ReadInterceptor
import typingsJapgolly.mobx.libInternalMod.ObservableMap
import typingsJapgolly.mobx.libInternalMod.ObservableSet
import typingsJapgolly.mobx.libTypesObservablearrayMod.IObservableArray
import typingsJapgolly.mobx.libTypesObservablevalueMod.IObservableValue
import typingsJapgolly.mobx.libUtilsUtilsMod.Lambda
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/api/intercept-read", JSImport.Namespace)
@js.native
object libApiInterceptDashReadMod extends js.Object {
  def interceptReads(`object`: js.Object, property: String, handler: ReadInterceptor[_]): Lambda = js.native
  def interceptReads[T](observableArray: IObservableArray[T], handler: ReadInterceptor[T]): Lambda = js.native
  def interceptReads[V](observableSet: ObservableSet[V], handler: ReadInterceptor[V]): Lambda = js.native
  def interceptReads[T](value: IObservableValue[T], handler: ReadInterceptor[T]): Lambda = js.native
  def interceptReads[K, V](observableMap: ObservableMap[K, V], handler: ReadInterceptor[V]): Lambda = js.native
  type ReadInterceptor[T] = js.Function1[/* value */ js.Any, T]
}

