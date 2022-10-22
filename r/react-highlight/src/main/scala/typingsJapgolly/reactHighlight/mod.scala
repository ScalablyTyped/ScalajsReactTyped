package typingsJapgolly.reactHighlight

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.ComponentClassP
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-highlight", JSImport.Default)
  @js.native
  open class default protected ()
    extends Component[HighlightProps, js.Object, Any] {
    def this(props: HighlightProps) = this()
    def this(props: HighlightProps, context: Any) = this()
  }
  /**
    * Visually prettifies child code with highlight.js.
    */
  @JSImport("react-highlight", JSImport.Default)
  @js.native
  val default: ComponentClassP[HighlightProps & js.Object] = js.native
  
  trait HighlightProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    /**
      * Language name to use as a class to signal type to highlight.js.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Set innerHTML=true to highlight multiple code snippets at a time.
      */
    var innerHTML: js.UndefOr[Boolean] = js.undefined
  }
  object HighlightProps {
    
    inline def apply(): HighlightProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HighlightProps]
    }
    
    extension [Self <: HighlightProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setInnerHTML(value: Boolean): Self = StObject.set(x, "innerHTML", value.asInstanceOf[js.Any])
      
      inline def setInnerHTMLUndefined: Self = StObject.set(x, "innerHTML", js.undefined)
    }
  }
  
  type _To = ComponentClassP[HighlightProps & js.Object]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ComponentClassP[HighlightProps & js.Object] = default
}
