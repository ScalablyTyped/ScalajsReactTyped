package typingsJapgolly.activexLibreoffice.com_.sun.star.rendering

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.geometry.IntegerPoint2D
import typingsJapgolly.activexLibreoffice.com_.sun.star.geometry.IntegerRectangle2D
import typingsJapgolly.activexLibreoffice.com_.sun.star.geometry.IntegerSize2D
import typingsJapgolly.activexLibreoffice.com_.sun.star.geometry.RealSize2D
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This is a specialized interface for bitmaps containing IEEE doubles for their color components. */
trait XIeeeDoubleBitmap
  extends StObject
     with XIeeeDoubleReadOnlyBitmap {
  
  /**
    * Set raw data of a bitmap.
    *
    * Set raw data of a bitmap, in the format as defined by {@link getMemoryLayout()} . With the given rectangle, a subset of the bitmap can be changed.
    * When setting subsets of the bitmap, the same scanline padding takes place as when the whole bitmap is changed.
    *
    * When setting data on volatile bitmaps, always call isValid() before, and retrieve a new memory layout via {@link getMemoryLayout()} . At least under
    * Windows, the memory layout can change for the same bitmap, if the user e.g. switches the screen resolution. Thus, this method will throw an
    * IllegalArgumentException, if the memory layout changed between a call to {@link getMemoryLayout()} and {@link setData()} .
    * @param data Data to set
    * @param bitmapLayout Layout of the data to set. Must match this bitmap's current layout.
    * @param rect Destination rectangle, within the bounds of the bitmap, to set the data in.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if parts of the given rectangle are outside the permissible bitmap area.
    * @throws com::sun::star::lang::IllegalArgumentException if the given memory layout does not match this bitmap's layout, or if the given data sequence has
    */
  def setData(data: SeqEquiv[Double], bitmapLayout: FloatingPointBitmapLayout, rect: IntegerRectangle2D): Unit
  
  /**
    * Set a single pixel of the bitmap with the given color value.
    *
    * When setting data on volatile bitmaps, always call isValid() before, and retrieve a new memory layout via {@link getMemoryLayout()} . At least under
    * Windows, the memory layout can change for the same bitmap, if the user e.g. switches the screen resolution. Thus, this method will throw an
    * IllegalArgumentException, if the memory layout changed between a call to {@link getMemoryLayout()} and {@link setPixel()} .
    * @param color The color value(s) to set
    * @param bitmapLayout Layout of the color elements to set. Must match this bitmap's current layout.
    * @param pos Pixel position with the bounds of the bitmap to set.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the given point is outside the permissible bitmap area.
    * @throws com::sun::star::lang::IllegalArgumentException if the given memory layout does not match this bitmap's layout, or if the given data sequence has
    */
  def setPixel(color: SeqEquiv[Double], bitmapLayout: FloatingPointBitmapLayout, pos: IntegerPoint2D): Unit
}
object XIeeeDoubleBitmap {
  
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
    release: Callback,
    setData: (SeqEquiv[Double], FloatingPointBitmapLayout, IntegerRectangle2D) => Callback,
    setPixel: (SeqEquiv[Double], FloatingPointBitmapLayout, IntegerPoint2D) => Callback
  ): XIeeeDoubleBitmap = {
    val __obj = js.Dynamic.literal(MemoryLayout = MemoryLayout.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], acquire = acquire.toJsFn, getData = js.Any.fromFunction2(getData), getMemoryLayout = getMemoryLayout.toJsFn, getPixel = js.Any.fromFunction2(getPixel), getScaledBitmap = js.Any.fromFunction2(getScaledBitmap), getSize = getSize.toJsFn, hasAlpha = hasAlpha.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setData = js.Any.fromFunction3((t0: SeqEquiv[Double], t1: FloatingPointBitmapLayout, t2: IntegerRectangle2D) => (setData(t0, t1, t2)).runNow()), setPixel = js.Any.fromFunction3((t0: SeqEquiv[Double], t1: FloatingPointBitmapLayout, t2: IntegerPoint2D) => (setPixel(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[XIeeeDoubleBitmap]
  }
  
  extension [Self <: XIeeeDoubleBitmap](x: Self) {
    
    inline def setSetData(value: (SeqEquiv[Double], FloatingPointBitmapLayout, IntegerRectangle2D) => Callback): Self = StObject.set(x, "setData", js.Any.fromFunction3((t0: SeqEquiv[Double], t1: FloatingPointBitmapLayout, t2: IntegerRectangle2D) => (value(t0, t1, t2)).runNow()))
    
    inline def setSetPixel(value: (SeqEquiv[Double], FloatingPointBitmapLayout, IntegerPoint2D) => Callback): Self = StObject.set(x, "setPixel", js.Any.fromFunction3((t0: SeqEquiv[Double], t1: FloatingPointBitmapLayout, t2: IntegerPoint2D) => (value(t0, t1, t2)).runNow()))
  }
}
