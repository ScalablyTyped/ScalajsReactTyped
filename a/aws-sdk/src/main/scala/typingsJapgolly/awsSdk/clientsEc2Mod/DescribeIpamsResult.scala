package typingsJapgolly.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeIpamsResult extends StObject {
  
  /**
    * Information about the IPAMs.
    */
  var Ipams: js.UndefOr[IpamSet] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsEc2Mod.NextToken] = js.undefined
}
object DescribeIpamsResult {
  
  inline def apply(): DescribeIpamsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeIpamsResult]
  }
  
  extension [Self <: DescribeIpamsResult](x: Self) {
    
    inline def setIpams(value: IpamSet): Self = StObject.set(x, "Ipams", value.asInstanceOf[js.Any])
    
    inline def setIpamsUndefined: Self = StObject.set(x, "Ipams", js.undefined)
    
    inline def setIpamsVarargs(value: Ipam*): Self = StObject.set(x, "Ipams", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
