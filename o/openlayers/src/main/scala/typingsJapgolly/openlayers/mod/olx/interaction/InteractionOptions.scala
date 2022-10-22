package typingsJapgolly.openlayers.mod.olx.interaction

import typingsJapgolly.openlayers.mod.MapBrowserEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object literal with config options for interactions.
  */
trait InteractionOptions extends StObject {
  
  def handleEvent(event: MapBrowserEvent): Boolean
}
object InteractionOptions {
  
  inline def apply(handleEvent: MapBrowserEvent => Boolean): InteractionOptions = {
    val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction1(handleEvent))
    __obj.asInstanceOf[InteractionOptions]
  }
  
  extension [Self <: InteractionOptions](x: Self) {
    
    inline def setHandleEvent(value: MapBrowserEvent => Boolean): Self = StObject.set(x, "handleEvent", js.Any.fromFunction1(value))
  }
}
