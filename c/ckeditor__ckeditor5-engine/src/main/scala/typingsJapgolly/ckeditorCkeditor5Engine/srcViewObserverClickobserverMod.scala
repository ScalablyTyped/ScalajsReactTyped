package typingsJapgolly.ckeditorCkeditor5Engine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcViewObserverClickobserverMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/view/observer/clickobserver", JSImport.Default)
  @js.native
  open class default () extends ClickObserver
  
  @js.native
  trait ClickObserver
    extends typingsJapgolly.ckeditorCkeditor5Engine.srcViewObserverDomeventobserverMod.default {
    
    @JSName("domEventType")
    val domEventType_ClickObserver: /* "click" */ String = js.native
    
    def onDomEvent(
      domEvent: /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementEventMap[/ * "click" * / string] */ js.Any
    ): Unit = js.native
  }
  
  /* augmented module */
  object ckeditorCkeditor5EngineSrcViewViewAugmentingMod {
    
    trait Observers extends StObject {
      
      var ClickObserver: typingsJapgolly.ckeditorCkeditor5Engine.srcViewObserverClickobserverMod.ClickObserver
    }
    object Observers {
      
      inline def apply(ClickObserver: ClickObserver): Observers = {
        val __obj = js.Dynamic.literal(ClickObserver = ClickObserver.asInstanceOf[js.Any])
        __obj.asInstanceOf[Observers]
      }
      
      extension [Self <: Observers](x: Self) {
        
        inline def setClickObserver(value: ClickObserver): Self = StObject.set(x, "ClickObserver", value.asInstanceOf[js.Any])
      }
    }
  }
}
