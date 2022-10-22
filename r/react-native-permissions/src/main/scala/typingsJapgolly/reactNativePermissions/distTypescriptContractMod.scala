package typingsJapgolly.reactNativePermissions

import typingsJapgolly.reactNative.mod.Rationale
import typingsJapgolly.reactNativePermissions.distTypescriptTypesMod.LocationAccuracy
import typingsJapgolly.reactNativePermissions.distTypescriptTypesMod.LocationAccuracyOptions
import typingsJapgolly.reactNativePermissions.distTypescriptTypesMod.NotificationOption
import typingsJapgolly.reactNativePermissions.distTypescriptTypesMod.NotificationsResponse
import typingsJapgolly.reactNativePermissions.distTypescriptTypesMod.Permission
import typingsJapgolly.reactNativePermissions.distTypescriptTypesMod.PermissionStatus
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypescriptContractMod {
  
  @js.native
  trait Contract extends StObject {
    
    def check(permission: Permission): js.Promise[PermissionStatus] = js.native
    
    def checkLocationAccuracy(): js.Promise[LocationAccuracy] = js.native
    
    def checkMultiple[P /* <: js.Array[Permission] */](permissions: P): js.Promise[
        Record[
          /* import warning: importer.ImportType#apply Failed type conversion: P[number] */ js.Any, 
          PermissionStatus
        ]
      ] = js.native
    
    def checkNotifications(): js.Promise[NotificationsResponse] = js.native
    
    def openLimitedPhotoLibraryPicker(): js.Promise[Unit] = js.native
    
    def openSettings(): js.Promise[Unit] = js.native
    
    def request(permission: Permission): js.Promise[PermissionStatus] = js.native
    def request(permission: Permission, rationale: Rationale): js.Promise[PermissionStatus] = js.native
    
    def requestLocationAccuracy(options: LocationAccuracyOptions): js.Promise[LocationAccuracy] = js.native
    
    def requestMultiple[P /* <: js.Array[Permission] */](permissions: P): js.Promise[
        Record[
          /* import warning: importer.ImportType#apply Failed type conversion: P[number] */ js.Any, 
          PermissionStatus
        ]
      ] = js.native
    
    def requestNotifications(options: js.Array[NotificationOption]): js.Promise[NotificationsResponse] = js.native
  }
}
