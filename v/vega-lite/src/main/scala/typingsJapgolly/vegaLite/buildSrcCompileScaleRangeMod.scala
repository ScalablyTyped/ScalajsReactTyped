package typingsJapgolly.vegaLite

import typingsJapgolly.vegaLite.buildSrcChannelMod.ScaleChannel
import typingsJapgolly.vegaLite.buildSrcCompileSplitMod.Explicit
import typingsJapgolly.vegaLite.buildSrcCompileUnitMod.UnitModel
import typingsJapgolly.vegaLite.buildSrcConfigMod.Config
import typingsJapgolly.vegaLite.buildSrcExprMod.ExprRef
import typingsJapgolly.vegaLite.buildSrcScaleMod.Domain
import typingsJapgolly.vegaLite.buildSrcVegaDotschemaMod.VgRange
import typingsJapgolly.vegaLite.vegaLiteStrings.`type`
import typingsJapgolly.vegaLite.vegaLiteStrings.align
import typingsJapgolly.vegaLite.vegaLiteStrings.base
import typingsJapgolly.vegaLite.vegaLiteStrings.bins
import typingsJapgolly.vegaLite.vegaLiteStrings.clamp
import typingsJapgolly.vegaLite.vegaLiteStrings.constant
import typingsJapgolly.vegaLite.vegaLiteStrings.domain
import typingsJapgolly.vegaLite.vegaLiteStrings.domainMax
import typingsJapgolly.vegaLite.vegaLiteStrings.domainMid
import typingsJapgolly.vegaLite.vegaLiteStrings.domainMin
import typingsJapgolly.vegaLite.vegaLiteStrings.exponent
import typingsJapgolly.vegaLite.vegaLiteStrings.interpolate
import typingsJapgolly.vegaLite.vegaLiteStrings.nice
import typingsJapgolly.vegaLite.vegaLiteStrings.padding
import typingsJapgolly.vegaLite.vegaLiteStrings.paddingInner
import typingsJapgolly.vegaLite.vegaLiteStrings.paddingOuter
import typingsJapgolly.vegaLite.vegaLiteStrings.quantile
import typingsJapgolly.vegaLite.vegaLiteStrings.quantize
import typingsJapgolly.vegaLite.vegaLiteStrings.range
import typingsJapgolly.vegaLite.vegaLiteStrings.rangeMax
import typingsJapgolly.vegaLite.vegaLiteStrings.rangeMin
import typingsJapgolly.vegaLite.vegaLiteStrings.reverse
import typingsJapgolly.vegaLite.vegaLiteStrings.round
import typingsJapgolly.vegaLite.vegaLiteStrings.scheme
import typingsJapgolly.vegaLite.vegaLiteStrings.threshold
import typingsJapgolly.vegaLite.vegaLiteStrings.zero
import typingsJapgolly.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileScaleRangeMod {
  
  @JSImport("vega-lite/build/src/compile/scale/range", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vega-lite/build/src/compile/scale/range", "MAX_SIZE_RANGE_STEP_RATIO")
  @js.native
  val MAX_SIZE_RANGE_STEP_RATIO: /* 0.95 */ Double = js.native
  
  @JSImport("vega-lite/build/src/compile/scale/range", "RANGE_PROPERTIES")
  @js.native
  val RANGE_PROPERTIES: js.Array[
    /* keyof vega-lite.vega-lite/build/src/scale.Scale<vega-lite.vega-lite/build/src/expr.ExprRef | vega-typings.vega-typings/types/spec/signal.SignalRef> */ `type` | domain | domainMid | domainMax | domainMin | reverse | range | rangeMax | rangeMin | scheme | align | bins | round | padding | paddingInner | paddingOuter | clamp | nice | base | exponent | constant | zero | interpolate
  ] = js.native
  
  inline def defaultContinuousToDiscreteCount(
    scaleType: quantile | quantize | threshold,
    config: Config[ExprRef | SignalRef],
    domain: Domain,
    channel: ScaleChannel
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultContinuousToDiscreteCount")(scaleType.asInstanceOf[js.Any], config.asInstanceOf[js.Any], domain.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def interpolateRange(rangeMin: Double, rangeMax: Double, cardinality: Double): SignalRef = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateRange")(rangeMin.asInstanceOf[js.Any], rangeMax.asInstanceOf[js.Any], cardinality.asInstanceOf[js.Any])).asInstanceOf[SignalRef]
  inline def interpolateRange(rangeMin: Double, rangeMax: SignalRef, cardinality: Double): SignalRef = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateRange")(rangeMin.asInstanceOf[js.Any], rangeMax.asInstanceOf[js.Any], cardinality.asInstanceOf[js.Any])).asInstanceOf[SignalRef]
  inline def interpolateRange(rangeMin: SignalRef, rangeMax: Double, cardinality: Double): SignalRef = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateRange")(rangeMin.asInstanceOf[js.Any], rangeMax.asInstanceOf[js.Any], cardinality.asInstanceOf[js.Any])).asInstanceOf[SignalRef]
  inline def interpolateRange(rangeMin: SignalRef, rangeMax: SignalRef, cardinality: Double): SignalRef = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateRange")(rangeMin.asInstanceOf[js.Any], rangeMax.asInstanceOf[js.Any], cardinality.asInstanceOf[js.Any])).asInstanceOf[SignalRef]
  
  inline def parseRangeForChannel(channel: ScaleChannel, model: UnitModel): Explicit[VgRange] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseRangeForChannel")(channel.asInstanceOf[js.Any], model.asInstanceOf[js.Any])).asInstanceOf[Explicit[VgRange]]
  
  inline def parseUnitScaleRange(model: UnitModel): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parseUnitScaleRange")(model.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
