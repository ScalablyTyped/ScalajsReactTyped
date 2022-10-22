package typingsJapgolly.tensorflowTfjsLayers

import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsLayers.distKerasFormatCommonMod.Shape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsTypesUtilsMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/utils/types_utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getExactlyOneShape(shapes: js.Array[Shape] | Shape): Shape = ^.asInstanceOf[js.Dynamic].applyDynamic("getExactlyOneShape")(shapes.asInstanceOf[js.Any]).asInstanceOf[Shape]
  
  inline def getExactlyOneTensor(xs: js.Array[Tensor[Rank]]): Tensor[Rank] = ^.asInstanceOf[js.Dynamic].applyDynamic("getExactlyOneTensor")(xs.asInstanceOf[js.Any]).asInstanceOf[Tensor[Rank]]
  inline def getExactlyOneTensor(xs: Tensor[Rank]): Tensor[Rank] = ^.asInstanceOf[js.Dynamic].applyDynamic("getExactlyOneTensor")(xs.asInstanceOf[js.Any]).asInstanceOf[Tensor[Rank]]
  
  inline def isArrayOfShapes(x: js.Array[Shape] | Shape): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArrayOfShapes")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def normalizeShapeList(x: js.Array[Shape] | Shape): js.Array[Shape] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeShapeList")(x.asInstanceOf[js.Any]).asInstanceOf[js.Array[Shape]]
}
