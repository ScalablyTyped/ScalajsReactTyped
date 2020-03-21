package typingsJapgolly.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ad extends js.Object {
  /** Account ID of this ad. This is a read-only field that can be left blank. */
  var accountId: js.UndefOr[String] = js.undefined
  /** Whether this ad is active. When true, archived must be false. */
  var active: js.UndefOr[Boolean] = js.undefined
  /** Advertiser ID of this ad. This is a required field on insertion. */
  var advertiserId: js.UndefOr[String] = js.undefined
  /** Dimension value for the ID of the advertiser. This is a read-only, auto-generated field. */
  var advertiserIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  /** Whether this ad is archived. When true, active must be false. */
  var archived: js.UndefOr[Boolean] = js.undefined
  /** Audience segment ID that is being targeted for this ad. Applicable when type is AD_SERVING_STANDARD_AD. */
  var audienceSegmentId: js.UndefOr[String] = js.undefined
  /** Campaign ID of this ad. This is a required field on insertion. */
  var campaignId: js.UndefOr[String] = js.undefined
  /** Dimension value for the ID of the campaign. This is a read-only, auto-generated field. */
  var campaignIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  /** Click-through URL for this ad. This is a required field on insertion. Applicable when type is AD_SERVING_CLICK_TRACKER. */
  var clickThroughUrl: js.UndefOr[ClickThroughUrl] = js.undefined
  /** Click-through URL suffix properties for this ad. Applies to the URL in the ad or (if overriding ad properties) the URL in the creative. */
  var clickThroughUrlSuffixProperties: js.UndefOr[ClickThroughUrlSuffixProperties] = js.undefined
  /** Comments for this ad. */
  var comments: js.UndefOr[String] = js.undefined
  /**
    * Compatibility of this ad. Applicable when type is AD_SERVING_DEFAULT_AD. DISPLAY and DISPLAY_INTERSTITIAL refer to either rendering on desktop or on
    * mobile devices or in mobile apps for regular or interstitial ads, respectively. APP and APP_INTERSTITIAL are only used for existing default ads. New
    * mobile placements must be assigned DISPLAY or DISPLAY_INTERSTITIAL and default ads created for those placements will be limited to those compatibility
    * types. IN_STREAM_VIDEO refers to rendering in-stream video ads developed with the VAST standard.
    */
  var compatibility: js.UndefOr[String] = js.undefined
  /** Information about the creation of this ad. This is a read-only field. */
  var createInfo: js.UndefOr[LastModifiedInfo] = js.undefined
  /**
    * Creative group assignments for this ad. Applicable when type is AD_SERVING_CLICK_TRACKER. Only one assignment per creative group number is allowed for
    * a maximum of two assignments.
    */
  var creativeGroupAssignments: js.UndefOr[js.Array[CreativeGroupAssignment]] = js.undefined
  /**
    * Creative rotation for this ad. Applicable when type is AD_SERVING_DEFAULT_AD, AD_SERVING_STANDARD_AD, or AD_SERVING_TRACKING. When type is
    * AD_SERVING_DEFAULT_AD, this field should have exactly one creativeAssignment.
    */
  var creativeRotation: js.UndefOr[CreativeRotation] = js.undefined
  /**
    * Time and day targeting information for this ad. This field must be left blank if the ad is using a targeting template. Applicable when type is
    * AD_SERVING_STANDARD_AD.
    */
  var dayPartTargeting: js.UndefOr[DayPartTargeting] = js.undefined
  /** Default click-through event tag properties for this ad. */
  var defaultClickThroughEventTagProperties: js.UndefOr[DefaultClickThroughEventTagProperties] = js.undefined
  /**
    * Delivery schedule information for this ad. Applicable when type is AD_SERVING_STANDARD_AD or AD_SERVING_TRACKING. This field along with subfields
    * priority and impressionRatio are required on insertion when type is AD_SERVING_STANDARD_AD.
    */
  var deliverySchedule: js.UndefOr[DeliverySchedule] = js.undefined
  /**
    * Whether this ad is a dynamic click tracker. Applicable when type is AD_SERVING_CLICK_TRACKER. This is a required field on insert, and is read-only
    * after insert.
    */
  var dynamicClickTracker: js.UndefOr[Boolean] = js.undefined
  /** Date and time that this ad should stop serving. Must be later than the start time. This is a required field on insertion. */
  var endTime: js.UndefOr[String] = js.undefined
  /** Event tag overrides for this ad. */
  var eventTagOverrides: js.UndefOr[js.Array[EventTagOverride]] = js.undefined
  /**
    * Geographical targeting information for this ad. This field must be left blank if the ad is using a targeting template. Applicable when type is
    * AD_SERVING_STANDARD_AD.
    */
  var geoTargeting: js.UndefOr[GeoTargeting] = js.undefined
  /** ID of this ad. This is a read-only, auto-generated field. */
  var id: js.UndefOr[String] = js.undefined
  /** Dimension value for the ID of this ad. This is a read-only, auto-generated field. */
  var idDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  /**
    * Key-value targeting information for this ad. This field must be left blank if the ad is using a targeting template. Applicable when type is
    * AD_SERVING_STANDARD_AD.
    */
  var keyValueTargetingExpression: js.UndefOr[KeyValueTargetingExpression] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#ad". */
  var kind: js.UndefOr[String] = js.undefined
  /**
    * Language targeting information for this ad. This field must be left blank if the ad is using a targeting template. Applicable when type is
    * AD_SERVING_STANDARD_AD.
    */
  var languageTargeting: js.UndefOr[LanguageTargeting] = js.undefined
  /** Information about the most recent modification of this ad. This is a read-only field. */
  var lastModifiedInfo: js.UndefOr[LastModifiedInfo] = js.undefined
  /** Name of this ad. This is a required field and must be less than 256 characters long. */
  var name: js.UndefOr[String] = js.undefined
  /** Placement assignments for this ad. */
  var placementAssignments: js.UndefOr[js.Array[PlacementAssignment]] = js.undefined
  /**
    * Remarketing list targeting expression for this ad. This field must be left blank if the ad is using a targeting template. Applicable when type is
    * AD_SERVING_STANDARD_AD.
    */
  var remarketingListExpression: js.UndefOr[ListTargetingExpression] = js.undefined
  /** Size of this ad. Applicable when type is AD_SERVING_DEFAULT_AD. */
  var size: js.UndefOr[Size] = js.undefined
  /** Whether this ad is ssl compliant. This is a read-only field that is auto-generated when the ad is inserted or updated. */
  var sslCompliant: js.UndefOr[Boolean] = js.undefined
  /** Whether this ad requires ssl. This is a read-only field that is auto-generated when the ad is inserted or updated. */
  var sslRequired: js.UndefOr[Boolean] = js.undefined
  /** Date and time that this ad should start serving. If creating an ad, this field must be a time in the future. This is a required field on insertion. */
  var startTime: js.UndefOr[String] = js.undefined
  /** Subaccount ID of this ad. This is a read-only field that can be left blank. */
  var subaccountId: js.UndefOr[String] = js.undefined
  /**
    * Targeting template ID, used to apply preconfigured targeting information to this ad. This cannot be set while any of dayPartTargeting, geoTargeting,
    * keyValueTargetingExpression, languageTargeting, remarketingListExpression, or technologyTargeting are set. Applicable when type is
    * AD_SERVING_STANDARD_AD.
    */
  var targetingTemplateId: js.UndefOr[String] = js.undefined
  /**
    * Technology platform targeting information for this ad. This field must be left blank if the ad is using a targeting template. Applicable when type is
    * AD_SERVING_STANDARD_AD.
    */
  var technologyTargeting: js.UndefOr[TechnologyTargeting] = js.undefined
  /** Type of ad. This is a required field on insertion. Note that default ads (AD_SERVING_DEFAULT_AD) cannot be created directly (see Creative resource). */
  var `type`: js.UndefOr[String] = js.undefined
}

