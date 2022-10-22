package typingsJapgolly.awsSdk.clientsHealthMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventDescription_ extends StObject {
  
  /**
    * The most recent description of the event.
    */
  var latestDescription: js.UndefOr[eventDescription] = js.undefined
}
object EventDescription_ {
  
  inline def apply(): EventDescription_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventDescription_]
  }
  
  extension [Self <: EventDescription_](x: Self) {
    
    inline def setLatestDescription(value: eventDescription): Self = StObject.set(x, "latestDescription", value.asInstanceOf[js.Any])
    
    inline def setLatestDescriptionUndefined: Self = StObject.set(x, "latestDescription", js.undefined)
  }
}
