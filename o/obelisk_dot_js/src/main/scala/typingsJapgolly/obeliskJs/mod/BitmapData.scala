package typingsJapgolly.obeliskJs.mod

import org.scalajs.dom.CanvasRenderingContext2D
import org.scalajs.dom.HTMLCanvasElement
import org.scalajs.dom.ImageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("obelisk.js", "BitmapData")
@js.native
open class BitmapData protected () extends StObject {
  def this(w: Double, h: Double) = this()
  def this(w: Double, h: Double, useDefaultCanvas: Boolean) = this()
  
  var canvas: HTMLCanvasElement = js.native
  
  def checkPixelAvailable(x: Double, y: Double): Boolean = js.native
  
  var context: CanvasRenderingContext2D = js.native
  
  def floodFill(posX: Double, posY: Double, color: Double): Unit = js.native
  
  var imageData: ImageData = js.native
  
  def setPixel(posX: Double, posY: Double, color: Double): Unit = js.native
  
  def setPixelByIndex(index: Double, color: Double): Unit = js.native
}
