package typingsJapgolly.chartJs.anon

import typingsJapgolly.chartJs.mod.FontSpec
import typingsJapgolly.chartJs.mod.ScriptableAndScriptableOptions
import typingsJapgolly.chartJs.mod.ScriptableCartesianScaleContext
import typingsJapgolly.chartJs.typesBasicMod.AnyObject
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Display extends StObject {
  
  /** Alignment of the axis title. */
  var align: typingsJapgolly.chartJs.mod.Align
  
  /** Color of the axis label. */
  var color: typingsJapgolly.chartJs.typesColorMod.Color
  
  /** If true, displays the axis title. */
  var display: Boolean
  
  /** Information about the axis title font. */
  var font: ScriptableAndScriptableOptions[Partial[FontSpec], ScriptableCartesianScaleContext]
  
  /** Padding to apply around scale labels. */
  var padding: Double | Top
  
  /** The text for the title, e.g. "# of People" or "Response Choices". */
  var text: String | js.Array[String]
}
object Display {
  
  inline def apply(
    align: typingsJapgolly.chartJs.mod.Align,
    color: typingsJapgolly.chartJs.typesColorMod.Color,
    display: Boolean,
    font: ScriptableAndScriptableOptions[Partial[FontSpec], ScriptableCartesianScaleContext],
    padding: Double | Top,
    text: String | js.Array[String]
  ): Display = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Display]
  }
  
  extension [Self <: Display](x: Self) {
    
    inline def setAlign(value: typingsJapgolly.chartJs.mod.Align): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setColor(value: typingsJapgolly.chartJs.typesColorMod.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setDisplay(value: Boolean): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setFont(value: ScriptableAndScriptableOptions[Partial[FontSpec], ScriptableCartesianScaleContext]): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontFunction2(value: (ScriptableCartesianScaleContext, /* options */ AnyObject) => js.UndefOr[Partial[FontSpec]]): Self = StObject.set(x, "font", js.Any.fromFunction2(value))
    
    inline def setPadding(value: Double | Top): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setText(value: String | js.Array[String]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextVarargs(value: String*): Self = StObject.set(x, "text", js.Array(value*))
  }
}
