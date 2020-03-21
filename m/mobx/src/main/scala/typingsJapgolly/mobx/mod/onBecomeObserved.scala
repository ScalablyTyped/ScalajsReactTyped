package typingsJapgolly.mobx.mod

import typingsJapgolly.mobx.computedvalueMod.IComputedValue
import typingsJapgolly.mobx.coreObservableMod.IObservable
import typingsJapgolly.mobx.observablearrayMod.IObservableArray
import typingsJapgolly.mobx.utilsMod.Lambda
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx", "onBecomeObserved")
@js.native
object onBecomeObserved extends js.Object {
  def apply(value: IComputedValue[_], listener: Lambda): Lambda = js.native
  def apply(value: IObservable, listener: Lambda): Lambda = js.native
  def apply(value: typingsJapgolly.mobx.internalMod.ObservableMap[_, _], listener: Lambda): Lambda = js.native
  def apply(value: typingsJapgolly.mobx.internalMod.ObservableSet[_], listener: Lambda): Lambda = js.native
  def apply(value: IObservableArray[_], listener: Lambda): Lambda = js.native
  def apply[K, V](value: js.Object, property: K, listener: Lambda): Lambda = js.native
  def apply[K, V](value: typingsJapgolly.mobx.internalMod.ObservableMap[K, V], property: K, listener: Lambda): Lambda = js.native
}

