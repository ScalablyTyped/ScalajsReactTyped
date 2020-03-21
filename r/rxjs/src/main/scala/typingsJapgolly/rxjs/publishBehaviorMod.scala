package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.connectableObservableMod.ConnectableObservable
import typingsJapgolly.rxjs.internalObservableMod.Observable
import typingsJapgolly.rxjs.typesMod.UnaryFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/publishBehavior", JSImport.Namespace)
@js.native
object publishBehaviorMod extends js.Object {
  def publishBehavior[T](value: T): UnaryFunction[Observable[T], ConnectableObservable[T]] = js.native
}

