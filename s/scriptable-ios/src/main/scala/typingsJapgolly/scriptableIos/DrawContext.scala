package typingsJapgolly.scriptableIos

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Context for drawing images._
  *
  * Constructs a new canvas to draw images, shapes and texts on.
  * @see https://docs.scriptable.app/drawcontext/#-new-drawcontext
  */
trait DrawContext extends StObject {
  
  /**
    * _Adds a path to the context._
    *
    * After adding a path to the context, the path can be stroked or filled by calling strokePath and fillPath. Note that only the path that was added latest will be affected by calls to
    * strokePath and fillPath.
    * @param path - Path to add to the context.
    * @see https://docs.scriptable.app/drawcontext/#-addpath
    */
  def addPath(path: Path): Unit
  
  /**
    * _Draws an image at the specified point._
    *
    * Draws the image at the point. The top-left corner of the image will be drawn at the specified point.
    * @param image - Image to draw.
    * @param point - Point at which to draw top-left corner of the image.
    * @see https://docs.scriptable.app/drawcontext/#-drawimageatpoint
    */
  def drawImageAtPoint(image: Image, point: Point): Unit
  
  /**
    * _Draws an image in the specified rect._
    *
    * Draws the image in the rectangle. The image will be scaled to fit within the rectangle.
    * @param image - Image to draw.
    * @param rect - Rectangle to draw the image in.
    * @see https://docs.scriptable.app/drawcontext/#-drawimageinrect
    */
  def drawImageInRect(image: Image, rect: Rect): Unit
  
  /**
    * _Draws text at a position._
    *
    * Call this to draw a text string to the context. The top-left of the text will be drawn at the specified position.
    * @param text - Text to draw.
    * @param pos - Position to draw the top-left of the text.
    * @see https://docs.scriptable.app/drawcontext/#-drawtext
    */
  def drawText(text: String, pos: Point): Unit
  
  /**
    * _Draws text in a rectangle._
    *
    * Call this to draw a text string in a rectangle. Specify how the text should be aligned within the rectangle by calling setTextAlignedLeft, setTextAlignedCenter or
    * setTextAlignedRight before drawing the text.
    * @param text - Text to draw.
    * @param rect - Rectangle to draw text in.
    * @see https://docs.scriptable.app/drawcontext/#-drawtextinrect
    */
  def drawTextInRect(text: String, rect: Rect): Unit
  
  /**
    * _Fills a rectangle._
    *
    * Fills the rectangle with the color set when calling setFillColor.
    * @param rect - Rectangle to fill.
    * @see https://docs.scriptable.app/drawcontext/#-fill
    */
  def fill(rect: Rect): Unit
  
  /**
    * _Fills an ellipse._
    *
    * Fills the ellipse that fits within the supplied rectangle with the color set when calling setFillColor.
    * @param rect - Rectangle incapsulating the ellipse to fill.
    * @see https://docs.scriptable.app/drawcontext/#-fillellipse
    */
  def fillEllipse(rect: Rect): Unit
  
  /**
    * _Fills the path that was added the latest._
    *
    * The path that was latest added to the context is filled with the color set using setFillColor.
    * @see https://docs.scriptable.app/drawcontext/#-fillpath
    */
  def fillPath(): Unit
  
  /**
    * _Fills a rectangle._
    *
    * Fills the rectangle with the color set when calling setFillColor.
    * @param rect - Rectangle to fill.
    * @see https://docs.scriptable.app/drawcontext/#-fillrect
    */
  def fillRect(rect: Rect): Unit
  
  /**
    * _Retrieves the image._
    *
    * Call this to retrieve the image you have drawn to the context.
    * @see https://docs.scriptable.app/drawcontext/#-getimage
    */
  def getImage(): Image
  
  /**
    * _Determines whether the context is opaque._
    *
    * When enabled your image will be rendered opaque. Default is true.
    * @see https://docs.scriptable.app/drawcontext/#opaque
    */
  var opaque: Boolean
  
