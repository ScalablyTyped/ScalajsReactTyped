package typingsJapgolly.rxjs.internalCompatibilityMod

import typingsJapgolly.rxjs.subjectMod.Subject
import typingsJapgolly.rxjs.typesMod.Observer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal-compatibility", "SubjectSubscription")
@js.native
class SubjectSubscription[T] protected ()
  extends typingsJapgolly.rxjs.subjectSubscriptionMod.SubjectSubscription[T] {
  def this(subject: Subject[T], subscriber: Observer[T]) = this()
}

