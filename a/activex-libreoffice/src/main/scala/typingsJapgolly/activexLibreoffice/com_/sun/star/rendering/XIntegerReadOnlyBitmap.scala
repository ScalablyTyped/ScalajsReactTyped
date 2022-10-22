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
  * This is a specialized interface for bitmaps having integer color channels. In contrast to {@link XIntegerBitmap} , this interface only permits
  * read-only access.
  *
  * Use this interface for e.g. bitmaps that are calculated on-the-fly, or that are pure functional, and thus cannot be modified.
  *
  * If you get passed an instance of {@link XIntegerReadOnlyBitmap} that also supports the {@link XVolatileBitmap} interface, things become a bit more
  * complicated. When reading data, one has to check for both {@link VolatileContentDestroyedException} and mismatching {@link IntegerBitmapLayout} return
  * values. If either of them occurs, the whole bitmap read operation should be repeated, if you need consistent information.
  */
trait XIntegerReadOnlyBitmap
  extends StObject
     with XBitmap {
  
  /**
    * Query the memory layout for this bitmap.
    *
    * Please note that for volatile bitmaps, the memory layout might change between subsequent calls.
    */
  val MemoryLayout: IntegerBitmapLayout
  
  /**
    * Query the raw data of this bitmap.
    *
    * Query the raw data of this bitmap, in the format as defined by {@link getMemoryLayout()} . With the given rectangle, a subset of the whole bitmap can
    * be queried. If the internal data format's pixel are not integer multiples of bytes (i.e. if one pixel occupies less than a byte), the leftover content
    * of the bytes at the right of each scanline is filled with zeros. The details of the scanline padding are to be retrieved from the passed bitmap
    * layout.
    *
    * Note that the bitmap memory layout might change over time for volatile bitmaps.
    * @param bitmapLayout The memory layout the returned data is in. Note that the color space returned therein needs to always match the current color space
    * @param rect A rectangle, within the bounds of the bitmap, to retrieve the consent from.
    * @throws VolatileContentDestroyedException if the bitmap is volatile, and the content has been destroyed by the system.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if parts of the given rectangle are outside the permissible bitmap area.
    */
  def getData(bitmapLayout: js.Array[IntegerBitmapLayout], rect: IntegerRectangle2D): SafeArray[Double]
  
  /**
    * Query the memory layout for this bitmap.
    *
    * Please note that for volatile bitmaps, the memory layout might change between subsequent calls.
    */
  def getMemoryLayout(): IntegerBitmapLayout
  
  /**
    * Get a single pixel of the bitmap, returning its color value.
    *
    * If the internal data format's pixel are not integer multiples of bytes (i.e. if one pixel occupies less than a byte - the case of more than one byte
    * per pixel is not specified), the color value is returned in the least significant bits of the single byte returned as the color. The details of the
    * returned pixel data are to be retrieved from the passed bitmap layout.
    *
    * Note that the bitmap memory layout might change for volatile bitmaps.
    * @param bitmapLayout The memory layout the returned data is in. Note that the color space returned therein needs to always match the current color space
    * @param pos A position, within the bounds of the bitmap, to retrieve the color from.
    * @throws VolatileContentDestroyedException if the bitmap is volatile, and the content has been destroyed by the system.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the given position is outside the permissible bitmap area.
    */
  def getPixel(bitmapLayout: js.Array[IntegerBitmapLayout], pos: IntegerPoint2D): SafeArray[Double]
}
object XIntegerReadOnlyBitmap {
  
  inline def apply(
    MemoryLayout: IntegerBitmapLayout,
    Size: IntegerSize2D,
    acquire: Callback,
    getData: (js.Array[IntegerBitmapLayout], IntegerRectangle2D) => SafeArray[Double],
    getMemoryLayout: CallbackTo[IntegerBitmapLayout],
    getPixel: (js.Array[IntegerBitmapLayout], IntegerPoint2D) => SafeArray[Double],
    getScaledBitmap: (RealSize2D, Boolean) => XBitmap,
    getSize: CallbackTo[IntegerSize2D],
    hasAlpha: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback
  ): XIntegerReadOnlyBitmap = {
    val __obj = js.Dynamic.literal(MemoryLayout = MemoryLayout.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], acquire = acquire.toJsFn, getData = js.Any.fromFunction2(getData), getMemoryLayout = getMemoryLayout.toJsFn, getPixel = js.Any.fromFunction2(getPixel), getScaledBitmap = js.Any.fromFunction2(getScaledBitmap), getSize = getSize.toJsFn, hasAlpha = hasAlpha.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XIntegerReadOnlyBitmap]
  }
  
  extension [Self <: XIntegerReadOnlyBitmap](x: Self) {
    
    inline def setGetData(value: (js.Array[IntegerBitmapLayout], IntegerRectangle2D) => SafeArray[Double]): Self = StObject.set(x, "getData", js.Any.fromFunction2(value))
    
    inline def setGetMemoryLayout(value: CallbackTo[IntegerBitmapLayout]): Self = StObject.set(x, "getMemoryLayout", value.toJsFn)
    
    inline def setGetPixel(value: (js.Array[IntegerBitmapLayout], IntegerPoint2D) => SafeArray[Double]): Self = StObject.set(x, "getPixel", js.Any.fromFunction2(value))
    
    inline def setMemoryLayout(value: IntegerBitmapLayout): Self = StObject.set(x, "MemoryLayout", value.asInstanceOf[js.Any])
  }
}
