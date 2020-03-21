package typingsJapgolly.googleAppsScript.GoogleAppsScript

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Collection.DataCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Collection.ManagementCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Collection.MetadataCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Collection.ProvisioningCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Collection.UserDeletionCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Schema.Account
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Schema.AccountChildLink
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Schema.AccountPermissions
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Schema.AccountRef
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Schema.AccountTicket
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Schema.AccountTreeRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Schema.AdWordsAccount
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Schema.AnalyticsDataimportDeleteUploadDataRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Schema.CustomDimension
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Schema.CustomDimensionParentLink
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Schema.CustomMetric
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Schema.CustomMetricParentLink
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Schema.EntityAdWordsLink
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Schema.EntityAdWordsLinkEntity
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Schema.EntityUserLink
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Schema.EntityUserLinkEntity
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Schema.EntityUserLinkPermissions
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Schema.Experiment
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Schema.ExperimentParentLink
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Schema.ExperimentVariations
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Schema.Filter
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Schema.FilterAdvancedDetails
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Schema.FilterExpression
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Schema.FilterLowercaseDetails
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Schema.FilterParentLink
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Schema.FilterRef
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Schema.FilterSearchAndReplaceDetails
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Schema.FilterUppercaseDetails
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Schema.Goal
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Schema.GoalEventDetails
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Schema.GoalEventDetailsEventConditions
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Schema.GoalParentLink
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Schema.GoalUrlDestinationDetails
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Schema.GoalUrlDestinationDetailsSteps
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Schema.GoalVisitNumPagesDetails
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Schema.GoalVisitTimeOnSiteDetails
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Schema.HashClientIdRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Schema.IncludeConditions
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Schema.LinkedForeignAccount
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Schema.Profile
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Schema.ProfileChildLink
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Schema.ProfileFilterLink
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Schema.ProfileParentLink
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Schema.ProfilePermissions
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Schema.ProfileRef
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Schema.RemarketingAudience
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Schema.RemarketingAudienceAudienceDefinition
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Schema.RemarketingAudienceStateBasedAudienceDefinition
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Schema.RemarketingAudienceStateBasedAudienceDefinitionExcludeConditions
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Schema.UnsampledReport
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Schema.UnsampledReportCloudStorageDownloadDetails
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Schema.UnsampledReportDriveDownloadDetails
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Schema.UserDeletionRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Schema.UserDeletionRequestId
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Schema.UserRef
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Schema.WebPropertyRef
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Schema.Webproperty
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Schema.WebpropertyChildLink
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Schema.WebpropertyParentLink
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Schema.WebpropertyPermissions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Analytics_ extends js.Object {
  var Data: js.UndefOr[DataCollection] = js.undefined
  var Management: js.UndefOr[ManagementCollection] = js.undefined
  var Metadata: js.UndefOr[MetadataCollection] = js.undefined
  var Provisioning: js.UndefOr[ProvisioningCollection] = js.undefined
  var UserDeletion: js.UndefOr[UserDeletionCollection] = js.undefined
  // Create a new instance of Account
  def newAccount(): Account
  // Create a new instance of AccountChildLink
  def newAccountChildLink(): AccountChildLink
  // Create a new instance of AccountPermissions
  def newAccountPermissions(): AccountPermissions
  // Create a new instance of AccountRef
  def newAccountRef(): AccountRef
  // Create a new instance of AccountTicket
  def newAccountTicket(): AccountTicket
  // Create a new instance of AccountTreeRequest
  def newAccountTreeRequest(): AccountTreeRequest
  // Create a new instance of AdWordsAccount
  def newAdWordsAccount(): AdWordsAccount
  // Create a new instance of AnalyticsDataimportDeleteUploadDataRequest
  def newAnalyticsDataimportDeleteUploadDataRequest(): AnalyticsDataimportDeleteUploadDataRequest
  // Create a new instance of CustomDimension
  def newCustomDimension(): CustomDimension
  // Create a new instance of CustomDimensionParentLink
  def newCustomDimensionParentLink(): CustomDimensionParentLink
  // Create a new instance of CustomMetric
  def newCustomMetric(): CustomMetric
  // Create a new instance of CustomMetricParentLink
  def newCustomMetricParentLink(): CustomMetricParentLink
  // Create a new instance of EntityAdWordsLink
  def newEntityAdWordsLink(): EntityAdWordsLink
  // Create a new instance of EntityAdWordsLinkEntity
  def newEntityAdWordsLinkEntity(): EntityAdWordsLinkEntity
  // Create a new instance of EntityUserLink
  def newEntityUserLink(): EntityUserLink
  // Create a new instance of EntityUserLinkEntity
  def newEntityUserLinkEntity(): EntityUserLinkEntity
  // Create a new instance of EntityUserLinkPermissions
  def newEntityUserLinkPermissions(): EntityUserLinkPermissions
  // Create a new instance of Experiment
  def newExperiment(): Experiment
  // Create a new instance of ExperimentParentLink
  def newExperimentParentLink(): ExperimentParentLink
  // Create a new instance of ExperimentVariations
  def newExperimentVariations(): ExperimentVariations
  // Create a new instance of Filter
  def newFilter(): Filter
  // Create a new instance of FilterAdvancedDetails
  def newFilterAdvancedDetails(): FilterAdvancedDetails
  // Create a new instance of FilterExpression
  def newFilterExpression(): FilterExpression
  // Create a new instance of FilterLowercaseDetails
  def newFilterLowercaseDetails(): FilterLowercaseDetails
  // Create a new instance of FilterParentLink
  def newFilterParentLink(): FilterParentLink
  // Create a new instance of FilterRef
  def newFilterRef(): FilterRef
  // Create a new instance of FilterSearchAndReplaceDetails
  def newFilterSearchAndReplaceDetails(): FilterSearchAndReplaceDetails
  // Create a new instance of FilterUppercaseDetails
  def newFilterUppercaseDetails(): FilterUppercaseDetails
  // Create a new instance of Goal
  def newGoal(): Goal
  // Create a new instance of GoalEventDetails
  def newGoalEventDetails(): GoalEventDetails
  // Create a new instance of GoalEventDetailsEventConditions
  def newGoalEventDetailsEventConditions(): GoalEventDetailsEventConditions
  // Create a new instance of GoalParentLink
  def newGoalParentLink(): GoalParentLink
  // Create a new instance of GoalUrlDestinationDetails
  def newGoalUrlDestinationDetails(): GoalUrlDestinationDetails
  // Create a new instance of GoalUrlDestinationDetailsSteps
  def newGoalUrlDestinationDetailsSteps(): GoalUrlDestinationDetailsSteps
  // Create a new instance of GoalVisitNumPagesDetails
  def newGoalVisitNumPagesDetails(): GoalVisitNumPagesDetails
  // Create a new instance of GoalVisitTimeOnSiteDetails
  def newGoalVisitTimeOnSiteDetails(): GoalVisitTimeOnSiteDetails
  // Create a new instance of HashClientIdRequest
  def newHashClientIdRequest(): HashClientIdRequest
  // Create a new instance of IncludeConditions
  def newIncludeConditions(): IncludeConditions
  // Create a new instance of LinkedForeignAccount
  def newLinkedForeignAccount(): LinkedForeignAccount
  // Create a new instance of Profile
  def newProfile(): Profile
  // Create a new instance of ProfileChildLink
  def newProfileChildLink(): ProfileChildLink
  // Create a new instance of ProfileFilterLink
  def newProfileFilterLink(): ProfileFilterLink
  // Create a new instance of ProfileParentLink
  def newProfileParentLink(): ProfileParentLink
  // Create a new instance of ProfilePermissions
  def newProfilePermissions(): ProfilePermissions
  // Create a new instance of ProfileRef
  def newProfileRef(): ProfileRef
  // Create a new instance of RemarketingAudience
  def newRemarketingAudience(): RemarketingAudience
  // Create a new instance of RemarketingAudienceAudienceDefinition
  def newRemarketingAudienceAudienceDefinition(): RemarketingAudienceAudienceDefinition
  // Create a new instance of RemarketingAudienceStateBasedAudienceDefinition
  def newRemarketingAudienceStateBasedAudienceDefinition(): RemarketingAudienceStateBasedAudienceDefinition
  // Create a new instance of RemarketingAudienceStateBasedAudienceDefinitionExcludeConditions
  def newRemarketingAudienceStateBasedAudienceDefinitionExcludeConditions(): RemarketingAudienceStateBasedAudienceDefinitionExcludeConditions
  // Create a new instance of UnsampledReport
  def newUnsampledReport(): UnsampledReport
  // Create a new instance of UnsampledReportCloudStorageDownloadDetails
  def newUnsampledReportCloudStorageDownloadDetails(): UnsampledReportCloudStorageDownloadDetails
  // Create a new instance of UnsampledReportDriveDownloadDetails
  def newUnsampledReportDriveDownloadDetails(): UnsampledReportDriveDownloadDetails
  // Create a new instance of UserDeletionRequest
  def newUserDeletionRequest(): UserDeletionRequest
  // Create a new instance of UserDeletionRequestId
  def newUserDeletionRequestId(): UserDeletionRequestId
  // Create a new instance of UserRef
  def newUserRef(): UserRef
  // Create a new instance of WebPropertyRef
  def newWebPropertyRef(): WebPropertyRef
  // Create a new instance of Webproperty
  def newWebproperty(): Webproperty
  // Create a new instance of WebpropertyChildLink
  def newWebpropertyChildLink(): WebpropertyChildLink
  // Create a new instance of WebpropertyParentLink
  def newWebpropertyParentLink(): WebpropertyParentLink
  // Create a new instance of WebpropertyPermissions
  def newWebpropertyPermissions(): WebpropertyPermissions
}

