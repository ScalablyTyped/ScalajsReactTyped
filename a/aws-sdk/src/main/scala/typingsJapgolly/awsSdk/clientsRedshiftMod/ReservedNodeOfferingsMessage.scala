package typingsJapgolly.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReservedNodeOfferingsMessage extends StObject {
  
  /**
    * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned marker value in the Marker parameter and retrying the command. If the Marker field is empty, all response records have been retrieved for the request. 
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * A list of ReservedNodeOffering objects.
    */
  var ReservedNodeOfferings: js.UndefOr[ReservedNodeOfferingList] = js.undefined
}
object ReservedNodeOfferingsMessage {
  
  inline def apply(): ReservedNodeOfferingsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservedNodeOfferingsMessage]
  }
  
  extension [Self <: ReservedNodeOfferingsMessage](x: Self) {
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setReservedNodeOfferings(value: ReservedNodeOfferingList): Self = StObject.set(x, "ReservedNodeOfferings", value.asInstanceOf[js.Any])
    
    inline def setReservedNodeOfferingsUndefined: Self = StObject.set(x, "ReservedNodeOfferings", js.undefined)
    
    inline def setReservedNodeOfferingsVarargs(value: ReservedNodeOffering*): Self = StObject.set(x, "ReservedNodeOfferings", js.Array(value*))
  }
}
