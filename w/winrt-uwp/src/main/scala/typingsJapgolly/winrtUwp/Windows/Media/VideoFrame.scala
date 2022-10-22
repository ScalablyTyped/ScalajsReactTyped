package typingsJapgolly.winrtUwp.Windows.Media

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IPropertySet
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.Direct3D11.IDirect3DSurface
import typingsJapgolly.winrtUwp.Windows.Graphics.Imaging.SoftwareBitmap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a single frame of video data. */
trait VideoFrame extends StObject {
  
  /** Disposes of the object and associated resources. */
  def close(): Unit
  
  /**
    * Copies the current VideoFrame into a provided VideoFrame object.
    * @param frame The target video frame into which the current frame will be copied.
    * @return An asynchronous action.
    */
  def copyToAsync(frame: VideoFrame): IPromiseWithIAsyncAction
  
  /** Gets the IDirect3DSurface object containing the pixel data of the video frame, when one is present. */
  var direct3DSurface: IDirect3DSurface
  
  /** Gets or sets the duration of the video frame. */
  var duration: Double
  
  /** Gets the extended property set which enables getting and setting properties on the media frame. */
  var extendedProperties: IPropertySet
  
  /** Gets or sets a value that indicates whether an video frame is the first frame after a gap in the stream. */
  var isDiscontinuous: Boolean
  
  /** Gets a value indicating whether the video frame is read-only. */
  var isReadOnly: Boolean
  
  /** Gets or sets the relative time of the frame within the video stream. */
  var relativeTime: Double
  
  /** Gets the SoftwareBitmap object containing the pixel data of the video frame, when one is present. */
  var softwareBitmap: SoftwareBitmap
  
  /** Gets or sets a timestamp that is relative to the system and is correlatable across multiple media sources on the same device. */
  var systemRelativeTime: Double
  
  /** Gets a string indicating the type of video data the video frame contains. */
  var `type`: String
}
object VideoFrame {
  
  inline def apply(
    close: Callback,
    copyToAsync: VideoFrame => IPromiseWithIAsyncAction,
    direct3DSurface: IDirect3DSurface,
    duration: Double,
    extendedProperties: IPropertySet,
    isDiscontinuous: Boolean,
    isReadOnly: Boolean,
    relativeTime: Double,
    softwareBitmap: SoftwareBitmap,
    systemRelativeTime: Double,
    `type`: String
  ): VideoFrame = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, copyToAsync = js.Any.fromFunction1(copyToAsync), direct3DSurface = direct3DSurface.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], extendedProperties = extendedProperties.asInstanceOf[js.Any], isDiscontinuous = isDiscontinuous.asInstanceOf[js.Any], isReadOnly = isReadOnly.asInstanceOf[js.Any], relativeTime = relativeTime.asInstanceOf[js.Any], softwareBitmap = softwareBitmap.asInstanceOf[js.Any], systemRelativeTime = systemRelativeTime.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoFrame]
  }
  
  extension [Self <: VideoFrame](x: Self) {
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setCopyToAsync(value: VideoFrame => IPromiseWithIAsyncAction): Self = StObject.set(x, "copyToAsync", js.Any.fromFunction1(value))
    
    inline def setDirect3DSurface(value: IDirect3DSurface): Self = StObject.set(x, "direct3DSurface", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setExtendedProperties(value: IPropertySet): Self = StObject.set(x, "extendedProperties", value.asInstanceOf[js.Any])
    
    inline def setIsDiscontinuous(value: Boolean): Self = StObject.set(x, "isDiscontinuous", value.asInstanceOf[js.Any])
    
    inline def setIsReadOnly(value: Boolean): Self = StObject.set(x, "isReadOnly", value.asInstanceOf[js.Any])
    
    inline def setRelativeTime(value: Double): Self = StObject.set(x, "relativeTime", value.asInstanceOf[js.Any])
    
    inline def setSoftwareBitmap(value: SoftwareBitmap): Self = StObject.set(x, "softwareBitmap", value.asInstanceOf[js.Any])
    
    inline def setSystemRelativeTime(value: Double): Self = StObject.set(x, "systemRelativeTime", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
