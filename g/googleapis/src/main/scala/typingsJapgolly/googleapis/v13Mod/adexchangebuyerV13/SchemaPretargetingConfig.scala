package typingsJapgolly.googleapis.v13Mod.adexchangebuyerV13

import typingsJapgolly.googleapis.AnonToken
import typingsJapgolly.googleapis.AnonWidth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPretargetingConfig extends js.Object {
  /**
    * The id for billing purposes, provided for reference. Leave this field
    * blank for insert requests; the id will be generated automatically.
    */
  var billingId: js.UndefOr[String] = js.native
  /**
    * The config id; generated automatically. Leave this field blank for insert
    * requests.
    */
  var configId: js.UndefOr[String] = js.native
  /**
    * The name of the config. Must be unique. Required for all requests.
    */
  var configName: js.UndefOr[String] = js.native
  /**
    * List must contain exactly one of PRETARGETING_CREATIVE_TYPE_HTML or
    * PRETARGETING_CREATIVE_TYPE_VIDEO.
    */
  var creativeType: js.UndefOr[js.Array[String]] = js.native
  /**
    * Requests which allow one of these (width, height) pairs will match. All
    * pairs must be supported ad dimensions.
    */
  var dimensions: js.UndefOr[js.Array[AnonWidth]] = js.native
  /**
    * Requests with any of these content labels will not match. Values are from
    * content-labels.txt in the downloadable files section.
    */
  var excludedContentLabels: js.UndefOr[js.Array[String]] = js.native
  /**
    * Requests containing any of these geo criteria ids will not match.
    */
  var excludedGeoCriteriaIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Requests containing any of these placements will not match.
    */
  var excludedPlacements: js.UndefOr[js.Array[AnonToken]] = js.native
  /**
    * Requests containing any of these users list ids will not match.
    */
  var excludedUserLists: js.UndefOr[js.Array[String]] = js.native
  /**
    * Requests containing any of these vertical ids will not match. Values are
    * from the publisher-verticals.txt file in the downloadable files section.
    */
  var excludedVerticals: js.UndefOr[js.Array[String]] = js.native
  /**
    * Requests containing any of these geo criteria ids will match.
    */
  var geoCriteriaIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Whether this config is active. Required for all requests.
    */
  var isActive: js.UndefOr[Boolean] = js.native
  /**
    * The kind of the resource, i.e.
    * &quot;adexchangebuyer#pretargetingConfig&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Request containing any of these language codes will match.
    */
  var languages: js.UndefOr[js.Array[String]] = js.native
  /**
    * Requests containing any of these mobile carrier ids will match. Values
    * are from mobile-carriers.csv in the downloadable files section.
    */
  var mobileCarriers: js.UndefOr[js.Array[String]] = js.native
  /**
    * Requests containing any of these mobile device ids will match. Values are
    * from mobile-devices.csv in the downloadable files section.
    */
  var mobileDevices: js.UndefOr[js.Array[String]] = js.native
  /**
    * Requests containing any of these mobile operating system version ids will
    * match. Values are from mobile-os.csv in the downloadable files section.
    */
  var mobileOperatingSystemVersions: js.UndefOr[js.Array[String]] = js.native
  /**
    * Requests containing any of these placements will match.
    */
  var placements: js.UndefOr[js.Array[AnonToken]] = js.native
  /**
    * Requests matching any of these platforms will match. Possible values are
    * PRETARGETING_PLATFORM_MOBILE, PRETARGETING_PLATFORM_DESKTOP, and
    * PRETARGETING_PLATFORM_TABLET.
    */
  var platforms: js.UndefOr[js.Array[String]] = js.native
  /**
    * Creative attributes should be declared here if all creatives
    * corresponding to this pretargeting configuration have that creative
    * attribute. Values are from pretargetable-creative-attributes.txt in the
    * downloadable files section.
    */
  var supportedCreativeAttributes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Requests containing any of these user list ids will match.
    */
  var userLists: js.UndefOr[js.Array[String]] = js.native
  /**
    * Requests that allow any of these vendor ids will match. Values are from
    * vendors.txt in the downloadable files section.
    */
  var vendorTypes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Requests containing any of these vertical ids will match.
    */
  var verticals: js.UndefOr[js.Array[String]] = js.native
}

