package typingsJapgolly.soupbintcp

import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.netMod.Socket
import typingsJapgolly.soupbintcp.anon.Host
import typingsJapgolly.soupbintcp.mod.ConnectionOptions
import typingsJapgolly.soupbintcp.mod.LoginAcceptedPayload
import typingsJapgolly.soupbintcp.mod.LoginRejectedPayload
import typingsJapgolly.soupbintcp.mod.LoginRequestPayload
import typingsJapgolly.soupbintcp.mod.PacketType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object soupbintcp {
    
    @JSGlobal("soupbintcp")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("soupbintcp.Client")
    @js.native
    open class Client protected ()
      extends typingsJapgolly.soupbintcp.mod.Client {
      def this(options: Host) = this()
      def this(options: Host, callback: js.Function0[Unit]) = this()
    }
    
    @JSGlobal("soupbintcp.Connection")
    @js.native
    open class Connection protected ()
      extends typingsJapgolly.soupbintcp.mod.Connection {
      def this(socket: Socket, options: ConnectionOptions) = this()
    }
    
    @JSGlobal("soupbintcp.PacketType")
    @js.native
    object PacketType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.soupbintcp.mod.PacketType & Double] = js.native
      
      /* 0x52 */ val CLIENT_HEARTBEAT: typingsJapgolly.soupbintcp.mod.PacketType.CLIENT_HEARTBEAT & Double = js.native
      
      /* 0x2b */ val DEBUG: typingsJapgolly.soupbintcp.mod.PacketType.DEBUG & Double = js.native
      
      /* 0x5a */ val END_OF_SESSION: typingsJapgolly.soupbintcp.mod.PacketType.END_OF_SESSION & Double = js.native
      
      /* 0x41 */ val LOGIN_ACCEPTED: typingsJapgolly.soupbintcp.mod.PacketType.LOGIN_ACCEPTED & Double = js.native
      
      /* 0x4a */ val LOGIN_REJECTED: typingsJapgolly.soupbintcp.mod.PacketType.LOGIN_REJECTED & Double = js.native
      
      /* 0x4c */ val LOGIN_REQUEST: typingsJapgolly.soupbintcp.mod.PacketType.LOGIN_REQUEST & Double = js.native
      
      /* 0x4f */ val LOGOUT_REQUEST: typingsJapgolly.soupbintcp.mod.PacketType.LOGOUT_REQUEST & Double = js.native
      
      /* 0x53 */ val SEQUENCED_DATA: typingsJapgolly.soupbintcp.mod.PacketType.SEQUENCED_DATA & Double = js.native
      
      /* 0x48 */ val SERVER_HEARTBEAT: typingsJapgolly.soupbintcp.mod.PacketType.SERVER_HEARTBEAT & Double = js.native
      
      /* 0x55 */ val UNSEQUENCED_DATA: typingsJapgolly.soupbintcp.mod.PacketType.UNSEQUENCED_DATA & Double = js.native
    }
    
    @JSGlobal("soupbintcp.Parser")
    @js.native
    open class Parser protected ()
      extends typingsJapgolly.soupbintcp.mod.Parser {
      def this(callback: js.Function2[/* packetType */ PacketType, /* payload */ Buffer, Unit]) = this()
    }
    
    @JSGlobal("soupbintcp.Server")
    @js.native
    open class Server protected ()
      extends typingsJapgolly.soupbintcp.mod.Server {
      def this(options: Host) = this()
      def this(options: Host, callback: js.Function1[/* data */ js.UndefOr[Any], Unit]) = this()
    }
    
    @JSGlobal("soupbintcp.Session")
    @js.native
    open class Session protected ()
      extends typingsJapgolly.soupbintcp.mod.Session {
      def this(socket: Socket) = this()
    }
    
    inline def formatLoginAccepted(payload: LoginAcceptedPayload): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("formatLoginAccepted")(payload.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    inline def formatLoginRejected(payload: LoginRejectedPayload): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("formatLoginRejected")(payload.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    inline def formatLoginRequest(payload: LoginRequestPayload): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("formatLoginRequest")(payload.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    inline def parseLoginAccepted(payload: Buffer): LoginAcceptedPayload = ^.asInstanceOf[js.Dynamic].applyDynamic("parseLoginAccepted")(payload.asInstanceOf[js.Any]).asInstanceOf[LoginAcceptedPayload]
    
    inline def parseLoginRejected(payload: Buffer): LoginRejectedPayload = ^.asInstanceOf[js.Dynamic].applyDynamic("parseLoginRejected")(payload.asInstanceOf[js.Any]).asInstanceOf[LoginRejectedPayload]
    
    inline def parseLoginRequest(payload: Buffer): LoginRequestPayload = ^.asInstanceOf[js.Dynamic].applyDynamic("parseLoginRequest")(payload.asInstanceOf[js.Any]).asInstanceOf[LoginRequestPayload]
  }
}
