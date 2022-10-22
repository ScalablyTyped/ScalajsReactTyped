package typingsJapgolly.awsSdk.clientsWorkdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRootFoldersRequest extends StObject {
  
  /**
    * Amazon WorkDocs authentication token.
    */
  var AuthenticationToken: AuthenticationHeaderType
  
  /**
    * The maximum number of items to return.
    */
  var Limit: js.UndefOr[LimitType] = js.undefined
  
  /**
    * The marker for the next set of results. (You received this marker from a previous call.)
    */
  var Marker: js.UndefOr[PageMarkerType] = js.undefined
}
object DescribeRootFoldersRequest {
  
  inline def apply(AuthenticationToken: AuthenticationHeaderType): DescribeRootFoldersRequest = {
    val __obj = js.Dynamic.literal(AuthenticationToken = AuthenticationToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRootFoldersRequest]
  }
  
  extension [Self <: DescribeRootFoldersRequest](x: Self) {
    
    inline def setAuthenticationToken(value: AuthenticationHeaderType): Self = StObject.set(x, "AuthenticationToken", value.asInstanceOf[js.Any])
    
    inline def setLimit(value: LimitType): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setMarker(value: PageMarkerType): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
