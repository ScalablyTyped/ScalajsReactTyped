package typingsJapgolly.winrtUwp.Windows.Graphics.Imaging

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.IMemoryBufferReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the pixel data buffer of a bitmap. */
trait BitmapBuffer extends StObject {
  
  /** Disposes of the object and associated resources. */
  def close(): Unit
  
  /**
    * Creates a reference to the underlying memory buffer.
    * @return A reference to the underlying memory buffer.
    */
  def createReference(): IMemoryBufferReference
  
  /**
    * Gets the number of bit planes in the bitmap buffer.
    * @return The number of bit planes in the bitmap buffer.
    */
  def getPlaneCount(): Double
  
  /**
    * Gets a BitmapPlaneDescription object that describes the size, offset, and stride of the bitmap data in the bit plane with the specified index.
    * @param index The index of the bit plane for which the description is retrieved.
    * @return The bit plane description.
    */
  def getPlaneDescription(index: Double): BitmapPlaneDescription
}
object BitmapBuffer {
  
  inline def apply(
    close: Callback,
    createReference: CallbackTo[IMemoryBufferReference],
    getPlaneCount: CallbackTo[Double],
    getPlaneDescription: Double => BitmapPlaneDescription
  ): BitmapBuffer = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, createReference = createReference.toJsFn, getPlaneCount = getPlaneCount.toJsFn, getPlaneDescription = js.Any.fromFunction1(getPlaneDescription))
    __obj.asInstanceOf[BitmapBuffer]
  }
  
  extension [Self <: BitmapBuffer](x: Self) {
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setCreateReference(value: CallbackTo[IMemoryBufferReference]): Self = StObject.set(x, "createReference", value.toJsFn)
    
    inline def setGetPlaneCount(value: CallbackTo[Double]): Self = StObject.set(x, "getPlaneCount", value.toJsFn)
    
    inline def setGetPlaneDescription(value: Double => BitmapPlaneDescription): Self = StObject.set(x, "getPlaneDescription", js.Any.fromFunction1(value))
  }
}
