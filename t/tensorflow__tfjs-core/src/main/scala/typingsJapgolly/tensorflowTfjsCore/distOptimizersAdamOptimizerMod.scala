package typingsJapgolly.tensorflowTfjsCore

import typingsJapgolly.tensorflowTfjsCore.distOptimizersOptimizerMod.Optimizer
import typingsJapgolly.tensorflowTfjsCore.distSerializationMod.ConfigDict
import typingsJapgolly.tensorflowTfjsCore.distSerializationMod.Serializable
import typingsJapgolly.tensorflowTfjsCore.distSerializationMod.SerializableConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOptimizersAdamOptimizerMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/optimizers/adam_optimizer", "AdamOptimizer")
  @js.native
  open class AdamOptimizer protected () extends Optimizer {
    def this(learningRate: Double, beta1: Double, beta2: Double) = this()
    def this(learningRate: Double, beta1: Double, beta2: Double, epsilon: Double) = this()
    
    /* private */ var accBeta1: Any = js.native
    
    /* private */ var accBeta2: Any = js.native
    
    /* private */ var accumulatedFirstMoment: Any = js.native
    
    /* private */ var accumulatedSecondMoment: Any = js.native
    
    /* protected */ var beta1: Double = js.native
    
    /* protected */ var beta2: Double = js.native
    
    /* protected */ var epsilon: Double = js.native
    
    /* protected */ var learningRate: Double = js.native
  }
  /* static members */
  object AdamOptimizer {
    
    @JSImport("@tensorflow/tfjs-core/dist/optimizers/adam_optimizer", "AdamOptimizer")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-core/dist/optimizers/adam_optimizer", "AdamOptimizer.className")
    @js.native
    def className: String = js.native
    inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
    
    /** @nocollapse */
    inline def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConfig")(cls.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[T]
  }
}
