package typingsJapgolly.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServingContext extends js.Object {
  /** Matches all contexts. */
  var all: js.UndefOr[String] = js.undefined
  /** Matches impressions for a particular app type. */
  var appType: js.UndefOr[AppContext] = js.undefined
  /** Matches impressions for a particular auction type. */
  var auctionType: js.UndefOr[AuctionContext] = js.undefined
  /**
    * Matches impressions coming from users &#42;or&#42; publishers in a specific
    * location.
    */
  var location: js.UndefOr[LocationContext] = js.undefined
  /** Matches impressions coming from a particular platform. */
  var platform: js.UndefOr[PlatformContext] = js.undefined
  /** Matches impressions for a particular security type. */
  var securityType: js.UndefOr[SecurityContext] = js.undefined
}

object ServingContext {
  @scala.inline
  def apply(
    all: String = null,
    appType: AppContext = null,
    auctionType: AuctionContext = null,
    location: LocationContext = null,
    platform: PlatformContext = null,
    securityType: SecurityContext = null
  ): ServingContext = {
    val __obj = js.Dynamic.literal()
    if (all != null) __obj.updateDynamic("all")(all.asInstanceOf[js.Any])
    if (appType != null) __obj.updateDynamic("appType")(appType.asInstanceOf[js.Any])
    if (auctionType != null) __obj.updateDynamic("auctionType")(auctionType.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (securityType != null) __obj.updateDynamic("securityType")(securityType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServingContext]
  }
}

