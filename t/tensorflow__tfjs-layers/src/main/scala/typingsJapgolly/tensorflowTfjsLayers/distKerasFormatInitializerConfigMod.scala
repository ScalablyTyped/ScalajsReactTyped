package typingsJapgolly.tensorflowTfjsLayers

import typingsJapgolly.tensorflowTfjsLayers.distKerasFormatTypesMod.BaseSerialization
import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Constant
import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Identity
import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Ones
import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Orthogonal
import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RandomNormal
import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RandomUniform
import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.TruncatedNormal
import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.VarianceScaling
import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Zeros
import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.truncatedNormal_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKerasFormatInitializerConfigMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/keras_format/initializer_config", "VALID_DISTRIBUTION_VALUES")
  @js.native
  val VALID_DISTRIBUTION_VALUES: js.Array[String] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/keras_format/initializer_config", "VALID_FAN_MODE_VALUES")
  @js.native
  val VALID_FAN_MODE_VALUES: js.Array[String] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/keras_format/initializer_config", "initializerClassNames")
  @js.native
  val initializerClassNames: js.Array[InitializerClassName] = js.native
  
  trait ConstantConfig extends StObject {
    
    var value: Double
  }
  object ConstantConfig {
    
    inline def apply(value: Double): ConstantConfig = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConstantConfig]
    }
    
    extension [Self <: ConstantConfig](x: Self) {
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type ConstantSerialization = BaseSerialization[Constant, ConstantConfig]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.normal
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.uniform
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.truncatedNormal_
  */
  trait Distribution extends StObject
  object Distribution {
    
    inline def normal: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.normal = "normal".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.normal]
    
    inline def truncatedNormal: truncatedNormal_ = "truncatedNormal".asInstanceOf[truncatedNormal_]
    
    inline def uniform: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.uniform = "uniform".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.uniform]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.normal
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.uniform
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.truncated_normal
  */
  trait DistributionSerialization extends StObject
  object DistributionSerialization {
    
    inline def normal: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.normal = "normal".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.normal]
    
    inline def truncated_normal: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.truncated_normal = "truncated_normal".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.truncated_normal]
    
    inline def uniform: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.uniform = "uniform".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.uniform]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fanIn
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fanOut
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fanAvg
  */
  trait FanMode extends StObject
  object FanMode {
    
    inline def fanAvg: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fanAvg = "fanAvg".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fanAvg]
    
    inline def fanIn: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fanIn = "fanIn".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fanIn]
    
    inline def fanOut: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fanOut = "fanOut".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fanOut]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fan_in
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fan_out
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fan_avg
  */
  trait FanModeSerialization extends StObject
  object FanModeSerialization {
    
    inline def fan_avg: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fan_avg = "fan_avg".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fan_avg]
    
    inline def fan_in: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fan_in = "fan_in".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fan_in]
    
    inline def fan_out: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fan_out = "fan_out".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fan_out]
  }
  
  trait IdentityConfig extends StObject {
    
    var gain: js.UndefOr[Double] = js.undefined
  }
  object IdentityConfig {
    
    inline def apply(): IdentityConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IdentityConfig]
    }
    
    extension [Self <: IdentityConfig](x: Self) {
      
      inline def setGain(value: Double): Self = StObject.set(x, "gain", value.asInstanceOf[js.Any])
      
      inline def setGainUndefined: Self = StObject.set(x, "gain", js.undefined)
    }
  }
  
  type IdentitySerialization = BaseSerialization[Identity, IdentityConfig]
  
  /* Inlined @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/initializer_config.InitializerSerialization['class_name'] */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.TruncatedNormal
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Ones
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Constant
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RandomNormal
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Orthogonal
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RandomUniform
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Identity
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Zeros
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.VarianceScaling
  */
  trait InitializerClassName extends StObject
  object InitializerClassName {
    
    inline def Constant: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Constant = "Constant".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Constant]
    
    inline def Identity: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Identity = "Identity".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Identity]
    
    inline def Ones: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Ones = "Ones".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Ones]
    
    inline def Orthogonal: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Orthogonal = "Orthogonal".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Orthogonal]
    
    inline def RandomNormal: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RandomNormal = "RandomNormal".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RandomNormal]
    
    inline def RandomUniform: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RandomUniform = "RandomUniform".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RandomUniform]
    
    inline def TruncatedNormal: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.TruncatedNormal = "TruncatedNormal".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.TruncatedNormal]
    
    inline def VarianceScaling: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.VarianceScaling = "VarianceScaling".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.VarianceScaling]
    
    inline def Zeros: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Zeros = "Zeros".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Zeros]
  }
  
  type InitializerSerialization = ZerosSerialization | OnesSerialization | ConstantSerialization | RandomUniformSerialization | RandomNormalSerialization | TruncatedNormalSerialization | IdentitySerialization | VarianceScalingSerialization | OrthogonalSerialization
  
  type OnesSerialization = BaseSerialization[Ones, js.Object]
  
  trait OrthogonalConfig extends StObject {
    
    var gain: js.UndefOr[Double] = js.undefined
    
    var seed: js.UndefOr[Double] = js.undefined
  }
  object OrthogonalConfig {
    
    inline def apply(): OrthogonalConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OrthogonalConfig]
    }
    
    extension [Self <: OrthogonalConfig](x: Self) {
      
      inline def setGain(value: Double): Self = StObject.set(x, "gain", value.asInstanceOf[js.Any])
      
      inline def setGainUndefined: Self = StObject.set(x, "gain", js.undefined)
      
      inline def setSeed(value: Double): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
      
      inline def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
    }
  }
  
  type OrthogonalSerialization = BaseSerialization[Orthogonal, OrthogonalConfig]
  
  trait RandomNormalConfig extends StObject {
    
    var mean: js.UndefOr[Double] = js.undefined
    
    var seed: js.UndefOr[Double] = js.undefined
    
    var stddev: js.UndefOr[Double] = js.undefined
  }
  object RandomNormalConfig {
    
    inline def apply(): RandomNormalConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RandomNormalConfig]
    }
    
    extension [Self <: RandomNormalConfig](x: Self) {
      
      inline def setMean(value: Double): Self = StObject.set(x, "mean", value.asInstanceOf[js.Any])
      
      inline def setMeanUndefined: Self = StObject.set(x, "mean", js.undefined)
      
      inline def setSeed(value: Double): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
      
      inline def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
      
      inline def setStddev(value: Double): Self = StObject.set(x, "stddev", value.asInstanceOf[js.Any])
      
      inline def setStddevUndefined: Self = StObject.set(x, "stddev", js.undefined)
    }
  }
  
  type RandomNormalSerialization = BaseSerialization[RandomNormal, RandomNormalConfig]
  
  trait RandomUniformConfig extends StObject {
    
    var maxval: js.UndefOr[Double] = js.undefined
    
    var minval: js.UndefOr[Double] = js.undefined
    
    var seed: js.UndefOr[Double] = js.undefined
  }
  object RandomUniformConfig {
    
    inline def apply(): RandomUniformConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RandomUniformConfig]
    }
    
    extension [Self <: RandomUniformConfig](x: Self) {
      
      inline def setMaxval(value: Double): Self = StObject.set(x, "maxval", value.asInstanceOf[js.Any])
      
      inline def setMaxvalUndefined: Self = StObject.set(x, "maxval", js.undefined)
      
      inline def setMinval(value: Double): Self = StObject.set(x, "minval", value.asInstanceOf[js.Any])
      
      inline def setMinvalUndefined: Self = StObject.set(x, "minval", js.undefined)
      
      inline def setSeed(value: Double): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
      
      inline def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
    }
  }
  
  type RandomUniformSerialization = BaseSerialization[RandomUniform, RandomUniformConfig]
  
  trait TruncatedNormalConfig extends StObject {
    
    var mean: js.UndefOr[Double] = js.undefined
    
    var seed: js.UndefOr[Double] = js.undefined
    
    var stddev: js.UndefOr[Double] = js.undefined
  }
  object TruncatedNormalConfig {
    
    inline def apply(): TruncatedNormalConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TruncatedNormalConfig]
    }
    
    extension [Self <: TruncatedNormalConfig](x: Self) {
      
      inline def setMean(value: Double): Self = StObject.set(x, "mean", value.asInstanceOf[js.Any])
      
      inline def setMeanUndefined: Self = StObject.set(x, "mean", js.undefined)
      
      inline def setSeed(value: Double): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
      
      inline def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
      
      inline def setStddev(value: Double): Self = StObject.set(x, "stddev", value.asInstanceOf[js.Any])
      
      inline def setStddevUndefined: Self = StObject.set(x, "stddev", js.undefined)
    }
  }
  
  type TruncatedNormalSerialization = BaseSerialization[TruncatedNormal, TruncatedNormalConfig]
  
  trait VarianceScalingConfig extends StObject {
    
    var distribution: js.UndefOr[DistributionSerialization] = js.undefined
    
    var mode: js.UndefOr[FanModeSerialization] = js.undefined
    
    var scale: js.UndefOr[Double] = js.undefined
    
    var seed: js.UndefOr[Double] = js.undefined
  }
  object VarianceScalingConfig {
    
    inline def apply(): VarianceScalingConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VarianceScalingConfig]
    }
    
    extension [Self <: VarianceScalingConfig](x: Self) {
      
      inline def setDistribution(value: DistributionSerialization): Self = StObject.set(x, "distribution", value.asInstanceOf[js.Any])
      
      inline def setDistributionUndefined: Self = StObject.set(x, "distribution", js.undefined)
      
      inline def setMode(value: FanModeSerialization): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setSeed(value: Double): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
      
      inline def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
    }
  }
  
  type VarianceScalingSerialization = BaseSerialization[VarianceScaling, VarianceScalingConfig]
  
  type ZerosSerialization = BaseSerialization[Zeros, js.Object]
}
