package typingsJapgolly.reactShowMoreText

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-show-more-text", JSImport.Default)
  @js.native
  open class default protected () extends ReactShowMoreText {
    def this(props: ReactShowMoreTextProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ReactShowMoreTextProps, context: Any) = this()
  }
  
  @JSImport("react-show-more-text", "ReactShowMoreText")
  @js.native
  open class ReactShowMoreText protected ()
    extends Component[ReactShowMoreTextProps, js.Object, Any] {
    def this(props: ReactShowMoreTextProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ReactShowMoreTextProps, context: Any) = this()
  }
  
  trait ReactShowMoreTextProps extends StObject {
    
    var anchorClass: js.UndefOr[String] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var expanded: js.UndefOr[Boolean] = js.undefined
    
    var keepNewLines: js.UndefOr[Boolean] = js.undefined
    
    var less: js.UndefOr[Node] = js.undefined
    
    var lines: js.UndefOr[Double] = js.undefined
    
    var more: js.UndefOr[Node] = js.undefined
    
    var onClick: js.UndefOr[js.Function1[/* expanded */ Boolean, Unit]] = js.undefined
    
    var truncatedEndingComponent: js.UndefOr[Node] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object ReactShowMoreTextProps {
    
    inline def apply(): ReactShowMoreTextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactShowMoreTextProps]
    }
    
    extension [Self <: ReactShowMoreTextProps](x: Self) {
      
      inline def setAnchorClass(value: String): Self = StObject.set(x, "anchorClass", value.asInstanceOf[js.Any])
      
      inline def setAnchorClassUndefined: Self = StObject.set(x, "anchorClass", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
      
      inline def setKeepNewLines(value: Boolean): Self = StObject.set(x, "keepNewLines", value.asInstanceOf[js.Any])
      
      inline def setKeepNewLinesUndefined: Self = StObject.set(x, "keepNewLines", js.undefined)
      
      inline def setLess(value: VdomNode): Self = StObject.set(x, "less", value.rawNode.asInstanceOf[js.Any])
      
      inline def setLessNull: Self = StObject.set(x, "less", null)
      
      inline def setLessUndefined: Self = StObject.set(x, "less", js.undefined)
      
      inline def setLessVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "less", js.Array(value*))
      
      inline def setLessVdomElement(value: VdomElement): Self = StObject.set(x, "less", value.rawElement.asInstanceOf[js.Any])
      
      inline def setLines(value: Double): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      inline def setLinesUndefined: Self = StObject.set(x, "lines", js.undefined)
      
      inline def setMore(value: VdomNode): Self = StObject.set(x, "more", value.rawNode.asInstanceOf[js.Any])
      
      inline def setMoreNull: Self = StObject.set(x, "more", null)
      
      inline def setMoreUndefined: Self = StObject.set(x, "more", js.undefined)
      
      inline def setMoreVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "more", js.Array(value*))
      
      inline def setMoreVdomElement(value: VdomElement): Self = StObject.set(x, "more", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnClick(value: /* expanded */ Boolean => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: /* expanded */ Boolean) => value(t0).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setTruncatedEndingComponent(value: VdomNode): Self = StObject.set(x, "truncatedEndingComponent", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTruncatedEndingComponentNull: Self = StObject.set(x, "truncatedEndingComponent", null)
      
      inline def setTruncatedEndingComponentUndefined: Self = StObject.set(x, "truncatedEndingComponent", js.undefined)
      
      inline def setTruncatedEndingComponentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "truncatedEndingComponent", js.Array(value*))
      
      inline def setTruncatedEndingComponentVdomElement(value: VdomElement): Self = StObject.set(x, "truncatedEndingComponent", value.rawElement.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
