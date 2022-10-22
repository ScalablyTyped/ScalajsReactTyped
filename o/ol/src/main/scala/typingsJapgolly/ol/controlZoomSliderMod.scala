package typingsJapgolly.ol

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object controlZoomSliderMod {
  
  @JSImport("ol/control/ZoomSlider", JSImport.Default)
  @js.native
  open class default () extends ZoomSlider {
    def this(opt_options: Options) = this()
  }
  
  trait Options extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var render: js.UndefOr[js.Function1[/* p0 */ typingsJapgolly.ol.mapEventMod.default, Unit]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setRender(value: /* p0 */ typingsJapgolly.ol.mapEventMod.default => Callback): Self = StObject.set(x, "render", js.Any.fromFunction1((t0: /* p0 */ typingsJapgolly.ol.mapEventMod.default) => value(t0).runNow()))
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    }
  }
  
  @js.native
  trait ZoomSlider
    extends typingsJapgolly.ol.controlControlMod.default
}
