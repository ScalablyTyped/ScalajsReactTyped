package typingsJapgolly.ol

import typingsJapgolly.ol.eventsConditionMod.Condition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interactionKeyboardZoomMod {
  
  @JSImport("ol/interaction/KeyboardZoom", JSImport.Default)
  @js.native
  open class default () extends KeyboardZoom {
    def this(opt_options: Options) = this()
  }
  
  @js.native
  trait KeyboardZoom
    extends typingsJapgolly.ol.interactionInteractionMod.default
  
  trait Options extends StObject {
    
    var condition: js.UndefOr[Condition] = js.undefined
    
    var delta: js.UndefOr[Double] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCondition(value: Condition): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
      
      inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
      
      inline def setDelta(value: Double): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
      
      inline def setDeltaUndefined: Self = StObject.set(x, "delta", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    }
  }
}