  /**
    * _Enable to respect the scale of the screen._
    *
    * Devices have a screen scale that is used to convert between the logical coordinate space and the device coordinate space. For example, retina screens have a screen scale of 2 or 3
    * meaning that one point in the logical coordinate space is represented by four or nine pixels. Respecting the screen scale will multiply the specified size of the canvas by the
    * screen scale. For example a canvas of size 200 by 200 will be 600 by 600 when the image is rendered on a retina screen with a screen scale of 3. When respecting the screen scale is
    * disabled, you may experience that your images looks blurry because essentially the size you have specified will be stretched when rendered on the screen. Default is false.
    * @see https://docs.scriptable.app/drawcontext/#respectscreenscale
    */
  var respectScreenScale: Boolean
  
  /**
    * _Sets the fill color._
    *
    * Sets the fill color to be used when performing a fill operation. Any fill operation performed afterwards will fill with the specified color until another call to setFillColor is
    * made.
    * @param color - Color to set for filling.
    * @see https://docs.scriptable.app/drawcontext/#-setfillcolor
    */
  def setFillColor(color: Color): Unit
  
  /**
    * _Sets the font to use when drawing text._
    *
    * Sets the font to be used when drawing texts to the context.
    * @param font - Font to use when drawing text.
    * @see https://docs.scriptable.app/drawcontext/#-setfont
    */
  def setFont(font: Font): Unit
  
  /**
    * _Sets the line width for stroking._
    *
    * Sets the line width to be used when performing a stroke operation.
    * @param width - Line width to use for stroking.
    * @see https://docs.scriptable.app/drawcontext/#-setlinewidth
    */
  def setLineWidth(width: Double): Unit
  
  /**
    * _Sets the stroke color._
    *
    * Sets the stroke color to be used when performing a stroke operation. Any stroke operation performed afterwards will stroke with the specified color until another call to
    * setStrokeColor is made.
    * @param color - Color to set for stroking.
    * @see https://docs.scriptable.app/drawcontext/#-setstrokecolor
    */
  def setStrokeColor(color: Color): Unit
  
  /**
    * _Specifies that texts should be center aligned._
    *
    * Sets text alignment to center. Texts drawn after calling this will be center aligned inside the provided rectangle.
    * @see https://docs.scriptable.app/drawcontext/#-settextalignedcenter
    */
  def setTextAlignedCenter(): Unit
  
  /**
    * _Specifies that texts should be left aligned._
    *
    * Sets text alignment to left. Texts drawn after calling this will be left aligned inside the provided rectangle.
    * @see https://docs.scriptable.app/drawcontext/#-settextalignedleft
    */
  def setTextAlignedLeft(): Unit
  
  /**
    * _Specifies that texts should be right aligned._
    *
    * Sets text alignment to right. Texts drawn after calling this will be right aligned inside the provided rectangle.
    * @see https://docs.scriptable.app/drawcontext/#-settextalignedright
    */
  def setTextAlignedRight(): Unit
  
  /**
    * _Sets the text color used when drawing text._
    *
    * Sets the text color to be used when drawing text strings to the context.
    * @param color - Color to use when drawing text.
    * @see https://docs.scriptable.app/drawcontext/#-settextcolor
    */
  def setTextColor(color: Color): Unit
  
  /**
    * _Size of canvas._
    *
    * Specifies the size of the canvas on which you are drawing. The image returned by getImage() will have this exact size, except if respectScreenScale is true.
    * @see https://docs.scriptable.app/drawcontext/#size
    */
  var size: Size
  
  /**
    * _Strokes a rectangle._
    *
    * Draws a line around the rectangle using the color set when calling setStrokeColor. The line will have the width set when calling setLineWidth.
    * @param rect - Rectangle to stroke.
    * @see https://docs.scriptable.app/drawcontext/#-stroke
    */
  def stroke(rect: Rect): Unit
  
  /**
    * _Strokes an ellipse._
    *
    * Draws a line around the ellipse that fits within the supplied rectangle. The line will have the color set when calling setStrokeColor and the width set when calling setLineWidth.
    * @param rect - Rectangle incapsulating the ellipse to stroke.
    * @see https://docs.scriptable.app/drawcontext/#-strokeellipse
    */
  def strokeEllipse(rect: Rect): Unit
  
