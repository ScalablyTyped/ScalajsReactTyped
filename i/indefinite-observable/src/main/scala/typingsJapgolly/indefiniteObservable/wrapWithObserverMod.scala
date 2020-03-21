package typingsJapgolly.indefiniteObservable

import typingsJapgolly.indefiniteObservable.typesMod.Observer
import typingsJapgolly.indefiniteObservable.typesMod.ObserverOrNext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("indefinite-observable/dist/wrapWithObserver", JSImport.Namespace)
@js.native
object wrapWithObserverMod extends js.Object {
  def default[T](listener: ObserverOrNext[T]): Observer[T] = js.native
  def wrapWithObserver[T](listener: ObserverOrNext[T]): Observer[T] = js.native
}

