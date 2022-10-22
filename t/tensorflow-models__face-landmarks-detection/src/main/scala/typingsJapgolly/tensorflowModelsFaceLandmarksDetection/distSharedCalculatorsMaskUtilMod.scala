package typingsJapgolly.tensorflowModelsFaceLandmarksDetection

import org.scalajs.dom.HTMLCanvasElement
import org.scalajs.dom.ImageData
import org.scalajs.dom.SVGImageElement
import typingsJapgolly.offscreencanvas.OffscreenCanvas
import typingsJapgolly.std.CanvasImageSource
import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor2D
import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor3D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedCalculatorsMaskUtilMod {
  
  @JSImport("@tensorflow-models/face-landmarks-detection/dist/shared/calculators/mask_util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assertMaskValue(maskValue: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertMaskValue")(maskValue.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def toHTMLCanvasElementLossy(image: Tensor2D | Tensor3D): js.Promise[HTMLCanvasElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("toHTMLCanvasElementLossy")(image.asInstanceOf[js.Any]).asInstanceOf[js.Promise[HTMLCanvasElement]]
  inline def toHTMLCanvasElementLossy(image: ImageData): js.Promise[HTMLCanvasElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("toHTMLCanvasElementLossy")(image.asInstanceOf[js.Any]).asInstanceOf[js.Promise[HTMLCanvasElement]]
  inline def toHTMLCanvasElementLossy(image: SVGImageElement): js.Promise[HTMLCanvasElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("toHTMLCanvasElementLossy")(image.asInstanceOf[js.Any]).asInstanceOf[js.Promise[HTMLCanvasElement]]
  inline def toHTMLCanvasElementLossy(image: OffscreenCanvas): js.Promise[HTMLCanvasElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("toHTMLCanvasElementLossy")(image.asInstanceOf[js.Any]).asInstanceOf[js.Promise[HTMLCanvasElement]]
  
  inline def toImageDataLossy(image: CanvasImageSource): js.Promise[ImageData] = ^.asInstanceOf[js.Dynamic].applyDynamic("toImageDataLossy")(image.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ImageData]]
  inline def toImageDataLossy(image: Tensor3D): js.Promise[ImageData] = ^.asInstanceOf[js.Dynamic].applyDynamic("toImageDataLossy")(image.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ImageData]]
  
  inline def toTensorLossy(image: ImageData): js.Promise[Tensor3D] = ^.asInstanceOf[js.Dynamic].applyDynamic("toTensorLossy")(image.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Tensor3D]]
  inline def toTensorLossy(image: CanvasImageSource): js.Promise[Tensor3D] = ^.asInstanceOf[js.Dynamic].applyDynamic("toTensorLossy")(image.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Tensor3D]]
}
