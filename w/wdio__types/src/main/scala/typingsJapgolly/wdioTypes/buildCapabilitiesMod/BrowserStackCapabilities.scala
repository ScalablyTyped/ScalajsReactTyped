package typingsJapgolly.wdioTypes.buildCapabilitiesMod

import typingsJapgolly.wdioTypes.anon.AllowAllCookies
import typingsJapgolly.wdioTypes.anon.Arch
import typingsJapgolly.wdioTypes.anon.Driver
import typingsJapgolly.wdioTypes.anon.EnablePopups
import typingsJapgolly.wdioTypes.wdioTypesInts.`0`
import typingsJapgolly.wdioTypes.wdioTypesInts.`1`
import typingsJapgolly.wdioTypes.wdioTypesStrings.disable
import typingsJapgolly.wdioTypes.wdioTypesStrings.errors
import typingsJapgolly.wdioTypes.wdioTypesStrings.info_
import typingsJapgolly.wdioTypes.wdioTypesStrings.landscape
import typingsJapgolly.wdioTypes.wdioTypesStrings.portrait
import typingsJapgolly.wdioTypes.wdioTypesStrings.verbose
import typingsJapgolly.wdioTypes.wdioTypesStrings.warnings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrowserStackCapabilities extends StObject {
  
  var acceptSslCerts: js.UndefOr[Boolean] = js.undefined
  
  var accessKey: js.UndefOr[String] = js.undefined
  
  var appiumLogs: js.UndefOr[Boolean] = js.undefined
  
  var appiumVersion: js.UndefOr[String] = js.undefined
  
  var autoWait: js.UndefOr[Double] = js.undefined
  
  var bfcache: js.UndefOr[`0` | `1`] = js.undefined
  
  var browser: js.UndefOr[String] = js.undefined
  
  var browserName: js.UndefOr[String] = js.undefined
  
  var browserVersion: js.UndefOr[String] = js.undefined
  
  var browser_version: js.UndefOr[String] = js.undefined
  
  @JSName("browserstack.maskCommands")
  var browserstackDotmaskCommands: js.UndefOr[js.Array[String]] = js.undefined
  
  @JSName("browserstack.sendKeys")
  var browserstackDotsendKeys: js.UndefOr[Boolean] = js.undefined
  
  var buildName: js.UndefOr[String] = js.undefined
  
  var chrome: js.UndefOr[Driver] = js.undefined
  
  var consoleLogs: js.UndefOr[disable | errors | warnings | info_ | verbose] = js.undefined
  
  var customNetwork: js.UndefOr[String] = js.undefined
  
  var debug: js.UndefOr[Boolean] = js.undefined
  
  var desired: js.UndefOr[DesiredCapabilities] = js.undefined
  
  var device: js.UndefOr[String] = js.undefined
  
  var deviceName: js.UndefOr[String] = js.undefined
  
  var deviceOrientation: js.UndefOr[portrait | landscape] = js.undefined
  
  var edge: js.UndefOr[EnablePopups] = js.undefined
  
  var firefox: js.UndefOr[Driver] = js.undefined
  
  var geoLocation: js.UndefOr[String] = js.undefined
  
  var hosts: js.UndefOr[String] = js.undefined
  
  var idleTimeout: js.UndefOr[Double] = js.undefined
  
  var ie: js.UndefOr[Arch] = js.undefined
  
  var local: js.UndefOr[Boolean] = js.undefined
  
  var localIdentifier: js.UndefOr[String] = js.undefined
  
  var maskBasicAuth: js.UndefOr[Boolean] = js.undefined
  
  var networkLogs: js.UndefOr[Boolean] = js.undefined
  
  var networkProfile: js.UndefOr[String] = js.undefined
  
  var os: js.UndefOr[String] = js.undefined
  
  var osVersion: js.UndefOr[String] = js.undefined
  
  var os_version: js.UndefOr[String] = js.undefined
  
  var projectName: js.UndefOr[String] = js.undefined
  
  var realMobile: js.UndefOr[Boolean] = js.undefined
  
  var resolution: js.UndefOr[String] = js.undefined
  
  var safari: js.UndefOr[AllowAllCookies] = js.undefined
  
  var seleniumLogs: js.UndefOr[Boolean] = js.undefined
  
  var seleniumVersion: js.UndefOr[String] = js.undefined
  
  var sessionName: js.UndefOr[String] = js.undefined
  
  var timezone: js.UndefOr[String] = js.undefined
  
  var userName: js.UndefOr[String] = js.undefined
  
  var video: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @private
    */
  var wdioService: js.UndefOr[String] = js.undefined
  
  var wsLocalSupport: js.UndefOr[Boolean] = js.undefined
}
object BrowserStackCapabilities {
  
