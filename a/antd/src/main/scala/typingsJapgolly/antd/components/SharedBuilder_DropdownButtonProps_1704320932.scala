package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLButtonElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antd.anon.Delay
import typingsJapgolly.antd.antdStrings.click
import typingsJapgolly.antd.antdStrings.contextMenu
import typingsJapgolly.antd.antdStrings.hover
import typingsJapgolly.antd.libButtonButtonMod.ButtonHTMLType
import typingsJapgolly.antd.libConfigProviderSizeContextMod.SizeType
import typingsJapgolly.antd.libDropdownDropdownButtonMod.DropdownButtonType
import typingsJapgolly.antd.libDropdownDropdownMod.Align
import typingsJapgolly.antd.libDropdownDropdownMod.DropdownArrowOptions
import typingsJapgolly.antd.libDropdownDropdownMod.Placement
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_DropdownButtonProps_1704320932 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def align(value: Align): this.type = set("align", value.asInstanceOf[js.Any])
  
  inline def arrow(value: Boolean | DropdownArrowOptions): this.type = set("arrow", value.asInstanceOf[js.Any])
  
  inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
  
  inline def buttonsRender(
    value: /* buttons */ js.Array[japgolly.scalajs.react.facade.React.Node] => js.Array[japgolly.scalajs.react.facade.React.Node]
  ): this.type = set("buttonsRender", js.Any.fromFunction1(value))
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def danger(value: Boolean): this.type = set("danger", value.asInstanceOf[js.Any])
  
  inline def destroyPopupOnHide(value: Boolean): this.type = set("destroyPopupOnHide", value.asInstanceOf[js.Any])
  
  inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  
  inline def forceRender(value: Boolean): this.type = set("forceRender", value.asInstanceOf[js.Any])
  
  inline def getPopupContainer(value: /* triggerNode */ HTMLElement => HTMLElement): this.type = set("getPopupContainer", js.Any.fromFunction1(value))
  
  inline def href(value: String): this.type = set("href", value.asInstanceOf[js.Any])
  
  inline def htmlType(value: ButtonHTMLType): this.type = set("htmlType", value.asInstanceOf[js.Any])
  
  inline def icon(value: VdomNode): this.type = set("icon", value.rawNode.asInstanceOf[js.Any])
  
  inline def iconNull: this.type = set("icon", null)
  
  inline def iconVarargs(
    value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*
  ): this.type = set("icon", js.Array(value*))
  
  inline def iconVdomElement(value: VdomElement): this.type = set("icon", value.rawElement.asInstanceOf[js.Any])
  
  inline def loading(value: Boolean | Delay): this.type = set("loading", value.asInstanceOf[js.Any])
  
  inline def mouseEnterDelay(value: Double): this.type = set("mouseEnterDelay", value.asInstanceOf[js.Any])
  
  inline def mouseLeaveDelay(value: Double): this.type = set("mouseLeaveDelay", value.asInstanceOf[js.Any])
  
  inline def onClick(value: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
  
  inline def onOpenChange(value: /* open */ Boolean => Callback): this.type = set("onOpenChange", js.Any.fromFunction1((t0: /* open */ Boolean) => value(t0).runNow()))
  
  inline def onVisibleChange(value: /* visible */ Boolean => Callback): this.type = set("onVisibleChange", js.Any.fromFunction1((t0: /* visible */ Boolean) => value(t0).runNow()))
  
  inline def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
  
  inline def openClassName(value: String): this.type = set("openClassName", value.asInstanceOf[js.Any])
  
  inline def overlayClassName(value: String): this.type = set("overlayClassName", value.asInstanceOf[js.Any])
  
  inline def overlayStyle(value: CSSProperties): this.type = set("overlayStyle", value.asInstanceOf[js.Any])
  
  inline def placement(value: Placement): this.type = set("placement", value.asInstanceOf[js.Any])
  
  inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  
  inline def size(value: SizeType): this.type = set("size", value.asInstanceOf[js.Any])
  
  inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  
  inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
  
  inline def transitionName(value: String): this.type = set("transitionName", value.asInstanceOf[js.Any])
  
  inline def trigger(value: js.Array[click | hover | contextMenu]): this.type = set("trigger", value.asInstanceOf[js.Any])
  
  inline def triggerVarargs(value: (click | hover | contextMenu)*): this.type = set("trigger", js.Array(value*))
  
  inline def `type`(value: DropdownButtonType): this.type = set("type", value.asInstanceOf[js.Any])
  
  inline def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
}
