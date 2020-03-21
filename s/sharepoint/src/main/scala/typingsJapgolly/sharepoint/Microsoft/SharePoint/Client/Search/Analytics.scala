package typingsJapgolly.sharepoint.Microsoft.SharePoint.Client.Search

import typingsJapgolly.sharepoint.SP.ClientObject
import typingsJapgolly.sharepoint.SP.Guid
import typingsJapgolly.sharepoint.SP.ListItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**Located in sp.search.apps.js*/
@JSGlobal("Microsoft.SharePoint.Client.Search.Analytics")
@js.native
object Analytics extends js.Object {
  @js.native
  class AnalyticsItemData () extends ClientObject {
    def getHitCountForDay(day: js.Date): Double = js.native
    def getHitCountForMonth(day: js.Date): Double = js.native
    def getUniqueUsersCountForDay(day: js.Date): Double = js.native
    def getUniqueUsersCountForMonth(day: js.Date): Double = js.native
    def get_lastProcessingTime(): js.Date = js.native
    def get_totalHits(): Double = js.native
    def get_totalUniqueUsers(): Double = js.native
  }
  
  @js.native
  class UsageAnalytics () extends ClientObject {
    def deleteCustomEventUsageData(appEventTypeId: Guid): Unit = js.native
    def deleteStandardEventUsageData(eventType: Double): Unit = js.native
    def getAnalyticsItemData[T](eventType: Double, listItem: ListItem[T]): AnalyticsItemData = js.native
    def getAnalyticsItemDataForApplicationEventType[T](appEventType: Guid, listItem: ListItem[T]): AnalyticsItemData = js.native
  }
  
}

