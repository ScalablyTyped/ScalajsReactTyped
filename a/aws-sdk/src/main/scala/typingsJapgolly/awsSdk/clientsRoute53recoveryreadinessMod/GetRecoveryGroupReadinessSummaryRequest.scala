package typingsJapgolly.awsSdk.clientsRoute53recoveryreadinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRecoveryGroupReadinessSummaryRequest extends StObject {
  
  /**
    * The number of objects that you want to return with this call.
    */
  var MaxResults: js.UndefOr[typingsJapgolly.awsSdk.clientsRoute53recoveryreadinessMod.MaxResults] = js.undefined
  
  /**
    * The token that identifies which batch of results you want to see.
    */
  var NextToken: js.UndefOr[string] = js.undefined
  
  /**
    * The name of a recovery group.
    */
  var RecoveryGroupName: string
}
object GetRecoveryGroupReadinessSummaryRequest {
  
  inline def apply(RecoveryGroupName: string): GetRecoveryGroupReadinessSummaryRequest = {
    val __obj = js.Dynamic.literal(RecoveryGroupName = RecoveryGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRecoveryGroupReadinessSummaryRequest]
  }
  
  extension [Self <: GetRecoveryGroupReadinessSummaryRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRecoveryGroupName(value: string): Self = StObject.set(x, "RecoveryGroupName", value.asInstanceOf[js.Any])
  }
}
