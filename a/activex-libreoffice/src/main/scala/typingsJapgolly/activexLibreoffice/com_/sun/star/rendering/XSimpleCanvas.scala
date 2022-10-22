package typingsJapgolly.activexLibreoffice.com_.sun.star.rendering

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.geometry.AffineMatrix2D
import typingsJapgolly.activexLibreoffice.com_.sun.star.geometry.RealPoint2D
import typingsJapgolly.activexLibreoffice.com_.sun.star.geometry.RealRectangle2D
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides the basic graphical output operations for a canvas.
  *
  * This interface is a simplified version of the {@link XCanvas} interface. It holds explicit state, i.e. the pen and fill color, the current
  * transformation, clip and font are persistently remembered.
  *
  * In contrast to the {@link XCanvas} interface, {@link XSimpleCanvas} does not distinguish between stroke and fill operations; instead, switching
  * between stroke and fill (or taking both) works by setting appropriate pen and fill colors.
  */
trait XSimpleCanvas
  extends StObject
     with XInterface {
  
  /**
    * Query the underlying {@link XCanvas} .
    * @returns the canvas interface this object is internally based on.
    */
  val Canvas: XCanvas
  
  /** Retrieve current clip rect */
  val CurrentClipRect: RealRectangle2D
  
  /** Retrieve color currently used for fills */
  val CurrentFillColor: typingsJapgolly.activexLibreoffice.com_.sun.star.util.Color
  
  /**
    * Retrieve currently selected font.
    * @returns the font instance that's currently used for rendering text.
    */
  val CurrentFont: XCanvasFont
  
  /** Retrieve color currently used for lines. */
  val CurrentPenColor: typingsJapgolly.activexLibreoffice.com_.sun.star.util.Color
  
  /** Retrieve current transformation matrix */
  val CurrentTransformation: AffineMatrix2D
  
  /**
    * Retrieve view state.
    * @returns the view state, that would generate matching output, when rendering to an {@link XCanvas} instead.
    */
  val CurrentViewState: ViewState
  
  /**
    * Request the associated graphic device for this canvas.
    *
    * A graphic device provides methods specific to the underlying output device capabilities, which are common for all canvases rendering to such a device.
    * This includes device resolution, color space, or bitmap formats.
    * @returns the associated {@link XGraphicDevice} .
    */
  val Device: XGraphicDevice
  
  /**
    * Request the font metrics of the current font.
    * @returns the font metrics of the currently selected font.
    */
  val FontMetrics: typingsJapgolly.activexLibreoffice.com_.sun.star.rendering.FontMetrics
  
  /**
    * Draws the bitmap on the canvas.
    * @param xBitmap Bitmap to render
    * @param aLeftTop Left, top position of the bitmap on the destination canvas.
    */
  def drawBitmap(xBitmap: XBitmap, aLeftTop: RealPoint2D): Unit
  
  /** Draws a line on the canvas. */
  def drawLine(aStartPoint: RealPoint2D, aEndPoint: RealPoint2D): Unit
  
  /** Sets a single pixel on the canvas. */
  def drawPixel(aPoint: RealPoint2D): Unit
  
  /** Draws a poly-polygon on the canvas. */
  def drawPolyPolygon(xPolyPolygon: XPolyPolygon2D): Unit
  
  /** Draws a rectangle on the canvas. */
  def drawRect(aRect: RealRectangle2D): Unit
  
  /**
    * Draws text on the canvas.
    * @param aText Text to render. The text color is the current pen color.
    * @param aOutPos Output position of the text. This is the left or right edge, depending on nTextDirection. Output position is always relative to the font
    * @param nTextDirection A value from the {@link TextDirection} collection, denoting the main writing direction for this string. The main writing direction
    */
  def drawText(aText: StringContext, aOutPos: RealPoint2D, nTextDirection: Double): Unit
  
  /**
    * Query the underlying {@link XCanvas} .
    * @returns the canvas interface this object is internally based on.
    */
  def getCanvas(): XCanvas
  
  /** Retrieve current clip rect */
  def getCurrentClipRect(): RealRectangle2D
  
  /** Retrieve color currently used for fills */
  def getCurrentFillColor(): typingsJapgolly.activexLibreoffice.com_.sun.star.util.Color
  
  /**
    * Retrieve currently selected font.
    * @returns the font instance that's currently used for rendering text.
    */
  def getCurrentFont(): XCanvasFont
  
  /** Retrieve color currently used for lines. */
  def getCurrentPenColor(): typingsJapgolly.activexLibreoffice.com_.sun.star.util.Color
  
  /**
    * Retrieve render state.
    * @param bUseFillColor When true, the Color member of the {@link RenderState} is initialized with the current fill color; when false, the current pen colo
    * @returns the render state, that would generate matching output, when rendering to an {@link XCanvas} instead.
    */
  def getCurrentRenderState(bUseFillColor: Boolean): RenderState
  
  /** Retrieve current transformation matrix */
  def getCurrentTransformation(): AffineMatrix2D
  
  /**
    * Retrieve view state.
    * @returns the view state, that would generate matching output, when rendering to an {@link XCanvas} instead.
    */
  def getCurrentViewState(): ViewState
  
  /**
    * Request the associated graphic device for this canvas.
    *
    * A graphic device provides methods specific to the underlying output device capabilities, which are common for all canvases rendering to such a device.
    * This includes device resolution, color space, or bitmap formats.
    * @returns the associated {@link XGraphicDevice} .
    */
  def getDevice(): XGraphicDevice
  
  /**
    * Request the font metrics of the current font.
    * @returns the font metrics of the currently selected font.
    */
  def getFontMetrics(): typingsJapgolly.activexLibreoffice.com_.sun.star.rendering.FontMetrics
  
  /**
    * Select a font.
    *
    * This method selects the specified font (or a close substitute) as the current font for text output.
    * @param sFontName The name of the font (like e.g. Arial)
    * @param size The size of the font (note that this is not the usual points unit, but in the same coordinate system as the other rendering operations - usu
    * @param bold When true, selected font is bold.
    * @param italic When true, selected font is italic
    */
  def selectFont(sFontName: String, size: Double, bold: Boolean, italic: Boolean): Unit
  
  /**
    * Sets the fill color.
    *
    * To disable filling, simply set this color to something with zero alpha (i.e. fully transparent).
    * @param nsRgbaColor RGBA color tuple, interpreted in the sRGB color space.
    */
  def setFillColor(nsRgbaColor: typingsJapgolly.activexLibreoffice.com_.sun.star.util.Color): Unit
  
  /**
    * Sets the color used by line and text operations.
    *
    * To disable stroking, simply set this color to something with zero alpha (i.e. fully transparent).
    * @param nsRgbaColor RGBA color tuple, interpreted in the sRGB color space.
    */
  def setPenColor(nsRgbaColor: typingsJapgolly.activexLibreoffice.com_.sun.star.util.Color): Unit
  
  /** Sets the clip to the specified rectangle. */
  def setRectClip(aRect: RealRectangle2D): Unit
  
  /** Set the current transform matrix. */
  def setTransformation(aTransform: AffineMatrix2D): Unit
}
object XSimpleCanvas {
  
