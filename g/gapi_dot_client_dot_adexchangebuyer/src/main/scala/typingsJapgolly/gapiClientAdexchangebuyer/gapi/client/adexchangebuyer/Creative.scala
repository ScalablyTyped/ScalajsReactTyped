package typingsJapgolly.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typingsJapgolly.gapiClientAdexchangebuyer.AnonAdvertiser
import typingsJapgolly.gapiClientAdexchangebuyer.AnonContexts
import typingsJapgolly.gapiClientAdexchangebuyer.AnonDate
import typingsJapgolly.gapiClientAdexchangebuyer.AnonDisapprovalReasons
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Creative extends js.Object {
  /** The HTML snippet that displays the ad when inserted in the web page. If set, videoURL should not be set. */
  var HTMLSnippet: js.UndefOr[String] = js.undefined
  /** Account id. */
  var accountId: js.UndefOr[Double] = js.undefined
  /** The link to the Ad Preferences page. This is only supported for native ads. */
  var adChoicesDestinationUrl: js.UndefOr[String] = js.undefined
  /** Detected advertiser id, if any. Read-only. This field should not be set in requests. */
  var advertiserId: js.UndefOr[js.Array[String]] = js.undefined
  /** The name of the company being advertised in the creative. The value provided must exist in the advertisers.txt file. */
  var advertiserName: js.UndefOr[String] = js.undefined
  /** The agency id for this creative. */
  var agencyId: js.UndefOr[String] = js.undefined
  /**
    * The last upload timestamp of this creative if it was uploaded via API. Read-only. The value of this field is generated, and will be ignored for
    * uploads. (formatted RFC 3339 timestamp).
    */
  var apiUploadTimestamp: js.UndefOr[String] = js.undefined
  /**
    * List of buyer selectable attributes for the ads that may be shown from this snippet. Each attribute is represented by an integer as defined in
    * buyer-declarable-creative-attributes.txt.
    */
  var attribute: js.UndefOr[js.Array[Double]] = js.undefined
  /** A buyer-specific id identifying the creative in this ad. */
  var buyerCreativeId: js.UndefOr[String] = js.undefined
  /** The set of destination urls for the snippet. */
  var clickThroughUrl: js.UndefOr[js.Array[String]] = js.undefined
  /** Shows any corrections that were applied to this creative. Read-only. This field should not be set in requests. */
  var corrections: js.UndefOr[js.Array[AnonContexts]] = js.undefined
  /**
    * Top-level deals status. Read-only. This field should not be set in requests. If disapproved, an entry for auctionType=DIRECT_DEALS (or ALL) in
    * servingRestrictions will also exist. Note that this may be nuanced with other contextual restrictions, in which case it may be preferable to read from
    * servingRestrictions directly.
    */
  var dealsStatus: js.UndefOr[String] = js.undefined
  /** Detected domains for this creative. Read-only. This field should not be set in requests. */
  var detectedDomains: js.UndefOr[js.Array[String]] = js.undefined
  /** The filtering reasons for the creative. Read-only. This field should not be set in requests. */
  var filteringReasons: js.UndefOr[AnonDate] = js.undefined
  /** Ad height. */
  var height: js.UndefOr[Double] = js.undefined
  /** The set of urls to be called to record an impression. */
  var impressionTrackingUrl: js.UndefOr[js.Array[String]] = js.undefined
  /** Resource type. */
  var kind: js.UndefOr[String] = js.undefined
  /** Detected languages for this creative. Read-only. This field should not be set in requests. */
  var languages: js.UndefOr[js.Array[String]] = js.undefined
  /** If nativeAd is set, HTMLSnippet and the videoURL outside of nativeAd should not be set. (The videoURL inside nativeAd can be set.) */
  var nativeAd: js.UndefOr[AnonAdvertiser] = js.undefined
  /**
    * Top-level open auction status. Read-only. This field should not be set in requests. If disapproved, an entry for auctionType=OPEN_AUCTION (or ALL) in
    * servingRestrictions will also exist. Note that this may be nuanced with other contextual restrictions, in which case it may be preferable to read from
    * ServingRestrictions directly.
    */
  var openAuctionStatus: js.UndefOr[String] = js.undefined
  /**
    * Detected product categories, if any. Each category is represented by an integer as defined in  ad-product-categories.txt. Read-only. This field should
    * not be set in requests.
    */
  var productCategories: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * All restricted categories for the ads that may be shown from this snippet. Each category is represented by an integer as defined in the
    * ad-restricted-categories.txt.
    */
  var restrictedCategories: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * Detected sensitive categories, if any. Each category is represented by an integer as defined in  ad-sensitive-categories.txt. Read-only. This field
    * should not be set in requests.
    */
  var sensitiveCategories: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * The granular status of this ad in specific contexts. A context here relates to where something ultimately serves (for example, a physical location, a
    * platform, an HTTPS vs HTTP request, or the type of auction). Read-only. This field should not be set in requests. See the examples in the Creatives
    * guide for more details.
    */
  var servingRestrictions: js.UndefOr[js.Array[AnonDisapprovalReasons]] = js.undefined
  /** List of vendor types for the ads that may be shown from this snippet. Each vendor type is represented by an integer as defined in vendors.txt. */
  var vendorType: js.UndefOr[js.Array[Double]] = js.undefined
  /** The version for this creative. Read-only. This field should not be set in requests. */
  var version: js.UndefOr[Double] = js.undefined
  /** The URL to fetch a video ad. If set, HTMLSnippet and the nativeAd should not be set. Note, this is different from resource.native_ad.video_url above. */
  var videoURL: js.UndefOr[String] = js.undefined
  /** Ad width. */
  var width: js.UndefOr[Double] = js.undefined
}

