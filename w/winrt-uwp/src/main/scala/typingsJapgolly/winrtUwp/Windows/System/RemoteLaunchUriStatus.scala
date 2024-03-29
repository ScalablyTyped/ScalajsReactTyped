package typingsJapgolly.winrtUwp.Windows.System

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RemoteLaunchUriStatus extends StObject
/** Specifies the result of activating an application for a URI on a remote device. */
@JSGlobal("Windows.System.RemoteLaunchUriStatus")
@js.native
object RemoteLaunchUriStatus extends StObject {
  
  /** The app is not installed on the remote system */
  @js.native
  sealed trait appUnavailable
    extends StObject
       with RemoteLaunchUriStatus
  
  /** The user is not authorized to launch an app on the remote system. */
  @js.native
  sealed trait deniedByLocalSystem
    extends StObject
       with RemoteLaunchUriStatus
  
  /** The user is not signed in on the target device or may be blocked by group policy. */
  @js.native
  sealed trait deniedByRemoteSystem
    extends StObject
       with RemoteLaunchUriStatus
  
  /** The application you are trying to activate on the remote system does not support this URI. */
  @js.native
  sealed trait protocolUnavailable
    extends StObject
       with RemoteLaunchUriStatus
  
  /** The remote system could not be reached. */
  @js.native
  sealed trait remoteSystemUnavailable
    extends StObject
       with RemoteLaunchUriStatus
  
  /** The URI was successfully launched on the remote system. */
  @js.native
  sealed trait success
    extends StObject
       with RemoteLaunchUriStatus
  
  /** The URI could not be successfully launched on the remote system. */
  @js.native
  sealed trait unknown
    extends StObject
       with RemoteLaunchUriStatus
  
  /** The amount of data you tried to send to the remote system exceeded the limit. */
  @js.native
  sealed trait valueSetTooLarge
    extends StObject
       with RemoteLaunchUriStatus
}
