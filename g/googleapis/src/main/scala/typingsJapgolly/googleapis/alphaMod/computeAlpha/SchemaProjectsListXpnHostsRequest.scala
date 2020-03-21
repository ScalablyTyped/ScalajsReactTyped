package typingsJapgolly.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaProjectsListXpnHostsRequest extends js.Object {
  /**
    * Optional organization ID managed by Cloud Resource Manager, for which to
    * list shared VPC host projects. If not specified, the organization will be
    * inferred from the project.
    */
  var organization: js.UndefOr[String] = js.native
}

object SchemaProjectsListXpnHostsRequest {
  @scala.inline
  def apply(organization: String = null): SchemaProjectsListXpnHostsRequest = {
    val __obj = js.Dynamic.literal()
    if (organization != null) __obj.updateDynamic("organization")(organization.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaProjectsListXpnHostsRequest]
  }
}

