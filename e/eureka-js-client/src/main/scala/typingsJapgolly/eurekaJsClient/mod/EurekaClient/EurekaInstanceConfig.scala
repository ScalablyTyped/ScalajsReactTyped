package typingsJapgolly.eurekaJsClient.mod.EurekaClient

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EurekaInstanceConfig extends js.Object {
  var actionType: js.UndefOr[ActionType] = js.undefined
  var app: String
  var appGroupName: js.UndefOr[String] = js.undefined
  var countryId: js.UndefOr[Double] = js.undefined
  var dataCenterInfo: DataCenterInfo
  var healthCheckUrl: js.UndefOr[String] = js.undefined
  var homePageUrl: js.UndefOr[String] = js.undefined
  var hostName: String
  var instanceId: js.UndefOr[String] = js.undefined
  var ipAddr: String
  var isCoordinatingDiscoveryServer: js.UndefOr[Boolean] = js.undefined
  var lastDirtyTimestamp: js.UndefOr[Double] = js.undefined
  var lastUpdatedTimestamp: js.UndefOr[Double] = js.undefined
  var leaseInfo: js.UndefOr[LeaseInfo] = js.undefined
  var metadata: js.UndefOr[StringDictionary[String]] = js.undefined
  var overriddenstatus: js.UndefOr[InstanceStatus] = js.undefined
  var port: js.UndefOr[Double | PortWrapper | LegacyPortWrapper] = js.undefined
  var secureHealthCheckUrl: js.UndefOr[String] = js.undefined
  var securePort: js.UndefOr[Double | PortWrapper | LegacyPortWrapper] = js.undefined
  var secureVipAddress: js.UndefOr[String] = js.undefined
  var sid: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[InstanceStatus] = js.undefined
  var statusPageUrl: js.UndefOr[String] = js.undefined
  var vipAddress: String
}

object EurekaInstanceConfig {
  @scala.inline
  def apply(
    app: String,
    dataCenterInfo: DataCenterInfo,
    hostName: String,
    ipAddr: String,
    vipAddress: String,
    actionType: ActionType = null,
    appGroupName: String = null,
    countryId: Int | Double = null,
    healthCheckUrl: String = null,
    homePageUrl: String = null,
    instanceId: String = null,
    isCoordinatingDiscoveryServer: js.UndefOr[Boolean] = js.undefined,
    lastDirtyTimestamp: Int | Double = null,
    lastUpdatedTimestamp: Int | Double = null,
    leaseInfo: LeaseInfo = null,
    metadata: StringDictionary[String] = null,
    overriddenstatus: InstanceStatus = null,
    port: Double | PortWrapper | LegacyPortWrapper = null,
    secureHealthCheckUrl: String = null,
    securePort: Double | PortWrapper | LegacyPortWrapper = null,
    secureVipAddress: String = null,
    sid: String = null,
    status: InstanceStatus = null,
    statusPageUrl: String = null
  ): EurekaInstanceConfig = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], dataCenterInfo = dataCenterInfo.asInstanceOf[js.Any], hostName = hostName.asInstanceOf[js.Any], ipAddr = ipAddr.asInstanceOf[js.Any], vipAddress = vipAddress.asInstanceOf[js.Any])
    if (actionType != null) __obj.updateDynamic("actionType")(actionType.asInstanceOf[js.Any])
    if (appGroupName != null) __obj.updateDynamic("appGroupName")(appGroupName.asInstanceOf[js.Any])
    if (countryId != null) __obj.updateDynamic("countryId")(countryId.asInstanceOf[js.Any])
    if (healthCheckUrl != null) __obj.updateDynamic("healthCheckUrl")(healthCheckUrl.asInstanceOf[js.Any])
    if (homePageUrl != null) __obj.updateDynamic("homePageUrl")(homePageUrl.asInstanceOf[js.Any])
    if (instanceId != null) __obj.updateDynamic("instanceId")(instanceId.asInstanceOf[js.Any])
    if (!js.isUndefined(isCoordinatingDiscoveryServer)) __obj.updateDynamic("isCoordinatingDiscoveryServer")(isCoordinatingDiscoveryServer.asInstanceOf[js.Any])
    if (lastDirtyTimestamp != null) __obj.updateDynamic("lastDirtyTimestamp")(lastDirtyTimestamp.asInstanceOf[js.Any])
    if (lastUpdatedTimestamp != null) __obj.updateDynamic("lastUpdatedTimestamp")(lastUpdatedTimestamp.asInstanceOf[js.Any])
    if (leaseInfo != null) __obj.updateDynamic("leaseInfo")(leaseInfo.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (overriddenstatus != null) __obj.updateDynamic("overriddenstatus")(overriddenstatus.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (secureHealthCheckUrl != null) __obj.updateDynamic("secureHealthCheckUrl")(secureHealthCheckUrl.asInstanceOf[js.Any])
    if (securePort != null) __obj.updateDynamic("securePort")(securePort.asInstanceOf[js.Any])
    if (secureVipAddress != null) __obj.updateDynamic("secureVipAddress")(secureVipAddress.asInstanceOf[js.Any])
    if (sid != null) __obj.updateDynamic("sid")(sid.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusPageUrl != null) __obj.updateDynamic("statusPageUrl")(statusPageUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[EurekaInstanceConfig]
  }
}

