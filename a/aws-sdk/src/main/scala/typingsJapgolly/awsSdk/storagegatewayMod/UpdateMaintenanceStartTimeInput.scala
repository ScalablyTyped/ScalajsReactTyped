package typingsJapgolly.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateMaintenanceStartTimeInput extends js.Object {
  /**
    * The day of the month component of the maintenance start time represented as an ordinal number from 1 to 28, where 1 represents the first day of the month and 28 represents the last day of the month.  This value is only available for tape and volume gateways. 
    */
  var DayOfMonth: js.UndefOr[typingsJapgolly.awsSdk.storagegatewayMod.DayOfMonth] = js.native
  /**
    * The day of the week component of the maintenance start time week represented as an ordinal number from 0 to 6, where 0 represents Sunday and 6 Saturday.
    */
  var DayOfWeek: js.UndefOr[typingsJapgolly.awsSdk.storagegatewayMod.DayOfWeek] = js.native
  var GatewayARN: typingsJapgolly.awsSdk.storagegatewayMod.GatewayARN = js.native
  /**
    * The hour component of the maintenance start time represented as hh, where hh is the hour (00 to 23). The hour of the day is in the time zone of the gateway.
    */
  var HourOfDay: typingsJapgolly.awsSdk.storagegatewayMod.HourOfDay = js.native
  /**
    * The minute component of the maintenance start time represented as mm, where mm is the minute (00 to 59). The minute of the hour is in the time zone of the gateway.
    */
  var MinuteOfHour: typingsJapgolly.awsSdk.storagegatewayMod.MinuteOfHour = js.native
}

object UpdateMaintenanceStartTimeInput {
  @scala.inline
  def apply(
    GatewayARN: GatewayARN,
    HourOfDay: HourOfDay,
    MinuteOfHour: MinuteOfHour,
    DayOfMonth: Int | Double = null,
    DayOfWeek: Int | Double = null
  ): UpdateMaintenanceStartTimeInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN.asInstanceOf[js.Any], HourOfDay = HourOfDay.asInstanceOf[js.Any], MinuteOfHour = MinuteOfHour.asInstanceOf[js.Any])
    if (DayOfMonth != null) __obj.updateDynamic("DayOfMonth")(DayOfMonth.asInstanceOf[js.Any])
    if (DayOfWeek != null) __obj.updateDynamic("DayOfWeek")(DayOfWeek.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMaintenanceStartTimeInput]
  }
}

