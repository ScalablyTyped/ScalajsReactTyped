package typingsJapgolly.terraActionHeader

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLButtonElement
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.terraActionHeader.terraActionHeaderInts.`1`
import typingsJapgolly.terraActionHeader.terraActionHeaderInts.`2`
import typingsJapgolly.terraActionHeader.terraActionHeaderInts.`3`
import typingsJapgolly.terraActionHeader.terraActionHeaderInts.`4`
import typingsJapgolly.terraActionHeader.terraActionHeaderInts.`5`
import typingsJapgolly.terraActionHeader.terraActionHeaderInts.`6`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libActionHeaderMod extends Shortcut {
  
  @JSImport("terra-action-header/lib/ActionHeader", JSImport.Default)
  @js.native
  val default: FC[ActionHeaderProps] = js.native
  
  trait ActionHeaderProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    /**
      * Optionally sets the heading level. One of `1`, `2`, `3`, `4`, `5`, `6`. Default `level=1`. This helps screen readers to announce appropriate heading levels.
      * Changing 'level' will not visually change the style of the content.
      */
    var level: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6`] = js.undefined
    
    /**
      * Callback function for when the back button is clicked. The back button will not display if this is not set.
      */
    var onBack: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    /**
      * Callback function for when the close button is clicked.
      * On small viewports, this will be triggered by a back button if onBack is not set.
      */
    var onClose: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    /**
      * Callback function for when the expand button is clicked.
      * The expand button will not display if this is not set or on small viewports.
      * Only the expand button will be rendered if onMaximize and onMinimize are set.
      *
      * *Note: If `onBack` is set, the maximize button will not appear and a custom maximize button must be provided
      * as a child inside a `Collapsible Menu View`.*
      */
    var onMaximize: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    /**
      * Callback function for when the minimize button is clicked.
      * The minimize button will not display if this is not set or on small viewports.
      * Only the expand button will be rendered if both onMaximize and onMinimize are set.
      *
      * *Note: If `onBack` is set, the minimize button will not appear and a custom minimize button must be provided
      * as a child inside a `Collapsible Menu View`.*
      */
    var onMinimize: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    /**
      * Callback function for when the next button is clicked. The previous-next button group will display if either this or onPrevious is set but the button for the one not set will be disabled.
      */
    var onNext: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    /**
      * Callback function for when the previous button is clicked. The previous-next button group will display if either this or onNext is set but the button for the one not set will be disabled.
      */
    var onPrevious: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
  }
  object ActionHeaderProps {
    
    inline def apply(): ActionHeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActionHeaderProps]
    }
    
    extension [Self <: ActionHeaderProps](x: Self) {
      
      inline def setLevel(value: `1` | `2` | `3` | `4` | `5` | `6`): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setOnBack(value: ReactMouseEventFrom[HTMLButtonElement & Element] => Callback): Self = StObject.set(x, "onBack", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & Element]) => value(t0).runNow()))
      
      inline def setOnBackUndefined: Self = StObject.set(x, "onBack", js.undefined)
      
      inline def setOnClose(value: ReactMouseEventFrom[HTMLButtonElement & Element] => Callback): Self = StObject.set(x, "onClose", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & Element]) => value(t0).runNow()))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnMaximize(value: ReactMouseEventFrom[HTMLButtonElement & Element] => Callback): Self = StObject.set(x, "onMaximize", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & Element]) => value(t0).runNow()))
      
      inline def setOnMaximizeUndefined: Self = StObject.set(x, "onMaximize", js.undefined)
      
      inline def setOnMinimize(value: ReactMouseEventFrom[HTMLButtonElement & Element] => Callback): Self = StObject.set(x, "onMinimize", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & Element]) => value(t0).runNow()))
      
      inline def setOnMinimizeUndefined: Self = StObject.set(x, "onMinimize", js.undefined)
      
      inline def setOnNext(value: ReactMouseEventFrom[HTMLButtonElement & Element] => Callback): Self = StObject.set(x, "onNext", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & Element]) => value(t0).runNow()))
      
      inline def setOnNextUndefined: Self = StObject.set(x, "onNext", js.undefined)
      
      inline def setOnPrevious(value: ReactMouseEventFrom[HTMLButtonElement & Element] => Callback): Self = StObject.set(x, "onPrevious", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & Element]) => value(t0).runNow()))
      
      inline def setOnPreviousUndefined: Self = StObject.set(x, "onPrevious", js.undefined)
    }
  }
  
  type _To = FC[ActionHeaderProps]
  
  /* This means you don't have to write `default`, but can instead just say `libActionHeaderMod.foo` */
  override def _to: FC[ActionHeaderProps] = default
}
