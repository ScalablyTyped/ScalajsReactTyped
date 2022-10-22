package typingsJapgolly.dcpClient.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchedMsg extends StObject {
  
  /**
    * This command is an announcement from the scheduler,
    * the provided message should be displayed to the user (modal on web, console on node). The message to be displayed to the user.
    */
  def announce(message: String): Unit
  
  /**
    * This command instructs the worker to immediately stop working, and can optionally disable the worker to prevent restarting.
    * The user will need to manually intervene to restart the worker. When false, the worker will be disabled.
    */
  def kill(temporary: Boolean): Unit
  
  /**
    * This web-only command will open a new webpage to the provided URL. The URL to open the new page to.
    */
  def openPopup(href: String): Unit
  
  /**
    * This command instructs the worker to “hard” reload, in the browser this will trigger a page refresh and in node it will exit the process.
    */
  def reload(): Unit
  
  /**
    * This command instructs the worker to stop working on a specific job. The address of the job to stop working on.
    */
  def remove(jobAddress: String): Unit
  
  /**
    * This command instructs the worker to restart, e.g. call worker.stop() then worker.start().
    */
  def restart(): Unit
}
object SchedMsg {
  
  inline def apply(
    announce: String => Callback,
    kill: Boolean => Callback,
    openPopup: String => Callback,
    reload: Callback,
    remove: String => Callback,
    restart: Callback
  ): SchedMsg = {
    val __obj = js.Dynamic.literal(announce = js.Any.fromFunction1((t0: String) => announce(t0).runNow()), kill = js.Any.fromFunction1((t0: Boolean) => kill(t0).runNow()), openPopup = js.Any.fromFunction1((t0: String) => openPopup(t0).runNow()), reload = reload.toJsFn, remove = js.Any.fromFunction1((t0: String) => remove(t0).runNow()), restart = restart.toJsFn)
    __obj.asInstanceOf[SchedMsg]
  }
  
  extension [Self <: SchedMsg](x: Self) {
    
    inline def setAnnounce(value: String => Callback): Self = StObject.set(x, "announce", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setKill(value: Boolean => Callback): Self = StObject.set(x, "kill", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setOpenPopup(value: String => Callback): Self = StObject.set(x, "openPopup", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setReload(value: Callback): Self = StObject.set(x, "reload", value.toJsFn)
    
    inline def setRemove(value: String => Callback): Self = StObject.set(x, "remove", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setRestart(value: Callback): Self = StObject.set(x, "restart", value.toJsFn)
  }
}
