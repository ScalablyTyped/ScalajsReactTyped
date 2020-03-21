package typingsJapgolly.ol

import org.scalajs.dom.raw.ImageData
import typingsJapgolly.ol.extentMod.Extent
import typingsJapgolly.ol.olFeatureMod.FeatureLike
import typingsJapgolly.ol.olMod.Transform
import typingsJapgolly.ol.pixelMod.Pixel
import typingsJapgolly.ol.sizeMod.Size
import typingsJapgolly.ol.styleStyleMod.StyleFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/render/canvas/hitdetet", JSImport.Namespace)
@js.native
object hitdetetMod extends js.Object {
  def createHitDetectionImageData(
    size: Size,
    transforms: js.Array[Transform],
    features: js.Array[FeatureLike],
    styleFunction: js.UndefOr[scala.Nothing],
    extent: Extent,
    resolution: Double,
    rotation: Double
  ): ImageData = js.native
  def createHitDetectionImageData(
    size: Size,
    transforms: js.Array[Transform],
    features: js.Array[FeatureLike],
    styleFunction: StyleFunction,
    extent: Extent,
    resolution: Double,
    rotation: Double
  ): ImageData = js.native
  def hitDetect(pixel: Pixel, features: js.Array[FeatureLike], imageData: ImageData): js.Array[FeatureLike] = js.native
}

