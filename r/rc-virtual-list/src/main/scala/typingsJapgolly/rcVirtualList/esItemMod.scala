package typingsJapgolly.rcVirtualList

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esItemMod {
  
  @JSImport("rc-virtual-list/es/Item", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Item(hasChildrenSetRef: ItemProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Item")(hasChildrenSetRef.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait ItemProps extends StObject {
    
    var children: Element
    
    def setRef(element: HTMLElement): Unit
  }
  object ItemProps {
    
    inline def apply(children: VdomElement, setRef: HTMLElement => Callback): ItemProps = {
      val __obj = js.Dynamic.literal(children = children.rawElement.asInstanceOf[js.Any], setRef = js.Any.fromFunction1((t0: HTMLElement) => setRef(t0).runNow()))
      __obj.asInstanceOf[ItemProps]
    }
    
    extension [Self <: ItemProps](x: Self) {
      
      inline def setChildren(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setSetRef(value: HTMLElement => Callback): Self = StObject.set(x, "setRef", js.Any.fromFunction1((t0: HTMLElement) => value(t0).runNow()))
    }
  }
}
