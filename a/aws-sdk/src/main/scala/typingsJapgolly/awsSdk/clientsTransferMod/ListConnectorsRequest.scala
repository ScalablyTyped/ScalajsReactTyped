package typingsJapgolly.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListConnectorsRequest extends StObject {
  
  /**
    * The maximum number of connectors to return.
    */
  var MaxResults: js.UndefOr[typingsJapgolly.awsSdk.clientsTransferMod.MaxResults] = js.undefined
  
  /**
    * When you can get additional results from the ListConnectors call, a NextToken parameter is returned in the output. You can then pass in a subsequent command to the NextToken parameter to continue listing additional connectors.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsTransferMod.NextToken] = js.undefined
}
object ListConnectorsRequest {
  
  inline def apply(): ListConnectorsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListConnectorsRequest]
  }
  
  extension [Self <: ListConnectorsRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
