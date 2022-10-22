package typingsJapgolly.samchon

import japgolly.scalajs.react.Callback
import typingsJapgolly.samchon.protocolCommunicatorIclientdriverMod.IClientDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object protocolServerIserverMod {
  
  trait IServer extends StObject {
    
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
    def addClient(driver: IClientDriver): Unit
    
    /**
      * Close server.
      *
      * Close opened server. All remote clients, have connected with this server, are also closed and their call back
      * functions, for closed connection, {@link IClientDriver.onClose} are also called.
      */
    def close(): Unit
    
    /**
      * Open server.
      *
      * @param port Port number to open.
      */
    def open(port: Double): Unit
  }
  object IServer {
    
    inline def apply(addClient: IClientDriver => Callback, close: Callback, open: Double => Callback): IServer = {
      val __obj = js.Dynamic.literal(addClient = js.Any.fromFunction1((t0: IClientDriver) => addClient(t0).runNow()), close = close.toJsFn, open = js.Any.fromFunction1((t0: Double) => open(t0).runNow()))
      __obj.asInstanceOf[IServer]
    }
    
    extension [Self <: IServer](x: Self) {
      
      inline def setAddClient(value: IClientDriver => Callback): Self = StObject.set(x, "addClient", js.Any.fromFunction1((t0: IClientDriver) => value(t0).runNow()))
      
      inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
      
      inline def setOpen(value: Double => Callback): Self = StObject.set(x, "open", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    }
  }
}
