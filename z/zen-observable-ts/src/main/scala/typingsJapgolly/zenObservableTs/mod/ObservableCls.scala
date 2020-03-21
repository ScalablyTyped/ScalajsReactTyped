package typingsJapgolly.zenObservableTs.mod

import typingsJapgolly.zenObservableTs.zenObservableMod.Subscriber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zen-observable-ts", "Observable")
@js.native
class ObservableCls[T] protected ()
  extends typingsJapgolly.zenObservableTs.zenObservableMod.Observable[T] {
  def this(subscriber: Subscriber[T]) = this()
}

