package typingsJapgolly.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeResourceRecordSetsResponse extends js.Object {
  /**
    * A complex type that contains information about changes made to your hosted zone. This element contains an ID that you use when performing a GetChange action to get detailed information about the change.
    */
  var ChangeInfo: typingsJapgolly.awsSdk.route53Mod.ChangeInfo = js.native
}

object ChangeResourceRecordSetsResponse {
  @scala.inline
  def apply(ChangeInfo: ChangeInfo): ChangeResourceRecordSetsResponse = {
    val __obj = js.Dynamic.literal(ChangeInfo = ChangeInfo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChangeResourceRecordSetsResponse]
  }
}

