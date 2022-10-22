package typingsJapgolly.activexLibreoffice.com_.sun.star.ui.dialogs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.Color
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** {@link FilePicker} that support the preview of various file formats should implement this interface. */
trait XFilePreview
  extends StObject
     with XInterface {
  
  /**
    * The method returns the available height of the preview window even if the window is invisible or could not be created. If a service implementation
    * doesn't support a file preview 0 will be returned.
    * @returns The height of the preview window in pixel.
    */
  val AvailableHeight: Double
  
  /**
    * The method returns the available width of the preview window even if the window is invisible or could not be created. If a service implementation
    * doesn't support a file preview 0 will be returned.
    * @returns The width of the preview window in pixel.
    */
  val AvailableWidth: Double
  
  /**
    * Returns the current show state of the preview.
    * @returns A value of `TRUE` if the preview window is visible. A value of `FALSE` if the preview window is invisible.
    */
  var ShowState: Boolean
  
  /**
    * The method returns all image formats that the preview supports.
    * @returns A sequence of all supported preview formats
    * @see com.sun.star.ui.dialogs.FilePreviewImageFormats
    */
  val SupportedImageFormats: SafeArray[Double]
  
  /**
    * The method returns the supported color depth of the target device.
    * @returns The color depth in bit, e.g. 8 bit, 16 bit, 32 bit.
    */
  val TargetColorDepth: Color
  
  /**
    * The method returns the available height of the preview window even if the window is invisible or could not be created. If a service implementation
    * doesn't support a file preview 0 will be returned.
    * @returns The height of the preview window in pixel.
    */
  def getAvailableHeight(): Double
  
  /**
    * The method returns the available width of the preview window even if the window is invisible or could not be created. If a service implementation
    * doesn't support a file preview 0 will be returned.
    * @returns The width of the preview window in pixel.
    */
  def getAvailableWidth(): Double
  
  /**
    * Returns the current show state of the preview.
    * @returns A value of `TRUE` if the preview window is visible. A value of `FALSE` if the preview window is invisible.
    */
  def getShowState(): Boolean
  
  /**
    * The method returns all image formats that the preview supports.
    * @returns A sequence of all supported preview formats
    * @see com.sun.star.ui.dialogs.FilePreviewImageFormats
    */
  def getSupportedImageFormats(): SafeArray[Double]
  
  /**
    * The method returns the supported color depth of the target device.
    * @returns The color depth in bit, e.g. 8 bit, 16 bit, 32 bit.
    */
  def getTargetColorDepth(): Color
  
  /**
    * Sets a new image. If the preview is currently hidden the image will be ignored. An empty any will clear the preview window.
    * @param aImageFormat Specifies the format of the data that will be delivered
    * @param aImage The image data, the image format defines how the image data have to be delivered
    * @see com.sun.star.ui.dialogs.FilePreviewImageFormats
    * @throws com::sun::star::lang::IllegalArgumentException If the specified image format is invalid or not supported by the preview implementation
    */
  def setImage(aImageFormat: Double, aImage: Any): Unit
  
  /**
    * Optionally sets the current show state of the preview. It is possible that the preview implementation doesn't support hiding the preview.
    * @param bShowState A value of `TRUE` shows the preview window. A value of `FALSE` hides the preview window.
    * @returns A value of `TRUE` on success. A value of `FALSE` if the operation fails for any reason or the preview implementation doesn't support hiding the p
    */
  def setShowState(bShowState: Boolean): Boolean
}
object XFilePreview {
  
  inline def apply(
    AvailableHeight: Double,
    AvailableWidth: Double,
    ShowState: Boolean,
    SupportedImageFormats: SafeArray[Double],
    TargetColorDepth: Color,
    acquire: Callback,
    getAvailableHeight: CallbackTo[Double],
    getAvailableWidth: CallbackTo[Double],
    getShowState: CallbackTo[Boolean],
    getSupportedImageFormats: CallbackTo[SafeArray[Double]],
    getTargetColorDepth: CallbackTo[Color],
    queryInterface: `type` => Any,
    release: Callback,
    setImage: (Double, Any) => Callback,
    setShowState: Boolean => Boolean
  ): XFilePreview = {
    val __obj = js.Dynamic.literal(AvailableHeight = AvailableHeight.asInstanceOf[js.Any], AvailableWidth = AvailableWidth.asInstanceOf[js.Any], ShowState = ShowState.asInstanceOf[js.Any], SupportedImageFormats = SupportedImageFormats.asInstanceOf[js.Any], TargetColorDepth = TargetColorDepth.asInstanceOf[js.Any], acquire = acquire.toJsFn, getAvailableHeight = getAvailableHeight.toJsFn, getAvailableWidth = getAvailableWidth.toJsFn, getShowState = getShowState.toJsFn, getSupportedImageFormats = getSupportedImageFormats.toJsFn, getTargetColorDepth = getTargetColorDepth.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setImage = js.Any.fromFunction2((t0: Double, t1: Any) => (setImage(t0, t1)).runNow()), setShowState = js.Any.fromFunction1(setShowState))
    __obj.asInstanceOf[XFilePreview]
  }
  
  extension [Self <: XFilePreview](x: Self) {
    
    inline def setAvailableHeight(value: Double): Self = StObject.set(x, "AvailableHeight", value.asInstanceOf[js.Any])
    
    inline def setAvailableWidth(value: Double): Self = StObject.set(x, "AvailableWidth", value.asInstanceOf[js.Any])
    
    inline def setGetAvailableHeight(value: CallbackTo[Double]): Self = StObject.set(x, "getAvailableHeight", value.toJsFn)
    
    inline def setGetAvailableWidth(value: CallbackTo[Double]): Self = StObject.set(x, "getAvailableWidth", value.toJsFn)
    
    inline def setGetShowState(value: CallbackTo[Boolean]): Self = StObject.set(x, "getShowState", value.toJsFn)
    
    inline def setGetSupportedImageFormats(value: CallbackTo[SafeArray[Double]]): Self = StObject.set(x, "getSupportedImageFormats", value.toJsFn)
    
    inline def setGetTargetColorDepth(value: CallbackTo[Color]): Self = StObject.set(x, "getTargetColorDepth", value.toJsFn)
    
    inline def setSetImage(value: (Double, Any) => Callback): Self = StObject.set(x, "setImage", js.Any.fromFunction2((t0: Double, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setSetShowState(value: Boolean => Boolean): Self = StObject.set(x, "setShowState", js.Any.fromFunction1(value))
    
    inline def setShowState(value: Boolean): Self = StObject.set(x, "ShowState", value.asInstanceOf[js.Any])
    
    inline def setSupportedImageFormats(value: SafeArray[Double]): Self = StObject.set(x, "SupportedImageFormats", value.asInstanceOf[js.Any])
    
    inline def setTargetColorDepth(value: Color): Self = StObject.set(x, "TargetColorDepth", value.asInstanceOf[js.Any])
  }
}
