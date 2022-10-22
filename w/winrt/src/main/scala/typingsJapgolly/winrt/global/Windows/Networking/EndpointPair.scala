package typingsJapgolly.winrt.global.Windows.Networking

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Networking.EndpointPair")
@js.native
open class EndpointPair protected ()
  extends StObject
     with typingsJapgolly.winrt.Windows.Networking.EndpointPair {
  def this(
    localHostName: typingsJapgolly.winrt.Windows.Networking.HostName,
    localServiceName: String,
    remoteHostName: typingsJapgolly.winrt.Windows.Networking.HostName,
    remoteServiceName: String
  ) = this()
  
  /* CompleteClass */
  var localHostName: typingsJapgolly.winrt.Windows.Networking.HostName = js.native
  
  /* CompleteClass */
  var localServiceName: String = js.native
  
  /* CompleteClass */
  var remoteHostName: typingsJapgolly.winrt.Windows.Networking.HostName = js.native
  
  /* CompleteClass */
  var remoteServiceName: String = js.native
}
