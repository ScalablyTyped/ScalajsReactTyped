package typingsJapgolly.skiaCanvas.libMod

import typingsJapgolly.skiaCanvas.skiaCanvasStrings.follow
import typingsJapgolly.skiaCanvas.skiaCanvasStrings.move
import typingsJapgolly.skiaCanvas.skiaCanvasStrings.turn
import typingsJapgolly.std.CanvasCompositing
import typingsJapgolly.std.CanvasDrawPath
import typingsJapgolly.std.CanvasFilters
import typingsJapgolly.std.CanvasImageData
import typingsJapgolly.std.CanvasImageSmoothing
import typingsJapgolly.std.CanvasPath
import typingsJapgolly.std.CanvasPathDrawingStyles
import typingsJapgolly.std.CanvasRect
import typingsJapgolly.std.CanvasShadowStyles
import typingsJapgolly.std.CanvasState
import typingsJapgolly.std.CanvasText
import typingsJapgolly.std.CanvasTextDrawingStyles
import typingsJapgolly.std.CanvasTransform
import typingsJapgolly.std.CanvasUserInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasRenderingContext2D
  extends StObject
     with CanvasCompositing
     with CanvasDrawImage
     with CanvasDrawPath
     with CanvasFillStrokeStyles
     with CanvasFilters
     with CanvasImageData
     with CanvasImageSmoothing
     with CanvasPath
     with CanvasPathDrawingStyles
     with CanvasRect
     with CanvasShadowStyles
     with CanvasState
     with CanvasText
     with CanvasTextDrawingStyles
     with CanvasTransform
     with CanvasUserInterface {
  
  val canvas: Canvas = js.native
  
  def conicCurveTo(cpx: Double, cpy: Double, x: Double, y: Double, weight: Double): Unit = js.native
  
  def createProjection(quad: QuadOrRect): DOMMatrix = js.native
  def createProjection(quad: QuadOrRect, basis: QuadOrRect): DOMMatrix = js.native
  
  def currentTransform: DOMMatrix = js.native
  def currentTransform_=(matrix: DOMMatrix): Unit = js.native
  
  var fontVariant: String = js.native
  
  var lineDashFit: move | turn | follow = js.native
  
  var lineDashMarker: Path2D | Null = js.native
  
  def measureText(text: String, maxWidth: Double): TextMetrics = js.native
  
  def outlineText(text: String): Path2D = js.native
  
  def reset(): Unit = js.native
  
  def roundRect(x: Double, y: Double, width: Double, height: Double, radii: js.Array[CornerRadius]): Any = js.native
  def roundRect(x: Double, y: Double, width: Double, height: Double, radii: Double): Any = js.native
  
  var textTracking: Double = js.native
  
  var textWrap: Boolean = js.native
}
