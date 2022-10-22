package typingsJapgolly.azdata.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.vscode.Thenable
import typingsJapgolly.vscode.mod.Disposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object connection {
  
  @JSImport("azdata", "connection")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("azdata", "connection.ConnectionProfile")
  @js.native
  open class ConnectionProfile () extends StObject {
    
    var authenticationType: String = js.native
    
    var azureTenantId: js.UndefOr[String] = js.native
    
    var connectionId: String = js.native
    
    var connectionName: String = js.native
    
    var databaseName: String = js.native
    
    var groupFullName: String = js.native
    
    var groupId: String = js.native
    
    var options: StringDictionary[Any] = js.native
    
    var password: String = js.native
    
    var providerId: String = js.native
    
    var savePassword: Boolean = js.native
    
    var saveProfile: Boolean = js.native
    
    var serverName: String = js.native
    
    var userName: String = js.native
  }
  /* static members */
  object ConnectionProfile {
    
    @JSImport("azdata", "connection.ConnectionProfile")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createFrom(options: StringDictionary[Any]): ConnectionProfile = ^.asInstanceOf[js.Dynamic].applyDynamic("createFrom")(options.asInstanceOf[js.Any]).asInstanceOf[ConnectionProfile]
  }
  
  inline def connect(connectionProfile: IConnectionProfile): Thenable[ConnectionResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(connectionProfile.asInstanceOf[js.Any]).asInstanceOf[Thenable[ConnectionResult]]
  inline def connect(connectionProfile: IConnectionProfile, saveConnection: Boolean): Thenable[ConnectionResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(connectionProfile.asInstanceOf[js.Any], saveConnection.asInstanceOf[js.Any])).asInstanceOf[Thenable[ConnectionResult]]
  inline def connect(connectionProfile: IConnectionProfile, saveConnection: Boolean, showDashboard: Boolean): Thenable[ConnectionResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(connectionProfile.asInstanceOf[js.Any], saveConnection.asInstanceOf[js.Any], showDashboard.asInstanceOf[js.Any])).asInstanceOf[Thenable[ConnectionResult]]
  inline def connect(connectionProfile: IConnectionProfile, saveConnection: Unit, showDashboard: Boolean): Thenable[ConnectionResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(connectionProfile.asInstanceOf[js.Any], saveConnection.asInstanceOf[js.Any], showDashboard.asInstanceOf[js.Any])).asInstanceOf[Thenable[ConnectionResult]]
  
  inline def getActiveConnections(): Thenable[js.Array[Connection]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getActiveConnections")().asInstanceOf[Thenable[js.Array[Connection]]]
  
  inline def getConnection(ownerUri: String): Thenable[ConnectionProfile] = ^.asInstanceOf[js.Dynamic].applyDynamic("getConnection")(ownerUri.asInstanceOf[js.Any]).asInstanceOf[Thenable[ConnectionProfile]]
  
  inline def getConnectionString(connectionId: String, includePassword: Boolean): Thenable[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getConnectionString")(connectionId.asInstanceOf[js.Any], includePassword.asInstanceOf[js.Any])).asInstanceOf[Thenable[String]]
  
  inline def getConnections(): Thenable[js.Array[ConnectionProfile]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getConnections")().asInstanceOf[Thenable[js.Array[ConnectionProfile]]]
  inline def getConnections(activeConnectionsOnly: Boolean): Thenable[js.Array[ConnectionProfile]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getConnections")(activeConnectionsOnly.asInstanceOf[js.Any]).asInstanceOf[Thenable[js.Array[ConnectionProfile]]]
  
  inline def getCredentials(connectionId: String): Thenable[StringDictionary[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCredentials")(connectionId.asInstanceOf[js.Any]).asInstanceOf[Thenable[StringDictionary[String]]]
  
  inline def getCurrentConnection(): Thenable[ConnectionProfile] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentConnection")().asInstanceOf[Thenable[ConnectionProfile]]
  
  inline def getServerInfo(connectionId: String): Thenable[ServerInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("getServerInfo")(connectionId.asInstanceOf[js.Any]).asInstanceOf[Thenable[ServerInfo]]
  
  inline def getUriForConnection(connectionId: String): Thenable[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUriForConnection")(connectionId.asInstanceOf[js.Any]).asInstanceOf[Thenable[String]]
  
  inline def listDatabases(connectionId: String): Thenable[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listDatabases")(connectionId.asInstanceOf[js.Any]).asInstanceOf[Thenable[js.Array[String]]]
  
  inline def openConnectionDialog(): Thenable[Connection] = ^.asInstanceOf[js.Dynamic].applyDynamic("openConnectionDialog")().asInstanceOf[Thenable[Connection]]
  inline def openConnectionDialog(providers: js.Array[String]): Thenable[Connection] = ^.asInstanceOf[js.Dynamic].applyDynamic("openConnectionDialog")(providers.asInstanceOf[js.Any]).asInstanceOf[Thenable[Connection]]
  inline def openConnectionDialog(
    providers: js.Array[String],
    initialConnectionProfile: Unit,
    connectionCompletionOptions: IConnectionCompletionOptions
  ): Thenable[Connection] = (^.asInstanceOf[js.Dynamic].applyDynamic("openConnectionDialog")(providers.asInstanceOf[js.Any], initialConnectionProfile.asInstanceOf[js.Any], connectionCompletionOptions.asInstanceOf[js.Any])).asInstanceOf[Thenable[Connection]]
  inline def openConnectionDialog(providers: js.Array[String], initialConnectionProfile: IConnectionProfile): Thenable[Connection] = (^.asInstanceOf[js.Dynamic].applyDynamic("openConnectionDialog")(providers.asInstanceOf[js.Any], initialConnectionProfile.asInstanceOf[js.Any])).asInstanceOf[Thenable[Connection]]
  inline def openConnectionDialog(
    providers: js.Array[String],
    initialConnectionProfile: IConnectionProfile,
    connectionCompletionOptions: IConnectionCompletionOptions
  ): Thenable[Connection] = (^.asInstanceOf[js.Dynamic].applyDynamic("openConnectionDialog")(providers.asInstanceOf[js.Any], initialConnectionProfile.asInstanceOf[js.Any], connectionCompletionOptions.asInstanceOf[js.Any])).asInstanceOf[Thenable[Connection]]
  inline def openConnectionDialog(
    providers: Unit,
    initialConnectionProfile: Unit,
    connectionCompletionOptions: IConnectionCompletionOptions
  ): Thenable[Connection] = (^.asInstanceOf[js.Dynamic].applyDynamic("openConnectionDialog")(providers.asInstanceOf[js.Any], initialConnectionProfile.asInstanceOf[js.Any], connectionCompletionOptions.asInstanceOf[js.Any])).asInstanceOf[Thenable[Connection]]
  inline def openConnectionDialog(providers: Unit, initialConnectionProfile: IConnectionProfile): Thenable[Connection] = (^.asInstanceOf[js.Dynamic].applyDynamic("openConnectionDialog")(providers.asInstanceOf[js.Any], initialConnectionProfile.asInstanceOf[js.Any])).asInstanceOf[Thenable[Connection]]
  inline def openConnectionDialog(
    providers: Unit,
    initialConnectionProfile: IConnectionProfile,
    connectionCompletionOptions: IConnectionCompletionOptions
  ): Thenable[Connection] = (^.asInstanceOf[js.Dynamic].applyDynamic("openConnectionDialog")(providers.asInstanceOf[js.Any], initialConnectionProfile.asInstanceOf[js.Any], connectionCompletionOptions.asInstanceOf[js.Any])).asInstanceOf[Thenable[Connection]]
  
  inline def registerConnectionEventListener(listener: ConnectionEventListener): Disposable = ^.asInstanceOf[js.Dynamic].applyDynamic("registerConnectionEventListener")(listener.asInstanceOf[js.Any]).asInstanceOf[Disposable]
  
  trait Connection
    extends StObject
       with ConnectionInfo {
    
    /**
      * A unique identifier for the connection
      */
    var connectionId: String
    
    /**
      * The name of the provider managing the connection (e.g. MSSQL)
      */
    var providerName: String
  }
  object Connection {
    
    inline def apply(connectionId: String, options: StringDictionary[Any], providerName: String): Connection = {
      val __obj = js.Dynamic.literal(connectionId = connectionId.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], providerName = providerName.asInstanceOf[js.Any])
      __obj.asInstanceOf[Connection]
    }
    
    extension [Self <: Connection](x: Self) {
      
      inline def setConnectionId(value: String): Self = StObject.set(x, "connectionId", value.asInstanceOf[js.Any])
      
      inline def setProviderName(value: String): Self = StObject.set(x, "providerName", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConnectionEventListener extends StObject {
    
    /**
      * Connection event handler
      * @param type Connection event type
      * @param ownerUri Connection's owner uri
      * @param args Connection profile
      */
    def onConnectionEvent(`type`: ConnectionEventType, ownerUri: String, args: IConnectionProfile): Unit
  }
  object ConnectionEventListener {
    
    inline def apply(onConnectionEvent: (ConnectionEventType, String, IConnectionProfile) => Callback): ConnectionEventListener = {
      val __obj = js.Dynamic.literal(onConnectionEvent = js.Any.fromFunction3((t0: ConnectionEventType, t1: String, t2: IConnectionProfile) => (onConnectionEvent(t0, t1, t2)).runNow()))
      __obj.asInstanceOf[ConnectionEventListener]
    }
    
    extension [Self <: ConnectionEventListener](x: Self) {
      
      inline def setOnConnectionEvent(value: (ConnectionEventType, String, IConnectionProfile) => Callback): Self = StObject.set(x, "onConnectionEvent", js.Any.fromFunction3((t0: ConnectionEventType, t1: String, t2: IConnectionProfile) => (value(t0, t1, t2)).runNow()))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.azdata.azdataStrings.onConnect
    - typingsJapgolly.azdata.azdataStrings.onDisconnect
    - typingsJapgolly.azdata.azdataStrings.onConnectionChanged
  */
  trait ConnectionEventType extends StObject
  object ConnectionEventType {
    
    inline def onConnect: typingsJapgolly.azdata.azdataStrings.onConnect = "onConnect".asInstanceOf[typingsJapgolly.azdata.azdataStrings.onConnect]
    
    inline def onConnectionChanged: typingsJapgolly.azdata.azdataStrings.onConnectionChanged = "onConnectionChanged".asInstanceOf[typingsJapgolly.azdata.azdataStrings.onConnectionChanged]
    
    inline def onDisconnect: typingsJapgolly.azdata.azdataStrings.onDisconnect = "onDisconnect".asInstanceOf[typingsJapgolly.azdata.azdataStrings.onDisconnect]
  }
}
