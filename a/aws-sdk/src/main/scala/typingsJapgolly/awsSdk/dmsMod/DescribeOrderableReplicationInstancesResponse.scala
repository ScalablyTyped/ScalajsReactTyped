package typingsJapgolly.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeOrderableReplicationInstancesResponse extends js.Object {
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * The order-able replication instances available.
    */
  var OrderableReplicationInstances: js.UndefOr[OrderableReplicationInstanceList] = js.native
}

object DescribeOrderableReplicationInstancesResponse {
  @scala.inline
  def apply(Marker: String = null, OrderableReplicationInstances: OrderableReplicationInstanceList = null): DescribeOrderableReplicationInstancesResponse = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (OrderableReplicationInstances != null) __obj.updateDynamic("OrderableReplicationInstances")(OrderableReplicationInstances.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeOrderableReplicationInstancesResponse]
  }
}

