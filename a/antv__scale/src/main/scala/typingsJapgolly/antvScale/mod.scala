package typingsJapgolly.antvScale

import typingsJapgolly.antvScale.libTypesMod.BandOptions
import typingsJapgolly.antvScale.libTypesMod.BaseOptions
import typingsJapgolly.antvScale.libTypesMod.ConstantOptions
import typingsJapgolly.antvScale.libTypesMod.ContinuousOptions
import typingsJapgolly.antvScale.libTypesMod.DivergingOptions
import typingsJapgolly.antvScale.libTypesMod.IdentityOptions
import typingsJapgolly.antvScale.libTypesMod.Interpolate
import typingsJapgolly.antvScale.libTypesMod.LinearOptions
import typingsJapgolly.antvScale.libTypesMod.LogOptions
import typingsJapgolly.antvScale.libTypesMod.OrdinalOptions
import typingsJapgolly.antvScale.libTypesMod.PointOptions
import typingsJapgolly.antvScale.libTypesMod.PowOptions
import typingsJapgolly.antvScale.libTypesMod.QuantileOptions
import typingsJapgolly.antvScale.libTypesMod.QuantizeOptions
import typingsJapgolly.antvScale.libTypesMod.SequentialOptions
import typingsJapgolly.antvScale.libTypesMod.SqrtOptions
import typingsJapgolly.antvScale.libTypesMod.ThresholdOptions
import typingsJapgolly.antvScale.libTypesMod.TickMethod
import typingsJapgolly.antvScale.libTypesMod.TimeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@antv/scale", "Band")
  @js.native
  open class Band[O /* <: BandOptions */] ()
    extends typingsJapgolly.antvScale.libScalesBandMod.Band[O] {
    def this(options: BandOptions) = this()
  }
  
  /* note: abstract class */ @JSImport("@antv/scale", "Base")
  @js.native
  /**
    * 构造函数，根据自定义的选项和默认选项生成当前选项
    * @param options 需要自定义配置的选项
    */
  open class Base[O /* <: BaseOptions */] ()
    extends typingsJapgolly.antvScale.libScalesBaseMod.Base[O] {
    def this(options: O) = this()
  }
  
  @JSImport("@antv/scale", "Constant")
  @js.native
  /**
    * 构造函数，根据自定义的选项和默认选项生成当前选项
    * @param options 需要自定义配置的选项
    */
  open class Constant ()
    extends typingsJapgolly.antvScale.libScalesConstantMod.Constant {
    def this(options: ConstantOptions) = this()
  }
  
  /* note: abstract class */ @JSImport("@antv/scale", "Continuous")
  @js.native
  /**
    * 构造函数，根据自定义的选项和默认选项生成当前选项
    * @param options 需要自定义配置的选项
    */
  open class Continuous[O /* <: ContinuousOptions */] ()
    extends typingsJapgolly.antvScale.libScalesContinuousMod.Continuous[O] {
    def this(options: O) = this()
  }
  
  @JSImport("@antv/scale", "DURATION_DAY")
  @js.native
  val DURATION_DAY: Double = js.native
  
  @JSImport("@antv/scale", "DURATION_HOUR")
  @js.native
  val DURATION_HOUR: Double = js.native
  
  @JSImport("@antv/scale", "DURATION_MINUTE")
  @js.native
  val DURATION_MINUTE: Double = js.native
  
  @JSImport("@antv/scale", "DURATION_MONTH")
  @js.native
  val DURATION_MONTH: Double = js.native
  
  @JSImport("@antv/scale", "DURATION_SECOND")
  @js.native
  val DURATION_SECOND: /* 1000 */ Double = js.native
  
  @JSImport("@antv/scale", "DURATION_WEEK")
  @js.native
  val DURATION_WEEK: Double = js.native
  
  @JSImport("@antv/scale", "DURATION_YEAR")
  @js.native
  val DURATION_YEAR: Double = js.native
  
  @JSImport("@antv/scale", "Diverging")
  @js.native
  open class Diverging ()
    extends typingsJapgolly.antvScale.libScalesDivergingMod.Diverging {
    def this(options: DivergingOptions) = this()
  }
  
  @JSImport("@antv/scale", "Identity")
  @js.native
  /**
    * 构造函数，根据自定义的选项和默认选项生成当前选项
    * @param options 需要自定义配置的选项
    */
  open class Identity ()
    extends typingsJapgolly.antvScale.libScalesIdentityMod.Identity {
    def this(options: IdentityOptions) = this()
  }
  
  @JSImport("@antv/scale", "Linear")
  @js.native
  /**
    * 构造函数，根据自定义的选项和默认选项生成当前选项
    * @param options 需要自定义配置的选项
    */
  open class Linear ()
    extends typingsJapgolly.antvScale.libScalesLinearMod.Linear {
    def this(options: LinearOptions) = this()
  }
  
  @JSImport("@antv/scale", "Log")
  @js.native
  /**
    * 构造函数，根据自定义的选项和默认选项生成当前选项
    * @param options 需要自定义配置的选项
    */
  open class Log ()
    extends typingsJapgolly.antvScale.libScalesLogMod.Log {
    def this(options: LogOptions) = this()
  }
  
  @JSImport("@antv/scale", "Ordinal")
  @js.native
  open class Ordinal[O /* <: OrdinalOptions */] ()
    extends typingsJapgolly.antvScale.libScalesOrdinalMod.Ordinal[O] {
    def this(options: OrdinalOptions) = this()
  }
  
  @JSImport("@antv/scale", "Point")
  @js.native
  open class Point ()
    extends typingsJapgolly.antvScale.libScalesPointMod.Point {
    def this(options: PointOptions) = this()
  }
  
  @JSImport("@antv/scale", "Pow")
  @js.native
  open class Pow[O /* <: PowOptions */] ()
    extends typingsJapgolly.antvScale.libScalesPowMod.Pow[O] {
    def this(options: PowOptions) = this()
  }
  
  @JSImport("@antv/scale", "Quantile")
  @js.native
  open class Quantile ()
    extends typingsJapgolly.antvScale.libScalesQuantileMod.Quantile {
    def this(options: QuantileOptions) = this()
  }
  
  @JSImport("@antv/scale", "Quantize")
  @js.native
  open class Quantize ()
    extends typingsJapgolly.antvScale.libScalesQuantizeMod.Quantize {
    def this(options: QuantizeOptions) = this()
  }
  
  @JSImport("@antv/scale", "Sequential")
  @js.native
  open class Sequential ()
    extends typingsJapgolly.antvScale.libScalesSequentialMod.Sequential {
    def this(options: SequentialOptions) = this()
  }
  
  @JSImport("@antv/scale", "Sqrt")
  @js.native
  open class Sqrt ()
    extends typingsJapgolly.antvScale.libScalesSqrtMod.Sqrt {
    def this(options: SqrtOptions) = this()
  }
  
  @JSImport("@antv/scale", "Threshold")
  @js.native
  open class Threshold[O /* <: ThresholdOptions */] ()
    extends typingsJapgolly.antvScale.libScalesThresholdMod.Threshold[O] {
    def this(options: ThresholdOptions) = this()
  }
  
  @JSImport("@antv/scale", "Time")
  @js.native
  /**
    * 构造函数，根据自定义的选项和默认选项生成当前选项
    * @param options 需要自定义配置的选项
    */
  open class Time ()
    extends typingsJapgolly.antvScale.libScalesTimeMod.Time {
    def this(options: TimeOptions) = this()
  }
  
  @JSImport("@antv/scale", "createInterpolateColor")
  @js.native
  val createInterpolateColor: Interpolate[String] = js.native
  
  @JSImport("@antv/scale", "createInterpolateNumber")
  @js.native
  val createInterpolateNumber: Interpolate[Double] = js.native
  
  @JSImport("@antv/scale", "createInterpolateValue")
  @js.native
  val createInterpolateValue: Interpolate[Double | String] = js.native
  
  @JSImport("@antv/scale", "d3Log")
  @js.native
  val d3Log: TickMethod[Double] = js.native
  
  @JSImport("@antv/scale", "d3Ticks")
  @js.native
  val d3Ticks: TickMethod[Double] = js.native
  
  @JSImport("@antv/scale", "d3Time")
  @js.native
  val d3Time: TickMethod[js.Date] = js.native
  
  @JSImport("@antv/scale", "rPretty")
  @js.native
  val rPretty: TickMethod[Double] = js.native
  
  @JSImport("@antv/scale", "wilkinsonExtended")
  @js.native
  val wilkinsonExtended: TickMethod[Double] = js.native
}