  inline def apply(
    Canvas: XCanvas,
    CurrentClipRect: RealRectangle2D,
    CurrentFillColor: typingsJapgolly.activexLibreoffice.com_.sun.star.util.Color,
    CurrentFont: XCanvasFont,
    CurrentPenColor: typingsJapgolly.activexLibreoffice.com_.sun.star.util.Color,
    CurrentTransformation: AffineMatrix2D,
    CurrentViewState: ViewState,
    Device: XGraphicDevice,
    FontMetrics: FontMetrics,
    acquire: Callback,
    drawBitmap: (XBitmap, RealPoint2D) => Callback,
    drawLine: (RealPoint2D, RealPoint2D) => Callback,
    drawPixel: RealPoint2D => Callback,
    drawPolyPolygon: XPolyPolygon2D => Callback,
    drawRect: RealRectangle2D => Callback,
    drawText: (StringContext, RealPoint2D, Double) => Callback,
    getCanvas: CallbackTo[XCanvas],
    getCurrentClipRect: CallbackTo[RealRectangle2D],
    getCurrentFillColor: CallbackTo[typingsJapgolly.activexLibreoffice.com_.sun.star.util.Color],
    getCurrentFont: CallbackTo[XCanvasFont],
    getCurrentPenColor: CallbackTo[typingsJapgolly.activexLibreoffice.com_.sun.star.util.Color],
    getCurrentRenderState: Boolean => RenderState,
    getCurrentTransformation: CallbackTo[AffineMatrix2D],
    getCurrentViewState: CallbackTo[ViewState],
    getDevice: CallbackTo[XGraphicDevice],
    getFontMetrics: CallbackTo[FontMetrics],
    queryInterface: `type` => Any,
    release: Callback,
    selectFont: (String, Double, Boolean, Boolean) => Callback,
    setFillColor: typingsJapgolly.activexLibreoffice.com_.sun.star.util.Color => Callback,
    setPenColor: typingsJapgolly.activexLibreoffice.com_.sun.star.util.Color => Callback,
    setRectClip: RealRectangle2D => Callback,
    setTransformation: AffineMatrix2D => Callback
  ): XSimpleCanvas = {
    val __obj = js.Dynamic.literal(Canvas = Canvas.asInstanceOf[js.Any], CurrentClipRect = CurrentClipRect.asInstanceOf[js.Any], CurrentFillColor = CurrentFillColor.asInstanceOf[js.Any], CurrentFont = CurrentFont.asInstanceOf[js.Any], CurrentPenColor = CurrentPenColor.asInstanceOf[js.Any], CurrentTransformation = CurrentTransformation.asInstanceOf[js.Any], CurrentViewState = CurrentViewState.asInstanceOf[js.Any], Device = Device.asInstanceOf[js.Any], FontMetrics = FontMetrics.asInstanceOf[js.Any], acquire = acquire.toJsFn, drawBitmap = js.Any.fromFunction2((t0: XBitmap, t1: RealPoint2D) => (drawBitmap(t0, t1)).runNow()), drawLine = js.Any.fromFunction2((t0: RealPoint2D, t1: RealPoint2D) => (drawLine(t0, t1)).runNow()), drawPixel = js.Any.fromFunction1((t0: RealPoint2D) => drawPixel(t0).runNow()), drawPolyPolygon = js.Any.fromFunction1((t0: XPolyPolygon2D) => drawPolyPolygon(t0).runNow()), drawRect = js.Any.fromFunction1((t0: RealRectangle2D) => drawRect(t0).runNow()), drawText = js.Any.fromFunction3((t0: StringContext, t1: RealPoint2D, t2: Double) => (drawText(t0, t1, t2)).runNow()), getCanvas = getCanvas.toJsFn, getCurrentClipRect = getCurrentClipRect.toJsFn, getCurrentFillColor = getCurrentFillColor.toJsFn, getCurrentFont = getCurrentFont.toJsFn, getCurrentPenColor = getCurrentPenColor.toJsFn, getCurrentRenderState = js.Any.fromFunction1(getCurrentRenderState), getCurrentTransformation = getCurrentTransformation.toJsFn, getCurrentViewState = getCurrentViewState.toJsFn, getDevice = getDevice.toJsFn, getFontMetrics = getFontMetrics.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, selectFont = js.Any.fromFunction4((t0: String, t1: Double, t2: Boolean, t3: Boolean) => (selectFont(t0, t1, t2, t3)).runNow()), setFillColor = js.Any.fromFunction1((t0: typingsJapgolly.activexLibreoffice.com_.sun.star.util.Color) => setFillColor(t0).runNow()), setPenColor = js.Any.fromFunction1((t0: typingsJapgolly.activexLibreoffice.com_.sun.star.util.Color) => setPenColor(t0).runNow()), setRectClip = js.Any.fromFunction1((t0: RealRectangle2D) => setRectClip(t0).runNow()), setTransformation = js.Any.fromFunction1((t0: AffineMatrix2D) => setTransformation(t0).runNow()))
    __obj.asInstanceOf[XSimpleCanvas]
  }
  
