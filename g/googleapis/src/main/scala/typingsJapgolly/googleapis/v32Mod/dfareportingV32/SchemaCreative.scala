package typingsJapgolly.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains properties of a Creative.
  */
@js.native
trait SchemaCreative extends js.Object {
  /**
    * Account ID of this creative. This field, if left unset, will be
    * auto-generated for both insert and update operations. Applicable to all
    * creative types.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Whether the creative is active. Applicable to all creative types.
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * Ad parameters user for VPAID creative. This is a read-only field.
    * Applicable to the following creative types: all VPAID.
    */
  var adParameters: js.UndefOr[String] = js.native
  /**
    * Keywords for a Rich Media creative. Keywords let you customize the
    * creative settings of a Rich Media ad running on your site without having
    * to contact the advertiser. You can use keywords to dynamically change the
    * look or functionality of a creative. Applicable to the following creative
    * types: all RICH_MEDIA, and all VPAID.
    */
  var adTagKeys: js.UndefOr[js.Array[String]] = js.native
  /**
    * Additional sizes associated with a responsive creative. When inserting or
    * updating a creative either the size ID field or size width and height
    * fields can be used. Applicable to DISPLAY creatives when the primary
    * asset type is HTML_IMAGE.
    */
  var additionalSizes: js.UndefOr[js.Array[SchemaSize]] = js.native
  /**
    * Advertiser ID of this creative. This is a required field. Applicable to
    * all creative types.
    */
  var advertiserId: js.UndefOr[String] = js.native
  /**
    * Whether script access is allowed for this creative. This is a read-only
    * and deprecated field which will automatically be set to true on update.
    * Applicable to the following creative types: FLASH_INPAGE.
    */
  var allowScriptAccess: js.UndefOr[Boolean] = js.native
  /**
    * Whether the creative is archived. Applicable to all creative types.
    */
  var archived: js.UndefOr[Boolean] = js.native
  /**
    * Type of artwork used for the creative. This is a read-only field.
    * Applicable to the following creative types: all RICH_MEDIA, and all
    * VPAID.
    */
  var artworkType: js.UndefOr[String] = js.native
  /**
    * Source application where creative was authored. Presently, only DBM
    * authored creatives will have this field set. Applicable to all creative
    * types.
    */
  var authoringSource: js.UndefOr[String] = js.native
  /**
    * Authoring tool for HTML5 banner creatives. This is a read-only field.
    * Applicable to the following creative types: HTML5_BANNER.
    */
  var authoringTool: js.UndefOr[String] = js.native
  /**
    * Whether images are automatically advanced for image gallery creatives.
    * Applicable to the following creative types: DISPLAY_IMAGE_GALLERY.
    */
  var autoAdvanceImages: js.UndefOr[Boolean] = js.native
  /**
    * The 6-character HTML color code, beginning with #, for the background of
    * the window area where the Flash file is displayed. Default is white.
    * Applicable to the following creative types: FLASH_INPAGE.
    */
  var backgroundColor: js.UndefOr[String] = js.native
  /**
    * Click-through URL for backup image. Applicable to ENHANCED_BANNER when
    * the primary asset type is not HTML_IMAGE.
    */
  var backupImageClickThroughUrl: js.UndefOr[SchemaCreativeClickThroughUrl] = js.native
  /**
    * List of feature dependencies that will cause a backup image to be served
    * if the browser that serves the ad does not support them. Feature
    * dependencies are features that a browser must be able to support in order
    * to render your HTML5 creative asset correctly. This field is initially
    * auto-generated to contain all features detected by Campaign Manager for
    * all the assets of this creative and can then be modified by the client.
    * To reset this field, copy over all the creativeAssets&#39; detected
    * features. Applicable to the following creative types: HTML5_BANNER.
    * Applicable to DISPLAY when the primary asset type is not HTML_IMAGE.
    */
  var backupImageFeatures: js.UndefOr[js.Array[String]] = js.native
  /**
    * Reporting label used for HTML5 banner backup image. Applicable to the
    * following creative types: DISPLAY when the primary asset type is not
    * HTML_IMAGE.
    */
  var backupImageReportingLabel: js.UndefOr[String] = js.native
  /**
    * Target window for backup image. Applicable to the following creative
    * types: FLASH_INPAGE and HTML5_BANNER. Applicable to DISPLAY when the
    * primary asset type is not HTML_IMAGE.
    */
  var backupImageTargetWindow: js.UndefOr[SchemaTargetWindow] = js.native
  /**
    * Click tags of the creative. For DISPLAY, FLASH_INPAGE, and HTML5_BANNER
    * creatives, this is a subset of detected click tags for the assets
    * associated with this creative. After creating a flash asset, detected
    * click tags will be returned in the creativeAssetMetadata. When inserting
    * the creative, populate the creative clickTags field using the
    * creativeAssetMetadata.clickTags field. For DISPLAY_IMAGE_GALLERY
    * creatives, there should be exactly one entry in this list for each image
    * creative asset. A click tag is matched with a corresponding creative
    * asset by matching the clickTag.name field with the
    * creativeAsset.assetIdentifier.name field. Applicable to the following
    * creative types: DISPLAY_IMAGE_GALLERY, FLASH_INPAGE, HTML5_BANNER.
    * Applicable to DISPLAY when the primary asset type is not HTML_IMAGE.
    */
  var clickTags: js.UndefOr[js.Array[SchemaClickTag]] = js.native
  /**
    * Industry standard ID assigned to creative for reach and frequency.
    * Applicable to INSTREAM_VIDEO_REDIRECT creatives.
    */
  var commercialId: js.UndefOr[String] = js.native
  /**
    * List of companion creatives assigned to an in-Stream video creative.
    * Acceptable values include IDs of existing flash and image creatives.
    * Applicable to the following creative types: all VPAID, all INSTREAM_AUDIO
    * and all INSTREAM_VIDEO with dynamicAssetSelection set to false.
    */
  var companionCreatives: js.UndefOr[js.Array[String]] = js.native
  /**
    * Compatibilities associated with this creative. This is a read-only field.
    * DISPLAY and DISPLAY_INTERSTITIAL refer to rendering either on desktop or
    * on mobile devices or in mobile apps for regular or interstitial ads,
    * respectively. APP and APP_INTERSTITIAL are for rendering in mobile apps.
    * Only pre-existing creatives may have these compatibilities since new
    * creatives will either be assigned DISPLAY or DISPLAY_INTERSTITIAL
    * instead. IN_STREAM_VIDEO refers to rendering in in-stream video ads
    * developed with the VAST standard. IN_STREAM_AUDIO refers to rendering in
    * in-stream audio ads developed with the VAST standard. Applicable to all
    * creative types.  Acceptable values are: - &quot;APP&quot; -
    * &quot;APP_INTERSTITIAL&quot; - &quot;IN_STREAM_VIDEO&quot; -
    * &quot;IN_STREAM_AUDIO&quot; - &quot;DISPLAY&quot; -
    * &quot;DISPLAY_INTERSTITIAL&quot;
    */
  var compatibility: js.UndefOr[js.Array[String]] = js.native
  /**
    * Whether Flash assets associated with the creative need to be
    * automatically converted to HTML5. This flag is enabled by default and
    * users can choose to disable it if they don&#39;t want the system to
    * generate and use HTML5 asset for this creative. Applicable to the
    * following creative type: FLASH_INPAGE. Applicable to DISPLAY when the
    * primary asset type is not HTML_IMAGE.
    */
  var convertFlashToHtml5: js.UndefOr[Boolean] = js.native
  /**
    * List of counter events configured for the creative. For
    * DISPLAY_IMAGE_GALLERY creatives, these are read-only and auto-generated
    * from clickTags. Applicable to the following creative types:
    * DISPLAY_IMAGE_GALLERY, all RICH_MEDIA, and all VPAID.
    */
  var counterCustomEvents: js.UndefOr[js.Array[SchemaCreativeCustomEvent]] = js.native
  /**
    * Required if dynamicAssetSelection is true.
    */
  var creativeAssetSelection: js.UndefOr[SchemaCreativeAssetSelection] = js.native
  /**
    * Assets associated with a creative. Applicable to all but the following
    * creative types: INTERNAL_REDIRECT, INTERSTITIAL_INTERNAL_REDIRECT, and
    * REDIRECT
    */
  var creativeAssets: js.UndefOr[js.Array[SchemaCreativeAsset]] = js.native
  /**
    * Creative field assignments for this creative. Applicable to all creative
    * types.
    */
  var creativeFieldAssignments: js.UndefOr[js.Array[SchemaCreativeFieldAssignment]] = js.native
  /**
    * Custom key-values for a Rich Media creative. Key-values let you customize
    * the creative settings of a Rich Media ad running on your site without
    * having to contact the advertiser. You can use key-values to dynamically
    * change the look or functionality of a creative. Applicable to the
    * following creative types: all RICH_MEDIA, and all VPAID.
    */
  var customKeyValues: js.UndefOr[js.Array[String]] = js.native
  /**
    * Set this to true to enable the use of rules to target individual assets
    * in this creative. When set to true creativeAssetSelection must be set.
    * This also controls asset-level companions. When this is true, companion
    * creatives should be assigned to creative assets. Learn more. Applicable
    * to INSTREAM_VIDEO creatives.
    */
  var dynamicAssetSelection: js.UndefOr[Boolean] = js.native
  /**
    * List of exit events configured for the creative. For DISPLAY and
    * DISPLAY_IMAGE_GALLERY creatives, these are read-only and auto-generated
    * from clickTags, For DISPLAY, an event is also created from the
    * backupImageReportingLabel. Applicable to the following creative types:
    * DISPLAY_IMAGE_GALLERY, all RICH_MEDIA, and all VPAID. Applicable to
    * DISPLAY when the primary asset type is not HTML_IMAGE.
    */
  var exitCustomEvents: js.UndefOr[js.Array[SchemaCreativeCustomEvent]] = js.native
  /**
    * OpenWindow FSCommand of this creative. This lets the SWF file communicate
    * with either Flash Player or the program hosting Flash Player, such as a
    * web browser. This is only triggered if allowScriptAccess field is true.
    * Applicable to the following creative types: FLASH_INPAGE.
    */
  var fsCommand: js.UndefOr[SchemaFsCommand] = js.native
  /**
    * HTML code for the creative. This is a required field when applicable.
    * This field is ignored if htmlCodeLocked is true. Applicable to the
    * following creative types: all CUSTOM, FLASH_INPAGE, and HTML5_BANNER, and
    * all RICH_MEDIA.
    */
  var htmlCode: js.UndefOr[String] = js.native
  /**
    * Whether HTML code is generated by Campaign Manager or manually entered.
    * Set to true to ignore changes to htmlCode. Applicable to the following
    * creative types: FLASH_INPAGE and HTML5_BANNER.
    */
  var htmlCodeLocked: js.UndefOr[Boolean] = js.native
  /**
    * ID of this creative. This is a read-only, auto-generated field.
    * Applicable to all creative types.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Dimension value for the ID of this creative. This is a read-only field.
    * Applicable to all creative types.
    */
  var idDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#creative&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Creative last modification information. This is a read-only field.
    * Applicable to all creative types.
    */
  var lastModifiedInfo: js.UndefOr[SchemaLastModifiedInfo] = js.native
  /**
    * Latest Studio trafficked creative ID associated with rich media and VPAID
    * creatives. This is a read-only field. Applicable to the following
    * creative types: all RICH_MEDIA, and all VPAID.
    */
  var latestTraffickedCreativeId: js.UndefOr[String] = js.native
  /**
    * Description of the audio or video ad. Applicable to the following
    * creative types: all INSTREAM_VIDEO, INSTREAM_AUDIO, and all VPAID.
    */
  var mediaDescription: js.UndefOr[String] = js.native
  /**
    * Creative audio or video duration in seconds. This is a read-only field.
    * Applicable to the following creative types: INSTREAM_VIDEO,
    * INSTREAM_AUDIO, all RICH_MEDIA, and all VPAID.
    */
  var mediaDuration: js.UndefOr[Double] = js.native
  /**
    * Name of the creative. This is a required field and must be less than 256
    * characters long. Applicable to all creative types.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Override CSS value for rich media creatives. Applicable to the following
    * creative types: all RICH_MEDIA.
    */
  var overrideCss: js.UndefOr[String] = js.native
  /**
    * The asset ID of the polite load image asset. Applicable to the creative
    * type: DISPLAY.
    */
  var politeLoadAssetId: js.UndefOr[String] = js.native
  /**
    * Amount of time to play the video before counting a view. Applicable to
    * the following creative types: all INSTREAM_VIDEO.
    */
  var progressOffset: js.UndefOr[SchemaVideoOffset] = js.native
  /**
    * URL of hosted image or hosted video or another ad tag. For
    * INSTREAM_VIDEO_REDIRECT creatives this is the in-stream video redirect
    * URL. The standard for a VAST (Video Ad Serving Template) ad response
    * allows for a redirect link to another VAST 2.0 or 3.0 call. This is a
    * required field when applicable. Applicable to the following creative
    * types: DISPLAY_REDIRECT, INTERNAL_REDIRECT,
    * INTERSTITIAL_INTERNAL_REDIRECT, and INSTREAM_VIDEO_REDIRECT
    */
  var redirectUrl: js.UndefOr[String] = js.native
  /**
    * ID of current rendering version. This is a read-only field. Applicable to
    * all creative types.
    */
  var renderingId: js.UndefOr[String] = js.native
  /**
    * Dimension value for the rendering ID of this creative. This is a
    * read-only field. Applicable to all creative types.
    */
  var renderingIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  /**
    * The minimum required Flash plugin version for this creative. For
    * example, 11.2.202.235. This is a read-only field. Applicable to the
    * following creative types: all RICH_MEDIA, and all VPAID.
    */
  var requiredFlashPluginVersion: js.UndefOr[String] = js.native
  /**
    * The internal Flash version for this creative as calculated by Studio.
    * This is a read-only field. Applicable to the following creative types:
    * FLASH_INPAGE all RICH_MEDIA, and all VPAID. Applicable to DISPLAY when
    * the primary asset type is not HTML_IMAGE.
    */
  var requiredFlashVersion: js.UndefOr[Double] = js.native
  /**
    * Size associated with this creative. When inserting or updating a creative
    * either the size ID field or size width and height fields can be used.
    * This is a required field when applicable; however for IMAGE, FLASH_INPAGE
    * creatives, and for DISPLAY creatives with a primary asset of type
    * HTML_IMAGE, if left blank, this field will be automatically set using the
    * actual size of the associated image assets. Applicable to the following
    * creative types: DISPLAY, DISPLAY_IMAGE_GALLERY, FLASH_INPAGE,
    * HTML5_BANNER, IMAGE, and all RICH_MEDIA.
    */
  var size: js.UndefOr[SchemaSize] = js.native
  /**
    * Amount of time to play the video before the skip button appears.
    * Applicable to the following creative types: all INSTREAM_VIDEO.
    */
  var skipOffset: js.UndefOr[SchemaVideoOffset] = js.native
  /**
    * Whether the user can choose to skip the creative. Applicable to the
    * following creative types: all INSTREAM_VIDEO and all VPAID.
    */
  var skippable: js.UndefOr[Boolean] = js.native
  /**
    * Whether the creative is SSL-compliant. This is a read-only field.
    * Applicable to all creative types.
    */
  var sslCompliant: js.UndefOr[Boolean] = js.native
  /**
    * Whether creative should be treated as SSL compliant even if the system
    * scan shows it&#39;s not. Applicable to all creative types.
    */
  var sslOverride: js.UndefOr[Boolean] = js.native
  /**
    * Studio advertiser ID associated with rich media and VPAID creatives. This
    * is a read-only field. Applicable to the following creative types: all
    * RICH_MEDIA, and all VPAID.
    */
  var studioAdvertiserId: js.UndefOr[String] = js.native
  /**
    * Studio creative ID associated with rich media and VPAID creatives. This
    * is a read-only field. Applicable to the following creative types: all
    * RICH_MEDIA, and all VPAID.
    */
  var studioCreativeId: js.UndefOr[String] = js.native
  /**
    * Studio trafficked creative ID associated with rich media and VPAID
    * creatives. This is a read-only field. Applicable to the following
    * creative types: all RICH_MEDIA, and all VPAID.
    */
  var studioTraffickedCreativeId: js.UndefOr[String] = js.native
  /**
    * Subaccount ID of this creative. This field, if left unset, will be
    * auto-generated for both insert and update operations. Applicable to all
    * creative types.
    */
  var subaccountId: js.UndefOr[String] = js.native
  /**
    * Third-party URL used to record backup image impressions. Applicable to
    * the following creative types: all RICH_MEDIA.
    */
  var thirdPartyBackupImageImpressionsUrl: js.UndefOr[String] = js.native
  /**
    * Third-party URL used to record rich media impressions. Applicable to the
    * following creative types: all RICH_MEDIA.
    */
  var thirdPartyRichMediaImpressionsUrl: js.UndefOr[String] = js.native
  /**
    * Third-party URLs for tracking in-stream creative events. Applicable to
    * the following creative types: all INSTREAM_VIDEO, all INSTREAM_AUDIO, and
    * all VPAID.
    */
  var thirdPartyUrls: js.UndefOr[js.Array[SchemaThirdPartyTrackingUrl]] = js.native
  /**
    * List of timer events configured for the creative. For
    * DISPLAY_IMAGE_GALLERY creatives, these are read-only and auto-generated
    * from clickTags. Applicable to the following creative types:
    * DISPLAY_IMAGE_GALLERY, all RICH_MEDIA, and all VPAID. Applicable to
    * DISPLAY when the primary asset is not HTML_IMAGE.
    */
  var timerCustomEvents: js.UndefOr[js.Array[SchemaCreativeCustomEvent]] = js.native
  /**
    * Combined size of all creative assets. This is a read-only field.
    * Applicable to the following creative types: all RICH_MEDIA, and all
    * VPAID.
    */
  var totalFileSize: js.UndefOr[String] = js.native
  /**
    * Type of this creative. This is a required field. Applicable to all
    * creative types.  Note: FLASH_INPAGE, HTML5_BANNER, and IMAGE are only
    * used for existing creatives. New creatives should use DISPLAY as a
    * replacement for these types.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * A Universal Ad ID as per the VAST 4.0 spec. Applicable to the following
    * creative types: INSTREAM_AUDIO and INSTREAM_VIDEO and VPAID.
    */
  var universalAdId: js.UndefOr[SchemaUniversalAdId] = js.native
  /**
    * The version number helps you keep track of multiple versions of your
    * creative in your reports. The version number will always be
    * auto-generated during insert operations to start at 1. For tracking
    * creatives the version cannot be incremented and will always remain at 1.
    * For all other creative types the version can be incremented only by 1
    * during update operations. In addition, the version will be automatically
    * incremented by 1 when undergoing Rich Media creative merging. Applicable
    * to all creative types.
    */
  var version: js.UndefOr[Double] = js.native
}

