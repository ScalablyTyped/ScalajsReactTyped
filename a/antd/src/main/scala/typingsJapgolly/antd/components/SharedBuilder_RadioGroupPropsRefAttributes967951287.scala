package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antd.libCheckboxGroupMod.CheckboxOptionType
import typingsJapgolly.antd.libConfigProviderDisabledContextMod.DisabledType
import typingsJapgolly.antd.libConfigProviderSizeContextMod.SizeType
import typingsJapgolly.antd.libRadioInterfaceMod.RadioChangeEvent
import typingsJapgolly.antd.libRadioInterfaceMod.RadioGroupButtonStyle
import typingsJapgolly.antd.libRadioInterfaceMod.RadioGroupOptionType
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_RadioGroupPropsRefAttributes967951287[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def buttonStyle(value: RadioGroupButtonStyle): this.type = set("buttonStyle", value.asInstanceOf[js.Any])
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def defaultValue(value: Any): this.type = set("defaultValue", value.asInstanceOf[js.Any])
  
  inline def disabled(value: DisabledType): this.type = set("disabled", value.asInstanceOf[js.Any])
  
  inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
  
  inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
  
  inline def onBlur(value: ReactFocusEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
  
  inline def onChange(value: /* e */ RadioChangeEvent => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* e */ RadioChangeEvent) => value(t0).runNow()))
  
  inline def onFocus(value: ReactFocusEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
  
  inline def onMouseEnter(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseEnter", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
  
  inline def onMouseLeave(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
  
  inline def optionType(value: RadioGroupOptionType): this.type = set("optionType", value.asInstanceOf[js.Any])
  
  inline def options(value: js.Array[CheckboxOptionType | String | Double]): this.type = set("options", value.asInstanceOf[js.Any])
  
  inline def optionsVarargs(value: (CheckboxOptionType | String | Double)*): this.type = set("options", js.Array(value*))
  
  inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  
  inline def size(value: SizeType): this.type = set("size", value.asInstanceOf[js.Any])
  
  inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  
  inline def value(value: Any): this.type = set("value", value.asInstanceOf[js.Any])
}
