package typingsJapgolly.ol.mod

import org.scalajs.dom.raw.HTMLCanvasElement
import typingsJapgolly.ol.extentMod.Extent
import typingsJapgolly.ol.olImageCanvasMod.Loader
import typingsJapgolly.ol.olImageCanvasMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol", "ImageCanvas")
@js.native
class ImageCanvas protected () extends default {
  def this(extent: Extent, resolution: Double, pixelRatio: Double, canvas: HTMLCanvasElement) = this()
  def this(
    extent: Extent,
    resolution: Double,
    pixelRatio: Double,
    canvas: HTMLCanvasElement,
    opt_loader: Loader
  ) = this()
}

