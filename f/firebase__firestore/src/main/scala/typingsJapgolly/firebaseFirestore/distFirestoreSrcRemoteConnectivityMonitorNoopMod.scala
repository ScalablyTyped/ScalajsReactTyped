package typingsJapgolly.firebaseFirestore

import typingsJapgolly.firebaseFirestore.distFirestoreSrcRemoteConnectivityMonitorMod.ConnectivityMonitor
import typingsJapgolly.firebaseFirestore.distFirestoreSrcRemoteConnectivityMonitorMod.ConnectivityMonitorCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFirestoreSrcRemoteConnectivityMonitorNoopMod {
  
  @JSImport("@firebase/firestore/dist/firestore/src/remote/connectivity_monitor_noop", "NoopConnectivityMonitor")
  @js.native
  open class NoopConnectivityMonitor ()
    extends StObject
       with ConnectivityMonitor {
    
    /**
      * Adds a callback to be called when connectivity changes.
      *
      * Callbacks are not made on the initial state of connectivity, since this
      * monitor is primarily used for resetting backoff in the remote store when
      * connectivity changes. As such, the initial connectivity state is
      * irrelevant here.
      */
    /* CompleteClass */
    override def addCallback(callback: ConnectivityMonitorCallback): Unit = js.native
    
    /**
      * Stops monitoring connectivity. After this call completes, no further
      * callbacks will be triggered. After shutdown() is called, no further calls
      * are allowed on this instance.
      */
    /* CompleteClass */
    override def shutdown(): Unit = js.native
  }
}
