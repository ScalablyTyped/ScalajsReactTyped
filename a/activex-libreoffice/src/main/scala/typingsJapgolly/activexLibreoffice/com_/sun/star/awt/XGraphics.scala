package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides the basic output operation of a device. */
trait XGraphics
  extends StObject
     with XInterface {
  
  /** returns the device of this graphics. */
  val Device: XDevice
  
  /** returns the font metric of the current font. */
  val FontMetric: SimpleFontMetric
  
  /** copies a rectangle of pixels from another device into this one. */
  def copy(
    xSource: XDevice,
    nSourceX: Double,
    nSourceY: Double,
    nSourceWidth: Double,
    nSourceHeight: Double,
    nDestX: Double,
    nDestY: Double,
    nDestWidth: Double,
    nDestHeight: Double
  ): Unit
  
  /** draws a part of the specified bitmap to the output device. */
  def draw(
    xBitmapHandle: XDisplayBitmap,
    SourceX: Double,
    SourceY: Double,
    SourceWidth: Double,
    SourceHeight: Double,
    DestX: Double,
    DestY: Double,
    DestWidth: Double,
    DestHeight: Double
  ): Unit
  
  /** draws an arc (part of a circle) in the output device. */
  def drawArc(
    X: Double,
    Y: Double,
    Width: Double,
    Height: Double,
    X1: Double,
    Y1: Double,
    X2: Double,
    Y2: Double
  ): Unit
  
  /**
    * draws a chord of a circular area in the output device.
    *
    * A chord is a segment of a circle. You get two chords from a circle if you intersect the circle with a straight line joining two points on the circle.
    */
  def drawChord(
    nX: Double,
    nY: Double,
    nWidth: Double,
    nHeight: Double,
    nX1: Double,
    nY1: Double,
    nX2: Double,
    nY2: Double
  ): Unit
  
  /** draws an ellipse in the output device. */
  def drawEllipse(X: Double, Y: Double, Width: Double, Height: Double): Unit
  
  /** draws a color dispersion in the output device. */
  def drawGradient(nX: Double, nY: Double, nWidth: Double, Height: Double, aGradient: Gradient): Unit
  
  /** draws a line in the output device. */
  def drawLine(X1: Double, Y1: Double, X2: Double, Y2: Double): Unit
  
  /** draws a circular area in the output device. */
  def drawPie(
    X: Double,
    Y: Double,
    Width: Double,
    Height: Double,
    X1: Double,
    Y1: Double,
    X2: Double,
    Y2: Double
  ): Unit
  
  /** sets a single pixel in the output device. */
  def drawPixel(X: Double, Y: Double): Unit
  
  /** draws multiple lines in the output device at once. */
  def drawPolyLine(DataX: SeqEquiv[Double], DataY: SeqEquiv[Double]): Unit
  
  /** draws multiple polygons in the output device at once. */
  def drawPolyPolygon(DataX: SeqEquiv[SeqEquiv[Double]], DataY: SeqEquiv[SeqEquiv[Double]]): Unit
  
  /** draws a polygon line in the output device. */
  def drawPolygon(DataX: SeqEquiv[Double], DataY: SeqEquiv[Double]): Unit
  
  /** draws a rectangle in the output device. */
  def drawRect(X: Double, Y: Double, Width: Double, Height: Double): Unit
  
  /** draws a rectangle with rounded corners in the output device. */
  def drawRoundedRect(X: Double, Y: Double, Width: Double, Height: Double, nHorzRound: Double, nVertRound: Double): Unit
  
  /** draws text in the output device. */
  def drawText(X: Double, Y: Double, Text: String): Unit
  
  /** draws texts in the output device using an explicit kerning table. */
  def drawTextArray(X: Double, Y: Double, Text: String, Longs: SeqEquiv[Double]): Unit
  
  /** returns the device of this graphics. */
  def getDevice(): XDevice
  
  /** returns the font metric of the current font. */
  def getFontMetric(): SimpleFontMetric
  
  /** builds the intersection with the current region. */
  def intersectClipRegion(xClipping: XRegion): Unit
  
  /** restores all previous saved settings. */
  def pop(): Unit
  
  /** saves all current settings (Font, TextColor, TextFillColor, LineColor, FillColor, RasterOp, ClipRegion). */
  def push(): Unit
  
  /** creates a new font and sets the font. */
  def selectFont(aDescription: FontDescriptor): Unit
  
  /** sets the clip region to specified clipping. */
  def setClipRegion(Clipping: XRegion): Unit
  
  /** sets the fill color. */
  def setFillColor(nColor: Color): Unit
  
  /** sets the font used by text operations. */
  def setFont(xNewFont: XFont): Unit
  
  /** sets the line color. */
  def setLineColor(nColor: Color): Unit
  
  /**
    * sets the raster operation.
    *
    * If the device does not support raster operations then this call is ignored.
    */
  def setRasterOp(ROP: RasterOperation): Unit
  
  /** sets the text color used by text operations. */
  def setTextColor(nColor: Color): Unit
  
  /** sets the fill color used by text operations. */
  def setTextFillColor(nColor: Color): Unit
}
object XGraphics {
  
