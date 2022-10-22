package typingsJapgolly.antDesignReactNative.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antDesignReactNative.libCheckboxStyleMod.CheckboxStyle
import typingsJapgolly.antDesignReactNative.libRadioPropsTypeMod.OnGroupChangeParams
import typingsJapgolly.antDesignReactNative.libRadioPropsTypeMod.RadioOptionType
import typingsJapgolly.antDesignReactNative.libRadioPropsTypeMod.RadioValue
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_RadioGroupPropsRefAttributes308805308 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def defaultValue(value: RadioValue): this.type = set("defaultValue", value.asInstanceOf[js.Any])
  
  inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  
  inline def onChange(value: /* _e */ OnGroupChangeParams => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* _e */ OnGroupChangeParams) => value(t0).runNow()))
  
  inline def options(value: js.Array[RadioOptionType | RadioValue]): this.type = set("options", value.asInstanceOf[js.Any])
  
  inline def optionsVarargs(value: (RadioOptionType | RadioValue)*): this.type = set("options", js.Array(value*))
  
  inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
  
  inline def styleNull: this.type = set("style", null)
  
  inline def styles(value: Partial[CheckboxStyle]): this.type = set("styles", value.asInstanceOf[js.Any])
  
  inline def value(value: RadioValue): this.type = set("value", value.asInstanceOf[js.Any])
}
