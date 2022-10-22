package typingsJapgolly.winrtUwp.Windows.Graphics.Imaging

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an uncompressed bitmap. */
trait SoftwareBitmap extends StObject {
  
  /** Gets the alpha mode of the software bitmap. */
  var bitmapAlphaMode: BitmapAlphaMode
  
  /** Gets the pixel format of the software bitmap. */
  var bitmapPixelFormat: BitmapPixelFormat
  
  /** Disposes of the object and associated resources. */
  def close(): Unit
  
  /**
    * Copies the pixel data from an IBuffer into the SoftwareBitmap .
    * @param buffer The buffer containing the pixel data to be copied.
    */
  def copyFromBuffer(buffer: IBuffer): Unit
  
  /**
    * Copies the current SoftwareBitmap into the provided SoftwareBitmap object.
    * @param bitmap The target software bitmap into which the data will be copied.
    */
  def copyTo(bitmap: SoftwareBitmap): Unit
  
  /**
    * Copies the software bitmap pixel data into the specified IBuffer .
    * @param buffer The target buffer to which the pixel data will be copied.
    */
  def copyToBuffer(buffer: IBuffer): Unit
  
  /** Gets or sets the dots per inch of the software bitmap in the X direction. */
  var dpiX: Double
  
  /** Gets or sets the dots per inch of the software bitmap in the Y direction. */
  var dpiY: Double
  
  /**
    * Gets a read-only representation of the SoftwareBitmap object.
    * @return A read-only representation of the SoftwareBitmap object.
    */
  def getReadOnlyView(): SoftwareBitmap
  
  /** Gets a value indicating whether the software bitmap can be modified. */
  var isReadOnly: Boolean
  
  /**
    * Gets a BitmapBuffer object that allows you to operate directly on the software bitmap's pixel data.
    * @param mode A value indicating the access mode of the returned buffer.
    * @return The buffer containing pixel data.
    */
  def lockBuffer(mode: BitmapBufferAccessMode): BitmapBuffer
  
  /** Gets the height of the software bitmap, in pixels. */
  var pixelHeight: Double
  
  /** Gets the width of the software bitmap, in pixels. */
  var pixelWidth: Double
}
object SoftwareBitmap {
  
  inline def apply(
    bitmapAlphaMode: BitmapAlphaMode,
    bitmapPixelFormat: BitmapPixelFormat,
    close: Callback,
    copyFromBuffer: IBuffer => Callback,
    copyTo: SoftwareBitmap => Callback,
    copyToBuffer: IBuffer => Callback,
    dpiX: Double,
    dpiY: Double,
    getReadOnlyView: CallbackTo[SoftwareBitmap],
    isReadOnly: Boolean,
    lockBuffer: BitmapBufferAccessMode => BitmapBuffer,
    pixelHeight: Double,
    pixelWidth: Double
  ): SoftwareBitmap = {
    val __obj = js.Dynamic.literal(bitmapAlphaMode = bitmapAlphaMode.asInstanceOf[js.Any], bitmapPixelFormat = bitmapPixelFormat.asInstanceOf[js.Any], close = close.toJsFn, copyFromBuffer = js.Any.fromFunction1((t0: IBuffer) => copyFromBuffer(t0).runNow()), copyTo = js.Any.fromFunction1((t0: SoftwareBitmap) => copyTo(t0).runNow()), copyToBuffer = js.Any.fromFunction1((t0: IBuffer) => copyToBuffer(t0).runNow()), dpiX = dpiX.asInstanceOf[js.Any], dpiY = dpiY.asInstanceOf[js.Any], getReadOnlyView = getReadOnlyView.toJsFn, isReadOnly = isReadOnly.asInstanceOf[js.Any], lockBuffer = js.Any.fromFunction1(lockBuffer), pixelHeight = pixelHeight.asInstanceOf[js.Any], pixelWidth = pixelWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[SoftwareBitmap]
  }
  
  extension [Self <: SoftwareBitmap](x: Self) {
    
    inline def setBitmapAlphaMode(value: BitmapAlphaMode): Self = StObject.set(x, "bitmapAlphaMode", value.asInstanceOf[js.Any])
    
    inline def setBitmapPixelFormat(value: BitmapPixelFormat): Self = StObject.set(x, "bitmapPixelFormat", value.asInstanceOf[js.Any])
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setCopyFromBuffer(value: IBuffer => Callback): Self = StObject.set(x, "copyFromBuffer", js.Any.fromFunction1((t0: IBuffer) => value(t0).runNow()))
    
    inline def setCopyTo(value: SoftwareBitmap => Callback): Self = StObject.set(x, "copyTo", js.Any.fromFunction1((t0: SoftwareBitmap) => value(t0).runNow()))
    
    inline def setCopyToBuffer(value: IBuffer => Callback): Self = StObject.set(x, "copyToBuffer", js.Any.fromFunction1((t0: IBuffer) => value(t0).runNow()))
    
    inline def setDpiX(value: Double): Self = StObject.set(x, "dpiX", value.asInstanceOf[js.Any])
    
    inline def setDpiY(value: Double): Self = StObject.set(x, "dpiY", value.asInstanceOf[js.Any])
    
    inline def setGetReadOnlyView(value: CallbackTo[SoftwareBitmap]): Self = StObject.set(x, "getReadOnlyView", value.toJsFn)
    
    inline def setIsReadOnly(value: Boolean): Self = StObject.set(x, "isReadOnly", value.asInstanceOf[js.Any])
    
    inline def setLockBuffer(value: BitmapBufferAccessMode => BitmapBuffer): Self = StObject.set(x, "lockBuffer", js.Any.fromFunction1(value))
    
    inline def setPixelHeight(value: Double): Self = StObject.set(x, "pixelHeight", value.asInstanceOf[js.Any])
    
    inline def setPixelWidth(value: Double): Self = StObject.set(x, "pixelWidth", value.asInstanceOf[js.Any])
  }
}