  /**
    * _Strokes the path that was added the latest._
    *
    * The path that was added the latest to the context is stroked with the color set using setStrokeColor and the line width set using setLineWidth.
    * @see https://docs.scriptable.app/drawcontext/#-strokepath
    */
  def strokePath(): Unit
  
  /**
    * _Strokes a rectangle._
    *
    * Draws a line around the rectangle using the color set when calling setStrokeColor. The line will have the width set when calling setLineWidth.
    * @param rect - Rectangle to stroke.
    * @see https://docs.scriptable.app/drawcontext/#-strokerect
    */
  def strokeRect(rect: Rect): Unit
}
object DrawContext {
  
  inline def apply(
    addPath: Path => Callback,
    drawImageAtPoint: (Image, Point) => Callback,
    drawImageInRect: (Image, Rect) => Callback,
    drawText: (String, Point) => Callback,
    drawTextInRect: (String, Rect) => Callback,
    fill: Rect => Callback,
    fillEllipse: Rect => Callback,
    fillPath: Callback,
    fillRect: Rect => Callback,
    getImage: CallbackTo[Image],
    opaque: Boolean,
    respectScreenScale: Boolean,
    setFillColor: Color => Callback,
    setFont: Font => Callback,
    setLineWidth: Double => Callback,
    setStrokeColor: Color => Callback,
    setTextAlignedCenter: Callback,
    setTextAlignedLeft: Callback,
    setTextAlignedRight: Callback,
    setTextColor: Color => Callback,
    size: Size,
    stroke: Rect => Callback,
    strokeEllipse: Rect => Callback,
    strokePath: Callback,
    strokeRect: Rect => Callback
  ): DrawContext = {
    val __obj = js.Dynamic.literal(addPath = js.Any.fromFunction1((t0: Path) => addPath(t0).runNow()), drawImageAtPoint = js.Any.fromFunction2((t0: Image, t1: Point) => (drawImageAtPoint(t0, t1)).runNow()), drawImageInRect = js.Any.fromFunction2((t0: Image, t1: Rect) => (drawImageInRect(t0, t1)).runNow()), drawText = js.Any.fromFunction2((t0: String, t1: Point) => (drawText(t0, t1)).runNow()), drawTextInRect = js.Any.fromFunction2((t0: String, t1: Rect) => (drawTextInRect(t0, t1)).runNow()), fill = js.Any.fromFunction1((t0: Rect) => fill(t0).runNow()), fillEllipse = js.Any.fromFunction1((t0: Rect) => fillEllipse(t0).runNow()), fillPath = fillPath.toJsFn, fillRect = js.Any.fromFunction1((t0: Rect) => fillRect(t0).runNow()), getImage = getImage.toJsFn, opaque = opaque.asInstanceOf[js.Any], respectScreenScale = respectScreenScale.asInstanceOf[js.Any], setFillColor = js.Any.fromFunction1((t0: Color) => setFillColor(t0).runNow()), setFont = js.Any.fromFunction1((t0: Font) => setFont(t0).runNow()), setLineWidth = js.Any.fromFunction1((t0: Double) => setLineWidth(t0).runNow()), setStrokeColor = js.Any.fromFunction1((t0: Color) => setStrokeColor(t0).runNow()), setTextAlignedCenter = setTextAlignedCenter.toJsFn, setTextAlignedLeft = setTextAlignedLeft.toJsFn, setTextAlignedRight = setTextAlignedRight.toJsFn, setTextColor = js.Any.fromFunction1((t0: Color) => setTextColor(t0).runNow()), size = size.asInstanceOf[js.Any], stroke = js.Any.fromFunction1((t0: Rect) => stroke(t0).runNow()), strokeEllipse = js.Any.fromFunction1((t0: Rect) => strokeEllipse(t0).runNow()), strokePath = strokePath.toJsFn, strokeRect = js.Any.fromFunction1((t0: Rect) => strokeRect(t0).runNow()))
    __obj.asInstanceOf[DrawContext]
  }
  
