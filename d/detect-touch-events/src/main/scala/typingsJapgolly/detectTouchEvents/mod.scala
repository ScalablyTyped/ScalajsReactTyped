package typingsJapgolly.detectTouchEvents

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("detect-touch-events", JSImport.Default)
  @js.native
  val default: typingsJapgolly.detectTouchEvents.mod.detectTouchEvents = js.native
  
  type _To = typingsJapgolly.detectTouchEvents.mod.detectTouchEvents
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: typingsJapgolly.detectTouchEvents.mod.detectTouchEvents = default
  
  trait detectTouchEvents extends StObject {
    
    var hasApi: Boolean
    
    var maxTouchPoints: Double
    
    def update(): Unit
  }
  object detectTouchEvents {
    
    inline def apply(hasApi: Boolean, maxTouchPoints: Double, update: Callback): typingsJapgolly.detectTouchEvents.mod.detectTouchEvents = {
      val __obj = js.Dynamic.literal(hasApi = hasApi.asInstanceOf[js.Any], maxTouchPoints = maxTouchPoints.asInstanceOf[js.Any], update = update.toJsFn)
      __obj.asInstanceOf[typingsJapgolly.detectTouchEvents.mod.detectTouchEvents]
    }
    
    extension [Self <: typingsJapgolly.detectTouchEvents.mod.detectTouchEvents](x: Self) {
      
      inline def setHasApi(value: Boolean): Self = StObject.set(x, "hasApi", value.asInstanceOf[js.Any])
      
      inline def setMaxTouchPoints(value: Double): Self = StObject.set(x, "maxTouchPoints", value.asInstanceOf[js.Any])
      
      inline def setUpdate(value: Callback): Self = StObject.set(x, "update", value.toJsFn)
    }
  }
}
