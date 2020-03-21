package typingsJapgolly.ol.mod

import typingsJapgolly.ol.extentMod.Extent
import typingsJapgolly.ol.imageBaseMod.default
import typingsJapgolly.ol.imageStateMod.ImageState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol", "ImageBase")
@js.native
abstract class ImageBase protected () extends default {
  def this(extent: Extent, resolution: js.UndefOr[scala.Nothing], pixelRatio: Double, state: ImageState) = this()
  def this(extent: Extent, resolution: Double, pixelRatio: Double, state: ImageState) = this()
}

