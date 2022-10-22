package typingsJapgolly.tensorflowTfjsConverter.anon

import typingsJapgolly.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.NCDHW
import typingsJapgolly.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.NDHWC
import typingsJapgolly.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.ceil
import typingsJapgolly.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.floor
import typingsJapgolly.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.round
import typingsJapgolly.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.same
import typingsJapgolly.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.valid
import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor4D
import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor5D
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofavgPool3d extends StObject {
  
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filterSize: (js.Tuple3[Double, Double, Double]) | Double,
    strides: (js.Tuple3[Double, Double, Double]) | Double,
    pad: valid | same | Double,
    dimRoundingMode: js.UndefOr[floor | round | ceil],
    dataFormat: js.UndefOr[NDHWC | NCDHW]
  ): T = js.native
}
