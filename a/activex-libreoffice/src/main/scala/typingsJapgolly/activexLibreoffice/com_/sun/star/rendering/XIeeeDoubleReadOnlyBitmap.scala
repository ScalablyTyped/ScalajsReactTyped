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
  * This is a specialized interface for bitmaps containing IEEE doubles for their color components. In contrast to {@link XIeeeDoubleBitmap} , this
  * interface only permits read-only access.
  *
  * Use this interface for e.g. bitmaps that are calculated on-the-fly, or that are pure functional, and thus cannot be modified.
  *
  * If you get passed an instance of {@link XHalfFloatReadOnlyBitmap} that also supports the {@link XVolatileBitmap} interface, things become a bit more
  * complicated. When reading data, one has to check for both {@link VolatileContentDestroyedException} and mismatching {@link FloatingPointBitmapLayout}
  * return values. If either of them occurs, the whole bitmap read operation should be repeated.
  */
trait XIeeeDoubleReadOnlyBitmap
  extends StObject
     with XBitmap {
  
  /**
    * Query the memory layout for this bitmap.
    *
    * Please note that for volatile bitmaps, the memory layout might change between subsequent calls.
    */
  val MemoryLayout: FloatingPointBitmapLayout
  
  /**
    * Query the raw data of this bitmap.
    *
    * Query the raw data of this bitmap, in the format as defined by {@link getMemoryLayout()} . With the given rectangle, a subset of the whole bitmap can
    * be queried. When querying subsets of the bitmap, the same scanline padding takes place as when the whole bitmap is requested.
    *
    * Note that the bitmap memory layout might change for volatile bitmaps.
    * @param bitmapLayout The memory layout the returned data is in.
    * @param rect A rectangle, within the bounds of the bitmap, to retrieve the consent from.
    * @throws VolatileContentDestroyedException if the bitmap is volatile, and the content has been destroyed by the system.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if parts of the given rectangle are outside the permissible bitmap area.
    */
  def getData(bitmapLayout: js.Array[FloatingPointBitmapLayout], rect: IntegerRectangle2D): SafeArray[Double]
  
  /**
    * Query the memory layout for this bitmap.
    *
    * Please note that for volatile bitmaps, the memory layout might change between subsequent calls.
    */
  def getMemoryLayout(): FloatingPointBitmapLayout
  
  /**
    * Get a single pixel of the bitmap, returning its color value.
    *
    * Note that the bitmap memory layout might change for volatile bitmaps.
    * @param bitmapLayout The memory layout the returned data is in.
    * @param pos A position, within the bounds of the bitmap, to retrieve the color from.
    * @throws VolatileContentDestroyedException if the bitmap is volatile, and the content has been destroyed by the system.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the given position is outside the permissible bitmap area.
    */
  def getPixel(bitmapLayout: js.Array[FloatingPointBitmapLayout], pos: IntegerPoint2D): SafeArray[Double]
}
object XIeeeDoubleReadOnlyBitmap {
  
  inline def apply(
    MemoryLayout: FloatingPointBitmapLayout,
    Size: IntegerSize2D,
    acquire: Callback,
    getData: (js.Array[FloatingPointBitmapLayout], IntegerRectangle2D) => SafeArray[Double],
    getMemoryLayout: CallbackTo[FloatingPointBitmapLayout],
    getPixel: (js.Array[FloatingPointBitmapLayout], IntegerPoint2D) => SafeArray[Double],
    getScaledBitmap: (RealSize2D, Boolean) => XBitmap,
    getSize: CallbackTo[IntegerSize2D],
    hasAlpha: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback
  ): XIeeeDoubleReadOnlyBitmap = {
    val __obj = js.Dynamic.literal(MemoryLayout = MemoryLayout.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], acquire = acquire.toJsFn, getData = js.Any.fromFunction2(getData), getMemoryLayout = getMemoryLayout.toJsFn, getPixel = js.Any.fromFunction2(getPixel), getScaledBitmap = js.Any.fromFunction2(getScaledBitmap), getSize = getSize.toJsFn, hasAlpha = hasAlpha.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XIeeeDoubleReadOnlyBitmap]
  }
  
  extension [Self <: XIeeeDoubleReadOnlyBitmap](x: Self) {
    
    inline def setGetData(value: (js.Array[FloatingPointBitmapLayout], IntegerRectangle2D) => SafeArray[Double]): Self = StObject.set(x, "getData", js.Any.fromFunction2(value))
    
    inline def setGetMemoryLayout(value: CallbackTo[FloatingPointBitmapLayout]): Self = StObject.set(x, "getMemoryLayout", value.toJsFn)
    
    inline def setGetPixel(value: (js.Array[FloatingPointBitmapLayout], IntegerPoint2D) => SafeArray[Double]): Self = StObject.set(x, "getPixel", js.Any.fromFunction2(value))
    
    inline def setMemoryLayout(value: FloatingPointBitmapLayout): Self = StObject.set(x, "MemoryLayout", value.asInstanceOf[js.Any])
  }
}
