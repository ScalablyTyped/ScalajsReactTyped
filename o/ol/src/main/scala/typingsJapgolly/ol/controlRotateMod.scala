package typingsJapgolly.ol

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object controlRotateMod {
  
  @JSImport("ol/control/Rotate", JSImport.Default)
  @js.native
  open class default () extends Rotate {
    def this(opt_options: Options) = this()
  }
  
  trait Options extends StObject {
    
    var autoHide: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var compassClassName: js.UndefOr[String] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var label: js.UndefOr[String | HTMLElement] = js.undefined
    
    var render: js.UndefOr[js.Function1[/* p0 */ typingsJapgolly.ol.mapEventMod.default, Unit]] = js.undefined
    
    var resetNorth: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var target: js.UndefOr[HTMLElement | String] = js.undefined
    
    var tipLabel: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAutoHide(value: Boolean): Self = StObject.set(x, "autoHide", value.asInstanceOf[js.Any])
      
      inline def setAutoHideUndefined: Self = StObject.set(x, "autoHide", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCompassClassName(value: String): Self = StObject.set(x, "compassClassName", value.asInstanceOf[js.Any])
      
      inline def setCompassClassNameUndefined: Self = StObject.set(x, "compassClassName", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setLabel(value: String | HTMLElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setRender(value: /* p0 */ typingsJapgolly.ol.mapEventMod.default => Callback): Self = StObject.set(x, "render", js.Any.fromFunction1((t0: /* p0 */ typingsJapgolly.ol.mapEventMod.default) => value(t0).runNow()))
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      inline def setResetNorth(value: Callback): Self = StObject.set(x, "resetNorth", value.toJsFn)
      
      inline def setResetNorthUndefined: Self = StObject.set(x, "resetNorth", js.undefined)
      
      inline def setTarget(value: HTMLElement | String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTipLabel(value: String): Self = StObject.set(x, "tipLabel", value.asInstanceOf[js.Any])
      
      inline def setTipLabelUndefined: Self = StObject.set(x, "tipLabel", js.undefined)
    }
  }
  
  @js.native
  trait Rotate
    extends typingsJapgolly.ol.controlControlMod.default
}