object Ad {
  @scala.inline
  def apply(
    accountId: String = null,
    active: js.UndefOr[Boolean] = js.undefined,
    advertiserId: String = null,
    advertiserIdDimensionValue: DimensionValue = null,
    archived: js.UndefOr[Boolean] = js.undefined,
    audienceSegmentId: String = null,
    campaignId: String = null,
    campaignIdDimensionValue: DimensionValue = null,
    clickThroughUrl: ClickThroughUrl = null,
    clickThroughUrlSuffixProperties: ClickThroughUrlSuffixProperties = null,
    comments: String = null,
    compatibility: String = null,
    createInfo: LastModifiedInfo = null,
    creativeGroupAssignments: js.Array[CreativeGroupAssignment] = null,
    creativeRotation: CreativeRotation = null,
    dayPartTargeting: DayPartTargeting = null,
    defaultClickThroughEventTagProperties: DefaultClickThroughEventTagProperties = null,
    deliverySchedule: DeliverySchedule = null,
    dynamicClickTracker: js.UndefOr[Boolean] = js.undefined,
    endTime: String = null,
    eventTagOverrides: js.Array[EventTagOverride] = null,
    geoTargeting: GeoTargeting = null,
    id: String = null,
    idDimensionValue: DimensionValue = null,
    keyValueTargetingExpression: KeyValueTargetingExpression = null,
    kind: String = null,
    languageTargeting: LanguageTargeting = null,
    lastModifiedInfo: LastModifiedInfo = null,
    name: String = null,
    placementAssignments: js.Array[PlacementAssignment] = null,
    remarketingListExpression: ListTargetingExpression = null,
    size: Size = null,
    sslCompliant: js.UndefOr[Boolean] = js.undefined,
    sslRequired: js.UndefOr[Boolean] = js.undefined,
    startTime: String = null,
    subaccountId: String = null,
    targetingTemplateId: String = null,
    technologyTargeting: TechnologyTargeting = null,
    `type`: String = null
  ): Ad = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (advertiserId != null) __obj.updateDynamic("advertiserId")(advertiserId.asInstanceOf[js.Any])
    if (advertiserIdDimensionValue != null) __obj.updateDynamic("advertiserIdDimensionValue")(advertiserIdDimensionValue.asInstanceOf[js.Any])
    if (!js.isUndefined(archived)) __obj.updateDynamic("archived")(archived.asInstanceOf[js.Any])
    if (audienceSegmentId != null) __obj.updateDynamic("audienceSegmentId")(audienceSegmentId.asInstanceOf[js.Any])
    if (campaignId != null) __obj.updateDynamic("campaignId")(campaignId.asInstanceOf[js.Any])
    if (campaignIdDimensionValue != null) __obj.updateDynamic("campaignIdDimensionValue")(campaignIdDimensionValue.asInstanceOf[js.Any])
    if (clickThroughUrl != null) __obj.updateDynamic("clickThroughUrl")(clickThroughUrl.asInstanceOf[js.Any])
    if (clickThroughUrlSuffixProperties != null) __obj.updateDynamic("clickThroughUrlSuffixProperties")(clickThroughUrlSuffixProperties.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (compatibility != null) __obj.updateDynamic("compatibility")(compatibility.asInstanceOf[js.Any])
    if (createInfo != null) __obj.updateDynamic("createInfo")(createInfo.asInstanceOf[js.Any])
    if (creativeGroupAssignments != null) __obj.updateDynamic("creativeGroupAssignments")(creativeGroupAssignments.asInstanceOf[js.Any])
    if (creativeRotation != null) __obj.updateDynamic("creativeRotation")(creativeRotation.asInstanceOf[js.Any])
    if (dayPartTargeting != null) __obj.updateDynamic("dayPartTargeting")(dayPartTargeting.asInstanceOf[js.Any])
    if (defaultClickThroughEventTagProperties != null) __obj.updateDynamic("defaultClickThroughEventTagProperties")(defaultClickThroughEventTagProperties.asInstanceOf[js.Any])
    if (deliverySchedule != null) __obj.updateDynamic("deliverySchedule")(deliverySchedule.asInstanceOf[js.Any])
    if (!js.isUndefined(dynamicClickTracker)) __obj.updateDynamic("dynamicClickTracker")(dynamicClickTracker.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (eventTagOverrides != null) __obj.updateDynamic("eventTagOverrides")(eventTagOverrides.asInstanceOf[js.Any])
    if (geoTargeting != null) __obj.updateDynamic("geoTargeting")(geoTargeting.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (idDimensionValue != null) __obj.updateDynamic("idDimensionValue")(idDimensionValue.asInstanceOf[js.Any])
    if (keyValueTargetingExpression != null) __obj.updateDynamic("keyValueTargetingExpression")(keyValueTargetingExpression.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (languageTargeting != null) __obj.updateDynamic("languageTargeting")(languageTargeting.asInstanceOf[js.Any])
    if (lastModifiedInfo != null) __obj.updateDynamic("lastModifiedInfo")(lastModifiedInfo.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (placementAssignments != null) __obj.updateDynamic("placementAssignments")(placementAssignments.asInstanceOf[js.Any])
    if (remarketingListExpression != null) __obj.updateDynamic("remarketingListExpression")(remarketingListExpression.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(sslCompliant)) __obj.updateDynamic("sslCompliant")(sslCompliant.asInstanceOf[js.Any])
    if (!js.isUndefined(sslRequired)) __obj.updateDynamic("sslRequired")(sslRequired.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (subaccountId != null) __obj.updateDynamic("subaccountId")(subaccountId.asInstanceOf[js.Any])
    if (targetingTemplateId != null) __obj.updateDynamic("targetingTemplateId")(targetingTemplateId.asInstanceOf[js.Any])
    if (technologyTargeting != null) __obj.updateDynamic("technologyTargeting")(technologyTargeting.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ad]
  }
}

