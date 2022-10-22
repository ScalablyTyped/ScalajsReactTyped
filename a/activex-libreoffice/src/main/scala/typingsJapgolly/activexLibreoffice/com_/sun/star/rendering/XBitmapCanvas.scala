package typingsJapgolly.activexLibreoffice.com_.sun.star.rendering

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.geometry.Matrix2D
import typingsJapgolly.activexLibreoffice.com_.sun.star.geometry.RealBezierSegment2D
import typingsJapgolly.activexLibreoffice.com_.sun.star.geometry.RealPoint2D
import typingsJapgolly.activexLibreoffice.com_.sun.star.geometry.RealRectangle2D
import typingsJapgolly.activexLibreoffice.com_.sun.star.geometry.XMapping2D
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a specialization of the canvas interface for bitmapped canvases.
  *
  * This interface is a specialization of the canvas interface for bitmapped canvases, where additional methods for accessing and moving of bitmap content
  * are provided.
  * @since OOo 2.0
  */
trait XBitmapCanvas
  extends StObject
     with XCanvas {
  
  /**
    * This method copies a rectangular area from a place of one canvas to a place on another.
    *
    * This method copies a rectangular area from a place of one canvas to a place on another. Source and destination areas are permitted to overlap. If the
    * source view or render state has a clipping set, the regions clipped away from the source rectangle are regarded fully transparent for the copy
    * operation. The device color for both source and destination render state is ignored, the compositing mode only for the source render state.
    * @param sourceCanvas from which to copy the bitmap data. Can be identical to the canvas this method is called on, but must be valid.
    * @param sourceRect Rectangle from which to copy the bitmap data. This rectangle is subject to both view and render transformation, before being applied.
    * @param sourceViewState The view state to apply to the source of this copy operation. The view transformation must be non-singular.
    * @param sourceRenderState The render state to apply to the source of this copy operation. The render transformation must be non-singular, and the composi
    * @param destRect Rectangle into which to copy the bitmap data. This rectangle is subject to both view and render transformation, before being applied. Th
    * @param destViewState The view state to apply to the destination of this copy operation. The view transformation must be non-singular.
    * @param destRenderState The render state to apply to the destination of this copy operation. The render transformation must be non-singular, and the comp
    * @throws com::sun::star::lang::IllegalArgumentException if one of the parameters are not within the specified range.
    */
  def copyRect(
    sourceCanvas: XBitmapCanvas,
    sourceRect: RealRectangle2D,
    sourceViewState: ViewState,
    sourceRenderState: RenderState,
    destRect: RealRectangle2D,
    destViewState: ViewState,
    destRenderState: RenderState
  ): Unit
}
object XBitmapCanvas {
  
