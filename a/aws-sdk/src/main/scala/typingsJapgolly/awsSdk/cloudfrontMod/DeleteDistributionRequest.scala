package typingsJapgolly.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDistributionRequest extends js.Object {
  /**
    * The distribution ID. 
    */
  var Id: String = js.native
  /**
    * The value of the ETag header that you received when you disabled the distribution. For example: E2QWRUHAPOMQZL. 
    */
  var IfMatch: js.UndefOr[String] = js.native
}

object DeleteDistributionRequest {
  @scala.inline
  def apply(Id: String, IfMatch: String = null): DeleteDistributionRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    if (IfMatch != null) __obj.updateDynamic("IfMatch")(IfMatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDistributionRequest]
  }
}

