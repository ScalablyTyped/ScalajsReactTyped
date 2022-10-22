package typingsJapgolly.extjs.Ext.chart

import japgolly.scalajs.react.Callback
import typingsJapgolly.extjs.Ext.Array
import typingsJapgolly.extjs.Ext.chart.series.ISeries
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPieSeries
  extends StObject
     with ISeries {
  
  /** [Config Option] (String) */
  var angleField: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Array) */
  var colorSet: js.UndefOr[Array] = js.undefined
  
  /** [Config Option] (Boolean/Number) */
  var donut: js.UndefOr[Any] = js.undefined
  
  /** [Method] Draws the series for the current chart  */
  var drawSeries: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Config Option] (String) */
  var field: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Number) */
  var highlightDuration: js.UndefOr[Double] = js.undefined
  
  /** [Method] Highlight the specified item
    * @param item Object {Object} Info about the item; same format as returned by getItemForPoint
    */
  @JSName("highlightItem")
  var highlightItem_IPieSeries: js.UndefOr[js.Function1[/* item */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Config Option] (String) */
  var lengthField: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Object) */
  var style: js.UndefOr[Any] = js.undefined
  
  /** [Method] Un highlights the specified item
    * @param item Object {Object} Info about the item; same format as returned by getItemForPoint
    */
  @JSName("unHighlightItem")
  var unHighlightItem_IPieSeries: js.UndefOr[js.Function1[/* item */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Config Option] (String) */
  var xField: js.UndefOr[String] = js.undefined
}
object IPieSeries {
  
  inline def apply(): IPieSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPieSeries]
  }
  
  extension [Self <: IPieSeries](x: Self) {
    
    inline def setAngleField(value: String): Self = StObject.set(x, "angleField", value.asInstanceOf[js.Any])
    
    inline def setAngleFieldUndefined: Self = StObject.set(x, "angleField", js.undefined)
    
    inline def setColorSet(value: Array): Self = StObject.set(x, "colorSet", value.asInstanceOf[js.Any])
    
    inline def setColorSetUndefined: Self = StObject.set(x, "colorSet", js.undefined)
    
    inline def setDonut(value: Any): Self = StObject.set(x, "donut", value.asInstanceOf[js.Any])
    
    inline def setDonutUndefined: Self = StObject.set(x, "donut", js.undefined)
    
    inline def setDrawSeries(value: Callback): Self = StObject.set(x, "drawSeries", value.toJsFn)
    
    inline def setDrawSeriesUndefined: Self = StObject.set(x, "drawSeries", js.undefined)
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setHighlightDuration(value: Double): Self = StObject.set(x, "highlightDuration", value.asInstanceOf[js.Any])
    
    inline def setHighlightDurationUndefined: Self = StObject.set(x, "highlightDuration", js.undefined)
    
    inline def setHighlightItem(value: /* item */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "highlightItem", js.Any.fromFunction1((t0: /* item */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setHighlightItemUndefined: Self = StObject.set(x, "highlightItem", js.undefined)
    
    inline def setLengthField(value: String): Self = StObject.set(x, "lengthField", value.asInstanceOf[js.Any])
    
    inline def setLengthFieldUndefined: Self = StObject.set(x, "lengthField", js.undefined)
    
    inline def setStyle(value: Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setUnHighlightItem(value: /* item */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "unHighlightItem", js.Any.fromFunction1((t0: /* item */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setUnHighlightItemUndefined: Self = StObject.set(x, "unHighlightItem", js.undefined)
    
    inline def setXField(value: String): Self = StObject.set(x, "xField", value.asInstanceOf[js.Any])
    
    inline def setXFieldUndefined: Self = StObject.set(x, "xField", js.undefined)
  }
}
