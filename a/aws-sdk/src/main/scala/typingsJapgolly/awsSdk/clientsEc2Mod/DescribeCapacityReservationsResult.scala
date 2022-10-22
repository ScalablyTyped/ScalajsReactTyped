package typingsJapgolly.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCapacityReservationsResult extends StObject {
  
  /**
    * Information about the Capacity Reservations.
    */
  var CapacityReservations: js.UndefOr[CapacityReservationSet] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeCapacityReservationsResult {
  
  inline def apply(): DescribeCapacityReservationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCapacityReservationsResult]
  }
  
  extension [Self <: DescribeCapacityReservationsResult](x: Self) {
    
    inline def setCapacityReservations(value: CapacityReservationSet): Self = StObject.set(x, "CapacityReservations", value.asInstanceOf[js.Any])
    
    inline def setCapacityReservationsUndefined: Self = StObject.set(x, "CapacityReservations", js.undefined)
    
    inline def setCapacityReservationsVarargs(value: CapacityReservation*): Self = StObject.set(x, "CapacityReservations", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