  inline def apply(): BrowserStackCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrowserStackCapabilities]
  }
  
  extension [Self <: BrowserStackCapabilities](x: Self) {
    
    inline def setAcceptSslCerts(value: Boolean): Self = StObject.set(x, "acceptSslCerts", value.asInstanceOf[js.Any])
    
    inline def setAcceptSslCertsUndefined: Self = StObject.set(x, "acceptSslCerts", js.undefined)
    
    inline def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
    
    inline def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
    
    inline def setAppiumLogs(value: Boolean): Self = StObject.set(x, "appiumLogs", value.asInstanceOf[js.Any])
    
    inline def setAppiumLogsUndefined: Self = StObject.set(x, "appiumLogs", js.undefined)
    
    inline def setAppiumVersion(value: String): Self = StObject.set(x, "appiumVersion", value.asInstanceOf[js.Any])
    
    inline def setAppiumVersionUndefined: Self = StObject.set(x, "appiumVersion", js.undefined)
    
    inline def setAutoWait(value: Double): Self = StObject.set(x, "autoWait", value.asInstanceOf[js.Any])
    
    inline def setAutoWaitUndefined: Self = StObject.set(x, "autoWait", js.undefined)
    
    inline def setBfcache(value: `0` | `1`): Self = StObject.set(x, "bfcache", value.asInstanceOf[js.Any])
    
    inline def setBfcacheUndefined: Self = StObject.set(x, "bfcache", js.undefined)
    
    inline def setBrowser(value: String): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
    
    inline def setBrowserName(value: String): Self = StObject.set(x, "browserName", value.asInstanceOf[js.Any])
    
    inline def setBrowserNameUndefined: Self = StObject.set(x, "browserName", js.undefined)
    
    inline def setBrowserUndefined: Self = StObject.set(x, "browser", js.undefined)
    
    inline def setBrowserVersion(value: String): Self = StObject.set(x, "browserVersion", value.asInstanceOf[js.Any])
    
    inline def setBrowserVersionUndefined: Self = StObject.set(x, "browserVersion", js.undefined)
    
    inline def setBrowser_version(value: String): Self = StObject.set(x, "browser_version", value.asInstanceOf[js.Any])
    
    inline def setBrowser_versionUndefined: Self = StObject.set(x, "browser_version", js.undefined)
    
    inline def setBrowserstackDotmaskCommands(value: js.Array[String]): Self = StObject.set(x, "browserstack.maskCommands", value.asInstanceOf[js.Any])
    
    inline def setBrowserstackDotmaskCommandsUndefined: Self = StObject.set(x, "browserstack.maskCommands", js.undefined)
    
    inline def setBrowserstackDotmaskCommandsVarargs(value: String*): Self = StObject.set(x, "browserstack.maskCommands", js.Array(value*))
    
    inline def setBrowserstackDotsendKeys(value: Boolean): Self = StObject.set(x, "browserstack.sendKeys", value.asInstanceOf[js.Any])
    
    inline def setBrowserstackDotsendKeysUndefined: Self = StObject.set(x, "browserstack.sendKeys", js.undefined)
    
    inline def setBuildName(value: String): Self = StObject.set(x, "buildName", value.asInstanceOf[js.Any])
    
    inline def setBuildNameUndefined: Self = StObject.set(x, "buildName", js.undefined)
    
    inline def setChrome(value: Driver): Self = StObject.set(x, "chrome", value.asInstanceOf[js.Any])
    
    inline def setChromeUndefined: Self = StObject.set(x, "chrome", js.undefined)
    
    inline def setConsoleLogs(value: disable | errors | warnings | info_ | verbose): Self = StObject.set(x, "consoleLogs", value.asInstanceOf[js.Any])
    
    inline def setConsoleLogsUndefined: Self = StObject.set(x, "consoleLogs", js.undefined)
    
    inline def setCustomNetwork(value: String): Self = StObject.set(x, "customNetwork", value.asInstanceOf[js.Any])
    
    inline def setCustomNetworkUndefined: Self = StObject.set(x, "customNetwork", js.undefined)
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setDesired(value: DesiredCapabilities): Self = StObject.set(x, "desired", value.asInstanceOf[js.Any])
    
    inline def setDesiredUndefined: Self = StObject.set(x, "desired", js.undefined)
    
    inline def setDevice(value: String): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    inline def setDeviceNameUndefined: Self = StObject.set(x, "deviceName", js.undefined)
    
    inline def setDeviceOrientation(value: portrait | landscape): Self = StObject.set(x, "deviceOrientation", value.asInstanceOf[js.Any])
    
    inline def setDeviceOrientationUndefined: Self = StObject.set(x, "deviceOrientation", js.undefined)
    
    inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
    
    inline def setEdge(value: EnablePopups): Self = StObject.set(x, "edge", value.asInstanceOf[js.Any])
    
    inline def setEdgeUndefined: Self = StObject.set(x, "edge", js.undefined)
    
    inline def setFirefox(value: Driver): Self = StObject.set(x, "firefox", value.asInstanceOf[js.Any])
    
    inline def setFirefoxUndefined: Self = StObject.set(x, "firefox", js.undefined)
    
    inline def setGeoLocation(value: String): Self = StObject.set(x, "geoLocation", value.asInstanceOf[js.Any])
    
    inline def setGeoLocationUndefined: Self = StObject.set(x, "geoLocation", js.undefined)
    
    inline def setHosts(value: String): Self = StObject.set(x, "hosts", value.asInstanceOf[js.Any])
    
    inline def setHostsUndefined: Self = StObject.set(x, "hosts", js.undefined)
    
    inline def setIdleTimeout(value: Double): Self = StObject.set(x, "idleTimeout", value.asInstanceOf[js.Any])
    
    inline def setIdleTimeoutUndefined: Self = StObject.set(x, "idleTimeout", js.undefined)
    
    inline def setIe(value: Arch): Self = StObject.set(x, "ie", value.asInstanceOf[js.Any])
    
    inline def setIeUndefined: Self = StObject.set(x, "ie", js.undefined)
    
    inline def setLocal(value: Boolean): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    inline def setLocalIdentifier(value: String): Self = StObject.set(x, "localIdentifier", value.asInstanceOf[js.Any])
    
    inline def setLocalIdentifierUndefined: Self = StObject.set(x, "localIdentifier", js.undefined)
    
    inline def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
    
    inline def setMaskBasicAuth(value: Boolean): Self = StObject.set(x, "maskBasicAuth", value.asInstanceOf[js.Any])
    
    inline def setMaskBasicAuthUndefined: Self = StObject.set(x, "maskBasicAuth", js.undefined)
    
    inline def setNetworkLogs(value: Boolean): Self = StObject.set(x, "networkLogs", value.asInstanceOf[js.Any])
    
    inline def setNetworkLogsUndefined: Self = StObject.set(x, "networkLogs", js.undefined)
    
    inline def setNetworkProfile(value: String): Self = StObject.set(x, "networkProfile", value.asInstanceOf[js.Any])
    
    inline def setNetworkProfileUndefined: Self = StObject.set(x, "networkProfile", js.undefined)
    
    inline def setOs(value: String): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
    
    inline def setOsUndefined: Self = StObject.set(x, "os", js.undefined)
    
    inline def setOsVersion(value: String): Self = StObject.set(x, "osVersion", value.asInstanceOf[js.Any])
    
    inline def setOsVersionUndefined: Self = StObject.set(x, "osVersion", js.undefined)
    
    inline def setOs_version(value: String): Self = StObject.set(x, "os_version", value.asInstanceOf[js.Any])
    
    inline def setOs_versionUndefined: Self = StObject.set(x, "os_version", js.undefined)
    
    inline def setProjectName(value: String): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
    
    inline def setProjectNameUndefined: Self = StObject.set(x, "projectName", js.undefined)
    
    inline def setRealMobile(value: Boolean): Self = StObject.set(x, "realMobile", value.asInstanceOf[js.Any])
    
    inline def setRealMobileUndefined: Self = StObject.set(x, "realMobile", js.undefined)
    
    inline def setResolution(value: String): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    inline def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
    
    inline def setSafari(value: AllowAllCookies): Self = StObject.set(x, "safari", value.asInstanceOf[js.Any])
    
    inline def setSafariUndefined: Self = StObject.set(x, "safari", js.undefined)
    
    inline def setSeleniumLogs(value: Boolean): Self = StObject.set(x, "seleniumLogs", value.asInstanceOf[js.Any])
    
    inline def setSeleniumLogsUndefined: Self = StObject.set(x, "seleniumLogs", js.undefined)
    
    inline def setSeleniumVersion(value: String): Self = StObject.set(x, "seleniumVersion", value.asInstanceOf[js.Any])
    
    inline def setSeleniumVersionUndefined: Self = StObject.set(x, "seleniumVersion", js.undefined)
    
    inline def setSessionName(value: String): Self = StObject.set(x, "sessionName", value.asInstanceOf[js.Any])
    
    inline def setSessionNameUndefined: Self = StObject.set(x, "sessionName", js.undefined)
    
    inline def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    
    inline def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
    
    inline def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
    
    inline def setUserNameUndefined: Self = StObject.set(x, "userName", js.undefined)
    
    inline def setVideo(value: Boolean): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    inline def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
    
    inline def setWdioService(value: String): Self = StObject.set(x, "wdioService", value.asInstanceOf[js.Any])
    
    inline def setWdioServiceUndefined: Self = StObject.set(x, "wdioService", js.undefined)
    
    inline def setWsLocalSupport(value: Boolean): Self = StObject.set(x, "wsLocalSupport", value.asInstanceOf[js.Any])
    
    inline def setWsLocalSupportUndefined: Self = StObject.set(x, "wsLocalSupport", js.undefined)
  }
}
