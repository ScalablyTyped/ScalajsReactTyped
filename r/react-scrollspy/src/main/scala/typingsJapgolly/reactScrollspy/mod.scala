package typingsJapgolly.reactScrollspy

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-scrollspy", JSImport.Default)
  @js.native
  open class default () extends Scrollspy
  
  @js.native
  trait Scrollspy
    extends Component[ScrollspyProps, js.Object, Any] {
    
    // Remove event listener of scrollspy.
    def offEvent(): Unit = js.native
    
    // Add event listener of scrollspy.
    def onEvent(): Unit = js.native
  }
  
  trait ScrollspyProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    // ClassName attribute to be passed to the generated <ul /> element
    var className: js.UndefOr[String] = js.undefined
    
    // HTML tag for Scrollspy component if you want to use other than ul
    var componentTag: js.UndefOr[String | ComponentType[js.Object]] = js.undefined
    
    // Class name that apply to the navigation element paired with the content element in viewport
    var currentClassName: String
    
    // Array of target element IDs
    var items: js.Array[String]
    
    // Offset value that adjusts to determine the elements are in the viewport
    var offset: js.UndefOr[Double] = js.undefined
    
    // Function to be executed when the active item has been updated
    var onUpdate: js.UndefOr[js.Function1[/* item */ HTMLElement, Unit]] = js.undefined
    
    // Selector for the element of scrollable container that can be used with querySelector
    var rootEl: js.UndefOr[String] = js.undefined
    
    // Class name that apply to the navigation elements that have been scrolled past
    var scrolledPastClassName: js.UndefOr[String] = js.undefined
    
    // Style attribute to be passed to the generated <ul /> element
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object ScrollspyProps {
    
    inline def apply(currentClassName: String, items: js.Array[String]): ScrollspyProps = {
      val __obj = js.Dynamic.literal(currentClassName = currentClassName.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollspyProps]
    }
    
    extension [Self <: ScrollspyProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setComponentTag(value: String | ComponentType[js.Object]): Self = StObject.set(x, "componentTag", value.asInstanceOf[js.Any])
      
      inline def setComponentTagUndefined: Self = StObject.set(x, "componentTag", js.undefined)
      
      inline def setCurrentClassName(value: String): Self = StObject.set(x, "currentClassName", value.asInstanceOf[js.Any])
      
      inline def setItems(value: js.Array[String]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: String*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOnUpdate(value: /* item */ HTMLElement => Callback): Self = StObject.set(x, "onUpdate", js.Any.fromFunction1((t0: /* item */ HTMLElement) => value(t0).runNow()))
      
      inline def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
      
      inline def setRootEl(value: String): Self = StObject.set(x, "rootEl", value.asInstanceOf[js.Any])
      
      inline def setRootElUndefined: Self = StObject.set(x, "rootEl", js.undefined)
      
      inline def setScrolledPastClassName(value: String): Self = StObject.set(x, "scrolledPastClassName", value.asInstanceOf[js.Any])
      
      inline def setScrolledPastClassNameUndefined: Self = StObject.set(x, "scrolledPastClassName", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
