package typingsJapgolly.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDomainRequest extends js.Object {
  /**
    * The domain ID.
    */
  var DomainId: typingsJapgolly.awsSdk.sagemakerMod.DomainId = js.native
}

object DescribeDomainRequest {
  @scala.inline
  def apply(DomainId: DomainId): DescribeDomainRequest = {
    val __obj = js.Dynamic.literal(DomainId = DomainId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeDomainRequest]
  }
}

