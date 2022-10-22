package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies a data sink for an image.
  *
  * An image consumer is a component which wants to display or just receive an image from an image producer.
  * @see XImageProducer
  */
trait XImageConsumer
  extends StObject
     with XInterface {
  
  /**
    * is called for the notification of the degree to which the image is delivered.
    *
    * The complete method is called when the image producer has finished delivering all of the pixels that the source image contains, or when a single frame
    * of a multi-frame animation has been completed, or when an error in loading or producing the image has occurred. The image consumer should remove
    * itself from the list of consumers registered with the image producer at this time, unless it is interested in successive frames.
    */
  def complete(Status: Double, xProducer: XImageProducer): Unit
  
  /** initializes the consumer with image dimensions. */
  def init(Width: Double, Height: Double): Unit
  
  /** changes color model for next pixels typically called once after initialization. */
  def setColorModel(
    BitCount: Double,
    RGBAPal: SeqEquiv[Double],
    RedMask: Double,
    GreenMask: Double,
    BlueMask: Double,
    AlphaMask: Double
  ): Unit
  
  /**
    * delivers a chunk of pixels as `long` values.
    *
    * The pixels of the image are delivered using one or more calls to this method. Each call specifies the location and size of the rectangle of source
    * pixels that are contained in the array of pixels. The specified color model object should be used to convert the pixels into their corresponding color
    * and alpha components. Pixel (m,n) is stored in the pixels array at index (n * **nScanSize**m + nOffset).
    */
  def setPixelsByBytes(
    nX: Double,
    nY: Double,
    nWidth: Double,
    nHeight: Double,
    aProducerData: SeqEquiv[Double],
    nOffset: Double,
    nScanSize: Double
  ): Unit
  
  /**
    * delivers a chunk of pixels as `byte` values.
    *
    * The pixels of the image are delivered using one or more calls to this method. Each call specifies the location and size of the rectangle of source
    * pixels that are contained in the array of pixels. The specified color model object should be used to convert the pixels into their corresponding color
    * and alpha components. Pixel (m,n) is stored in the pixels array at index (n * **nScanSize**m + nOffset).
    */
  def setPixelsByLongs(
    nX: Double,
    nY: Double,
    nWidth: Double,
    nHeight: Double,
    aProducerData: SeqEquiv[Double],
    nOffset: Double,
    nScanSize: Double
  ): Unit
}
object XImageConsumer {
  
  inline def apply(
    acquire: Callback,
    complete: (Double, XImageProducer) => Callback,
    init: (Double, Double) => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    setColorModel: (Double, SeqEquiv[Double], Double, Double, Double, Double) => Callback,
    setPixelsByBytes: (Double, Double, Double, Double, SeqEquiv[Double], Double, Double) => Callback,
    setPixelsByLongs: (Double, Double, Double, Double, SeqEquiv[Double], Double, Double) => Callback
  ): XImageConsumer = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, complete = js.Any.fromFunction2((t0: Double, t1: XImageProducer) => (complete(t0, t1)).runNow()), init = js.Any.fromFunction2((t0: Double, t1: Double) => (init(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setColorModel = js.Any.fromFunction6((t0: Double, t1: SeqEquiv[Double], t2: Double, t3: Double, t4: Double, t5: Double) => (setColorModel(t0, t1, t2, t3, t4, t5)).runNow()), setPixelsByBytes = js.Any.fromFunction7((t0: Double, t1: Double, t2: Double, t3: Double, t4: SeqEquiv[Double], t5: Double, t6: Double) => (setPixelsByBytes(t0, t1, t2, t3, t4, t5, t6)).runNow()), setPixelsByLongs = js.Any.fromFunction7((t0: Double, t1: Double, t2: Double, t3: Double, t4: SeqEquiv[Double], t5: Double, t6: Double) => (setPixelsByLongs(t0, t1, t2, t3, t4, t5, t6)).runNow()))
    __obj.asInstanceOf[XImageConsumer]
  }
  
  extension [Self <: XImageConsumer](x: Self) {
    
    inline def setComplete(value: (Double, XImageProducer) => Callback): Self = StObject.set(x, "complete", js.Any.fromFunction2((t0: Double, t1: XImageProducer) => (value(t0, t1)).runNow()))
    
    inline def setInit(value: (Double, Double) => Callback): Self = StObject.set(x, "init", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setSetColorModel(value: (Double, SeqEquiv[Double], Double, Double, Double, Double) => Callback): Self = StObject.set(x, "setColorModel", js.Any.fromFunction6((t0: Double, t1: SeqEquiv[Double], t2: Double, t3: Double, t4: Double, t5: Double) => (value(t0, t1, t2, t3, t4, t5)).runNow()))
    
    inline def setSetPixelsByBytes(value: (Double, Double, Double, Double, SeqEquiv[Double], Double, Double) => Callback): Self = StObject.set(x, "setPixelsByBytes", js.Any.fromFunction7((t0: Double, t1: Double, t2: Double, t3: Double, t4: SeqEquiv[Double], t5: Double, t6: Double) => (value(t0, t1, t2, t3, t4, t5, t6)).runNow()))
    
    inline def setSetPixelsByLongs(value: (Double, Double, Double, Double, SeqEquiv[Double], Double, Double) => Callback): Self = StObject.set(x, "setPixelsByLongs", js.Any.fromFunction7((t0: Double, t1: Double, t2: Double, t3: Double, t4: SeqEquiv[Double], t5: Double, t6: Double) => (value(t0, t1, t2, t3, t4, t5, t6)).runNow()))
  }
}
