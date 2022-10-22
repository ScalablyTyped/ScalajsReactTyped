package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageBitmapRenderingContext
  extends StObject
     with _RenderingContext {
  
  /** Returns the canvas element that the context is bound to. */
  /* standard dom */
  val canvas: org.scalajs.dom.HTMLCanvasElement = js.native
  
  /** Transfers the underlying bitmap data from imageBitmap to context, and the bitmap becomes the contents of the canvas element to which context is bound. */
  /* standard dom */
  def transferFromImageBitmap(): Unit = js.native
  def transferFromImageBitmap(bitmap: ImageBitmap): Unit = js.native
}
