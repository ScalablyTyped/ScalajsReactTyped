package typingsJapgolly.vueTestUtils.anon

import typingsJapgolly.vueTestUtils.vueTestUtilsBooleans.`false`
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.AudioProcessingEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventInterface extends StObject {
  
  val bubbles: `false`
  
  val cancelable: `false`
  
  val eventInterface: AudioProcessingEvent
}
object EventInterface {
  
  inline def apply(): EventInterface = {
    val __obj = js.Dynamic.literal(bubbles = false, cancelable = false, eventInterface = "AudioProcessingEvent")
    __obj.asInstanceOf[EventInterface]
  }
  
  extension [Self <: EventInterface](x: Self) {
    
    inline def setBubbles(value: `false`): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    inline def setCancelable(value: `false`): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setEventInterface(value: AudioProcessingEvent): Self = StObject.set(x, "eventInterface", value.asInstanceOf[js.Any])
  }
}