  extension [Self <: XSimpleCanvas](x: Self) {
    
    inline def setCanvas(value: XCanvas): Self = StObject.set(x, "Canvas", value.asInstanceOf[js.Any])
    
    inline def setCurrentClipRect(value: RealRectangle2D): Self = StObject.set(x, "CurrentClipRect", value.asInstanceOf[js.Any])
    
    inline def setCurrentFillColor(value: typingsJapgolly.activexLibreoffice.com_.sun.star.util.Color): Self = StObject.set(x, "CurrentFillColor", value.asInstanceOf[js.Any])
    
    inline def setCurrentFont(value: XCanvasFont): Self = StObject.set(x, "CurrentFont", value.asInstanceOf[js.Any])
    
    inline def setCurrentPenColor(value: typingsJapgolly.activexLibreoffice.com_.sun.star.util.Color): Self = StObject.set(x, "CurrentPenColor", value.asInstanceOf[js.Any])
    
    inline def setCurrentTransformation(value: AffineMatrix2D): Self = StObject.set(x, "CurrentTransformation", value.asInstanceOf[js.Any])
    
    inline def setCurrentViewState(value: ViewState): Self = StObject.set(x, "CurrentViewState", value.asInstanceOf[js.Any])
    
    inline def setDevice(value: XGraphicDevice): Self = StObject.set(x, "Device", value.asInstanceOf[js.Any])
    
