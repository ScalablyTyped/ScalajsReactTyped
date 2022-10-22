package typingsJapgolly.awsSdk.clientsCloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDestinationsResponse extends StObject {
  
  /**
    * The destinations.
    */
  var destinations: js.UndefOr[Destinations] = js.undefined
  
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object DescribeDestinationsResponse {
  
  inline def apply(): DescribeDestinationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDestinationsResponse]
  }
  
  extension [Self <: DescribeDestinationsResponse](x: Self) {
    
    inline def setDestinations(value: Destinations): Self = StObject.set(x, "destinations", value.asInstanceOf[js.Any])
    
    inline def setDestinationsUndefined: Self = StObject.set(x, "destinations", js.undefined)
    
    inline def setDestinationsVarargs(value: Destination*): Self = StObject.set(x, "destinations", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
