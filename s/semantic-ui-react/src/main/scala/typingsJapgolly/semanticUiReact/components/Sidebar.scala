package typingsJapgolly.semanticUiReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.RefHandle
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.Document
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Window
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticShorthandContent
import typingsJapgolly.semanticUiReact.distCommonjsModulesSidebarSidebarMod.SidebarProps
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

object Sidebar {
  
  object Pushable {
    
    @JSImport("semantic-ui-react", "Sidebar.Pushable")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Pushable.type): SharedBuilder_SidebarPushableProps792597811 = new SharedBuilder_SidebarPushableProps792597811(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: SidebarPushableProps): SharedBuilder_SidebarPushableProps792597811 = new SharedBuilder_SidebarPushableProps792597811(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Pusher {
    
    @JSImport("semantic-ui-react", "Sidebar.Pusher")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Pusher.type): SharedBuilder_SidebarPusherProps_1427531895 = new SharedBuilder_SidebarPusherProps_1427531895(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: SidebarPusherProps): SharedBuilder_SidebarPusherProps_1427531895 = new SharedBuilder_SidebarPusherProps_1427531895(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("semantic-ui-react", "Sidebar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def animation(value: overlay | push | (`scale down`) | uncover | (`slide out`) | (`slide along`)): this.type = set("animation", value.asInstanceOf[js.Any])
    
    inline def as(value: Any): this.type = set("as", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def content(value: SemanticShorthandContent): this.type = set("content", value.asInstanceOf[js.Any])
    
    inline def contentNull: this.type = set("content", null)
    
    inline def contentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("content", js.Array(value*))
    
    inline def contentVdomElement(value: VdomElement): this.type = set("content", value.rawElement.asInstanceOf[js.Any])
    
    inline def direction(value: top | right | bottom | left): this.type = set("direction", value.asInstanceOf[js.Any])
    
    inline def onHidden(value: (/* event */ ReactMouseEventFrom[HTMLElement], /* data */ SidebarProps) => Callback): this.type = set("onHidden", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLElement], t1: /* data */ SidebarProps) => (value(t0, t1)).runNow()))
    
    inline def onHide(value: (/* event */ ReactMouseEventFrom[HTMLElement], /* data */ SidebarProps) => Callback): this.type = set("onHide", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLElement], t1: /* data */ SidebarProps) => (value(t0, t1)).runNow()))
    
    inline def onShow(value: (/* event */ ReactMouseEventFrom[HTMLElement], /* data */ SidebarProps) => Callback): this.type = set("onShow", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLElement], t1: /* data */ SidebarProps) => (value(t0, t1)).runNow()))
    
    inline def onVisible(value: (/* event */ ReactMouseEventFrom[HTMLElement], /* data */ SidebarProps) => Callback): this.type = set("onVisible", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLElement], t1: /* data */ SidebarProps) => (value(t0, t1)).runNow()))
    
    inline def target(value: Document | Window | HTMLElement | RefHandle[HTMLElement]): this.type = set("target", value.asInstanceOf[js.Any])
    
    inline def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
    
    inline def width(value: (`very thin`) | thin | wide | (`very wide`)): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Sidebar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SidebarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
