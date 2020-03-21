package typingsJapgolly.sipJs.subscriberOptionsMod

import typingsJapgolly.sipJs.subscriptionDelegateMod.SubscriptionDelegate
import typingsJapgolly.sipJs.subscriptionOptionsMod.SubscriptionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriberOptions extends SubscriptionOptions {
  var body: js.UndefOr[String] = js.undefined
  var contentType: js.UndefOr[String] = js.undefined
  var expires: js.UndefOr[Double] = js.undefined
  var extraHeaders: js.UndefOr[js.Array[String]] = js.undefined
}

object SubscriberOptions {
  @scala.inline
  def apply(
    body: String = null,
    contentType: String = null,
    delegate: SubscriptionDelegate = null,
    expires: Int | Double = null,
    extraHeaders: js.Array[String] = null
  ): SubscriberOptions = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (delegate != null) __obj.updateDynamic("delegate")(delegate.asInstanceOf[js.Any])
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (extraHeaders != null) __obj.updateDynamic("extraHeaders")(extraHeaders.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriberOptions]
  }
}

