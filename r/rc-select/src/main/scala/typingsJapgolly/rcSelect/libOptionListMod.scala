package typingsJapgolly.rcSelect

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.Element
import typingsJapgolly.rcVirtualList.esListMod.ScrollConfig
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.KeyboardEventHandler
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.std.Pick
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libOptionListMod extends Shortcut {
  
  @JSImport("rc-select/lib/OptionList", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[(Pick[OptionListProps, String]) & RefAttributes[RefOptionListProps]] = js.native
  
  type OptionListProps = Record[String, scala.Nothing]
  
  trait RefOptionListProps extends StObject {
    
    var onKeyDown: KeyboardEventHandler[Element]
    
    var onKeyUp: KeyboardEventHandler[Element]
    
    var scrollTo: js.UndefOr[js.Function1[/* args */ Double | ScrollConfig, Unit]] = js.undefined
  }
  object RefOptionListProps {
    
    inline def apply(
      onKeyDown: ReactKeyboardEventFrom[Element & Element] => Callback,
      onKeyUp: ReactKeyboardEventFrom[Element & Element] => Callback
    ): RefOptionListProps = {
      val __obj = js.Dynamic.literal(onKeyDown = js.Any.fromFunction1((t0: ReactKeyboardEventFrom[Element & Element]) => onKeyDown(t0).runNow()), onKeyUp = js.Any.fromFunction1((t0: ReactKeyboardEventFrom[Element & Element]) => onKeyUp(t0).runNow()))
      __obj.asInstanceOf[RefOptionListProps]
    }
    
    extension [Self <: RefOptionListProps](x: Self) {
      
      inline def setOnKeyDown(value: ReactKeyboardEventFrom[Element & Element] => Callback): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[Element & Element]) => value(t0).runNow()))
      
      inline def setOnKeyUp(value: ReactKeyboardEventFrom[Element & Element] => Callback): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[Element & Element]) => value(t0).runNow()))
      
      inline def setScrollTo(value: /* args */ Double | ScrollConfig => Callback): Self = StObject.set(x, "scrollTo", js.Any.fromFunction1((t0: /* args */ Double | ScrollConfig) => value(t0).runNow()))
      
      inline def setScrollToUndefined: Self = StObject.set(x, "scrollTo", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[(Pick[OptionListProps, String]) & RefAttributes[RefOptionListProps]]
  
  /* This means you don't have to write `default`, but can instead just say `libOptionListMod.foo` */
  override def _to: ForwardRefExoticComponent[(Pick[OptionListProps, String]) & RefAttributes[RefOptionListProps]] = default
}
