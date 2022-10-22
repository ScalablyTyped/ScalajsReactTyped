package typingsJapgolly.antDesignReactNative.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_SegmentedControlProps323123367[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  
  inline def onChange(value: /* e */ Any => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* e */ Any) => value(t0).runNow()))
  
  inline def onValueChange(value: /* value */ String => Callback): this.type = set("onValueChange", js.Any.fromFunction1((t0: /* value */ String) => value(t0).runNow()))
  
  inline def selectedIndex(value: Double): this.type = set("selectedIndex", value.asInstanceOf[js.Any])
  
  inline def selectedTextColor(value: String): this.type = set("selectedTextColor", value.asInstanceOf[js.Any])
  
  inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
  
  inline def styleNull: this.type = set("style", null)
  
  inline def tintColor(value: String): this.type = set("tintColor", value.asInstanceOf[js.Any])
  
  inline def values(value: js.Array[String]): this.type = set("values", value.asInstanceOf[js.Any])
  
  inline def valuesVarargs(value: String*): this.type = set("values", js.Array(value*))
}
