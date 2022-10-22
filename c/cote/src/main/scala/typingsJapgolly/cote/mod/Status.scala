package typingsJapgolly.cote.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Status
  extends StObject
     with Event {
  
  var advertisement: StatusAdvertisement
}
object Status {
  
  inline def apply(advertisement: StatusAdvertisement, `type`: String): Status = {
    val __obj = js.Dynamic.literal(advertisement = advertisement.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Status]
  }
  
  extension [Self <: Status](x: Self) {
    
    inline def setAdvertisement(value: StatusAdvertisement): Self = StObject.set(x, "advertisement", value.asInstanceOf[js.Any])
  }
}
