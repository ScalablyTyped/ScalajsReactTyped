package typingsJapgolly.ckeditorCkeditor5Engine

import org.scalajs.dom.FocusEvent
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.blur
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.focus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcViewObserverFocusobserverMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/view/observer/focusobserver", JSImport.Default)
  @js.native
  open class default () extends FocusObserver
  
  @js.native
  trait FocusObserver
    extends typingsJapgolly.ckeditorCkeditor5Engine.srcViewObserverDomeventobserverMod.default {
    
    @JSName("domEventType")
    val domEventType_FocusObserver: js.Tuple2[focus, blur] = js.native
    
    def onDomEvent(domEvent: FocusEvent): Unit = js.native
  }
  
  /* augmented module */
  object ckeditorCkeditor5EngineSrcViewViewAugmentingMod {
    
    trait Observers extends StObject {
      
      var FocusObserver: typingsJapgolly.ckeditorCkeditor5Engine.srcViewObserverFocusobserverMod.FocusObserver
    }
    object Observers {
      
      inline def apply(FocusObserver: FocusObserver): Observers = {
        val __obj = js.Dynamic.literal(FocusObserver = FocusObserver.asInstanceOf[js.Any])
        __obj.asInstanceOf[Observers]
      }
      
      extension [Self <: Observers](x: Self) {
        
        inline def setFocusObserver(value: FocusObserver): Self = StObject.set(x, "FocusObserver", value.asInstanceOf[js.Any])
      }
    }
  }
}
