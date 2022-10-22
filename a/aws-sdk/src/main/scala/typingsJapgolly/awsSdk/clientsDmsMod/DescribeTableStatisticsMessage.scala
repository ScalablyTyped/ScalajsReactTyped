package typingsJapgolly.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTableStatisticsMessage extends StObject {
  
  /**
    * Filters applied to table statistics. Valid filter names: schema-name | table-name | table-state A combination of filters creates an AND condition where each record matches all specified filters.
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    *  The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that the remaining results can be retrieved.  Default: 100 Constraints: Minimum 20, maximum 500.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the replication task.
    */
  var ReplicationTaskArn: String
}
object DescribeTableStatisticsMessage {
  
  inline def apply(ReplicationTaskArn: String): DescribeTableStatisticsMessage = {
    val __obj = js.Dynamic.literal(ReplicationTaskArn = ReplicationTaskArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTableStatisticsMessage]
  }
  
  extension [Self <: DescribeTableStatisticsMessage](x: Self) {
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setMaxRecords(value: IntegerOptional): Self = StObject.set(x, "MaxRecords", value.asInstanceOf[js.Any])
    
    inline def setMaxRecordsUndefined: Self = StObject.set(x, "MaxRecords", js.undefined)
    
    inline def setReplicationTaskArn(value: String): Self = StObject.set(x, "ReplicationTaskArn", value.asInstanceOf[js.Any])
  }
}
