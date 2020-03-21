package typingsJapgolly.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendQuota extends js.Object {
  /**
    * The maximum number of emails that you can send in the current AWS Region over a 24-hour period. This value is also called your sending quota.
    */
  var Max24HourSend: js.UndefOr[typingsJapgolly.awsSdk.sesv2Mod.Max24HourSend] = js.native
  /**
    * The maximum number of emails that you can send per second in the current AWS Region. This value is also called your maximum sending rate or your maximum TPS (transactions per second) rate.
    */
  var MaxSendRate: js.UndefOr[typingsJapgolly.awsSdk.sesv2Mod.MaxSendRate] = js.native
  /**
    * The number of emails sent from your Amazon SES account in the current AWS Region over the past 24 hours.
    */
  var SentLast24Hours: js.UndefOr[typingsJapgolly.awsSdk.sesv2Mod.SentLast24Hours] = js.native
}

object SendQuota {
  @scala.inline
  def apply(
    Max24HourSend: Int | Double = null,
    MaxSendRate: Int | Double = null,
    SentLast24Hours: Int | Double = null
  ): SendQuota = {
    val __obj = js.Dynamic.literal()
    if (Max24HourSend != null) __obj.updateDynamic("Max24HourSend")(Max24HourSend.asInstanceOf[js.Any])
    if (MaxSendRate != null) __obj.updateDynamic("MaxSendRate")(MaxSendRate.asInstanceOf[js.Any])
    if (SentLast24Hours != null) __obj.updateDynamic("SentLast24Hours")(SentLast24Hours.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendQuota]
  }
}

