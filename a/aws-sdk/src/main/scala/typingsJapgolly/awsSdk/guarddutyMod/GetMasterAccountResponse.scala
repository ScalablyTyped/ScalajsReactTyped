package typingsJapgolly.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMasterAccountResponse extends js.Object {
  /**
    * Master account details.
    */
  var Master: typingsJapgolly.awsSdk.guarddutyMod.Master = js.native
}

object GetMasterAccountResponse {
  @scala.inline
  def apply(Master: Master): GetMasterAccountResponse = {
    val __obj = js.Dynamic.literal(Master = Master.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetMasterAccountResponse]
  }
}

