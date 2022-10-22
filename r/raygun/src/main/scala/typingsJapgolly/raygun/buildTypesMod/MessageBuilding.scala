package typingsJapgolly.raygun.buildTypesMod

import typingsJapgolly.raygun.anon.PartialMessageDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageBuilding extends StObject {
  
  var details: PartialMessageDetails
  
  var occurredOn: js.Date
}
object MessageBuilding {
  
  inline def apply(details: PartialMessageDetails, occurredOn: js.Date): MessageBuilding = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], occurredOn = occurredOn.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageBuilding]
  }
  
  extension [Self <: MessageBuilding](x: Self) {
    
    inline def setDetails(value: PartialMessageDetails): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setOccurredOn(value: js.Date): Self = StObject.set(x, "occurredOn", value.asInstanceOf[js.Any])
  }
}
