package typingsJapgolly.rcTable

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.RefHandle
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Window
import typingsJapgolly.rcTable.anon.`0`
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStickyScrollBarMod extends Shortcut {
  
  @JSImport("rc-table/lib/stickyScrollBar", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[StickyScrollBarProps & RefAttributes[Any]] = js.native
  
  trait StickyScrollBarProps extends StObject {
    
    var container: HTMLElement | Window
    
    var offsetScroll: Double
    
    def onScroll(params: `0`): Unit
    
    var scrollBodyRef: RefHandle[HTMLDivElement]
  }
  object StickyScrollBarProps {
    
    inline def apply(
      container: HTMLElement | Window,
      offsetScroll: Double,
      onScroll: `0` => Callback,
      scrollBodyRef: RefHandle[HTMLDivElement]
    ): StickyScrollBarProps = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], offsetScroll = offsetScroll.asInstanceOf[js.Any], onScroll = js.Any.fromFunction1((t0: `0`) => onScroll(t0).runNow()), scrollBodyRef = scrollBodyRef.asInstanceOf[js.Any])
      __obj.asInstanceOf[StickyScrollBarProps]
    }
    
    extension [Self <: StickyScrollBarProps](x: Self) {
      
      inline def setContainer(value: HTMLElement | Window): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setOffsetScroll(value: Double): Self = StObject.set(x, "offsetScroll", value.asInstanceOf[js.Any])
      
      inline def setOnScroll(value: `0` => Callback): Self = StObject.set(x, "onScroll", js.Any.fromFunction1((t0: `0`) => value(t0).runNow()))
      
      inline def setScrollBodyRef(value: RefHandle[HTMLDivElement]): Self = StObject.set(x, "scrollBodyRef", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ForwardRefExoticComponent[StickyScrollBarProps & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `libStickyScrollBarMod.foo` */
  override def _to: ForwardRefExoticComponent[StickyScrollBarProps & RefAttributes[Any]] = default
}
