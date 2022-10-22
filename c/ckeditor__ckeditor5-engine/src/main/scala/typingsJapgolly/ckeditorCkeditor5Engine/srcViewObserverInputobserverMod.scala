package typingsJapgolly.ckeditorCkeditor5Engine

import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.beforeinput
import typingsJapgolly.std.InputEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcViewObserverInputobserverMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/view/observer/inputobserver", JSImport.Default)
  @js.native
  open class default () extends InputObserver
  
  @js.native
  trait InputObserver
    extends typingsJapgolly.ckeditorCkeditor5Engine.srcViewObserverDomeventobserverMod.default {
    
    @JSName("domEventType")
    val domEventType_InputObserver: js.Array[beforeinput] = js.native
    
    def onDomEvent(domEvent: InputEvent): Unit = js.native
  }
  
  /* augmented module */
  object ckeditorCkeditor5EngineSrcViewViewAugmentingMod {
    
    trait Observers extends StObject {
      
      var InputObserver: typingsJapgolly.ckeditorCkeditor5Engine.srcViewObserverInputobserverMod.InputObserver
    }
    object Observers {
      
      inline def apply(InputObserver: InputObserver): Observers = {
        val __obj = js.Dynamic.literal(InputObserver = InputObserver.asInstanceOf[js.Any])
        __obj.asInstanceOf[Observers]
      }
      
      extension [Self <: Observers](x: Self) {
        
        inline def setInputObserver(value: InputObserver): Self = StObject.set(x, "InputObserver", value.asInstanceOf[js.Any])
      }
    }
  }
}
