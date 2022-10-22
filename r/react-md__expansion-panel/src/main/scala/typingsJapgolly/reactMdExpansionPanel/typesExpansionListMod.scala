package typingsJapgolly.reactMdExpansionPanel

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.KeyboardEventHandler
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesExpansionListMod {
  
  @JSImport("@react-md/expansion-panel/types/ExpansionList", "ExpansionList")
  @js.native
  val ExpansionList: ForwardRefExoticComponent[ExpansionListProps & RefAttributes[HTMLDivElement]] = js.native
  
  trait ExpansionListProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    /**
      * This should be 2 or more expansion panel components.
      */
    @JSName("children")
    var children_ExpansionListProps: Node
    
    /**
      * The keydown event handler that allows for focusing the next/previous panel
      * as well as the first/last with keyboard shortcuts. This is provided by the
      * `usePanels` hook automatically.
      */
    @JSName("onKeyDown")
    var onKeyDown_ExpansionListProps: KeyboardEventHandler[HTMLDivElement]
  }
  object ExpansionListProps {
    
    inline def apply(onKeyDown: ReactKeyboardEventFrom[HTMLDivElement & Element] => Callback): ExpansionListProps = {
      val __obj = js.Dynamic.literal(onKeyDown = js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLDivElement & Element]) => onKeyDown(t0).runNow()), children = null)
      __obj.asInstanceOf[ExpansionListProps]
    }
    
    extension [Self <: ExpansionListProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnKeyDown(value: ReactKeyboardEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    }
  }
}
