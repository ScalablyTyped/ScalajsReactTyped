package typingsJapgolly.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTemplateResponse extends js.Object {
  /**
    * The ARN for the template.
    */
  var Arn: js.UndefOr[typingsJapgolly.awsSdk.quicksightMod.Arn] = js.native
  /**
    * The template creation status.
    */
  var CreationStatus: js.UndefOr[ResourceStatus] = js.native
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.native
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
  /**
    * The ID of the template.
    */
  var TemplateId: js.UndefOr[RestrictiveResourceId] = js.native
  /**
    * The ARN for the template, including the version information of the first version.
    */
  var VersionArn: js.UndefOr[Arn] = js.native
}

object CreateTemplateResponse {
  @scala.inline
  def apply(
    Arn: Arn = null,
    CreationStatus: ResourceStatus = null,
    RequestId: String = null,
    Status: Int | scala.Double = null,
    TemplateId: RestrictiveResourceId = null,
    VersionArn: Arn = null
  ): CreateTemplateResponse = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (CreationStatus != null) __obj.updateDynamic("CreationStatus")(CreationStatus.asInstanceOf[js.Any])
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (TemplateId != null) __obj.updateDynamic("TemplateId")(TemplateId.asInstanceOf[js.Any])
    if (VersionArn != null) __obj.updateDynamic("VersionArn")(VersionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTemplateResponse]
  }
}

