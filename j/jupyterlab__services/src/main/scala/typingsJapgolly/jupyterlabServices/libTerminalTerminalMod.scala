package typingsJapgolly.jupyterlabServices

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jupyterlabServices.anon.OmitIOptionsserverSettingModel
import typingsJapgolly.jupyterlabServices.libServerconnectionMod.ServerConnection.ISettings
import typingsJapgolly.jupyterlabServices.libTerminalRestapiMod.IModel
import typingsJapgolly.jupyterlabServices.libTerminalTerminalMod.ITerminal.IOptions
import typingsJapgolly.luminoAlgorithm.typesIterMod.IIterator
import typingsJapgolly.luminoCoreutils.typesJsonMod.JSONPrimitive
import typingsJapgolly.luminoDisposable.mod.IObservableDisposable
import typingsJapgolly.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTerminalTerminalMod {
  
  @JSImport("@jupyterlab/services/lib/terminal/terminal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isAvailable(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAvailable")().asInstanceOf[Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.connected
    - typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.connecting
    - typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.disconnected
  */
  trait ConnectionStatus extends StObject
  object ConnectionStatus {
    
    inline def connected: typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.connected = "connected".asInstanceOf[typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.connected]
    
    inline def connecting: typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.connecting = "connecting".asInstanceOf[typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.connecting]
    
    inline def disconnected: typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.disconnected = "disconnected".asInstanceOf[typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.disconnected]
  }
  
  @js.native
  trait IManager
    extends StObject
       with typingsJapgolly.jupyterlabServices.libBasemanagerMod.IManager {
    
    def connectTo(options: OmitIOptionsserverSettingModel): ITerminalConnection = js.native
    
    /**
      * Whether the terminal service is available.
      */
    def isAvailable(): Boolean = js.native
    
    /**
      * Force a refresh of the running terminal sessions.
      *
      * @returns A promise that with the list of running sessions.
      *
      * #### Notes
      * This is not typically meant to be called by the user, since the
      * manager maintains its own internal state.
      */
    def refreshRunning(): js.Promise[Unit] = js.native
    
    /**
      * Create an iterator over the known running terminals.
      *
      * @returns A new iterator over the running terminals.
      */
    def running(): IIterator[IModel] = js.native
    
    /**
      * A signal emitted when the running terminals change.
      */
    var runningChanged: ISignal[IManager, js.Array[IModel]] = js.native
    
    /**
      * Shut down a terminal session by name.
      *
      * @param name - The name of the terminal session.
      *
      * @returns A promise that resolves when the session is shut down.
      */
    def shutdown(name: String): js.Promise[Unit] = js.native
    
    /**
      * Shut down all terminal sessions.
      *
      * @returns A promise that resolves when all of the sessions are shut down.
      */
    def shutdownAll(): js.Promise[Unit] = js.native
    
    /**
      * Create a new terminal session.
      *
      * @param options - The options used to create the terminal.
      *
      * @returns A promise that resolves with the terminal connection instance.
      *
      * #### Notes
      * The manager `serverSettings` will be always be used.
      */
    def startNew(): js.Promise[ITerminalConnection] = js.native
    def startNew(options: IOptions): js.Promise[ITerminalConnection] = js.native
  }
  
  trait IMessage extends StObject {
    
    /**
      * The content of the message.
      */
    val content: js.UndefOr[js.Array[JSONPrimitive]] = js.undefined
    
    /**
      * The type of the message.
      */
    val `type`: MessageType
  }
  object IMessage {
    
    inline def apply(`type`: MessageType): IMessage = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMessage]
    }
    
    extension [Self <: IMessage](x: Self) {
      
      inline def setContent(value: js.Array[JSONPrimitive]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: JSONPrimitive*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setType(value: MessageType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  object ITerminal {
    
    trait IOptions extends StObject {
      
      /**
        *  The terminal current directory.
        */
      var cwd: js.UndefOr[String] = js.undefined
      
      /**
        * The terminal name.
        */
      var name: js.UndefOr[String] = js.undefined
    }
    object IOptions {
      
      inline def apply(): IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
        
        inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      }
    }
  }
  
  trait ITerminalConnection
    extends StObject
       with IObservableDisposable {
    
    /**
      * The current connection status of the terminal.
      */
    val connectionStatus: ConnectionStatus
    
    /**
      * A signal emitted when the terminal connection status changes.
      */
    var connectionStatusChanged: ISignal[this.type, ConnectionStatus]
    
    /**
      * A signal emitted when a message is received from the server.
      */
    var messageReceived: ISignal[ITerminalConnection, IMessage]
    
    /**
      * The model associated with the session.
      */
    val model: IModel
    
    /**
      * Get the name of the terminal session.
      */
    val name: String
    
    /**
      * Reconnect to the terminal.
      *
      * @returns A promise that resolves when the terminal has reconnected.
      */
    def reconnect(): js.Promise[Unit]
    
    /**
      * Send a message to the terminal session.
      */
    def send(message: IMessage): Unit
    
    /**
      * The server settings for the session.
      */
    val serverSettings: ISettings
    
    /**
      * Shut down the terminal session.
      */
    def shutdown(): js.Promise[Unit]
  }
  object ITerminalConnection {
    
    inline def apply(
      connectionStatus: ConnectionStatus,
      connectionStatusChanged: ISignal[ITerminalConnection, ConnectionStatus],
      dispose: Callback,
      disposed: ISignal[ITerminalConnection, Unit],
      isDisposed: Boolean,
      messageReceived: ISignal[ITerminalConnection, IMessage],
      model: IModel,
      name: String,
      reconnect: CallbackTo[js.Promise[Unit]],
      send: IMessage => Callback,
      serverSettings: ISettings,
      shutdown: CallbackTo[js.Promise[Unit]]
    ): ITerminalConnection = {
      val __obj = js.Dynamic.literal(connectionStatus = connectionStatus.asInstanceOf[js.Any], connectionStatusChanged = connectionStatusChanged.asInstanceOf[js.Any], dispose = dispose.toJsFn, disposed = disposed.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any], messageReceived = messageReceived.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], reconnect = reconnect.toJsFn, send = js.Any.fromFunction1((t0: IMessage) => send(t0).runNow()), serverSettings = serverSettings.asInstanceOf[js.Any], shutdown = shutdown.toJsFn)
      __obj.asInstanceOf[ITerminalConnection]
    }
    
    trait IOptions extends StObject {
      
      /**
        * Terminal model.
        */
      var model: IModel
      
      /**
        * The server settings.
        */
      var serverSettings: js.UndefOr[ISettings] = js.undefined
    }
    object IOptions {
      
      inline def apply(model: IModel): typingsJapgolly.jupyterlabServices.libTerminalTerminalMod.ITerminalConnection.IOptions = {
        val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.jupyterlabServices.libTerminalTerminalMod.ITerminalConnection.IOptions]
      }
      
      extension [Self <: typingsJapgolly.jupyterlabServices.libTerminalTerminalMod.ITerminalConnection.IOptions](x: Self) {
        
        inline def setModel(value: IModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
        
        inline def setServerSettings(value: ISettings): Self = StObject.set(x, "serverSettings", value.asInstanceOf[js.Any])
        
        inline def setServerSettingsUndefined: Self = StObject.set(x, "serverSettings", js.undefined)
      }
    }
    
    extension [Self <: ITerminalConnection](x: Self) {
      
      inline def setConnectionStatus(value: ConnectionStatus): Self = StObject.set(x, "connectionStatus", value.asInstanceOf[js.Any])
      
      inline def setConnectionStatusChanged(value: ISignal[ITerminalConnection, ConnectionStatus]): Self = StObject.set(x, "connectionStatusChanged", value.asInstanceOf[js.Any])
      
      inline def setMessageReceived(value: ISignal[ITerminalConnection, IMessage]): Self = StObject.set(x, "messageReceived", value.asInstanceOf[js.Any])
      
      inline def setModel(value: IModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setReconnect(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "reconnect", value.toJsFn)
      
      inline def setSend(value: IMessage => Callback): Self = StObject.set(x, "send", js.Any.fromFunction1((t0: IMessage) => value(t0).runNow()))
      
      inline def setServerSettings(value: ISettings): Self = StObject.set(x, "serverSettings", value.asInstanceOf[js.Any])
      
      inline def setShutdown(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "shutdown", value.toJsFn)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.stdout
    - typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.disconnect
    - typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.set_size
    - typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.stdin
  */
  trait MessageType extends StObject
  object MessageType {
    
    inline def disconnect: typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.disconnect = "disconnect".asInstanceOf[typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.disconnect]
    
    inline def set_size: typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.set_size = "set_size".asInstanceOf[typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.set_size]
    
    inline def stdin: typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.stdin = "stdin".asInstanceOf[typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.stdin]
    
    inline def stdout: typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.stdout = "stdout".asInstanceOf[typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.stdout]
  }
}
