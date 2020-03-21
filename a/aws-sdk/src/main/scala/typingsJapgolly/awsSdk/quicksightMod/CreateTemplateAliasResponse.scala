package typingsJapgolly.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTemplateAliasResponse extends js.Object {
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.native
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
  /**
    * Information about the template alias.
    */
  var TemplateAlias: js.UndefOr[typingsJapgolly.awsSdk.quicksightMod.TemplateAlias] = js.native
}

object CreateTemplateAliasResponse {
  @scala.inline
  def apply(RequestId: String = null, Status: Int | scala.Double = null, TemplateAlias: TemplateAlias = null): CreateTemplateAliasResponse = {
    val __obj = js.Dynamic.literal()
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (TemplateAlias != null) __obj.updateDynamic("TemplateAlias")(TemplateAlias.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTemplateAliasResponse]
  }
}

