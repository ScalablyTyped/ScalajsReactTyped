package typingsJapgolly.easeljs.createjs

import org.scalajs.dom.HTMLCanvasElement
import org.scalajs.dom.HTMLImageElement
import org.scalajs.dom.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScaleBitmap
  extends StObject
     with DisplayObject {
  
  var drawHeight: Double = js.native
  
  var drawWidth: Double = js.native
  
  // properties
  var image: HTMLImageElement | HTMLCanvasElement | HTMLVideoElement = js.native
  
  var scale9Grid: Rectangle = js.native
  
  // methods
  def setDrawSize(newWidth: Double, newHeight: Double): Unit = js.native
  
  var sourceRect: Rectangle = js.native
}
