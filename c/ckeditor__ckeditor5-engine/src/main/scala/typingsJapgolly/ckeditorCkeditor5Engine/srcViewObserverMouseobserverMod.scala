package typingsJapgolly.ckeditorCkeditor5Engine

import org.scalajs.dom.MouseEvent
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.mousedown
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.mouseout
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.mouseover
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.mouseup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcViewObserverMouseobserverMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/view/observer/mouseobserver", JSImport.Default)
  @js.native
  open class default () extends MouseObserver
  
  @js.native
  trait MouseObserver
    extends typingsJapgolly.ckeditorCkeditor5Engine.srcViewObserverDomeventobserverMod.default {
    
    @JSName("domEventType")
    val domEventType_MouseObserver: js.Tuple4[mousedown, mouseup, mouseover, mouseout] = js.native
    
    def onDomEvent(domEvent: MouseEvent): Unit = js.native
  }
  
  /* augmented module */
  object ckeditorCkeditor5EngineSrcViewViewAugmentingMod {
    
    trait Observers extends StObject {
      
      var MouseObserver: typingsJapgolly.ckeditorCkeditor5Engine.srcViewObserverMouseobserverMod.MouseObserver
    }
    object Observers {
      
      inline def apply(MouseObserver: MouseObserver): Observers = {
        val __obj = js.Dynamic.literal(MouseObserver = MouseObserver.asInstanceOf[js.Any])
        __obj.asInstanceOf[Observers]
      }
      
      extension [Self <: Observers](x: Self) {
        
        inline def setMouseObserver(value: MouseObserver): Self = StObject.set(x, "MouseObserver", value.asInstanceOf[js.Any])
      }
    }
  }
}
