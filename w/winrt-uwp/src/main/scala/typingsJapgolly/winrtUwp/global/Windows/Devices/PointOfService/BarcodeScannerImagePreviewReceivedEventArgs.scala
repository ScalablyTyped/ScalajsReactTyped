package typingsJapgolly.winrtUwp.global.Windows.Devices.PointOfService

import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamWithContentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides the data from the ImagePreviewReceived event. */
/* note: abstract class */ @JSGlobal("Windows.Devices.PointOfService.BarcodeScannerImagePreviewReceivedEventArgs")
@js.native
open class BarcodeScannerImagePreviewReceivedEventArgs ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Devices.PointOfService.BarcodeScannerImagePreviewReceivedEventArgs {
  
  /** Gets the BitmapImage from the device representing a preview frame. */
  /* CompleteClass */
  var preview: IRandomAccessStreamWithContentType = js.native
}
