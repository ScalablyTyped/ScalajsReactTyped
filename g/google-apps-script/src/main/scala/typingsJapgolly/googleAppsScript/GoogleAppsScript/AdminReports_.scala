package typingsJapgolly.googleAppsScript.GoogleAppsScript

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminReports.Collection.ActivitiesCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminReports.Collection.ChannelsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminReports.Collection.CustomerUsageReportsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminReports.Collection.EntityUsageReportsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminReports.Collection.UserUsageReportCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminReports.Schema.Channel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminReports_ extends js.Object {
  var Activities: js.UndefOr[ActivitiesCollection] = js.undefined
  var Channels: js.UndefOr[ChannelsCollection] = js.undefined
  var CustomerUsageReports: js.UndefOr[CustomerUsageReportsCollection] = js.undefined
  var EntityUsageReports: js.UndefOr[EntityUsageReportsCollection] = js.undefined
  var UserUsageReport: js.UndefOr[UserUsageReportCollection] = js.undefined
  // Create a new instance of Channel
  def newChannel(): Channel
}

object AdminReports_ {
  @scala.inline
  def apply(
    newChannel: CallbackTo[Channel],
    Activities: ActivitiesCollection = null,
    Channels: ChannelsCollection = null,
    CustomerUsageReports: CustomerUsageReportsCollection = null,
    EntityUsageReports: EntityUsageReportsCollection = null,
    UserUsageReport: UserUsageReportCollection = null
  ): AdminReports_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("newChannel")(newChannel.toJsFn)
    if (Activities != null) __obj.updateDynamic("Activities")(Activities.asInstanceOf[js.Any])
    if (Channels != null) __obj.updateDynamic("Channels")(Channels.asInstanceOf[js.Any])
    if (CustomerUsageReports != null) __obj.updateDynamic("CustomerUsageReports")(CustomerUsageReports.asInstanceOf[js.Any])
    if (EntityUsageReports != null) __obj.updateDynamic("EntityUsageReports")(EntityUsageReports.asInstanceOf[js.Any])
    if (UserUsageReport != null) __obj.updateDynamic("UserUsageReport")(UserUsageReport.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminReports_]
  }
}

