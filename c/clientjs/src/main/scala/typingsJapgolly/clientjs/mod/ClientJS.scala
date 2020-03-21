package typingsJapgolly.clientjs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientJS extends js.Object {
  /** @return A string containing the available resolution. */
  def getAvailableResolution(): String
  // Browser methods
  /** @return A string containing the browser name */
  def getBrowser(): String
  /** @return A string containing the major browser version. */
  def getBrowserMajorVersion(): String
  /** @return A string containing the browser version. */
  def getBrowserVersion(): String
  // CPU methods
  /** @return A string containing the CPU architecture. */
  def getCPU(): String
  /** @return A string containing canvas image information */
  def getCanvasPrint(): String
  /** @return A string containing the color depth. */
  def getColorDepth(): String
  /** @return A string containing the current resolution. */
  def getCurrentResolution(): String
  /**
    * @param datapoints Any number of datapoints that are (or can be coerced to
    *                   be) strings.
    * @return A 32-bit integer representing the cumulative fingerprint.
    */
  def getCustomFingerprint(datapoints: (String | Double)*): Double
  // Device methods
  /** @return A string containing the device. */
  def getDevice(): String
  /** @return A string containing the device type. */
  def getDeviceType(): String
  /** @return A string containing the device vendor. */
  def getDeviceVendor(): String
  /** @return A string containing the device horizontal DPI. */
  def getDeviceXDPI(): String
  /** @return A string containing the device vertical DPI. */
  def getDeviceYDPI(): String
  // Engine methods
  /** @return A string containing the browser engine. */
  def getEngine(): String
  /** @return A string containing the browser engine version. */
  def getEngineVersion(): String
  // Fingerprint methods
  /** @return A 32-bit integer representing the browser's fingerprint. */
  def getFingerprint(): Double
  /** @return A string containing the Flash Version. */
  def getFlashVersion(): String
  /** A string containing a comma-separated list of installed fonts. */
  def getFonts(): String
  /** @return A string containing the Java Version. */
  def getJavaVersion(): String
  // Language methods
  /** A lowercase string containing the user language. */
  def getLanguage(): String
  /** A string containing a list of installed MIME types. */
  def getMimeTypes(): String
  // OS methods
  /** @return A string containing the OS. */
  def getOS(): String
  /** @return A string containing the OS version. */
  def getOSVersion(): String
  // Plugin methods
  /** @return A string containing a list of installed plugins. */
  def getPlugins(): String
  // Screen methods
  /** @return A string containing screen information. */
  def getScreenPrint(): String
  /** @return A string containing the Silverlight Version. */
  def getSilverlightVersion(): String
  /** @return A string containing this software version number. */
  def getSoftwareVersion(): String
  /** A lowercase string containing the system language. */
  def getSystemLanguage(): String
  // Time methods
  /** A lowercase string containing the time zone. */
  def getTimeZone(): String
  // User agent methods
  /** @return A string containing unparsed user agent. */
  def getUserAgent(): String
  /** @return A lowercase string containing the user agent. */
  def getUserAgentLowerCase(): String
  // Canvas methods
  /** Check if the canvas element is available. */
  def isCanvas(): Boolean
  /** Check if the browser is Chrome. */
  def isChrome(): Boolean
  /** Check if cookies are avaliable. */
  def isCookie(): Boolean
  /** Check if the browser is Firefox. */
  def isFirefox(): Boolean
  /** Check if Flash is installed. */
  def isFlash(): Boolean
  // Font methods
  /** Check if `font` is installed. */
  def isFont(font: String): Boolean
  /** Check if the browser is IE. */
  def isIE(): Boolean
  /** Check if the browser is on an Apple iPad. */
  def isIpad(): Boolean
  /** Check if the browser is on an Apple iPhone. */
  def isIphone(): Boolean
  /** Check if the browser is on an Apple iPod. */
  def isIpod(): Boolean
  /** Check if Java is installed. */
  def isJava(): Boolean
  /** Check if the OS is Linux. */
  def isLinux(): Boolean
  // Storage methods
  /** Check if local storage is avaliable. */
  def isLocalStorage(): Boolean
  /** Check if the OS is Mac. */
  def isMac(): Boolean
  // MIME type methods
  /** Check if MIME types are installed. */
  def isMimeTypes(): Boolean
  // Mobile methods
  /** Check if the browser is on a mobile device. */
  def isMobile(): Boolean
  /** Check if the browser is on an Android mobile device. */
  def isMobileAndroid(): Boolean
  /** Check if the browser is on a Blackberry mobile device. */
  def isMobileBlackBerry(): Boolean
  // iOS methods
  /** Check if the browser is on an Apple iOS device. */
  def isMobileIOS(): Boolean
  /** Check if the browser is on a major mobile device. */
  def isMobileMajor(): Boolean
  /** Check if the browser is on an Opera mobile device. */
  def isMobileOpera(): Boolean
  /** Check if the browser is mobile Safari. */
  def isMobileSafari(): Boolean
  /** Check if the browser is on a Windows mobile device. */
  def isMobileWindows(): Boolean
  /** Check if the browser is Opera. */
  def isOpera(): Boolean
  /** Check if the browser is Safari. */
  def isSafari(): Boolean
  /** Check if session storage is avaliable. */
  def isSessionStorage(): Boolean
  /** Check if Silverlight is installed. */
  def isSilverlight(): Boolean
  /** Check if the OS is Solaris. */
  def isSolaris(): Boolean
  /** Check if the OS is Ubuntu. */
  def isUbuntu(): Boolean
  /** Check if the OS is Windows. */
  def isWindows(): Boolean
}

