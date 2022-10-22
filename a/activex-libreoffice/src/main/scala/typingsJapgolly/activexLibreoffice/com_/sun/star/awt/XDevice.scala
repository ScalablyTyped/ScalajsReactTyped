package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides information about a graphical output device and offers a factory for the **graphics** which provides write operations on the device. */
trait XDevice
  extends StObject
     with XInterface {
  
  /** returns the list of available font descriptors. */
  val FontDescriptors: SafeArray[FontDescriptor]
  
  /** returns information about the device. */
  val Info: DeviceInfo
  
  /**
    * creates a bitmap with the current device depth.
    *
    * If the specified area does not lie entirely in the device, the bits outside are not specified.
    */
  def createBitmap(nX: Double, nY: Double, nWidth: Double, nHeight: Double): XBitmap
  
  /**
    * creates a new device which is compatible with this one.
    *
    * If the device does not support the GETBITS device capability, this method returns `NULL` .
    */
  def createDevice(nWidth: Double, nHeight: Double): XDevice
  
  /**
    * creates a device compatible bitmap.
    *
    * The data of the bitmap is in process memory instead of in the device, so that the output operation is fast.
    */
  def createDisplayBitmap(Bitmap: XBitmap): XDisplayBitmap
  
  /** creates a new graphics whose output operation is directed to this device. */
  def createGraphics(): XGraphics
  
  /**
    * returns information about a font offered by this device.
    * @param aDescriptor specifies the description of a font. The unit of measure is pixel for this device.
    * @returns the font of this device.
    */
  def getFont(aDescriptor: FontDescriptor): XFont
  
  /** returns the list of available font descriptors. */
  def getFontDescriptors(): SafeArray[FontDescriptor]
  
  /** returns information about the device. */
  def getInfo(): DeviceInfo
}
object XDevice {
  
  inline def apply(
    FontDescriptors: SafeArray[FontDescriptor],
    Info: DeviceInfo,
    acquire: Callback,
    createBitmap: (Double, Double, Double, Double) => XBitmap,
    createDevice: (Double, Double) => XDevice,
    createDisplayBitmap: XBitmap => XDisplayBitmap,
    createGraphics: CallbackTo[XGraphics],
    getFont: FontDescriptor => XFont,
    getFontDescriptors: CallbackTo[SafeArray[FontDescriptor]],
    getInfo: CallbackTo[DeviceInfo],
    queryInterface: `type` => Any,
    release: Callback
  ): XDevice = {
    val __obj = js.Dynamic.literal(FontDescriptors = FontDescriptors.asInstanceOf[js.Any], Info = Info.asInstanceOf[js.Any], acquire = acquire.toJsFn, createBitmap = js.Any.fromFunction4(createBitmap), createDevice = js.Any.fromFunction2(createDevice), createDisplayBitmap = js.Any.fromFunction1(createDisplayBitmap), createGraphics = createGraphics.toJsFn, getFont = js.Any.fromFunction1(getFont), getFontDescriptors = getFontDescriptors.toJsFn, getInfo = getInfo.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XDevice]
  }
  
  extension [Self <: XDevice](x: Self) {
    
    inline def setCreateBitmap(value: (Double, Double, Double, Double) => XBitmap): Self = StObject.set(x, "createBitmap", js.Any.fromFunction4(value))
    
    inline def setCreateDevice(value: (Double, Double) => XDevice): Self = StObject.set(x, "createDevice", js.Any.fromFunction2(value))
    
    inline def setCreateDisplayBitmap(value: XBitmap => XDisplayBitmap): Self = StObject.set(x, "createDisplayBitmap", js.Any.fromFunction1(value))
    
    inline def setCreateGraphics(value: CallbackTo[XGraphics]): Self = StObject.set(x, "createGraphics", value.toJsFn)
    
    inline def setFontDescriptors(value: SafeArray[FontDescriptor]): Self = StObject.set(x, "FontDescriptors", value.asInstanceOf[js.Any])
    
    inline def setGetFont(value: FontDescriptor => XFont): Self = StObject.set(x, "getFont", js.Any.fromFunction1(value))
    
    inline def setGetFontDescriptors(value: CallbackTo[SafeArray[FontDescriptor]]): Self = StObject.set(x, "getFontDescriptors", value.toJsFn)
    
    inline def setGetInfo(value: CallbackTo[DeviceInfo]): Self = StObject.set(x, "getInfo", value.toJsFn)
    
    inline def setInfo(value: DeviceInfo): Self = StObject.set(x, "Info", value.asInstanceOf[js.Any])
  }
}
