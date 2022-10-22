package typingsJapgolly.nivoScales

import typingsJapgolly.d3Scale.mod.NumberValue
import typingsJapgolly.nivoScales.anon.All
import typingsJapgolly.nivoScales.anon.DataArray
import typingsJapgolly.nivoScales.anon.FnCall
import typingsJapgolly.nivoScales.anon.GetValue
import typingsJapgolly.nivoScales.anon.Series
import typingsJapgolly.nivoScales.anon.Y
import typingsJapgolly.nivoScales.anon.`0`
import typingsJapgolly.nivoScales.anon.`1`
import typingsJapgolly.nivoScales.distTypesTypesMod.ComputedSerieAxis
import typingsJapgolly.nivoScales.distTypesTypesMod.ScaleAxis
import typingsJapgolly.nivoScales.distTypesTypesMod.ScaleBand
import typingsJapgolly.nivoScales.distTypesTypesMod.ScaleLinear
import typingsJapgolly.nivoScales.distTypesTypesMod.ScaleLog
import typingsJapgolly.nivoScales.distTypesTypesMod.ScalePoint
import typingsJapgolly.nivoScales.distTypesTypesMod.ScaleSpec
import typingsJapgolly.nivoScales.distTypesTypesMod.ScaleSymlog
import typingsJapgolly.nivoScales.distTypesTypesMod.ScaleTime
import typingsJapgolly.nivoScales.distTypesTypesMod.ScaleValue
import typingsJapgolly.nivoScales.distTypesTypesMod.SerieAxis
import typingsJapgolly.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComputeMod {
  
  @JSImport("@nivo/scales/dist/types/compute", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compareDateValues(a: js.Date, b: js.Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareDateValues")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def compareValues(a: String, b: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareValues")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def compareValues(a: String, b: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareValues")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def compareValues(a: Double, b: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareValues")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def compareValues(a: Double, b: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareValues")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def computeScale[Input /* <: ScaleValue */](spec: ScaleSpec, data: ComputedSerieAxis[Any], size: Double, axis: ScaleAxis): ScaleLog | ScaleSymlog | ScaleLinear[Double] | ScalePoint[Input] | ScaleBand[Input] | (ScaleTime[js.Date | NumberValue]) = (^.asInstanceOf[js.Dynamic].applyDynamic("computeScale")(spec.asInstanceOf[js.Any], data.asInstanceOf[js.Any], size.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[ScaleLog | ScaleSymlog | ScaleLinear[Double] | ScalePoint[Input] | ScaleBand[Input] | (ScaleTime[js.Date | NumberValue])]
  
  inline def computeXYScalesForSeries[S, D /* <: SerieDatum */](
    series: js.Array[Serie[S, D]],
    xScaleSpec: ScaleSpec,
    yScaleSpec: ScaleSpec,
    width: Double,
    height: Double
  ): Series[S, D] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeXYScalesForSeries")(series.asInstanceOf[js.Any], xScaleSpec.asInstanceOf[js.Any], yScaleSpec.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Series[S, D]]
  
  inline def generateSeriesAxis[Axis /* <: ScaleAxis */, Value /* <: ScaleValue */](series: SerieAxis[Axis, Value], axis: Axis, scaleSpec: ScaleSpec): All = (^.asInstanceOf[js.Dynamic].applyDynamic("generateSeriesAxis")(series.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], scaleSpec.asInstanceOf[js.Any])).asInstanceOf[All]
  inline def generateSeriesAxis[Axis /* <: ScaleAxis */, Value /* <: ScaleValue */](
    series: SerieAxis[Axis, Value],
    axis: Axis,
    scaleSpec: ScaleSpec,
    hasGetValueSetValue: GetValue[Axis, Value]
  ): All = (^.asInstanceOf[js.Dynamic].applyDynamic("generateSeriesAxis")(series.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], scaleSpec.asInstanceOf[js.Any], hasGetValueSetValue.asInstanceOf[js.Any])).asInstanceOf[All]
  
  inline def generateSeriesXY[S, D /* <: SerieDatum */](series: js.Array[NestedSerie[S, D]], xScaleSpec: ScaleSpec, yScaleSpec: ScaleSpec): Y = (^.asInstanceOf[js.Dynamic].applyDynamic("generateSeriesXY")(series.asInstanceOf[js.Any], xScaleSpec.asInstanceOf[js.Any], yScaleSpec.asInstanceOf[js.Any])).asInstanceOf[Y]
  
  inline def getOtherAxis(axis: ScaleAxis): ScaleAxis = ^.asInstanceOf[js.Dynamic].applyDynamic("getOtherAxis")(axis.asInstanceOf[js.Any]).asInstanceOf[ScaleAxis]
  
  inline def stackAxis[S, D /* <: SerieDatum */](axis: ScaleAxis, xy: StackedXY, series: js.Array[NestedSerie[S, D]]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stackAxis")(axis.asInstanceOf[js.Any], xy.asInstanceOf[js.Any], series.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type ComputedSerie[S, D /* <: SerieDatum */] = S & DataArray[D]
  
  type NestedSerie[S, D /* <: SerieDatum */] = S & `0`[D]
  
  type Serie[S, D /* <: SerieDatum */] = S & `1`[D]
  
  trait SerieDatum extends StObject {
    
    var x: Double | String | js.Date
    
    var xStacked: js.UndefOr[Double | Null] = js.undefined
    
    var y: Double | String | js.Date
    
    var yStacked: js.UndefOr[Double | Null] = js.undefined
  }
  object SerieDatum {
    
    inline def apply(x: Double | String | js.Date, y: Double | String | js.Date): SerieDatum = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[SerieDatum]
    }
    
    extension [Self <: SerieDatum](x: Self) {
      
      inline def setX(value: Double | String | js.Date): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXStacked(value: Double): Self = StObject.set(x, "xStacked", value.asInstanceOf[js.Any])
      
      inline def setXStackedNull: Self = StObject.set(x, "xStacked", null)
      
      inline def setXStackedUndefined: Self = StObject.set(x, "xStacked", js.undefined)
      
      inline def setY(value: Double | String | js.Date): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYStacked(value: Double): Self = StObject.set(x, "yStacked", value.asInstanceOf[js.Any])
      
      inline def setYStackedNull: Self = StObject.set(x, "yStacked", null)
      
      inline def setYStackedUndefined: Self = StObject.set(x, "yStacked", js.undefined)
    }
  }
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof @nivo/scales.@nivo/scales/dist/types/compute.XY ]: @nivo/scales.@nivo/scales/dist/types/compute.XY[K] & {  maxStacked :number,   minStacked :number}}
    }}}
    */
  @js.native
  trait StackedXY extends StObject
  
  type XY = ReturnType[FnCall]
}
