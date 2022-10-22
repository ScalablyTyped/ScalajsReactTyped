package typingsJapgolly.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeIpamPoolsRequest extends StObject {
  
  /**
    * A check for whether you have the required permissions for the action without actually making the request and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * One or more filters for the request. For more information about filtering, see Filtering CLI output.
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * The IDs of the IPAM pools you would like information on.
    */
  var IpamPoolIds: js.UndefOr[ValueStringList] = js.undefined
  
  /**
    * The maximum number of results to return in the request.
    */
  var MaxResults: js.UndefOr[IpamMaxResults] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsEc2Mod.NextToken] = js.undefined
}
object DescribeIpamPoolsRequest {
  
  inline def apply(): DescribeIpamPoolsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeIpamPoolsRequest]
  }
  
  extension [Self <: DescribeIpamPoolsRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setIpamPoolIds(value: ValueStringList): Self = StObject.set(x, "IpamPoolIds", value.asInstanceOf[js.Any])
    
    inline def setIpamPoolIdsUndefined: Self = StObject.set(x, "IpamPoolIds", js.undefined)
    
    inline def setIpamPoolIdsVarargs(value: String*): Self = StObject.set(x, "IpamPoolIds", js.Array(value*))
    
    inline def setMaxResults(value: IpamMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
