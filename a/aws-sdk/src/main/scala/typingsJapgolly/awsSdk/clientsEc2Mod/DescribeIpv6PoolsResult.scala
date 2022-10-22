package typingsJapgolly.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeIpv6PoolsResult extends StObject {
  
  /**
    * Information about the IPv6 address pools.
    */
  var Ipv6Pools: js.UndefOr[Ipv6PoolSet] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsEc2Mod.NextToken] = js.undefined
}
object DescribeIpv6PoolsResult {
  
  inline def apply(): DescribeIpv6PoolsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeIpv6PoolsResult]
  }
  
  extension [Self <: DescribeIpv6PoolsResult](x: Self) {
    
    inline def setIpv6Pools(value: Ipv6PoolSet): Self = StObject.set(x, "Ipv6Pools", value.asInstanceOf[js.Any])
    
    inline def setIpv6PoolsUndefined: Self = StObject.set(x, "Ipv6Pools", js.undefined)
    
    inline def setIpv6PoolsVarargs(value: Ipv6Pool*): Self = StObject.set(x, "Ipv6Pools", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
