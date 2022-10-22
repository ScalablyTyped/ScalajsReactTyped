package typingsJapgolly.uapiJson.libAirMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchBookingsByPassengerNameParams extends StObject {
  
  var searchPhrase: String
}
object SearchBookingsByPassengerNameParams {
  
  inline def apply(searchPhrase: String): SearchBookingsByPassengerNameParams = {
    val __obj = js.Dynamic.literal(searchPhrase = searchPhrase.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchBookingsByPassengerNameParams]
  }
  
  extension [Self <: SearchBookingsByPassengerNameParams](x: Self) {
    
    inline def setSearchPhrase(value: String): Self = StObject.set(x, "searchPhrase", value.asInstanceOf[js.Any])
  }
}