  inline def apply(
    Device: XDevice,
    FontMetric: SimpleFontMetric,
    acquire: Callback,
    copy: (XDevice, Double, Double, Double, Double, Double, Double, Double, Double) => Callback,
    draw: (XDisplayBitmap, Double, Double, Double, Double, Double, Double, Double, Double) => Callback,
    drawArc: (Double, Double, Double, Double, Double, Double, Double, Double) => Callback,
    drawChord: (Double, Double, Double, Double, Double, Double, Double, Double) => Callback,
    drawEllipse: (Double, Double, Double, Double) => Callback,
    drawGradient: (Double, Double, Double, Double, Gradient) => Callback,
    drawLine: (Double, Double, Double, Double) => Callback,
    drawPie: (Double, Double, Double, Double, Double, Double, Double, Double) => Callback,
    drawPixel: (Double, Double) => Callback,
    drawPolyLine: (SeqEquiv[Double], SeqEquiv[Double]) => Callback,
    drawPolyPolygon: (SeqEquiv[SeqEquiv[Double]], SeqEquiv[SeqEquiv[Double]]) => Callback,
    drawPolygon: (SeqEquiv[Double], SeqEquiv[Double]) => Callback,
    drawRect: (Double, Double, Double, Double) => Callback,
    drawRoundedRect: (Double, Double, Double, Double, Double, Double) => Callback,
    drawText: (Double, Double, String) => Callback,
    drawTextArray: (Double, Double, String, SeqEquiv[Double]) => Callback,
    getDevice: CallbackTo[XDevice],
    getFontMetric: CallbackTo[SimpleFontMetric],
    intersectClipRegion: XRegion => Callback,
    pop: Callback,
    push: Callback,
    queryInterface: `type` => Any,
    release: Callback,
    selectFont: FontDescriptor => Callback,
    setClipRegion: XRegion => Callback,
    setFillColor: Color => Callback,
    setFont: XFont => Callback,
    setLineColor: Color => Callback,
    setRasterOp: RasterOperation => Callback,
    setTextColor: Color => Callback,
    setTextFillColor: Color => Callback
  ): XGraphics = {
    val __obj = js.Dynamic.literal(Device = Device.asInstanceOf[js.Any], FontMetric = FontMetric.asInstanceOf[js.Any], acquire = acquire.toJsFn, copy = js.Any.fromFunction9((t0: XDevice, t1: Double, t2: Double, t3: Double, t4: Double, t5: Double, t6: Double, t7: Double, t8: Double) => (copy(t0, t1, t2, t3, t4, t5, t6, t7, t8)).runNow()), draw = js.Any.fromFunction9((t0: XDisplayBitmap, t1: Double, t2: Double, t3: Double, t4: Double, t5: Double, t6: Double, t7: Double, t8: Double) => (draw(t0, t1, t2, t3, t4, t5, t6, t7, t8)).runNow()), drawArc = js.Any.fromFunction8((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double, t5: Double, t6: Double, t7: Double) => (drawArc(t0, t1, t2, t3, t4, t5, t6, t7)).runNow()), drawChord = js.Any.fromFunction8((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double, t5: Double, t6: Double, t7: Double) => (drawChord(t0, t1, t2, t3, t4, t5, t6, t7)).runNow()), drawEllipse = js.Any.fromFunction4((t0: Double, t1: Double, t2: Double, t3: Double) => (drawEllipse(t0, t1, t2, t3)).runNow()), drawGradient = js.Any.fromFunction5((t0: Double, t1: Double, t2: Double, t3: Double, t4: Gradient) => (drawGradient(t0, t1, t2, t3, t4)).runNow()), drawLine = js.Any.fromFunction4((t0: Double, t1: Double, t2: Double, t3: Double) => (drawLine(t0, t1, t2, t3)).runNow()), drawPie = js.Any.fromFunction8((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double, t5: Double, t6: Double, t7: Double) => (drawPie(t0, t1, t2, t3, t4, t5, t6, t7)).runNow()), drawPixel = js.Any.fromFunction2((t0: Double, t1: Double) => (drawPixel(t0, t1)).runNow()), drawPolyLine = js.Any.fromFunction2((t0: SeqEquiv[Double], t1: SeqEquiv[Double]) => (drawPolyLine(t0, t1)).runNow()), drawPolyPolygon = js.Any.fromFunction2((t0: SeqEquiv[SeqEquiv[Double]], t1: SeqEquiv[SeqEquiv[Double]]) => (drawPolyPolygon(t0, t1)).runNow()), drawPolygon = js.Any.fromFunction2((t0: SeqEquiv[Double], t1: SeqEquiv[Double]) => (drawPolygon(t0, t1)).runNow()), drawRect = js.Any.fromFunction4((t0: Double, t1: Double, t2: Double, t3: Double) => (drawRect(t0, t1, t2, t3)).runNow()), drawRoundedRect = js.Any.fromFunction6((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double, t5: Double) => (drawRoundedRect(t0, t1, t2, t3, t4, t5)).runNow()), drawText = js.Any.fromFunction3((t0: Double, t1: Double, t2: String) => (drawText(t0, t1, t2)).runNow()), drawTextArray = js.Any.fromFunction4((t0: Double, t1: Double, t2: String, t3: SeqEquiv[Double]) => (drawTextArray(t0, t1, t2, t3)).runNow()), getDevice = getDevice.toJsFn, getFontMetric = getFontMetric.toJsFn, intersectClipRegion = js.Any.fromFunction1((t0: XRegion) => intersectClipRegion(t0).runNow()), pop = pop.toJsFn, push = push.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, selectFont = js.Any.fromFunction1((t0: FontDescriptor) => selectFont(t0).runNow()), setClipRegion = js.Any.fromFunction1((t0: XRegion) => setClipRegion(t0).runNow()), setFillColor = js.Any.fromFunction1((t0: Color) => setFillColor(t0).runNow()), setFont = js.Any.fromFunction1((t0: XFont) => setFont(t0).runNow()), setLineColor = js.Any.fromFunction1((t0: Color) => setLineColor(t0).runNow()), setRasterOp = js.Any.fromFunction1((t0: RasterOperation) => setRasterOp(t0).runNow()), setTextColor = js.Any.fromFunction1((t0: Color) => setTextColor(t0).runNow()), setTextFillColor = js.Any.fromFunction1((t0: Color) => setTextFillColor(t0).runNow()))
    __obj.asInstanceOf[XGraphics]
  }
  
