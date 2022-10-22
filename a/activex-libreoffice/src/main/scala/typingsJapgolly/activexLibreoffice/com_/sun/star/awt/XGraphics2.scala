package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.graphic.XGraphic
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides the basic output operation of a device. */
trait XGraphics2
  extends StObject
     with XGraphics {
  
  /**
    * clears the given rectangle on the device
    * @since LibreOffice 4.1
    */
  def clear(aRect: Rectangle): Unit
  
  /**
    * draws a {@link com.sun.star.graphic.XGraphic} in the output device.
    *
    * Note that some devices may not support this operation.
    * @param nX the X coordinate on the device where the graphic will be drawn
    * @param nY the Y coordinate on the device where the graphic will be drawn
    * @param nWidth the width of the region on the device
    * @param nHeight the height of the region on the device
    * @param nStyle the style used to draw the image. See {@link com.sun.star.awt.ImageDrawMode} .
    * @param aGraphic the {@link com.sun.star.graphic.XGraphic} to be drawn onto the device
    * @since LibreOffice 4.1
    */
  def drawImage(nX: Double, nY: Double, nWidth: Double, nHeight: Double, nStyle: Double, aGraphic: XGraphic): Unit
}
object XGraphics2 {
  
  inline def apply(
    Device: XDevice,
    FontMetric: SimpleFontMetric,
    acquire: Callback,
    clear: Rectangle => Callback,
    copy: (XDevice, Double, Double, Double, Double, Double, Double, Double, Double) => Callback,
    draw: (XDisplayBitmap, Double, Double, Double, Double, Double, Double, Double, Double) => Callback,
    drawArc: (Double, Double, Double, Double, Double, Double, Double, Double) => Callback,
    drawChord: (Double, Double, Double, Double, Double, Double, Double, Double) => Callback,
    drawEllipse: (Double, Double, Double, Double) => Callback,
    drawGradient: (Double, Double, Double, Double, Gradient) => Callback,
    drawImage: (Double, Double, Double, Double, Double, XGraphic) => Callback,
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
  ): XGraphics2 = {
    val __obj = js.Dynamic.literal(Device = Device.asInstanceOf[js.Any], FontMetric = FontMetric.asInstanceOf[js.Any], acquire = acquire.toJsFn, clear = js.Any.fromFunction1((t0: Rectangle) => clear(t0).runNow()), copy = js.Any.fromFunction9((t0: XDevice, t1: Double, t2: Double, t3: Double, t4: Double, t5: Double, t6: Double, t7: Double, t8: Double) => (copy(t0, t1, t2, t3, t4, t5, t6, t7, t8)).runNow()), draw = js.Any.fromFunction9((t0: XDisplayBitmap, t1: Double, t2: Double, t3: Double, t4: Double, t5: Double, t6: Double, t7: Double, t8: Double) => (draw(t0, t1, t2, t3, t4, t5, t6, t7, t8)).runNow()), drawArc = js.Any.fromFunction8((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double, t5: Double, t6: Double, t7: Double) => (drawArc(t0, t1, t2, t3, t4, t5, t6, t7)).runNow()), drawChord = js.Any.fromFunction8((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double, t5: Double, t6: Double, t7: Double) => (drawChord(t0, t1, t2, t3, t4, t5, t6, t7)).runNow()), drawEllipse = js.Any.fromFunction4((t0: Double, t1: Double, t2: Double, t3: Double) => (drawEllipse(t0, t1, t2, t3)).runNow()), drawGradient = js.Any.fromFunction5((t0: Double, t1: Double, t2: Double, t3: Double, t4: Gradient) => (drawGradient(t0, t1, t2, t3, t4)).runNow()), drawImage = js.Any.fromFunction6((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double, t5: XGraphic) => (drawImage(t0, t1, t2, t3, t4, t5)).runNow()), drawLine = js.Any.fromFunction4((t0: Double, t1: Double, t2: Double, t3: Double) => (drawLine(t0, t1, t2, t3)).runNow()), drawPie = js.Any.fromFunction8((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double, t5: Double, t6: Double, t7: Double) => (drawPie(t0, t1, t2, t3, t4, t5, t6, t7)).runNow()), drawPixel = js.Any.fromFunction2((t0: Double, t1: Double) => (drawPixel(t0, t1)).runNow()), drawPolyLine = js.Any.fromFunction2((t0: SeqEquiv[Double], t1: SeqEquiv[Double]) => (drawPolyLine(t0, t1)).runNow()), drawPolyPolygon = js.Any.fromFunction2((t0: SeqEquiv[SeqEquiv[Double]], t1: SeqEquiv[SeqEquiv[Double]]) => (drawPolyPolygon(t0, t1)).runNow()), drawPolygon = js.Any.fromFunction2((t0: SeqEquiv[Double], t1: SeqEquiv[Double]) => (drawPolygon(t0, t1)).runNow()), drawRect = js.Any.fromFunction4((t0: Double, t1: Double, t2: Double, t3: Double) => (drawRect(t0, t1, t2, t3)).runNow()), drawRoundedRect = js.Any.fromFunction6((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double, t5: Double) => (drawRoundedRect(t0, t1, t2, t3, t4, t5)).runNow()), drawText = js.Any.fromFunction3((t0: Double, t1: Double, t2: String) => (drawText(t0, t1, t2)).runNow()), drawTextArray = js.Any.fromFunction4((t0: Double, t1: Double, t2: String, t3: SeqEquiv[Double]) => (drawTextArray(t0, t1, t2, t3)).runNow()), getDevice = getDevice.toJsFn, getFontMetric = getFontMetric.toJsFn, intersectClipRegion = js.Any.fromFunction1((t0: XRegion) => intersectClipRegion(t0).runNow()), pop = pop.toJsFn, push = push.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, selectFont = js.Any.fromFunction1((t0: FontDescriptor) => selectFont(t0).runNow()), setClipRegion = js.Any.fromFunction1((t0: XRegion) => setClipRegion(t0).runNow()), setFillColor = js.Any.fromFunction1((t0: Color) => setFillColor(t0).runNow()), setFont = js.Any.fromFunction1((t0: XFont) => setFont(t0).runNow()), setLineColor = js.Any.fromFunction1((t0: Color) => setLineColor(t0).runNow()), setRasterOp = js.Any.fromFunction1((t0: RasterOperation) => setRasterOp(t0).runNow()), setTextColor = js.Any.fromFunction1((t0: Color) => setTextColor(t0).runNow()), setTextFillColor = js.Any.fromFunction1((t0: Color) => setTextFillColor(t0).runNow()))
    __obj.asInstanceOf[XGraphics2]
  }
  
  extension [Self <: XGraphics2](x: Self) {
    
    inline def setClear(value: Rectangle => Callback): Self = StObject.set(x, "clear", js.Any.fromFunction1((t0: Rectangle) => value(t0).runNow()))
    
    inline def setDrawImage(value: (Double, Double, Double, Double, Double, XGraphic) => Callback): Self = StObject.set(x, "drawImage", js.Any.fromFunction6((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double, t5: XGraphic) => (value(t0, t1, t2, t3, t4, t5)).runNow()))
  }
}
