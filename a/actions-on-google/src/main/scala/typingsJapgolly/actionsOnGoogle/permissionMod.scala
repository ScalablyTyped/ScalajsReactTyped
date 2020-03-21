package typingsJapgolly.actionsOnGoogle

import typingsJapgolly.actionsOnGoogle.permissionPermissionMod.PermissionOptions
import typingsJapgolly.actionsOnGoogle.updateMod.UpdatePermissionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/permission", JSImport.Namespace)
@js.native
object permissionMod extends js.Object {
  @js.native
  class Permission protected ()
    extends typingsJapgolly.actionsOnGoogle.permissionPermissionMod.Permission {
    /**
      * @param options Permission options
      * @public
      */
    def this(options: PermissionOptions) = this()
  }
  
  @js.native
  class UpdatePermission protected ()
    extends typingsJapgolly.actionsOnGoogle.updateMod.UpdatePermission {
    /**
      * @param options UpdatePermission options
      * @public
      */
    def this(options: UpdatePermissionOptions) = this()
  }
  
}

