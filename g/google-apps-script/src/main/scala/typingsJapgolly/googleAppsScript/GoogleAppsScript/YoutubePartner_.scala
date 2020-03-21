package typingsJapgolly.googleAppsScript.GoogleAppsScript

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Collection.AssetLabelsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Collection.AssetMatchPolicyCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Collection.AssetRelationshipsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Collection.AssetSearchCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Collection.AssetSharesCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Collection.AssetsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Collection.CampaignsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Collection.ClaimHistoryCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Collection.ClaimSearchCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Collection.ClaimsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Collection.ContentOwnerAdvertisingOptionsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Collection.ContentOwnersCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Collection.LiveCuepointsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Collection.MetadataHistoryCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Collection.OrdersCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Collection.OwnershipCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Collection.OwnershipHistoryCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Collection.PackageCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Collection.PoliciesCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Collection.PublishersCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Collection.ReferenceConflictsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Collection.ReferencesCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Collection.SpreadsheetTemplateCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Collection.UploaderCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Collection.ValidatorCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Collection.VideoAdvertisingOptionsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Collection.WhitelistsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.AdBreak
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.AdSlot
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.AllowedAdvertisingOptions
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.Asset
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.AssetLabel
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.AssetMatchPolicy
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.AssetRelationship
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.Campaign
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.CampaignData
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.CampaignSource
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.CampaignTargetLink
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.Claim
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.ClaimMatchInfo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.ClaimMatchInfoLongestMatch
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.ClaimMatchInfoTotalMatch
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.ClaimOrigin
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.ClaimedVideoDefaults
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.Conditions
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.ConflictingOwnership
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.ContentOwnerAdvertisingOption
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.CuepointSettings
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.Date
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.DateRange
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.ExcludedInterval
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.IntervalCondition
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.LiveCuepoint
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.MatchSegment
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.Metadata
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.Order
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.Origination
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.OwnershipConflicts
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.Package
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.Policy
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.PolicyRule
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.PromotedContent
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.Rating
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.Reference
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.Requirements
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.RightsOwnership
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.Segment
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.ShowDetails
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.StateCompleted
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.StatusReport
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.TerritoryCondition
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.TerritoryConflicts
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.TerritoryOwners
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.ValidateAsyncRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.ValidateRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.ValidateStatusRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.VideoAdvertisingOption
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.Whitelist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YoutubePartner_ extends js.Object {
  var AssetLabels: js.UndefOr[AssetLabelsCollection] = js.undefined
  var AssetMatchPolicy: js.UndefOr[AssetMatchPolicyCollection] = js.undefined
  var AssetRelationships: js.UndefOr[AssetRelationshipsCollection] = js.undefined
  var AssetSearch: js.UndefOr[AssetSearchCollection] = js.undefined
  var AssetShares: js.UndefOr[AssetSharesCollection] = js.undefined
  var Assets: js.UndefOr[AssetsCollection] = js.undefined
  var Campaigns: js.UndefOr[CampaignsCollection] = js.undefined
  var ClaimHistory: js.UndefOr[ClaimHistoryCollection] = js.undefined
  var ClaimSearch: js.UndefOr[ClaimSearchCollection] = js.undefined
  var Claims: js.UndefOr[ClaimsCollection] = js.undefined
  var ContentOwnerAdvertisingOptions: js.UndefOr[ContentOwnerAdvertisingOptionsCollection] = js.undefined
  var ContentOwners: js.UndefOr[ContentOwnersCollection] = js.undefined
  var LiveCuepoints: js.UndefOr[LiveCuepointsCollection] = js.undefined
  var MetadataHistory: js.UndefOr[MetadataHistoryCollection] = js.undefined
  var Orders: js.UndefOr[OrdersCollection] = js.undefined
  var Ownership: js.UndefOr[OwnershipCollection] = js.undefined
  var OwnershipHistory: js.UndefOr[OwnershipHistoryCollection] = js.undefined
  var Package: js.UndefOr[PackageCollection] = js.undefined
  var Policies: js.UndefOr[PoliciesCollection] = js.undefined
  var Publishers: js.UndefOr[PublishersCollection] = js.undefined
  var ReferenceConflicts: js.UndefOr[ReferenceConflictsCollection] = js.undefined
  var References: js.UndefOr[ReferencesCollection] = js.undefined
  var SpreadsheetTemplate: js.UndefOr[SpreadsheetTemplateCollection] = js.undefined
  var Uploader: js.UndefOr[UploaderCollection] = js.undefined
  var Validator: js.UndefOr[ValidatorCollection] = js.undefined
  var VideoAdvertisingOptions: js.UndefOr[VideoAdvertisingOptionsCollection] = js.undefined
  var Whitelists: js.UndefOr[WhitelistsCollection] = js.undefined
  // Create a new instance of AdBreak
  def newAdBreak(): AdBreak
  // Create a new instance of AdSlot
  def newAdSlot(): AdSlot
  // Create a new instance of AllowedAdvertisingOptions
  def newAllowedAdvertisingOptions(): AllowedAdvertisingOptions
  // Create a new instance of Asset
  def newAsset(): Asset
  // Create a new instance of AssetLabel
  def newAssetLabel(): AssetLabel
  // Create a new instance of AssetMatchPolicy
  def newAssetMatchPolicy(): AssetMatchPolicy
  // Create a new instance of AssetRelationship
  def newAssetRelationship(): AssetRelationship
  // Create a new instance of Campaign
  def newCampaign(): Campaign
  // Create a new instance of CampaignData
  def newCampaignData(): CampaignData
  // Create a new instance of CampaignSource
  def newCampaignSource(): CampaignSource
  // Create a new instance of CampaignTargetLink
  def newCampaignTargetLink(): CampaignTargetLink
  // Create a new instance of Claim
  def newClaim(): Claim
  // Create a new instance of ClaimMatchInfo
  def newClaimMatchInfo(): ClaimMatchInfo
  // Create a new instance of ClaimMatchInfoLongestMatch
  def newClaimMatchInfoLongestMatch(): ClaimMatchInfoLongestMatch
  // Create a new instance of ClaimMatchInfoTotalMatch
  def newClaimMatchInfoTotalMatch(): ClaimMatchInfoTotalMatch
  // Create a new instance of ClaimOrigin
  def newClaimOrigin(): ClaimOrigin
  // Create a new instance of ClaimedVideoDefaults
  def newClaimedVideoDefaults(): ClaimedVideoDefaults
  // Create a new instance of Conditions
  def newConditions(): Conditions
  // Create a new instance of ConflictingOwnership
  def newConflictingOwnership(): ConflictingOwnership
  // Create a new instance of ContentOwnerAdvertisingOption
  def newContentOwnerAdvertisingOption(): ContentOwnerAdvertisingOption
  // Create a new instance of CuepointSettings
  def newCuepointSettings(): CuepointSettings
  // Create a new instance of Date
  def newDate(): Date
  // Create a new instance of DateRange
  def newDateRange(): DateRange
  // Create a new instance of ExcludedInterval
  def newExcludedInterval(): ExcludedInterval
  // Create a new instance of IntervalCondition
  def newIntervalCondition(): IntervalCondition
  // Create a new instance of LiveCuepoint
  def newLiveCuepoint(): LiveCuepoint
  // Create a new instance of MatchSegment
  def newMatchSegment(): MatchSegment
  // Create a new instance of Metadata
  def newMetadata(): Metadata
  // Create a new instance of Order
  def newOrder(): Order
  // Create a new instance of Origination
  def newOrigination(): Origination
  // Create a new instance of OwnershipConflicts
  def newOwnershipConflicts(): OwnershipConflicts
  // Create a new instance of Package
  def newPackage(): Package
  // Create a new instance of Policy
  def newPolicy(): Policy
  // Create a new instance of PolicyRule
  def newPolicyRule(): PolicyRule
  // Create a new instance of PromotedContent
  def newPromotedContent(): PromotedContent
  // Create a new instance of Rating
  def newRating(): Rating
  // Create a new instance of Reference
  def newReference(): Reference
  // Create a new instance of Requirements
  def newRequirements(): Requirements
  // Create a new instance of RightsOwnership
  def newRightsOwnership(): RightsOwnership
  // Create a new instance of Segment
  def newSegment(): Segment
  // Create a new instance of ShowDetails
  def newShowDetails(): ShowDetails
  // Create a new instance of StateCompleted
  def newStateCompleted(): StateCompleted
  // Create a new instance of StatusReport
  def newStatusReport(): StatusReport
  // Create a new instance of TerritoryCondition
  def newTerritoryCondition(): TerritoryCondition
  // Create a new instance of TerritoryConflicts
  def newTerritoryConflicts(): TerritoryConflicts
  // Create a new instance of TerritoryOwners
  def newTerritoryOwners(): TerritoryOwners
  // Create a new instance of ValidateAsyncRequest
  def newValidateAsyncRequest(): ValidateAsyncRequest
  // Create a new instance of ValidateRequest
  def newValidateRequest(): ValidateRequest
  // Create a new instance of ValidateStatusRequest
  def newValidateStatusRequest(): ValidateStatusRequest
  // Create a new instance of VideoAdvertisingOption
  def newVideoAdvertisingOption(): VideoAdvertisingOption
  // Create a new instance of Whitelist
  def newWhitelist(): Whitelist
}

