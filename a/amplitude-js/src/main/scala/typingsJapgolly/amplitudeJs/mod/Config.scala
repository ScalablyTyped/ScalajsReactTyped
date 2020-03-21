package typingsJapgolly.amplitudeJs.mod

import typingsJapgolly.amplitudeJs.AnonCarrier
import typingsJapgolly.amplitudeJs.amplitudeJsStrings.DISABLE
import typingsJapgolly.amplitudeJs.amplitudeJsStrings.ERROR
import typingsJapgolly.amplitudeJs.amplitudeJsStrings.INFO
import typingsJapgolly.amplitudeJs.amplitudeJsStrings.WARN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var apiEndpoint: js.UndefOr[String] = js.undefined
  var batchEvents: js.UndefOr[Boolean] = js.undefined
  var cookieExpiration: js.UndefOr[Double] = js.undefined
  var cookieName: js.UndefOr[String] = js.undefined
  var deviceId: js.UndefOr[String] = js.undefined
  var deviceIdFromUrlParam: js.UndefOr[Boolean] = js.undefined
  var domain: js.UndefOr[String] = js.undefined
  var eventUploadPeriodMillis: js.UndefOr[Double] = js.undefined
  var eventUploadThreshold: js.UndefOr[Double] = js.undefined
  var forceHttps: js.UndefOr[Boolean] = js.undefined
  var includeGclid: js.UndefOr[Boolean] = js.undefined
  var includeReferrer: js.UndefOr[Boolean] = js.undefined
  var includeUtm: js.UndefOr[Boolean] = js.undefined
  var language: js.UndefOr[String] = js.undefined
  var logLevel: js.UndefOr[DISABLE | ERROR | WARN | INFO] = js.undefined
  var onError: js.UndefOr[js.Function0[Unit]] = js.undefined
  var optOut: js.UndefOr[Boolean] = js.undefined
  var platform: js.UndefOr[String] = js.undefined
  var saveEvents: js.UndefOr[Boolean] = js.undefined
  var saveParamsReferrerOncePerSession: js.UndefOr[Boolean] = js.undefined
  var savedMaxCount: js.UndefOr[Double] = js.undefined
  var secureCookie: js.UndefOr[Boolean] = js.undefined
  var sessionTimeout: js.UndefOr[Double] = js.undefined
  var trackingOptions: js.UndefOr[AnonCarrier] = js.undefined
  var unsentIdentifyKey: js.UndefOr[String] = js.undefined
  var unsentKey: js.UndefOr[String] = js.undefined
  var unsetParamsReferrerOnNewSession: js.UndefOr[Boolean] = js.undefined
  var uploadBatchSize: js.UndefOr[Double] = js.undefined
  var useNativeDeviceInfo: js.UndefOr[Boolean] = js.undefined
  var userId: js.UndefOr[String] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    apiEndpoint: String = null,
    batchEvents: js.UndefOr[Boolean] = js.undefined,
    cookieExpiration: Int | Double = null,
    cookieName: String = null,
    deviceId: String = null,
    deviceIdFromUrlParam: js.UndefOr[Boolean] = js.undefined,
    domain: String = null,
    eventUploadPeriodMillis: Int | Double = null,
    eventUploadThreshold: Int | Double = null,
    forceHttps: js.UndefOr[Boolean] = js.undefined,
    includeGclid: js.UndefOr[Boolean] = js.undefined,
    includeReferrer: js.UndefOr[Boolean] = js.undefined,
    includeUtm: js.UndefOr[Boolean] = js.undefined,
    language: String = null,
    logLevel: DISABLE | ERROR | WARN | INFO = null,
    onError: js.UndefOr[japgolly.scalajs.react.Callback] = js.undefined,
    optOut: js.UndefOr[Boolean] = js.undefined,
    platform: String = null,
    saveEvents: js.UndefOr[Boolean] = js.undefined,
    saveParamsReferrerOncePerSession: js.UndefOr[Boolean] = js.undefined,
    savedMaxCount: Int | Double = null,
    secureCookie: js.UndefOr[Boolean] = js.undefined,
    sessionTimeout: Int | Double = null,
    trackingOptions: AnonCarrier = null,
    unsentIdentifyKey: String = null,
    unsentKey: String = null,
    unsetParamsReferrerOnNewSession: js.UndefOr[Boolean] = js.undefined,
    uploadBatchSize: Int | Double = null,
    useNativeDeviceInfo: js.UndefOr[Boolean] = js.undefined,
    userId: String = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (apiEndpoint != null) __obj.updateDynamic("apiEndpoint")(apiEndpoint.asInstanceOf[js.Any])
    if (!js.isUndefined(batchEvents)) __obj.updateDynamic("batchEvents")(batchEvents.asInstanceOf[js.Any])
    if (cookieExpiration != null) __obj.updateDynamic("cookieExpiration")(cookieExpiration.asInstanceOf[js.Any])
    if (cookieName != null) __obj.updateDynamic("cookieName")(cookieName.asInstanceOf[js.Any])
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId.asInstanceOf[js.Any])
    if (!js.isUndefined(deviceIdFromUrlParam)) __obj.updateDynamic("deviceIdFromUrlParam")(deviceIdFromUrlParam.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (eventUploadPeriodMillis != null) __obj.updateDynamic("eventUploadPeriodMillis")(eventUploadPeriodMillis.asInstanceOf[js.Any])
    if (eventUploadThreshold != null) __obj.updateDynamic("eventUploadThreshold")(eventUploadThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(forceHttps)) __obj.updateDynamic("forceHttps")(forceHttps.asInstanceOf[js.Any])
    if (!js.isUndefined(includeGclid)) __obj.updateDynamic("includeGclid")(includeGclid.asInstanceOf[js.Any])
    if (!js.isUndefined(includeReferrer)) __obj.updateDynamic("includeReferrer")(includeReferrer.asInstanceOf[js.Any])
    if (!js.isUndefined(includeUtm)) __obj.updateDynamic("includeUtm")(includeUtm.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    onError.foreach(p => __obj.updateDynamic("onError")(p.toJsFn))
    if (!js.isUndefined(optOut)) __obj.updateDynamic("optOut")(optOut.asInstanceOf[js.Any])
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (!js.isUndefined(saveEvents)) __obj.updateDynamic("saveEvents")(saveEvents.asInstanceOf[js.Any])
    if (!js.isUndefined(saveParamsReferrerOncePerSession)) __obj.updateDynamic("saveParamsReferrerOncePerSession")(saveParamsReferrerOncePerSession.asInstanceOf[js.Any])
    if (savedMaxCount != null) __obj.updateDynamic("savedMaxCount")(savedMaxCount.asInstanceOf[js.Any])
    if (!js.isUndefined(secureCookie)) __obj.updateDynamic("secureCookie")(secureCookie.asInstanceOf[js.Any])
    if (sessionTimeout != null) __obj.updateDynamic("sessionTimeout")(sessionTimeout.asInstanceOf[js.Any])
    if (trackingOptions != null) __obj.updateDynamic("trackingOptions")(trackingOptions.asInstanceOf[js.Any])
    if (unsentIdentifyKey != null) __obj.updateDynamic("unsentIdentifyKey")(unsentIdentifyKey.asInstanceOf[js.Any])
    if (unsentKey != null) __obj.updateDynamic("unsentKey")(unsentKey.asInstanceOf[js.Any])
    if (!js.isUndefined(unsetParamsReferrerOnNewSession)) __obj.updateDynamic("unsetParamsReferrerOnNewSession")(unsetParamsReferrerOnNewSession.asInstanceOf[js.Any])
    if (uploadBatchSize != null) __obj.updateDynamic("uploadBatchSize")(uploadBatchSize.asInstanceOf[js.Any])
    if (!js.isUndefined(useNativeDeviceInfo)) __obj.updateDynamic("useNativeDeviceInfo")(useNativeDeviceInfo.asInstanceOf[js.Any])
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

