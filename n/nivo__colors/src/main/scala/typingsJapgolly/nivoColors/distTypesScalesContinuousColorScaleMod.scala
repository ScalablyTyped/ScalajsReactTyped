package typingsJapgolly.nivoColors

import typingsJapgolly.d3Scale.mod.ScaleDiverging_
import typingsJapgolly.d3Scale.mod.ScaleQuantize_
import typingsJapgolly.d3Scale.mod.ScaleSequential_
import typingsJapgolly.nivoColors.anon.Key
import typingsJapgolly.nivoColors.distTypesScalesDivergingColorScaleMod.DivergingColorScaleColorsConfig
import typingsJapgolly.nivoColors.distTypesScalesDivergingColorScaleMod.DivergingColorScaleInterpolatorConfig
import typingsJapgolly.nivoColors.distTypesScalesDivergingColorScaleMod.DivergingColorScaleSchemeConfig
import typingsJapgolly.nivoColors.distTypesScalesQuantizeColorScaleMod.QuantizeColorScaleColorsConfig
import typingsJapgolly.nivoColors.distTypesScalesQuantizeColorScaleMod.QuantizeColorScaleSchemeConfig
import typingsJapgolly.nivoColors.distTypesScalesSequentialColorScaleMod.SequentialColorScaleColorsConfig
import typingsJapgolly.nivoColors.distTypesScalesSequentialColorScaleMod.SequentialColorScaleInterpolatorConfig
import typingsJapgolly.nivoColors.distTypesScalesSequentialColorScaleMod.SequentialColorScaleSchemeConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesScalesContinuousColorScaleMod {
  
  @JSImport("@nivo/colors/dist/types/scales/continuousColorScale", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeContinuousColorScaleColorStops(scale: ScaleDiverging_[String, scala.Nothing]): js.Array[Key] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeContinuousColorScaleColorStops")(scale.asInstanceOf[js.Any]).asInstanceOf[js.Array[Key]]
  inline def computeContinuousColorScaleColorStops(scale: ScaleDiverging_[String, scala.Nothing], steps: Double): js.Array[Key] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeContinuousColorScaleColorStops")(scale.asInstanceOf[js.Any], steps.asInstanceOf[js.Any])).asInstanceOf[js.Array[Key]]
  inline def computeContinuousColorScaleColorStops(scale: ScaleQuantize_[String, scala.Nothing]): js.Array[Key] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeContinuousColorScaleColorStops")(scale.asInstanceOf[js.Any]).asInstanceOf[js.Array[Key]]
  inline def computeContinuousColorScaleColorStops(scale: ScaleQuantize_[String, scala.Nothing], steps: Double): js.Array[Key] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeContinuousColorScaleColorStops")(scale.asInstanceOf[js.Any], steps.asInstanceOf[js.Any])).asInstanceOf[js.Array[Key]]
  inline def computeContinuousColorScaleColorStops(scale: ScaleSequential_[String, scala.Nothing]): js.Array[Key] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeContinuousColorScaleColorStops")(scale.asInstanceOf[js.Any]).asInstanceOf[js.Array[Key]]
  inline def computeContinuousColorScaleColorStops(scale: ScaleSequential_[String, scala.Nothing], steps: Double): js.Array[Key] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeContinuousColorScaleColorStops")(scale.asInstanceOf[js.Any], steps.asInstanceOf[js.Any])).asInstanceOf[js.Array[Key]]
  
  inline def getContinuousColorScale(config: DivergingColorScaleColorsConfig, values: ContinuousColorScaleValues): (ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getContinuousColorScale")(config.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[(ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing])]
  inline def getContinuousColorScale(config: DivergingColorScaleInterpolatorConfig, values: ContinuousColorScaleValues): (ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getContinuousColorScale")(config.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[(ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing])]
  inline def getContinuousColorScale(config: DivergingColorScaleSchemeConfig, values: ContinuousColorScaleValues): (ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getContinuousColorScale")(config.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[(ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing])]
  inline def getContinuousColorScale(config: QuantizeColorScaleColorsConfig, values: ContinuousColorScaleValues): (ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getContinuousColorScale")(config.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[(ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing])]
  inline def getContinuousColorScale(config: QuantizeColorScaleSchemeConfig, values: ContinuousColorScaleValues): (ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getContinuousColorScale")(config.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[(ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing])]
  inline def getContinuousColorScale(config: SequentialColorScaleColorsConfig, values: ContinuousColorScaleValues): (ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getContinuousColorScale")(config.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[(ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing])]
  inline def getContinuousColorScale(config: SequentialColorScaleInterpolatorConfig, values: ContinuousColorScaleValues): (ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getContinuousColorScale")(config.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[(ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing])]
  inline def getContinuousColorScale(config: SequentialColorScaleSchemeConfig, values: ContinuousColorScaleValues): (ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getContinuousColorScale")(config.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[(ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing])]
  
  inline def useContinuousColorScale(config: ContinuousColorScaleConfig, values: ContinuousColorScaleValues): (ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing]) = (^.asInstanceOf[js.Dynamic].applyDynamic("useContinuousColorScale")(config.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[(ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing])]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.nivoColors.distTypesScalesSequentialColorScaleMod.SequentialColorScaleConfig
    - typingsJapgolly.nivoColors.distTypesScalesDivergingColorScaleMod.DivergingColorScaleConfig
    - typingsJapgolly.nivoColors.distTypesScalesQuantizeColorScaleMod.QuantizeColorScaleConfig
  */
  trait ContinuousColorScaleConfig extends StObject
  object ContinuousColorScaleConfig {
    
    inline def DivergingColorScaleColorsConfig(colors: js.Tuple3[String, String, String]): typingsJapgolly.nivoColors.distTypesScalesDivergingColorScaleMod.DivergingColorScaleColorsConfig = {
      val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("diverging")
      __obj.asInstanceOf[typingsJapgolly.nivoColors.distTypesScalesDivergingColorScaleMod.DivergingColorScaleColorsConfig]
    }
    
    inline def DivergingColorScaleInterpolatorConfig(interpolator: Double => String): typingsJapgolly.nivoColors.distTypesScalesDivergingColorScaleMod.DivergingColorScaleInterpolatorConfig = {
      val __obj = js.Dynamic.literal(interpolator = js.Any.fromFunction1(interpolator))
      __obj.updateDynamic("type")("diverging")
      __obj.asInstanceOf[typingsJapgolly.nivoColors.distTypesScalesDivergingColorScaleMod.DivergingColorScaleInterpolatorConfig]
    }
    
    inline def DivergingColorScaleSchemeConfig(): typingsJapgolly.nivoColors.distTypesScalesDivergingColorScaleMod.DivergingColorScaleSchemeConfig = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("diverging")
      __obj.asInstanceOf[typingsJapgolly.nivoColors.distTypesScalesDivergingColorScaleMod.DivergingColorScaleSchemeConfig]
    }
    
    inline def QuantizeColorScaleColorsConfig(colors: js.Array[String]): typingsJapgolly.nivoColors.distTypesScalesQuantizeColorScaleMod.QuantizeColorScaleColorsConfig = {
      val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("quantize")
      __obj.asInstanceOf[typingsJapgolly.nivoColors.distTypesScalesQuantizeColorScaleMod.QuantizeColorScaleColorsConfig]
    }
    
    inline def QuantizeColorScaleSchemeConfig(): typingsJapgolly.nivoColors.distTypesScalesQuantizeColorScaleMod.QuantizeColorScaleSchemeConfig = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("quantize")
      __obj.asInstanceOf[typingsJapgolly.nivoColors.distTypesScalesQuantizeColorScaleMod.QuantizeColorScaleSchemeConfig]
    }
    
    inline def SequentialColorScaleColorsConfig(colors: js.Tuple2[String, String]): typingsJapgolly.nivoColors.distTypesScalesSequentialColorScaleMod.SequentialColorScaleColorsConfig = {
      val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("sequential")
      __obj.asInstanceOf[typingsJapgolly.nivoColors.distTypesScalesSequentialColorScaleMod.SequentialColorScaleColorsConfig]
    }
    
    inline def SequentialColorScaleInterpolatorConfig(interpolator: Double => String): typingsJapgolly.nivoColors.distTypesScalesSequentialColorScaleMod.SequentialColorScaleInterpolatorConfig = {
      val __obj = js.Dynamic.literal(interpolator = js.Any.fromFunction1(interpolator))
      __obj.updateDynamic("type")("sequential")
      __obj.asInstanceOf[typingsJapgolly.nivoColors.distTypesScalesSequentialColorScaleMod.SequentialColorScaleInterpolatorConfig]
    }
    
    inline def SequentialColorScaleSchemeConfig(): typingsJapgolly.nivoColors.distTypesScalesSequentialColorScaleMod.SequentialColorScaleSchemeConfig = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("sequential")
      __obj.asInstanceOf[typingsJapgolly.nivoColors.distTypesScalesSequentialColorScaleMod.SequentialColorScaleSchemeConfig]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.nivoColors.distTypesScalesSequentialColorScaleMod.SequentialColorScaleValues
    - typingsJapgolly.nivoColors.distTypesScalesDivergingColorScaleMod.DivergingColorScaleValues
    - typingsJapgolly.nivoColors.distTypesScalesQuantizeColorScaleMod.QuantizeColorScaleValues
  */
  trait ContinuousColorScaleValues extends StObject
  object ContinuousColorScaleValues {
    
    inline def DivergingColorScaleValues(max: Double, min: Double): typingsJapgolly.nivoColors.distTypesScalesDivergingColorScaleMod.DivergingColorScaleValues = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.nivoColors.distTypesScalesDivergingColorScaleMod.DivergingColorScaleValues]
    }
    
    inline def QuantizeColorScaleValues(max: Double, min: Double): typingsJapgolly.nivoColors.distTypesScalesQuantizeColorScaleMod.QuantizeColorScaleValues = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.nivoColors.distTypesScalesQuantizeColorScaleMod.QuantizeColorScaleValues]
    }
    
    inline def SequentialColorScaleValues(max: Double, min: Double): typingsJapgolly.nivoColors.distTypesScalesSequentialColorScaleMod.SequentialColorScaleValues = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.nivoColors.distTypesScalesSequentialColorScaleMod.SequentialColorScaleValues]
    }
  }
}
