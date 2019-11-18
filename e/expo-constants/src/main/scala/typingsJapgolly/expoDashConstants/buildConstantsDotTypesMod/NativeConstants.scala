package typingsJapgolly.expoDashConstants.buildConstantsDotTypesMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.expoDashConstants.expoDashConstantsStrings.ExponentConstants
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NativeConstants
  extends /* key */ StringDictionary[js.Any] {
  var appOwnership: AppOwnership
  var debugMode: Boolean
  var deviceName: js.UndefOr[String] = js.undefined
  var deviceYearClass: Double | Null
  var experienceUrl: String
  var expoRuntimeVersion: String
  var expoVersion: String
  var installationId: String
  var intentUri: js.UndefOr[String] = js.undefined
  var isDetached: js.UndefOr[Boolean] = js.undefined
  var isDevice: Boolean
  var isHeadless: Boolean
  var linkingUri: String
  var manifest: AppManifest
  var name: ExponentConstants
  var nativeAppVersion: String | Null
  var nativeBuildVersion: String | Null
  var platform: js.UndefOr[PlatformManifest] = js.undefined
  var sessionId: String
  var statusBarHeight: Double
  var systemFonts: js.Array[String]
  var systemVersion: js.UndefOr[Double] = js.undefined
  def getWebViewUserAgentAsync(): js.Promise[String | Null]
}

object NativeConstants {
  @scala.inline
  def apply(
    appOwnership: AppOwnership,
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
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    deviceName: String = null,
    deviceYearClass: Int | Double = null,
    intentUri: String = null,
    isDetached: js.UndefOr[Boolean] = js.undefined,
    nativeAppVersion: String = null,
    nativeBuildVersion: String = null,
    platform: PlatformManifest = null,
    systemVersion: Int | Double = null
  ): NativeConstants = {
    val __obj = js.Dynamic.literal(appOwnership = appOwnership.asInstanceOf[js.Any], debugMode = debugMode.asInstanceOf[js.Any], experienceUrl = experienceUrl.asInstanceOf[js.Any], expoRuntimeVersion = expoRuntimeVersion.asInstanceOf[js.Any], expoVersion = expoVersion.asInstanceOf[js.Any], installationId = installationId.asInstanceOf[js.Any], isDevice = isDevice.asInstanceOf[js.Any], isHeadless = isHeadless.asInstanceOf[js.Any], linkingUri = linkingUri.asInstanceOf[js.Any], manifest = manifest.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any], statusBarHeight = statusBarHeight.asInstanceOf[js.Any], systemFonts = systemFonts.asInstanceOf[js.Any])
    __obj.updateDynamic("getWebViewUserAgentAsync")(getWebViewUserAgentAsync.toJsFn)
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (deviceName != null) __obj.updateDynamic("deviceName")(deviceName.asInstanceOf[js.Any])
    if (deviceYearClass != null) __obj.updateDynamic("deviceYearClass")(deviceYearClass.asInstanceOf[js.Any])
    if (intentUri != null) __obj.updateDynamic("intentUri")(intentUri.asInstanceOf[js.Any])
    if (!js.isUndefined(isDetached)) __obj.updateDynamic("isDetached")(isDetached.asInstanceOf[js.Any])
    if (nativeAppVersion != null) __obj.updateDynamic("nativeAppVersion")(nativeAppVersion.asInstanceOf[js.Any])
    if (nativeBuildVersion != null) __obj.updateDynamic("nativeBuildVersion")(nativeBuildVersion.asInstanceOf[js.Any])
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (systemVersion != null) __obj.updateDynamic("systemVersion")(systemVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeConstants]
  }
}

