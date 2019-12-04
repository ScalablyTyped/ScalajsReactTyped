package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.internalObservableConnectableObservableMod.ConnectableObservable
import typingsJapgolly.rxjs.internalObservableMod.Observable
import typingsJapgolly.rxjs.internalTypesMod.UnaryFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/publishLast", JSImport.Namespace)
@js.native
object internalOperatorsPublishLastMod extends js.Object {
  def publishLast[T](): UnaryFunction[Observable[T], ConnectableObservable[T]] = js.native
}

