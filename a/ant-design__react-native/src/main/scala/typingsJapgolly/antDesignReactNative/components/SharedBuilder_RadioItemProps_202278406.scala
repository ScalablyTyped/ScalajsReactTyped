package typingsJapgolly.antDesignReactNative.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antDesignReactNative.libCheckboxPropsTypeMod.OnChangeParams
import typingsJapgolly.antDesignReactNative.libCheckboxStyleMod.CheckboxStyle
import typingsJapgolly.antDesignReactNative.libRadioPropsTypeMod.RadioValue
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_RadioItemProps_202278406[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
  
  inline def defaultChecked(value: Boolean): this.type = set("defaultChecked", value.asInstanceOf[js.Any])
  
  inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  
  inline def indeterminate(value: Boolean): this.type = set("indeterminate", value.asInstanceOf[js.Any])
  
  inline def left(value: Boolean): this.type = set("left", value.asInstanceOf[js.Any])
  
  inline def onChange(value: /* _e */ OnChangeParams => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* _e */ OnChangeParams) => value(t0).runNow()))
  
  inline def onPress(value: Callback): this.type = set("onPress", value.toJsFn)
  
  inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  
  inline def right(value: Boolean): this.type = set("right", value.asInstanceOf[js.Any])
  
  inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
  
  inline def styleNull: this.type = set("style", null)
  
  inline def styles(value: Partial[CheckboxStyle]): this.type = set("styles", value.asInstanceOf[js.Any])
  
  inline def value(value: RadioValue): this.type = set("value", value.asInstanceOf[js.Any])
}
