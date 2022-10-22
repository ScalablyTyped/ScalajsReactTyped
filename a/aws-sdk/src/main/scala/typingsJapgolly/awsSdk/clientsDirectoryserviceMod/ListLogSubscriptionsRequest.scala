package typingsJapgolly.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLogSubscriptionsRequest extends StObject {
  
  /**
    * If a DirectoryID is provided, lists only the log subscription associated with that directory. If no DirectoryId is provided, lists all log subscriptions associated with your Amazon Web Services account. If there are no log subscriptions for the Amazon Web Services account or the directory, an empty list will be returned.
    */
  var DirectoryId: js.UndefOr[typingsJapgolly.awsSdk.clientsDirectoryserviceMod.DirectoryId] = js.undefined
  
  /**
    * The maximum number of items returned.
    */
  var Limit: js.UndefOr[typingsJapgolly.awsSdk.clientsDirectoryserviceMod.Limit] = js.undefined
  
  /**
    * The token for the next set of items to return.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsDirectoryserviceMod.NextToken] = js.undefined
}
object ListLogSubscriptionsRequest {
  
  inline def apply(): ListLogSubscriptionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLogSubscriptionsRequest]
  }
  
  extension [Self <: ListLogSubscriptionsRequest](x: Self) {
    
    inline def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    inline def setDirectoryIdUndefined: Self = StObject.set(x, "DirectoryId", js.undefined)
    
    inline def setLimit(value: Limit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
