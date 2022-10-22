package typingsJapgolly.tensorflowTfjsCore.distBaseMod

import typingsJapgolly.tensorflowTfjsCore.distSerializationMod.ConfigDict
import typingsJapgolly.tensorflowTfjsCore.distSerializationMod.Serializable
import typingsJapgolly.tensorflowTfjsCore.distSerializationMod.SerializableConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/base", "AdagradOptimizer")
@js.native
open class AdagradOptimizer protected ()
  extends typingsJapgolly.tensorflowTfjsCore.distOptimizersAdagradOptimizerMod.AdagradOptimizer {
  def this(learningRate: Double) = this()
  def this(learningRate: Double, initialAccumulatorValue: Double) = this()
}
/* static members */
object AdagradOptimizer {
  
  @JSImport("@tensorflow/tfjs-core/dist/base", "AdagradOptimizer")
  @js.native
  val ^ : js.Any = js.native
  
  /** @nocollapse */
  @JSImport("@tensorflow/tfjs-core/dist/base", "AdagradOptimizer.className")
  @js.native
  def className: String = js.native
  inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  
  /** @nocollapse */
  inline def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConfig")(cls.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[T]
}
