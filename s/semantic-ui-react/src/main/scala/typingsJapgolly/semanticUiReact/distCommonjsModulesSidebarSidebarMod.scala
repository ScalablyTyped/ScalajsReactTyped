package typingsJapgolly.semanticUiReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.facade.React.RefHandle
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Document
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Window
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentClass
import typingsJapgolly.react.mod.FC
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticShorthandContent
import typingsJapgolly.semanticUiReact.distCommonjsModulesSidebarSidebarPushableMod.SidebarPushableProps
import typingsJapgolly.semanticUiReact.distCommonjsModulesSidebarSidebarPusherMod.SidebarPusherProps
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.`scale down`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.`slide along`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.`slide out`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.`very thin`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.`very wide`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.bottom
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.left
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.overlay
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.push
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.right
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.thin
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.top
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.uncover
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.wide
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsModulesSidebarSidebarMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/modules/Sidebar/Sidebar", JSImport.Default)
  @js.native
  open class default protected ()
    extends Component[SidebarProps, js.Object, Any] {
    def this(props: SidebarProps) = this()
    def this(props: SidebarProps, context: Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/modules/Sidebar/Sidebar", JSImport.Default)
  @js.native
  val default: SidebarComponent = js.native
  
  @js.native
  trait SidebarComponent
    extends StObject
       with ComponentClass[SidebarProps, js.Object] {
    
    var Pushable: FC[SidebarPushableProps] = js.native
    
    var Pusher: FC[SidebarPusherProps] = js.native
  }
  
  trait SidebarProps
    extends StObject
       with StrictSidebarProps
       with /* key */ StringDictionary[Any]
  object SidebarProps {
    
    inline def apply(): SidebarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SidebarProps]
    }
  }
  
  trait StrictSidebarProps extends StObject {
    
    /** Animation style. */
    var animation: js.UndefOr[overlay | push | (`scale down`) | uncover | (`slide out`) | (`slide along`)] = js.undefined
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[Node] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
    
    /** Direction the sidebar should appear on. */
    var direction: js.UndefOr[top | right | bottom | left] = js.undefined
    
    /**
      * Called after a sidebar has finished animating out.
      *
      * @param {null}
      * @param {object} data - All props.
      */
    var onHidden: js.UndefOr[
        js.Function2[/* event */ ReactMouseEventFrom[HTMLElement], /* data */ SidebarProps, Unit]
      ] = js.undefined
    
    /**
      * Called before a sidebar begins to animate out.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    var onHide: js.UndefOr[
        js.Function2[/* event */ ReactMouseEventFrom[HTMLElement], /* data */ SidebarProps, Unit]
      ] = js.undefined
    
    /**
      * Called when a sidebar has finished animating in.
      *
      * @param {null}
      * @param {object} data - All props.
      */
    var onShow: js.UndefOr[
        js.Function2[/* event */ ReactMouseEventFrom[HTMLElement], /* data */ SidebarProps, Unit]
      ] = js.undefined
    
    /**
      * Called when a sidebar begins animating in.
      *
      * @param {null}
      * @param {object} data - All props.
      */
    var onVisible: js.UndefOr[
        js.Function2[/* event */ ReactMouseEventFrom[HTMLElement], /* data */ SidebarProps, Unit]
      ] = js.undefined
    
    /** A sidebar can handle clicks on the passed element. */
    var target: js.UndefOr[Document | Window | HTMLElement | RefHandle[HTMLElement]] = js.undefined
    
    /** Controls whether or not the sidebar is visible on the page. */
    var visible: js.UndefOr[Boolean] = js.undefined
    
    /** Sidebar width. */
    var width: js.UndefOr[(`very thin`) | thin | wide | (`very wide`)] = js.undefined
  }
  object StrictSidebarProps {
    
    inline def apply(): StrictSidebarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictSidebarProps]
    }
    
    extension [Self <: StrictSidebarProps](x: Self) {
      
      inline def setAnimation(value: overlay | push | (`scale down`) | uncover | (`slide out`) | (`slide along`)): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentNull: Self = StObject.set(x, "content", null)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setContentVdomElement(value: VdomElement): Self = StObject.set(x, "content", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDirection(value: top | right | bottom | left): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setOnHidden(value: (/* event */ ReactMouseEventFrom[HTMLElement], /* data */ SidebarProps) => Callback): Self = StObject.set(x, "onHidden", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLElement], t1: /* data */ SidebarProps) => (value(t0, t1)).runNow()))
      
      inline def setOnHiddenUndefined: Self = StObject.set(x, "onHidden", js.undefined)
      
      inline def setOnHide(value: (/* event */ ReactMouseEventFrom[HTMLElement], /* data */ SidebarProps) => Callback): Self = StObject.set(x, "onHide", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLElement], t1: /* data */ SidebarProps) => (value(t0, t1)).runNow()))
      
      inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      inline def setOnShow(value: (/* event */ ReactMouseEventFrom[HTMLElement], /* data */ SidebarProps) => Callback): Self = StObject.set(x, "onShow", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLElement], t1: /* data */ SidebarProps) => (value(t0, t1)).runNow()))
      
      inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      inline def setOnVisible(value: (/* event */ ReactMouseEventFrom[HTMLElement], /* data */ SidebarProps) => Callback): Self = StObject.set(x, "onVisible", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLElement], t1: /* data */ SidebarProps) => (value(t0, t1)).runNow()))
      
      inline def setOnVisibleUndefined: Self = StObject.set(x, "onVisible", js.undefined)
      
      inline def setTarget(value: Document | Window | HTMLElement | RefHandle[HTMLElement]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setWidth(value: (`very thin`) | thin | wide | (`very wide`)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  type _To = SidebarComponent
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsModulesSidebarSidebarMod.foo` */
  override def _to: SidebarComponent = default
}
