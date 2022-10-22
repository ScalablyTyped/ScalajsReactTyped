package typingsJapgolly.openseadragon.mod

import org.scalajs.dom.CanvasRenderingContext2D
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLCanvasElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.openseadragon.anon.Bounds
import typingsJapgolly.openseadragon.anon.DebugGridColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openseadragon", "Drawer")
@js.native
open class Drawer protected () extends StObject {
  // element : Element; // Deprecated
  def this(options: DebugGridColor) = this()
  
  def blendSketch(options: Bounds): Unit = js.native
  
  def canRotate(): Boolean = js.native
  
  var canvas: HTMLCanvasElement | HTMLElement = js.native
  
  def clear(): Unit = js.native
  
  def clipWithPolygons(polygons: js.Array[js.Array[Point]]): Unit = js.native
  def clipWithPolygons(polygons: js.Array[js.Array[Point]], useSketch: Boolean): Unit = js.native
  
  var container: Element = js.native
  
  var context: CanvasRenderingContext2D | Null = js.native
  
  def destroy(): Unit = js.native
  
  def drawTile(
    tile: Tile,
    drawingHandler: js.Function3[/* context */ CanvasRenderingContext2D, /* tile */ Any, /* rendered */ Any, Unit],
    // TODO: determine handler parameter types
  useSketch: Boolean
  ): Unit = js.native
  def drawTile(
    tile: Tile,
    drawingHandler: js.Function3[/* context */ CanvasRenderingContext2D, /* tile */ Any, /* rendered */ Any, Unit],
    // TODO: determine handler parameter types
  useSketch: Boolean,
    scale: Double
  ): Unit = js.native
  def drawTile(
    tile: Tile,
    drawingHandler: js.Function3[/* context */ CanvasRenderingContext2D, /* tile */ Any, /* rendered */ Any, Unit],
    // TODO: determine handler parameter types
  useSketch: Boolean,
    scale: Double,
    translate: Point
  ): Unit = js.native
  def drawTile(
    tile: Tile,
    drawingHandler: js.Function3[/* context */ CanvasRenderingContext2D, /* tile */ Any, /* rendered */ Any, Unit],
    // TODO: determine handler parameter types
  useSketch: Boolean,
    scale: Unit,
    translate: Point
  ): Unit = js.native
  
  def getCanvasSize(sketch: Boolean): Point = js.native
  
  def getOpacity(): Double = js.native
  
  def setImageSmoothingEnabled(): Unit = js.native
  def setImageSmoothingEnabled(imageSmoothingEnabled: Boolean): Unit = js.native
  
  def setOpacity(opacity: Double): Drawer = js.native
  
  def viewportCoordToDrawerCoord(point: Point): Point = js.native
  
  def viewportToDrawerRectangle(rectangle: Rect): Rect = js.native
}
