package typingsJapgolly.samchon.iserverMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.samchon.iclientdriverMod.IClientDriver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IServer extends js.Object {
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
  @scala.inline
  def apply(addClient: IClientDriver => Callback, close: Callback, open: Double => Callback): IServer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addClient")(js.Any.fromFunction1((t0: typingsJapgolly.samchon.iclientdriverMod.IClientDriver) => addClient(t0).runNow()))
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.updateDynamic("open")(js.Any.fromFunction1((t0: scala.Double) => open(t0).runNow()))
    __obj.asInstanceOf[IServer]
  }
}

