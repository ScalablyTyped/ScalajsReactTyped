package typingsJapgolly.rcDialog.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.rcDialog.anon.X
import typingsJapgolly.rcDialog.rcDialogBooleans.`false`
import typingsJapgolly.rcUtil.libPortalWrapperMod.GetContainer
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_IDialogPropTypes1453239975 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def afterClose(value: CallbackTo[Any]): this.type = set("afterClose", value.toJsFn)
  
  inline def animation(value: Any): this.type = set("animation", value.asInstanceOf[js.Any])
  
  inline def bodyProps(value: Any): this.type = set("bodyProps", value.asInstanceOf[js.Any])
  
  inline def bodyStyle(value: Record[String, Any]): this.type = set("bodyStyle", value.asInstanceOf[js.Any])
  
  inline def children(value: Any): this.type = set("children", value.asInstanceOf[js.Any])
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def closable(value: Boolean): this.type = set("closable", value.asInstanceOf[js.Any])
  
  inline def closeIcon(value: VdomNode): this.type = set("closeIcon", value.rawNode.asInstanceOf[js.Any])
  
  inline def closeIconNull: this.type = set("closeIcon", null)
  
  inline def closeIconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("closeIcon", js.Array(value*))
  
  inline def closeIconVdomElement(value: VdomElement): this.type = set("closeIcon", value.rawElement.asInstanceOf[js.Any])
  
  inline def destroyOnClose(value: Boolean): this.type = set("destroyOnClose", value.asInstanceOf[js.Any])
  
  inline def focusTriggerAfterClose(value: Boolean): this.type = set("focusTriggerAfterClose", value.asInstanceOf[js.Any])
  
  inline def footer(value: VdomNode): this.type = set("footer", value.rawNode.asInstanceOf[js.Any])
  
  inline def footerNull: this.type = set("footer", null)
  
  inline def footerVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("footer", js.Array(value*))
  
  inline def footerVdomElement(value: VdomElement): this.type = set("footer", value.rawElement.asInstanceOf[js.Any])
  
  inline def forceRender(value: Boolean): this.type = set("forceRender", value.asInstanceOf[js.Any])
  
  inline def getContainer(value: GetContainer | `false`): this.type = set("getContainer", value.asInstanceOf[js.Any])
  
  inline def getContainerCallbackTo(value: CallbackTo[HTMLElement]): this.type = set("getContainer", value.toJsFn)
  
  inline def height(value: String | Double): this.type = set("height", value.asInstanceOf[js.Any])
  
  inline def keyboard(value: Boolean): this.type = set("keyboard", value.asInstanceOf[js.Any])
  
  inline def mask(value: Boolean): this.type = set("mask", value.asInstanceOf[js.Any])
  
  inline def maskAnimation(value: Any): this.type = set("maskAnimation", value.asInstanceOf[js.Any])
  
  inline def maskClosable(value: Boolean): this.type = set("maskClosable", value.asInstanceOf[js.Any])
  
  inline def maskProps(value: Any): this.type = set("maskProps", value.asInstanceOf[js.Any])
  
  inline def maskStyle(value: Record[String, Any]): this.type = set("maskStyle", value.asInstanceOf[js.Any])
  
  inline def maskTransitionName(value: String): this.type = set("maskTransitionName", value.asInstanceOf[js.Any])
  
  inline def modalRender(value: /* node */ Node => Node): this.type = set("modalRender", js.Any.fromFunction1(value))
  
  inline def mousePosition(value: X): this.type = set("mousePosition", value.asInstanceOf[js.Any])
  
  inline def mousePositionNull: this.type = set("mousePosition", null)
  
  inline def onClose(value: /* e */ ReactEventFrom[org.scalajs.dom.Element] => Any): this.type = set("onClose", js.Any.fromFunction1(value))
  
  inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  
  inline def rootClassName(value: String): this.type = set("rootClassName", value.asInstanceOf[js.Any])
  
  inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  
  inline def title(value: VdomNode): this.type = set("title", value.rawNode.asInstanceOf[js.Any])
  
  inline def titleNull: this.type = set("title", null)
  
  inline def titleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("title", js.Array(value*))
  
  inline def titleVdomElement(value: VdomElement): this.type = set("title", value.rawElement.asInstanceOf[js.Any])
  
  inline def transitionName(value: String): this.type = set("transitionName", value.asInstanceOf[js.Any])
  
  inline def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
  
  inline def width(value: String | Double): this.type = set("width", value.asInstanceOf[js.Any])
  
  inline def wrapClassName(value: String): this.type = set("wrapClassName", value.asInstanceOf[js.Any])
  
  inline def wrapProps(value: Any): this.type = set("wrapProps", value.asInstanceOf[js.Any])
  
  inline def wrapStyle(value: Record[String, Any]): this.type = set("wrapStyle", value.asInstanceOf[js.Any])
  
  inline def zIndex(value: Double): this.type = set("zIndex", value.asInstanceOf[js.Any])
}
