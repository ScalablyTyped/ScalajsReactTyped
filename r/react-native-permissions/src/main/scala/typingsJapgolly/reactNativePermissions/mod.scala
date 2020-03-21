package typingsJapgolly.reactNativePermissions

import typingsJapgolly.reactNative.mod.Rationale
import typingsJapgolly.reactNativePermissions.reactNativePermissionsStrings.blocked
import typingsJapgolly.reactNativePermissions.reactNativePermissionsStrings.denied
import typingsJapgolly.reactNativePermissions.reactNativePermissionsStrings.granted
import typingsJapgolly.reactNativePermissions.reactNativePermissionsStrings.unavailable
import typingsJapgolly.reactNativePermissions.typesMod.NotificationOption
import typingsJapgolly.reactNativePermissions.typesMod.NotificationsResponse
import typingsJapgolly.reactNativePermissions.typesMod.Permission
import typingsJapgolly.reactNativePermissions.typesMod.PermissionStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-permissions", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def check(permission: Permission): js.Promise[PermissionStatus] = js.native
  def checkNotifications(): js.Promise[NotificationsResponse] = js.native
  def openSettings(): js.Promise[Unit] = js.native
  def request(permission: Permission): js.Promise[PermissionStatus] = js.native
  def request(permission: Permission, rationale: Rationale): js.Promise[PermissionStatus] = js.native
  def requestNotifications(options: js.Array[NotificationOption]): js.Promise[NotificationsResponse] = js.native
  @js.native
  object PERMISSIONS extends js.Object {
    val ANDROID: ReadonlyACCEPTHANDOVERand = js.native
    val IOS: ReadonlyBLUETOOTHPERIPHER = js.native
  }
  
  @js.native
  object RESULTS extends js.Object {
    val BLOCKED: blocked = js.native
    val DENIED: denied = js.native
    val GRANTED: granted = js.native
    val UNAVAILABLE: unavailable = js.native
  }
  
  @js.native
  object default extends js.Object {
    var PERMISSIONS: ReadonlyANDROIDReadonlyAC = js.native
    var RESULTS: ReadonlyUNAVAILABLEunavai = js.native
    var check: js.Function1[/* permission */ Permission, js.Promise[PermissionStatus]] = js.native
    var checkNotifications: js.Function0[js.Promise[NotificationsResponse]] = js.native
    var openSettings: js.Function0[js.Promise[Unit]] = js.native
    var request: js.Function2[
        /* permission */ Permission, 
        /* rationale */ js.UndefOr[Rationale], 
        js.Promise[PermissionStatus]
      ] = js.native
    var requestNotifications: js.Function1[/* options */ js.Array[NotificationOption], js.Promise[NotificationsResponse]] = js.native
  }
  
}

