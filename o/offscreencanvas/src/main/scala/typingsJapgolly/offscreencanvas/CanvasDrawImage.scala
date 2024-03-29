package typingsJapgolly.offscreencanvas

import typingsJapgolly.std.CanvasImageSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://html.spec.whatwg.org/multipage/canvas.html#canvasdrawimage
@js.native
trait CanvasDrawImage extends StObject {
  
  def drawImage(image: OffscreenCanvas, dx: Double, dy: Double): Unit = js.native
  def drawImage(image: OffscreenCanvas, dx: Double, dy: Double, dw: Double, dh: Double): Unit = js.native
  def drawImage(
    image: OffscreenCanvas,
    sx: Double,
    sy: Double,
    sw: Double,
    sh: Double,
    dx: Double,
    dy: Double,
    dw: Double,
    dh: Double
  ): Unit = js.native
  def drawImage(image: CanvasImageSource, dx: Double, dy: Double): Unit = js.native
  def drawImage(image: CanvasImageSource, dx: Double, dy: Double, dw: Double, dh: Double): Unit = js.native
  def drawImage(
    image: CanvasImageSource,
    sx: Double,
    sy: Double,
    sw: Double,
    sh: Double,
    dx: Double,
    dy: Double,
    dw: Double,
    dh: Double
  ): Unit = js.native
}
