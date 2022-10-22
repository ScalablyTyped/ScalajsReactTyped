package typingsJapgolly.ionicAngular.anon

import typingsJapgolly.ionicAngular.ionicAngularStrings.activate
import typingsJapgolly.ionicAngular.ionicAngularStrings.deactivate
import typingsJapgolly.ionicAngular.ionicAngularStrings.stackEvents
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivateEvents extends StObject {
  
  var activateEvents: activate
  
  var deactivateEvents: deactivate
  
  var stackEvents: typingsJapgolly.ionicAngular.ionicAngularStrings.stackEvents
}
object ActivateEvents {
  
  inline def apply(): ActivateEvents = {
    val __obj = js.Dynamic.literal(activateEvents = "activate", deactivateEvents = "deactivate", stackEvents = "stackEvents")
    __obj.asInstanceOf[ActivateEvents]
  }
  
  extension [Self <: ActivateEvents](x: Self) {
    
    inline def setActivateEvents(value: activate): Self = StObject.set(x, "activateEvents", value.asInstanceOf[js.Any])
    
    inline def setDeactivateEvents(value: deactivate): Self = StObject.set(x, "deactivateEvents", value.asInstanceOf[js.Any])
    
    inline def setStackEvents(value: stackEvents): Self = StObject.set(x, "stackEvents", value.asInstanceOf[js.Any])
  }
}
