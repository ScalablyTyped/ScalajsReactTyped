package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasImageData extends StObject {
  
  /* standard dom */
  def createImageData(imagedata: org.scalajs.dom.ImageData): org.scalajs.dom.ImageData = js.native
  /* standard dom */
  def createImageData(sw: Double, sh: Double): org.scalajs.dom.ImageData = js.native
  def createImageData(sw: Double, sh: Double, settings: ImageDataSettings): org.scalajs.dom.ImageData = js.native
  
  /* standard dom */
  def getImageData(sx: Double, sy: Double, sw: Double, sh: Double): org.scalajs.dom.ImageData = js.native
  def getImageData(sx: Double, sy: Double, sw: Double, sh: Double, settings: ImageDataSettings): org.scalajs.dom.ImageData = js.native
  
  /* standard dom */
  def putImageData(imagedata: org.scalajs.dom.ImageData, dx: Double, dy: Double): Unit = js.native
  /* standard dom */
  def putImageData(
    imagedata: org.scalajs.dom.ImageData,
    dx: Double,
    dy: Double,
    dirtyX: Double,
    dirtyY: Double,
    dirtyWidth: Double,
    dirtyHeight: Double
  ): Unit = js.native
}
