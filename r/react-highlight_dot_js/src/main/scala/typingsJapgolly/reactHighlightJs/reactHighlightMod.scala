package typingsJapgolly.reactHighlightJs

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.ComponentClassP
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object reactHighlightMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-highlight", JSImport.Default)
  @js.native
  open class default protected ()
    extends Component[HighlightProps, js.Object, Any] {
    def this(props: HighlightProps) = this()
    def this(props: HighlightProps, context: Any) = this()
  }
  /**
    * A lightweight React wrapper around the Highlight.js syntax highlighting library.
    */
  @JSImport("react-highlight", JSImport.Default)
  @js.native
  val default: ComponentClassP[HighlightProps & js.Object] = js.native
  
  trait HighlightProps extends StObject {
    
    /**
      * Content that will be highlighted
      */
    var children: js.UndefOr[Node] = js.undefined
    
    /**
      * Language name to use as a class to signal type to highlight.js.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Language name to use as a class to signal type to highlight.js.
      */
    var language: String
    
    /**
      * Inline styles to apply to the rendered <pre> tag.
      */
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object HighlightProps {
    
    inline def apply(language: String): HighlightProps = {
      val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any])
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
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type _To = ComponentClassP[HighlightProps & js.Object]
  
  /* This means you don't have to write `default`, but can instead just say `reactHighlightMod.foo` */
  override def _to: ComponentClassP[HighlightProps & js.Object] = default
}