  extension [Self <: DrawContext](x: Self) {
    
    inline def setAddPath(value: Path => Callback): Self = StObject.set(x, "addPath", js.Any.fromFunction1((t0: Path) => value(t0).runNow()))
    
    inline def setDrawImageAtPoint(value: (Image, Point) => Callback): Self = StObject.set(x, "drawImageAtPoint", js.Any.fromFunction2((t0: Image, t1: Point) => (value(t0, t1)).runNow()))
    
    inline def setDrawImageInRect(value: (Image, Rect) => Callback): Self = StObject.set(x, "drawImageInRect", js.Any.fromFunction2((t0: Image, t1: Rect) => (value(t0, t1)).runNow()))
    
    inline def setDrawText(value: (String, Point) => Callback): Self = StObject.set(x, "drawText", js.Any.fromFunction2((t0: String, t1: Point) => (value(t0, t1)).runNow()))
    
    inline def setDrawTextInRect(value: (String, Rect) => Callback): Self = StObject.set(x, "drawTextInRect", js.Any.fromFunction2((t0: String, t1: Rect) => (value(t0, t1)).runNow()))
    
    inline def setFill(value: Rect => Callback): Self = StObject.set(x, "fill", js.Any.fromFunction1((t0: Rect) => value(t0).runNow()))
    
    inline def setFillEllipse(value: Rect => Callback): Self = StObject.set(x, "fillEllipse", js.Any.fromFunction1((t0: Rect) => value(t0).runNow()))
    
    inline def setFillPath(value: Callback): Self = StObject.set(x, "fillPath", value.toJsFn)
    
    inline def setFillRect(value: Rect => Callback): Self = StObject.set(x, "fillRect", js.Any.fromFunction1((t0: Rect) => value(t0).runNow()))
    
    inline def setGetImage(value: CallbackTo[Image]): Self = StObject.set(x, "getImage", value.toJsFn)
    
    inline def setOpaque(value: Boolean): Self = StObject.set(x, "opaque", value.asInstanceOf[js.Any])
    
    inline def setRespectScreenScale(value: Boolean): Self = StObject.set(x, "respectScreenScale", value.asInstanceOf[js.Any])
    
    inline def setSetFillColor(value: Color => Callback): Self = StObject.set(x, "setFillColor", js.Any.fromFunction1((t0: Color) => value(t0).runNow()))
    
    inline def setSetFont(value: Font => Callback): Self = StObject.set(x, "setFont", js.Any.fromFunction1((t0: Font) => value(t0).runNow()))
    
    inline def setSetLineWidth(value: Double => Callback): Self = StObject.set(x, "setLineWidth", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetStrokeColor(value: Color => Callback): Self = StObject.set(x, "setStrokeColor", js.Any.fromFunction1((t0: Color) => value(t0).runNow()))
    
    inline def setSetTextAlignedCenter(value: Callback): Self = StObject.set(x, "setTextAlignedCenter", value.toJsFn)
    
    inline def setSetTextAlignedLeft(value: Callback): Self = StObject.set(x, "setTextAlignedLeft", value.toJsFn)
    
    inline def setSetTextAlignedRight(value: Callback): Self = StObject.set(x, "setTextAlignedRight", value.toJsFn)
    
    inline def setSetTextColor(value: Color => Callback): Self = StObject.set(x, "setTextColor", js.Any.fromFunction1((t0: Color) => value(t0).runNow()))
    
    inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setStroke(value: Rect => Callback): Self = StObject.set(x, "stroke", js.Any.fromFunction1((t0: Rect) => value(t0).runNow()))
    
    inline def setStrokeEllipse(value: Rect => Callback): Self = StObject.set(x, "strokeEllipse", js.Any.fromFunction1((t0: Rect) => value(t0).runNow()))
    
    inline def setStrokePath(value: Callback): Self = StObject.set(x, "strokePath", value.toJsFn)
    
    inline def setStrokeRect(value: Rect => Callback): Self = StObject.set(x, "strokeRect", js.Any.fromFunction1((t0: Rect) => value(t0).runNow()))
  }
}
