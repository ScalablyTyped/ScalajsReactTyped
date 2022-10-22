package typingsJapgolly.nivoScales

import typingsJapgolly.d3Scale.mod.NumberValue
import typingsJapgolly.d3Scale.mod.ScaleBand_
import typingsJapgolly.d3Scale.mod.ScaleLinear_
import typingsJapgolly.d3Scale.mod.ScalePoint_
import typingsJapgolly.nivoScales.anon.All
import typingsJapgolly.nivoScales.anon.Format
import typingsJapgolly.nivoScales.anon.GetValue
import typingsJapgolly.nivoScales.anon.Series
import typingsJapgolly.nivoScales.anon.Y
import typingsJapgolly.nivoScales.distTypesComputeMod.NestedSerie
import typingsJapgolly.nivoScales.distTypesComputeMod.Serie
import typingsJapgolly.nivoScales.distTypesComputeMod.SerieDatum
import typingsJapgolly.nivoScales.distTypesComputeMod.StackedXY
import typingsJapgolly.nivoScales.distTypesTimeHelpersMod.TIME_PRECISION
import typingsJapgolly.nivoScales.distTypesTypesMod.AnyScale
import typingsJapgolly.nivoScales.distTypesTypesMod.ComputedSerieAxis
import typingsJapgolly.nivoScales.distTypesTypesMod.ScaleAxis
import typingsJapgolly.nivoScales.distTypesTypesMod.ScaleBand
import typingsJapgolly.nivoScales.distTypesTypesMod.ScaleBandSpec
import typingsJapgolly.nivoScales.distTypesTypesMod.ScaleLinear
import typingsJapgolly.nivoScales.distTypesTypesMod.ScaleLinearSpec
import typingsJapgolly.nivoScales.distTypesTypesMod.ScaleLog
import typingsJapgolly.nivoScales.distTypesTypesMod.ScaleLogSpec
import typingsJapgolly.nivoScales.distTypesTypesMod.ScalePoint
import typingsJapgolly.nivoScales.distTypesTypesMod.ScalePointSpec
import typingsJapgolly.nivoScales.distTypesTypesMod.ScaleSpec
import typingsJapgolly.nivoScales.distTypesTypesMod.ScaleSymlog
import typingsJapgolly.nivoScales.distTypesTypesMod.ScaleSymlogSpec
import typingsJapgolly.nivoScales.distTypesTypesMod.ScaleTime
import typingsJapgolly.nivoScales.distTypesTypesMod.ScaleTimeSpec
import typingsJapgolly.nivoScales.distTypesTypesMod.ScaleValue
import typingsJapgolly.nivoScales.distTypesTypesMod.ScaleWithBandwidth
import typingsJapgolly.nivoScales.distTypesTypesMod.SerieAxis
import typingsJapgolly.nivoScales.distTypesTypesMod.StringValue
import typingsJapgolly.nivoScales.distTypesTypesMod.TicksSpec
import typingsJapgolly.nivoScales.nivoScalesStrings.day
import typingsJapgolly.nivoScales.nivoScalesStrings.hour
import typingsJapgolly.nivoScales.nivoScalesStrings.millisecond
import typingsJapgolly.nivoScales.nivoScalesStrings.minute
import typingsJapgolly.nivoScales.nivoScalesStrings.month
import typingsJapgolly.nivoScales.nivoScalesStrings.second
import typingsJapgolly.nivoScales.nivoScalesStrings.year
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@nivo/scales", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def castBandScale[Input](scale: ScaleBand_[Input]): ScaleBand[Input] = ^.asInstanceOf[js.Dynamic].applyDynamic("castBandScale")(scale.asInstanceOf[js.Any]).asInstanceOf[ScaleBand[Input]]
  
  inline def castLinearScale[Range_1, Output](scale: ScaleLinear_[Range_1, Output, scala.Nothing]): ScaleLinear[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("castLinearScale")(scale.asInstanceOf[js.Any]).asInstanceOf[ScaleLinear[Double]]
  inline def castLinearScale[Range_1, Output](scale: ScaleLinear_[Range_1, Output, scala.Nothing], stacked: Boolean): ScaleLinear[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("castLinearScale")(scale.asInstanceOf[js.Any], stacked.asInstanceOf[js.Any])).asInstanceOf[ScaleLinear[Double]]
  
  inline def castPointScale[Input /* <: StringValue */](scale: ScalePoint_[Input]): ScalePoint[Input] = ^.asInstanceOf[js.Dynamic].applyDynamic("castPointScale")(scale.asInstanceOf[js.Any]).asInstanceOf[ScalePoint[Input]]
  
  inline def centerScale[Value](scale: ScaleWithBandwidth): ScaleWithBandwidth | (js.Function1[/* d */ Value, Double]) = ^.asInstanceOf[js.Dynamic].applyDynamic("centerScale")(scale.asInstanceOf[js.Any]).asInstanceOf[ScaleWithBandwidth | (js.Function1[/* d */ Value, Double])]
  
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
  
  inline def createBandScale[Input /* <: StringValue */](hasRound: ScaleBandSpec, data: ComputedSerieAxis[Input], size: Double, axis: ScaleAxis): ScaleBand[Input] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBandScale")(hasRound.asInstanceOf[js.Any], data.asInstanceOf[js.Any], size.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[ScaleBand[Input]]
  
  inline def createDateNormalizer(hasFormatPrecisionUseUTC: Format): js.Function1[/* value */ js.UndefOr[js.Date | String], js.UndefOr[js.Date]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDateNormalizer")(hasFormatPrecisionUseUTC.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* value */ js.UndefOr[js.Date | String], js.UndefOr[js.Date]]]
  
  inline def createLinearScale[Output /* <: NumberValue */](
    hasMinMaxStackedReverseClampNice: ScaleLinearSpec,
    data: ComputedSerieAxis[Output],
    size: Double,
    axis: ScaleAxis
  ): ScaleLinear[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("createLinearScale")(hasMinMaxStackedReverseClampNice.asInstanceOf[js.Any], data.asInstanceOf[js.Any], size.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[ScaleLinear[Double]]
  
  inline def createLogScale(hasBaseMinMax: ScaleLogSpec, data: ComputedSerieAxis[Double], size: Double, axis: ScaleAxis): ScaleLog = (^.asInstanceOf[js.Dynamic].applyDynamic("createLogScale")(hasBaseMinMax.asInstanceOf[js.Any], data.asInstanceOf[js.Any], size.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[ScaleLog]
  
  inline def createPointScale[Input /* <: StringValue */](_spec: ScalePointSpec, data: ComputedSerieAxis[Input], size: Double): ScalePoint[Input] = (^.asInstanceOf[js.Dynamic].applyDynamic("createPointScale")(_spec.asInstanceOf[js.Any], data.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[ScalePoint[Input]]
  
  inline def createPrecisionMethod(precision: TIME_PRECISION): js.Function1[/* date */ js.Date, js.Date] = ^.asInstanceOf[js.Dynamic].applyDynamic("createPrecisionMethod")(precision.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* date */ js.Date, js.Date]]
  
  inline def createSymlogScale(
    hasConstantMinMaxReverse: ScaleSymlogSpec,
    data: ComputedSerieAxis[Double],
    size: Double,
    axis: ScaleAxis
  ): ScaleSymlog = (^.asInstanceOf[js.Dynamic].applyDynamic("createSymlogScale")(hasConstantMinMaxReverse.asInstanceOf[js.Any], data.asInstanceOf[js.Any], size.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[ScaleSymlog]
  
  inline def createTimeScale[Input /* <: js.Date | NumberValue */](
    hasFormatPrecisionMinMaxUseUTCNice: ScaleTimeSpec,
    data: ComputedSerieAxis[String | js.Date],
    size: Double
  ): ScaleTime[Input] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTimeScale")(hasFormatPrecisionMinMaxUseUTCNice.asInstanceOf[js.Any], data.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[ScaleTime[Input]]
  
  inline def generateSeriesAxis[Axis /* <: ScaleAxis */, Value /* <: ScaleValue */](series: SerieAxis[Axis, Value], axis: Axis, scaleSpec: ScaleSpec): All = (^.asInstanceOf[js.Dynamic].applyDynamic("generateSeriesAxis")(series.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], scaleSpec.asInstanceOf[js.Any])).asInstanceOf[All]
  inline def generateSeriesAxis[Axis /* <: ScaleAxis */, Value /* <: ScaleValue */](
    series: SerieAxis[Axis, Value],
    axis: Axis,
    scaleSpec: ScaleSpec,
    hasGetValueSetValue: GetValue[Axis, Value]
  ): All = (^.asInstanceOf[js.Dynamic].applyDynamic("generateSeriesAxis")(series.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], scaleSpec.asInstanceOf[js.Any], hasGetValueSetValue.asInstanceOf[js.Any])).asInstanceOf[All]
  
  inline def generateSeriesXY[S, D /* <: SerieDatum */](series: js.Array[NestedSerie[S, D]], xScaleSpec: ScaleSpec, yScaleSpec: ScaleSpec): Y = (^.asInstanceOf[js.Dynamic].applyDynamic("generateSeriesXY")(series.asInstanceOf[js.Any], xScaleSpec.asInstanceOf[js.Any], yScaleSpec.asInstanceOf[js.Any])).asInstanceOf[Y]
  
  inline def getOtherAxis(axis: ScaleAxis): ScaleAxis = ^.asInstanceOf[js.Dynamic].applyDynamic("getOtherAxis")(axis.asInstanceOf[js.Any]).asInstanceOf[ScaleAxis]
  
  inline def getScaleTicks[Value /* <: ScaleValue */](scale: AnyScale): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getScaleTicks")(scale.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  inline def getScaleTicks[Value /* <: ScaleValue */](scale: AnyScale, spec: TicksSpec[Value]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getScaleTicks")(scale.asInstanceOf[js.Any], spec.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  @JSImport("@nivo/scales", "precisionCutOffs")
  @js.native
  val precisionCutOffs: js.Array[js.Function1[/* date */ js.Date, Unit]] = js.native
  
  @JSImport("@nivo/scales", "precisionCutOffsByType")
  @js.native
  val precisionCutOffsByType: Record[TIME_PRECISION, js.Array[js.Function1[/* date */ js.Date, Unit]]] = js.native
  
  inline def stackAxis[S, D /* <: SerieDatum */](axis: ScaleAxis, xy: StackedXY, series: js.Array[NestedSerie[S, D]]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stackAxis")(axis.asInstanceOf[js.Any], xy.asInstanceOf[js.Any], series.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nivo/scales", "timePrecisions")
  @js.native
  val timePrecisions: js.Tuple7[millisecond, second, minute, hour, day, month, year] = js.native
}
