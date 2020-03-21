package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.subjectMod.Subject
import typingsJapgolly.rxjs.subscriptionMod.Subscription
import typingsJapgolly.rxjs.typesMod.Observer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/SubjectSubscription", JSImport.Namespace)
@js.native
object subjectSubscriptionMod extends js.Object {
  @js.native
  class SubjectSubscription[T] protected () extends Subscription {
    def this(subject: Subject[T], subscriber: Observer[T]) = this()
    var subject: Subject[T] = js.native
    var subscriber: Observer[T] = js.native
  }
  
}

