package typingsJapgolly.gridstack

import japgolly.scalajs.react.Callback
import org.scalajs.dom.DragEvent
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.MouseEvent
import typingsJapgolly.gridstack.distEs5DdBaseImplMod.DDBaseImplement
import typingsJapgolly.gridstack.distEs5DdBaseImplMod.HTMLElementExtendOpt
import typingsJapgolly.gridstack.gridstackStrings.drop
import typingsJapgolly.gridstack.gridstackStrings.dropout
import typingsJapgolly.gridstack.gridstackStrings.dropover
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs5DdDroppableMod {
  
  @JSImport("gridstack/dist/es5/dd-droppable", "DDDroppable")
  @js.native
  open class DDDroppable protected ()
    extends DDBaseImplement
       with HTMLElementExtendOpt[DDDroppableOpt] {
    def this(el: HTMLElement) = this()
    def this(el: HTMLElement, opts: DDDroppableOpt) = this()
    
    def accept(el: HTMLElement): Boolean = js.native
    
    def disable(forDestroy: Boolean): Unit = js.native
    
    /** item is being dropped on us - called by the drag mouseup handler - this calls the client drop event */
    def drop(e: MouseEvent): Unit = js.native
    
    /* CompleteClass */
    var el: HTMLElement = js.native
    
    def off(event: drop | dropover | dropout): Unit = js.native
    
    def on(event: drop | dropover | dropout, callback: js.Function1[/* event */ DragEvent, Unit]): Unit = js.native
    
    /* CompleteClass */
    var option: DDDroppableOpt = js.native
    
    /* CompleteClass */
    override def updateOption(T: Any): DDBaseImplement = js.native
    def updateOption(opts: DDDroppableOpt): DDDroppable = js.native
  }
  
  trait DDDroppableOpt extends StObject {
    
    var accept: js.UndefOr[String | (js.Function1[/* el */ HTMLElement, Boolean])] = js.undefined
    
    var drop: js.UndefOr[js.Function2[/* event */ DragEvent, /* ui */ Any, Unit]] = js.undefined
    
    var out: js.UndefOr[js.Function2[/* event */ DragEvent, /* ui */ Any, Unit]] = js.undefined
    
    var over: js.UndefOr[js.Function2[/* event */ DragEvent, /* ui */ Any, Unit]] = js.undefined
  }
  object DDDroppableOpt {
    
    inline def apply(): DDDroppableOpt = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DDDroppableOpt]
    }
    
    extension [Self <: DDDroppableOpt](x: Self) {
      
      inline def setAccept(value: String | (js.Function1[/* el */ HTMLElement, Boolean])): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
      
      inline def setAcceptFunction1(value: /* el */ HTMLElement => Boolean): Self = StObject.set(x, "accept", js.Any.fromFunction1(value))
      
      inline def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
      
      inline def setDrop(value: (/* event */ DragEvent, /* ui */ Any) => Callback): Self = StObject.set(x, "drop", js.Any.fromFunction2((t0: /* event */ DragEvent, t1: /* ui */ Any) => (value(t0, t1)).runNow()))
      
      inline def setDropUndefined: Self = StObject.set(x, "drop", js.undefined)
      
      inline def setOut(value: (/* event */ DragEvent, /* ui */ Any) => Callback): Self = StObject.set(x, "out", js.Any.fromFunction2((t0: /* event */ DragEvent, t1: /* ui */ Any) => (value(t0, t1)).runNow()))
      
      inline def setOutUndefined: Self = StObject.set(x, "out", js.undefined)
      
      inline def setOver(value: (/* event */ DragEvent, /* ui */ Any) => Callback): Self = StObject.set(x, "over", js.Any.fromFunction2((t0: /* event */ DragEvent, t1: /* ui */ Any) => (value(t0, t1)).runNow()))
      
      inline def setOverUndefined: Self = StObject.set(x, "over", js.undefined)
    }
  }
}
