package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antd.antdStrings.click
import typingsJapgolly.antd.antdStrings.contextMenu
import typingsJapgolly.antd.antdStrings.hover
import typingsJapgolly.antd.libDropdownDropdownButtonMod.DropdownButtonProps
import typingsJapgolly.antd.libDropdownDropdownMod.Align
import typingsJapgolly.antd.libDropdownDropdownMod.DropdownArrowOptions
import typingsJapgolly.antd.libDropdownDropdownMod.DropdownProps
import typingsJapgolly.antd.libDropdownDropdownMod.OverlayFunc
import typingsJapgolly.antd.libDropdownDropdownMod.Placement
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Dropdown {
  
  inline def apply(overlay: japgolly.scalajs.react.facade.React.Element | OverlayFunc): Builder = {
    val __props = js.Dynamic.literal(overlay = overlay.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[DropdownProps]))
  }
  
  object Button {
    
    inline def apply(overlay: japgolly.scalajs.react.facade.React.Element | OverlayFunc): SharedBuilder_DropdownButtonProps_1704320932 = {
      val __props = js.Dynamic.literal(overlay = overlay.asInstanceOf[js.Any])
      new SharedBuilder_DropdownButtonProps_1704320932(js.Array(this.component, __props.asInstanceOf[DropdownButtonProps]))
    }
    
    @JSImport("antd", "Dropdown.Button")
    @js.native
    val component: js.Object = js.native
    
    def withProps(p: DropdownButtonProps): SharedBuilder_DropdownButtonProps_1704320932 = new SharedBuilder_DropdownButtonProps_1704320932(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("antd", "Dropdown")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def align(value: Align): this.type = set("align", value.asInstanceOf[js.Any])
    
    inline def arrow(value: Boolean | DropdownArrowOptions): this.type = set("arrow", value.asInstanceOf[js.Any])
    
    inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def destroyPopupOnHide(value: Boolean): this.type = set("destroyPopupOnHide", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def forceRender(value: Boolean): this.type = set("forceRender", value.asInstanceOf[js.Any])
    
    inline def getPopupContainer(value: /* triggerNode */ HTMLElement => HTMLElement): this.type = set("getPopupContainer", js.Any.fromFunction1(value))
    
    inline def mouseEnterDelay(value: Double): this.type = set("mouseEnterDelay", value.asInstanceOf[js.Any])
    
    inline def mouseLeaveDelay(value: Double): this.type = set("mouseLeaveDelay", value.asInstanceOf[js.Any])
    
    inline def onOpenChange(value: /* open */ Boolean => Callback): this.type = set("onOpenChange", js.Any.fromFunction1((t0: /* open */ Boolean) => value(t0).runNow()))
    
    inline def onVisibleChange(value: /* visible */ Boolean => Callback): this.type = set("onVisibleChange", js.Any.fromFunction1((t0: /* visible */ Boolean) => value(t0).runNow()))
    
    inline def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
    
    inline def openClassName(value: String): this.type = set("openClassName", value.asInstanceOf[js.Any])
    
    inline def overlayClassName(value: String): this.type = set("overlayClassName", value.asInstanceOf[js.Any])
    
    inline def overlayStyle(value: CSSProperties): this.type = set("overlayStyle", value.asInstanceOf[js.Any])
    
    inline def placement(value: Placement): this.type = set("placement", value.asInstanceOf[js.Any])
    
    inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    inline def transitionName(value: String): this.type = set("transitionName", value.asInstanceOf[js.Any])
    
    inline def trigger(value: js.Array[click | hover | contextMenu]): this.type = set("trigger", value.asInstanceOf[js.Any])
    
    inline def triggerVarargs(value: (click | hover | contextMenu)*): this.type = set("trigger", js.Array(value*))
    
    inline def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DropdownProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
