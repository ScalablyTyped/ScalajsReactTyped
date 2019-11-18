package typingsJapgolly.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageBitmapRenderingContext
  extends OffscreenRenderingContext
     with RenderingContext {
  /**
    * Returns the canvas element that the context is bound to.
    */
  val canvas: org.scalajs.dom.raw.HTMLCanvasElement | OffscreenCanvas = js.native
  def transferFromImageBitmap(): Unit = js.native
  /**
    * Transfers the underlying bitmap data from imageBitmap to context, and the bitmap becomes the contents of the canvas element to which context is bound.
    */
  def transferFromImageBitmap(bitmap: ImageBitmap): Unit = js.native
}

@JSGlobal("ImageBitmapRenderingContext")
@js.native
object ImageBitmapRenderingContext extends Instantiable0[ImageBitmapRenderingContext]