object ClientJS {
  @scala.inline
  def apply(
    getAvailableResolution: CallbackTo[String],
    getBrowser: CallbackTo[String],
    getBrowserMajorVersion: CallbackTo[String],
    getBrowserVersion: CallbackTo[String],
    getCPU: CallbackTo[String],
    getCanvasPrint: CallbackTo[String],
    getColorDepth: CallbackTo[String],
    getCurrentResolution: CallbackTo[String],
    getCustomFingerprint: /* repeated */ String | Double => CallbackTo[Double],
    getDevice: CallbackTo[String],
    getDeviceType: CallbackTo[String],
    getDeviceVendor: CallbackTo[String],
    getDeviceXDPI: CallbackTo[String],
    getDeviceYDPI: CallbackTo[String],
    getEngine: CallbackTo[String],
    getEngineVersion: CallbackTo[String],
    getFingerprint: CallbackTo[Double],
    getFlashVersion: CallbackTo[String],
    getFonts: CallbackTo[String],
    getJavaVersion: CallbackTo[String],
    getLanguage: CallbackTo[String],
    getMimeTypes: CallbackTo[String],
    getOS: CallbackTo[String],
    getOSVersion: CallbackTo[String],
    getPlugins: CallbackTo[String],
    getScreenPrint: CallbackTo[String],
    getSilverlightVersion: CallbackTo[String],
    getSoftwareVersion: CallbackTo[String],
    getSystemLanguage: CallbackTo[String],
    getTimeZone: CallbackTo[String],
    getUserAgent: CallbackTo[String],
    getUserAgentLowerCase: CallbackTo[String],
    isCanvas: CallbackTo[Boolean],
    isChrome: CallbackTo[Boolean],
    isCookie: CallbackTo[Boolean],
    isFirefox: CallbackTo[Boolean],
    isFlash: CallbackTo[Boolean],
    isFont: String => CallbackTo[Boolean],
    isIE: CallbackTo[Boolean],
    isIpad: CallbackTo[Boolean],
    isIphone: CallbackTo[Boolean],
    isIpod: CallbackTo[Boolean],
    isJava: CallbackTo[Boolean],
    isLinux: CallbackTo[Boolean],
    isLocalStorage: CallbackTo[Boolean],
    isMac: CallbackTo[Boolean],
    isMimeTypes: CallbackTo[Boolean],
    isMobile: CallbackTo[Boolean],
    isMobileAndroid: CallbackTo[Boolean],
    isMobileBlackBerry: CallbackTo[Boolean],
    isMobileIOS: CallbackTo[Boolean],
    isMobileMajor: CallbackTo[Boolean],
    isMobileOpera: CallbackTo[Boolean],
    isMobileSafari: CallbackTo[Boolean],
    isMobileWindows: CallbackTo[Boolean],
    isOpera: CallbackTo[Boolean],
    isSafari: CallbackTo[Boolean],
    isSessionStorage: CallbackTo[Boolean],
    isSilverlight: CallbackTo[Boolean],
    isSolaris: CallbackTo[Boolean],
    isUbuntu: CallbackTo[Boolean],
    isWindows: CallbackTo[Boolean]
  ): ClientJS = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAvailableResolution")(getAvailableResolution.toJsFn)
    __obj.updateDynamic("getBrowser")(getBrowser.toJsFn)
    __obj.updateDynamic("getBrowserMajorVersion")(getBrowserMajorVersion.toJsFn)
    __obj.updateDynamic("getBrowserVersion")(getBrowserVersion.toJsFn)
    __obj.updateDynamic("getCPU")(getCPU.toJsFn)
    __obj.updateDynamic("getCanvasPrint")(getCanvasPrint.toJsFn)
    __obj.updateDynamic("getColorDepth")(getColorDepth.toJsFn)
    __obj.updateDynamic("getCurrentResolution")(getCurrentResolution.toJsFn)
    __obj.updateDynamic("getCustomFingerprint")(js.Any.fromFunction1((t0: /* repeated */ java.lang.String | scala.Double) => getCustomFingerprint(t0).runNow()))
    __obj.updateDynamic("getDevice")(getDevice.toJsFn)
    __obj.updateDynamic("getDeviceType")(getDeviceType.toJsFn)
    __obj.updateDynamic("getDeviceVendor")(getDeviceVendor.toJsFn)
    __obj.updateDynamic("getDeviceXDPI")(getDeviceXDPI.toJsFn)
    __obj.updateDynamic("getDeviceYDPI")(getDeviceYDPI.toJsFn)
    __obj.updateDynamic("getEngine")(getEngine.toJsFn)
    __obj.updateDynamic("getEngineVersion")(getEngineVersion.toJsFn)
    __obj.updateDynamic("getFingerprint")(getFingerprint.toJsFn)
    __obj.updateDynamic("getFlashVersion")(getFlashVersion.toJsFn)
    __obj.updateDynamic("getFonts")(getFonts.toJsFn)
    __obj.updateDynamic("getJavaVersion")(getJavaVersion.toJsFn)
    __obj.updateDynamic("getLanguage")(getLanguage.toJsFn)
    __obj.updateDynamic("getMimeTypes")(getMimeTypes.toJsFn)
    __obj.updateDynamic("getOS")(getOS.toJsFn)
    __obj.updateDynamic("getOSVersion")(getOSVersion.toJsFn)
    __obj.updateDynamic("getPlugins")(getPlugins.toJsFn)
    __obj.updateDynamic("getScreenPrint")(getScreenPrint.toJsFn)
    __obj.updateDynamic("getSilverlightVersion")(getSilverlightVersion.toJsFn)
    __obj.updateDynamic("getSoftwareVersion")(getSoftwareVersion.toJsFn)
    __obj.updateDynamic("getSystemLanguage")(getSystemLanguage.toJsFn)
    __obj.updateDynamic("getTimeZone")(getTimeZone.toJsFn)
    __obj.updateDynamic("getUserAgent")(getUserAgent.toJsFn)
    __obj.updateDynamic("getUserAgentLowerCase")(getUserAgentLowerCase.toJsFn)
    __obj.updateDynamic("isCanvas")(isCanvas.toJsFn)
    __obj.updateDynamic("isChrome")(isChrome.toJsFn)
    __obj.updateDynamic("isCookie")(isCookie.toJsFn)
    __obj.updateDynamic("isFirefox")(isFirefox.toJsFn)
    __obj.updateDynamic("isFlash")(isFlash.toJsFn)
    __obj.updateDynamic("isFont")(js.Any.fromFunction1((t0: java.lang.String) => isFont(t0).runNow()))
    __obj.updateDynamic("isIE")(isIE.toJsFn)
    __obj.updateDynamic("isIpad")(isIpad.toJsFn)
    __obj.updateDynamic("isIphone")(isIphone.toJsFn)
    __obj.updateDynamic("isIpod")(isIpod.toJsFn)
    __obj.updateDynamic("isJava")(isJava.toJsFn)
    __obj.updateDynamic("isLinux")(isLinux.toJsFn)
    __obj.updateDynamic("isLocalStorage")(isLocalStorage.toJsFn)
    __obj.updateDynamic("isMac")(isMac.toJsFn)
    __obj.updateDynamic("isMimeTypes")(isMimeTypes.toJsFn)
    __obj.updateDynamic("isMobile")(isMobile.toJsFn)
    __obj.updateDynamic("isMobileAndroid")(isMobileAndroid.toJsFn)
    __obj.updateDynamic("isMobileBlackBerry")(isMobileBlackBerry.toJsFn)
    __obj.updateDynamic("isMobileIOS")(isMobileIOS.toJsFn)
    __obj.updateDynamic("isMobileMajor")(isMobileMajor.toJsFn)
    __obj.updateDynamic("isMobileOpera")(isMobileOpera.toJsFn)
    __obj.updateDynamic("isMobileSafari")(isMobileSafari.toJsFn)
    __obj.updateDynamic("isMobileWindows")(isMobileWindows.toJsFn)
    __obj.updateDynamic("isOpera")(isOpera.toJsFn)
    __obj.updateDynamic("isSafari")(isSafari.toJsFn)
    __obj.updateDynamic("isSessionStorage")(isSessionStorage.toJsFn)
    __obj.updateDynamic("isSilverlight")(isSilverlight.toJsFn)
    __obj.updateDynamic("isSolaris")(isSolaris.toJsFn)
    __obj.updateDynamic("isUbuntu")(isUbuntu.toJsFn)
    __obj.updateDynamic("isWindows")(isWindows.toJsFn)
    __obj.asInstanceOf[ClientJS]
  }
}

