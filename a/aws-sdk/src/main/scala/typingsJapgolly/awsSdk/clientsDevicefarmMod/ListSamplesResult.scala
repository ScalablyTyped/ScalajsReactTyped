package typingsJapgolly.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSamplesResult extends StObject {
  
  /**
    * If the number of items that are returned is significantly large, this is an identifier that is also returned. It can be used in a subsequent call to this operation to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * Information about the samples.
    */
  var samples: js.UndefOr[Samples] = js.undefined
}
object ListSamplesResult {
  
  inline def apply(): ListSamplesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSamplesResult]
  }
  
  extension [Self <: ListSamplesResult](x: Self) {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSamples(value: Samples): Self = StObject.set(x, "samples", value.asInstanceOf[js.Any])
    
    inline def setSamplesUndefined: Self = StObject.set(x, "samples", js.undefined)
    
    inline def setSamplesVarargs(value: Sample*): Self = StObject.set(x, "samples", js.Array(value*))
  }
}
