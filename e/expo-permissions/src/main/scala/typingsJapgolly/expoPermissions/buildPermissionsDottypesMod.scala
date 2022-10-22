package typingsJapgolly.expoPermissions

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.expoModulesCore.buildPermissionsInterfaceMod.PermissionExpiration
import typingsJapgolly.expoModulesCore.buildPermissionsInterfaceMod.PermissionStatus
import typingsJapgolly.expoPermissions.expoPermissionsStrings.all
import typingsJapgolly.expoPermissions.expoPermissionsStrings.always
import typingsJapgolly.expoPermissions.expoPermissionsStrings.coarse
import typingsJapgolly.expoPermissions.expoPermissionsStrings.fine
import typingsJapgolly.expoPermissions.expoPermissionsStrings.limited
import typingsJapgolly.expoPermissions.expoPermissionsStrings.none
import typingsJapgolly.expoPermissions.expoPermissionsStrings.whenInUse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildPermissionsDottypesMod {
  
  @JSImport("expo-permissions/build/Permissions.types", "PermissionStatus")
  @js.native
  object PermissionStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsJapgolly.expoModulesCore.buildPermissionsInterfaceMod.PermissionStatus & String
      ] = js.native
    
    /* "denied" */ val DENIED: typingsJapgolly.expoModulesCore.buildPermissionsInterfaceMod.PermissionStatus.DENIED & String = js.native
    
    /* "granted" */ val GRANTED: typingsJapgolly.expoModulesCore.buildPermissionsInterfaceMod.PermissionStatus.GRANTED & String = js.native
    
    /* "undetermined" */ val UNDETERMINED: typingsJapgolly.expoModulesCore.buildPermissionsInterfaceMod.PermissionStatus.UNDETERMINED & String = js.native
  }
  
  trait PermissionDetailsLocationAndroid extends StObject {
    
    var accuracy: fine | coarse | none
  }
  object PermissionDetailsLocationAndroid {
    
    inline def apply(accuracy: fine | coarse | none): PermissionDetailsLocationAndroid = {
      val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any])
      __obj.asInstanceOf[PermissionDetailsLocationAndroid]
    }
    
    extension [Self <: PermissionDetailsLocationAndroid](x: Self) {
      
      inline def setAccuracy(value: fine | coarse | none): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
    }
  }
  
  trait PermissionInfo
    extends StObject
       with typingsJapgolly.expoModulesCore.buildPermissionsInterfaceMod.PermissionResponse {
    
    /**
      * iOS only - Permission.MEDIA_LIBRARY/MEDIA_LIBRARY_WRITE_ONLY
      */
    var accessPrivileges: js.UndefOr[all | limited | none] = js.undefined
    
    var android: js.UndefOr[PermissionDetailsLocationAndroid] = js.undefined
    
    var scope: js.UndefOr[whenInUse | always | none] = js.undefined
  }
  object PermissionInfo {
    
    inline def apply(canAskAgain: Boolean, expires: PermissionExpiration, granted: Boolean, status: PermissionStatus): PermissionInfo = {
      val __obj = js.Dynamic.literal(canAskAgain = canAskAgain.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], granted = granted.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[PermissionInfo]
    }
    
    extension [Self <: PermissionInfo](x: Self) {
      
      inline def setAccessPrivileges(value: all | limited | none): Self = StObject.set(x, "accessPrivileges", value.asInstanceOf[js.Any])
      
      inline def setAccessPrivilegesUndefined: Self = StObject.set(x, "accessPrivileges", js.undefined)
      
      inline def setAndroid(value: PermissionDetailsLocationAndroid): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
      
      inline def setAndroidUndefined: Self = StObject.set(x, "android", js.undefined)
      
      inline def setScope(value: whenInUse | always | none): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    }
  }
  
  type PermissionMap = StringDictionary[PermissionInfo]
  
  trait PermissionResponse
    extends StObject
       with typingsJapgolly.expoModulesCore.buildPermissionsInterfaceMod.PermissionResponse {
    
    var permissions: PermissionMap
  }
  object PermissionResponse {
    
    inline def apply(
      canAskAgain: Boolean,
      expires: PermissionExpiration,
      granted: Boolean,
      permissions: PermissionMap,
      status: PermissionStatus
    ): PermissionResponse = {
      val __obj = js.Dynamic.literal(canAskAgain = canAskAgain.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], granted = granted.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[PermissionResponse]
    }
    
    extension [Self <: PermissionResponse](x: Self) {
      
      inline def setPermissions(value: PermissionMap): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.expoPermissions.expoPermissionsStrings.camera
    - typingsJapgolly.expoPermissions.expoPermissionsStrings.cameraRoll
    - typingsJapgolly.expoPermissions.expoPermissionsStrings.mediaLibrary
    - typingsJapgolly.expoPermissions.expoPermissionsStrings.mediaLibraryWriteOnly
    - typingsJapgolly.expoPermissions.expoPermissionsStrings.audioRecording
    - typingsJapgolly.expoPermissions.expoPermissionsStrings.location
    - typingsJapgolly.expoPermissions.expoPermissionsStrings.locationForeground
    - typingsJapgolly.expoPermissions.expoPermissionsStrings.locationBackground
    - typingsJapgolly.expoPermissions.expoPermissionsStrings.userFacingNotifications
    - typingsJapgolly.expoPermissions.expoPermissionsStrings.notifications
    - typingsJapgolly.expoPermissions.expoPermissionsStrings.contacts
    - typingsJapgolly.expoPermissions.expoPermissionsStrings.calendar
    - typingsJapgolly.expoPermissions.expoPermissionsStrings.reminders
    - typingsJapgolly.expoPermissions.expoPermissionsStrings.motion
    - typingsJapgolly.expoPermissions.expoPermissionsStrings.systemBrightness
  */
  trait PermissionType extends StObject
  object PermissionType {
    
    inline def audioRecording: typingsJapgolly.expoPermissions.expoPermissionsStrings.audioRecording = "audioRecording".asInstanceOf[typingsJapgolly.expoPermissions.expoPermissionsStrings.audioRecording]
    
    inline def calendar: typingsJapgolly.expoPermissions.expoPermissionsStrings.calendar = "calendar".asInstanceOf[typingsJapgolly.expoPermissions.expoPermissionsStrings.calendar]
    
    inline def camera: typingsJapgolly.expoPermissions.expoPermissionsStrings.camera = "camera".asInstanceOf[typingsJapgolly.expoPermissions.expoPermissionsStrings.camera]
    
    inline def cameraRoll: typingsJapgolly.expoPermissions.expoPermissionsStrings.cameraRoll = "cameraRoll".asInstanceOf[typingsJapgolly.expoPermissions.expoPermissionsStrings.cameraRoll]
    
    inline def contacts: typingsJapgolly.expoPermissions.expoPermissionsStrings.contacts = "contacts".asInstanceOf[typingsJapgolly.expoPermissions.expoPermissionsStrings.contacts]
    
    inline def location: typingsJapgolly.expoPermissions.expoPermissionsStrings.location = "location".asInstanceOf[typingsJapgolly.expoPermissions.expoPermissionsStrings.location]
    
    inline def locationBackground: typingsJapgolly.expoPermissions.expoPermissionsStrings.locationBackground = "locationBackground".asInstanceOf[typingsJapgolly.expoPermissions.expoPermissionsStrings.locationBackground]
    
    inline def locationForeground: typingsJapgolly.expoPermissions.expoPermissionsStrings.locationForeground = "locationForeground".asInstanceOf[typingsJapgolly.expoPermissions.expoPermissionsStrings.locationForeground]
    
    inline def mediaLibrary: typingsJapgolly.expoPermissions.expoPermissionsStrings.mediaLibrary = "mediaLibrary".asInstanceOf[typingsJapgolly.expoPermissions.expoPermissionsStrings.mediaLibrary]
    
    inline def mediaLibraryWriteOnly: typingsJapgolly.expoPermissions.expoPermissionsStrings.mediaLibraryWriteOnly = "mediaLibraryWriteOnly".asInstanceOf[typingsJapgolly.expoPermissions.expoPermissionsStrings.mediaLibraryWriteOnly]
    
    inline def motion: typingsJapgolly.expoPermissions.expoPermissionsStrings.motion = "motion".asInstanceOf[typingsJapgolly.expoPermissions.expoPermissionsStrings.motion]
    
    inline def notifications: typingsJapgolly.expoPermissions.expoPermissionsStrings.notifications = "notifications".asInstanceOf[typingsJapgolly.expoPermissions.expoPermissionsStrings.notifications]
    
    inline def reminders: typingsJapgolly.expoPermissions.expoPermissionsStrings.reminders = "reminders".asInstanceOf[typingsJapgolly.expoPermissions.expoPermissionsStrings.reminders]
    
    inline def systemBrightness: typingsJapgolly.expoPermissions.expoPermissionsStrings.systemBrightness = "systemBrightness".asInstanceOf[typingsJapgolly.expoPermissions.expoPermissionsStrings.systemBrightness]
    
    inline def userFacingNotifications: typingsJapgolly.expoPermissions.expoPermissionsStrings.userFacingNotifications = "userFacingNotifications".asInstanceOf[typingsJapgolly.expoPermissions.expoPermissionsStrings.userFacingNotifications]
  }
}
