package typingsJapgolly.extjs.Ext.chart

import japgolly.scalajs.react.Callback
import typingsJapgolly.extjs.Ext.chart.series.ICartesian
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILineSeries
  extends StObject
     with ICartesian {
  
  /** [Method] Draws the series for the current chart  */
  var drawSeries: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var fill: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Object) */
  var markerConfig: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Number) */
  var selectionTolerance: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Boolean) */
  var showMarkers: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean/Number) */
  var smooth: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Object) */
  var style: js.UndefOr[Any] = js.undefined
}
object ILineSeries {
  
  inline def apply(): ILineSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILineSeries]
  }
  
  extension [Self <: ILineSeries](x: Self) {
    
    inline def setDrawSeries(value: Callback): Self = StObject.set(x, "drawSeries", value.toJsFn)
    
    inline def setDrawSeriesUndefined: Self = StObject.set(x, "drawSeries", js.undefined)
    
    inline def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setMarkerConfig(value: Any): Self = StObject.set(x, "markerConfig", value.asInstanceOf[js.Any])
    
    inline def setMarkerConfigUndefined: Self = StObject.set(x, "markerConfig", js.undefined)
    
    inline def setSelectionTolerance(value: Double): Self = StObject.set(x, "selectionTolerance", value.asInstanceOf[js.Any])
    
    inline def setSelectionToleranceUndefined: Self = StObject.set(x, "selectionTolerance", js.undefined)
    
    inline def setShowMarkers(value: Boolean): Self = StObject.set(x, "showMarkers", value.asInstanceOf[js.Any])
    
    inline def setShowMarkersUndefined: Self = StObject.set(x, "showMarkers", js.undefined)
    
    inline def setSmooth(value: Any): Self = StObject.set(x, "smooth", value.asInstanceOf[js.Any])
    
    inline def setSmoothUndefined: Self = StObject.set(x, "smooth", js.undefined)
    
    inline def setStyle(value: Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
