package typingsJapgolly.expoPermissions.permissionsTypesMod

import typingsJapgolly.expoPermissions.expoPermissionsStrings.always
import typingsJapgolly.expoPermissions.expoPermissionsStrings.whenInUse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionDetailsLocationIOS extends js.Object {
  var scope: whenInUse | always
}

object PermissionDetailsLocationIOS {
  @scala.inline
  def apply(scope: whenInUse | always): PermissionDetailsLocationIOS = {
    val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PermissionDetailsLocationIOS]
  }
}