object Creative {
  @scala.inline
  def apply(
    HTMLSnippet: String = null,
    accountId: Int | Double = null,
    adChoicesDestinationUrl: String = null,
    advertiserId: js.Array[String] = null,
    advertiserName: String = null,
    agencyId: String = null,
    apiUploadTimestamp: String = null,
    attribute: js.Array[Double] = null,
    buyerCreativeId: String = null,
    clickThroughUrl: js.Array[String] = null,
    corrections: js.Array[AnonContexts] = null,
    dealsStatus: String = null,
    detectedDomains: js.Array[String] = null,
    filteringReasons: AnonDate = null,
    height: Int | Double = null,
    impressionTrackingUrl: js.Array[String] = null,
    kind: String = null,
    languages: js.Array[String] = null,
    nativeAd: AnonAdvertiser = null,
    openAuctionStatus: String = null,
    productCategories: js.Array[Double] = null,
    restrictedCategories: js.Array[Double] = null,
    sensitiveCategories: js.Array[Double] = null,
    servingRestrictions: js.Array[AnonDisapprovalReasons] = null,
    vendorType: js.Array[Double] = null,
    version: Int | Double = null,
    videoURL: String = null,
    width: Int | Double = null
  ): Creative = {
    val __obj = js.Dynamic.literal()
    if (HTMLSnippet != null) __obj.updateDynamic("HTMLSnippet")(HTMLSnippet.asInstanceOf[js.Any])
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (adChoicesDestinationUrl != null) __obj.updateDynamic("adChoicesDestinationUrl")(adChoicesDestinationUrl.asInstanceOf[js.Any])
    if (advertiserId != null) __obj.updateDynamic("advertiserId")(advertiserId.asInstanceOf[js.Any])
    if (advertiserName != null) __obj.updateDynamic("advertiserName")(advertiserName.asInstanceOf[js.Any])
    if (agencyId != null) __obj.updateDynamic("agencyId")(agencyId.asInstanceOf[js.Any])
    if (apiUploadTimestamp != null) __obj.updateDynamic("apiUploadTimestamp")(apiUploadTimestamp.asInstanceOf[js.Any])
    if (attribute != null) __obj.updateDynamic("attribute")(attribute.asInstanceOf[js.Any])
    if (buyerCreativeId != null) __obj.updateDynamic("buyerCreativeId")(buyerCreativeId.asInstanceOf[js.Any])
    if (clickThroughUrl != null) __obj.updateDynamic("clickThroughUrl")(clickThroughUrl.asInstanceOf[js.Any])
    if (corrections != null) __obj.updateDynamic("corrections")(corrections.asInstanceOf[js.Any])
    if (dealsStatus != null) __obj.updateDynamic("dealsStatus")(dealsStatus.asInstanceOf[js.Any])
    if (detectedDomains != null) __obj.updateDynamic("detectedDomains")(detectedDomains.asInstanceOf[js.Any])
    if (filteringReasons != null) __obj.updateDynamic("filteringReasons")(filteringReasons.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (impressionTrackingUrl != null) __obj.updateDynamic("impressionTrackingUrl")(impressionTrackingUrl.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (languages != null) __obj.updateDynamic("languages")(languages.asInstanceOf[js.Any])
    if (nativeAd != null) __obj.updateDynamic("nativeAd")(nativeAd.asInstanceOf[js.Any])
    if (openAuctionStatus != null) __obj.updateDynamic("openAuctionStatus")(openAuctionStatus.asInstanceOf[js.Any])
    if (productCategories != null) __obj.updateDynamic("productCategories")(productCategories.asInstanceOf[js.Any])
    if (restrictedCategories != null) __obj.updateDynamic("restrictedCategories")(restrictedCategories.asInstanceOf[js.Any])
    if (sensitiveCategories != null) __obj.updateDynamic("sensitiveCategories")(sensitiveCategories.asInstanceOf[js.Any])
    if (servingRestrictions != null) __obj.updateDynamic("servingRestrictions")(servingRestrictions.asInstanceOf[js.Any])
    if (vendorType != null) __obj.updateDynamic("vendorType")(vendorType.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (videoURL != null) __obj.updateDynamic("videoURL")(videoURL.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Creative]
  }
}

