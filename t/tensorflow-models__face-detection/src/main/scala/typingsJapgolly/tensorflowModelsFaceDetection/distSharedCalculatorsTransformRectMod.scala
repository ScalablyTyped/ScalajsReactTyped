package typingsJapgolly.tensorflowModelsFaceDetection

import typingsJapgolly.tensorflowModelsFaceDetection.distSharedCalculatorsInterfacesCommonInterfacesMod.ImageSize
import typingsJapgolly.tensorflowModelsFaceDetection.distSharedCalculatorsInterfacesConfigInterfacesMod.RectTransformationConfig
import typingsJapgolly.tensorflowModelsFaceDetection.distSharedCalculatorsInterfacesShapeInterfacesMod.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedCalculatorsTransformRectMod {
  
  @JSImport("@tensorflow-models/face-detection/dist/shared/calculators/transform_rect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeNewRotation(rotation: Double, config: RectTransformationConfig): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("computeNewRotation")(rotation.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def transformNormalizedRect(rect: Rect, imageSize: ImageSize, config: RectTransformationConfig): Rect = (^.asInstanceOf[js.Dynamic].applyDynamic("transformNormalizedRect")(rect.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Rect]
}
