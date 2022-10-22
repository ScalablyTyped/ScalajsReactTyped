package typingsJapgolly.tensorflowTfjsCore

import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor
import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Variable
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.DataType
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsVariableMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/variable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def variable[R /* <: Rank */](initialValue: Tensor[R]): Variable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("variable")(initialValue.asInstanceOf[js.Any]).asInstanceOf[Variable[R]]
  inline def variable[R /* <: Rank */](initialValue: Tensor[R], trainable: Boolean): Variable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("variable")(initialValue.asInstanceOf[js.Any], trainable.asInstanceOf[js.Any])).asInstanceOf[Variable[R]]
  inline def variable[R /* <: Rank */](initialValue: Tensor[R], trainable: Boolean, name: String): Variable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("variable")(initialValue.asInstanceOf[js.Any], trainable.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Variable[R]]
  inline def variable[R /* <: Rank */](initialValue: Tensor[R], trainable: Boolean, name: String, dtype: DataType): Variable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("variable")(initialValue.asInstanceOf[js.Any], trainable.asInstanceOf[js.Any], name.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Variable[R]]
  inline def variable[R /* <: Rank */](initialValue: Tensor[R], trainable: Boolean, name: Unit, dtype: DataType): Variable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("variable")(initialValue.asInstanceOf[js.Any], trainable.asInstanceOf[js.Any], name.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Variable[R]]
  inline def variable[R /* <: Rank */](initialValue: Tensor[R], trainable: Unit, name: String): Variable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("variable")(initialValue.asInstanceOf[js.Any], trainable.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Variable[R]]
  inline def variable[R /* <: Rank */](initialValue: Tensor[R], trainable: Unit, name: String, dtype: DataType): Variable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("variable")(initialValue.asInstanceOf[js.Any], trainable.asInstanceOf[js.Any], name.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Variable[R]]
  inline def variable[R /* <: Rank */](initialValue: Tensor[R], trainable: Unit, name: Unit, dtype: DataType): Variable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("variable")(initialValue.asInstanceOf[js.Any], trainable.asInstanceOf[js.Any], name.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Variable[R]]
}
