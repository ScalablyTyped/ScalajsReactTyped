package typingsJapgolly.expoDashPermissions

import typingsJapgolly.expoDashPermissions.buildPermissionsDotTypesMod.PermissionResponse
import typingsJapgolly.expoDashPermissions.buildPermissionsDotTypesMod.PermissionType
import typingsJapgolly.expoDashPermissions.expoDashPermissionsStrings.audioRecording
import typingsJapgolly.expoDashPermissions.expoDashPermissionsStrings.calendar
import typingsJapgolly.expoDashPermissions.expoDashPermissionsStrings.camera
import typingsJapgolly.expoDashPermissions.expoDashPermissionsStrings.cameraRoll
import typingsJapgolly.expoDashPermissions.expoDashPermissionsStrings.contacts
import typingsJapgolly.expoDashPermissions.expoDashPermissionsStrings.location
import typingsJapgolly.expoDashPermissions.expoDashPermissionsStrings.notifications
import typingsJapgolly.expoDashPermissions.expoDashPermissionsStrings.reminders
import typingsJapgolly.expoDashPermissions.expoDashPermissionsStrings.systemBrightness
import typingsJapgolly.expoDashPermissions.expoDashPermissionsStrings.userFacingNotifications
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo-permissions", JSImport.Namespace)
@js.native
object expoDashPermissionsMod extends js.Object {
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
    /* "denied" */ val DENIED: typingsJapgolly.expoDashPermissions.buildPermissionsDotTypesMod.PermissionStatus.DENIED with String = js.native
    /* "granted" */ val GRANTED: typingsJapgolly.expoDashPermissions.buildPermissionsDotTypesMod.PermissionStatus.GRANTED with String = js.native
    /* "undetermined" */ val UNDETERMINED: typingsJapgolly.expoDashPermissions.buildPermissionsDotTypesMod.PermissionStatus.UNDETERMINED with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsJapgolly.expoDashPermissions.buildPermissionsDotTypesMod.PermissionStatus with String
      ] = js.native
  }
  
}

