package typingsJapgolly.wdioTypes.buildCapabilitiesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppiumCapabilities extends StObject {
  
  var app: js.UndefOr[String] = js.undefined
  
  var autoWebview: js.UndefOr[Boolean] = js.undefined
  
  var automationName: js.UndefOr[String] = js.undefined
  
  var deviceName: js.UndefOr[String] = js.undefined
  
  var directConnectHost: js.UndefOr[String] = js.undefined
  
  var directConnectPath: js.UndefOr[String] = js.undefined
  
  var directConnectPort: js.UndefOr[Double] = js.undefined
  
  var directConnectProtocol: js.UndefOr[String] = js.undefined
  
  var enablePerformanceLogging: js.UndefOr[Boolean] = js.undefined
  
  var eventTimings: js.UndefOr[Boolean] = js.undefined
  
  var fullReset: js.UndefOr[Boolean] = js.undefined
  
  var language: js.UndefOr[String] = js.undefined
  
  var locale: js.UndefOr[String] = js.undefined
  
  var newCommandTimeout: js.UndefOr[Double] = js.undefined
  
  var noReset: js.UndefOr[Boolean] = js.undefined
  
  var orientation: js.UndefOr[String] = js.undefined
  
  var platformVersion: js.UndefOr[String] = js.undefined
  
  var printPageSourceOnFindFailure: js.UndefOr[Boolean] = js.undefined
  
  var udid: js.UndefOr[String] = js.undefined
}
object AppiumCapabilities {
  
  inline def apply(): AppiumCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppiumCapabilities]
  }
  
  extension [Self <: AppiumCapabilities](x: Self) {
    
    inline def setApp(value: String): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    inline def setAppUndefined: Self = StObject.set(x, "app", js.undefined)
    
    inline def setAutoWebview(value: Boolean): Self = StObject.set(x, "autoWebview", value.asInstanceOf[js.Any])
    
    inline def setAutoWebviewUndefined: Self = StObject.set(x, "autoWebview", js.undefined)
    
    inline def setAutomationName(value: String): Self = StObject.set(x, "automationName", value.asInstanceOf[js.Any])
    
    inline def setAutomationNameUndefined: Self = StObject.set(x, "automationName", js.undefined)
    
    inline def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    inline def setDeviceNameUndefined: Self = StObject.set(x, "deviceName", js.undefined)
    
    inline def setDirectConnectHost(value: String): Self = StObject.set(x, "directConnectHost", value.asInstanceOf[js.Any])
    
    inline def setDirectConnectHostUndefined: Self = StObject.set(x, "directConnectHost", js.undefined)
    
    inline def setDirectConnectPath(value: String): Self = StObject.set(x, "directConnectPath", value.asInstanceOf[js.Any])
    
    inline def setDirectConnectPathUndefined: Self = StObject.set(x, "directConnectPath", js.undefined)
    
    inline def setDirectConnectPort(value: Double): Self = StObject.set(x, "directConnectPort", value.asInstanceOf[js.Any])
    
    inline def setDirectConnectPortUndefined: Self = StObject.set(x, "directConnectPort", js.undefined)
    
    inline def setDirectConnectProtocol(value: String): Self = StObject.set(x, "directConnectProtocol", value.asInstanceOf[js.Any])
    
    inline def setDirectConnectProtocolUndefined: Self = StObject.set(x, "directConnectProtocol", js.undefined)
    
    inline def setEnablePerformanceLogging(value: Boolean): Self = StObject.set(x, "enablePerformanceLogging", value.asInstanceOf[js.Any])
    
    inline def setEnablePerformanceLoggingUndefined: Self = StObject.set(x, "enablePerformanceLogging", js.undefined)
    
    inline def setEventTimings(value: Boolean): Self = StObject.set(x, "eventTimings", value.asInstanceOf[js.Any])
    
    inline def setEventTimingsUndefined: Self = StObject.set(x, "eventTimings", js.undefined)
    
    inline def setFullReset(value: Boolean): Self = StObject.set(x, "fullReset", value.asInstanceOf[js.Any])
    
    inline def setFullResetUndefined: Self = StObject.set(x, "fullReset", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setNewCommandTimeout(value: Double): Self = StObject.set(x, "newCommandTimeout", value.asInstanceOf[js.Any])
    
    inline def setNewCommandTimeoutUndefined: Self = StObject.set(x, "newCommandTimeout", js.undefined)
    
    inline def setNoReset(value: Boolean): Self = StObject.set(x, "noReset", value.asInstanceOf[js.Any])
    
    inline def setNoResetUndefined: Self = StObject.set(x, "noReset", js.undefined)
    
    inline def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setPlatformVersion(value: String): Self = StObject.set(x, "platformVersion", value.asInstanceOf[js.Any])
    
    inline def setPlatformVersionUndefined: Self = StObject.set(x, "platformVersion", js.undefined)
    
    inline def setPrintPageSourceOnFindFailure(value: Boolean): Self = StObject.set(x, "printPageSourceOnFindFailure", value.asInstanceOf[js.Any])
    
    inline def setPrintPageSourceOnFindFailureUndefined: Self = StObject.set(x, "printPageSourceOnFindFailure", js.undefined)
    
    inline def setUdid(value: String): Self = StObject.set(x, "udid", value.asInstanceOf[js.Any])
    
    inline def setUdidUndefined: Self = StObject.set(x, "udid", js.undefined)
  }
}
