package typingsJapgolly.rcTreeSelect

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.Element
import typingsJapgolly.rcVirtualList.esListMod.ScrollConfig
import typingsJapgolly.rcVirtualList.esListMod.ScrollTo
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.KeyboardEventHandler
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esOptionListMod extends Shortcut {
  
  @JSImport("rc-tree-select/es/OptionList", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[RefAttributes[ReviseRefOptionListProps]] = js.native
  
  /* Inlined std.Omit<rc-select.rc-select/lib/OptionList.RefOptionListProps, 'scrollTo'> & {  scrollTo :rc-tree.rc-tree/es/interface.ScrollTo} */
  trait ReviseRefOptionListProps extends StObject {
    
    var onKeyDown: KeyboardEventHandler[Element]
    
    var onKeyUp: KeyboardEventHandler[Element]
    
    var scrollTo: ScrollTo
  }
  object ReviseRefOptionListProps {
    
    inline def apply(
      onKeyDown: ReactKeyboardEventFrom[Element & Element] => Callback,
      onKeyUp: ReactKeyboardEventFrom[Element & Element] => Callback,
      scrollTo: /* arg */ Double | ScrollConfig => Callback
    ): ReviseRefOptionListProps = {
      val __obj = js.Dynamic.literal(onKeyDown = js.Any.fromFunction1((t0: ReactKeyboardEventFrom[Element & Element]) => onKeyDown(t0).runNow()), onKeyUp = js.Any.fromFunction1((t0: ReactKeyboardEventFrom[Element & Element]) => onKeyUp(t0).runNow()), scrollTo = js.Any.fromFunction1((t0: /* arg */ Double | ScrollConfig) => scrollTo(t0).runNow()))
      __obj.asInstanceOf[ReviseRefOptionListProps]
    }
    
    extension [Self <: ReviseRefOptionListProps](x: Self) {
      
      inline def setOnKeyDown(value: ReactKeyboardEventFrom[Element & Element] => Callback): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[Element & Element]) => value(t0).runNow()))
      
      inline def setOnKeyUp(value: ReactKeyboardEventFrom[Element & Element] => Callback): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[Element & Element]) => value(t0).runNow()))
      
      inline def setScrollTo(value: /* arg */ Double | ScrollConfig => Callback): Self = StObject.set(x, "scrollTo", js.Any.fromFunction1((t0: /* arg */ Double | ScrollConfig) => value(t0).runNow()))
    }
  }
  
  type _To = ForwardRefExoticComponent[RefAttributes[ReviseRefOptionListProps]]
  
  /* This means you don't have to write `default`, but can instead just say `esOptionListMod.foo` */
  override def _to: ForwardRefExoticComponent[RefAttributes[ReviseRefOptionListProps]] = default
}
