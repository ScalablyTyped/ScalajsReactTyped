package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.internalObservableConnectableObservableMod.ConnectableObservable
import typingsJapgolly.rxjs.internalObservableMod.Observable
import typingsJapgolly.rxjs.internalTypesMod.UnaryFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/publishBehavior", JSImport.Namespace)
@js.native
object internalOperatorsPublishBehaviorMod extends js.Object {
  def publishBehavior[T](value: T): UnaryFunction[Observable[T], ConnectableObservable[T]] = js.native
}

