package typingsJapgolly.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeStandardsControlsRequest extends StObject {
  
  /**
    * The maximum number of security standard controls to return.
    */
  var MaxResults: js.UndefOr[typingsJapgolly.awsSdk.clientsSecurityhubMod.MaxResults] = js.undefined
  
  /**
    * The token that is required for pagination. On your first call to the DescribeStandardsControls operation, set the value of this parameter to NULL. For subsequent calls to the operation, to continue listing data, set the value of this parameter to the value returned from the previous response.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsSecurityhubMod.NextToken] = js.undefined
  
  /**
    * The ARN of a resource that represents your subscription to a supported standard. To get the subscription ARNs of the standards you have enabled, use the GetEnabledStandards operation.
    */
  var StandardsSubscriptionArn: NonEmptyString
}
object DescribeStandardsControlsRequest {
  
  inline def apply(StandardsSubscriptionArn: NonEmptyString): DescribeStandardsControlsRequest = {
    val __obj = js.Dynamic.literal(StandardsSubscriptionArn = StandardsSubscriptionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStandardsControlsRequest]
  }
  
  extension [Self <: DescribeStandardsControlsRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStandardsSubscriptionArn(value: NonEmptyString): Self = StObject.set(x, "StandardsSubscriptionArn", value.asInstanceOf[js.Any])
  }
}
