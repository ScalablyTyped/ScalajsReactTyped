package typingsJapgolly.tensorflowTfjsCore

import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor3D
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsSlice3dMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/slice3d", "slice3d")
  @js.native
  val slice3d: js.Function3[
    /* x */ Tensor3D | TensorLike, 
    /* begin */ js.Tuple3[Double, Double, Double], 
    /* size */ js.Tuple3[Double, Double, Double], 
    Tensor3D
  ] = js.native
}
