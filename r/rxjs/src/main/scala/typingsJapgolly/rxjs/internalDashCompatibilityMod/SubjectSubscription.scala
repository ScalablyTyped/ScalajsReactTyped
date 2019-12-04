package typingsJapgolly.rxjs.internalDashCompatibilityMod

import typingsJapgolly.rxjs.internalSubjectMod.Subject
import typingsJapgolly.rxjs.internalTypesMod.Observer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal-compatibility", "SubjectSubscription")
@js.native
class SubjectSubscription[T] protected ()
  extends typingsJapgolly.rxjs.internalSubjectSubscriptionMod.SubjectSubscription[T] {
  def this(subject: Subject[T], subscriber: Observer[T]) = this()
}