  extension [Self <: XGraphics](x: Self) {
    
    inline def setCopy(value: (XDevice, Double, Double, Double, Double, Double, Double, Double, Double) => Callback): Self = StObject.set(x, "copy", js.Any.fromFunction9((t0: XDevice, t1: Double, t2: Double, t3: Double, t4: Double, t5: Double, t6: Double, t7: Double, t8: Double) => (value(t0, t1, t2, t3, t4, t5, t6, t7, t8)).runNow()))
    
    inline def setDevice(value: XDevice): Self = StObject.set(x, "Device", value.asInstanceOf[js.Any])
    
    inline def setDraw(
      value: (XDisplayBitmap, Double, Double, Double, Double, Double, Double, Double, Double) => Callback
    ): Self = StObject.set(x, "draw", js.Any.fromFunction9((t0: XDisplayBitmap, t1: Double, t2: Double, t3: Double, t4: Double, t5: Double, t6: Double, t7: Double, t8: Double) => (value(t0, t1, t2, t3, t4, t5, t6, t7, t8)).runNow()))
    
    inline def setDrawArc(value: (Double, Double, Double, Double, Double, Double, Double, Double) => Callback): Self = StObject.set(x, "drawArc", js.Any.fromFunction8((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double, t5: Double, t6: Double, t7: Double) => (value(t0, t1, t2, t3, t4, t5, t6, t7)).runNow()))
    
    inline def setDrawChord(value: (Double, Double, Double, Double, Double, Double, Double, Double) => Callback): Self = StObject.set(x, "drawChord", js.Any.fromFunction8((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double, t5: Double, t6: Double, t7: Double) => (value(t0, t1, t2, t3, t4, t5, t6, t7)).runNow()))
    
