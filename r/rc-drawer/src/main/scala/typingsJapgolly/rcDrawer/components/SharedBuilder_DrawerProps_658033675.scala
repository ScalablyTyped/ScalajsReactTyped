package typingsJapgolly.rcDrawer.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.rcComponentPortal.esPortalMod.ContainerType
import typingsJapgolly.rcComponentPortal.esPortalMod.GetContainer
import typingsJapgolly.rcDrawer.esDrawerPopupMod.Placement
import typingsJapgolly.rcDrawer.esDrawerPopupMod.PushConfig
import typingsJapgolly.rcMotion.esCssmotionMod.CSSMotionProps
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_DrawerProps_658033675 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def afterOpenChange(value: /* open */ Boolean => Callback): this.type = set("afterOpenChange", js.Any.fromFunction1((t0: /* open */ Boolean) => value(t0).runNow()))
  
  inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def contentWrapperStyle(value: CSSProperties): this.type = set("contentWrapperStyle", value.asInstanceOf[js.Any])
  
  inline def destroyOnClose(value: Boolean): this.type = set("destroyOnClose", value.asInstanceOf[js.Any])
  
  inline def forceRender(value: Boolean): this.type = set("forceRender", value.asInstanceOf[js.Any])
  
  inline def getContainer(value: GetContainer): this.type = set("getContainer", value.asInstanceOf[js.Any])
  
  inline def getContainerCallbackTo(value: CallbackTo[ContainerType]): this.type = set("getContainer", value.toJsFn)
  
  inline def height(value: Double | String): this.type = set("height", value.asInstanceOf[js.Any])
  
  inline def keyboard(value: Boolean): this.type = set("keyboard", value.asInstanceOf[js.Any])
  
  inline def mask(value: Boolean): this.type = set("mask", value.asInstanceOf[js.Any])
  
  inline def maskClassName(value: String): this.type = set("maskClassName", value.asInstanceOf[js.Any])
  
  inline def maskClosable(value: Boolean): this.type = set("maskClosable", value.asInstanceOf[js.Any])
  
  inline def maskMotion(value: CSSMotionProps): this.type = set("maskMotion", value.asInstanceOf[js.Any])
  
  inline def maskStyle(value: CSSProperties): this.type = set("maskStyle", value.asInstanceOf[js.Any])
  
  inline def motion(value: CSSMotionProps | (js.Function1[/* placement */ Placement, CSSMotionProps])): this.type = set("motion", value.asInstanceOf[js.Any])
  
  inline def motionFunction1(value: /* placement */ Placement => CSSMotionProps): this.type = set("motion", js.Any.fromFunction1(value))
  
  inline def onClose(value: /* e */ ReactMouseEventFrom[Element] | ReactKeyboardEventFrom[Element] => Callback): this.type = set("onClose", js.Any.fromFunction1((t0: /* e */ ReactMouseEventFrom[Element] | ReactKeyboardEventFrom[Element]) => value(t0).runNow()))
  
  inline def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
  
  inline def placement(value: Placement): this.type = set("placement", value.asInstanceOf[js.Any])
  
  inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  
  inline def push(value: Boolean | PushConfig): this.type = set("push", value.asInstanceOf[js.Any])
  
  inline def rootClassName(value: String): this.type = set("rootClassName", value.asInstanceOf[js.Any])
  
  inline def rootStyle(value: CSSProperties): this.type = set("rootStyle", value.asInstanceOf[js.Any])
  
  inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  
  inline def width(value: Double | String): this.type = set("width", value.asInstanceOf[js.Any])
  
  inline def zIndex(value: Double): this.type = set("zIndex", value.asInstanceOf[js.Any])
}
