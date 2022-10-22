package typingsJapgolly.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListResolverQueryLogConfigAssociationsRequest extends StObject {
  
  /**
    * An optional specification to return a subset of query logging associations.  If you submit a second or subsequent ListResolverQueryLogConfigAssociations request and specify the NextToken parameter, you must use the same values for Filters, if any, as in the previous request. 
    */
  var Filters: js.UndefOr[typingsJapgolly.awsSdk.clientsRoute53resolverMod.Filters] = js.undefined
  
  /**
    * The maximum number of query logging associations that you want to return in the response to a ListResolverQueryLogConfigAssociations request. If you don't specify a value for MaxResults, Resolver returns up to 100 query logging associations. 
    */
  var MaxResults: js.UndefOr[typingsJapgolly.awsSdk.clientsRoute53resolverMod.MaxResults] = js.undefined
  
  /**
    * For the first ListResolverQueryLogConfigAssociations request, omit this value. If there are more than MaxResults query logging associations that match the values that you specify for Filters, you can submit another ListResolverQueryLogConfigAssociations request to get the next group of associations. In the next request, specify the value of NextToken from the previous response. 
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsRoute53resolverMod.NextToken] = js.undefined
  
  /**
    * The element that you want Resolver to sort query logging associations by.   If you submit a second or subsequent ListResolverQueryLogConfigAssociations request and specify the NextToken parameter, you must use the same value for SortBy, if any, as in the previous request.  Valid values include the following elements:    CreationTime: The ID of the query logging association.    Error: If the value of Status is FAILED, the value of Error indicates the cause:     DESTINATION_NOT_FOUND: The specified destination (for example, an Amazon S3 bucket) was deleted.    ACCESS_DENIED: Permissions don't allow sending logs to the destination.   If Status is a value other than FAILED, ERROR is null.    Id: The ID of the query logging association    ResolverQueryLogConfigId: The ID of the query logging configuration    ResourceId: The ID of the VPC that is associated with the query logging configuration    Status: The current status of the configuration. Valid values include the following:    CREATING: Resolver is creating an association between an Amazon VPC and a query logging configuration.    CREATED: The association between an Amazon VPC and a query logging configuration was successfully created. Resolver is logging queries that originate in the specified VPC.    DELETING: Resolver is deleting this query logging association.    FAILED: Resolver either couldn't create or couldn't delete the query logging association. Here are two common causes:   The specified destination (for example, an Amazon S3 bucket) was deleted.   Permissions don't allow sending logs to the destination.      
    */
  var SortBy: js.UndefOr[SortByKey] = js.undefined
  
  /**
    * If you specified a value for SortBy, the order that you want query logging associations to be listed in, ASCENDING or DESCENDING.  If you submit a second or subsequent ListResolverQueryLogConfigAssociations request and specify the NextToken parameter, you must use the same value for SortOrder, if any, as in the previous request. 
    */
  var SortOrder: js.UndefOr[typingsJapgolly.awsSdk.clientsRoute53resolverMod.SortOrder] = js.undefined
}
object ListResolverQueryLogConfigAssociationsRequest {
  
  inline def apply(): ListResolverQueryLogConfigAssociationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResolverQueryLogConfigAssociationsRequest]
  }
  
  extension [Self <: ListResolverQueryLogConfigAssociationsRequest](x: Self) {
    
    inline def setFilters(value: Filters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSortBy(value: SortByKey): Self = StObject.set(x, "SortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByUndefined: Self = StObject.set(x, "SortBy", js.undefined)
    
    inline def setSortOrder(value: SortOrder): Self = StObject.set(x, "SortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "SortOrder", js.undefined)
  }
}
