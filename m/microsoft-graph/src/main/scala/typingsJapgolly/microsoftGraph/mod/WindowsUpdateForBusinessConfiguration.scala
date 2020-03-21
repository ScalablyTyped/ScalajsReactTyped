package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowsUpdateForBusinessConfiguration extends DeviceConfiguration {
  /**
    * Automatic update mode. Possible values are: userDefined, notifyDownload, autoInstallAtMaintenanceTime,
    * autoInstallAndRebootAtMaintenanceTime, autoInstallAndRebootAtScheduledTime, autoInstallAndRebootWithoutEndUserControl.
    */
  var automaticUpdateMode: js.UndefOr[AutomaticUpdateMode] = js.undefined
  /**
    * Determines which branch devices will receive their updates from. Possible values are: userDefined, all,
    * businessReadyOnly, windowsInsiderBuildFast, windowsInsiderBuildSlow, windowsInsiderBuildRelease.
    */
  var businessReadyUpdatesOnly: js.UndefOr[WindowsUpdateType] = js.undefined
  /**
    * Delivery Optimization Mode. Possible values are: userDefined, httpOnly, httpWithPeeringNat,
    * httpWithPeeringPrivateGroup, httpWithInternetPeering, simpleDownload, bypassMode.
    */
  var deliveryOptimizationMode: js.UndefOr[WindowsDeliveryOptimizationMode] = js.undefined
  // Exclude Windows update Drivers
  var driversExcluded: js.UndefOr[Boolean] = js.undefined
  // Defer Feature Updates by these many days
  var featureUpdatesDeferralPeriodInDays: js.UndefOr[Double] = js.undefined
  // Feature Updates Pause Expiry datetime
  var featureUpdatesPauseExpiryDateTime: js.UndefOr[String] = js.undefined
  // Pause Feature Updates
  var featureUpdatesPaused: js.UndefOr[Boolean] = js.undefined
  // Installation schedule
  var installationSchedule: js.UndefOr[WindowsUpdateInstallScheduleType] = js.undefined
  // Allow Microsoft Update Service
  var microsoftUpdateServiceAllowed: js.UndefOr[Boolean] = js.undefined
  // The pre-release features. Possible values are: userDefined, settingsOnly, settingsAndExperimentations, notAllowed.
  var prereleaseFeatures: js.UndefOr[PrereleaseFeatures] = js.undefined
  // Defer Quality Updates by these many days
  var qualityUpdatesDeferralPeriodInDays: js.UndefOr[Double] = js.undefined
  // Quality Updates Pause Expiry datetime
  var qualityUpdatesPauseExpiryDateTime: js.UndefOr[String] = js.undefined
  // Pause Quality Updates
  var qualityUpdatesPaused: js.UndefOr[Boolean] = js.undefined
}

