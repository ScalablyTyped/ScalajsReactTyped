package typingsJapgolly.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartValueAxisItem extends StObject {
  
  var axisCrossingValue: js.UndefOr[Any | js.Date] = js.undefined
  
  var background: js.UndefOr[String] = js.undefined
  
  var color: js.UndefOr[String] = js.undefined
  
  var crosshair: js.UndefOr[ChartValueAxisItemCrosshair] = js.undefined
  
  var labels: js.UndefOr[ChartValueAxisItemLabels] = js.undefined
  
  var line: js.UndefOr[ChartValueAxisItemLine] = js.undefined
  
  var majorGridLines: js.UndefOr[ChartValueAxisItemMajorGridLines] = js.undefined
  
  var majorTicks: js.UndefOr[ChartValueAxisItemMajorTicks] = js.undefined
  
  var majorUnit: js.UndefOr[Double] = js.undefined
  
  var max: js.UndefOr[Double] = js.undefined
  
  var min: js.UndefOr[Double] = js.undefined
  
  var minorGridLines: js.UndefOr[ChartValueAxisItemMinorGridLines] = js.undefined
  
  var minorTicks: js.UndefOr[ChartValueAxisItemMinorTicks] = js.undefined
  
  var minorUnit: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var narrowRange: js.UndefOr[Boolean] = js.undefined
  
  var notes: js.UndefOr[ChartValueAxisItemNotes] = js.undefined
  
  var pane: js.UndefOr[String] = js.undefined
  
  var plotBands: js.UndefOr[js.Array[ChartValueAxisItemPlotBand]] = js.undefined
  
  var reverse: js.UndefOr[Boolean] = js.undefined
  
  var title: js.UndefOr[ChartValueAxisItemTitle] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
}
object ChartValueAxisItem {
  
  inline def apply(): ChartValueAxisItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartValueAxisItem]
  }
  
  extension [Self <: ChartValueAxisItem](x: Self) {
    
    inline def setAxisCrossingValue(value: Any | js.Date): Self = StObject.set(x, "axisCrossingValue", value.asInstanceOf[js.Any])
    
    inline def setAxisCrossingValueUndefined: Self = StObject.set(x, "axisCrossingValue", js.undefined)
    
    inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setCrosshair(value: ChartValueAxisItemCrosshair): Self = StObject.set(x, "crosshair", value.asInstanceOf[js.Any])
    
    inline def setCrosshairUndefined: Self = StObject.set(x, "crosshair", js.undefined)
    
    inline def setLabels(value: ChartValueAxisItemLabels): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLine(value: ChartValueAxisItemLine): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setMajorGridLines(value: ChartValueAxisItemMajorGridLines): Self = StObject.set(x, "majorGridLines", value.asInstanceOf[js.Any])
    
    inline def setMajorGridLinesUndefined: Self = StObject.set(x, "majorGridLines", js.undefined)
    
    inline def setMajorTicks(value: ChartValueAxisItemMajorTicks): Self = StObject.set(x, "majorTicks", value.asInstanceOf[js.Any])
    
    inline def setMajorTicksUndefined: Self = StObject.set(x, "majorTicks", js.undefined)
    
    inline def setMajorUnit(value: Double): Self = StObject.set(x, "majorUnit", value.asInstanceOf[js.Any])
    
    inline def setMajorUnitUndefined: Self = StObject.set(x, "majorUnit", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setMinorGridLines(value: ChartValueAxisItemMinorGridLines): Self = StObject.set(x, "minorGridLines", value.asInstanceOf[js.Any])
    
    inline def setMinorGridLinesUndefined: Self = StObject.set(x, "minorGridLines", js.undefined)
    
    inline def setMinorTicks(value: ChartValueAxisItemMinorTicks): Self = StObject.set(x, "minorTicks", value.asInstanceOf[js.Any])
    
    inline def setMinorTicksUndefined: Self = StObject.set(x, "minorTicks", js.undefined)
    
    inline def setMinorUnit(value: Double): Self = StObject.set(x, "minorUnit", value.asInstanceOf[js.Any])
    
    inline def setMinorUnitUndefined: Self = StObject.set(x, "minorUnit", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNarrowRange(value: Boolean): Self = StObject.set(x, "narrowRange", value.asInstanceOf[js.Any])
    
    inline def setNarrowRangeUndefined: Self = StObject.set(x, "narrowRange", js.undefined)
    
    inline def setNotes(value: ChartValueAxisItemNotes): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    inline def setPane(value: String): Self = StObject.set(x, "pane", value.asInstanceOf[js.Any])
    
    inline def setPaneUndefined: Self = StObject.set(x, "pane", js.undefined)
    
    inline def setPlotBands(value: js.Array[ChartValueAxisItemPlotBand]): Self = StObject.set(x, "plotBands", value.asInstanceOf[js.Any])
    
    inline def setPlotBandsUndefined: Self = StObject.set(x, "plotBands", js.undefined)
    
    inline def setPlotBandsVarargs(value: ChartValueAxisItemPlotBand*): Self = StObject.set(x, "plotBands", js.Array(value*))
    
    inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    
    inline def setTitle(value: ChartValueAxisItemTitle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
