package typingsJapgolly.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDBProxyTargetsRequest extends js.Object {
  /**
    * The identifier of the DBProxyTarget to describe.
    */
  var DBProxyName: String = js.native
  /**
    * This parameter is not currently supported.
    */
  var Filters: js.UndefOr[FilterList] = js.native
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    *  The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that the remaining results can be retrieved.  Default: 100 Constraints: Minimum 20, maximum 100.
    */
  var MaxRecords: js.UndefOr[typingsJapgolly.awsSdk.rdsMod.MaxRecords] = js.native
  /**
    * The identifier of the DBProxyTargetGroup to describe.
    */
  var TargetGroupName: js.UndefOr[String] = js.native
}

object DescribeDBProxyTargetsRequest {
  @scala.inline
  def apply(
    DBProxyName: String,
    Filters: FilterList = null,
    Marker: String = null,
    MaxRecords: Int | scala.Double = null,
    TargetGroupName: String = null
  ): DescribeDBProxyTargetsRequest = {
    val __obj = js.Dynamic.literal(DBProxyName = DBProxyName.asInstanceOf[js.Any])
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (MaxRecords != null) __obj.updateDynamic("MaxRecords")(MaxRecords.asInstanceOf[js.Any])
    if (TargetGroupName != null) __obj.updateDynamic("TargetGroupName")(TargetGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDBProxyTargetsRequest]
  }
}

