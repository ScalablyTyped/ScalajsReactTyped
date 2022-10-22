package typingsJapgolly.telnetlib

import typingsJapgolly.node.netMod.NetConnectOpts
import typingsJapgolly.node.netMod.Server
import typingsJapgolly.node.netMod.ServerOpts
import typingsJapgolly.node.netMod.Socket
import typingsJapgolly.telnetlib.mod.Commands
import typingsJapgolly.telnetlib.mod.OptionState
import typingsJapgolly.telnetlib.mod.Options_
import typingsJapgolly.telnetlib.mod.Q
import typingsJapgolly.telnetlib.mod.Reason
import typingsJapgolly.telnetlib.mod.State
import typingsJapgolly.telnetlib.mod.Where
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object telnetlib {
    
    @JSGlobal("telnetlib")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("telnetlib.Commands")
    @js.native
    object Commands extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.telnetlib.mod.Commands & Double] = js.native
      
      /* 245 */ val AO: typingsJapgolly.telnetlib.mod.Commands.AO & Double = js.native
      
      /* 246 */ val AYT: typingsJapgolly.telnetlib.mod.Commands.AYT & Double = js.native
      
      /* 243 */ val BRK: typingsJapgolly.telnetlib.mod.Commands.BRK & Double = js.native
      
      /* 242 */ val DM: typingsJapgolly.telnetlib.mod.Commands.DM & Double = js.native
      
      /* 253 */ val DO: typingsJapgolly.telnetlib.mod.Commands.DO & Double = js.native
      
      /* 254 */ val DONT: typingsJapgolly.telnetlib.mod.Commands.DONT & Double = js.native
      
      /* 247 */ val EC: typingsJapgolly.telnetlib.mod.Commands.EC & Double = js.native
      
      /* 248 */ val EL: typingsJapgolly.telnetlib.mod.Commands.EL & Double = js.native
      
      /* 239 */ val EOR: typingsJapgolly.telnetlib.mod.Commands.EOR & Double = js.native
      
      /* 249 */ val GA: typingsJapgolly.telnetlib.mod.Commands.GA & Double = js.native
      
      /* 255 */ val IAC: typingsJapgolly.telnetlib.mod.Commands.IAC & Double = js.native
      
      /* 244 */ val IP: typingsJapgolly.telnetlib.mod.Commands.IP & Double = js.native
      
      /* 241 */ val NOP: typingsJapgolly.telnetlib.mod.Commands.NOP & Double = js.native
      
      /* 250 */ val SB: typingsJapgolly.telnetlib.mod.Commands.SB & Double = js.native
      
      /* 240 */ val SE: typingsJapgolly.telnetlib.mod.Commands.SE & Double = js.native
      
      /* 251 */ val WILL: typingsJapgolly.telnetlib.mod.Commands.WILL & Double = js.native
      
      /* 252 */ val WONT: typingsJapgolly.telnetlib.mod.Commands.WONT & Double = js.native
    }
    
    @JSGlobal("telnetlib.ECHO")
    @js.native
    open class ECHO protected ()
      extends typingsJapgolly.telnetlib.mod.ECHO {
      def this(socet: Socket, code: Double) = this()
    }
    
    @JSGlobal("telnetlib.GMCP")
    @js.native
    open class GMCP protected ()
      extends typingsJapgolly.telnetlib.mod.GMCP {
      def this(socket: Socket) = this()
    }
    
    @JSGlobal("telnetlib.MCCP")
    @js.native
    open class MCCP protected ()
      extends typingsJapgolly.telnetlib.mod.MCCP {
      def this(socet: Socket, code: Double) = this()
    }
    
    @JSGlobal("telnetlib.NAWS")
    @js.native
    open class NAWS protected ()
      extends typingsJapgolly.telnetlib.mod.NAWS {
      def this(socket: Socket) = this()
    }
    
    @JSGlobal("telnetlib.OptionState")
    @js.native
    object OptionState extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsJapgolly.telnetlib.mod.OptionState & String] = js.native
      
      /* "NO" */ val NO: typingsJapgolly.telnetlib.mod.OptionState.NO & String = js.native
      
      /* "WANTNO" */ val WANTNO: typingsJapgolly.telnetlib.mod.OptionState.WANTNO & String = js.native
      
      /* "WANTYES" */ val WANTYES: typingsJapgolly.telnetlib.mod.OptionState.WANTYES & String = js.native
      
      /* "YES" */ val YES: typingsJapgolly.telnetlib.mod.OptionState.YES & String = js.native
    }
    
    @JSGlobal("telnetlib.Q")
    @js.native
    object Q extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsJapgolly.telnetlib.mod.Q & String] = js.native
      
      /* "EMPTY" */ val EMPTY: typingsJapgolly.telnetlib.mod.Q.EMPTY & String = js.native
      
      /* "OPPOSITE" */ val OPPOSITE: typingsJapgolly.telnetlib.mod.Q.OPPOSITE & String = js.native
    }
    
    @JSGlobal("telnetlib.Reason")
    @js.native
    object Reason extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsJapgolly.telnetlib.mod.Reason & String] = js.native
      
      /* "CHUNK" */ val CHUNK: typingsJapgolly.telnetlib.mod.Reason.CHUNK & String = js.native
      
      /* "DATA" */ val DATA: typingsJapgolly.telnetlib.mod.Reason.DATA & String = js.native
      
      /* "EOR" */ val EOR: typingsJapgolly.telnetlib.mod.Reason.EOR & String = js.native
      
      /* "GA" */ val GA: typingsJapgolly.telnetlib.mod.Reason.GA & String = js.native
    }
    
    @JSGlobal("telnetlib.SGA")
    @js.native
    open class SGA protected ()
      extends typingsJapgolly.telnetlib.mod.SGA {
      def this(socket: Socket) = this()
    }
    
    @JSGlobal("telnetlib.State")
    @js.native
    object State extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsJapgolly.telnetlib.mod.State & String] = js.native
      
      /* "DATA" */ val DATA: typingsJapgolly.telnetlib.mod.State.DATA & String = js.native
      
      /* "DO" */ val DO: typingsJapgolly.telnetlib.mod.State.DO & String = js.native
      
      /* "DONT" */ val DONT: typingsJapgolly.telnetlib.mod.State.DONT & String = js.native
      
      /* "IAC" */ val IAC: typingsJapgolly.telnetlib.mod.State.IAC & String = js.native
      
      /* "SB" */ val SB: typingsJapgolly.telnetlib.mod.State.SB & String = js.native
      
      /* "SBIAC" */ val SBIAC: typingsJapgolly.telnetlib.mod.State.SBIAC & String = js.native
      
      /* "WILL" */ val WILL: typingsJapgolly.telnetlib.mod.State.WILL & String = js.native
      
      /* "WONT" */ val WONT: typingsJapgolly.telnetlib.mod.State.WONT & String = js.native
    }
    
    @JSGlobal("telnetlib.TRANSMIT_BINARY")
    @js.native
    open class TRANSMIT_BINARY protected ()
      extends typingsJapgolly.telnetlib.mod.TRANSMIT_BINARY {
      def this(socet: Socket, code: Double) = this()
    }
    
    @JSGlobal("telnetlib.TelnetOption")
    @js.native
    open class TelnetOption protected ()
      extends typingsJapgolly.telnetlib.mod.TelnetOption {
      def this(socet: Socket, code: Double) = this()
    }
    
    @JSGlobal("telnetlib.TelnetSocket")
    @js.native
    open class TelnetSocket protected ()
      extends typingsJapgolly.telnetlib.mod.TelnetSocket {
      def this(socket: Socket, options: Options_[typingsJapgolly.telnetlib.mod.TelnetOption]) = this()
    }
    
    @JSGlobal("telnetlib.Where")
    @js.native
    object Where extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsJapgolly.telnetlib.mod.Where & String] = js.native
      
      /* "LOCAL" */ val LOCAL: typingsJapgolly.telnetlib.mod.Where.LOCAL & String = js.native
      
      /* "REMOTE" */ val REMOTE: typingsJapgolly.telnetlib.mod.Where.REMOTE & String = js.native
    }
    
    object constants {
      
      @JSGlobal("telnetlib.constants")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("telnetlib.constants.commands")
      @js.native
      def commands: Commands = js.native
      inline def commands_=(x: Commands): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("commands")(x.asInstanceOf[js.Any])
      
      @JSGlobal("telnetlib.constants.optionState")
      @js.native
      def optionState: OptionState = js.native
      inline def optionState_=(x: OptionState): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("optionState")(x.asInstanceOf[js.Any])
      
      @JSGlobal("telnetlib.constants.q")
      @js.native
      def q: Q = js.native
      inline def q_=(x: Q): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("q")(x.asInstanceOf[js.Any])
      
      @JSGlobal("telnetlib.constants.reason")
      @js.native
      def reason: Reason = js.native
      inline def reason_=(x: Reason): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reason")(x.asInstanceOf[js.Any])
      
      @JSGlobal("telnetlib.constants.state")
      @js.native
      def state: State = js.native
      inline def state_=(x: State): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("state")(x.asInstanceOf[js.Any])
      
      @JSGlobal("telnetlib.constants.where")
      @js.native
      def where: Where = js.native
      inline def where_=(x: Where): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("where")(x.asInstanceOf[js.Any])
    }
    
    inline def createConnection(options: NetConnectOpts & Options_[typingsJapgolly.telnetlib.mod.TelnetOption]): typingsJapgolly.telnetlib.mod.TelnetSocket = ^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(options.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.telnetlib.mod.TelnetSocket]
    inline def createConnection(
      options: NetConnectOpts & Options_[typingsJapgolly.telnetlib.mod.TelnetOption],
      connectionListener: js.Function0[Unit]
    ): typingsJapgolly.telnetlib.mod.TelnetSocket = (^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(options.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.telnetlib.mod.TelnetSocket]
    inline def createConnection(options: String): typingsJapgolly.telnetlib.mod.TelnetSocket = ^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(options.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.telnetlib.mod.TelnetSocket]
    inline def createConnection(options: String, connectionListener: js.Function0[Unit]): typingsJapgolly.telnetlib.mod.TelnetSocket = (^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(options.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.telnetlib.mod.TelnetSocket]
    inline def createConnection(port: Double): typingsJapgolly.telnetlib.mod.TelnetSocket = ^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(port.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.telnetlib.mod.TelnetSocket]
    inline def createConnection(port: Double, host: String): typingsJapgolly.telnetlib.mod.TelnetSocket = (^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.telnetlib.mod.TelnetSocket]
    inline def createConnection(port: Double, host: String, connectionListener: js.Function0[Unit]): typingsJapgolly.telnetlib.mod.TelnetSocket = (^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.telnetlib.mod.TelnetSocket]
    inline def createConnection(port: Double, host: Unit, connectionListener: js.Function0[Unit]): typingsJapgolly.telnetlib.mod.TelnetSocket = (^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.telnetlib.mod.TelnetSocket]
    
    inline def createServer(): Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")().asInstanceOf[Server]
    inline def createServer(connectionListener: js.Function1[/* socket */ Socket, Unit]): Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(connectionListener.asInstanceOf[js.Any]).asInstanceOf[Server]
    inline def createServer(options: ServerOpts & Options_[typingsJapgolly.telnetlib.mod.TelnetOption]): Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any]).asInstanceOf[Server]
    inline def createServer(
      options: ServerOpts & Options_[typingsJapgolly.telnetlib.mod.TelnetOption],
      connectionListener: js.Function1[/* socket */ Socket & typingsJapgolly.telnetlib.mod.TelnetSocket, Unit]
    ): Server = (^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[Server]
    inline def createServer(
      options: Unit,
      connectionListener: js.Function1[/* socket */ Socket & typingsJapgolly.telnetlib.mod.TelnetSocket, Unit]
    ): Server = (^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[Server]
    
    inline def defineOption(name: String, code: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineOption")(name.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def defineOption(name: String, code: Double, handler: typingsJapgolly.telnetlib.mod.TelnetOption): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineOption")(name.asInstanceOf[js.Any], code.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def getOption[T /* <: typingsJapgolly.telnetlib.mod.TelnetOption */](code: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("getOption")(code.asInstanceOf[js.Any]).asInstanceOf[T]
    
    object options {
      
      @JSGlobal("telnetlib.options")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("telnetlib.options.ECHO")
      @js.native
      def ECHO: typingsJapgolly.telnetlib.mod.ECHO = js.native
      inline def ECHO_=(x: typingsJapgolly.telnetlib.mod.ECHO): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ECHO")(x.asInstanceOf[js.Any])
      
      @JSGlobal("telnetlib.options.GMCP")
      @js.native
      def GMCP: typingsJapgolly.telnetlib.mod.GMCP = js.native
      inline def GMCP_=(x: typingsJapgolly.telnetlib.mod.GMCP): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GMCP")(x.asInstanceOf[js.Any])
      
      @JSGlobal("telnetlib.options.MCCP")
      @js.native
      def MCCP: typingsJapgolly.telnetlib.mod.MCCP = js.native
      inline def MCCP_=(x: typingsJapgolly.telnetlib.mod.MCCP): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MCCP")(x.asInstanceOf[js.Any])
      
      @JSGlobal("telnetlib.options.NAWS")
      @js.native
      def NAWS: typingsJapgolly.telnetlib.mod.NAWS = js.native
      inline def NAWS_=(x: typingsJapgolly.telnetlib.mod.NAWS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAWS")(x.asInstanceOf[js.Any])
      
      @JSGlobal("telnetlib.options.SGA")
      @js.native
      def SGA: typingsJapgolly.telnetlib.mod.SGA = js.native
      inline def SGA_=(x: typingsJapgolly.telnetlib.mod.SGA): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SGA")(x.asInstanceOf[js.Any])
      
      @JSGlobal("telnetlib.options.TRANSMIT_BINARY")
      @js.native
      def TRANSMIT_BINARY: typingsJapgolly.telnetlib.mod.TRANSMIT_BINARY = js.native
      inline def TRANSMIT_BINARY_=(x: typingsJapgolly.telnetlib.mod.TRANSMIT_BINARY): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRANSMIT_BINARY")(x.asInstanceOf[js.Any])
    }
  }
}
