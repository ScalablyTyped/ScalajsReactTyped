package typingsJapgolly.babylonjs.BABYLON

import org.scalajs.dom.ClipboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClipboardInfo extends StObject {
  
  /**
    * Defines the related dom event
    */
  var event: ClipboardEvent
  
  /**
    * Defines the type of event (BABYLON.ClipboardEventTypes)
    */
  var `type`: Double
}
object ClipboardInfo {
  
  inline def apply(event: ClipboardEvent, `type`: Double): ClipboardInfo = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClipboardInfo]
  }
  
  extension [Self <: ClipboardInfo](x: Self) {
    
    inline def setEvent(value: ClipboardEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
