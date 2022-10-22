package typingsJapgolly.winrtUwp.global.Windows.Media.Protection

import typingsJapgolly.winrtUwp.Windows.Media.Playback.MediaPlaybackItem
import typingsJapgolly.winrtUwp.Windows.Media.Protection.IMediaProtectionServiceRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains event data for a MediaProtectionManager object when a service is requested. */
/* note: abstract class */ @JSGlobal("Windows.Media.Protection.ServiceRequestedEventArgs")
@js.native
open class ServiceRequestedEventArgs ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Media.Protection.ServiceRequestedEventArgs {
  
  /** Returns an indication of the completion of the service request. */
  /* CompleteClass */
  var completion: typingsJapgolly.winrtUwp.Windows.Media.Protection.MediaProtectionServiceCompletion = js.native
  
  /** Gets the MediaPlaybackItem associated with the service request. */
  /* CompleteClass */
  var mediaPlaybackItem: MediaPlaybackItem = js.native
  
  /** Contains the service request. */
  /* CompleteClass */
  var request: IMediaProtectionServiceRequest = js.native
}
