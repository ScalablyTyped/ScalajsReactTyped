package typingsJapgolly.expoPermissions

import typingsJapgolly.expoPermissions.expoPermissionsStrings.audioRecording
import typingsJapgolly.expoPermissions.expoPermissionsStrings.calendar
import typingsJapgolly.expoPermissions.expoPermissionsStrings.camera
import typingsJapgolly.expoPermissions.expoPermissionsStrings.cameraRoll
import typingsJapgolly.expoPermissions.expoPermissionsStrings.contacts
import typingsJapgolly.expoPermissions.expoPermissionsStrings.location
import typingsJapgolly.expoPermissions.expoPermissionsStrings.notifications
import typingsJapgolly.expoPermissions.expoPermissionsStrings.reminders
import typingsJapgolly.expoPermissions.expoPermissionsStrings.systemBrightness
import typingsJapgolly.expoPermissions.expoPermissionsStrings.userFacingNotifications
import typingsJapgolly.expoPermissions.permissionsTypesMod.PermissionResponse
import typingsJapgolly.expoPermissions.permissionsTypesMod.PermissionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo-permissions", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val AUDIO_RECORDING: audioRecording = js.native
  val CALENDAR: calendar = js.native
  val CAMERA: camera = js.native
  val CAMERA_ROLL: cameraRoll = js.native
  val CONTACTS: contacts = js.native
  val LOCATION: location = js.native
  val NOTIFICATIONS: notifications = js.native
  val REMINDERS: reminders = js.native
  val SYSTEM_BRIGHTNESS: systemBrightness = js.native
  val USER_FACING_NOTIFICATIONS: userFacingNotifications = js.native
  def askAsync(types: PermissionType*): js.Promise[PermissionResponse] = js.native
  def getAsync(types: PermissionType*): js.Promise[PermissionResponse] = js.native
  @js.native
  object PermissionStatus extends js.Object {
    /* "denied" */ val DENIED: typingsJapgolly.expoPermissions.permissionsTypesMod.PermissionStatus.DENIED with String = js.native
    /* "granted" */ val GRANTED: typingsJapgolly.expoPermissions.permissionsTypesMod.PermissionStatus.GRANTED with String = js.native
    /* "undetermined" */ val UNDETERMINED: typingsJapgolly.expoPermissions.permissionsTypesMod.PermissionStatus.UNDETERMINED with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.expoPermissions.permissionsTypesMod.PermissionStatus with String] = js.native
  }
  
}

