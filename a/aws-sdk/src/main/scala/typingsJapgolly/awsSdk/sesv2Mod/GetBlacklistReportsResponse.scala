package typingsJapgolly.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBlacklistReportsResponse extends js.Object {
  /**
    * An object that contains information about a blacklist that one of your dedicated IP addresses appears on.
    */
  var BlacklistReport: typingsJapgolly.awsSdk.sesv2Mod.BlacklistReport = js.native
}

object GetBlacklistReportsResponse {
  @scala.inline
  def apply(BlacklistReport: BlacklistReport): GetBlacklistReportsResponse = {
    val __obj = js.Dynamic.literal(BlacklistReport = BlacklistReport.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetBlacklistReportsResponse]
  }
}

