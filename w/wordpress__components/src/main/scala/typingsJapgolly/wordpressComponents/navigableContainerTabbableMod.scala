package typingsJapgolly.wordpressComponents

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.HTMLProps
import typingsJapgolly.wordpressComponents.navigableContainerTabbableMod.TabbableContainer.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navigableContainerTabbableMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/components/navigable-container/tabbable", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object TabbableContainer {
    
    trait Props
      extends StObject
         with HTMLProps[HTMLDivElement] {
      
      @JSName("children")
      var children_Props: Node
      
      /**
        * A boolean which tells the component whether or not to cycle from the
        * end back to the beginning and vice versa.
        * @defaultValue true
        */
      var cycle: js.UndefOr[Boolean] = js.undefined
      
      /**
        * A callback invoked when the menu navigates to one of its children
        * passing the index and child as an argument.
        */
      var onNavigate: js.UndefOr[js.Function2[/* nextIndex */ Double, /* focusedElement */ HTMLElement, Unit]] = js.undefined
    }
    object Props {
      
      inline def apply(): Props = {
        val __obj = js.Dynamic.literal(children = null)
        __obj.asInstanceOf[Props]
      }
      
      extension [Self <: Props](x: Self) {
        
        inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
        
        inline def setChildrenNull: Self = StObject.set(x, "children", null)
        
        inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
        
        inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
        
        inline def setCycle(value: Boolean): Self = StObject.set(x, "cycle", value.asInstanceOf[js.Any])
        
        inline def setCycleUndefined: Self = StObject.set(x, "cycle", js.undefined)
        
        inline def setOnNavigate(value: (/* nextIndex */ Double, /* focusedElement */ HTMLElement) => Callback): Self = StObject.set(x, "onNavigate", js.Any.fromFunction2((t0: /* nextIndex */ Double, t1: /* focusedElement */ HTMLElement) => (value(t0, t1)).runNow()))
        
        inline def setOnNavigateUndefined: Self = StObject.set(x, "onNavigate", js.undefined)
      }
    }
  }
}
