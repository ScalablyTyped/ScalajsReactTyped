package typingsJapgolly.ol

import org.scalajs.dom.ImageData
import typingsJapgolly.ol.extentMod.Extent
import typingsJapgolly.ol.featureMod.FeatureLike
import typingsJapgolly.ol.pixelMod.Pixel
import typingsJapgolly.ol.sizeMod.Size
import typingsJapgolly.ol.styleStyleMod.StyleFunction
import typingsJapgolly.ol.transformMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderCanvasHitdetectMod {
  
  @JSImport("ol/render/canvas/hitdetect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createHitDetectionImageData(
    size: Size,
    transforms: js.Array[Transform],
    features: js.Array[FeatureLike],
    styleFunction: Unit,
    extent: Extent,
    resolution: Double,
    rotation: Double
  ): ImageData = (^.asInstanceOf[js.Dynamic].applyDynamic("createHitDetectionImageData")(size.asInstanceOf[js.Any], transforms.asInstanceOf[js.Any], features.asInstanceOf[js.Any], styleFunction.asInstanceOf[js.Any], extent.asInstanceOf[js.Any], resolution.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any])).asInstanceOf[ImageData]
  inline def createHitDetectionImageData(
    size: Size,
    transforms: js.Array[Transform],
    features: js.Array[FeatureLike],
    styleFunction: StyleFunction,
    extent: Extent,
    resolution: Double,
    rotation: Double
  ): ImageData = (^.asInstanceOf[js.Dynamic].applyDynamic("createHitDetectionImageData")(size.asInstanceOf[js.Any], transforms.asInstanceOf[js.Any], features.asInstanceOf[js.Any], styleFunction.asInstanceOf[js.Any], extent.asInstanceOf[js.Any], resolution.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any])).asInstanceOf[ImageData]
  
  inline def hitDetect(pixel: Pixel, features: js.Array[FeatureLike], imageData: ImageData): js.Array[FeatureLike] = (^.asInstanceOf[js.Dynamic].applyDynamic("hitDetect")(pixel.asInstanceOf[js.Any], features.asInstanceOf[js.Any], imageData.asInstanceOf[js.Any])).asInstanceOf[js.Array[FeatureLike]]
}
