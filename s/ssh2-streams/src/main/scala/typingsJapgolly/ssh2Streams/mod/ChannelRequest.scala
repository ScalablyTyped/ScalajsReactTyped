package typingsJapgolly.ssh2Streams.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.ssh2Streams.mod.ExitStatusChannelRequest
  - typingsJapgolly.ssh2Streams.mod.ExitSignalChannelRequest
  - typingsJapgolly.ssh2Streams.mod.PseudoTtyChannelRequest
  - typingsJapgolly.ssh2Streams.mod.WindowChangeChannelRequest
  - typingsJapgolly.ssh2Streams.mod.X11ChannelRequest
  - typingsJapgolly.ssh2Streams.mod.EnvChannelRequest
  - typingsJapgolly.ssh2Streams.mod.ShellChannelRequest
  - typingsJapgolly.ssh2Streams.mod.ExecChannelRequest
  - typingsJapgolly.ssh2Streams.mod.SubsystemChannelRequest
  - typingsJapgolly.ssh2Streams.mod.SignalChannelRequest
  - typingsJapgolly.ssh2Streams.mod.FlowControlChannelRequest
*/
trait ChannelRequest extends StObject
object ChannelRequest {
  
  inline def EnvChannelRequest(key: String, recipient: Double, `val`: String, wantReply: Boolean): typingsJapgolly.ssh2Streams.mod.EnvChannelRequest = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any], request = "env", wantReply = wantReply.asInstanceOf[js.Any])
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.ssh2Streams.mod.EnvChannelRequest]
  }
  
  inline def ExecChannelRequest(command: String, recipient: Double, wantReply: Boolean): typingsJapgolly.ssh2Streams.mod.ExecChannelRequest = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any], request = "exec", wantReply = wantReply.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.ssh2Streams.mod.ExecChannelRequest]
  }
  
  inline def ExitSignalChannelRequest(coredump: Boolean, description: String, recipient: Double, signal: String): typingsJapgolly.ssh2Streams.mod.ExitSignalChannelRequest = {
    val __obj = js.Dynamic.literal(coredump = coredump.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any], request = "exit-signal", signal = signal.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.ssh2Streams.mod.ExitSignalChannelRequest]
  }
  
  inline def ExitStatusChannelRequest(code: Double, recipient: Double): typingsJapgolly.ssh2Streams.mod.ExitStatusChannelRequest = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any], request = "exit-status")
    __obj.asInstanceOf[typingsJapgolly.ssh2Streams.mod.ExitStatusChannelRequest]
  }
  
  inline def FlowControlChannelRequest(clientControl: Boolean, recipient: Double): typingsJapgolly.ssh2Streams.mod.FlowControlChannelRequest = {
    val __obj = js.Dynamic.literal(clientControl = clientControl.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any], request = "xon-xoff")
    __obj.asInstanceOf[typingsJapgolly.ssh2Streams.mod.FlowControlChannelRequest]
  }
  
  inline def PseudoTtyChannelRequest(
    cols: Double,
    height: Double,
    modes: Any,
    recipient: Double,
    rows: Double,
    term: String,
    wantReply: Boolean,
    width: Double
  ): typingsJapgolly.ssh2Streams.mod.PseudoTtyChannelRequest = {
    val __obj = js.Dynamic.literal(cols = cols.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], modes = modes.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any], request = "pty-req", rows = rows.asInstanceOf[js.Any], term = term.asInstanceOf[js.Any], wantReply = wantReply.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.ssh2Streams.mod.PseudoTtyChannelRequest]
  }
  
  inline def ShellChannelRequest(recipient: Double, wantReply: Boolean): typingsJapgolly.ssh2Streams.mod.ShellChannelRequest = {
    val __obj = js.Dynamic.literal(recipient = recipient.asInstanceOf[js.Any], request = "shell", wantReply = wantReply.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.ssh2Streams.mod.ShellChannelRequest]
  }
  
  inline def SignalChannelRequest(recipient: Double, signal: String): typingsJapgolly.ssh2Streams.mod.SignalChannelRequest = {
    val __obj = js.Dynamic.literal(recipient = recipient.asInstanceOf[js.Any], request = "signal", signal = signal.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.ssh2Streams.mod.SignalChannelRequest]
  }
  
  inline def SubsystemChannelRequest(recipient: Double, subsystem: String, wantReply: Boolean): typingsJapgolly.ssh2Streams.mod.SubsystemChannelRequest = {
    val __obj = js.Dynamic.literal(recipient = recipient.asInstanceOf[js.Any], request = "subsystem", subsystem = subsystem.asInstanceOf[js.Any], wantReply = wantReply.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.ssh2Streams.mod.SubsystemChannelRequest]
  }
  
  inline def WindowChangeChannelRequest(cols: Double, height: Double, recipient: Double, rows: Double, width: Double): typingsJapgolly.ssh2Streams.mod.WindowChangeChannelRequest = {
    val __obj = js.Dynamic.literal(cols = cols.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any], request = "window-change", rows = rows.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.ssh2Streams.mod.WindowChangeChannelRequest]
  }
  
  inline def X11ChannelRequest(
    cookie: String,
    protocol: String,
    recipient: Double,
    screen: Double,
    single: Boolean,
    wantReply: Boolean
  ): typingsJapgolly.ssh2Streams.mod.X11ChannelRequest = {
    val __obj = js.Dynamic.literal(cookie = cookie.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any], request = "x11-req", screen = screen.asInstanceOf[js.Any], single = single.asInstanceOf[js.Any], wantReply = wantReply.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.ssh2Streams.mod.X11ChannelRequest]
  }
}
