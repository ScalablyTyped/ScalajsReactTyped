package typingsJapgolly.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEventsMessage extends js.Object {
  /**
    * The duration of the events to be listed.
    */
  var Duration: js.UndefOr[IntegerOptional] = js.native
  /**
    * The end time for the events to be listed.
    */
  var EndTime: js.UndefOr[js.Date] = js.native
  /**
    * A list of event categories for the source type that you've chosen.
    */
  var EventCategories: js.UndefOr[EventCategoriesList] = js.native
  /**
    * Filters applied to the action.
    */
  var Filters: js.UndefOr[FilterList] = js.native
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    *  The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that the remaining results can be retrieved.  Default: 100 Constraints: Minimum 20, maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.native
  /**
    *  The identifier of an event source.
    */
  var SourceIdentifier: js.UndefOr[String] = js.native
  /**
    * The type of AWS DMS resource that generates events. Valid values: replication-instance | replication-task
    */
  var SourceType: js.UndefOr[typingsJapgolly.awsSdk.dmsMod.SourceType] = js.native
  /**
    * The start time for the events to be listed.
    */
  var StartTime: js.UndefOr[js.Date] = js.native
}

object DescribeEventsMessage {
  @scala.inline
  def apply(
    Duration: Int | Double = null,
    EndTime: js.Date = null,
    EventCategories: EventCategoriesList = null,
    Filters: FilterList = null,
    Marker: String = null,
    MaxRecords: Int | Double = null,
    SourceIdentifier: String = null,
    SourceType: SourceType = null,
    StartTime: js.Date = null
  ): DescribeEventsMessage = {
    val __obj = js.Dynamic.literal()
    if (Duration != null) __obj.updateDynamic("Duration")(Duration.asInstanceOf[js.Any])
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime.asInstanceOf[js.Any])
    if (EventCategories != null) __obj.updateDynamic("EventCategories")(EventCategories.asInstanceOf[js.Any])
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (MaxRecords != null) __obj.updateDynamic("MaxRecords")(MaxRecords.asInstanceOf[js.Any])
    if (SourceIdentifier != null) __obj.updateDynamic("SourceIdentifier")(SourceIdentifier.asInstanceOf[js.Any])
    if (SourceType != null) __obj.updateDynamic("SourceType")(SourceType.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEventsMessage]
  }
}