object YoutubePartner_ {
  @scala.inline
  def apply(
    newAdBreak: CallbackTo[AdBreak],
    newAdSlot: CallbackTo[AdSlot],
    newAllowedAdvertisingOptions: CallbackTo[AllowedAdvertisingOptions],
    newAsset: CallbackTo[Asset],
    newAssetLabel: CallbackTo[AssetLabel],
    newAssetMatchPolicy: CallbackTo[AssetMatchPolicy],
    newAssetRelationship: CallbackTo[AssetRelationship],
    newCampaign: CallbackTo[Campaign],
    newCampaignData: CallbackTo[CampaignData],
    newCampaignSource: CallbackTo[CampaignSource],
    newCampaignTargetLink: CallbackTo[CampaignTargetLink],
    newClaim: CallbackTo[Claim],
    newClaimMatchInfo: CallbackTo[ClaimMatchInfo],
    newClaimMatchInfoLongestMatch: CallbackTo[ClaimMatchInfoLongestMatch],
    newClaimMatchInfoTotalMatch: CallbackTo[ClaimMatchInfoTotalMatch],
    newClaimOrigin: CallbackTo[ClaimOrigin],
    newClaimedVideoDefaults: CallbackTo[ClaimedVideoDefaults],
    newConditions: CallbackTo[Conditions],
    newConflictingOwnership: CallbackTo[ConflictingOwnership],
    newContentOwnerAdvertisingOption: CallbackTo[ContentOwnerAdvertisingOption],
    newCuepointSettings: CallbackTo[CuepointSettings],
    newDate: CallbackTo[Date],
    newDateRange: CallbackTo[DateRange],
    newExcludedInterval: CallbackTo[ExcludedInterval],
    newIntervalCondition: CallbackTo[IntervalCondition],
    newLiveCuepoint: CallbackTo[LiveCuepoint],
    newMatchSegment: CallbackTo[MatchSegment],
    newMetadata: CallbackTo[Metadata],
    newOrder: CallbackTo[Order],
    newOrigination: CallbackTo[Origination],
    newOwnershipConflicts: CallbackTo[OwnershipConflicts],
    newPackage: CallbackTo[Package],
    newPolicy: CallbackTo[Policy],
    newPolicyRule: CallbackTo[PolicyRule],
    newPromotedContent: CallbackTo[PromotedContent],
    newRating: CallbackTo[Rating],
    newReference: CallbackTo[Reference],
    newRequirements: CallbackTo[Requirements],
    newRightsOwnership: CallbackTo[RightsOwnership],
    newSegment: CallbackTo[Segment],
    newShowDetails: CallbackTo[ShowDetails],
    newStateCompleted: CallbackTo[StateCompleted],
    newStatusReport: CallbackTo[StatusReport],
    newTerritoryCondition: CallbackTo[TerritoryCondition],
    newTerritoryConflicts: CallbackTo[TerritoryConflicts],
    newTerritoryOwners: CallbackTo[TerritoryOwners],
    newValidateAsyncRequest: CallbackTo[ValidateAsyncRequest],
    newValidateRequest: CallbackTo[ValidateRequest],
    newValidateStatusRequest: CallbackTo[ValidateStatusRequest],
    newVideoAdvertisingOption: CallbackTo[VideoAdvertisingOption],
    newWhitelist: CallbackTo[Whitelist],
    AssetLabels: AssetLabelsCollection = null,
    AssetMatchPolicy: AssetMatchPolicyCollection = null,
    AssetRelationships: AssetRelationshipsCollection = null,
    AssetSearch: AssetSearchCollection = null,
    AssetShares: AssetSharesCollection = null,
    Assets: AssetsCollection = null,
    Campaigns: CampaignsCollection = null,
    ClaimHistory: ClaimHistoryCollection = null,
    ClaimSearch: ClaimSearchCollection = null,
    Claims: ClaimsCollection = null,
    ContentOwnerAdvertisingOptions: ContentOwnerAdvertisingOptionsCollection = null,
    ContentOwners: ContentOwnersCollection = null,
    LiveCuepoints: LiveCuepointsCollection = null,
    MetadataHistory: MetadataHistoryCollection = null,
    Orders: OrdersCollection = null,
    Ownership: OwnershipCollection = null,
    OwnershipHistory: OwnershipHistoryCollection = null,
    Package: PackageCollection = null,
    Policies: PoliciesCollection = null,
    Publishers: PublishersCollection = null,
    ReferenceConflicts: ReferenceConflictsCollection = null,
    References: ReferencesCollection = null,
    SpreadsheetTemplate: SpreadsheetTemplateCollection = null,
    Uploader: UploaderCollection = null,
    Validator: ValidatorCollection = null,
    VideoAdvertisingOptions: VideoAdvertisingOptionsCollection = null,
    Whitelists: WhitelistsCollection = null
  ): YoutubePartner_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("newAdBreak")(newAdBreak.toJsFn)
    __obj.updateDynamic("newAdSlot")(newAdSlot.toJsFn)
    __obj.updateDynamic("newAllowedAdvertisingOptions")(newAllowedAdvertisingOptions.toJsFn)
    __obj.updateDynamic("newAsset")(newAsset.toJsFn)
    __obj.updateDynamic("newAssetLabel")(newAssetLabel.toJsFn)
    __obj.updateDynamic("newAssetMatchPolicy")(newAssetMatchPolicy.toJsFn)
    __obj.updateDynamic("newAssetRelationship")(newAssetRelationship.toJsFn)
    __obj.updateDynamic("newCampaign")(newCampaign.toJsFn)
    __obj.updateDynamic("newCampaignData")(newCampaignData.toJsFn)
    __obj.updateDynamic("newCampaignSource")(newCampaignSource.toJsFn)
    __obj.updateDynamic("newCampaignTargetLink")(newCampaignTargetLink.toJsFn)
    __obj.updateDynamic("newClaim")(newClaim.toJsFn)
    __obj.updateDynamic("newClaimMatchInfo")(newClaimMatchInfo.toJsFn)
    __obj.updateDynamic("newClaimMatchInfoLongestMatch")(newClaimMatchInfoLongestMatch.toJsFn)
    __obj.updateDynamic("newClaimMatchInfoTotalMatch")(newClaimMatchInfoTotalMatch.toJsFn)
    __obj.updateDynamic("newClaimOrigin")(newClaimOrigin.toJsFn)
    __obj.updateDynamic("newClaimedVideoDefaults")(newClaimedVideoDefaults.toJsFn)
    __obj.updateDynamic("newConditions")(newConditions.toJsFn)
    __obj.updateDynamic("newConflictingOwnership")(newConflictingOwnership.toJsFn)
    __obj.updateDynamic("newContentOwnerAdvertisingOption")(newContentOwnerAdvertisingOption.toJsFn)
    __obj.updateDynamic("newCuepointSettings")(newCuepointSettings.toJsFn)
    __obj.updateDynamic("newDate")(newDate.toJsFn)
    __obj.updateDynamic("newDateRange")(newDateRange.toJsFn)
    __obj.updateDynamic("newExcludedInterval")(newExcludedInterval.toJsFn)
    __obj.updateDynamic("newIntervalCondition")(newIntervalCondition.toJsFn)
    __obj.updateDynamic("newLiveCuepoint")(newLiveCuepoint.toJsFn)
    __obj.updateDynamic("newMatchSegment")(newMatchSegment.toJsFn)
    __obj.updateDynamic("newMetadata")(newMetadata.toJsFn)
    __obj.updateDynamic("newOrder")(newOrder.toJsFn)
    __obj.updateDynamic("newOrigination")(newOrigination.toJsFn)
    __obj.updateDynamic("newOwnershipConflicts")(newOwnershipConflicts.toJsFn)
    __obj.updateDynamic("newPackage")(newPackage.toJsFn)
    __obj.updateDynamic("newPolicy")(newPolicy.toJsFn)
    __obj.updateDynamic("newPolicyRule")(newPolicyRule.toJsFn)
    __obj.updateDynamic("newPromotedContent")(newPromotedContent.toJsFn)
    __obj.updateDynamic("newRating")(newRating.toJsFn)
    __obj.updateDynamic("newReference")(newReference.toJsFn)
    __obj.updateDynamic("newRequirements")(newRequirements.toJsFn)
    __obj.updateDynamic("newRightsOwnership")(newRightsOwnership.toJsFn)
    __obj.updateDynamic("newSegment")(newSegment.toJsFn)
    __obj.updateDynamic("newShowDetails")(newShowDetails.toJsFn)
    __obj.updateDynamic("newStateCompleted")(newStateCompleted.toJsFn)
    __obj.updateDynamic("newStatusReport")(newStatusReport.toJsFn)
    __obj.updateDynamic("newTerritoryCondition")(newTerritoryCondition.toJsFn)
    __obj.updateDynamic("newTerritoryConflicts")(newTerritoryConflicts.toJsFn)
    __obj.updateDynamic("newTerritoryOwners")(newTerritoryOwners.toJsFn)
    __obj.updateDynamic("newValidateAsyncRequest")(newValidateAsyncRequest.toJsFn)
    __obj.updateDynamic("newValidateRequest")(newValidateRequest.toJsFn)
    __obj.updateDynamic("newValidateStatusRequest")(newValidateStatusRequest.toJsFn)
    __obj.updateDynamic("newVideoAdvertisingOption")(newVideoAdvertisingOption.toJsFn)
    __obj.updateDynamic("newWhitelist")(newWhitelist.toJsFn)
    if (AssetLabels != null) __obj.updateDynamic("AssetLabels")(AssetLabels.asInstanceOf[js.Any])
    if (AssetMatchPolicy != null) __obj.updateDynamic("AssetMatchPolicy")(AssetMatchPolicy.asInstanceOf[js.Any])
    if (AssetRelationships != null) __obj.updateDynamic("AssetRelationships")(AssetRelationships.asInstanceOf[js.Any])
    if (AssetSearch != null) __obj.updateDynamic("AssetSearch")(AssetSearch.asInstanceOf[js.Any])
    if (AssetShares != null) __obj.updateDynamic("AssetShares")(AssetShares.asInstanceOf[js.Any])
    if (Assets != null) __obj.updateDynamic("Assets")(Assets.asInstanceOf[js.Any])
    if (Campaigns != null) __obj.updateDynamic("Campaigns")(Campaigns.asInstanceOf[js.Any])
    if (ClaimHistory != null) __obj.updateDynamic("ClaimHistory")(ClaimHistory.asInstanceOf[js.Any])
    if (ClaimSearch != null) __obj.updateDynamic("ClaimSearch")(ClaimSearch.asInstanceOf[js.Any])
    if (Claims != null) __obj.updateDynamic("Claims")(Claims.asInstanceOf[js.Any])
    if (ContentOwnerAdvertisingOptions != null) __obj.updateDynamic("ContentOwnerAdvertisingOptions")(ContentOwnerAdvertisingOptions.asInstanceOf[js.Any])
    if (ContentOwners != null) __obj.updateDynamic("ContentOwners")(ContentOwners.asInstanceOf[js.Any])
    if (LiveCuepoints != null) __obj.updateDynamic("LiveCuepoints")(LiveCuepoints.asInstanceOf[js.Any])
    if (MetadataHistory != null) __obj.updateDynamic("MetadataHistory")(MetadataHistory.asInstanceOf[js.Any])
    if (Orders != null) __obj.updateDynamic("Orders")(Orders.asInstanceOf[js.Any])
    if (Ownership != null) __obj.updateDynamic("Ownership")(Ownership.asInstanceOf[js.Any])
    if (OwnershipHistory != null) __obj.updateDynamic("OwnershipHistory")(OwnershipHistory.asInstanceOf[js.Any])
    if (Package != null) __obj.updateDynamic("Package")(Package.asInstanceOf[js.Any])
    if (Policies != null) __obj.updateDynamic("Policies")(Policies.asInstanceOf[js.Any])
    if (Publishers != null) __obj.updateDynamic("Publishers")(Publishers.asInstanceOf[js.Any])
    if (ReferenceConflicts != null) __obj.updateDynamic("ReferenceConflicts")(ReferenceConflicts.asInstanceOf[js.Any])
    if (References != null) __obj.updateDynamic("References")(References.asInstanceOf[js.Any])
    if (SpreadsheetTemplate != null) __obj.updateDynamic("SpreadsheetTemplate")(SpreadsheetTemplate.asInstanceOf[js.Any])
    if (Uploader != null) __obj.updateDynamic("Uploader")(Uploader.asInstanceOf[js.Any])
    if (Validator != null) __obj.updateDynamic("Validator")(Validator.asInstanceOf[js.Any])
    if (VideoAdvertisingOptions != null) __obj.updateDynamic("VideoAdvertisingOptions")(VideoAdvertisingOptions.asInstanceOf[js.Any])
    if (Whitelists != null) __obj.updateDynamic("Whitelists")(Whitelists.asInstanceOf[js.Any])
    __obj.asInstanceOf[YoutubePartner_]
  }
}

