package typingsJapgolly.ol

import typingsJapgolly.ol.pixelMod.Pixel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/render/Box", JSImport.Namespace)
@js.native
object boxMod extends js.Object {
  @js.native
  trait RenderBox
    extends typingsJapgolly.ol.disposableMod.default {
    def createOrUpdateGeometry(): Unit = js.native
    def getGeometry(): typingsJapgolly.ol.polygonMod.default = js.native
    def setMap(map: typingsJapgolly.ol.pluggableMapMod.default): Unit = js.native
    def setPixels(startPixel: Pixel, endPixel: Pixel): Unit = js.native
  }
  
  @js.native
  class default protected () extends RenderBox {
    def this(className: String) = this()
  }
  
}

