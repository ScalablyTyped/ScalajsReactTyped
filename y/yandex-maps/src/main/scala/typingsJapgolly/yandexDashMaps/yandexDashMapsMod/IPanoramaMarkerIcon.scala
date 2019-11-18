package typingsJapgolly.yandexDashMaps.yandexDashMapsMod

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanoramaMarkerIcon extends js.Object {
  var image: HTMLCanvasElement | HTMLImageElement
  var offset: js.Array[Double]
}

object IPanoramaMarkerIcon {
  @scala.inline
  def apply(image: HTMLCanvasElement | HTMLImageElement, offset: js.Array[Double]): IPanoramaMarkerIcon = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IPanoramaMarkerIcon]
  }
}

