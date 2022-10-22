package typingsJapgolly.gridstack

import japgolly.scalajs.react.Callback
import org.scalajs.dom.DragEvent
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import typingsJapgolly.gridstack.distDdBaseImplMod.DDBaseImplement
import typingsJapgolly.gridstack.distDdBaseImplMod.HTMLElementExtendOpt
import typingsJapgolly.gridstack.distTypesMod.DDUIData
import typingsJapgolly.gridstack.gridstackStrings.resize
import typingsJapgolly.gridstack.gridstackStrings.resizestart
import typingsJapgolly.gridstack.gridstackStrings.resizestop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDdResizableMod {
  
  @JSImport("gridstack/dist/dd-resizable", "DDResizable")
  @js.native
  open class DDResizable protected ()
    extends DDBaseImplement
       with HTMLElementExtendOpt[DDResizableOpt] {
    def this(el: HTMLElement) = this()
    def this(el: HTMLElement, opts: DDResizableOpt) = this()
    
    /* CompleteClass */
    var el: HTMLElement = js.native
    
    def off(event: resizestart | resize | resizestop): Unit = js.native
    
    def on(event: resizestart | resize | resizestop, callback: js.Function1[/* event */ DragEvent, Unit]): Unit = js.native
    
    /* CompleteClass */
    var option: DDResizableOpt = js.native
    
    /* CompleteClass */
    override def updateOption(T: Any): DDBaseImplement = js.native
    def updateOption(opts: DDResizableOpt): DDResizable = js.native
  }
  
  trait DDResizableOpt extends StObject {
    
    var autoHide: js.UndefOr[Boolean] = js.undefined
    
    var handles: js.UndefOr[String] = js.undefined
    
    var maxHeight: js.UndefOr[Double] = js.undefined
    
    var maxWidth: js.UndefOr[Double] = js.undefined
    
    var minHeight: js.UndefOr[Double] = js.undefined
    
    var minWidth: js.UndefOr[Double] = js.undefined
    
    var resize: js.UndefOr[js.Function2[/* event */ Event, /* ui */ DDUIData, Unit]] = js.undefined
    
    var start: js.UndefOr[js.Function2[/* event */ Event, /* ui */ DDUIData, Unit]] = js.undefined
    
    var stop: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  }
  object DDResizableOpt {
    
    inline def apply(): DDResizableOpt = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DDResizableOpt]
    }
    
    extension [Self <: DDResizableOpt](x: Self) {
      
      inline def setAutoHide(value: Boolean): Self = StObject.set(x, "autoHide", value.asInstanceOf[js.Any])
      
      inline def setAutoHideUndefined: Self = StObject.set(x, "autoHide", js.undefined)
      
      inline def setHandles(value: String): Self = StObject.set(x, "handles", value.asInstanceOf[js.Any])
      
      inline def setHandlesUndefined: Self = StObject.set(x, "handles", js.undefined)
      
      inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setResize(value: (/* event */ Event, /* ui */ DDUIData) => Callback): Self = StObject.set(x, "resize", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ DDUIData) => (value(t0, t1)).runNow()))
      
      inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
      
      inline def setStart(value: (/* event */ Event, /* ui */ DDUIData) => Callback): Self = StObject.set(x, "start", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ DDUIData) => (value(t0, t1)).runNow()))
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setStop(value: /* event */ Event => Callback): Self = StObject.set(x, "stop", js.Any.fromFunction1((t0: /* event */ Event) => value(t0).runNow()))
      
      inline def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
    }
  }
}
