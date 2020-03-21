package typingsJapgolly.mobservable.coreMod

import typingsJapgolly.mobservable.interfacesMod.IObservableValue
import typingsJapgolly.mobservable.observablevalueMod.ObservableValue
import typingsJapgolly.mobservable.observableviewMod.ObservableView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobservable/lib/core", "toGetterSetterFunction")
@js.native
object toGetterSetterFunction extends js.Object {
  def apply[T](observable: ObservableValue[T]): IObservableValue[T] = js.native
  def apply[T](observable: ObservableView[T]): IObservableValue[T] = js.native
}

