package typingsJapgolly.mobservable.mod

import typingsJapgolly.mobservable.interfacesMod.IObservableArray
import typingsJapgolly.mobservable.interfacesMod.IObservableValue
import typingsJapgolly.std.Date
import typingsJapgolly.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobservable", "makeReactive")
@js.native
object makeReactive extends js.Object {
  def apply(target: js.Object, key: String): js.Any = js.native
  def apply(target: js.Object, key: String, baseDescriptor: js.PropertyDescriptor): js.Any = js.native
  def apply(value: String): IObservableValue[String] = js.native
  def apply(value: js.Function): IObservableValue[js.Function] = js.native
  def apply(value: Boolean): IObservableValue[Boolean] = js.native
  def apply(value: Double): IObservableValue[Double] = js.native
  def apply(value: Unit): IObservableValue[Unit] = js.native
  def apply(value: Date): IObservableValue[js.Date] = js.native
  def apply(value: RegExp): IObservableValue[js.RegExp] = js.native
  def apply[T /* <: js.Object */](value: T): T = js.native
  def apply[T](value: js.Array[T]): IObservableArray[T] = js.native
  def apply[T, S /* <: js.Object */](value: js.Function0[T]): IObservableValue[T] = js.native
  def apply[T, S /* <: js.Object */](value: js.Function0[T], thisArg: S): IObservableValue[T] = js.native
}

