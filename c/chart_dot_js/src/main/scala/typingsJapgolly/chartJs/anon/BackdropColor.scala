package typingsJapgolly.chartJs.anon

import typingsJapgolly.chartJs.mod.BorderRadius
import typingsJapgolly.chartJs.mod.Scriptable
import typingsJapgolly.chartJs.mod.ScriptableAndScriptableOptions
import typingsJapgolly.chartJs.mod.ScriptableScalePointLabelContext
import typingsJapgolly.chartJs.typesBasicMod.AnyObject
import typingsJapgolly.chartJs.typesGeometricMod.ChartArea
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackdropColor extends StObject {
  
  /**
    * Background color of the point label.
    * @default undefined
    */
  var backdropColor: Scriptable[typingsJapgolly.chartJs.typesColorMod.Color, ScriptableScalePointLabelContext]
  
  /**
    * Padding of label backdrop.
    * @default 2
    */
  var backdropPadding: Scriptable[Double | ChartArea, ScriptableScalePointLabelContext]
  
  /**
    * Border radius
    * @default 0
    * @since 3.8.0
    */
  var borderRadius: Scriptable[Double | BorderRadius, ScriptableScalePointLabelContext]
  
  /**
    * Callback function to transform data labels to point labels. The default implementation simply returns the current string.
    */
  def callback(label: String, index: Double): String | (js.Array[Double | String]) | Double
  
  /**
    * if true, point labels are centered.
    * @default false
    */
  var centerPointLabels: Boolean
  
  /**
    * Color of label
    * @see Defaults.color
    */
  var color: Scriptable[typingsJapgolly.chartJs.typesColorMod.Color, ScriptableScalePointLabelContext]
  
  /**
    * if true, point labels are shown.
    * @default true
    */
  var display: Boolean
  
  /**
    */
  var font: ScriptableAndScriptableOptions[PartialFontSpec, ScriptableScalePointLabelContext]
  
  /**
    * Padding around the pointLabels
    * @default 5
    */
  var padding: Scriptable[Double, ScriptableScalePointLabelContext]
}
object BackdropColor {
  
  inline def apply(
    backdropColor: Scriptable[typingsJapgolly.chartJs.typesColorMod.Color, ScriptableScalePointLabelContext],
    backdropPadding: Scriptable[Double | ChartArea, ScriptableScalePointLabelContext],
    borderRadius: Scriptable[Double | BorderRadius, ScriptableScalePointLabelContext],
    callback: (String, Double) => String | (js.Array[Double | String]) | Double,
    centerPointLabels: Boolean,
    color: Scriptable[typingsJapgolly.chartJs.typesColorMod.Color, ScriptableScalePointLabelContext],
    display: Boolean,
    font: ScriptableAndScriptableOptions[PartialFontSpec, ScriptableScalePointLabelContext],
    padding: Scriptable[Double, ScriptableScalePointLabelContext]
  ): BackdropColor = {
    val __obj = js.Dynamic.literal(backdropColor = backdropColor.asInstanceOf[js.Any], backdropPadding = backdropPadding.asInstanceOf[js.Any], borderRadius = borderRadius.asInstanceOf[js.Any], callback = js.Any.fromFunction2(callback), centerPointLabels = centerPointLabels.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackdropColor]
  }
  
  extension [Self <: BackdropColor](x: Self) {
    
    inline def setBackdropColor(value: Scriptable[typingsJapgolly.chartJs.typesColorMod.Color, ScriptableScalePointLabelContext]): Self = StObject.set(x, "backdropColor", value.asInstanceOf[js.Any])
    
    inline def setBackdropColorFunction2(
      value: (ScriptableScalePointLabelContext, /* options */ AnyObject) => js.UndefOr[typingsJapgolly.chartJs.typesColorMod.Color]
    ): Self = StObject.set(x, "backdropColor", js.Any.fromFunction2(value))
    
    inline def setBackdropPadding(value: Scriptable[Double | ChartArea, ScriptableScalePointLabelContext]): Self = StObject.set(x, "backdropPadding", value.asInstanceOf[js.Any])
    
    inline def setBackdropPaddingFunction2(
      value: (ScriptableScalePointLabelContext, /* options */ AnyObject) => js.UndefOr[Double | ChartArea]
    ): Self = StObject.set(x, "backdropPadding", js.Any.fromFunction2(value))
    
    inline def setBorderRadius(value: Scriptable[Double | BorderRadius, ScriptableScalePointLabelContext]): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderRadiusFunction2(
      value: (ScriptableScalePointLabelContext, /* options */ AnyObject) => js.UndefOr[Double | BorderRadius]
    ): Self = StObject.set(x, "borderRadius", js.Any.fromFunction2(value))
    
    inline def setCallback(value: (String, Double) => String | (js.Array[Double | String]) | Double): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
    
    inline def setCenterPointLabels(value: Boolean): Self = StObject.set(x, "centerPointLabels", value.asInstanceOf[js.Any])
    
    inline def setColor(value: Scriptable[typingsJapgolly.chartJs.typesColorMod.Color, ScriptableScalePointLabelContext]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorFunction2(
      value: (ScriptableScalePointLabelContext, /* options */ AnyObject) => js.UndefOr[typingsJapgolly.chartJs.typesColorMod.Color]
    ): Self = StObject.set(x, "color", js.Any.fromFunction2(value))
    
    inline def setDisplay(value: Boolean): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setFont(value: ScriptableAndScriptableOptions[PartialFontSpec, ScriptableScalePointLabelContext]): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontFunction2(value: (ScriptableScalePointLabelContext, /* options */ AnyObject) => js.UndefOr[PartialFontSpec]): Self = StObject.set(x, "font", js.Any.fromFunction2(value))
    
    inline def setPadding(value: Scriptable[Double, ScriptableScalePointLabelContext]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingFunction2(value: (ScriptableScalePointLabelContext, /* options */ AnyObject) => js.UndefOr[Double]): Self = StObject.set(x, "padding", js.Any.fromFunction2(value))
  }
}