object SchemaCreative {
  @scala.inline
  def apply(
    accountId: String = null,
    active: js.UndefOr[Boolean] = js.undefined,
    adParameters: String = null,
    adTagKeys: js.Array[String] = null,
    additionalSizes: js.Array[SchemaSize] = null,
    advertiserId: String = null,
    allowScriptAccess: js.UndefOr[Boolean] = js.undefined,
    archived: js.UndefOr[Boolean] = js.undefined,
    artworkType: String = null,
    authoringSource: String = null,
    authoringTool: String = null,
    autoAdvanceImages: js.UndefOr[Boolean] = js.undefined,
    backgroundColor: String = null,
    backupImageClickThroughUrl: SchemaCreativeClickThroughUrl = null,
    backupImageFeatures: js.Array[String] = null,
    backupImageReportingLabel: String = null,
    backupImageTargetWindow: SchemaTargetWindow = null,
    clickTags: js.Array[SchemaClickTag] = null,
    commercialId: String = null,
    companionCreatives: js.Array[String] = null,
    compatibility: js.Array[String] = null,
    convertFlashToHtml5: js.UndefOr[Boolean] = js.undefined,
    counterCustomEvents: js.Array[SchemaCreativeCustomEvent] = null,
    creativeAssetSelection: SchemaCreativeAssetSelection = null,
    creativeAssets: js.Array[SchemaCreativeAsset] = null,
    creativeFieldAssignments: js.Array[SchemaCreativeFieldAssignment] = null,
    customKeyValues: js.Array[String] = null,
    dynamicAssetSelection: js.UndefOr[Boolean] = js.undefined,
    exitCustomEvents: js.Array[SchemaCreativeCustomEvent] = null,
    fsCommand: SchemaFsCommand = null,
    htmlCode: String = null,
    htmlCodeLocked: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    idDimensionValue: SchemaDimensionValue = null,
    kind: String = null,
    lastModifiedInfo: SchemaLastModifiedInfo = null,
    latestTraffickedCreativeId: String = null,
    mediaDescription: String = null,
    mediaDuration: Int | Double = null,
    name: String = null,
    overrideCss: String = null,
    politeLoadAssetId: String = null,
    progressOffset: SchemaVideoOffset = null,
    redirectUrl: String = null,
    renderingId: String = null,
    renderingIdDimensionValue: SchemaDimensionValue = null,
    requiredFlashPluginVersion: String = null,
    requiredFlashVersion: Int | Double = null,
    size: SchemaSize = null,
    skipOffset: SchemaVideoOffset = null,
    skippable: js.UndefOr[Boolean] = js.undefined,
    sslCompliant: js.UndefOr[Boolean] = js.undefined,
    sslOverride: js.UndefOr[Boolean] = js.undefined,
    studioAdvertiserId: String = null,
    studioCreativeId: String = null,
    studioTraffickedCreativeId: String = null,
    subaccountId: String = null,
    thirdPartyBackupImageImpressionsUrl: String = null,
    thirdPartyRichMediaImpressionsUrl: String = null,
    thirdPartyUrls: js.Array[SchemaThirdPartyTrackingUrl] = null,
    timerCustomEvents: js.Array[SchemaCreativeCustomEvent] = null,
    totalFileSize: String = null,
    `type`: String = null,
    universalAdId: SchemaUniversalAdId = null,
    version: Int | Double = null
  ): SchemaCreative = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (adParameters != null) __obj.updateDynamic("adParameters")(adParameters.asInstanceOf[js.Any])
    if (adTagKeys != null) __obj.updateDynamic("adTagKeys")(adTagKeys.asInstanceOf[js.Any])
    if (additionalSizes != null) __obj.updateDynamic("additionalSizes")(additionalSizes.asInstanceOf[js.Any])
    if (advertiserId != null) __obj.updateDynamic("advertiserId")(advertiserId.asInstanceOf[js.Any])
    if (!js.isUndefined(allowScriptAccess)) __obj.updateDynamic("allowScriptAccess")(allowScriptAccess.asInstanceOf[js.Any])
    if (!js.isUndefined(archived)) __obj.updateDynamic("archived")(archived.asInstanceOf[js.Any])
    if (artworkType != null) __obj.updateDynamic("artworkType")(artworkType.asInstanceOf[js.Any])
    if (authoringSource != null) __obj.updateDynamic("authoringSource")(authoringSource.asInstanceOf[js.Any])
    if (authoringTool != null) __obj.updateDynamic("authoringTool")(authoringTool.asInstanceOf[js.Any])
    if (!js.isUndefined(autoAdvanceImages)) __obj.updateDynamic("autoAdvanceImages")(autoAdvanceImages.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (backupImageClickThroughUrl != null) __obj.updateDynamic("backupImageClickThroughUrl")(backupImageClickThroughUrl.asInstanceOf[js.Any])
    if (backupImageFeatures != null) __obj.updateDynamic("backupImageFeatures")(backupImageFeatures.asInstanceOf[js.Any])
    if (backupImageReportingLabel != null) __obj.updateDynamic("backupImageReportingLabel")(backupImageReportingLabel.asInstanceOf[js.Any])
    if (backupImageTargetWindow != null) __obj.updateDynamic("backupImageTargetWindow")(backupImageTargetWindow.asInstanceOf[js.Any])
    if (clickTags != null) __obj.updateDynamic("clickTags")(clickTags.asInstanceOf[js.Any])
    if (commercialId != null) __obj.updateDynamic("commercialId")(commercialId.asInstanceOf[js.Any])
    if (companionCreatives != null) __obj.updateDynamic("companionCreatives")(companionCreatives.asInstanceOf[js.Any])
    if (compatibility != null) __obj.updateDynamic("compatibility")(compatibility.asInstanceOf[js.Any])
    if (!js.isUndefined(convertFlashToHtml5)) __obj.updateDynamic("convertFlashToHtml5")(convertFlashToHtml5.asInstanceOf[js.Any])
    if (counterCustomEvents != null) __obj.updateDynamic("counterCustomEvents")(counterCustomEvents.asInstanceOf[js.Any])
    if (creativeAssetSelection != null) __obj.updateDynamic("creativeAssetSelection")(creativeAssetSelection.asInstanceOf[js.Any])
    if (creativeAssets != null) __obj.updateDynamic("creativeAssets")(creativeAssets.asInstanceOf[js.Any])
    if (creativeFieldAssignments != null) __obj.updateDynamic("creativeFieldAssignments")(creativeFieldAssignments.asInstanceOf[js.Any])
    if (customKeyValues != null) __obj.updateDynamic("customKeyValues")(customKeyValues.asInstanceOf[js.Any])
    if (!js.isUndefined(dynamicAssetSelection)) __obj.updateDynamic("dynamicAssetSelection")(dynamicAssetSelection.asInstanceOf[js.Any])
    if (exitCustomEvents != null) __obj.updateDynamic("exitCustomEvents")(exitCustomEvents.asInstanceOf[js.Any])
    if (fsCommand != null) __obj.updateDynamic("fsCommand")(fsCommand.asInstanceOf[js.Any])
    if (htmlCode != null) __obj.updateDynamic("htmlCode")(htmlCode.asInstanceOf[js.Any])
    if (!js.isUndefined(htmlCodeLocked)) __obj.updateDynamic("htmlCodeLocked")(htmlCodeLocked.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (idDimensionValue != null) __obj.updateDynamic("idDimensionValue")(idDimensionValue.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (lastModifiedInfo != null) __obj.updateDynamic("lastModifiedInfo")(lastModifiedInfo.asInstanceOf[js.Any])
    if (latestTraffickedCreativeId != null) __obj.updateDynamic("latestTraffickedCreativeId")(latestTraffickedCreativeId.asInstanceOf[js.Any])
    if (mediaDescription != null) __obj.updateDynamic("mediaDescription")(mediaDescription.asInstanceOf[js.Any])
    if (mediaDuration != null) __obj.updateDynamic("mediaDuration")(mediaDuration.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (overrideCss != null) __obj.updateDynamic("overrideCss")(overrideCss.asInstanceOf[js.Any])
    if (politeLoadAssetId != null) __obj.updateDynamic("politeLoadAssetId")(politeLoadAssetId.asInstanceOf[js.Any])
    if (progressOffset != null) __obj.updateDynamic("progressOffset")(progressOffset.asInstanceOf[js.Any])
    if (redirectUrl != null) __obj.updateDynamic("redirectUrl")(redirectUrl.asInstanceOf[js.Any])
    if (renderingId != null) __obj.updateDynamic("renderingId")(renderingId.asInstanceOf[js.Any])
    if (renderingIdDimensionValue != null) __obj.updateDynamic("renderingIdDimensionValue")(renderingIdDimensionValue.asInstanceOf[js.Any])
    if (requiredFlashPluginVersion != null) __obj.updateDynamic("requiredFlashPluginVersion")(requiredFlashPluginVersion.asInstanceOf[js.Any])
    if (requiredFlashVersion != null) __obj.updateDynamic("requiredFlashVersion")(requiredFlashVersion.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (skipOffset != null) __obj.updateDynamic("skipOffset")(skipOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(skippable)) __obj.updateDynamic("skippable")(skippable.asInstanceOf[js.Any])
    if (!js.isUndefined(sslCompliant)) __obj.updateDynamic("sslCompliant")(sslCompliant.asInstanceOf[js.Any])
    if (!js.isUndefined(sslOverride)) __obj.updateDynamic("sslOverride")(sslOverride.asInstanceOf[js.Any])
    if (studioAdvertiserId != null) __obj.updateDynamic("studioAdvertiserId")(studioAdvertiserId.asInstanceOf[js.Any])
    if (studioCreativeId != null) __obj.updateDynamic("studioCreativeId")(studioCreativeId.asInstanceOf[js.Any])
    if (studioTraffickedCreativeId != null) __obj.updateDynamic("studioTraffickedCreativeId")(studioTraffickedCreativeId.asInstanceOf[js.Any])
    if (subaccountId != null) __obj.updateDynamic("subaccountId")(subaccountId.asInstanceOf[js.Any])
    if (thirdPartyBackupImageImpressionsUrl != null) __obj.updateDynamic("thirdPartyBackupImageImpressionsUrl")(thirdPartyBackupImageImpressionsUrl.asInstanceOf[js.Any])
    if (thirdPartyRichMediaImpressionsUrl != null) __obj.updateDynamic("thirdPartyRichMediaImpressionsUrl")(thirdPartyRichMediaImpressionsUrl.asInstanceOf[js.Any])
    if (thirdPartyUrls != null) __obj.updateDynamic("thirdPartyUrls")(thirdPartyUrls.asInstanceOf[js.Any])
    if (timerCustomEvents != null) __obj.updateDynamic("timerCustomEvents")(timerCustomEvents.asInstanceOf[js.Any])
    if (totalFileSize != null) __obj.updateDynamic("totalFileSize")(totalFileSize.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (universalAdId != null) __obj.updateDynamic("universalAdId")(universalAdId.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCreative]
  }
}

