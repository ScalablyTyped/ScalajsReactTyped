package typingsJapgolly.mobservable.coreMod

import typingsJapgolly.mobservable.interfacesMod.IArrayChange
import typingsJapgolly.mobservable.interfacesMod.IArraySplice
import typingsJapgolly.mobservable.interfacesMod.IObjectChange
import typingsJapgolly.mobservable.interfacesMod.IObservableArray
import typingsJapgolly.mobservable.interfacesMod.Lambda
import typingsJapgolly.mobservable.observablemapMod.ObservableMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobservable/lib/core", "observe")
@js.native
object observe extends js.Object {
  def apply(func: js.Function0[Unit]): Lambda = js.native
  def apply[T /* <: js.Object */](`object`: T, listener: js.Function1[/* change */ IObjectChange[_, T], Unit]): Lambda = js.native
  def apply[T](
    observableArray: IObservableArray[T],
    listener: js.Function1[/* change */ IArrayChange[T] | IArraySplice[T], Unit]
  ): Lambda = js.native
  def apply[T](
    observableMap: ObservableMap[T],
    listener: js.Function1[/* change */ IObjectChange[T, ObservableMap[T]], Unit]
  ): Lambda = js.native
  def apply[T /* <: js.Object */, Y](
    `object`: T,
    prop: String,
    listener: js.Function2[/* newValue */ Y, /* oldValue */ js.UndefOr[Y], Unit]
  ): Lambda = js.native
}

