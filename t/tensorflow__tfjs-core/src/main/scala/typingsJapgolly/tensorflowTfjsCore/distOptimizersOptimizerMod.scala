package typingsJapgolly.tensorflowTfjsCore

import typingsJapgolly.tensorflowTfjsCore.anon.Value
import typingsJapgolly.tensorflowTfjsCore.distSerializationMod.Serializable
import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Scalar
import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Variable
import typingsJapgolly.tensorflowTfjsCore.distTensorTypesMod.NamedTensor
import typingsJapgolly.tensorflowTfjsCore.distTensorTypesMod.NamedTensorMap
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOptimizersOptimizerMod {
  
  /* note: abstract class */ @JSImport("@tensorflow/tfjs-core/dist/optimizers/optimizer", "Optimizer")
  @js.native
  open class Optimizer () extends Serializable {
    
    def applyGradients(variableGradients: js.Array[NamedTensor]): Unit = js.native
    /**
      * Updates variables by using the computed gradients.
      *
      * @param variableGradients A mapping of variable name to its gradient value.
      *
      * @doc {heading: 'Training', subheading: 'Optimizers'}
      */
    def applyGradients(variableGradients: NamedTensorMap): Unit = js.native
    
    /**
      * Executes f() and computes the gradient of the scalar output of f() with
      * respect to the list of trainable variables provided by `varList`. If no
      * list is provided, it defaults to all trainable variables.
      *
      * @param f The function to execute and whose output to use for computing
      * gradients with respect to variables.
      * @param varList An optional list of variables to compute gradients with
      * respect to. If specified, only the trainable variables in varList will have
      * gradients computed with respect to. Defaults to all trainable variables.
      *
      * @doc {heading: 'Training', subheading: 'Optimizers'}
      */
    def computeGradients(f: js.Function0[Scalar]): Value = js.native
    def computeGradients(f: js.Function0[Scalar], varList: js.Array[Variable[Rank]]): Value = js.native
    
    /**
      * Dispose the variables (if any) owned by this optimizer instance.
      */
    def dispose(): Unit = js.native
    
    /**
      * Extract the first element of the weight values and set it
      * as the iterations counter variable of this instance of optimizer.
      *
      * @param weightValues
      * @returns Weight values with the first element consumed and excluded.
      */
    /* protected */ def extractIterations(weightValues: js.Array[NamedTensor]): js.Promise[js.Array[NamedTensor]] = js.native
    
    def getWeights(): js.Promise[js.Array[NamedTensor]] = js.native
    
    /* protected */ def incrementIterations(): Unit = js.native
    
    /**
      * The number of iterations that this optimizer instance has been invoked for.
      */
    def iterations: Double = js.native
    
    /* protected */ var iterations_ : Double = js.native
    
    /**
      * Executes `f()` and minimizes the scalar output of `f()` by computing
      * gradients of y with respect to the list of trainable variables provided by
      * `varList`. If no list is provided, it defaults to all trainable variables.
      *
      * @param f The function to execute and whose output to minimize.
      * @param returnCost Whether to return the scalar cost value produced by
      * executing `f()`.
      * @param varList An optional list of variables to update. If specified, only
      * the trainable variables in varList will be updated by minimize. Defaults to
      * all trainable variables.
      *
      * @doc {heading: 'Training', subheading: 'Optimizers'}
      */
    def minimize(f: js.Function0[Scalar]): Scalar | Null = js.native
    def minimize(f: js.Function0[Scalar], returnCost: Boolean): Scalar | Null = js.native
    def minimize(f: js.Function0[Scalar], returnCost: Boolean, varList: js.Array[Variable[Rank]]): Scalar | Null = js.native
    def minimize(f: js.Function0[Scalar], returnCost: Unit, varList: js.Array[Variable[Rank]]): Scalar | Null = js.native
    
    def saveIterations(): js.Promise[NamedTensor] = js.native
    
    def setWeights(weightValues: js.Array[NamedTensor]): js.Promise[Unit] = js.native
  }
  
  trait OptimizerVariable extends StObject {
    
    var originalName: String
    
    var variable: Variable[Rank]
  }
  object OptimizerVariable {
    
    inline def apply(originalName: String, variable: Variable[Rank]): OptimizerVariable = {
      val __obj = js.Dynamic.literal(originalName = originalName.asInstanceOf[js.Any], variable = variable.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptimizerVariable]
    }
    
    extension [Self <: OptimizerVariable](x: Self) {
      
      inline def setOriginalName(value: String): Self = StObject.set(x, "originalName", value.asInstanceOf[js.Any])
      
      inline def setVariable(value: Variable[Rank]): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
    }
  }
}
