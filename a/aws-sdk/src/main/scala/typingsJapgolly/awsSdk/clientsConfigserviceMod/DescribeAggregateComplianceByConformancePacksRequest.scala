package typingsJapgolly.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAggregateComplianceByConformancePacksRequest extends StObject {
  
  /**
    * The name of the configuration aggregator.
    */
  var ConfigurationAggregatorName: typingsJapgolly.awsSdk.clientsConfigserviceMod.ConfigurationAggregatorName
  
  /**
    * Filters the result by AggregateConformancePackComplianceFilters object.
    */
  var Filters: js.UndefOr[AggregateConformancePackComplianceFilters] = js.undefined
  
  /**
    * The maximum number of conformance packs compliance details returned on each page. The default is maximum. If you specify 0, Config uses the default. 
    */
  var Limit: js.UndefOr[typingsJapgolly.awsSdk.clientsConfigserviceMod.Limit] = js.undefined
  
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsConfigserviceMod.NextToken] = js.undefined
}
object DescribeAggregateComplianceByConformancePacksRequest {
  
  inline def apply(ConfigurationAggregatorName: ConfigurationAggregatorName): DescribeAggregateComplianceByConformancePacksRequest = {
    val __obj = js.Dynamic.literal(ConfigurationAggregatorName = ConfigurationAggregatorName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAggregateComplianceByConformancePacksRequest]
  }
  
  extension [Self <: DescribeAggregateComplianceByConformancePacksRequest](x: Self) {
    
    inline def setConfigurationAggregatorName(value: ConfigurationAggregatorName): Self = StObject.set(x, "ConfigurationAggregatorName", value.asInstanceOf[js.Any])
    
    inline def setFilters(value: AggregateConformancePackComplianceFilters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setLimit(value: Limit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
