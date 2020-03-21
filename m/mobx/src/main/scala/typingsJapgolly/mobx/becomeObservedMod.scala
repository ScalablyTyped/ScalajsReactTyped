package typingsJapgolly.mobx

import typingsJapgolly.mobx.computedvalueMod.IComputedValue
import typingsJapgolly.mobx.coreObservableMod.IObservable
import typingsJapgolly.mobx.internalMod.ObservableMap
import typingsJapgolly.mobx.internalMod.ObservableSet
import typingsJapgolly.mobx.observablearrayMod.IObservableArray
import typingsJapgolly.mobx.utilsMod.Lambda
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/api/become-observed", JSImport.Namespace)
@js.native
object becomeObservedMod extends js.Object {
  def onBecomeObserved(value: IComputedValue[_], listener: Lambda): Lambda = js.native
  def onBecomeObserved(value: IObservable, listener: Lambda): Lambda = js.native
  def onBecomeObserved(value: ObservableMap[_, _], listener: Lambda): Lambda = js.native
  def onBecomeObserved(value: ObservableSet[_], listener: Lambda): Lambda = js.native
  def onBecomeObserved(value: IObservableArray[_], listener: Lambda): Lambda = js.native
  def onBecomeObserved[K, V](value: js.Object, property: K, listener: Lambda): Lambda = js.native
  def onBecomeObserved[K, V](value: ObservableMap[K, V], property: K, listener: Lambda): Lambda = js.native
  def onBecomeUnobserved(value: IComputedValue[_], listener: Lambda): Lambda = js.native
  def onBecomeUnobserved(value: IObservable, listener: Lambda): Lambda = js.native
  def onBecomeUnobserved(value: ObservableMap[_, _], listener: Lambda): Lambda = js.native
  def onBecomeUnobserved(value: ObservableSet[_], listener: Lambda): Lambda = js.native
  def onBecomeUnobserved(value: IObservableArray[_], listener: Lambda): Lambda = js.native
  def onBecomeUnobserved[K, V](value: js.Object, property: K, listener: Lambda): Lambda = js.native
  def onBecomeUnobserved[K, V](value: ObservableMap[K, V], property: K, listener: Lambda): Lambda = js.native
}

