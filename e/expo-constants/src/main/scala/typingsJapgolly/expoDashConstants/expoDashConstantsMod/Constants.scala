package typingsJapgolly.expoDashConstants.expoDashConstantsMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.expoDashConstants.buildConstantsDotTypesMod.AppManifest
import typingsJapgolly.expoDashConstants.buildConstantsDotTypesMod.NativeConstants
import typingsJapgolly.expoDashConstants.buildConstantsDotTypesMod.PlatformManifest
import typingsJapgolly.expoDashConstants.expoDashConstantsStrings.ExponentConstants
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Constants extends NativeConstants {
  var deviceId: js.UndefOr[String] = js.undefined
  var linkingUrl: js.UndefOr[String] = js.undefined
}

object Constants {
  @scala.inline
  def apply(
    appOwnership: typingsJapgolly.expoDashConstants.buildConstantsDotTypesMod.AppOwnership,
    debugMode: Boolean,
    experienceUrl: String,
    expoRuntimeVersion: String,
    expoVersion: String,
    getWebViewUserAgentAsync: CallbackTo[js.Promise[String | Null]],
    installationId: String,
    isDevice: Boolean,
    isHeadless: Boolean,
    linkingUri: String,
    manifest: AppManifest,
    name: ExponentConstants,
    sessionId: String,
    statusBarHeight: Double,
    systemFonts: js.Array[String],
    deviceId: String = null,
    deviceName: String = null,
    deviceYearClass: Int | Double = null,
    intentUri: String = null,
    isDetached: js.UndefOr[Boolean] = js.undefined,
    linkingUrl: String = null,
    nativeAppVersion: String = null,
    nativeBuildVersion: String = null,
    platform: PlatformManifest = null,
    systemVersion: Int | Double = null
  ): Constants = {
    val __obj = js.Dynamic.literal(appOwnership = appOwnership.asInstanceOf[js.Any], debugMode = debugMode.asInstanceOf[js.Any], experienceUrl = experienceUrl.asInstanceOf[js.Any], expoRuntimeVersion = expoRuntimeVersion.asInstanceOf[js.Any], expoVersion = expoVersion.asInstanceOf[js.Any], installationId = installationId.asInstanceOf[js.Any], isDevice = isDevice.asInstanceOf[js.Any], isHeadless = isHeadless.asInstanceOf[js.Any], linkingUri = linkingUri.asInstanceOf[js.Any], manifest = manifest.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any], statusBarHeight = statusBarHeight.asInstanceOf[js.Any], systemFonts = systemFonts.asInstanceOf[js.Any])
    __obj.updateDynamic("getWebViewUserAgentAsync")(getWebViewUserAgentAsync.toJsFn)
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId.asInstanceOf[js.Any])
    if (deviceName != null) __obj.updateDynamic("deviceName")(deviceName.asInstanceOf[js.Any])
    if (deviceYearClass != null) __obj.updateDynamic("deviceYearClass")(deviceYearClass.asInstanceOf[js.Any])
    if (intentUri != null) __obj.updateDynamic("intentUri")(intentUri.asInstanceOf[js.Any])
    if (!js.isUndefined(isDetached)) __obj.updateDynamic("isDetached")(isDetached.asInstanceOf[js.Any])
    if (linkingUrl != null) __obj.updateDynamic("linkingUrl")(linkingUrl.asInstanceOf[js.Any])
    if (nativeAppVersion != null) __obj.updateDynamic("nativeAppVersion")(nativeAppVersion.asInstanceOf[js.Any])
    if (nativeBuildVersion != null) __obj.updateDynamic("nativeBuildVersion")(nativeBuildVersion.asInstanceOf[js.Any])
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (systemVersion != null) __obj.updateDynamic("systemVersion")(systemVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Constants]
  }
}

