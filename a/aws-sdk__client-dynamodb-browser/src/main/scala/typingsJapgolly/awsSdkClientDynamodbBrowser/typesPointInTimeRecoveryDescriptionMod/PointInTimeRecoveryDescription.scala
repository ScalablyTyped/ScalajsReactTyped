package typingsJapgolly.awsSdkClientDynamodbBrowser.typesPointInTimeRecoveryDescriptionMod

import typingsJapgolly.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.DISABLED
import typingsJapgolly.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ENABLED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointInTimeRecoveryDescription extends js.Object {
  /**
    * <p>Specifies the earliest point in time you can restore your table to. It You can restore your table to any point in time during the last 35 days. </p>
    */
  var EarliestRestorableDateTime: js.UndefOr[js.Date | String | Double] = js.undefined
  /**
    * <p> <code>LatestRestorableDateTime</code> is typically 5 minutes before the current time. </p>
    */
  var LatestRestorableDateTime: js.UndefOr[js.Date | String | Double] = js.undefined
  /**
    * <p>The current state of point in time recovery:</p> <ul> <li> <p> <code>ENABLING</code> - Point in time recovery is being enabled.</p> </li> <li> <p> <code>ENABLED</code> - Point in time recovery is enabled.</p> </li> <li> <p> <code>DISABLED</code> - Point in time recovery is disabled.</p> </li> </ul>
    */
  var PointInTimeRecoveryStatus: js.UndefOr[ENABLED | DISABLED | String] = js.undefined
}

object PointInTimeRecoveryDescription {
  @scala.inline
  def apply(
    EarliestRestorableDateTime: js.Date | String | Double = null,
    LatestRestorableDateTime: js.Date | String | Double = null,
    PointInTimeRecoveryStatus: ENABLED | DISABLED | String = null
  ): PointInTimeRecoveryDescription = {
    val __obj = js.Dynamic.literal()
    if (EarliestRestorableDateTime != null) __obj.updateDynamic("EarliestRestorableDateTime")(EarliestRestorableDateTime.asInstanceOf[js.Any])
    if (LatestRestorableDateTime != null) __obj.updateDynamic("LatestRestorableDateTime")(LatestRestorableDateTime.asInstanceOf[js.Any])
    if (PointInTimeRecoveryStatus != null) __obj.updateDynamic("PointInTimeRecoveryStatus")(PointInTimeRecoveryStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointInTimeRecoveryDescription]
  }
}

