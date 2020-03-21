package typingsJapgolly.awsSdkClientDynamodbBrowser.typesPointInTimeRecoveryDescriptionMod

import typingsJapgolly.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.DISABLED
import typingsJapgolly.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ENABLED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledPointInTimeRecoveryDescription extends PointInTimeRecoveryDescription {
  /**
    * <p>Specifies the earliest point in time you can restore your table to. It You can restore your table to any point in time during the last 35 days. </p>
    */
  @JSName("EarliestRestorableDateTime")
  var EarliestRestorableDateTime_UnmarshalledPointInTimeRecoveryDescription: js.UndefOr[js.Date] = js.undefined
  /**
    * <p> <code>LatestRestorableDateTime</code> is typically 5 minutes before the current time. </p>
    */
  @JSName("LatestRestorableDateTime")
  var LatestRestorableDateTime_UnmarshalledPointInTimeRecoveryDescription: js.UndefOr[js.Date] = js.undefined
}

object UnmarshalledPointInTimeRecoveryDescription {
  @scala.inline
  def apply(
    EarliestRestorableDateTime: js.Date = null,
    LatestRestorableDateTime: js.Date = null,
    PointInTimeRecoveryStatus: ENABLED | DISABLED | String = null
  ): UnmarshalledPointInTimeRecoveryDescription = {
    val __obj = js.Dynamic.literal()
    if (EarliestRestorableDateTime != null) __obj.updateDynamic("EarliestRestorableDateTime")(EarliestRestorableDateTime.asInstanceOf[js.Any])
    if (LatestRestorableDateTime != null) __obj.updateDynamic("LatestRestorableDateTime")(LatestRestorableDateTime.asInstanceOf[js.Any])
    if (PointInTimeRecoveryStatus != null) __obj.updateDynamic("PointInTimeRecoveryStatus")(PointInTimeRecoveryStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledPointInTimeRecoveryDescription]
  }
}

