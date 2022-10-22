package typingsJapgolly.tensorflowTfjsCore

import typingsJapgolly.tensorflowTfjsCore.distOptimizersOptimizerMod.Optimizer
import typingsJapgolly.tensorflowTfjsCore.distSerializationMod.ConfigDict
import typingsJapgolly.tensorflowTfjsCore.distSerializationMod.Serializable
import typingsJapgolly.tensorflowTfjsCore.distSerializationMod.SerializableConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOptimizersAdadeltaOptimizerMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/optimizers/adadelta_optimizer", "AdadeltaOptimizer")
  @js.native
  open class AdadeltaOptimizer protected () extends Optimizer {
    def this(learningRate: Double, rho: Double) = this()
    def this(learningRate: Double, rho: Double, epsilon: Double) = this()
    
    /* private */ var accumulatedGrads: Any = js.native
    
    /* private */ var accumulatedUpdates: Any = js.native
    
    /* protected */ var epsilon: Double = js.native
    
    /* protected */ var learningRate: Double = js.native
    
    /* protected */ var rho: Double = js.native
  }
  /* static members */
  object AdadeltaOptimizer {
    
    @JSImport("@tensorflow/tfjs-core/dist/optimizers/adadelta_optimizer", "AdadeltaOptimizer")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-core/dist/optimizers/adadelta_optimizer", "AdadeltaOptimizer.className")
    @js.native
    def className: String = js.native
    inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
    
    /** @nocollapse */
    inline def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConfig")(cls.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[T]
  }
}
