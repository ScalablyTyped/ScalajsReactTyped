package typingsJapgolly.winrt.Windows.Media.Protection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Media.Protection.ServiceRequestedEventArgs")
@js.native
class ServiceRequestedEventArgs () extends IServiceRequestedEventArgs {
  /* CompleteClass */
  override var completion: MediaProtectionServiceCompletion = js.native
  /* CompleteClass */
  override var request: IMediaProtectionServiceRequest = js.native
}

