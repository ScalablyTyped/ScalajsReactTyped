package typingsJapgolly.expoPermissions

import typingsJapgolly.expoPermissions.permissionsTypesMod.PermissionExpiration
import typingsJapgolly.expoPermissions.permissionsTypesMod.PermissionMap
import typingsJapgolly.expoPermissions.permissionsTypesMod.PermissionStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo-permissions/build/CoalescedPermissions", JSImport.Namespace)
@js.native
object coalescedPermissionsMod extends js.Object {
  def coalesceExpirations(permissions: PermissionMap): PermissionExpiration = js.native
  def coalesceStatuses(permissions: PermissionMap): PermissionStatus = js.native
}

