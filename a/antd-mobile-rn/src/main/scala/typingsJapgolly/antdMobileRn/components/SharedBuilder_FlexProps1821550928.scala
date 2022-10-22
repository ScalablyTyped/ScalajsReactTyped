package typingsJapgolly.antdMobileRn.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.`column-reverse`
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.`row-reverse`
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.`wrap-reverse`
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.around
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.baseline
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.between
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.center
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.column
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.end
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.nowrap
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.row
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.start
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.stretch
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_FlexProps1821550928[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def align(value: start | center | end | baseline | stretch): this.type = set("align", value.asInstanceOf[js.Any])
  
  inline def direction(value: row | `row-reverse` | column | `column-reverse`): this.type = set("direction", value.asInstanceOf[js.Any])
  
  inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  
  inline def justify(value: start | end | center | between | around): this.type = set("justify", value.asInstanceOf[js.Any])
  
  inline def onLongPress(value: Callback): this.type = set("onLongPress", value.toJsFn)
  
  inline def onPress(value: Callback): this.type = set("onPress", value.toJsFn)
  
  inline def onPressIn(value: Callback): this.type = set("onPressIn", value.toJsFn)
  
  inline def onPressOut(value: Callback): this.type = set("onPressOut", value.toJsFn)
  
  inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
  
  inline def styleNull: this.type = set("style", null)
  
  inline def wrap(value: nowrap | typingsJapgolly.antdMobileRn.antdMobileRnStrings.wrap | `wrap-reverse`): this.type = set("wrap", value.asInstanceOf[js.Any])
}
