package typingsJapgolly.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IpcMainEvent
  extends StObject
     with Event {
  
  // Docs: https://electronjs.org/docs/api/structures/ipc-main-event
  /**
    * The ID of the renderer frame that sent this message
    */
  var frameId: Double = js.native
  
  /**
    * A list of MessagePorts that were transferred with this message
    */
  var ports: js.Array[MessagePortMain] = js.native
  
  /**
    * The internal ID of the renderer process that sent this message
    */
  var processId: Double = js.native
  
  /**
    * A function that will send an IPC message to the renderer frame that sent the
    * original message that you are currently handling.  You should use this method to
    * "reply" to the sent message in order to guarantee the reply will go to the
    * correct process and frame.
    */
  var reply: js.Function = js.native
  
  /**
    * Returns the `webContents` that sent the message
    */
  var sender: WebContents_ = js.native
  
  /**
    * The frame that sent this message
    *
    */
  val senderFrame: WebFrameMain_ = js.native
}
