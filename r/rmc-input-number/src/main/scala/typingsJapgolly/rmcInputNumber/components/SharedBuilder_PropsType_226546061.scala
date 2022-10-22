package typingsJapgolly.rmcInputNumber.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_PropsType_226546061[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
  
  inline def defaultValue(value: Double): this.type = set("defaultValue", value.asInstanceOf[js.Any])
  
  inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  
  inline def downStyle(value: Any): this.type = set("downStyle", value.asInstanceOf[js.Any])
  
  inline def inputStyle(value: Any): this.type = set("inputStyle", value.asInstanceOf[js.Any])
  
  inline def keyboardType(value: Any): this.type = set("keyboardType", value.asInstanceOf[js.Any])
  
  inline def max(value: Double): this.type = set("max", value.asInstanceOf[js.Any])
  
  inline def min(value: Double): this.type = set("min", value.asInstanceOf[js.Any])
  
  inline def onBlur(value: /* e */ Any => Callback): this.type = set("onBlur", js.Any.fromFunction1((t0: /* e */ Any) => value(t0).runNow()))
  
  inline def onChange(value: /* e */ Any => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* e */ Any) => value(t0).runNow()))
  
  inline def onFocus(value: /* e */ js.UndefOr[Any] => Callback): this.type = set("onFocus", js.Any.fromFunction1((t0: /* e */ js.UndefOr[Any]) => value(t0).runNow()))
  
  inline def parser(value: /* v */ Any => Callback): this.type = set("parser", js.Any.fromFunction1((t0: /* v */ Any) => value(t0).runNow()))
  
  inline def precision(value: Double): this.type = set("precision", value.asInstanceOf[js.Any])
  
  inline def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
  
  inline def step(value: String | Double): this.type = set("step", value.asInstanceOf[js.Any])
  
  inline def style(value: Any): this.type = set("style", value.asInstanceOf[js.Any])
  
  inline def styles(value: Any): this.type = set("styles", value.asInstanceOf[js.Any])
  
  inline def upStyle(value: Any): this.type = set("upStyle", value.asInstanceOf[js.Any])
  
  inline def value(value: Double): this.type = set("value", value.asInstanceOf[js.Any])
}
