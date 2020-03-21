package typingsJapgolly.indefiniteObservable

import typingsJapgolly.indefiniteObservable.indefiniteObservableMod.default
import typingsJapgolly.indefiniteObservable.typesMod.Connect
import typingsJapgolly.indefiniteObservable.typesMod.Observer
import typingsJapgolly.indefiniteObservable.typesMod.ObserverOrNext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("indefinite-observable", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class IndefiniteObservable[T] protected () extends default[T] {
    /**
      * The provided function should receive an observer and connect that
      * observer's `next` method to an event source (for instance,
      * `element.addEventListener('click', observer.next)`).
      *
      * It must return a function that will disconnect the observer from the event
      * source.
      */
    def this(connect: Connect[T]) = this()
  }
  
  def wrapWithObserver[T](listener: ObserverOrNext[T]): Observer[T] = js.native
}

