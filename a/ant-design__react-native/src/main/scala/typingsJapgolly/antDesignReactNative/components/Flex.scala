package typingsJapgolly.antDesignReactNative.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.`column-reverse`
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.`row-reverse`
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.`wrap-reverse`
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.around
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.baseline
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.between
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.center
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.column
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.end
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.nowrap
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.row
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.start
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.stretch
import typingsJapgolly.antDesignReactNative.libFlexFlexMod.FlexProps
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Flex {
  
  @JSImport("@ant-design/react-native", "Flex")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.antDesignReactNative.mod.Flex] {
    
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
    
    inline def wrap(
      value: nowrap | typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.wrap | `wrap-reverse`
    ): this.type = set("wrap", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Flex.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: FlexProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
