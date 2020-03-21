package typingsJapgolly.sipJs.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "SubscriptionState")
@js.native
object SubscriptionState extends js.Object {
  /* "Active" */ val Active: typingsJapgolly.sipJs.subscriptionSubscriptionMod.SubscriptionState.Active with String = js.native
  /* "Initial" */ val Initial: typingsJapgolly.sipJs.subscriptionSubscriptionMod.SubscriptionState.Initial with String = js.native
  /* "NotifyWait" */ val NotifyWait: typingsJapgolly.sipJs.subscriptionSubscriptionMod.SubscriptionState.NotifyWait with String = js.native
  /* "Pending" */ val Pending: typingsJapgolly.sipJs.subscriptionSubscriptionMod.SubscriptionState.Pending with String = js.native
  /* "Terminated" */ val Terminated: typingsJapgolly.sipJs.subscriptionSubscriptionMod.SubscriptionState.Terminated with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typingsJapgolly.sipJs.subscriptionSubscriptionMod.SubscriptionState with String] = js.native
}

