package typingsJapgolly.meteorPrime8consultingOauth2.OAuth2Server_

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.meteor.Meteor.SubscriptionHandle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscribeTo extends js.Object {
  /**
    * Wrapper function to subscribe to the auth code subscription. Returns a standard subscription handle.
    */
  def authCode(): SubscriptionHandle
}

object SubscribeTo {
  @scala.inline
  def apply(authCode: CallbackTo[SubscriptionHandle]): SubscribeTo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("authCode")(authCode.toJsFn)
    __obj.asInstanceOf[SubscribeTo]
  }
}

