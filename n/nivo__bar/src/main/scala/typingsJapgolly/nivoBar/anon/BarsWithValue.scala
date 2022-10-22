package typingsJapgolly.nivoBar.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.d3Scale.mod.NumberValue
import typingsJapgolly.nivoBar.distTypesTypesMod.BarDatum
import typingsJapgolly.nivoBar.distTypesTypesMod.BarLegendProps
import typingsJapgolly.nivoBar.distTypesTypesMod.ComputedBarDatum
import typingsJapgolly.nivoBar.distTypesTypesMod.ComputedBarDatumWithValue
import typingsJapgolly.nivoBar.distTypesTypesMod.ComputedDatum
import typingsJapgolly.nivoBar.distTypesTypesMod.LegendData
import typingsJapgolly.nivoColors.distTypesInheritedColorMod.InheritedColorConfigCustomFunction
import typingsJapgolly.nivoColors.distTypesScalesOrdinalColorScaleMod.OrdinalColorScale
import typingsJapgolly.nivoScales.distTypesTypesMod.ScaleBand
import typingsJapgolly.nivoScales.distTypesTypesMod.ScaleLinear
import typingsJapgolly.nivoScales.distTypesTypesMod.ScaleLog
import typingsJapgolly.nivoScales.distTypesTypesMod.ScalePoint
import typingsJapgolly.nivoScales.distTypesTypesMod.ScaleSymlog
import typingsJapgolly.nivoScales.distTypesTypesMod.ScaleTime
import typingsJapgolly.nivoScales.distTypesTypesMod.ScaleValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BarsWithValue[RawDatum /* <: BarDatum */] extends StObject {
  
  var bars: js.Array[ComputedBarDatum[RawDatum]]
  
  var barsWithValue: js.Array[AbsX[RawDatum]]
  
  def formatValue(value: Double): String
  
  var getBorderColor: InheritedColorConfigCustomFunction[ComputedBarDatumWithValue[RawDatum]] | (js.Function1[/* d */ ComputedBarDatumWithValue[RawDatum], Any])
  
  var getColor: OrdinalColorScale[ComputedDatum[RawDatum]]
  
  def getIndex(datum: RawDatum): String
  
  def getLabel(datum: ComputedDatum[RawDatum]): String
  
  var getLabelColor: InheritedColorConfigCustomFunction[ComputedBarDatumWithValue[RawDatum]] | (js.Function1[/* d */ ComputedBarDatumWithValue[RawDatum], Any])
  
  def getTooltipLabel(datum: ComputedDatum[RawDatum]): String
  
  var hiddenIds: js.Array[String]
  
  var legendsWithData: js.Array[js.Tuple2[BarLegendProps, js.Array[LegendData]]]
  
  def shouldRenderBarLabel(hasWidthHeight: Height): Boolean
  
  def toggleSerie(id: Any): Unit
  
  var xScale: ScaleLog | ScaleSymlog | (ScaleBand[ScaleValue | String]) | ScaleLinear[Double] | (ScaleTime[js.Date | NumberValue]) | ScalePoint[ScaleValue]
  
  var yScale: ScaleLog | ScaleSymlog | (ScaleBand[ScaleValue | String]) | ScaleLinear[Double] | (ScaleTime[js.Date | NumberValue]) | ScalePoint[ScaleValue]
}
object BarsWithValue {
  
  inline def apply[RawDatum /* <: BarDatum */](
    bars: js.Array[ComputedBarDatum[RawDatum]],
    barsWithValue: js.Array[AbsX[RawDatum]],
    formatValue: Double => String,
    getBorderColor: InheritedColorConfigCustomFunction[ComputedBarDatumWithValue[RawDatum]] | (js.Function1[/* d */ ComputedBarDatumWithValue[RawDatum], Any]),
    getColor: ComputedDatum[RawDatum] => String,
    getIndex: RawDatum => String,
    getLabel: ComputedDatum[RawDatum] => String,
    getLabelColor: InheritedColorConfigCustomFunction[ComputedBarDatumWithValue[RawDatum]] | (js.Function1[/* d */ ComputedBarDatumWithValue[RawDatum], Any]),
    getTooltipLabel: ComputedDatum[RawDatum] => String,
    hiddenIds: js.Array[String],
    legendsWithData: js.Array[js.Tuple2[BarLegendProps, js.Array[LegendData]]],
    shouldRenderBarLabel: Height => Boolean,
    toggleSerie: Any => Callback,
    xScale: ScaleLog | ScaleSymlog | (ScaleBand[ScaleValue | String]) | ScaleLinear[Double] | (ScaleTime[js.Date | NumberValue]) | ScalePoint[ScaleValue],
    yScale: ScaleLog | ScaleSymlog | (ScaleBand[ScaleValue | String]) | ScaleLinear[Double] | (ScaleTime[js.Date | NumberValue]) | ScalePoint[ScaleValue]
  ): BarsWithValue[RawDatum] = {
    val __obj = js.Dynamic.literal(bars = bars.asInstanceOf[js.Any], barsWithValue = barsWithValue.asInstanceOf[js.Any], formatValue = js.Any.fromFunction1(formatValue), getBorderColor = getBorderColor.asInstanceOf[js.Any], getColor = js.Any.fromFunction1(getColor), getIndex = js.Any.fromFunction1(getIndex), getLabel = js.Any.fromFunction1(getLabel), getLabelColor = getLabelColor.asInstanceOf[js.Any], getTooltipLabel = js.Any.fromFunction1(getTooltipLabel), hiddenIds = hiddenIds.asInstanceOf[js.Any], legendsWithData = legendsWithData.asInstanceOf[js.Any], shouldRenderBarLabel = js.Any.fromFunction1(shouldRenderBarLabel), toggleSerie = js.Any.fromFunction1((t0: Any) => toggleSerie(t0).runNow()), xScale = xScale.asInstanceOf[js.Any], yScale = yScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarsWithValue[RawDatum]]
  }
  