object SchemaPretargetingConfig {
  @scala.inline
  def apply(
    billingId: String = null,
    configId: String = null,
    configName: String = null,
    creativeType: js.Array[String] = null,
    dimensions: js.Array[AnonWidth] = null,
    excludedContentLabels: js.Array[String] = null,
    excludedGeoCriteriaIds: js.Array[String] = null,
    excludedPlacements: js.Array[AnonToken] = null,
    excludedUserLists: js.Array[String] = null,
    excludedVerticals: js.Array[String] = null,
    geoCriteriaIds: js.Array[String] = null,
    isActive: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    languages: js.Array[String] = null,
    mobileCarriers: js.Array[String] = null,
    mobileDevices: js.Array[String] = null,
    mobileOperatingSystemVersions: js.Array[String] = null,
    placements: js.Array[AnonToken] = null,
    platforms: js.Array[String] = null,
    supportedCreativeAttributes: js.Array[String] = null,
    userLists: js.Array[String] = null,
    vendorTypes: js.Array[String] = null,
    verticals: js.Array[String] = null
  ): SchemaPretargetingConfig = {
    val __obj = js.Dynamic.literal()
    if (billingId != null) __obj.updateDynamic("billingId")(billingId.asInstanceOf[js.Any])
    if (configId != null) __obj.updateDynamic("configId")(configId.asInstanceOf[js.Any])
    if (configName != null) __obj.updateDynamic("configName")(configName.asInstanceOf[js.Any])
    if (creativeType != null) __obj.updateDynamic("creativeType")(creativeType.asInstanceOf[js.Any])
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions.asInstanceOf[js.Any])
    if (excludedContentLabels != null) __obj.updateDynamic("excludedContentLabels")(excludedContentLabels.asInstanceOf[js.Any])
    if (excludedGeoCriteriaIds != null) __obj.updateDynamic("excludedGeoCriteriaIds")(excludedGeoCriteriaIds.asInstanceOf[js.Any])
    if (excludedPlacements != null) __obj.updateDynamic("excludedPlacements")(excludedPlacements.asInstanceOf[js.Any])
    if (excludedUserLists != null) __obj.updateDynamic("excludedUserLists")(excludedUserLists.asInstanceOf[js.Any])
    if (excludedVerticals != null) __obj.updateDynamic("excludedVerticals")(excludedVerticals.asInstanceOf[js.Any])
    if (geoCriteriaIds != null) __obj.updateDynamic("geoCriteriaIds")(geoCriteriaIds.asInstanceOf[js.Any])
    if (!js.isUndefined(isActive)) __obj.updateDynamic("isActive")(isActive.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (languages != null) __obj.updateDynamic("languages")(languages.asInstanceOf[js.Any])
    if (mobileCarriers != null) __obj.updateDynamic("mobileCarriers")(mobileCarriers.asInstanceOf[js.Any])
    if (mobileDevices != null) __obj.updateDynamic("mobileDevices")(mobileDevices.asInstanceOf[js.Any])
    if (mobileOperatingSystemVersions != null) __obj.updateDynamic("mobileOperatingSystemVersions")(mobileOperatingSystemVersions.asInstanceOf[js.Any])
    if (placements != null) __obj.updateDynamic("placements")(placements.asInstanceOf[js.Any])
    if (platforms != null) __obj.updateDynamic("platforms")(platforms.asInstanceOf[js.Any])
    if (supportedCreativeAttributes != null) __obj.updateDynamic("supportedCreativeAttributes")(supportedCreativeAttributes.asInstanceOf[js.Any])
    if (userLists != null) __obj.updateDynamic("userLists")(userLists.asInstanceOf[js.Any])
    if (vendorTypes != null) __obj.updateDynamic("vendorTypes")(vendorTypes.asInstanceOf[js.Any])
    if (verticals != null) __obj.updateDynamic("verticals")(verticals.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPretargetingConfig]
  }
}

