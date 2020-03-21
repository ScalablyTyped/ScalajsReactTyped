package typingsJapgolly.googleapis.mlV1Mod.mlV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for `TestIamPermissions` method.
  */
@js.native
trait SchemaGoogleIamV1TestIamPermissionsRequest extends js.Object {
  /**
    * The set of permissions to check for the `resource`. Permissions with
    * wildcards (such as &#39;*&#39; or &#39;storage.*&#39;) are not allowed.
    * For more information see [IAM
    * Overview](https://cloud.google.com/iam/docs/overview#permissions).
    */
  var permissions: js.UndefOr[js.Array[String]] = js.native
}

object SchemaGoogleIamV1TestIamPermissionsRequest {
  @scala.inline
  def apply(permissions: js.Array[String] = null): SchemaGoogleIamV1TestIamPermissionsRequest = {
    val __obj = js.Dynamic.literal()
    if (permissions != null) __obj.updateDynamic("permissions")(permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleIamV1TestIamPermissionsRequest]
  }
}

