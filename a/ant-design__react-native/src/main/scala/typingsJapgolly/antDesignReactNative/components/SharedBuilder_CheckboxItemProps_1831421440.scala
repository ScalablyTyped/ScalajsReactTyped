package typingsJapgolly.antDesignReactNative.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings._empty
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.android
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.bottom
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.down
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.empty
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.horizontal
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.ios
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.middle
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.top
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.up
import typingsJapgolly.antDesignReactNative.libCheckboxPropsTypeMod.OnChangeParams
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_CheckboxItemProps_1831421440[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def activeStyle(value: StyleProp[ViewStyle]): this.type = set("activeStyle", value.asInstanceOf[js.Any])
  
  inline def activeStyleNull: this.type = set("activeStyle", null)
  
  inline def align(value: top | middle | bottom): this.type = set("align", value.asInstanceOf[js.Any])
  
  inline def arrow(value: horizontal | down | up | empty | _empty): this.type = set("arrow", value.asInstanceOf[js.Any])
  
  inline def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
  
  inline def defaultChecked(value: Boolean): this.type = set("defaultChecked", value.asInstanceOf[js.Any])
  
  inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  
  inline def error(value: Boolean): this.type = set("error", value.asInstanceOf[js.Any])
  
  inline def extra(value: VdomNode): this.type = set("extra", value.rawNode.asInstanceOf[js.Any])
  
  inline def extraNull: this.type = set("extra", null)
  
  inline def extraVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("extra", js.Array(value*))
  
  inline def extraVdomElement(value: VdomElement): this.type = set("extra", value.rawElement.asInstanceOf[js.Any])
  
  inline def indeterminate(value: Boolean): this.type = set("indeterminate", value.asInstanceOf[js.Any])
  
  inline def left(value: Boolean): this.type = set("left", value.asInstanceOf[js.Any])
  
  inline def multipleLine(value: Boolean): this.type = set("multipleLine", value.asInstanceOf[js.Any])
  
  inline def onChange(value: /* _e */ OnChangeParams => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* _e */ OnChangeParams) => value(t0).runNow()))
  
  inline def onPress(value: Callback): this.type = set("onPress", value.toJsFn)
  
  inline def platform(value: android | ios): this.type = set("platform", value.asInstanceOf[js.Any])
  
  inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  
  inline def right(value: Boolean): this.type = set("right", value.asInstanceOf[js.Any])
  
  inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
  
  inline def styleNull: this.type = set("style", null)
  
  inline def thumb(value: VdomNode): this.type = set("thumb", value.rawNode.asInstanceOf[js.Any])
  
  inline def thumbNull: this.type = set("thumb", null)
  
  inline def thumbVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("thumb", js.Array(value*))
  
  inline def thumbVdomElement(value: VdomElement): this.type = set("thumb", value.rawElement.asInstanceOf[js.Any])
  
  inline def wrap(value: Boolean): this.type = set("wrap", value.asInstanceOf[js.Any])
}
