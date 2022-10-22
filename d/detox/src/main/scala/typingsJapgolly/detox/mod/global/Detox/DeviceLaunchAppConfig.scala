package typingsJapgolly.detox.mod.global.Detox

import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceLaunchAppConfig extends StObject {
  
  /**
    * Launch into a fresh installation
    * A flag that enables relaunching into a fresh installation of the app (it will uninstall and install the binary again), default is false.
    */
  var delete: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Launch config for specifying the native language and locale
    */
  var languageAndLocale: js.UndefOr[LanguageAndLocale] = js.undefined
  
  /**
    * Arguments to pass-through into the app.
    * Refer to the [dedicated guide](https://wix.github.io/Detox/docs/api/launch-args) for complete details.
    */
  var launchArgs: js.UndefOr[Record[String, Any]] = js.undefined
  
  /**
    * Restart the app
    * Terminate the app and launch it again. If set to false, the simulator will try to bring app from background, if the app isn't running, it will launch a new instance. default is false
    */
  var newInstance: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set runtime permissions
    * Grant or deny runtime permissions for your application.
    */
  var permissions: js.UndefOr[DevicePermissions] = js.undefined
  
  /**
    * Launch from URL
    * Mock opening the app from URL to test your app's deep link handling mechanism.
    */
  var url: js.UndefOr[Any] = js.undefined
  
  /**
    * Launch with user activity
    */
  var userActivity: js.UndefOr[Any] = js.undefined
  
  /**
    * Launch with user notifications
    */
  var userNotification: js.UndefOr[Any] = js.undefined
}
object DeviceLaunchAppConfig {
  
  inline def apply(): DeviceLaunchAppConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceLaunchAppConfig]
  }
  
  extension [Self <: DeviceLaunchAppConfig](x: Self) {
    
    inline def setDelete(value: Boolean): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
    
    inline def setLanguageAndLocale(value: LanguageAndLocale): Self = StObject.set(x, "languageAndLocale", value.asInstanceOf[js.Any])
    
    inline def setLanguageAndLocaleUndefined: Self = StObject.set(x, "languageAndLocale", js.undefined)
    
    inline def setLaunchArgs(value: Record[String, Any]): Self = StObject.set(x, "launchArgs", value.asInstanceOf[js.Any])
    
    inline def setLaunchArgsUndefined: Self = StObject.set(x, "launchArgs", js.undefined)
    
    inline def setNewInstance(value: Boolean): Self = StObject.set(x, "newInstance", value.asInstanceOf[js.Any])
    
    inline def setNewInstanceUndefined: Self = StObject.set(x, "newInstance", js.undefined)
    
    inline def setPermissions(value: DevicePermissions): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    inline def setUrl(value: Any): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setUserActivity(value: Any): Self = StObject.set(x, "userActivity", value.asInstanceOf[js.Any])
    
    inline def setUserActivityUndefined: Self = StObject.set(x, "userActivity", js.undefined)
    
    inline def setUserNotification(value: Any): Self = StObject.set(x, "userNotification", value.asInstanceOf[js.Any])
    
    inline def setUserNotificationUndefined: Self = StObject.set(x, "userNotification", js.undefined)
  }
}
