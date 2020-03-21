package typingsJapgolly.wonderFrp.es2015Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "InnerSubscription")
@js.native
class InnerSubscription protected ()
  extends typingsJapgolly.wonderFrp.disposableInnerSubscriptionMod.InnerSubscription {
  def this(
    subject: typingsJapgolly.wonderFrp.subjectGeneratorSubjectMod.GeneratorSubject,
    observer: typingsJapgolly.wonderFrp.coreObserverMod.Observer
  ) = this()
  def this(
    subject: typingsJapgolly.wonderFrp.subjectSubjectMod.Subject,
    observer: typingsJapgolly.wonderFrp.coreObserverMod.Observer
  ) = this()
}

/* static members */
@JSImport("wonder-frp/dist/es2015", "InnerSubscription")
@js.native
object InnerSubscription extends js.Object {
  def create(
    subject: typingsJapgolly.wonderFrp.subjectGeneratorSubjectMod.GeneratorSubject,
    observer: typingsJapgolly.wonderFrp.coreObserverMod.Observer
  ): typingsJapgolly.wonderFrp.disposableInnerSubscriptionMod.InnerSubscription = js.native
  def create(
    subject: typingsJapgolly.wonderFrp.subjectSubjectMod.Subject,
    observer: typingsJapgolly.wonderFrp.coreObserverMod.Observer
  ): typingsJapgolly.wonderFrp.disposableInnerSubscriptionMod.InnerSubscription = js.native
}