  extension [Self <: BarsWithValue[?], RawDatum /* <: BarDatum */](x: Self & BarsWithValue[RawDatum]) {
    
    inline def setBars(value: js.Array[ComputedBarDatum[RawDatum]]): Self = StObject.set(x, "bars", value.asInstanceOf[js.Any])
    
    inline def setBarsVarargs(value: ComputedBarDatum[RawDatum]*): Self = StObject.set(x, "bars", js.Array(value*))
    
    inline def setBarsWithValue(value: js.Array[AbsX[RawDatum]]): Self = StObject.set(x, "barsWithValue", value.asInstanceOf[js.Any])
    
    inline def setBarsWithValueVarargs(value: AbsX[RawDatum]*): Self = StObject.set(x, "barsWithValue", js.Array(value*))
    
    inline def setFormatValue(value: Double => String): Self = StObject.set(x, "formatValue", js.Any.fromFunction1(value))
    
    inline def setGetBorderColor(
      value: InheritedColorConfigCustomFunction[ComputedBarDatumWithValue[RawDatum]] | (js.Function1[/* d */ ComputedBarDatumWithValue[RawDatum], Any])
    ): Self = StObject.set(x, "getBorderColor", value.asInstanceOf[js.Any])
    
    inline def setGetBorderColorFunction1(value: /* d */ ComputedBarDatumWithValue[RawDatum] => Any): Self = StObject.set(x, "getBorderColor", js.Any.fromFunction1(value))
    
    inline def setGetColor(value: ComputedDatum[RawDatum] => String): Self = StObject.set(x, "getColor", js.Any.fromFunction1(value))
    
    inline def setGetIndex(value: RawDatum => String): Self = StObject.set(x, "getIndex", js.Any.fromFunction1(value))
    
    inline def setGetLabel(value: ComputedDatum[RawDatum] => String): Self = StObject.set(x, "getLabel", js.Any.fromFunction1(value))
    
    inline def setGetLabelColor(
      value: InheritedColorConfigCustomFunction[ComputedBarDatumWithValue[RawDatum]] | (js.Function1[/* d */ ComputedBarDatumWithValue[RawDatum], Any])
    ): Self = StObject.set(x, "getLabelColor", value.asInstanceOf[js.Any])
    
    inline def setGetLabelColorFunction1(value: /* d */ ComputedBarDatumWithValue[RawDatum] => Any): Self = StObject.set(x, "getLabelColor", js.Any.fromFunction1(value))
    
    inline def setGetTooltipLabel(value: ComputedDatum[RawDatum] => String): Self = StObject.set(x, "getTooltipLabel", js.Any.fromFunction1(value))
    
    inline def setHiddenIds(value: js.Array[String]): Self = StObject.set(x, "hiddenIds", value.asInstanceOf[js.Any])
    
    inline def setHiddenIdsVarargs(value: String*): Self = StObject.set(x, "hiddenIds", js.Array(value*))
    
    inline def setLegendsWithData(value: js.Array[js.Tuple2[BarLegendProps, js.Array[LegendData]]]): Self = StObject.set(x, "legendsWithData", value.asInstanceOf[js.Any])
    
    inline def setLegendsWithDataVarargs(value: (js.Tuple2[BarLegendProps, js.Array[LegendData]])*): Self = StObject.set(x, "legendsWithData", js.Array(value*))
    
    inline def setShouldRenderBarLabel(value: Height => Boolean): Self = StObject.set(x, "shouldRenderBarLabel", js.Any.fromFunction1(value))
    
    inline def setToggleSerie(value: Any => Callback): Self = StObject.set(x, "toggleSerie", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setXScale(
      value: ScaleLog | ScaleSymlog | (ScaleBand[ScaleValue | String]) | ScaleLinear[Double] | (ScaleTime[js.Date | NumberValue]) | ScalePoint[ScaleValue]
    ): Self = StObject.set(x, "xScale", value.asInstanceOf[js.Any])
    
    inline def setYScale(
      value: ScaleLog | ScaleSymlog | (ScaleBand[ScaleValue | String]) | ScaleLinear[Double] | (ScaleTime[js.Date | NumberValue]) | ScalePoint[ScaleValue]
    ): Self = StObject.set(x, "yScale", value.asInstanceOf[js.Any])
  }
}
