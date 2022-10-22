package typingsJapgolly.grommet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import typingsJapgolly.grommet.es6UtilsMod.KeyboardType
import typingsJapgolly.grommet.grommetStrings.component
import typingsJapgolly.grommet.grommetStrings.document
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object es6ComponentsKeyboardMod {
  
  @JSImport("grommet/es6/components/Keyboard", "Keyboard")
  @js.native
  val Keyboard: FC[KeyboardProps] = js.native
  
  trait KeyboardProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var onBackspace: js.UndefOr[KeyboardType] = js.undefined
    
    var onComma: js.UndefOr[KeyboardType] = js.undefined
    
    var onDown: js.UndefOr[KeyboardType] = js.undefined
    
    var onEnter: js.UndefOr[KeyboardType] = js.undefined
    
    var onEsc: js.UndefOr[KeyboardType] = js.undefined
    
    var onKeyDown: js.UndefOr[KeyboardType] = js.undefined
    
    var onLeft: js.UndefOr[KeyboardType] = js.undefined
    
    var onRight: js.UndefOr[KeyboardType] = js.undefined
    
    var onShift: js.UndefOr[KeyboardType] = js.undefined
    
    var onSpace: js.UndefOr[KeyboardType] = js.undefined
    
    var onTab: js.UndefOr[KeyboardType] = js.undefined
    
    var onUp: js.UndefOr[KeyboardType] = js.undefined
    
    var target: js.UndefOr[component | document] = js.undefined
  }
  object KeyboardProps {
    
    inline def apply(): KeyboardProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyboardProps]
    }
    
    extension [Self <: KeyboardProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnBackspace(value: /* event */ ReactKeyboardEventFrom[HTMLElement] => Callback): Self = StObject.set(x, "onBackspace", js.Any.fromFunction1((t0: /* event */ ReactKeyboardEventFrom[HTMLElement]) => value(t0).runNow()))
      
      inline def setOnBackspaceUndefined: Self = StObject.set(x, "onBackspace", js.undefined)
      
      inline def setOnComma(value: /* event */ ReactKeyboardEventFrom[HTMLElement] => Callback): Self = StObject.set(x, "onComma", js.Any.fromFunction1((t0: /* event */ ReactKeyboardEventFrom[HTMLElement]) => value(t0).runNow()))
      
      inline def setOnCommaUndefined: Self = StObject.set(x, "onComma", js.undefined)
      
      inline def setOnDown(value: /* event */ ReactKeyboardEventFrom[HTMLElement] => Callback): Self = StObject.set(x, "onDown", js.Any.fromFunction1((t0: /* event */ ReactKeyboardEventFrom[HTMLElement]) => value(t0).runNow()))
      
      inline def setOnDownUndefined: Self = StObject.set(x, "onDown", js.undefined)
      
      inline def setOnEnter(value: /* event */ ReactKeyboardEventFrom[HTMLElement] => Callback): Self = StObject.set(x, "onEnter", js.Any.fromFunction1((t0: /* event */ ReactKeyboardEventFrom[HTMLElement]) => value(t0).runNow()))
      
      inline def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
      
      inline def setOnEsc(value: /* event */ ReactKeyboardEventFrom[HTMLElement] => Callback): Self = StObject.set(x, "onEsc", js.Any.fromFunction1((t0: /* event */ ReactKeyboardEventFrom[HTMLElement]) => value(t0).runNow()))
      
      inline def setOnEscUndefined: Self = StObject.set(x, "onEsc", js.undefined)
      
      inline def setOnKeyDown(value: /* event */ ReactKeyboardEventFrom[HTMLElement] => Callback): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1((t0: /* event */ ReactKeyboardEventFrom[HTMLElement]) => value(t0).runNow()))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnLeft(value: /* event */ ReactKeyboardEventFrom[HTMLElement] => Callback): Self = StObject.set(x, "onLeft", js.Any.fromFunction1((t0: /* event */ ReactKeyboardEventFrom[HTMLElement]) => value(t0).runNow()))
      
      inline def setOnLeftUndefined: Self = StObject.set(x, "onLeft", js.undefined)
      
      inline def setOnRight(value: /* event */ ReactKeyboardEventFrom[HTMLElement] => Callback): Self = StObject.set(x, "onRight", js.Any.fromFunction1((t0: /* event */ ReactKeyboardEventFrom[HTMLElement]) => value(t0).runNow()))
      
      inline def setOnRightUndefined: Self = StObject.set(x, "onRight", js.undefined)
      
      inline def setOnShift(value: /* event */ ReactKeyboardEventFrom[HTMLElement] => Callback): Self = StObject.set(x, "onShift", js.Any.fromFunction1((t0: /* event */ ReactKeyboardEventFrom[HTMLElement]) => value(t0).runNow()))
      
      inline def setOnShiftUndefined: Self = StObject.set(x, "onShift", js.undefined)
      
      inline def setOnSpace(value: /* event */ ReactKeyboardEventFrom[HTMLElement] => Callback): Self = StObject.set(x, "onSpace", js.Any.fromFunction1((t0: /* event */ ReactKeyboardEventFrom[HTMLElement]) => value(t0).runNow()))
      
      inline def setOnSpaceUndefined: Self = StObject.set(x, "onSpace", js.undefined)
      
      inline def setOnTab(value: /* event */ ReactKeyboardEventFrom[HTMLElement] => Callback): Self = StObject.set(x, "onTab", js.Any.fromFunction1((t0: /* event */ ReactKeyboardEventFrom[HTMLElement]) => value(t0).runNow()))
      
      inline def setOnTabUndefined: Self = StObject.set(x, "onTab", js.undefined)
      
      inline def setOnUp(value: /* event */ ReactKeyboardEventFrom[HTMLElement] => Callback): Self = StObject.set(x, "onUp", js.Any.fromFunction1((t0: /* event */ ReactKeyboardEventFrom[HTMLElement]) => value(t0).runNow()))
      
      inline def setOnUpUndefined: Self = StObject.set(x, "onUp", js.undefined)
      
      inline def setTarget(value: component | document): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
}
