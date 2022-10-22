package typingsJapgolly.offscreencanvas

import typingsJapgolly.std.CanvasCompositing
import typingsJapgolly.std.CanvasDrawPath
import typingsJapgolly.std.CanvasFillStrokeStyles
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://html.spec.whatwg.org/multipage/canvas.html#offscreencanvasrenderingcontext2d
@js.native
trait OffscreenCanvasRenderingContext2D
  extends StObject
     with CanvasState
     with CanvasTransform
     with CanvasCompositing
     with CanvasImageSmoothing
     with CanvasFillStrokeStyles
     with CanvasShadowStyles
     with CanvasFilters
     with CanvasRect
     with CanvasDrawPath
     with CanvasText
     with CanvasDrawImage
     with CanvasImageData
     with CanvasPathDrawingStyles
     with CanvasTextDrawingStyles
     with CanvasPath {
  
  val canvas: OffscreenCanvas = js.native
}
