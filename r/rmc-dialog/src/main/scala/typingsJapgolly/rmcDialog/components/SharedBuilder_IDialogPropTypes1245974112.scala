package typingsJapgolly.rmcDialog.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_IDialogPropTypes1245974112[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def afterClose(value: Callback): this.type = set("afterClose", value.toJsFn)
  
  inline def animation(value: Any): this.type = set("animation", value.asInstanceOf[js.Any])
  
  inline def bodyStyle(value: js.Object): this.type = set("bodyStyle", value.asInstanceOf[js.Any])
  
  inline def children(value: Any): this.type = set("children", value.asInstanceOf[js.Any])
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def closable(value: Boolean): this.type = set("closable", value.asInstanceOf[js.Any])
  
  inline def footer(value: VdomNode): this.type = set("footer", value.rawNode.asInstanceOf[js.Any])
  
  inline def footerNull: this.type = set("footer", null)
  
  inline def footerVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("footer", js.Array(value*))
  
  inline def footerVdomElement(value: VdomElement): this.type = set("footer", value.rawElement.asInstanceOf[js.Any])
  
  inline def mask(value: Boolean): this.type = set("mask", value.asInstanceOf[js.Any])
  
  inline def maskAnimation(value: Any): this.type = set("maskAnimation", value.asInstanceOf[js.Any])
  
  inline def maskClosable(value: Boolean): this.type = set("maskClosable", value.asInstanceOf[js.Any])
  
  inline def maskProps(value: Any): this.type = set("maskProps", value.asInstanceOf[js.Any])
  
  inline def maskStyle(value: js.Object): this.type = set("maskStyle", value.asInstanceOf[js.Any])
  
  inline def maskTransitionName(value: String): this.type = set("maskTransitionName", value.asInstanceOf[js.Any])
  
  inline def onAnimateLeave(value: Callback): this.type = set("onAnimateLeave", value.toJsFn)
  
  inline def onClose(value: /* e */ Any => Callback): this.type = set("onClose", js.Any.fromFunction1((t0: /* e */ Any) => value(t0).runNow()))
  
  inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  
  inline def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
  
  inline def title(value: VdomNode): this.type = set("title", value.rawNode.asInstanceOf[js.Any])
  
  inline def titleNull: this.type = set("title", null)
  
  inline def titleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("title", js.Array(value*))
  
  inline def titleVdomElement(value: VdomElement): this.type = set("title", value.rawElement.asInstanceOf[js.Any])
  
  inline def transitionName(value: String): this.type = set("transitionName", value.asInstanceOf[js.Any])
  
  inline def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
  
  inline def wrapClassName(value: String): this.type = set("wrapClassName", value.asInstanceOf[js.Any])
  
  inline def wrapProps(value: Any): this.type = set("wrapProps", value.asInstanceOf[js.Any])
  
  inline def wrapStyle(value: js.Object): this.type = set("wrapStyle", value.asInstanceOf[js.Any])
  
  inline def zIndex(value: Double): this.type = set("zIndex", value.asInstanceOf[js.Any])
}
