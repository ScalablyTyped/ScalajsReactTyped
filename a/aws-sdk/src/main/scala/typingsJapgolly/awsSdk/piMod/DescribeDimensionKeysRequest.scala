package typingsJapgolly.awsSdk.piMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDimensionKeysRequest extends js.Object {
  /**
    * The date and time specifying the end of the requested time series data. The value specified is exclusive - data points less than (but not equal to) EndTime will be returned. The value for EndTime must be later than the value for StartTime.
    */
  var EndTime: js.Date = js.native
  /**
    * One or more filters to apply in the request. Restrictions:   Any number of filters by the same dimension, as specified in the GroupBy or Partition parameters.   A single filter for any other dimension in this dimension group.  
    */
  var Filter: js.UndefOr[MetricQueryFilterMap] = js.native
  /**
    * A specification for how to aggregate the data points from a query result. You must specify a valid dimension group. Performance Insights will return all of the dimensions within that group, unless you provide the names of specific dimensions within that group. You can also request that Performance Insights return a limited number of values for a dimension.
    */
  var GroupBy: DimensionGroup = js.native
  /**
    * An immutable, AWS Region-unique identifier for a data source. Performance Insights gathers metrics from this data source. To use an Amazon RDS instance as a data source, you specify its DbiResourceId value - for example: db-FAIHNTYBKTGAUSUZQYPDS2GW4A 
    */
  var Identifier: String = js.native
  /**
    * The maximum number of items to return in the response. If more items exist than the specified MaxRecords value, a pagination token is included in the response so that the remaining results can be retrieved. 
    */
  var MaxResults: js.UndefOr[typingsJapgolly.awsSdk.piMod.MaxResults] = js.native
  /**
    * The name of a Performance Insights metric to be measured. Valid values for Metric are:    db.load.avg - a scaled representation of the number of active sessions for the database engine.    db.sampledload.avg - the raw number of active sessions for the database engine.  
    */
  var Metric: String = js.native
  /**
    * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the token, up to the value specified by MaxRecords.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * For each dimension specified in GroupBy, specify a secondary dimension to further subdivide the partition keys in the response.
    */
  var PartitionBy: js.UndefOr[DimensionGroup] = js.native
  /**
    * The granularity, in seconds, of the data points returned from Performance Insights. A period can be as short as one second, or as long as one day (86400 seconds). Valid values are:    1 (one second)    60 (one minute)    300 (five minutes)    3600 (one hour)    86400 (twenty-four hours)   If you don't specify PeriodInSeconds, then Performance Insights will choose a value for you, with a goal of returning roughly 100-200 data points in the response.
    */
  var PeriodInSeconds: js.UndefOr[Integer] = js.native
  /**
    * The AWS service for which Performance Insights will return metrics. The only valid value for ServiceType is: RDS 
    */
  var ServiceType: typingsJapgolly.awsSdk.piMod.ServiceType = js.native
  /**
    * The date and time specifying the beginning of the requested time series data. You can't specify a StartTime that's earlier than 7 days ago. The value specified is inclusive - data points equal to or greater than StartTime will be returned. The value for StartTime must be earlier than the value for EndTime.
    */
  var StartTime: js.Date = js.native
}

object DescribeDimensionKeysRequest {
  @scala.inline
  def apply(
    EndTime: js.Date,
    GroupBy: DimensionGroup,
    Identifier: String,
    Metric: String,
    ServiceType: ServiceType,
    StartTime: js.Date,
    Filter: MetricQueryFilterMap = null,
    MaxResults: Int | scala.Double = null,
    NextToken: String = null,
    PartitionBy: DimensionGroup = null,
    PeriodInSeconds: Int | scala.Double = null
  ): DescribeDimensionKeysRequest = {
    val __obj = js.Dynamic.literal(EndTime = EndTime.asInstanceOf[js.Any], GroupBy = GroupBy.asInstanceOf[js.Any], Identifier = Identifier.asInstanceOf[js.Any], Metric = Metric.asInstanceOf[js.Any], ServiceType = ServiceType.asInstanceOf[js.Any], StartTime = StartTime.asInstanceOf[js.Any])
    if (Filter != null) __obj.updateDynamic("Filter")(Filter.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (PartitionBy != null) __obj.updateDynamic("PartitionBy")(PartitionBy.asInstanceOf[js.Any])
    if (PeriodInSeconds != null) __obj.updateDynamic("PeriodInSeconds")(PeriodInSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDimensionKeysRequest]
  }
}

