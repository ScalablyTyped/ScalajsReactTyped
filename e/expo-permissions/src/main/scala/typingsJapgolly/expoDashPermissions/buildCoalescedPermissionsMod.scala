package typingsJapgolly.expoDashPermissions

import typingsJapgolly.expoDashPermissions.buildPermissionsDotTypesMod.PermissionExpiration
import typingsJapgolly.expoDashPermissions.buildPermissionsDotTypesMod.PermissionMap
import typingsJapgolly.expoDashPermissions.buildPermissionsDotTypesMod.PermissionStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo-permissions/build/CoalescedPermissions", JSImport.Namespace)
@js.native
object buildCoalescedPermissionsMod extends js.Object {
  def coalesceExpirations(permissions: PermissionMap): PermissionExpiration = js.native
  def coalesceStatuses(permissions: PermissionMap): PermissionStatus = js.native
}