  inline def apply(
    Device: XGraphicDevice,
    acquire: Callback,
    clear: Callback,
    copyRect: (XBitmapCanvas, RealRectangle2D, ViewState, RenderState, RealRectangle2D, ViewState, RenderState) => Callback,
    createFont: (FontRequest, SeqEquiv[PropertyValue], Matrix2D) => XCanvasFont,
    drawBezier: (RealBezierSegment2D, RealPoint2D, ViewState, RenderState) => Callback,
    drawBitmap: (XBitmap, ViewState, RenderState) => XCachedPrimitive,
    drawBitmapModulated: (XBitmap, ViewState, RenderState) => XCachedPrimitive,
    drawLine: (RealPoint2D, RealPoint2D, ViewState, RenderState) => Callback,
    drawPoint: (RealPoint2D, ViewState, RenderState) => Callback,
    drawPolyPolygon: (XPolyPolygon2D, ViewState, RenderState) => XCachedPrimitive,
    drawText: (StringContext, XCanvasFont, ViewState, RenderState, Double) => XCachedPrimitive,
    drawTextLayout: (XTextLayout, ViewState, RenderState) => XCachedPrimitive,
    fillPolyPolygon: (XPolyPolygon2D, ViewState, RenderState) => XCachedPrimitive,
    fillTextureMappedPolyPolygon: (XPolyPolygon2D, ViewState, RenderState, SeqEquiv[Texture], XMapping2D) => XCachedPrimitive,
    fillTexturedPolyPolygon: (XPolyPolygon2D, ViewState, RenderState, SeqEquiv[Texture]) => XCachedPrimitive,
    getDevice: CallbackTo[XGraphicDevice],
    queryAvailableFonts: (FontInfo, SeqEquiv[PropertyValue]) => SafeArray[FontInfo],
    queryInterface: `type` => Any,
    queryStrokeShapes: (XPolyPolygon2D, ViewState, RenderState, StrokeAttributes) => XPolyPolygon2D,
    release: Callback,
    strokePolyPolygon: (XPolyPolygon2D, ViewState, RenderState, StrokeAttributes) => XCachedPrimitive,
    strokeTextureMappedPolyPolygon: (XPolyPolygon2D, ViewState, RenderState, SeqEquiv[Texture], XMapping2D, StrokeAttributes) => XCachedPrimitive,
    strokeTexturedPolyPolygon: (XPolyPolygon2D, ViewState, RenderState, SeqEquiv[Texture], StrokeAttributes) => XCachedPrimitive
  ): XBitmapCanvas = {
    val __obj = js.Dynamic.literal(Device = Device.asInstanceOf[js.Any], acquire = acquire.toJsFn, clear = clear.toJsFn, copyRect = js.Any.fromFunction7((t0: XBitmapCanvas, t1: RealRectangle2D, t2: ViewState, t3: RenderState, t4: RealRectangle2D, t5: ViewState, t6: RenderState) => (copyRect(t0, t1, t2, t3, t4, t5, t6)).runNow()), createFont = js.Any.fromFunction3(createFont), drawBezier = js.Any.fromFunction4((t0: RealBezierSegment2D, t1: RealPoint2D, t2: ViewState, t3: RenderState) => (drawBezier(t0, t1, t2, t3)).runNow()), drawBitmap = js.Any.fromFunction3(drawBitmap), drawBitmapModulated = js.Any.fromFunction3(drawBitmapModulated), drawLine = js.Any.fromFunction4((t0: RealPoint2D, t1: RealPoint2D, t2: ViewState, t3: RenderState) => (drawLine(t0, t1, t2, t3)).runNow()), drawPoint = js.Any.fromFunction3((t0: RealPoint2D, t1: ViewState, t2: RenderState) => (drawPoint(t0, t1, t2)).runNow()), drawPolyPolygon = js.Any.fromFunction3(drawPolyPolygon), drawText = js.Any.fromFunction5(drawText), drawTextLayout = js.Any.fromFunction3(drawTextLayout), fillPolyPolygon = js.Any.fromFunction3(fillPolyPolygon), fillTextureMappedPolyPolygon = js.Any.fromFunction5(fillTextureMappedPolyPolygon), fillTexturedPolyPolygon = js.Any.fromFunction4(fillTexturedPolyPolygon), getDevice = getDevice.toJsFn, queryAvailableFonts = js.Any.fromFunction2(queryAvailableFonts), queryInterface = js.Any.fromFunction1(queryInterface), queryStrokeShapes = js.Any.fromFunction4(queryStrokeShapes), release = release.toJsFn, strokePolyPolygon = js.Any.fromFunction4(strokePolyPolygon), strokeTextureMappedPolyPolygon = js.Any.fromFunction6(strokeTextureMappedPolyPolygon), strokeTexturedPolyPolygon = js.Any.fromFunction5(strokeTexturedPolyPolygon))
    __obj.asInstanceOf[XBitmapCanvas]
  }
  
  extension [Self <: XBitmapCanvas](x: Self) {
    
    inline def setCopyRect(
      value: (XBitmapCanvas, RealRectangle2D, ViewState, RenderState, RealRectangle2D, ViewState, RenderState) => Callback
    ): Self = StObject.set(x, "copyRect", js.Any.fromFunction7((t0: XBitmapCanvas, t1: RealRectangle2D, t2: ViewState, t3: RenderState, t4: RealRectangle2D, t5: ViewState, t6: RenderState) => (value(t0, t1, t2, t3, t4, t5, t6)).runNow()))
  }
}
