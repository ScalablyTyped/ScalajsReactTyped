package typingsJapgolly.reactNativeSvg.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNativeSvg.libTypescriptLibExtractTypesMod.NumberArray
import typingsJapgolly.reactNativeSvg.libTypescriptLibExtractTypesMod.NumberProp
import typingsJapgolly.reactNativeSvg.libTypescriptReactNativeSVGDotwebMod.BaseProps
import typingsJapgolly.reactNativeSvg.libTypescriptReactNativeSVGDotwebMod.BlurEvent
import typingsJapgolly.reactNativeSvg.libTypescriptReactNativeSVGDotwebMod.EdgeInsetsProp
import typingsJapgolly.reactNativeSvg.libTypescriptReactNativeSVGDotwebMod.FocusEvent
import typingsJapgolly.reactNativeSvg.libTypescriptReactNativeSVGDotwebMod.LayoutEvent
import typingsJapgolly.reactNativeSvg.libTypescriptReactNativeSVGDotwebMod.PressEvent
import typingsJapgolly.reactNativeSvg.libTypescriptReactNativeSVGDotwebMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeSVGDotweb {
  
  inline def apply(
    originX: NumberProp,
    originY: NumberProp,
    rotation: NumberArray,
    scale: NumberArray,
    skewX: NumberProp,
    skewY: NumberProp,
    style: js.Iterable[js.Object],
    translate: NumberArray,
    translateX: NumberProp,
    translateY: NumberProp
  ): Builder = {
    val __props = js.Dynamic.literal(originX = originX.asInstanceOf[js.Any], originY = originY.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], skewX = skewX.asInstanceOf[js.Any], skewY = skewY.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], translate = translate.asInstanceOf[js.Any], translateX = translateX.asInstanceOf[js.Any], translateY = translateY.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[BaseProps]))
  }
  
  @JSImport("react-native-svg/lib/typescript/ReactNativeSVG.web", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def accessibilityHint(value: String): this.type = set("accessibilityHint", value.asInstanceOf[js.Any])
    
    inline def accessibilityIgnoresInvertColors(value: Boolean): this.type = set("accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
    
    inline def accessibilityLabel(value: String): this.type = set("accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def accessibilityRole(value: String): this.type = set("accessibilityRole", value.asInstanceOf[js.Any])
    
    inline def accessibilityState(value: js.Object): this.type = set("accessibilityState", value.asInstanceOf[js.Any])
    
    inline def accessible(value: Boolean): this.type = set("accessible", value.asInstanceOf[js.Any])
    
    inline def delayLongPress(value: Double): this.type = set("delayLongPress", value.asInstanceOf[js.Any])
    
    inline def delayPressIn(value: Double): this.type = set("delayPressIn", value.asInstanceOf[js.Any])
    
    inline def delayPressOut(value: Double): this.type = set("delayPressOut", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def fontFamily(value: String): this.type = set("fontFamily", value.asInstanceOf[js.Any])
    
    inline def fontSize(value: NumberProp): this.type = set("fontSize", value.asInstanceOf[js.Any])
    
    inline def fontStyle(value: String): this.type = set("fontStyle", value.asInstanceOf[js.Any])
    
    inline def fontWeight(value: NumberProp): this.type = set("fontWeight", value.asInstanceOf[js.Any])
    
    inline def hitSlop(value: EdgeInsetsProp): this.type = set("hitSlop", value.asInstanceOf[js.Any])
    
    inline def nativeID(value: String): this.type = set("nativeID", value.asInstanceOf[js.Any])
    
    inline def onBlur(value: /* e */ BlurEvent => Callback): this.type = set("onBlur", js.Any.fromFunction1((t0: /* e */ BlurEvent) => value(t0).runNow()))
    
    inline def onClick(value: /* event */ PressEvent => js.Object): this.type = set("onClick", js.Any.fromFunction1(value))
    
    inline def onFocus(value: /* e */ FocusEvent => Callback): this.type = set("onFocus", js.Any.fromFunction1((t0: /* e */ FocusEvent) => value(t0).runNow()))
    
    inline def onLayout(value: /* event */ LayoutEvent => js.Object): this.type = set("onLayout", js.Any.fromFunction1(value))
    
    inline def onLongPress(value: /* event */ PressEvent => js.Object): this.type = set("onLongPress", js.Any.fromFunction1(value))
    
    inline def onPress(value: /* event */ PressEvent => js.Object): this.type = set("onPress", js.Any.fromFunction1(value))
    
    inline def onPressIn(value: /* event */ PressEvent => js.Object): this.type = set("onPressIn", js.Any.fromFunction1(value))
    
    inline def onPressOut(value: /* event */ PressEvent => js.Object): this.type = set("onPressOut", js.Any.fromFunction1(value))
    
    inline def pressRetentionOffset(value: EdgeInsetsProp): this.type = set("pressRetentionOffset", value.asInstanceOf[js.Any])
    
    inline def rejectResponderTermination(value: Boolean): this.type = set("rejectResponderTermination", value.asInstanceOf[js.Any])
    
    inline def touchSoundDisabled(value: Boolean): this.type = set("touchSoundDisabled", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: BaseProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
