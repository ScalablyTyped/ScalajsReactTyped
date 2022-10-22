package typingsJapgolly.tensorflowTfjsConverter.anon

import typingsJapgolly.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.avg
import typingsJapgolly.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.ceil
import typingsJapgolly.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.floor
import typingsJapgolly.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.max
import typingsJapgolly.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.round
import typingsJapgolly.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.same
import typingsJapgolly.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.valid
import typingsJapgolly.tensorflowTfjsCore.distOpsConvUtilMod.ExplicitPadding
import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor3D
import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor4D
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofpool extends StObject {
  
  def apply[T /* <: Tensor3D | Tensor4D */](
    input: T | TensorLike,
    windowShape: (js.Tuple2[Double, Double]) | Double,
    poolingType: avg | max,
    pad: valid | same | Double | ExplicitPadding,
    dilations: js.UndefOr[(js.Tuple2[Double, Double]) | Double],
    strides: js.UndefOr[(js.Tuple2[Double, Double]) | Double],
    dimRoundingMode: js.UndefOr[floor | round | ceil]
  ): T = js.native
}
