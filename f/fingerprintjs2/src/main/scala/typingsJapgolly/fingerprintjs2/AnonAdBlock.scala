package typingsJapgolly.fingerprintjs2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAdBlock extends js.Object {
  var adBlock: js.UndefOr[Boolean] = js.undefined
  var addBehavior: js.UndefOr[Boolean] = js.undefined
  var audio: js.UndefOr[Boolean] = js.undefined
  var availableScreenResolution: js.UndefOr[Boolean] = js.undefined
  var canvas: js.UndefOr[Boolean] = js.undefined
  var colorDepth: js.UndefOr[Boolean] = js.undefined
  var cpuClass: js.UndefOr[Boolean] = js.undefined
  var deviceMemory: js.UndefOr[Boolean] = js.undefined
  /**
    * DNT depends on incognito mode for some browsers (Chrome) and it's impossible to detect incognito mode
    */
  var doNotTrack: js.UndefOr[Boolean] = js.undefined
  /**
    * Unreliable on Windows, see https://github.com/Valve/fingerprintjs2/issues/375
    */
  var enumerateDevices: js.UndefOr[Boolean] = js.undefined
  var fonts: js.UndefOr[Boolean] = js.undefined
  var fontsFlash: js.UndefOr[Boolean] = js.undefined
  var hardwareConcurrency: js.UndefOr[Boolean] = js.undefined
  var hasLiedBrowser: js.UndefOr[Boolean] = js.undefined
  var hasLiedLanguages: js.UndefOr[Boolean] = js.undefined
  var hasLiedOs: js.UndefOr[Boolean] = js.undefined
  var hasLiedResolution: js.UndefOr[Boolean] = js.undefined
  var indexedDb: js.UndefOr[Boolean] = js.undefined
  var language: js.UndefOr[Boolean] = js.undefined
  var localStorage: js.UndefOr[Boolean] = js.undefined
  var openDatabase: js.UndefOr[Boolean] = js.undefined
  /**
    * devicePixelRatio depends on browser zoom, and it's impossible to detect browser zoom
    */
  var pixelRatio: js.UndefOr[Boolean] = js.undefined
  var platform: js.UndefOr[Boolean] = js.undefined
  var plugins: js.UndefOr[Boolean] = js.undefined
  var screenResolution: js.UndefOr[Boolean] = js.undefined
  var sessionStorage: js.UndefOr[Boolean] = js.undefined
  var timezone: js.UndefOr[Boolean] = js.undefined
  var timezoneOffset: js.UndefOr[Boolean] = js.undefined
  var touchSupport: js.UndefOr[Boolean] = js.undefined
  var userAgent: js.UndefOr[Boolean] = js.undefined
  var webgl: js.UndefOr[Boolean] = js.undefined
  var webglVendorAndRenderer: js.UndefOr[Boolean] = js.undefined
}

