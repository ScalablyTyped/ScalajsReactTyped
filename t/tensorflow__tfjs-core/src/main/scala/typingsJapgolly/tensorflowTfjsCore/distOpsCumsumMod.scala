package typingsJapgolly.tensorflowTfjsCore

import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsCumsumMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/cumsum", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cumsum[T /* <: Tensor[Rank] */](x: Tensor[Rank]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("cumsum")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def cumsum[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("cumsum")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def cumsum[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double, exclusive: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("cumsum")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], exclusive.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def cumsum[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double, exclusive: Boolean, reverse: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("cumsum")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], exclusive.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def cumsum[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double, exclusive: Unit, reverse: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("cumsum")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], exclusive.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def cumsum[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Unit, exclusive: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("cumsum")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], exclusive.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def cumsum[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Unit, exclusive: Boolean, reverse: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("cumsum")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], exclusive.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def cumsum[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Unit, exclusive: Unit, reverse: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("cumsum")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], exclusive.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def cumsum[T /* <: Tensor[Rank] */](x: TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("cumsum")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def cumsum[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("cumsum")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def cumsum[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double, exclusive: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("cumsum")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], exclusive.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def cumsum[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double, exclusive: Boolean, reverse: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("cumsum")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], exclusive.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def cumsum[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double, exclusive: Unit, reverse: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("cumsum")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], exclusive.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def cumsum[T /* <: Tensor[Rank] */](x: TensorLike, axis: Unit, exclusive: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("cumsum")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], exclusive.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def cumsum[T /* <: Tensor[Rank] */](x: TensorLike, axis: Unit, exclusive: Boolean, reverse: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("cumsum")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], exclusive.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def cumsum[T /* <: Tensor[Rank] */](x: TensorLike, axis: Unit, exclusive: Unit, reverse: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("cumsum")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], exclusive.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[T]
}
