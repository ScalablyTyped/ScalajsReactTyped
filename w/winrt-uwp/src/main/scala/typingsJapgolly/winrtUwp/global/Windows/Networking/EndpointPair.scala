package typingsJapgolly.winrtUwp.global.Windows.Networking

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the local endpoint and remote endpoint for a network connection used by network apps. */
@JSGlobal("Windows.Networking.EndpointPair")
@js.native
open class EndpointPair protected ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Networking.EndpointPair {
  /**
    * Creates a new EndpointPair object.
    * @param localHostName The local hostname or IP address for the EndpointPair object.
    * @param localServiceName The local service name or the local TCP or UDP port number for the EndpointPair object.
    * @param remoteHostName The remote hostname or IP address for the EndpointPair object.
    * @param remoteServiceName The remote service name or the remote TCP or UDP port number for the EndpointPair object.
    */
  def this(
    localHostName: typingsJapgolly.winrtUwp.Windows.Networking.HostName,
    localServiceName: String,
    remoteHostName: typingsJapgolly.winrtUwp.Windows.Networking.HostName,
    remoteServiceName: String
  ) = this()
  
  /** Get or set the local hostname for the EndpointPair object. */
  /* CompleteClass */
  var localHostName: typingsJapgolly.winrtUwp.Windows.Networking.HostName = js.native
  
  /** Get or set the local service name for the EndpointPair object. */
  /* CompleteClass */
  var localServiceName: String = js.native
  
  /** Get or set the remote hostname for the EndpointPair object. */
  /* CompleteClass */
  var remoteHostName: typingsJapgolly.winrtUwp.Windows.Networking.HostName = js.native
  
  /** Get or set the remote service name for the EndpointPair object. */
  /* CompleteClass */
  var remoteServiceName: String = js.native
}
