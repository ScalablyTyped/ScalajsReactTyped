package typingsJapgolly.reactNativeElements.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.Animated.SpringAnimationConfig
import typingsJapgolly.reactNative.mod.Animated.TimingAnimationConfig
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeElements.anon.ContainerHorizontal
import typingsJapgolly.reactNativeElements.anon.RecursivePartialFullThemeAvatar
import typingsJapgolly.reactNativeElements.distConfigThemeMod.Theme
import typingsJapgolly.reactNativeElements.distConfigThemeProviderMod.ThemeProps
import typingsJapgolly.reactNativeElements.distSliderSliderMod.Sizable
import typingsJapgolly.reactNativeElements.distSliderSliderMod.SliderProps
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.horizontal
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.spring
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.timing
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.vertical
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Slider {
  
  inline def apply(
    replaceTheme: RecursivePartialFullThemeAvatar => Callback,
    theme: Theme[SliderProps],
    updateTheme: RecursivePartialFullThemeAvatar => Callback
  ): Builder = {
    val __props = js.Dynamic.literal(replaceTheme = js.Any.fromFunction1((t0: RecursivePartialFullThemeAvatar) => replaceTheme(t0).runNow()), theme = theme.asInstanceOf[js.Any], updateTheme = js.Any.fromFunction1((t0: RecursivePartialFullThemeAvatar) => updateTheme(t0).runNow()))
    new Builder(js.Array(this.component, __props.asInstanceOf[SliderProps & Partial[ThemeProps[SliderProps]]]))
  }
  
  @JSImport("react-native-elements/dist/slider/Slider", "Slider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def allowTouchTrack(value: Boolean): this.type = set("allowTouchTrack", value.asInstanceOf[js.Any])
    
    inline def animateTransitions(value: Boolean): this.type = set("animateTransitions", value.asInstanceOf[js.Any])
    
    inline def animationConfig(value: TimingAnimationConfig | SpringAnimationConfig): this.type = set("animationConfig", value.asInstanceOf[js.Any])
    
    inline def animationType(value: spring | timing): this.type = set("animationType", value.asInstanceOf[js.Any])
    
    inline def containerStyle(value: ContainerHorizontal): this.type = set("containerStyle", value.asInstanceOf[js.Any])
    
    inline def debugTouchArea(value: Boolean): this.type = set("debugTouchArea", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def maximumTrackTintColor(value: String): this.type = set("maximumTrackTintColor", value.asInstanceOf[js.Any])
    
    inline def maximumValue(value: Double): this.type = set("maximumValue", value.asInstanceOf[js.Any])
    
    inline def minimumTrackTintColor(value: String): this.type = set("minimumTrackTintColor", value.asInstanceOf[js.Any])
    
    inline def minimumValue(value: Double): this.type = set("minimumValue", value.asInstanceOf[js.Any])
    
    inline def onSlidingComplete(value: /* value */ Double => Callback): this.type = set("onSlidingComplete", js.Any.fromFunction1((t0: /* value */ Double) => value(t0).runNow()))
    
    inline def onSlidingStart(value: /* value */ Double => Callback): this.type = set("onSlidingStart", js.Any.fromFunction1((t0: /* value */ Double) => value(t0).runNow()))
    
    inline def onValueChange(value: /* value */ Double => Callback): this.type = set("onValueChange", js.Any.fromFunction1((t0: /* value */ Double) => value(t0).runNow()))
    
    inline def orientation(value: horizontal | vertical): this.type = set("orientation", value.asInstanceOf[js.Any])
    
    inline def step(value: Double): this.type = set("step", value.asInstanceOf[js.Any])
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def thumbProps(value: Any): this.type = set("thumbProps", value.asInstanceOf[js.Any])
    
    inline def thumbStyle(value: StyleProp[ViewStyle]): this.type = set("thumbStyle", value.asInstanceOf[js.Any])
    
    inline def thumbStyleNull: this.type = set("thumbStyle", null)
    
    inline def thumbTintColor(value: String): this.type = set("thumbTintColor", value.asInstanceOf[js.Any])
    
    inline def thumbTouchSize(value: Sizable): this.type = set("thumbTouchSize", value.asInstanceOf[js.Any])
    
    inline def trackStyle(value: StyleProp[ViewStyle]): this.type = set("trackStyle", value.asInstanceOf[js.Any])
    
    inline def trackStyleNull: this.type = set("trackStyle", null)
    
    inline def value(value: Double): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SliderProps & Partial[ThemeProps[SliderProps]]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