    inline def setDrawBitmap(value: (XBitmap, RealPoint2D) => Callback): Self = StObject.set(x, "drawBitmap", js.Any.fromFunction2((t0: XBitmap, t1: RealPoint2D) => (value(t0, t1)).runNow()))
    
    inline def setDrawLine(value: (RealPoint2D, RealPoint2D) => Callback): Self = StObject.set(x, "drawLine", js.Any.fromFunction2((t0: RealPoint2D, t1: RealPoint2D) => (value(t0, t1)).runNow()))
    
    inline def setDrawPixel(value: RealPoint2D => Callback): Self = StObject.set(x, "drawPixel", js.Any.fromFunction1((t0: RealPoint2D) => value(t0).runNow()))
    
    inline def setDrawPolyPolygon(value: XPolyPolygon2D => Callback): Self = StObject.set(x, "drawPolyPolygon", js.Any.fromFunction1((t0: XPolyPolygon2D) => value(t0).runNow()))
    
    inline def setDrawRect(value: RealRectangle2D => Callback): Self = StObject.set(x, "drawRect", js.Any.fromFunction1((t0: RealRectangle2D) => value(t0).runNow()))
    
    inline def setDrawText(value: (StringContext, RealPoint2D, Double) => Callback): Self = StObject.set(x, "drawText", js.Any.fromFunction3((t0: StringContext, t1: RealPoint2D, t2: Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setFontMetrics(value: FontMetrics): Self = StObject.set(x, "FontMetrics", value.asInstanceOf[js.Any])
    
    inline def setGetCanvas(value: CallbackTo[XCanvas]): Self = StObject.set(x, "getCanvas", value.toJsFn)
    
    inline def setGetCurrentClipRect(value: CallbackTo[RealRectangle2D]): Self = StObject.set(x, "getCurrentClipRect", value.toJsFn)
    
    inline def setGetCurrentFillColor(value: CallbackTo[typingsJapgolly.activexLibreoffice.com_.sun.star.util.Color]): Self = StObject.set(x, "getCurrentFillColor", value.toJsFn)
    
    inline def setGetCurrentFont(value: CallbackTo[XCanvasFont]): Self = StObject.set(x, "getCurrentFont", value.toJsFn)
    
    inline def setGetCurrentPenColor(value: CallbackTo[typingsJapgolly.activexLibreoffice.com_.sun.star.util.Color]): Self = StObject.set(x, "getCurrentPenColor", value.toJsFn)
    
    inline def setGetCurrentRenderState(value: Boolean => RenderState): Self = StObject.set(x, "getCurrentRenderState", js.Any.fromFunction1(value))
    
    inline def setGetCurrentTransformation(value: CallbackTo[AffineMatrix2D]): Self = StObject.set(x, "getCurrentTransformation", value.toJsFn)
    
    inline def setGetCurrentViewState(value: CallbackTo[ViewState]): Self = StObject.set(x, "getCurrentViewState", value.toJsFn)
    
    inline def setGetDevice(value: CallbackTo[XGraphicDevice]): Self = StObject.set(x, "getDevice", value.toJsFn)
    
    inline def setGetFontMetrics(value: CallbackTo[FontMetrics]): Self = StObject.set(x, "getFontMetrics", value.toJsFn)
    
    inline def setSelectFont(value: (String, Double, Boolean, Boolean) => Callback): Self = StObject.set(x, "selectFont", js.Any.fromFunction4((t0: String, t1: Double, t2: Boolean, t3: Boolean) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setSetFillColor(value: typingsJapgolly.activexLibreoffice.com_.sun.star.util.Color => Callback): Self = StObject.set(x, "setFillColor", js.Any.fromFunction1((t0: typingsJapgolly.activexLibreoffice.com_.sun.star.util.Color) => value(t0).runNow()))
    
    inline def setSetPenColor(value: typingsJapgolly.activexLibreoffice.com_.sun.star.util.Color => Callback): Self = StObject.set(x, "setPenColor", js.Any.fromFunction1((t0: typingsJapgolly.activexLibreoffice.com_.sun.star.util.Color) => value(t0).runNow()))
    
    inline def setSetRectClip(value: RealRectangle2D => Callback): Self = StObject.set(x, "setRectClip", js.Any.fromFunction1((t0: RealRectangle2D) => value(t0).runNow()))
    
    inline def setSetTransformation(value: AffineMatrix2D => Callback): Self = StObject.set(x, "setTransformation", js.Any.fromFunction1((t0: AffineMatrix2D) => value(t0).runNow()))
  }
}
