package typingsJapgolly.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZAxisCurrentDateIndicatorLabelOptions extends StObject {
  
  /**
    * (Gantt) Horizontal alignment of the label. Can be one of "left", "center"
    * or "right".
    */
  var align: js.UndefOr[AlignValue] = js.undefined
  
  /**
    * (Gantt) Format of the label. This options is passed as the fist argument
    * to dateFormat function.
    */
  var format: js.UndefOr[String] = js.undefined
  
  /**
    * (Gantt) Callback JavaScript function to format the label. Useful
    * properties like the value of plot line or the range of plot band (`from`
    * & `to` properties) can be found in `this.options` object.
    */
  var formatter: js.UndefOr[FormatterCallbackFunction[PlotLineOrBand]] = js.undefined
  
  /**
    * (Gantt) Rotation of the text label in degrees. Defaults to 0 for
    * horizontal plot lines and 90 for vertical lines.
    */
  var rotation: js.UndefOr[Double] = js.undefined
  
  /**
    * (Gantt) CSS styles for the text label.
    *
    * In styled mode, the labels are styled by the
    * `.highcharts-plot-line-label` class.
    */
  var style: js.UndefOr[CSSObject] = js.undefined
  
  /**
    * (Gantt) The text itself. A subset of HTML is supported.
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * (Gantt) The text alignment for the label. While `align` determines where
    * the texts anchor point is placed within the plot band, `textAlign`
    * determines how the text is aligned against its anchor point. Possible
    * values are "left", "center" and "right". Defaults to the same as the
    * `align` option.
    */
  var textAlign: js.UndefOr[AlignValue] = js.undefined
  
  /**
    * (Gantt) Whether to use HTML to render the labels.
    */
  var useHTML: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Gantt) Vertical alignment of the label relative to the plot line. Can be
    * one of "top", "middle" or "bottom".
    */
  var verticalAlign: js.UndefOr[VerticalAlignValue] = js.undefined
  
  /**
    * (Gantt) Horizontal position relative the alignment. Default varies by
    * orientation.
    */
  var x: js.UndefOr[Double] = js.undefined
  
  /**
    * (Gantt) Vertical position of the text baseline relative to the alignment.
    * Default varies by orientation.
    */
  var y: js.UndefOr[Double] = js.undefined
}
object ZAxisCurrentDateIndicatorLabelOptions {
  
  inline def apply(): ZAxisCurrentDateIndicatorLabelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZAxisCurrentDateIndicatorLabelOptions]
  }
  
  extension [Self <: ZAxisCurrentDateIndicatorLabelOptions](x: Self) {
    
    inline def setAlign(value: AlignValue): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setFormatter(value: FormatterCallbackFunction[PlotLineOrBand]): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
    
    inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    inline def setStyle(value: CSSObject): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextAlign(value: AlignValue): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
    
    inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setUseHTML(value: Boolean): Self = StObject.set(x, "useHTML", value.asInstanceOf[js.Any])
    
    inline def setUseHTMLUndefined: Self = StObject.set(x, "useHTML", js.undefined)
    
    inline def setVerticalAlign(value: VerticalAlignValue): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
    
    inline def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
