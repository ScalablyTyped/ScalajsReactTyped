package typingsJapgolly.ol

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.HTMLVideoElement
import typingsJapgolly.ol.extentMod.Extent
import typingsJapgolly.ol.imageStateMod.ImageState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/ImageBase", JSImport.Namespace)
@js.native
object imageBaseMod extends js.Object {
  @js.native
  trait ImageBase
    extends typingsJapgolly.ol.targetMod.default {
    var extent: Extent = js.native
    var resolution: Double = js.native
    var state: ImageState = js.native
    /* protected */ def changed(): Unit = js.native
    def getExtent(): Extent = js.native
    def getImage(): HTMLCanvasElement | HTMLImageElement | HTMLVideoElement = js.native
    def getPixelRatio(): Double = js.native
    def getResolution(): Double = js.native
    def getState(): ImageState = js.native
    def load(): Unit = js.native
  }
  
  @js.native
  abstract class default protected () extends ImageBase {
    def this(extent: Extent, resolution: js.UndefOr[scala.Nothing], pixelRatio: Double, state: ImageState) = this()
    def this(extent: Extent, resolution: Double, pixelRatio: Double, state: ImageState) = this()
  }
  
}

