package typingsJapgolly.openlayers.mod.source

import typingsJapgolly.openlayers.mod.olx.source.ImageCanvasOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Base class for image sources where a canvas element is the image.
  *
  * @param options Constructor options.
  * @api
  */
@JSImport("openlayers", "source.ImageCanvas")
@js.native
class ImageCanvas protected () extends Image {
  /**
    * @classdesc
    * Base class for image sources where a canvas element is the image.
    *
    * @param options Constructor options.
    * @api
    */
  def this(options: ImageCanvasOptions) = this()
}

