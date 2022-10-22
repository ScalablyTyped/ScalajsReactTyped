package typingsJapgolly.awsSdk.clientsRoute53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCidrLocationsResponse extends StObject {
  
  /**
    * A complex type that contains information about the list of CIDR locations.
    */
  var CidrLocations: js.UndefOr[LocationSummaries] = js.undefined
  
  /**
    * An opaque pagination token to indicate where the service is to begin enumerating results. If no value is provided, the listing of results starts from the beginning.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListCidrLocationsResponse {
  
  inline def apply(): ListCidrLocationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCidrLocationsResponse]
  }
  
  extension [Self <: ListCidrLocationsResponse](x: Self) {
    
    inline def setCidrLocations(value: LocationSummaries): Self = StObject.set(x, "CidrLocations", value.asInstanceOf[js.Any])
    
    inline def setCidrLocationsUndefined: Self = StObject.set(x, "CidrLocations", js.undefined)
    
    inline def setCidrLocationsVarargs(value: LocationSummary*): Self = StObject.set(x, "CidrLocations", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
