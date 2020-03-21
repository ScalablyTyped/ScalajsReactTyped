package typingsJapgolly.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request used for `CreateInstance`.
  */
@js.native
trait SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaCreateInstanceRequest extends js.Object {
  /**
    * Specifies the instance to create. The name in the instance, if specified
    * in the instance, is ignored.
    */
  var instance: js.UndefOr[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance] = js.native
  /**
    * ID of the created instance. A valid `instance_id` must: be 6-50
    * characters long, contain only lowercase letters, digits, hyphens and
    * underscores, start with a lowercase letter, and end with a lowercase
    * letter or a digit.
    */
  var instanceId: js.UndefOr[String] = js.native
  /**
    * Resource name of the project containing the instance. Format:
    * `projects/[PROJECT_ID]`.
    */
  var parent: js.UndefOr[String] = js.native
}

object SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaCreateInstanceRequest {
  @scala.inline
  def apply(
    instance: SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance = null,
    instanceId: String = null,
    parent: String = null
  ): SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaCreateInstanceRequest = {
    val __obj = js.Dynamic.literal()
    if (instance != null) __obj.updateDynamic("instance")(instance.asInstanceOf[js.Any])
    if (instanceId != null) __obj.updateDynamic("instanceId")(instanceId.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaCreateInstanceRequest]
  }
}

