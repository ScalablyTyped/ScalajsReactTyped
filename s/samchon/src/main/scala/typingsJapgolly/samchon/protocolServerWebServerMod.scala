package typingsJapgolly.samchon

import typingsJapgolly.samchon.protocolCommunicatorClientDriverWebClientDriverMod.WebClientDriver
import typingsJapgolly.samchon.protocolCommunicatorIclientdriverMod.IClientDriver
import typingsJapgolly.samchon.protocolServerIserverMod.IServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object protocolServerWebServerMod {
  
  /* note: abstract class */ @JSImport("samchon/protocol/server/WebServer", "WebServer")
  @js.native
  /**
    * Default Constructor.
    */
  open class WebServer ()
    extends StObject
       with IServer {
    
    /**
      * @hidden
      */
    /* private */ var _Fetch_session_id: Any = js.native
    
    /**
      * @hidden
      */
    /* private */ var _Handle_request: Any = js.native
    
    /**
      * @hidden
      */
    /* private */ var _Issue_session_id: Any = js.native
    
    /**
      * @inheritdoc
      */
    def addClient(driver: WebClientDriver): Unit = js.native
    /**
      * Add a newly connected remote client.
      *
      * The {@link addClient addClient()} is an abstract method being called when a remote client is newly connected
      * with {@link IClientDriver} object who communicates with the remote system. Overrides this method and defines
      * what to do with the *driver*, a newly connected remote client.
      *
      * Below methods and example codes may be good for comprehending how to utilize this {@link addClient} method.
      *
      * - https://github.com/samchon/framework-examples/blob/master/calculator/calculator-server.ts
      * - https://github.com/samchon/framework-examples/blob/master/chat-server/server.ts
      * - {@link service.Server.addClient}
      * - {@link external.ExternalClientArray.addClient}
      * - {@link slave.SlaveServer.addClient}
      *
      * @param driver A {@link ICommunicator communicator} with (newly connected) remote client.
      */
    /* CompleteClass */
    override def addClient(driver: IClientDriver): Unit = js.native
    
    /**
      * Close server.
      *
      * Close opened server. All remote clients, have connected with this server, are also closed and their call back
      * functions, for closed connection, {@link IClientDriver.onClose} are also called.
      */
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /**
      * @hidden
      */
    /* private */ var http_server_ : Any = js.native
    
    /**
      * @hidden
      */
    /* private */ var my_port_ : Any = js.native
    
    /**
      * Open server.
      *
      * @param port Port number to open.
      */
    /* CompleteClass */
    override def open(port: Double): Unit = js.native
    
    /**
      * @hidden
      */
    /* private */ var sequence_ : Any = js.native
  }
}