object WindowsUpdateForBusinessConfiguration {
  @scala.inline
  def apply(
    assignments: js.Array[DeviceConfigurationAssignment] = null,
    automaticUpdateMode: AutomaticUpdateMode = null,
    businessReadyUpdatesOnly: WindowsUpdateType = null,
    createdDateTime: String = null,
    deliveryOptimizationMode: WindowsDeliveryOptimizationMode = null,
    description: String = null,
    deviceSettingStateSummaries: js.Array[SettingStateDeviceSummary] = null,
    deviceStatusOverview: DeviceConfigurationDeviceOverview = null,
    deviceStatuses: js.Array[DeviceConfigurationDeviceStatus] = null,
    displayName: String = null,
    driversExcluded: js.UndefOr[Boolean] = js.undefined,
    featureUpdatesDeferralPeriodInDays: Int | Double = null,
    featureUpdatesPauseExpiryDateTime: String = null,
    featureUpdatesPaused: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    installationSchedule: WindowsUpdateInstallScheduleType = null,
    lastModifiedDateTime: String = null,
    microsoftUpdateServiceAllowed: js.UndefOr[Boolean] = js.undefined,
    prereleaseFeatures: PrereleaseFeatures = null,
    qualityUpdatesDeferralPeriodInDays: Int | Double = null,
    qualityUpdatesPauseExpiryDateTime: String = null,
    qualityUpdatesPaused: js.UndefOr[Boolean] = js.undefined,
    userStatusOverview: DeviceConfigurationUserOverview = null,
    userStatuses: js.Array[DeviceConfigurationUserStatus] = null,
    version: Int | Double = null
  ): WindowsUpdateForBusinessConfiguration = {
    val __obj = js.Dynamic.literal()
    if (assignments != null) __obj.updateDynamic("assignments")(assignments.asInstanceOf[js.Any])
    if (automaticUpdateMode != null) __obj.updateDynamic("automaticUpdateMode")(automaticUpdateMode.asInstanceOf[js.Any])
    if (businessReadyUpdatesOnly != null) __obj.updateDynamic("businessReadyUpdatesOnly")(businessReadyUpdatesOnly.asInstanceOf[js.Any])
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime.asInstanceOf[js.Any])
    if (deliveryOptimizationMode != null) __obj.updateDynamic("deliveryOptimizationMode")(deliveryOptimizationMode.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (deviceSettingStateSummaries != null) __obj.updateDynamic("deviceSettingStateSummaries")(deviceSettingStateSummaries.asInstanceOf[js.Any])
    if (deviceStatusOverview != null) __obj.updateDynamic("deviceStatusOverview")(deviceStatusOverview.asInstanceOf[js.Any])
    if (deviceStatuses != null) __obj.updateDynamic("deviceStatuses")(deviceStatuses.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (!js.isUndefined(driversExcluded)) __obj.updateDynamic("driversExcluded")(driversExcluded.asInstanceOf[js.Any])
    if (featureUpdatesDeferralPeriodInDays != null) __obj.updateDynamic("featureUpdatesDeferralPeriodInDays")(featureUpdatesDeferralPeriodInDays.asInstanceOf[js.Any])
    if (featureUpdatesPauseExpiryDateTime != null) __obj.updateDynamic("featureUpdatesPauseExpiryDateTime")(featureUpdatesPauseExpiryDateTime.asInstanceOf[js.Any])
    if (!js.isUndefined(featureUpdatesPaused)) __obj.updateDynamic("featureUpdatesPaused")(featureUpdatesPaused.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (installationSchedule != null) __obj.updateDynamic("installationSchedule")(installationSchedule.asInstanceOf[js.Any])
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime.asInstanceOf[js.Any])
    if (!js.isUndefined(microsoftUpdateServiceAllowed)) __obj.updateDynamic("microsoftUpdateServiceAllowed")(microsoftUpdateServiceAllowed.asInstanceOf[js.Any])
    if (prereleaseFeatures != null) __obj.updateDynamic("prereleaseFeatures")(prereleaseFeatures.asInstanceOf[js.Any])
    if (qualityUpdatesDeferralPeriodInDays != null) __obj.updateDynamic("qualityUpdatesDeferralPeriodInDays")(qualityUpdatesDeferralPeriodInDays.asInstanceOf[js.Any])
    if (qualityUpdatesPauseExpiryDateTime != null) __obj.updateDynamic("qualityUpdatesPauseExpiryDateTime")(qualityUpdatesPauseExpiryDateTime.asInstanceOf[js.Any])
    if (!js.isUndefined(qualityUpdatesPaused)) __obj.updateDynamic("qualityUpdatesPaused")(qualityUpdatesPaused.asInstanceOf[js.Any])
    if (userStatusOverview != null) __obj.updateDynamic("userStatusOverview")(userStatusOverview.asInstanceOf[js.Any])
    if (userStatuses != null) __obj.updateDynamic("userStatuses")(userStatuses.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowsUpdateForBusinessConfiguration]
  }
}

