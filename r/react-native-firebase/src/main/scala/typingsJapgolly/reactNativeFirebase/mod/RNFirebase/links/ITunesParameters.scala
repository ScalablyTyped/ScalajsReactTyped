package typingsJapgolly.reactNativeFirebase.mod.RNFirebase.links

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITunesParameters extends js.Object {
  def setAffiliateToken(affiliateToken: String): DynamicLink
  def setCampaignToken(campaignToken: String): DynamicLink
  def setProviderToken(providerToken: String): DynamicLink
}

object ITunesParameters {
  @scala.inline
  def apply(
    setAffiliateToken: String => CallbackTo[DynamicLink],
    setCampaignToken: String => CallbackTo[DynamicLink],
    setProviderToken: String => CallbackTo[DynamicLink]
  ): ITunesParameters = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setAffiliateToken")(js.Any.fromFunction1((t0: java.lang.String) => setAffiliateToken(t0).runNow()))
    __obj.updateDynamic("setCampaignToken")(js.Any.fromFunction1((t0: java.lang.String) => setCampaignToken(t0).runNow()))
    __obj.updateDynamic("setProviderToken")(js.Any.fromFunction1((t0: java.lang.String) => setProviderToken(t0).runNow()))
    __obj.asInstanceOf[ITunesParameters]
  }
}

