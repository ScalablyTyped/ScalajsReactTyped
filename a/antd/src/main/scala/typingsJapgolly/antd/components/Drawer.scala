package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antd.libDrawerMod.DrawerProps
import typingsJapgolly.antd.libDrawerMod.sizeType
import typingsJapgolly.rcComponentPortal.esPortalMod.GetContainer
import typingsJapgolly.rcDrawer.esDrawerPopupMod.Placement
import typingsJapgolly.rcDrawer.esDrawerPopupMod.PushConfig
import typingsJapgolly.rcMotion.esCssmotionMod.CSSMotionProps
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Drawer {
  
  @JSImport("antd", "Drawer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def afterOpenChange(value: /* open */ Boolean => Callback): this.type = set("afterOpenChange", js.Any.fromFunction1((t0: /* open */ Boolean) => value(t0).runNow()))
    
    inline def afterVisibleChange(value: /* visible */ Boolean => Callback): this.type = set("afterVisibleChange", js.Any.fromFunction1((t0: /* visible */ Boolean) => value(t0).runNow()))
    
    inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    inline def bodyStyle(value: CSSProperties): this.type = set("bodyStyle", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def closable(value: Boolean): this.type = set("closable", value.asInstanceOf[js.Any])
    
    inline def closeIcon(value: VdomNode): this.type = set("closeIcon", value.rawNode.asInstanceOf[js.Any])
    
    inline def closeIconNull: this.type = set("closeIcon", null)
    
    inline def closeIconVarargs(
      value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*
    ): this.type = set("closeIcon", js.Array(value*))
    
    inline def closeIconVdomElement(value: VdomElement): this.type = set("closeIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def contentWrapperStyle(value: CSSProperties): this.type = set("contentWrapperStyle", value.asInstanceOf[js.Any])
    
    inline def destroyOnClose(value: Boolean): this.type = set("destroyOnClose", value.asInstanceOf[js.Any])
    
    inline def drawerStyle(value: CSSProperties): this.type = set("drawerStyle", value.asInstanceOf[js.Any])
    
    inline def extra(value: VdomNode): this.type = set("extra", value.rawNode.asInstanceOf[js.Any])
    
    inline def extraNull: this.type = set("extra", null)
    
    inline def extraVarargs(
      value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*
    ): this.type = set("extra", js.Array(value*))
    
    inline def extraVdomElement(value: VdomElement): this.type = set("extra", value.rawElement.asInstanceOf[js.Any])
    
    inline def footer(value: VdomNode): this.type = set("footer", value.rawNode.asInstanceOf[js.Any])
    
    inline def footerNull: this.type = set("footer", null)
    
    inline def footerStyle(value: CSSProperties): this.type = set("footerStyle", value.asInstanceOf[js.Any])
    
    inline def footerVarargs(
      value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*
    ): this.type = set("footer", js.Array(value*))
    
    inline def footerVdomElement(value: VdomElement): this.type = set("footer", value.rawElement.asInstanceOf[js.Any])
    
    inline def forceRender(value: Boolean): this.type = set("forceRender", value.asInstanceOf[js.Any])
    
    inline def getContainer(value: GetContainer): this.type = set("getContainer", value.asInstanceOf[js.Any])
    
    inline def headerStyle(value: CSSProperties): this.type = set("headerStyle", value.asInstanceOf[js.Any])
    
    inline def height(value: Double | String): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def keyboard(value: Boolean): this.type = set("keyboard", value.asInstanceOf[js.Any])
    
    inline def mask(value: Boolean): this.type = set("mask", value.asInstanceOf[js.Any])
    
    inline def maskClassName(value: String): this.type = set("maskClassName", value.asInstanceOf[js.Any])
    
    inline def maskClosable(value: Boolean): this.type = set("maskClosable", value.asInstanceOf[js.Any])
    
    inline def maskMotion(value: CSSMotionProps): this.type = set("maskMotion", value.asInstanceOf[js.Any])
    
    inline def maskStyle(value: CSSProperties): this.type = set("maskStyle", value.asInstanceOf[js.Any])
    
    inline def motion(value: CSSMotionProps | (js.Function1[/* placement */ Placement, CSSMotionProps])): this.type = set("motion", value.asInstanceOf[js.Any])
    
    inline def motionFunction1(value: /* placement */ Placement => CSSMotionProps): this.type = set("motion", js.Any.fromFunction1(value))
    
    inline def onClose(
      value: /* e */ ReactMouseEventFrom[org.scalajs.dom.Element] | ReactKeyboardEventFrom[org.scalajs.dom.Element] => Callback
    ): this.type = set("onClose", js.Any.fromFunction1((t0: /* e */ ReactMouseEventFrom[org.scalajs.dom.Element] | ReactKeyboardEventFrom[org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
    
    inline def placement(value: Placement): this.type = set("placement", value.asInstanceOf[js.Any])
    
    inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    inline def push(value: Boolean | PushConfig): this.type = set("push", value.asInstanceOf[js.Any])
    
    inline def rootClassName(value: String): this.type = set("rootClassName", value.asInstanceOf[js.Any])
    
    inline def rootStyle(value: CSSProperties): this.type = set("rootStyle", value.asInstanceOf[js.Any])
    
    inline def size(value: sizeType): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def title(value: VdomNode): this.type = set("title", value.rawNode.asInstanceOf[js.Any])
    
    inline def titleNull: this.type = set("title", null)
    
    inline def titleVarargs(
      value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*
    ): this.type = set("title", js.Array(value*))
    
    inline def titleVdomElement(value: VdomElement): this.type = set("title", value.rawElement.asInstanceOf[js.Any])
    
    inline def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
    
    inline def width(value: Double | String): this.type = set("width", value.asInstanceOf[js.Any])
    
    inline def zIndex(value: Double): this.type = set("zIndex", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Drawer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DrawerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
