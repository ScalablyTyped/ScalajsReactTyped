package typingsJapgolly.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeActivationsResult extends StObject {
  
  /**
    * A list of activations for your Amazon Web Services account.
    */
  var ActivationList: js.UndefOr[typingsJapgolly.awsSdk.clientsSsmMod.ActivationList] = js.undefined
  
  /**
    * The token for the next set of items to return. Use this token to get the next set of results. 
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsSsmMod.NextToken] = js.undefined
}
object DescribeActivationsResult {
  
  inline def apply(): DescribeActivationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeActivationsResult]
  }
  
  extension [Self <: DescribeActivationsResult](x: Self) {
    
    inline def setActivationList(value: ActivationList): Self = StObject.set(x, "ActivationList", value.asInstanceOf[js.Any])
    
    inline def setActivationListUndefined: Self = StObject.set(x, "ActivationList", js.undefined)
    
    inline def setActivationListVarargs(value: Activation*): Self = StObject.set(x, "ActivationList", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
