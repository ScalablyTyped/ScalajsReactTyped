package typingsJapgolly.reactNativePaper.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.Animated.Value
import typingsJapgolly.reactNative.mod.LayoutChangeEvent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNativePaper.anon.affixReactNodetestIDstrin
import typingsJapgolly.reactNativePaper.libTypescriptComponentsTextInputAdornmentEnumsMod.AdornmentSide
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AffixAdornment {
  
  inline def apply(side: AdornmentSide, testID: String): Builder = {
    val __props = js.Dynamic.literal(side = side.asInstanceOf[js.Any], testID = testID.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[affixReactNodetestIDstrin]))
  }
  
  @JSImport("react-native-paper/lib/typescript/components/TextInput/Adornment/TextInputAffix", "AffixAdornment")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def affix(value: VdomNode): this.type = set("affix", value.rawNode.asInstanceOf[js.Any])
    
    inline def affixNull: this.type = set("affix", null)
    
    inline def affixVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("affix", js.Array(value*))
    
    inline def affixVdomElement(value: VdomElement): this.type = set("affix", value.rawElement.asInstanceOf[js.Any])
    
    inline def maxFontSizeMultiplier(value: Double): this.type = set("maxFontSizeMultiplier", value.asInstanceOf[js.Any])
    
    inline def maxFontSizeMultiplierNull: this.type = set("maxFontSizeMultiplier", null)
    
    inline def onLayout(value: /* event */ LayoutChangeEvent => Callback): this.type = set("onLayout", js.Any.fromFunction1((t0: /* event */ LayoutChangeEvent) => value(t0).runNow()))
    
    inline def paddingHorizontal(value: Double | String): this.type = set("paddingHorizontal", value.asInstanceOf[js.Any])
    
    inline def textStyle(value: StyleProp[TextStyle]): this.type = set("textStyle", value.asInstanceOf[js.Any])
    
    inline def textStyleNull: this.type = set("textStyle", null)
    
    inline def topPosition(value: Double): this.type = set("topPosition", value.asInstanceOf[js.Any])
    
    inline def topPositionNull: this.type = set("topPosition", null)
    
    inline def visible(value: Value): this.type = set("visible", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: affixReactNodetestIDstrin): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
