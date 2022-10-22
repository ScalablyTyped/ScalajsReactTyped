package typingsJapgolly.ssh2.mod

import typingsJapgolly.ssh2.ssh2Strings.`auth-agent`
import typingsJapgolly.ssh2.ssh2Strings.`window-change`
import typingsJapgolly.ssh2.ssh2Strings.env
import typingsJapgolly.ssh2.ssh2Strings.exec
import typingsJapgolly.ssh2.ssh2Strings.pty
import typingsJapgolly.ssh2.ssh2Strings.sftp
import typingsJapgolly.ssh2.ssh2Strings.shell
import typingsJapgolly.ssh2.ssh2Strings.signal
import typingsJapgolly.ssh2.ssh2Strings.subsystem
import typingsJapgolly.ssh2.ssh2Strings.x11
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Session extends ServerChannel {
  
  /**
    * Emitted when the client has requested incoming ssh-agent requests be forwarded to them.
    */
  @JSName("on")
  def on_authagent(
    event: `auth-agent`,
    listener: js.Function2[/* accept */ SessionAccept, /* reject */ RejectConnection, Unit]
  ): this.type = js.native
  /**
    * Emitted when the client requested an environment variable to be set for this session.
    */
  @JSName("on")
  def on_env(
    event: env,
    listener: js.Function3[/* accept */ SessionAccept, /* reject */ RejectConnection, /* info */ SetEnvInfo, Unit]
  ): this.type = js.native
  /**
    * Emitted when the client has requested execution of a command string.
    */
  @JSName("on")
  def on_exec(
    event: exec,
    listener: js.Function3[
      /* accept */ AcceptConnection[ServerChannel], 
      /* reject */ RejectConnection, 
      /* info */ ExecInfo, 
      Unit
    ]
  ): this.type = js.native
  // Session events
  /**
    * Emitted when the client requested allocation of a pseudo-TTY for this session.
    */
  @JSName("on")
  def on_pty(
    event: pty,
    listener: js.Function3[
      /* accept */ SessionAccept, 
      /* reject */ RejectConnection, 
      /* info */ PseudoTtyInfo, 
      Unit
    ]
  ): this.type = js.native
  /**
    * Emitted when the client has requested the SFTP subsystem.
    */
  @JSName("on")
  def on_sftp(
    event: sftp,
    listener: js.Function2[/* accept */ AcceptSftpConnection, /* reject */ RejectConnection, Unit]
  ): this.type = js.native
  /**
    * Emitted when the client has requested an interactive shell.
    */
  @JSName("on")
  def on_shell(
    event: shell,
    listener: js.Function2[/* accept */ AcceptConnection[ServerChannel], /* reject */ RejectConnection, Unit]
  ): this.type = js.native
  /**
    * Emitted when the client has sent a POSIX signal.
    */
  @JSName("on")
  def on_signal(
    event: signal,
    listener: js.Function3[/* accept */ SessionAccept, /* reject */ RejectConnection, /* info */ SignalInfo, Unit]
  ): this.type = js.native
  /**
    * Emitted when the client has requested an arbitrary subsystem.
    */
  @JSName("on")
  def on_subsystem(
    event: subsystem,
    listener: js.Function3[
      /* accept */ AcceptConnection[ServerChannel], 
      /* reject */ RejectConnection, 
      /* info */ SubsystemInfo, 
      Unit
    ]
  ): this.type = js.native
  /**
    * Emitted when the client reported a change in window dimensions during this session.
    */
  @JSName("on")
  def on_windowchange(
    event: `window-change`,
    listener: js.Function3[
      /* accept */ SessionAccept, 
      /* reject */ RejectConnection, 
      /* info */ WindowChangeInfo, 
      Unit
    ]
  ): this.type = js.native
  /**
    * Emitted when the client requested X11 forwarding.
    */
  @JSName("on")
  def on_x11(
    event: x11,
    listener: js.Function3[/* accept */ SessionAccept, /* reject */ RejectConnection, /* info */ X11Info, Unit]
  ): this.type = js.native
}
