package typingsJapgolly.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCompatibleElasticsearchVersionsRequest extends js.Object {
  var DomainName: js.UndefOr[typingsJapgolly.awsSdk.esMod.DomainName] = js.native
}

object GetCompatibleElasticsearchVersionsRequest {
  @scala.inline
  def apply(DomainName: DomainName = null): GetCompatibleElasticsearchVersionsRequest = {
    val __obj = js.Dynamic.literal()
    if (DomainName != null) __obj.updateDynamic("DomainName")(DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCompatibleElasticsearchVersionsRequest]
  }
}

