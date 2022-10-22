package typingsJapgolly.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListReservationsResponse extends StObject {
  
  /**
    * The token that identifies which batch of results that you want to see. For example, you submit a ListReservations request with MaxResults set at 5. The service returns the first batch of results (up to 5) and a NextToken value. To see the next batch of results, you can submit the ListReservations request a second time and specify the NextToken value.
    */
  var NextToken: js.UndefOr[string] = js.undefined
  
  /**
    * A list of all reservations that have been purchased by this account in the current AWS Region.
    */
  var Reservations: js.UndefOr[listOfReservation] = js.undefined
}
object ListReservationsResponse {
  
  inline def apply(): ListReservationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListReservationsResponse]
  }
  
  extension [Self <: ListReservationsResponse](x: Self) {
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setReservations(value: listOfReservation): Self = StObject.set(x, "Reservations", value.asInstanceOf[js.Any])
    
    inline def setReservationsUndefined: Self = StObject.set(x, "Reservations", js.undefined)
    
    inline def setReservationsVarargs(value: Reservation*): Self = StObject.set(x, "Reservations", js.Array(value*))
  }
}
