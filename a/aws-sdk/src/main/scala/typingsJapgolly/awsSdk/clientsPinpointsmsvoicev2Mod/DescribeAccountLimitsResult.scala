package typingsJapgolly.awsSdk.clientsPinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAccountLimitsResult extends StObject {
  
  /**
    * An array of AccountLimit objects that show the current spend limits.
    */
  var AccountLimits: js.UndefOr[AccountLimitList] = js.undefined
  
  /**
    * The token to be used for the next set of paginated results. If this field is empty then there are no more results.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsPinpointsmsvoicev2Mod.NextToken] = js.undefined
}
object DescribeAccountLimitsResult {
  
  inline def apply(): DescribeAccountLimitsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAccountLimitsResult]
  }
  
  extension [Self <: DescribeAccountLimitsResult](x: Self) {
    
    inline def setAccountLimits(value: AccountLimitList): Self = StObject.set(x, "AccountLimits", value.asInstanceOf[js.Any])
    
    inline def setAccountLimitsUndefined: Self = StObject.set(x, "AccountLimits", js.undefined)
    
    inline def setAccountLimitsVarargs(value: AccountLimit*): Self = StObject.set(x, "AccountLimits", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
