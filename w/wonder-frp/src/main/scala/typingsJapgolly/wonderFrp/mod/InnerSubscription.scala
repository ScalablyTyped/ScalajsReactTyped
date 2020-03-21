package typingsJapgolly.wonderFrp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "InnerSubscription")
@js.native
class InnerSubscription protected ()
  extends typingsJapgolly.wonderFrp.innerSubscriptionMod.InnerSubscription {
  def this(
    subject: typingsJapgolly.wonderFrp.generatorSubjectMod.GeneratorSubject,
    observer: typingsJapgolly.wonderFrp.observerMod.Observer
  ) = this()
  def this(
    subject: typingsJapgolly.wonderFrp.subjectMod.Subject,
    observer: typingsJapgolly.wonderFrp.observerMod.Observer
  ) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "InnerSubscription")
@js.native
object InnerSubscription extends js.Object {
  def create(
    subject: typingsJapgolly.wonderFrp.generatorSubjectMod.GeneratorSubject,
    observer: typingsJapgolly.wonderFrp.observerMod.Observer
  ): typingsJapgolly.wonderFrp.innerSubscriptionMod.InnerSubscription = js.native
  def create(
    subject: typingsJapgolly.wonderFrp.subjectMod.Subject,
    observer: typingsJapgolly.wonderFrp.observerMod.Observer
  ): typingsJapgolly.wonderFrp.innerSubscriptionMod.InnerSubscription = js.native
}