    inline def setDrawEllipse(value: (Double, Double, Double, Double) => Callback): Self = StObject.set(x, "drawEllipse", js.Any.fromFunction4((t0: Double, t1: Double, t2: Double, t3: Double) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setDrawGradient(value: (Double, Double, Double, Double, Gradient) => Callback): Self = StObject.set(x, "drawGradient", js.Any.fromFunction5((t0: Double, t1: Double, t2: Double, t3: Double, t4: Gradient) => (value(t0, t1, t2, t3, t4)).runNow()))
    
    inline def setDrawLine(value: (Double, Double, Double, Double) => Callback): Self = StObject.set(x, "drawLine", js.Any.fromFunction4((t0: Double, t1: Double, t2: Double, t3: Double) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setDrawPie(value: (Double, Double, Double, Double, Double, Double, Double, Double) => Callback): Self = StObject.set(x, "drawPie", js.Any.fromFunction8((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double, t5: Double, t6: Double, t7: Double) => (value(t0, t1, t2, t3, t4, t5, t6, t7)).runNow()))
    
    inline def setDrawPixel(value: (Double, Double) => Callback): Self = StObject.set(x, "drawPixel", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setDrawPolyLine(value: (SeqEquiv[Double], SeqEquiv[Double]) => Callback): Self = StObject.set(x, "drawPolyLine", js.Any.fromFunction2((t0: SeqEquiv[Double], t1: SeqEquiv[Double]) => (value(t0, t1)).runNow()))
    
    inline def setDrawPolyPolygon(value: (SeqEquiv[SeqEquiv[Double]], SeqEquiv[SeqEquiv[Double]]) => Callback): Self = StObject.set(x, "drawPolyPolygon", js.Any.fromFunction2((t0: SeqEquiv[SeqEquiv[Double]], t1: SeqEquiv[SeqEquiv[Double]]) => (value(t0, t1)).runNow()))
    
    inline def setDrawPolygon(value: (SeqEquiv[Double], SeqEquiv[Double]) => Callback): Self = StObject.set(x, "drawPolygon", js.Any.fromFunction2((t0: SeqEquiv[Double], t1: SeqEquiv[Double]) => (value(t0, t1)).runNow()))
    
    inline def setDrawRect(value: (Double, Double, Double, Double) => Callback): Self = StObject.set(x, "drawRect", js.Any.fromFunction4((t0: Double, t1: Double, t2: Double, t3: Double) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setDrawRoundedRect(value: (Double, Double, Double, Double, Double, Double) => Callback): Self = StObject.set(x, "drawRoundedRect", js.Any.fromFunction6((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double, t5: Double) => (value(t0, t1, t2, t3, t4, t5)).runNow()))
    
    inline def setDrawText(value: (Double, Double, String) => Callback): Self = StObject.set(x, "drawText", js.Any.fromFunction3((t0: Double, t1: Double, t2: String) => (value(t0, t1, t2)).runNow()))
    
    inline def setDrawTextArray(value: (Double, Double, String, SeqEquiv[Double]) => Callback): Self = StObject.set(x, "drawTextArray", js.Any.fromFunction4((t0: Double, t1: Double, t2: String, t3: SeqEquiv[Double]) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setFontMetric(value: SimpleFontMetric): Self = StObject.set(x, "FontMetric", value.asInstanceOf[js.Any])
    
    inline def setGetDevice(value: CallbackTo[XDevice]): Self = StObject.set(x, "getDevice", value.toJsFn)
    
    inline def setGetFontMetric(value: CallbackTo[SimpleFontMetric]): Self = StObject.set(x, "getFontMetric", value.toJsFn)
    
    inline def setIntersectClipRegion(value: XRegion => Callback): Self = StObject.set(x, "intersectClipRegion", js.Any.fromFunction1((t0: XRegion) => value(t0).runNow()))
    
    inline def setPop(value: Callback): Self = StObject.set(x, "pop", value.toJsFn)
    
    inline def setPush(value: Callback): Self = StObject.set(x, "push", value.toJsFn)
    
    inline def setSelectFont(value: FontDescriptor => Callback): Self = StObject.set(x, "selectFont", js.Any.fromFunction1((t0: FontDescriptor) => value(t0).runNow()))
    
    inline def setSetClipRegion(value: XRegion => Callback): Self = StObject.set(x, "setClipRegion", js.Any.fromFunction1((t0: XRegion) => value(t0).runNow()))
    
    inline def setSetFillColor(value: Color => Callback): Self = StObject.set(x, "setFillColor", js.Any.fromFunction1((t0: Color) => value(t0).runNow()))
    
    inline def setSetFont(value: XFont => Callback): Self = StObject.set(x, "setFont", js.Any.fromFunction1((t0: XFont) => value(t0).runNow()))
    
    inline def setSetLineColor(value: Color => Callback): Self = StObject.set(x, "setLineColor", js.Any.fromFunction1((t0: Color) => value(t0).runNow()))
    
    inline def setSetRasterOp(value: RasterOperation => Callback): Self = StObject.set(x, "setRasterOp", js.Any.fromFunction1((t0: RasterOperation) => value(t0).runNow()))
    
    inline def setSetTextColor(value: Color => Callback): Self = StObject.set(x, "setTextColor", js.Any.fromFunction1((t0: Color) => value(t0).runNow()))
    
    inline def setSetTextFillColor(value: Color => Callback): Self = StObject.set(x, "setTextFillColor", js.Any.fromFunction1((t0: Color) => value(t0).runNow()))
  }
}
