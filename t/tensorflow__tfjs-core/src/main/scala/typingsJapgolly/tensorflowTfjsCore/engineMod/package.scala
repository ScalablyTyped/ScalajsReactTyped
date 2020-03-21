package typingsJapgolly.tensorflowTfjsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object engineMod {
  type CustomGradientFunc[T /* <: typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank] */] = js.Function1[
    /* repeated */ typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank] | typingsJapgolly.tensorflowTfjsCore.tensorTypesMod.GradSaveFunc, 
    typingsJapgolly.tensorflowTfjsCore.AnonGradFunc[T]
  ]
  type ForwardFunc[T] = js.Function2[
    /* backend */ typingsJapgolly.tensorflowTfjsCore.backendMod.KernelBackend, 
    /* save */ js.UndefOr[typingsJapgolly.tensorflowTfjsCore.tensorTypesMod.GradSaveFunc], 
    T
  ]
  type ScopeFn[T /* <: typingsJapgolly.tensorflowTfjsCore.tensorTypesMod.TensorContainer */] = js.Function0[T]
}