object AnonAdBlock {
  @scala.inline
  def apply(
    adBlock: js.UndefOr[Boolean] = js.undefined,
    addBehavior: js.UndefOr[Boolean] = js.undefined,
    audio: js.UndefOr[Boolean] = js.undefined,
    availableScreenResolution: js.UndefOr[Boolean] = js.undefined,
    canvas: js.UndefOr[Boolean] = js.undefined,
    colorDepth: js.UndefOr[Boolean] = js.undefined,
    cpuClass: js.UndefOr[Boolean] = js.undefined,
    deviceMemory: js.UndefOr[Boolean] = js.undefined,
    doNotTrack: js.UndefOr[Boolean] = js.undefined,
    enumerateDevices: js.UndefOr[Boolean] = js.undefined,
    fonts: js.UndefOr[Boolean] = js.undefined,
    fontsFlash: js.UndefOr[Boolean] = js.undefined,
    hardwareConcurrency: js.UndefOr[Boolean] = js.undefined,
    hasLiedBrowser: js.UndefOr[Boolean] = js.undefined,
    hasLiedLanguages: js.UndefOr[Boolean] = js.undefined,
    hasLiedOs: js.UndefOr[Boolean] = js.undefined,
    hasLiedResolution: js.UndefOr[Boolean] = js.undefined,
    indexedDb: js.UndefOr[Boolean] = js.undefined,
    language: js.UndefOr[Boolean] = js.undefined,
    localStorage: js.UndefOr[Boolean] = js.undefined,
    openDatabase: js.UndefOr[Boolean] = js.undefined,
    pixelRatio: js.UndefOr[Boolean] = js.undefined,
    platform: js.UndefOr[Boolean] = js.undefined,
    plugins: js.UndefOr[Boolean] = js.undefined,
    screenResolution: js.UndefOr[Boolean] = js.undefined,
    sessionStorage: js.UndefOr[Boolean] = js.undefined,
    timezone: js.UndefOr[Boolean] = js.undefined,
    timezoneOffset: js.UndefOr[Boolean] = js.undefined,
    touchSupport: js.UndefOr[Boolean] = js.undefined,
    userAgent: js.UndefOr[Boolean] = js.undefined,
    webgl: js.UndefOr[Boolean] = js.undefined,
    webglVendorAndRenderer: js.UndefOr[Boolean] = js.undefined
  ): AnonAdBlock = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(adBlock)) __obj.updateDynamic("adBlock")(adBlock.asInstanceOf[js.Any])
    if (!js.isUndefined(addBehavior)) __obj.updateDynamic("addBehavior")(addBehavior.asInstanceOf[js.Any])
    if (!js.isUndefined(audio)) __obj.updateDynamic("audio")(audio.asInstanceOf[js.Any])
    if (!js.isUndefined(availableScreenResolution)) __obj.updateDynamic("availableScreenResolution")(availableScreenResolution.asInstanceOf[js.Any])
    if (!js.isUndefined(canvas)) __obj.updateDynamic("canvas")(canvas.asInstanceOf[js.Any])
    if (!js.isUndefined(colorDepth)) __obj.updateDynamic("colorDepth")(colorDepth.asInstanceOf[js.Any])
    if (!js.isUndefined(cpuClass)) __obj.updateDynamic("cpuClass")(cpuClass.asInstanceOf[js.Any])
    if (!js.isUndefined(deviceMemory)) __obj.updateDynamic("deviceMemory")(deviceMemory.asInstanceOf[js.Any])
    if (!js.isUndefined(doNotTrack)) __obj.updateDynamic("doNotTrack")(doNotTrack.asInstanceOf[js.Any])
    if (!js.isUndefined(enumerateDevices)) __obj.updateDynamic("enumerateDevices")(enumerateDevices.asInstanceOf[js.Any])
    if (!js.isUndefined(fonts)) __obj.updateDynamic("fonts")(fonts.asInstanceOf[js.Any])
    if (!js.isUndefined(fontsFlash)) __obj.updateDynamic("fontsFlash")(fontsFlash.asInstanceOf[js.Any])
    if (!js.isUndefined(hardwareConcurrency)) __obj.updateDynamic("hardwareConcurrency")(hardwareConcurrency.asInstanceOf[js.Any])
    if (!js.isUndefined(hasLiedBrowser)) __obj.updateDynamic("hasLiedBrowser")(hasLiedBrowser.asInstanceOf[js.Any])
    if (!js.isUndefined(hasLiedLanguages)) __obj.updateDynamic("hasLiedLanguages")(hasLiedLanguages.asInstanceOf[js.Any])
    if (!js.isUndefined(hasLiedOs)) __obj.updateDynamic("hasLiedOs")(hasLiedOs.asInstanceOf[js.Any])
    if (!js.isUndefined(hasLiedResolution)) __obj.updateDynamic("hasLiedResolution")(hasLiedResolution.asInstanceOf[js.Any])
    if (!js.isUndefined(indexedDb)) __obj.updateDynamic("indexedDb")(indexedDb.asInstanceOf[js.Any])
    if (!js.isUndefined(language)) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (!js.isUndefined(localStorage)) __obj.updateDynamic("localStorage")(localStorage.asInstanceOf[js.Any])
    if (!js.isUndefined(openDatabase)) __obj.updateDynamic("openDatabase")(openDatabase.asInstanceOf[js.Any])
    if (!js.isUndefined(pixelRatio)) __obj.updateDynamic("pixelRatio")(pixelRatio.asInstanceOf[js.Any])
    if (!js.isUndefined(platform)) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (!js.isUndefined(plugins)) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (!js.isUndefined(screenResolution)) __obj.updateDynamic("screenResolution")(screenResolution.asInstanceOf[js.Any])
    if (!js.isUndefined(sessionStorage)) __obj.updateDynamic("sessionStorage")(sessionStorage.asInstanceOf[js.Any])
    if (!js.isUndefined(timezone)) __obj.updateDynamic("timezone")(timezone.asInstanceOf[js.Any])
    if (!js.isUndefined(timezoneOffset)) __obj.updateDynamic("timezoneOffset")(timezoneOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(touchSupport)) __obj.updateDynamic("touchSupport")(touchSupport.asInstanceOf[js.Any])
    if (!js.isUndefined(userAgent)) __obj.updateDynamic("userAgent")(userAgent.asInstanceOf[js.Any])
    if (!js.isUndefined(webgl)) __obj.updateDynamic("webgl")(webgl.asInstanceOf[js.Any])
    if (!js.isUndefined(webglVendorAndRenderer)) __obj.updateDynamic("webglVendorAndRenderer")(webglVendorAndRenderer.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAdBlock]
  }
}