object Analytics_ {
  @scala.inline
  def apply(
    newAccount: CallbackTo[Account],
    newAccountChildLink: CallbackTo[AccountChildLink],
    newAccountPermissions: CallbackTo[AccountPermissions],
    newAccountRef: CallbackTo[AccountRef],
    newAccountTicket: CallbackTo[AccountTicket],
    newAccountTreeRequest: CallbackTo[AccountTreeRequest],
    newAdWordsAccount: CallbackTo[AdWordsAccount],
    newAnalyticsDataimportDeleteUploadDataRequest: CallbackTo[AnalyticsDataimportDeleteUploadDataRequest],
    newCustomDimension: CallbackTo[CustomDimension],
    newCustomDimensionParentLink: CallbackTo[CustomDimensionParentLink],
    newCustomMetric: CallbackTo[CustomMetric],
    newCustomMetricParentLink: CallbackTo[CustomMetricParentLink],
    newEntityAdWordsLink: CallbackTo[EntityAdWordsLink],
    newEntityAdWordsLinkEntity: CallbackTo[EntityAdWordsLinkEntity],
    newEntityUserLink: CallbackTo[EntityUserLink],
    newEntityUserLinkEntity: CallbackTo[EntityUserLinkEntity],
    newEntityUserLinkPermissions: CallbackTo[EntityUserLinkPermissions],
    newExperiment: CallbackTo[Experiment],
    newExperimentParentLink: CallbackTo[ExperimentParentLink],
    newExperimentVariations: CallbackTo[ExperimentVariations],
    newFilter: CallbackTo[Filter],
    newFilterAdvancedDetails: CallbackTo[FilterAdvancedDetails],
    newFilterExpression: CallbackTo[FilterExpression],
    newFilterLowercaseDetails: CallbackTo[FilterLowercaseDetails],
    newFilterParentLink: CallbackTo[FilterParentLink],
    newFilterRef: CallbackTo[FilterRef],
    newFilterSearchAndReplaceDetails: CallbackTo[FilterSearchAndReplaceDetails],
    newFilterUppercaseDetails: CallbackTo[FilterUppercaseDetails],
    newGoal: CallbackTo[Goal],
    newGoalEventDetails: CallbackTo[GoalEventDetails],
    newGoalEventDetailsEventConditions: CallbackTo[GoalEventDetailsEventConditions],
    newGoalParentLink: CallbackTo[GoalParentLink],
    newGoalUrlDestinationDetails: CallbackTo[GoalUrlDestinationDetails],
    newGoalUrlDestinationDetailsSteps: CallbackTo[GoalUrlDestinationDetailsSteps],
    newGoalVisitNumPagesDetails: CallbackTo[GoalVisitNumPagesDetails],
    newGoalVisitTimeOnSiteDetails: CallbackTo[GoalVisitTimeOnSiteDetails],
    newHashClientIdRequest: CallbackTo[HashClientIdRequest],
    newIncludeConditions: CallbackTo[IncludeConditions],
    newLinkedForeignAccount: CallbackTo[LinkedForeignAccount],
    newProfile: CallbackTo[Profile],
    newProfileChildLink: CallbackTo[ProfileChildLink],
    newProfileFilterLink: CallbackTo[ProfileFilterLink],
    newProfileParentLink: CallbackTo[ProfileParentLink],
    newProfilePermissions: CallbackTo[ProfilePermissions],
    newProfileRef: CallbackTo[ProfileRef],
    newRemarketingAudience: CallbackTo[RemarketingAudience],
    newRemarketingAudienceAudienceDefinition: CallbackTo[RemarketingAudienceAudienceDefinition],
    newRemarketingAudienceStateBasedAudienceDefinition: CallbackTo[RemarketingAudienceStateBasedAudienceDefinition],
    newRemarketingAudienceStateBasedAudienceDefinitionExcludeConditions: CallbackTo[RemarketingAudienceStateBasedAudienceDefinitionExcludeConditions],
    newUnsampledReport: CallbackTo[UnsampledReport],
    newUnsampledReportCloudStorageDownloadDetails: CallbackTo[UnsampledReportCloudStorageDownloadDetails],
    newUnsampledReportDriveDownloadDetails: CallbackTo[UnsampledReportDriveDownloadDetails],
    newUserDeletionRequest: CallbackTo[UserDeletionRequest],
    newUserDeletionRequestId: CallbackTo[UserDeletionRequestId],
    newUserRef: CallbackTo[UserRef],
    newWebPropertyRef: CallbackTo[WebPropertyRef],
    newWebproperty: CallbackTo[Webproperty],
    newWebpropertyChildLink: CallbackTo[WebpropertyChildLink],
    newWebpropertyParentLink: CallbackTo[WebpropertyParentLink],
    newWebpropertyPermissions: CallbackTo[WebpropertyPermissions],
    Data: DataCollection = null,
    Management: ManagementCollection = null,
    Metadata: MetadataCollection = null,
    Provisioning: ProvisioningCollection = null,
    UserDeletion: UserDeletionCollection = null
  ): Analytics_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("newAccount")(newAccount.toJsFn)
    __obj.updateDynamic("newAccountChildLink")(newAccountChildLink.toJsFn)
    __obj.updateDynamic("newAccountPermissions")(newAccountPermissions.toJsFn)
    __obj.updateDynamic("newAccountRef")(newAccountRef.toJsFn)
    __obj.updateDynamic("newAccountTicket")(newAccountTicket.toJsFn)
    __obj.updateDynamic("newAccountTreeRequest")(newAccountTreeRequest.toJsFn)
    __obj.updateDynamic("newAdWordsAccount")(newAdWordsAccount.toJsFn)
    __obj.updateDynamic("newAnalyticsDataimportDeleteUploadDataRequest")(newAnalyticsDataimportDeleteUploadDataRequest.toJsFn)
    __obj.updateDynamic("newCustomDimension")(newCustomDimension.toJsFn)
    __obj.updateDynamic("newCustomDimensionParentLink")(newCustomDimensionParentLink.toJsFn)
    __obj.updateDynamic("newCustomMetric")(newCustomMetric.toJsFn)
    __obj.updateDynamic("newCustomMetricParentLink")(newCustomMetricParentLink.toJsFn)
    __obj.updateDynamic("newEntityAdWordsLink")(newEntityAdWordsLink.toJsFn)
    __obj.updateDynamic("newEntityAdWordsLinkEntity")(newEntityAdWordsLinkEntity.toJsFn)
    __obj.updateDynamic("newEntityUserLink")(newEntityUserLink.toJsFn)
    __obj.updateDynamic("newEntityUserLinkEntity")(newEntityUserLinkEntity.toJsFn)
    __obj.updateDynamic("newEntityUserLinkPermissions")(newEntityUserLinkPermissions.toJsFn)
    __obj.updateDynamic("newExperiment")(newExperiment.toJsFn)
    __obj.updateDynamic("newExperimentParentLink")(newExperimentParentLink.toJsFn)
    __obj.updateDynamic("newExperimentVariations")(newExperimentVariations.toJsFn)
    __obj.updateDynamic("newFilter")(newFilter.toJsFn)
    __obj.updateDynamic("newFilterAdvancedDetails")(newFilterAdvancedDetails.toJsFn)
    __obj.updateDynamic("newFilterExpression")(newFilterExpression.toJsFn)
    __obj.updateDynamic("newFilterLowercaseDetails")(newFilterLowercaseDetails.toJsFn)
    __obj.updateDynamic("newFilterParentLink")(newFilterParentLink.toJsFn)
    __obj.updateDynamic("newFilterRef")(newFilterRef.toJsFn)
    __obj.updateDynamic("newFilterSearchAndReplaceDetails")(newFilterSearchAndReplaceDetails.toJsFn)
    __obj.updateDynamic("newFilterUppercaseDetails")(newFilterUppercaseDetails.toJsFn)
    __obj.updateDynamic("newGoal")(newGoal.toJsFn)
    __obj.updateDynamic("newGoalEventDetails")(newGoalEventDetails.toJsFn)
    __obj.updateDynamic("newGoalEventDetailsEventConditions")(newGoalEventDetailsEventConditions.toJsFn)
    __obj.updateDynamic("newGoalParentLink")(newGoalParentLink.toJsFn)
    __obj.updateDynamic("newGoalUrlDestinationDetails")(newGoalUrlDestinationDetails.toJsFn)
    __obj.updateDynamic("newGoalUrlDestinationDetailsSteps")(newGoalUrlDestinationDetailsSteps.toJsFn)
    __obj.updateDynamic("newGoalVisitNumPagesDetails")(newGoalVisitNumPagesDetails.toJsFn)
    __obj.updateDynamic("newGoalVisitTimeOnSiteDetails")(newGoalVisitTimeOnSiteDetails.toJsFn)
    __obj.updateDynamic("newHashClientIdRequest")(newHashClientIdRequest.toJsFn)
    __obj.updateDynamic("newIncludeConditions")(newIncludeConditions.toJsFn)
    __obj.updateDynamic("newLinkedForeignAccount")(newLinkedForeignAccount.toJsFn)
    __obj.updateDynamic("newProfile")(newProfile.toJsFn)
    __obj.updateDynamic("newProfileChildLink")(newProfileChildLink.toJsFn)
    __obj.updateDynamic("newProfileFilterLink")(newProfileFilterLink.toJsFn)
    __obj.updateDynamic("newProfileParentLink")(newProfileParentLink.toJsFn)
    __obj.updateDynamic("newProfilePermissions")(newProfilePermissions.toJsFn)
    __obj.updateDynamic("newProfileRef")(newProfileRef.toJsFn)
    __obj.updateDynamic("newRemarketingAudience")(newRemarketingAudience.toJsFn)
    __obj.updateDynamic("newRemarketingAudienceAudienceDefinition")(newRemarketingAudienceAudienceDefinition.toJsFn)
    __obj.updateDynamic("newRemarketingAudienceStateBasedAudienceDefinition")(newRemarketingAudienceStateBasedAudienceDefinition.toJsFn)
    __obj.updateDynamic("newRemarketingAudienceStateBasedAudienceDefinitionExcludeConditions")(newRemarketingAudienceStateBasedAudienceDefinitionExcludeConditions.toJsFn)
    __obj.updateDynamic("newUnsampledReport")(newUnsampledReport.toJsFn)
    __obj.updateDynamic("newUnsampledReportCloudStorageDownloadDetails")(newUnsampledReportCloudStorageDownloadDetails.toJsFn)
    __obj.updateDynamic("newUnsampledReportDriveDownloadDetails")(newUnsampledReportDriveDownloadDetails.toJsFn)
    __obj.updateDynamic("newUserDeletionRequest")(newUserDeletionRequest.toJsFn)
    __obj.updateDynamic("newUserDeletionRequestId")(newUserDeletionRequestId.toJsFn)
    __obj.updateDynamic("newUserRef")(newUserRef.toJsFn)
    __obj.updateDynamic("newWebPropertyRef")(newWebPropertyRef.toJsFn)
    __obj.updateDynamic("newWebproperty")(newWebproperty.toJsFn)
    __obj.updateDynamic("newWebpropertyChildLink")(newWebpropertyChildLink.toJsFn)
    __obj.updateDynamic("newWebpropertyParentLink")(newWebpropertyParentLink.toJsFn)
    __obj.updateDynamic("newWebpropertyPermissions")(newWebpropertyPermissions.toJsFn)
    if (Data != null) __obj.updateDynamic("Data")(Data.asInstanceOf[js.Any])
    if (Management != null) __obj.updateDynamic("Management")(Management.asInstanceOf[js.Any])
    if (Metadata != null) __obj.updateDynamic("Metadata")(Metadata.asInstanceOf[js.Any])
    if (Provisioning != null) __obj.updateDynamic("Provisioning")(Provisioning.asInstanceOf[js.Any])
    if (UserDeletion != null) __obj.updateDynamic("UserDeletion")(UserDeletion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Analytics_]
  }
}

