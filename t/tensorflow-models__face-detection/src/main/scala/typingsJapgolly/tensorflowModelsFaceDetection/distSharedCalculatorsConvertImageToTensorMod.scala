package typingsJapgolly.tensorflowModelsFaceDetection

import typingsJapgolly.tensorflowModelsFaceDetection.anon.ImageTensor
import typingsJapgolly.tensorflowModelsFaceDetection.distSharedCalculatorsInterfacesCommonInterfacesMod.PixelInput
import typingsJapgolly.tensorflowModelsFaceDetection.distSharedCalculatorsInterfacesConfigInterfacesMod.ImageToTensorConfig
import typingsJapgolly.tensorflowModelsFaceDetection.distSharedCalculatorsInterfacesShapeInterfacesMod.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedCalculatorsConvertImageToTensorMod {
  
  @JSImport("@tensorflow-models/face-detection/dist/shared/calculators/convert_image_to_tensor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertImageToTensor(image: PixelInput, config: ImageToTensorConfig): ImageTensor = (^.asInstanceOf[js.Dynamic].applyDynamic("convertImageToTensor")(image.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[ImageTensor]
  inline def convertImageToTensor(image: PixelInput, config: ImageToTensorConfig, normRect: Rect): ImageTensor = (^.asInstanceOf[js.Dynamic].applyDynamic("convertImageToTensor")(image.asInstanceOf[js.Any], config.asInstanceOf[js.Any], normRect.asInstanceOf[js.Any])).asInstanceOf[ImageTensor]
}
