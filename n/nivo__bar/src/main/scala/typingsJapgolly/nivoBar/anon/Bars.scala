package typingsJapgolly.nivoBar.anon

import typingsJapgolly.d3Scale.mod.NumberValue
import typingsJapgolly.nivoBar.distTypesTypesMod.BarDatum
import typingsJapgolly.nivoBar.distTypesTypesMod.ComputedBarDatum
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

trait Bars[RawDatum /* <: BarDatum */] extends StObject {
  
  var bars: js.Array[ComputedBarDatum[RawDatum]]
  
  var xScale: ScaleLog | ScaleSymlog | (ScaleBand[ScaleValue | String]) | ScaleLinear[Double] | (ScaleTime[js.Date | NumberValue]) | ScalePoint[ScaleValue]
  
  var yScale: ScaleLog | ScaleSymlog | (ScaleBand[ScaleValue | String]) | ScaleLinear[Double] | (ScaleTime[js.Date | NumberValue]) | ScalePoint[ScaleValue]
}
object Bars {
  
  inline def apply[RawDatum /* <: BarDatum */](
    bars: js.Array[ComputedBarDatum[RawDatum]],
    xScale: ScaleLog | ScaleSymlog | (ScaleBand[ScaleValue | String]) | ScaleLinear[Double] | (ScaleTime[js.Date | NumberValue]) | ScalePoint[ScaleValue],
    yScale: ScaleLog | ScaleSymlog | (ScaleBand[ScaleValue | String]) | ScaleLinear[Double] | (ScaleTime[js.Date | NumberValue]) | ScalePoint[ScaleValue]
  ): Bars[RawDatum] = {
    val __obj = js.Dynamic.literal(bars = bars.asInstanceOf[js.Any], xScale = xScale.asInstanceOf[js.Any], yScale = yScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bars[RawDatum]]
  }
  
  extension [Self <: Bars[?], RawDatum /* <: BarDatum */](x: Self & Bars[RawDatum]) {
    
    inline def setBars(value: js.Array[ComputedBarDatum[RawDatum]]): Self = StObject.set(x, "bars", value.asInstanceOf[js.Any])
    
    inline def setBarsVarargs(value: ComputedBarDatum[RawDatum]*): Self = StObject.set(x, "bars", js.Array(value*))
    
    inline def setXScale(
      value: ScaleLog | ScaleSymlog | (ScaleBand[ScaleValue | String]) | ScaleLinear[Double] | (ScaleTime[js.Date | NumberValue]) | ScalePoint[ScaleValue]
    ): Self = StObject.set(x, "xScale", value.asInstanceOf[js.Any])
    
    inline def setYScale(
      value: ScaleLog | ScaleSymlog | (ScaleBand[ScaleValue | String]) | ScaleLinear[Double] | (ScaleTime[js.Date | NumberValue]) | ScalePoint[ScaleValue]
    ): Self = StObject.set(x, "yScale", value.asInstanceOf[js.Any])
  }
}
