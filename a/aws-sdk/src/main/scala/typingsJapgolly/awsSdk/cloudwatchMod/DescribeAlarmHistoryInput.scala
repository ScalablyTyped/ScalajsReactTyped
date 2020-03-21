package typingsJapgolly.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAlarmHistoryInput extends js.Object {
  /**
    * The name of the alarm.
    */
  var AlarmName: js.UndefOr[typingsJapgolly.awsSdk.cloudwatchMod.AlarmName] = js.native
  /**
    * The ending date to retrieve alarm history.
    */
  var EndDate: js.UndefOr[js.Date] = js.native
  /**
    * The type of alarm histories to retrieve.
    */
  var HistoryItemType: js.UndefOr[typingsJapgolly.awsSdk.cloudwatchMod.HistoryItemType] = js.native
  /**
    * The maximum number of alarm history records to retrieve.
    */
  var MaxRecords: js.UndefOr[typingsJapgolly.awsSdk.cloudwatchMod.MaxRecords] = js.native
  /**
    * The token returned by a previous call to indicate that there is more data available.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.cloudwatchMod.NextToken] = js.native
  /**
    * The starting date to retrieve alarm history.
    */
  var StartDate: js.UndefOr[js.Date] = js.native
}

object DescribeAlarmHistoryInput {
  @scala.inline
  def apply(
    AlarmName: AlarmName = null,
    EndDate: js.Date = null,
    HistoryItemType: HistoryItemType = null,
    MaxRecords: Int | Double = null,
    NextToken: NextToken = null,
    StartDate: js.Date = null
  ): DescribeAlarmHistoryInput = {
    val __obj = js.Dynamic.literal()
    if (AlarmName != null) __obj.updateDynamic("AlarmName")(AlarmName.asInstanceOf[js.Any])
    if (EndDate != null) __obj.updateDynamic("EndDate")(EndDate.asInstanceOf[js.Any])
    if (HistoryItemType != null) __obj.updateDynamic("HistoryItemType")(HistoryItemType.asInstanceOf[js.Any])
    if (MaxRecords != null) __obj.updateDynamic("MaxRecords")(MaxRecords.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (StartDate != null) __obj.updateDynamic("StartDate")(StartDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAlarmHistoryInput]
  }
}

