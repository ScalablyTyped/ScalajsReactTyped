package typingsJapgolly.winrtUwp.Windows.Devices.PointOfService

import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamWithContentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides the data from the ImagePreviewReceived event. */
trait BarcodeScannerImagePreviewReceivedEventArgs extends StObject {
  
  /** Gets the BitmapImage from the device representing a preview frame. */
  var preview: IRandomAccessStreamWithContentType
}
object BarcodeScannerImagePreviewReceivedEventArgs {
  
  inline def apply(preview: IRandomAccessStreamWithContentType): BarcodeScannerImagePreviewReceivedEventArgs = {
    val __obj = js.Dynamic.literal(preview = preview.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarcodeScannerImagePreviewReceivedEventArgs]
  }
  
  extension [Self <: BarcodeScannerImagePreviewReceivedEventArgs](x: Self) {
    
    inline def setPreview(value: IRandomAccessStreamWithContentType): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
  }
}
