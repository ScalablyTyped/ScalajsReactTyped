package typingsJapgolly.firebaseFirestore

import typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcCoreDatabaseInfoMod.DatabaseInfo
import typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcRemoteConnectionMod.Connection
import typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcRemoteConnectivityMonitorMod.ConnectivityMonitor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLitePackagesFirestoreSrcPlatformConnectionMod {
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/src/platform/connection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def newConnection(databaseInfo: DatabaseInfo): Connection = ^.asInstanceOf[js.Dynamic].applyDynamic("newConnection")(databaseInfo.asInstanceOf[js.Any]).asInstanceOf[Connection]
  
  inline def newConnectivityMonitor(): ConnectivityMonitor = ^.asInstanceOf[js.Dynamic].applyDynamic("newConnectivityMonitor")().asInstanceOf[ConnectivityMonitor]
}
