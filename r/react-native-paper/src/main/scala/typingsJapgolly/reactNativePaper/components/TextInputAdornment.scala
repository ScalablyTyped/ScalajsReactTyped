package typingsJapgolly.reactNativePaper.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.Animated.Value
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNativePaper.anon.Affix
import typingsJapgolly.reactNativePaper.anon.LeftRight
import typingsJapgolly.reactNativePaper.libTypescriptComponentsTextInputAdornmentTextInputAdornmentMod.TextInputAdornmentProps
import typingsJapgolly.reactNativePaper.libTypescriptComponentsTextInputAdornmentTypesMod.AdornmentConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TextInputAdornment {
  
  inline def apply(
    adornmentConfig: js.Array[AdornmentConfig],
    forceFocus: Callback,
    isTextInputFocused: Boolean,
    onAffixChange: LeftRight,
    topPosition: Affix
  ): Builder = {
    val __props = js.Dynamic.literal(adornmentConfig = adornmentConfig.asInstanceOf[js.Any], forceFocus = forceFocus.toJsFn, isTextInputFocused = isTextInputFocused.asInstanceOf[js.Any], onAffixChange = onAffixChange.asInstanceOf[js.Any], topPosition = topPosition.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TextInputAdornmentProps]))
  }
  
  @JSImport("react-native-paper/lib/typescript/components/TextInput/Adornment/TextInputAdornment", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def left(value: VdomNode): this.type = set("left", value.rawNode.asInstanceOf[js.Any])
    
    inline def leftNull: this.type = set("left", null)
    
    inline def leftVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("left", js.Array(value*))
    
    inline def leftVdomElement(value: VdomElement): this.type = set("left", value.rawElement.asInstanceOf[js.Any])
    
    inline def maxFontSizeMultiplier(value: Double): this.type = set("maxFontSizeMultiplier", value.asInstanceOf[js.Any])
    
    inline def maxFontSizeMultiplierNull: this.type = set("maxFontSizeMultiplier", null)
    
    inline def paddingHorizontal(value: Double | String): this.type = set("paddingHorizontal", value.asInstanceOf[js.Any])
    
    inline def right(value: VdomNode): this.type = set("right", value.rawNode.asInstanceOf[js.Any])
    
    inline def rightNull: this.type = set("right", null)
    
    inline def rightVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("right", js.Array(value*))
    
    inline def rightVdomElement(value: VdomElement): this.type = set("right", value.rawElement.asInstanceOf[js.Any])
    
    inline def textStyle(value: StyleProp[TextStyle]): this.type = set("textStyle", value.asInstanceOf[js.Any])
    
    inline def textStyleNull: this.type = set("textStyle", null)
    
    inline def visible(value: Value): this.type = set("visible", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TextInputAdornmentProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
