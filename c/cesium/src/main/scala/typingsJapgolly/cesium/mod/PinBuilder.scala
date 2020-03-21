package typingsJapgolly.cesium.mod

import org.scalajs.dom.raw.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "PinBuilder")
@js.native
class PinBuilder () extends js.Object {
  def fromColor(color: Color, size: Double): HTMLCanvasElement = js.native
  def fromMakiIconId(id: String, color: Color, size: Double): HTMLCanvasElement | js.Promise[HTMLCanvasElement] = js.native
  def fromText(text: String, color: Color, size: Double): HTMLCanvasElement = js.native
  def fromUrl(url: String, color: Color, size: Double): HTMLCanvasElement | js.Promise[HTMLCanvasElement] = js.native
}

