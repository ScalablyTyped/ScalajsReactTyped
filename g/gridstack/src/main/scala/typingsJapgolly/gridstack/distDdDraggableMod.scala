package typingsJapgolly.gridstack

import japgolly.scalajs.react.Callback
import org.scalajs.dom.DragEvent
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import typingsJapgolly.gridstack.distDdBaseImplMod.DDBaseImplement
import typingsJapgolly.gridstack.distDdBaseImplMod.HTMLElementExtendOpt
import typingsJapgolly.gridstack.distTypesMod.DDUIData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDdDraggableMod {
  
  @JSImport("gridstack/dist/dd-draggable", "DDDraggable")
  @js.native
  open class DDDraggable protected ()
    extends DDBaseImplement
       with HTMLElementExtendOpt[DDDraggableOpt] {
    def this(el: HTMLElement) = this()
    def this(el: HTMLElement, option: DDDraggableOpt) = this()
    
    def disable(forDestroy: Boolean): Unit = js.native
    
    /* CompleteClass */
    var el: HTMLElement = js.native
    
    var helper: HTMLElement = js.native
    
    def off(event: DDDragEvent): Unit = js.native
    
    def on(event: DDDragEvent, callback: js.Function1[/* event */ DragEvent, Unit]): Unit = js.native
    
    /* CompleteClass */
    var option: DDDraggableOpt = js.native
    
    /* CompleteClass */
    override def updateOption(T: Any): DDBaseImplement = js.native
    def updateOption(opts: DDDraggableOpt): DDDraggable = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.gridstack.gridstackStrings.drag
    - typingsJapgolly.gridstack.gridstackStrings.dragstart
    - typingsJapgolly.gridstack.gridstackStrings.dragstop
  */
  trait DDDragEvent extends StObject
  object DDDragEvent {
    
    inline def drag: typingsJapgolly.gridstack.gridstackStrings.drag = "drag".asInstanceOf[typingsJapgolly.gridstack.gridstackStrings.drag]
    
    inline def dragstart: typingsJapgolly.gridstack.gridstackStrings.dragstart = "dragstart".asInstanceOf[typingsJapgolly.gridstack.gridstackStrings.dragstart]
    
    inline def dragstop: typingsJapgolly.gridstack.gridstackStrings.dragstop = "dragstop".asInstanceOf[typingsJapgolly.gridstack.gridstackStrings.dragstop]
  }
  
  trait DDDraggableOpt extends StObject {
    
    var appendTo: js.UndefOr[String | HTMLElement] = js.undefined
    
    var drag: js.UndefOr[js.Function2[/* event */ Event, /* ui */ DDUIData, Unit]] = js.undefined
    
    var handle: js.UndefOr[String] = js.undefined
    
    var helper: js.UndefOr[String | HTMLElement | (js.Function1[/* event */ Event, HTMLElement])] = js.undefined
    
    var start: js.UndefOr[js.Function2[/* event */ Event, /* ui */ DDUIData, Unit]] = js.undefined
    
    var stop: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  }
  object DDDraggableOpt {
    
    inline def apply(): DDDraggableOpt = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DDDraggableOpt]
    }
    
    extension [Self <: DDDraggableOpt](x: Self) {
      
      inline def setAppendTo(value: String | HTMLElement): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
      
      inline def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
      
      inline def setDrag(value: (/* event */ Event, /* ui */ DDUIData) => Callback): Self = StObject.set(x, "drag", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ DDUIData) => (value(t0, t1)).runNow()))
      
      inline def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
      
      inline def setHandle(value: String): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
      
      inline def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
      
      inline def setHelper(value: String | HTMLElement | (js.Function1[/* event */ Event, HTMLElement])): Self = StObject.set(x, "helper", value.asInstanceOf[js.Any])
      
      inline def setHelperFunction1(value: /* event */ Event => HTMLElement): Self = StObject.set(x, "helper", js.Any.fromFunction1(value))
      
      inline def setHelperUndefined: Self = StObject.set(x, "helper", js.undefined)
      
      inline def setStart(value: (/* event */ Event, /* ui */ DDUIData) => Callback): Self = StObject.set(x, "start", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ DDUIData) => (value(t0, t1)).runNow()))
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setStop(value: /* event */ Event => Callback): Self = StObject.set(x, "stop", js.Any.fromFunction1((t0: /* event */ Event) => value(t0).runNow()))
      
      inline def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
    }
  }
}
