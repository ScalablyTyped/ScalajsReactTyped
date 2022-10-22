package typingsJapgolly.awsSdk.clientsIvsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPlaybackKeyPairsRequest extends StObject {
  
  /**
    * Maximum number of key pairs to return. Default: your service quota or 100, whichever is smaller.
    */
  var maxResults: js.UndefOr[MaxPlaybackKeyPairResults] = js.undefined
  
  /**
    * The first key pair to retrieve. This is used for pagination; see the nextToken response field.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListPlaybackKeyPairsRequest {
  
  inline def apply(): ListPlaybackKeyPairsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPlaybackKeyPairsRequest]
  }
  
  extension [Self <: ListPlaybackKeyPairsRequest](x: Self) {
    
    inline def setMaxResults(value: MaxPlaybackKeyPairResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
