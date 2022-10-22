package typingsJapgolly.ckeditorCkeditor5Engine

import org.scalajs.dom.KeyboardEvent
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.DOM_KEY_LOCATION_LEFT
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.DOM_KEY_LOCATION_NUMPAD
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.DOM_KEY_LOCATION_RIGHT
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.DOM_KEY_LOCATION_STANDARD
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.charCode
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.code
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.isComposing
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.key
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.keydown
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.keyup
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.location
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.repeat
import typingsJapgolly.ckeditorCkeditor5Engine.srcViewViewMod.View
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcViewObserverKeyobserverMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/view/observer/keyobserver", JSImport.Default)
  @js.native
  open class default () extends KeyObserver
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KeystrokeInfo * / any */ @JSImport("@ckeditor/ckeditor5-engine/src/view/observer/keyobserver", "KeyEventData")
  @js.native
  open class KeyEventData[V /* <: View */] protected ()
    extends typingsJapgolly.ckeditorCkeditor5Engine.srcViewObserverDomeventdataMod.default[
          V, 
          KeyboardEvent, 
          typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.altKey | charCode | code | typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.ctrlKey | isComposing | key | typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.keyCode | location | typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.metaKey | repeat | typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.shiftKey | DOM_KEY_LOCATION_LEFT | DOM_KEY_LOCATION_NUMPAD | DOM_KEY_LOCATION_RIGHT | DOM_KEY_LOCATION_STANDARD
        ] {
    def this(view: View, domEvent: KeyboardEvent) = this()
    def this(
      view: View,
      domEvent: KeyboardEvent,
      additionalData: Record[
            typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.altKey | charCode | code | typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.ctrlKey | isComposing | key | typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.keyCode | location | typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.metaKey | repeat | typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.shiftKey | DOM_KEY_LOCATION_LEFT | DOM_KEY_LOCATION_NUMPAD | DOM_KEY_LOCATION_RIGHT | DOM_KEY_LOCATION_STANDARD, 
            String | Double | Boolean
          ]
    ) = this()
    
    val altKey: Boolean = js.native
    
    val ctrlKey: Boolean = js.native
    
    val keyCode: Double = js.native
    
    /**
      * Code of the whole keystroke. See {@link module:utils/keyboard~getCode}.
      */
    val keystroke: Double = js.native
    
    val metaKey: Boolean = js.native
    
    val shiftKey: Boolean = js.native
  }
  
  @js.native
  trait KeyObserver
    extends typingsJapgolly.ckeditorCkeditor5Engine.srcViewObserverDomeventobserverMod.default {
    
    @JSName("domEventType")
    val domEventType_KeyObserver: js.Tuple2[keydown, keyup] = js.native
    
    def onDomEvent(domEvent: KeyboardEvent): Unit = js.native
  }
  
  /* augmented module */
  object ckeditorCkeditor5EngineSrcViewViewAugmentingMod {
    
    trait Observers extends StObject {
      
      var KeyObserver: typingsJapgolly.ckeditorCkeditor5Engine.srcViewObserverKeyobserverMod.KeyObserver
    }
    object Observers {
      
      inline def apply(KeyObserver: KeyObserver): Observers = {
        val __obj = js.Dynamic.literal(KeyObserver = KeyObserver.asInstanceOf[js.Any])
        __obj.asInstanceOf[Observers]
      }
      
      extension [Self <: Observers](x: Self) {
        
        inline def setKeyObserver(value: KeyObserver): Self = StObject.set(x, "KeyObserver", value.asInstanceOf[js.Any])
      }
    }
  }
}
