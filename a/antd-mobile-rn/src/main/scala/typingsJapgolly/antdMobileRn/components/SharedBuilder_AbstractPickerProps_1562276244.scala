package typingsJapgolly.antdMobileRn.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.rmcCascader.libCascaderTypesMod.CascaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_AbstractPickerProps_1562276244[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def WrapComponent(value: Any): this.type = set("WrapComponent", value.asInstanceOf[js.Any])
  
  inline def actionTextActiveOpacity(value: Double): this.type = set("actionTextActiveOpacity", value.asInstanceOf[js.Any])
  
  inline def actionTextUnderlayColor(value: String): this.type = set("actionTextUnderlayColor", value.asInstanceOf[js.Any])
  
  inline def cascade(value: Boolean): this.type = set("cascade", value.asInstanceOf[js.Any])
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def cols(value: Double): this.type = set("cols", value.asInstanceOf[js.Any])
  
  inline def content(value: Element | String): this.type = set("content", value.asInstanceOf[js.Any])
  
  inline def contentVdomElement(value: VdomElement): this.type = set("content", value.rawElement.asInstanceOf[js.Any])
  
  inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  
  inline def dismissText(value: String | Element): this.type = set("dismissText", value.asInstanceOf[js.Any])
  
  inline def dismissTextVdomElement(value: VdomElement): this.type = set("dismissText", value.rawElement.asInstanceOf[js.Any])
  
  inline def extra(value: String): this.type = set("extra", value.asInstanceOf[js.Any])
  
  inline def format(value: /* values */ js.Array[String] => String): this.type = set("format", js.Any.fromFunction1(value))
  
  inline def indicatorStyle(value: Any): this.type = set("indicatorStyle", value.asInstanceOf[js.Any])
  
  inline def itemStyle(value: Any): this.type = set("itemStyle", value.asInstanceOf[js.Any])
  
  inline def maskTransitionName(value: String): this.type = set("maskTransitionName", value.asInstanceOf[js.Any])
  
  inline def okText(value: String | Element): this.type = set("okText", value.asInstanceOf[js.Any])
  
  inline def okTextVdomElement(value: VdomElement): this.type = set("okText", value.rawElement.asInstanceOf[js.Any])
  
  inline def onChange(value: /* date */ js.UndefOr[CascaderValue] => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* date */ js.UndefOr[CascaderValue]) => value(t0).runNow()))
  
  inline def onDismiss(value: Callback): this.type = set("onDismiss", value.toJsFn)
  
  inline def onOk(value: /* value */ js.UndefOr[Any] => Callback): this.type = set("onOk", js.Any.fromFunction1((t0: /* value */ js.UndefOr[Any]) => value(t0).runNow()))
  
  inline def onPickerChange(value: /* value */ CascaderValue => Callback): this.type = set("onPickerChange", js.Any.fromFunction1((t0: /* value */ CascaderValue) => value(t0).runNow()))
  
  inline def onVisibleChange(value: /* visible */ Boolean => Callback): this.type = set("onVisibleChange", js.Any.fromFunction1((t0: /* visible */ Boolean) => value(t0).runNow()))
  
  inline def picker(value: Any): this.type = set("picker", value.asInstanceOf[js.Any])
  
  inline def pickerPrefixCls(value: String): this.type = set("pickerPrefixCls", value.asInstanceOf[js.Any])
  
  inline def pickerValueChangeProp(value: String): this.type = set("pickerValueChangeProp", value.asInstanceOf[js.Any])
  
  inline def pickerValueProp(value: String): this.type = set("pickerValueProp", value.asInstanceOf[js.Any])
  
  inline def popupPrefixCls(value: String): this.type = set("popupPrefixCls", value.asInstanceOf[js.Any])
  
  inline def popupTransitionName(value: String): this.type = set("popupTransitionName", value.asInstanceOf[js.Any])
  
  inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  
  inline def style(value: Any): this.type = set("style", value.asInstanceOf[js.Any])
  
  inline def styles(value: Any): this.type = set("styles", value.asInstanceOf[js.Any])
  
  inline def title(value: String | Element): this.type = set("title", value.asInstanceOf[js.Any])
  
  inline def titleVdomElement(value: VdomElement): this.type = set("title", value.rawElement.asInstanceOf[js.Any])
  
  inline def transitionName(value: String): this.type = set("transitionName", value.asInstanceOf[js.Any])
  
  inline def triggerType(value: String): this.type = set("triggerType", value.asInstanceOf[js.Any])
  
  inline def value(value: js.Array[String | Double]): this.type = set("value", value.asInstanceOf[js.Any])
  
  inline def valueVarargs(value: (String | Double)*): this.type = set("value", js.Array(value*))
  
  inline def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
  
  inline def wrapStyle(value: CSSProperties): this.type = set("wrapStyle", value.asInstanceOf[js.Any])
}
