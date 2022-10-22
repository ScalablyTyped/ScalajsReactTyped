package typingsJapgolly.reactNativeMultiSlider.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeMultiSlider.anon.BorderRadius
import typingsJapgolly.reactNativeMultiSlider.mod.MarkerProps
import typingsJapgolly.reactNativeMultiSlider.mod.MultiSliderProps
import typingsJapgolly.reactNativeMultiSlider.mod.default
import typingsJapgolly.reactNativeMultiSlider.reactNativeMultiSliderStrings.horizontal
import typingsJapgolly.reactNativeMultiSlider.reactNativeMultiSliderStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeMultiSlider {
  
  @JSImport("react-native-multi-slider", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def containerStyle(value: ViewStyle): this.type = set("containerStyle", value.asInstanceOf[js.Any])
    
    inline def customMarker(value: ComponentType[MarkerProps]): this.type = set("customMarker", value.asInstanceOf[js.Any])
    
    inline def markerStyle(value: ViewStyle): this.type = set("markerStyle", value.asInstanceOf[js.Any])
    
    inline def max(value: Double): this.type = set("max", value.asInstanceOf[js.Any])
    
    inline def min(value: Double): this.type = set("min", value.asInstanceOf[js.Any])
    
    inline def onValuesChange(value: /* change */ js.Array[Double] => Callback): this.type = set("onValuesChange", js.Any.fromFunction1((t0: /* change */ js.Array[Double]) => value(t0).runNow()))
    
    inline def onValuesChangeFinish(value: /* change */ js.Array[Double] => Callback): this.type = set("onValuesChangeFinish", js.Any.fromFunction1((t0: /* change */ js.Array[Double]) => value(t0).runNow()))
    
    inline def onValuesChangeStart(value: Callback): this.type = set("onValuesChangeStart", value.toJsFn)
    
    inline def optionsArray(value: js.Array[Double]): this.type = set("optionsArray", value.asInstanceOf[js.Any])
    
    inline def optionsArrayVarargs(value: Double*): this.type = set("optionsArray", js.Array(value*))
    
    inline def pressedMarkerStyle(value: ViewStyle): this.type = set("pressedMarkerStyle", value.asInstanceOf[js.Any])
    
    inline def selectedStyle(value: ViewStyle): this.type = set("selectedStyle", value.asInstanceOf[js.Any])
    
    inline def sliderLength(value: Double): this.type = set("sliderLength", value.asInstanceOf[js.Any])
    
    inline def sliderOrientation(value: horizontal | vertical): this.type = set("sliderOrientation", value.asInstanceOf[js.Any])
    
    inline def step(value: Double): this.type = set("step", value.asInstanceOf[js.Any])
    
    inline def touchDimensions(value: BorderRadius): this.type = set("touchDimensions", value.asInstanceOf[js.Any])
    
    inline def trackStyle(value: ViewStyle): this.type = set("trackStyle", value.asInstanceOf[js.Any])
    
    inline def unselectedStyle(value: ViewStyle): this.type = set("unselectedStyle", value.asInstanceOf[js.Any])
    
    inline def values(value: js.Array[Double]): this.type = set("values", value.asInstanceOf[js.Any])
    
    inline def valuesVarargs(value: Double*): this.type = set("values", js.Array(value*))
  }
  
  implicit def make(companion: ReactNativeMultiSlider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MultiSliderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
