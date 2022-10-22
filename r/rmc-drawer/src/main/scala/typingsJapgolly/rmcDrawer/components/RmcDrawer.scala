package typingsJapgolly.rmcDrawer.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.rmcDrawer.anon.OverlayClicked
import typingsJapgolly.rmcDrawer.anon.PartialDrawerProps
import typingsJapgolly.rmcDrawer.mod.^
import typingsJapgolly.rmcDrawer.rmcDrawerStrings.bottom
import typingsJapgolly.rmcDrawer.rmcDrawerStrings.left
import typingsJapgolly.rmcDrawer.rmcDrawerStrings.right
import typingsJapgolly.rmcDrawer.rmcDrawerStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RmcDrawer {
  
  @JSImport("rmc-drawer", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[^] {
    
    inline def children(value: Node | js.Array[Node]): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def childrenNull: this.type = set("children", null)
    
    inline def childrenVarargs(value: (Element | Empty | JsNumber | Node | String)*): this.type = set("children", js.Array(value*))
    
    inline def childrenVdomElement(value: VdomElement): this.type = set("children", value.rawElement.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def contentStyle(value: CSSProperties): this.type = set("contentStyle", value.asInstanceOf[js.Any])
    
    inline def docked(value: Boolean): this.type = set("docked", value.asInstanceOf[js.Any])
    
    inline def dragHandleStyle(value: CSSProperties): this.type = set("dragHandleStyle", value.asInstanceOf[js.Any])
    
    inline def dragToggleDistance(value: Double): this.type = set("dragToggleDistance", value.asInstanceOf[js.Any])
    
    inline def enableDragHandle(value: Boolean): this.type = set("enableDragHandle", value.asInstanceOf[js.Any])
    
    inline def onOpenChange(value: (/* open */ Boolean, /* overlay */ js.UndefOr[OverlayClicked]) => Callback): this.type = set("onOpenChange", js.Any.fromFunction2((t0: /* open */ Boolean, t1: /* overlay */ js.UndefOr[OverlayClicked]) => (value(t0, t1)).runNow()))
    
    inline def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
    
    inline def overlayStyle(value: CSSProperties): this.type = set("overlayStyle", value.asInstanceOf[js.Any])
    
    inline def position(value: left | right | top | bottom): this.type = set("position", value.asInstanceOf[js.Any])
    
    inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    inline def sidebar(value: VdomNode): this.type = set("sidebar", value.rawNode.asInstanceOf[js.Any])
    
    inline def sidebarNull: this.type = set("sidebar", null)
    
    inline def sidebarStyle(value: CSSProperties): this.type = set("sidebarStyle", value.asInstanceOf[js.Any])
    
    inline def sidebarVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("sidebar", js.Array(value*))
    
    inline def sidebarVdomElement(value: VdomElement): this.type = set("sidebar", value.rawElement.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def touch(value: Boolean): this.type = set("touch", value.asInstanceOf[js.Any])
    
    inline def transitions(value: Boolean): this.type = set("transitions", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: RmcDrawer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PartialDrawerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
