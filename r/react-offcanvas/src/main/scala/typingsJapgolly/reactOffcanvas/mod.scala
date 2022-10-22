package typingsJapgolly.reactOffcanvas

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactOffcanvas.reactOffcanvasStrings.left
import typingsJapgolly.reactOffcanvas.reactOffcanvasStrings.overlay
import typingsJapgolly.reactOffcanvas.reactOffcanvasStrings.parallax
import typingsJapgolly.reactOffcanvas.reactOffcanvasStrings.push
import typingsJapgolly.reactOffcanvas.reactOffcanvasStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-offcanvas", "OffCanvas")
  @js.native
  open class OffCanvas protected ()
    extends Component[OffCanvasProps, js.Object, Any] {
    def this(props: OffCanvasProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: OffCanvasProps, context: Any) = this()
  }
  
  @JSImport("react-offcanvas", "OffCanvasBody")
  @js.native
  open class OffCanvasBody protected ()
    extends Component[OffCanvasBodyProps, js.Object, Any] {
    def this(props: OffCanvasBodyProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: OffCanvasBodyProps, context: Any) = this()
  }
  
  @JSImport("react-offcanvas", "OffCanvasMenu")
  @js.native
  open class OffCanvasMenu protected ()
    extends Component[OffCanvasMenuProps, js.Object, Any] {
    def this(props: OffCanvasMenuProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: OffCanvasMenuProps, context: Any) = this()
  }
  
  trait OffCanvasBodyProps extends StObject {
    
    var children: Node
    
    var className: js.UndefOr[String] = js.undefined
    
    var isMenuOpened: js.UndefOr[Boolean] = js.undefined
    
    var position: js.UndefOr[left | right] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var transitionDuration: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object OffCanvasBodyProps {
    
    inline def apply(): OffCanvasBodyProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[OffCanvasBodyProps]
    }
    
    extension [Self <: OffCanvasBodyProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setIsMenuOpened(value: Boolean): Self = StObject.set(x, "isMenuOpened", value.asInstanceOf[js.Any])
      
      inline def setIsMenuOpenedUndefined: Self = StObject.set(x, "isMenuOpened", js.undefined)
      
      inline def setPosition(value: left | right): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTransitionDuration(value: Double): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
      
      inline def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait OffCanvasMenuProps extends StObject {
    
    var children: Node
    
    var className: js.UndefOr[String] = js.undefined
    
    var isMenuOpened: js.UndefOr[Boolean] = js.undefined
    
    var position: js.UndefOr[left | right] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var transitionDuration: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object OffCanvasMenuProps {
    
    inline def apply(): OffCanvasMenuProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[OffCanvasMenuProps]
    }
    
    extension [Self <: OffCanvasMenuProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setIsMenuOpened(value: Boolean): Self = StObject.set(x, "isMenuOpened", value.asInstanceOf[js.Any])
      
      inline def setIsMenuOpenedUndefined: Self = StObject.set(x, "isMenuOpened", js.undefined)
      
      inline def setPosition(value: left | right): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTransitionDuration(value: Double): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
      
      inline def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait OffCanvasProps extends StObject {
    
    var children: Node
    
    var effect: js.UndefOr[push | overlay | parallax] = js.undefined
    
    var isMenuOpened: js.UndefOr[Boolean] = js.undefined
    
    var position: js.UndefOr[left | right] = js.undefined
    
    var transitionDuration: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object OffCanvasProps {
    
    inline def apply(): OffCanvasProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[OffCanvasProps]
    }
    
    extension [Self <: OffCanvasProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setEffect(value: push | overlay | parallax): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
      
      inline def setEffectUndefined: Self = StObject.set(x, "effect", js.undefined)
      
      inline def setIsMenuOpened(value: Boolean): Self = StObject.set(x, "isMenuOpened", value.asInstanceOf[js.Any])
      
      inline def setIsMenuOpenedUndefined: Self = StObject.set(x, "isMenuOpened", js.undefined)
      
      inline def setPosition(value: left | right): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setTransitionDuration(value: Double): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
      
      inline def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
