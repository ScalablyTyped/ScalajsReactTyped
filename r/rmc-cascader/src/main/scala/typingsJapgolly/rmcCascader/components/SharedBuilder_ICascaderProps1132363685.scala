package typingsJapgolly.rmcCascader.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.rmcCascader.libCascaderTypesMod.CascaderOneValue
import typingsJapgolly.rmcCascader.libCascaderTypesMod.CascaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_ICascaderProps1132363685[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def cols(value: Double): this.type = set("cols", value.asInstanceOf[js.Any])
  
  inline def defaultValue(value: CascaderValue): this.type = set("defaultValue", value.asInstanceOf[js.Any])
  
  inline def defaultValueVarargs(value: CascaderOneValue*): this.type = set("defaultValue", js.Array(value*))
  
  inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  
  inline def indicatorStyle(value: js.Object): this.type = set("indicatorStyle", value.asInstanceOf[js.Any])
  
  inline def onChange(value: /* value */ CascaderValue => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* value */ CascaderValue) => value(t0).runNow()))
  
  inline def onScrollChange(value: /* value */ CascaderValue => Callback): this.type = set("onScrollChange", js.Any.fromFunction1((t0: /* value */ CascaderValue) => value(t0).runNow()))
  
  inline def pickerItemStyle(value: js.Object): this.type = set("pickerItemStyle", value.asInstanceOf[js.Any])
  
  inline def pickerPrefixCls(value: String): this.type = set("pickerPrefixCls", value.asInstanceOf[js.Any])
  
  inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  
  inline def rootNativeProps(value: js.Object): this.type = set("rootNativeProps", value.asInstanceOf[js.Any])
  
  inline def style(value: Any): this.type = set("style", value.asInstanceOf[js.Any])
  
  inline def value(value: CascaderValue): this.type = set("value", value.asInstanceOf[js.Any])
  
  inline def valueVarargs(value: CascaderOneValue*): this.type = set("value", js.Array(value*))
}
