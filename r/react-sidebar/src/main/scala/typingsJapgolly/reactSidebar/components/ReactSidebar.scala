package typingsJapgolly.reactSidebar.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactSidebar.mod.SidebarProps
import typingsJapgolly.reactSidebar.mod.SidebarStyles
import typingsJapgolly.reactSidebar.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactSidebar {
  
  @JSImport("react-sidebar", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def contentClassName(value: String): this.type = set("contentClassName", value.asInstanceOf[js.Any])
    
    inline def contentId(value: String): this.type = set("contentId", value.asInstanceOf[js.Any])
    
    inline def defaultSidebarWidth(value: Double): this.type = set("defaultSidebarWidth", value.asInstanceOf[js.Any])
    
    inline def docked(value: Boolean): this.type = set("docked", value.asInstanceOf[js.Any])
    
    inline def dragToggleDistance(value: Double): this.type = set("dragToggleDistance", value.asInstanceOf[js.Any])
    
    inline def onSetOpen(value: /* open */ Boolean => Callback): this.type = set("onSetOpen", js.Any.fromFunction1((t0: /* open */ Boolean) => value(t0).runNow()))
    
    inline def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
    
    inline def overlayClassName(value: String): this.type = set("overlayClassName", value.asInstanceOf[js.Any])
    
    inline def overlayId(value: String): this.type = set("overlayId", value.asInstanceOf[js.Any])
    
    inline def pullRight(value: Boolean): this.type = set("pullRight", value.asInstanceOf[js.Any])
    
    inline def rootClassName(value: String): this.type = set("rootClassName", value.asInstanceOf[js.Any])
    
    inline def rootId(value: String): this.type = set("rootId", value.asInstanceOf[js.Any])
    
    inline def shadow(value: Boolean): this.type = set("shadow", value.asInstanceOf[js.Any])
    
    inline def sidebar(value: VdomNode): this.type = set("sidebar", value.rawNode.asInstanceOf[js.Any])
    
    inline def sidebarClassName(value: String): this.type = set("sidebarClassName", value.asInstanceOf[js.Any])
    
    inline def sidebarId(value: String): this.type = set("sidebarId", value.asInstanceOf[js.Any])
    
    inline def sidebarNull: this.type = set("sidebar", null)
    
    inline def sidebarVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("sidebar", js.Array(value*))
    
    inline def sidebarVdomElement(value: VdomElement): this.type = set("sidebar", value.rawElement.asInstanceOf[js.Any])
    
    inline def styles(value: SidebarStyles): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def touch(value: Boolean): this.type = set("touch", value.asInstanceOf[js.Any])
    
    inline def touchHandleWidth(value: Double): this.type = set("touchHandleWidth", value.asInstanceOf[js.Any])
    
    inline def transitions(value: Boolean): this.type = set("transitions", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactSidebar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SidebarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
