package typingsJapgolly.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSavingsPlansUtilizationDetailsRequest extends StObject {
  
  /**
    * The data type.
    */
  var DataType: js.UndefOr[SavingsPlansDataTypes] = js.undefined
  
  /**
    * Filters Savings Plans utilization coverage data for active Savings Plans dimensions. You can filter data with the following dimensions:    LINKED_ACCOUNT     SAVINGS_PLAN_ARN     REGION     PAYMENT_OPTION     INSTANCE_TYPE_FAMILY     GetSavingsPlansUtilizationDetails uses the same Expression object as the other operations, but only AND is supported among each dimension.
    */
  var Filter: js.UndefOr[Expression] = js.undefined
  
  /**
    * The number of items to be returned in a response. The default is 20, with a minimum value of 1.
    */
  var MaxResults: js.UndefOr[typingsJapgolly.awsSdk.clientsCostexplorerMod.MaxResults] = js.undefined
  
  /**
    * The token to retrieve the next set of results. Amazon Web Services provides the token when the response from a previous call has more results than the maximum page size.
    */
  var NextToken: js.UndefOr[NextPageToken] = js.undefined
  
  /**
    * The value that you want to sort the data by. The following values are supported for Key:    UtilizationPercentage     TotalCommitment     UsedCommitment     UnusedCommitment     NetSavings     AmortizedRecurringCommitment     AmortizedUpfrontCommitment    The supported values for SortOrder are ASCENDING and DESCENDING.
    */
  var SortBy: js.UndefOr[SortDefinition] = js.undefined
  
  /**
    * The time period that you want the usage and costs for. The Start date must be within 13 months. The End date must be after the Start date, and before the current date. Future dates can't be used as an End date.
    */
  var TimePeriod: DateInterval
}
object GetSavingsPlansUtilizationDetailsRequest {
  
  inline def apply(TimePeriod: DateInterval): GetSavingsPlansUtilizationDetailsRequest = {
    val __obj = js.Dynamic.literal(TimePeriod = TimePeriod.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSavingsPlansUtilizationDetailsRequest]
  }
  
  extension [Self <: GetSavingsPlansUtilizationDetailsRequest](x: Self) {
    
    inline def setDataType(value: SavingsPlansDataTypes): Self = StObject.set(x, "DataType", value.asInstanceOf[js.Any])
    
    inline def setDataTypeUndefined: Self = StObject.set(x, "DataType", js.undefined)
    
    inline def setDataTypeVarargs(value: SavingsPlansDataType*): Self = StObject.set(x, "DataType", js.Array(value*))
    
    inline def setFilter(value: Expression): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextPageToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSortBy(value: SortDefinition): Self = StObject.set(x, "SortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByUndefined: Self = StObject.set(x, "SortBy", js.undefined)
    
    inline def setTimePeriod(value: DateInterval): Self = StObject.set(x, "TimePeriod", value.asInstanceOf[js.Any])
  }
}
