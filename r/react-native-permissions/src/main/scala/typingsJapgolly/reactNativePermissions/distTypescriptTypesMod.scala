package typingsJapgolly.reactNativePermissions

import typingsJapgolly.reactNativePermissions.distTypescriptPermissionsDotandroidMod.AndroidPermissionMap
import typingsJapgolly.reactNativePermissions.distTypescriptPermissionsDotiosMod.IOSPermissionMap
import typingsJapgolly.reactNativePermissions.distTypescriptPermissionsDotwindowsMod.WindowsPermissionMap
import typingsJapgolly.reactNativePermissions.distTypescriptResultsMod.ResultMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypescriptTypesMod {
  
  type AndroidPermission = Values[AndroidPermissionMap]
  
  type IOSPermission = Values[IOSPermissionMap]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactNativePermissions.reactNativePermissionsStrings.full
    - typingsJapgolly.reactNativePermissions.reactNativePermissionsStrings.reduced
  */
  trait LocationAccuracy extends StObject
  object LocationAccuracy {
    
    inline def full: typingsJapgolly.reactNativePermissions.reactNativePermissionsStrings.full = "full".asInstanceOf[typingsJapgolly.reactNativePermissions.reactNativePermissionsStrings.full]
    
    inline def reduced: typingsJapgolly.reactNativePermissions.reactNativePermissionsStrings.reduced = "reduced".asInstanceOf[typingsJapgolly.reactNativePermissions.reactNativePermissionsStrings.reduced]
  }
  
  trait LocationAccuracyOptions extends StObject {
    
    var purposeKey: String
  }
  object LocationAccuracyOptions {
    
    inline def apply(purposeKey: String): LocationAccuracyOptions = {
      val __obj = js.Dynamic.literal(purposeKey = purposeKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocationAccuracyOptions]
    }
    
    extension [Self <: LocationAccuracyOptions](x: Self) {
      
      inline def setPurposeKey(value: String): Self = StObject.set(x, "purposeKey", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactNativePermissions.reactNativePermissionsStrings.alert
    - typingsJapgolly.reactNativePermissions.reactNativePermissionsStrings.badge
    - typingsJapgolly.reactNativePermissions.reactNativePermissionsStrings.sound
    - typingsJapgolly.reactNativePermissions.reactNativePermissionsStrings.carPlay
    - typingsJapgolly.reactNativePermissions.reactNativePermissionsStrings.criticalAlert
    - typingsJapgolly.reactNativePermissions.reactNativePermissionsStrings.provisional
    - typingsJapgolly.reactNativePermissions.reactNativePermissionsStrings.providesAppSettings
  */
  trait NotificationOption extends StObject
  object NotificationOption {
    
    inline def alert: typingsJapgolly.reactNativePermissions.reactNativePermissionsStrings.alert = "alert".asInstanceOf[typingsJapgolly.reactNativePermissions.reactNativePermissionsStrings.alert]
    
    inline def badge: typingsJapgolly.reactNativePermissions.reactNativePermissionsStrings.badge = "badge".asInstanceOf[typingsJapgolly.reactNativePermissions.reactNativePermissionsStrings.badge]
    
    inline def carPlay: typingsJapgolly.reactNativePermissions.reactNativePermissionsStrings.carPlay = "carPlay".asInstanceOf[typingsJapgolly.reactNativePermissions.reactNativePermissionsStrings.carPlay]
    
    inline def criticalAlert: typingsJapgolly.reactNativePermissions.reactNativePermissionsStrings.criticalAlert = "criticalAlert".asInstanceOf[typingsJapgolly.reactNativePermissions.reactNativePermissionsStrings.criticalAlert]
    
    inline def providesAppSettings: typingsJapgolly.reactNativePermissions.reactNativePermissionsStrings.providesAppSettings = "providesAppSettings".asInstanceOf[typingsJapgolly.reactNativePermissions.reactNativePermissionsStrings.providesAppSettings]
    
    inline def provisional: typingsJapgolly.reactNativePermissions.reactNativePermissionsStrings.provisional = "provisional".asInstanceOf[typingsJapgolly.reactNativePermissions.reactNativePermissionsStrings.provisional]
    
    inline def sound: typingsJapgolly.reactNativePermissions.reactNativePermissionsStrings.sound = "sound".asInstanceOf[typingsJapgolly.reactNativePermissions.reactNativePermissionsStrings.sound]
  }
  
  trait NotificationSettings extends StObject {
    
    var alert: js.UndefOr[Boolean] = js.undefined
    
    var badge: js.UndefOr[Boolean] = js.undefined
    
    var carPlay: js.UndefOr[Boolean] = js.undefined
    
    var criticalAlert: js.UndefOr[Boolean] = js.undefined
    
    var lockScreen: js.UndefOr[Boolean] = js.undefined
    
    var notificationCenter: js.UndefOr[Boolean] = js.undefined
    
    var providesAppSettings: js.UndefOr[Boolean] = js.undefined
    
    var provisional: js.UndefOr[Boolean] = js.undefined
    
    var sound: js.UndefOr[Boolean] = js.undefined
  }
  object NotificationSettings {
    
    inline def apply(): NotificationSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotificationSettings]
    }
    
    extension [Self <: NotificationSettings](x: Self) {
      
      inline def setAlert(value: Boolean): Self = StObject.set(x, "alert", value.asInstanceOf[js.Any])
      
      inline def setAlertUndefined: Self = StObject.set(x, "alert", js.undefined)
      
      inline def setBadge(value: Boolean): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
      
      inline def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
      
      inline def setCarPlay(value: Boolean): Self = StObject.set(x, "carPlay", value.asInstanceOf[js.Any])
      
      inline def setCarPlayUndefined: Self = StObject.set(x, "carPlay", js.undefined)
      
      inline def setCriticalAlert(value: Boolean): Self = StObject.set(x, "criticalAlert", value.asInstanceOf[js.Any])
      
      inline def setCriticalAlertUndefined: Self = StObject.set(x, "criticalAlert", js.undefined)
      
      inline def setLockScreen(value: Boolean): Self = StObject.set(x, "lockScreen", value.asInstanceOf[js.Any])
      
      inline def setLockScreenUndefined: Self = StObject.set(x, "lockScreen", js.undefined)
      
      inline def setNotificationCenter(value: Boolean): Self = StObject.set(x, "notificationCenter", value.asInstanceOf[js.Any])
      
      inline def setNotificationCenterUndefined: Self = StObject.set(x, "notificationCenter", js.undefined)
      
      inline def setProvidesAppSettings(value: Boolean): Self = StObject.set(x, "providesAppSettings", value.asInstanceOf[js.Any])
      
      inline def setProvidesAppSettingsUndefined: Self = StObject.set(x, "providesAppSettings", js.undefined)
      
      inline def setProvisional(value: Boolean): Self = StObject.set(x, "provisional", value.asInstanceOf[js.Any])
      
      inline def setProvisionalUndefined: Self = StObject.set(x, "provisional", js.undefined)
      
      inline def setSound(value: Boolean): Self = StObject.set(x, "sound", value.asInstanceOf[js.Any])
      
      inline def setSoundUndefined: Self = StObject.set(x, "sound", js.undefined)
    }
  }
  
  trait NotificationsResponse extends StObject {
    
    var settings: NotificationSettings
    
    var status: PermissionStatus
  }
  object NotificationsResponse {
    
    inline def apply(settings: NotificationSettings, status: PermissionStatus): NotificationsResponse = {
      val __obj = js.Dynamic.literal(settings = settings.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotificationsResponse]
    }
    
    extension [Self <: NotificationsResponse](x: Self) {
      
      inline def setSettings(value: NotificationSettings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: PermissionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  type Permission = AndroidPermission | IOSPermission | WindowsPermission
  
  type PermissionStatus = Values[ResultMap]
  
  type Values[T /* <: js.Object */] = /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  
  type WindowsPermission = Values[WindowsPermissionMap]
}
