package typingsJapgolly.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NoDataOptions extends StObject {
  
  /**
    * (Highcharts, Highstock, Gantt) An object of additional SVG attributes for
    * the no-data label.
    */
  var attr: js.UndefOr[SVGAttributes] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) The position of the no-data label,
    * relative to the plot area.
    */
  var position: js.UndefOr[AlignObject | NoDataPositionOptions] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) CSS styles for the no-data label.
    */
  var style: js.UndefOr[CSSObject] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) Whether to insert the label as HTML, or as
    * pseudo-HTML rendered with SVG.
    */
  var useHTML: js.UndefOr[Boolean] = js.undefined
}
object NoDataOptions {
  
  inline def apply(): NoDataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NoDataOptions]
  }
  
  extension [Self <: NoDataOptions](x: Self) {
    
    inline def setAttr(value: SVGAttributes): Self = StObject.set(x, "attr", value.asInstanceOf[js.Any])
    
    inline def setAttrUndefined: Self = StObject.set(x, "attr", js.undefined)
    
    inline def setPosition(value: AlignObject | NoDataPositionOptions): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setStyle(value: CSSObject): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setUseHTML(value: Boolean): Self = StObject.set(x, "useHTML", value.asInstanceOf[js.Any])
    
    inline def setUseHTMLUndefined: Self = StObject.set(x, "useHTML", js.undefined)
  }
}
