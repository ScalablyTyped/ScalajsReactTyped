package typingsJapgolly.pulumiAws.inputMod.elastictranscoder

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PipelineThumbnailConfigPermission extends js.Object {
  /**
    * The permission that you want to give to the AWS user that you specified in `thumbnail_config_permissions.grantee`.
    */
  var accesses: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The AWS user or group that you want to have access to thumbnail files.
    */
  var grantee: js.UndefOr[Input[String]] = js.native
  /**
    * Specify the type of value that appears in the `thumbnail_config_permissions.grantee` object.
    */
  var granteeType: js.UndefOr[Input[String]] = js.native
}

object PipelineThumbnailConfigPermission {
  @scala.inline
  def apply(
    accesses: Input[js.Array[Input[String]]] = null,
    grantee: Input[String] = null,
    granteeType: Input[String] = null
  ): PipelineThumbnailConfigPermission = {
    val __obj = js.Dynamic.literal()
    if (accesses != null) __obj.updateDynamic("accesses")(accesses.asInstanceOf[js.Any])
    if (grantee != null) __obj.updateDynamic("grantee")(grantee.asInstanceOf[js.Any])
    if (granteeType != null) __obj.updateDynamic("granteeType")(granteeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipelineThumbnailConfigPermission]
  }
}

