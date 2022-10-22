package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antd.libCheckboxGroupMod.CheckboxOptionType
import typingsJapgolly.antd.libCheckboxGroupMod.CheckboxValueType
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_CheckboxGroupPropsRefAttributes_1473907240[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def defaultValue(value: js.Array[CheckboxValueType]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
  
  inline def defaultValueVarargs(value: CheckboxValueType*): this.type = set("defaultValue", js.Array(value*))
  
  inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  
  inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
  
  inline def onChange(value: /* checkedValue */ js.Array[CheckboxValueType] => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* checkedValue */ js.Array[CheckboxValueType]) => value(t0).runNow()))
  
  inline def options(value: js.Array[CheckboxOptionType | String | Double]): this.type = set("options", value.asInstanceOf[js.Any])
  
  inline def optionsVarargs(value: (CheckboxOptionType | String | Double)*): this.type = set("options", js.Array(value*))
  
  inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  
  inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  
  inline def value(value: js.Array[CheckboxValueType]): this.type = set("value", value.asInstanceOf[js.Any])
  
  inline def valueVarargs(value: CheckboxValueType*): this.type = set("value", js.Array(value*))
}
