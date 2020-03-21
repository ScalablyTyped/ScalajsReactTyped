package typingsJapgolly.sipJs.apiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api", "SubscriptionState")
@js.native
object SubscriptionState extends js.Object {
  /* "Initial" */ val Initial: typingsJapgolly.sipJs.subscriptionStateMod.SubscriptionState.Initial with String = js.native
  /* "NotifyWait" */ val NotifyWait: typingsJapgolly.sipJs.subscriptionStateMod.SubscriptionState.NotifyWait with String = js.native
  /* "Subscribed" */ val Subscribed: typingsJapgolly.sipJs.subscriptionStateMod.SubscriptionState.Subscribed with String = js.native
  /* "Terminated" */ val Terminated: typingsJapgolly.sipJs.subscriptionStateMod.SubscriptionState.Terminated with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typingsJapgolly.sipJs.subscriptionStateMod.SubscriptionState with String] = js.native
}

