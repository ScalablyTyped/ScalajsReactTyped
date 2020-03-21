package typingsJapgolly.zenObservable.mod

import typingsJapgolly.std.ArrayLike
import typingsJapgolly.zenObservable.mod._Global_.ZenObservable.ObservableLike
import typingsJapgolly.zenObservable.mod._Global_.ZenObservable.Subscriber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zen-observable", JSImport.Namespace)
@js.native
class ^[T] protected () extends Observable[T] {
  def this(subscriber: Subscriber[T]) = this()
}

@JSImport("zen-observable", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def from[R](observable: ArrayLike[R]): Observable[R] = js.native
  def from[R](observable: Observable[R]): Observable[R] = js.native
  def from[R](observable: ObservableLike[R]): Observable[R] = js.native
  def of[R](items: R*): Observable[R] = js.native
}

