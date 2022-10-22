package typingsJapgolly.activexLibreoffice.com_.sun.star.rendering

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.geometry.IntegerPoint2D
import typingsJapgolly.activexLibreoffice.com_.sun.star.geometry.IntegerRectangle2D
import typingsJapgolly.activexLibreoffice.com_.sun.star.geometry.IntegerSize2D
import typingsJapgolly.activexLibreoffice.com_.sun.star.geometry.RealSize2D
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specialized interface for bitmaps containing half floats as their color components. Half floats are 16 bit wide, and some high-end GPUs already have
  * them as supported frame buffer format. In contrast to {@link XHalfFloatBitmap} , this interface only permits read-only access.
  *
  * Use this interface for e.g. bitmaps that are calculated on-the-fly, or that are pure functional, and thus cannot be modified.
  *
  * If you get passed an instance of {@link XHalfFloatReadOnlyBitmap} that also supports the {@link XVolatileBitmap} interface, things become a bit more
  * complicated. When reading data, one has to check for both {@link VolatileContentDestroyedException} and mismatching {@link FloatingPointBitmapLayout}
  * return values. If either of them occurs, the whole bitmap read operation should be repeated.
  */
trait XHalfFloatReadOnlyBitmap
  extends StObject
     with XBitmap {
  
  /** Query the memory layout for this bitmap. */
  val MemoryLayout: FloatingPointBitmapLayout
  
  /**
    * Query the raw data of this bitmap.
    *
    * Query the raw data of this bitmap, in the format as defined by {@link getMemoryLayout()} . With the given rectangle, a subset of the whole bitmap can
    * be queried. When querying subsets of the bitmap, the same scanline padding takes place as when the whole bitmap is requested. Note: as we currently
    * have no 16 bit float UNO data type, the values are transported as 16 bit integers across the API (which requires casting on both sides).
    * @throws VolatileContentDestroyedException if the bitmap is volatile, and the content has been destroyed by the system.
    */
  def getData(rect: IntegerRectangle2D): SafeArray[Double]
  
  /** Query the memory layout for this bitmap. */
  def getMemoryLayout(): FloatingPointBitmapLayout
  
  /**
    * Get a single pixel of the bitmap, returning its color value.
    * @throws VolatileContentDestroyedException if the bitmap is volatile, and the content has been destroyed by the system.
    */
  def getPixel(pos: IntegerPoint2D): SafeArray[Double]
}
object XHalfFloatReadOnlyBitmap {
  
  inline def apply(
    MemoryLayout: FloatingPointBitmapLayout,
    Size: IntegerSize2D,
    acquire: Callback,
    getData: IntegerRectangle2D => SafeArray[Double],
    getMemoryLayout: CallbackTo[FloatingPointBitmapLayout],
    getPixel: IntegerPoint2D => SafeArray[Double],
    getScaledBitmap: (RealSize2D, Boolean) => XBitmap,
    getSize: CallbackTo[IntegerSize2D],
    hasAlpha: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback
  ): XHalfFloatReadOnlyBitmap = {
    val __obj = js.Dynamic.literal(MemoryLayout = MemoryLayout.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], acquire = acquire.toJsFn, getData = js.Any.fromFunction1(getData), getMemoryLayout = getMemoryLayout.toJsFn, getPixel = js.Any.fromFunction1(getPixel), getScaledBitmap = js.Any.fromFunction2(getScaledBitmap), getSize = getSize.toJsFn, hasAlpha = hasAlpha.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XHalfFloatReadOnlyBitmap]
  }
  
  extension [Self <: XHalfFloatReadOnlyBitmap](x: Self) {
    
    inline def setGetData(value: IntegerRectangle2D => SafeArray[Double]): Self = StObject.set(x, "getData", js.Any.fromFunction1(value))
    
    inline def setGetMemoryLayout(value: CallbackTo[FloatingPointBitmapLayout]): Self = StObject.set(x, "getMemoryLayout", value.toJsFn)
    
    inline def setGetPixel(value: IntegerPoint2D => SafeArray[Double]): Self = StObject.set(x, "getPixel", js.Any.fromFunction1(value))
    
    inline def setMemoryLayout(value: FloatingPointBitmapLayout): Self = StObject.set(x, "MemoryLayout", value.asInstanceOf[js.Any])
  }
}
