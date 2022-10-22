package typingsJapgolly.chartJs.anon

import typingsJapgolly.chartJs.chartJsStrings.center
import typingsJapgolly.chartJs.chartJsStrings.end
import typingsJapgolly.chartJs.chartJsStrings.start
import typingsJapgolly.chartJs.mod.ScriptableAndScriptableOptions
import typingsJapgolly.chartJs.mod.ScriptableChartContext
import typingsJapgolly.chartJs.typesBasicMod.AnyObject
import typingsJapgolly.chartJs.typesGeometricMod.ChartArea
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Color extends StObject {
  
  /**
    * Color of title
    * @see Defaults.color
    */
  var color: typingsJapgolly.chartJs.typesColorMod.Color
  
  /**
    * Is the legend title displayed.
    * @default false
    */
  var display: Boolean
  
  /**
    * see Fonts
    */
  var font: ScriptableAndScriptableOptions[PartialFontSpec, ScriptableChartContext]
  
  var padding: js.UndefOr[Double | ChartArea] = js.undefined
  
  var position: center | start | end
  
  /**
    * The string title.
    */
  var text: String
}
object Color {
  
  inline def apply(
    color: typingsJapgolly.chartJs.typesColorMod.Color,
    display: Boolean,
    font: ScriptableAndScriptableOptions[PartialFontSpec, ScriptableChartContext],
    position: center | start | end,
    text: String
  ): Color = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
  
  extension [Self <: Color](x: Self) {
    
    inline def setColor(value: typingsJapgolly.chartJs.typesColorMod.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setDisplay(value: Boolean): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setFont(value: ScriptableAndScriptableOptions[PartialFontSpec, ScriptableChartContext]): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontFunction2(value: (ScriptableChartContext, /* options */ AnyObject) => js.UndefOr[PartialFontSpec]): Self = StObject.set(x, "font", js.Any.fromFunction2(value))
    
    inline def setPadding(value: Double | ChartArea): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setPosition(value: center | start | end): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
