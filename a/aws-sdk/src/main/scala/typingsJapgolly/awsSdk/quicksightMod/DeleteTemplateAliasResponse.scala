package typingsJapgolly.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTemplateAliasResponse extends js.Object {
  /**
    * The name for the template alias.
    */
  var AliasName: js.UndefOr[typingsJapgolly.awsSdk.quicksightMod.AliasName] = js.native
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var Arn: js.UndefOr[typingsJapgolly.awsSdk.quicksightMod.Arn] = js.native
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.native
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
  /**
    * An ID for the template associated with the deletion.
    */
  var TemplateId: js.UndefOr[RestrictiveResourceId] = js.native
}

object DeleteTemplateAliasResponse {
  @scala.inline
  def apply(
    AliasName: AliasName = null,
    Arn: Arn = null,
    RequestId: String = null,
    Status: Int | scala.Double = null,
    TemplateId: RestrictiveResourceId = null
  ): DeleteTemplateAliasResponse = {
    val __obj = js.Dynamic.literal()
    if (AliasName != null) __obj.updateDynamic("AliasName")(AliasName.asInstanceOf[js.Any])
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (TemplateId != null) __obj.updateDynamic("TemplateId")(TemplateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTemplateAliasResponse]
  }
}

