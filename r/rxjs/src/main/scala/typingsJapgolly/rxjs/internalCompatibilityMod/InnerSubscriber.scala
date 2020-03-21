package typingsJapgolly.rxjs.internalCompatibilityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal-compatibility", "InnerSubscriber")
@js.native
class InnerSubscriber[T, R] protected ()
  extends typingsJapgolly.rxjs.innerSubscriberMod.InnerSubscriber[T, R] {
  def this(
    parent: typingsJapgolly.rxjs.outerSubscriberMod.OuterSubscriber[T, R],
    outerValue: T,
    outerIndex: Double
  ) = this()
}

