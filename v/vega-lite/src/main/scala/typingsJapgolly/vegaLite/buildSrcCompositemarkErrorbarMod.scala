package typingsJapgolly.vegaLite

import typingsJapgolly.vegaLite.anon.ContinuousAxisChannelDef
import typingsJapgolly.vegaLite.anon.`6`
import typingsJapgolly.vegaLite.buildSrcChanneldefMod.ColorDef
import typingsJapgolly.vegaLite.buildSrcChanneldefMod.Field
import typingsJapgolly.vegaLite.buildSrcChanneldefMod.FieldDefWithoutScale
import typingsJapgolly.vegaLite.buildSrcChanneldefMod.NumericMarkPropDef
import typingsJapgolly.vegaLite.buildSrcChanneldefMod.Position2Def
import typingsJapgolly.vegaLite.buildSrcChanneldefMod.PositionDef
import typingsJapgolly.vegaLite.buildSrcChanneldefMod.SecondaryFieldDef
import typingsJapgolly.vegaLite.buildSrcChanneldefMod.ValueDef
import typingsJapgolly.vegaLite.buildSrcCompositemarkBaseMod.CompositeMarkNormalizer
import typingsJapgolly.vegaLite.buildSrcCompositemarkCommonMod.GenericCompositeMarkDef
import typingsJapgolly.vegaLite.buildSrcCompositemarkCommonMod.PartsMixins
import typingsJapgolly.vegaLite.buildSrcCompositemarkErrorbandMod.ErrorBand
import typingsJapgolly.vegaLite.buildSrcCompositemarkErrorbandMod.ErrorBandDef
import typingsJapgolly.vegaLite.buildSrcConfigMod.Config
import typingsJapgolly.vegaLite.buildSrcExprMod.ExprRef
import typingsJapgolly.vegaLite.buildSrcNormalizeBaseMod.NormalizerParams
import typingsJapgolly.vegaLite.buildSrcSelectionMod.SelectionParameter
import typingsJapgolly.vegaLite.buildSrcSelectionMod.SelectionType
import typingsJapgolly.vegaLite.buildSrcSpecLayerMod.NormalizedLayerSpec
import typingsJapgolly.vegaLite.buildSrcSpecUnitMod.GenericUnitSpec
import typingsJapgolly.vegaLite.buildSrcSpecUnitMod.NormalizedUnitSpec
import typingsJapgolly.vegaLite.buildSrcTypeMod.StandardType
import typingsJapgolly.vegaLite.vegaLiteStrings.errorbar
import typingsJapgolly.vegaLite.vegaLiteStrings.rule
import typingsJapgolly.vegaLite.vegaLiteStrings.ticks
import typingsJapgolly.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompositemarkErrorbarMod {
  
  @JSImport("vega-lite/build/src/compositemark/errorbar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vega-lite/build/src/compositemark/errorbar", "ERRORBAR")
  @js.native
  val ERRORBAR_ : errorbar = js.native
  
  @JSImport("vega-lite/build/src/compositemark/errorbar", "ERRORBAR_PARTS")
  @js.native
  val ERRORBAR_PARTS: js.Tuple2[ticks, rule] = js.native
  
  @JSImport("vega-lite/build/src/compositemark/errorbar", "errorBarNormalizer")
  @js.native
  val errorBarNormalizer: CompositeMarkNormalizer[errorbar] = js.native
  
  inline def errorBarParams[M /* <: ErrorBar | ErrorBand */, MD /* <: (ErrorBarDef & GenericCompositeMarkDef[M]) | (ErrorBandDef & GenericCompositeMarkDef[M]) */](
    spec: GenericUnitSpec[ErrorEncoding[String], M | MD, SelectionParameter[SelectionType]],
    compositeMark: M,
    config: Config[ExprRef | SignalRef]
  ): ContinuousAxisChannelDef[MD, M] = (^.asInstanceOf[js.Dynamic].applyDynamic("errorBarParams")(spec.asInstanceOf[js.Any], compositeMark.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[ContinuousAxisChannelDef[MD, M]]
  
  inline def normalizeErrorBar(
    spec: GenericUnitSpec[ErrorEncoding[String], ErrorBar | ErrorBarDef, SelectionParameter[SelectionType]],
    hasConfig: NormalizerParams
  ): NormalizedLayerSpec | NormalizedUnitSpec = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeErrorBar")(spec.asInstanceOf[js.Any], hasConfig.asInstanceOf[js.Any])).asInstanceOf[NormalizedLayerSpec | NormalizedUnitSpec]
  
  type ErrorBar = errorbar
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.vegaLite.vegaLiteStrings.mean
    - typingsJapgolly.vegaLite.vegaLiteStrings.median
  */
  trait ErrorBarCenter extends StObject
  object ErrorBarCenter {
    
    inline def mean: typingsJapgolly.vegaLite.vegaLiteStrings.mean = "mean".asInstanceOf[typingsJapgolly.vegaLite.vegaLiteStrings.mean]
    
    inline def median: typingsJapgolly.vegaLite.vegaLiteStrings.median = "median".asInstanceOf[typingsJapgolly.vegaLite.vegaLiteStrings.median]
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in keyof std.Record<vega-lite.vega-lite/build/src/compositemark/errorbar.ErrorBarPart, boolean | vega-lite.vega-lite/build/src/mark.MarkConfig<vega-lite.vega-lite/build/src/expr.ExprRef | vega-typings.vega-typings/types/spec/signal.SignalRef>> ]:? std.Record<vega-lite.vega-lite/build/src/compositemark/errorbar.ErrorBarPart, boolean | vega-lite.vega-lite/build/src/mark.MarkConfig<vega-lite.vega-lite/build/src/expr.ExprRef | vega-typings.vega-typings/types/spec/signal.SignalRef>>[P]} */ trait ErrorBarConfig extends StObject {
    
    /**
      * The center of the errorbar. Available options include:
      * - `"mean"`: the mean of the data points.
      * - `"median"`: the median of the data points.
      *
      * __Default value:__ `"mean"`.
      * @hidden
      */
    var center: js.UndefOr[ErrorBarCenter] = js.undefined
    
    /**
      * The extent of the rule. Available options include:
      * - `"ci"`: Extend the rule to the confidence interval of the mean.
      * - `"stderr"`: The size of rule are set to the value of standard error, extending from the mean.
      * - `"stdev"`: The size of rule are set to the value of standard deviation, extending from the mean.
      * - `"iqr"`: Extend the rule to the q1 and q3.
      *
      * __Default value:__ `"stderr"`.
      */
    var extent: js.UndefOr[ErrorBarExtent] = js.undefined
    
    /** Size of the ticks of an error bar */
    var size: js.UndefOr[Double] = js.undefined
    
    /** Thickness of the ticks and the bar of an error bar */
    var thickness: js.UndefOr[Double] = js.undefined
  }
  object ErrorBarConfig {
    
    inline def apply(): ErrorBarConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorBarConfig]
    }
    
    extension [Self <: ErrorBarConfig](x: Self) {
      
      inline def setCenter(value: ErrorBarCenter): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      inline def setExtent(value: ErrorBarExtent): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setThickness(value: Double): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
      
      inline def setThicknessUndefined: Self = StObject.set(x, "thickness", js.undefined)
    }
  }
  
  trait ErrorBarConfigMixins extends StObject {
    
    /**
      * ErrorBar Config
      */
    var errorbar: js.UndefOr[ErrorBarConfig] = js.undefined
  }
  object ErrorBarConfigMixins {
    
    inline def apply(): ErrorBarConfigMixins = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorBarConfigMixins]
    }
    
    extension [Self <: ErrorBarConfigMixins](x: Self) {
      
      inline def setErrorbar(value: ErrorBarConfig): Self = StObject.set(x, "errorbar", value.asInstanceOf[js.Any])
      
      inline def setErrorbarUndefined: Self = StObject.set(x, "errorbar", js.undefined)
    }
  }
  
  type ErrorBarDef = GenericCompositeMarkDef[ErrorBar] & ErrorBarConfig & `6`
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.vegaLite.vegaLiteStrings.ci
    - typingsJapgolly.vegaLite.vegaLiteStrings.iqr
    - typingsJapgolly.vegaLite.vegaLiteStrings.stderr
    - typingsJapgolly.vegaLite.vegaLiteStrings.stdev
  */
  trait ErrorBarExtent extends StObject
  object ErrorBarExtent {
    
    inline def ci: typingsJapgolly.vegaLite.vegaLiteStrings.ci = "ci".asInstanceOf[typingsJapgolly.vegaLite.vegaLiteStrings.ci]
    
    inline def iqr: typingsJapgolly.vegaLite.vegaLiteStrings.iqr = "iqr".asInstanceOf[typingsJapgolly.vegaLite.vegaLiteStrings.iqr]
    
    inline def stderr: typingsJapgolly.vegaLite.vegaLiteStrings.stderr = "stderr".asInstanceOf[typingsJapgolly.vegaLite.vegaLiteStrings.stderr]
    
    inline def stdev: typingsJapgolly.vegaLite.vegaLiteStrings.stdev = "stdev".asInstanceOf[typingsJapgolly.vegaLite.vegaLiteStrings.stdev]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.vegaLite.vegaLiteStrings.ticks
    - typingsJapgolly.vegaLite.vegaLiteStrings.rule
  */
  trait ErrorBarPart extends StObject
  
  type ErrorBarPartsMixins = PartsMixins[ErrorBarPart]
  
  /* Inlined std.Pick<vega-lite.vega-lite/build/src/encoding.Encoding<F>, vega-lite.vega-lite/build/src/channel.PositionChannel | 'color' | 'detail' | 'opacity'> & vega-lite.vega-lite/build/src/compositemark/errorbar.ErrorExtraEncoding<F> */
  trait ErrorEncoding[F /* <: Field */] extends StObject {
    
    var color: js.UndefOr[ColorDef[F]] = js.undefined
    
    var detail: js.UndefOr[
        (FieldDefWithoutScale[F, StandardType]) | (js.Array[FieldDefWithoutScale[F, StandardType]])
      ] = js.undefined
    
    var opacity: js.UndefOr[NumericMarkPropDef[F]] = js.undefined
    
    var x: js.UndefOr[PositionDef[F]] = js.undefined
    
    var x2: js.UndefOr[Position2Def[F]] = js.undefined
    
    /**
      * Error value of x coordinates for error specified `"errorbar"` and `"errorband"`.
      */
    var xError: js.UndefOr[SecondaryFieldDef[F] | ValueDef[Double]] = js.undefined
    
    /**
      * Secondary error value of x coordinates for error specified `"errorbar"` and `"errorband"`.
      */
    var xError2: js.UndefOr[SecondaryFieldDef[F] | ValueDef[Double]] = js.undefined
    
    var y: js.UndefOr[PositionDef[F]] = js.undefined
    
    var y2: js.UndefOr[Position2Def[F]] = js.undefined
    
    /**
      * Error value of y coordinates for error specified `"errorbar"` and `"errorband"`.
      */
    var yError: js.UndefOr[SecondaryFieldDef[F] | ValueDef[Double]] = js.undefined
    
    /**
      * Secondary error value of y coordinates for error specified `"errorbar"` and `"errorband"`.
      */
    var yError2: js.UndefOr[SecondaryFieldDef[F] | ValueDef[Double]] = js.undefined
  }
  object ErrorEncoding {
    
    inline def apply[F /* <: Field */](): ErrorEncoding[F] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorEncoding[F]]
    }
    
    extension [Self <: ErrorEncoding[?], F /* <: Field */](x: Self & ErrorEncoding[F]) {
      
      inline def setColor(value: ColorDef[F]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDetail(value: (FieldDefWithoutScale[F, StandardType]) | (js.Array[FieldDefWithoutScale[F, StandardType]])): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
      
      inline def setDetailVarargs(value: (FieldDefWithoutScale[F, StandardType])*): Self = StObject.set(x, "detail", js.Array(value*))
      
      inline def setOpacity(value: NumericMarkPropDef[F]): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setX(value: PositionDef[F]): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setX2(value: Position2Def[F]): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
      
      inline def setX2Undefined: Self = StObject.set(x, "x2", js.undefined)
      
      inline def setXError(value: SecondaryFieldDef[F] | ValueDef[Double]): Self = StObject.set(x, "xError", value.asInstanceOf[js.Any])
      
      inline def setXError2(value: SecondaryFieldDef[F] | ValueDef[Double]): Self = StObject.set(x, "xError2", value.asInstanceOf[js.Any])
      
      inline def setXError2Undefined: Self = StObject.set(x, "xError2", js.undefined)
      
      inline def setXErrorUndefined: Self = StObject.set(x, "xError", js.undefined)
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: PositionDef[F]): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setY2(value: Position2Def[F]): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
      
      inline def setY2Undefined: Self = StObject.set(x, "y2", js.undefined)
      
      inline def setYError(value: SecondaryFieldDef[F] | ValueDef[Double]): Self = StObject.set(x, "yError", value.asInstanceOf[js.Any])
      
      inline def setYError2(value: SecondaryFieldDef[F] | ValueDef[Double]): Self = StObject.set(x, "yError2", value.asInstanceOf[js.Any])
      
      inline def setYError2Undefined: Self = StObject.set(x, "yError2", js.undefined)
      
      inline def setYErrorUndefined: Self = StObject.set(x, "yError", js.undefined)
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait ErrorExtraEncoding[F /* <: Field */] extends StObject {
    
    /**
      * Error value of x coordinates for error specified `"errorbar"` and `"errorband"`.
      */
    var xError: js.UndefOr[SecondaryFieldDef[F] | ValueDef[Double]] = js.undefined
    
    /**
      * Secondary error value of x coordinates for error specified `"errorbar"` and `"errorband"`.
      */
    var xError2: js.UndefOr[SecondaryFieldDef[F] | ValueDef[Double]] = js.undefined
    
    /**
      * Error value of y coordinates for error specified `"errorbar"` and `"errorband"`.
      */
    var yError: js.UndefOr[SecondaryFieldDef[F] | ValueDef[Double]] = js.undefined
    
    /**
      * Secondary error value of y coordinates for error specified `"errorbar"` and `"errorband"`.
      */
    var yError2: js.UndefOr[SecondaryFieldDef[F] | ValueDef[Double]] = js.undefined
  }
  object ErrorExtraEncoding {
    
    inline def apply[F /* <: Field */](): ErrorExtraEncoding[F] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorExtraEncoding[F]]
    }
    
    extension [Self <: ErrorExtraEncoding[?], F /* <: Field */](x: Self & ErrorExtraEncoding[F]) {
      
      inline def setXError(value: SecondaryFieldDef[F] | ValueDef[Double]): Self = StObject.set(x, "xError", value.asInstanceOf[js.Any])
      
      inline def setXError2(value: SecondaryFieldDef[F] | ValueDef[Double]): Self = StObject.set(x, "xError2", value.asInstanceOf[js.Any])
      
      inline def setXError2Undefined: Self = StObject.set(x, "xError2", js.undefined)
      
      inline def setXErrorUndefined: Self = StObject.set(x, "xError", js.undefined)
      
      inline def setYError(value: SecondaryFieldDef[F] | ValueDef[Double]): Self = StObject.set(x, "yError", value.asInstanceOf[js.Any])
      
      inline def setYError2(value: SecondaryFieldDef[F] | ValueDef[Double]): Self = StObject.set(x, "yError2", value.asInstanceOf[js.Any])
      
      inline def setYError2Undefined: Self = StObject.set(x, "yError2", js.undefined)
      
      inline def setYErrorUndefined: Self = StObject.set(x, "yError", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.vegaLite.vegaLiteStrings.raw
    - typingsJapgolly.vegaLite.vegaLiteStrings.`aggregated-upper-lower`
    - typingsJapgolly.vegaLite.vegaLiteStrings.`aggregated-error`
  */
  trait ErrorInputType extends StObject
  object ErrorInputType {
    
    inline def `aggregated-error`: typingsJapgolly.vegaLite.vegaLiteStrings.`aggregated-error` = "aggregated-error".asInstanceOf[typingsJapgolly.vegaLite.vegaLiteStrings.`aggregated-error`]
    
    inline def `aggregated-upper-lower`: typingsJapgolly.vegaLite.vegaLiteStrings.`aggregated-upper-lower` = "aggregated-upper-lower".asInstanceOf[typingsJapgolly.vegaLite.vegaLiteStrings.`aggregated-upper-lower`]
    
    inline def raw: typingsJapgolly.vegaLite.vegaLiteStrings.raw = "raw".asInstanceOf[typingsJapgolly.vegaLite.vegaLiteStrings.raw]
  }
}
