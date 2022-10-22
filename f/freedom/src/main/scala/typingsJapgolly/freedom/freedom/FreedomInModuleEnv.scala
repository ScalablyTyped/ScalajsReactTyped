package typingsJapgolly.freedom.freedom

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.freedom.freedom.TcpSocket.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FreedomInModuleEnv
  extends StObject
     with // We use this specification so that you can reference freedom sub-modules by
// an array-lookup of its name. One day, maybe we'll have a nicer way to do
// this.
/* moduleName */ StringDictionary[FreedomModuleFactoryManager[Any]] {
  
  // Represents the call to freedom(), which returns the parent module's
  // freedom stub interface in an on/emit style. This is a getter.
  def apply(): ParentModuleThing = js.native
  
  // This is the factory constructor for a new instance of a stub/channel to a
  // module.
  // Creates an interface to the freedom core provider which can be used to
  // create loggers and channels.
  // Note: unlike other providers, core is a getter.
  def core(args: Any*): Core = js.native
  
  // This is the factory constructor for a new instance of a stub/channel to a
  // module.
  @JSName("core.console")
  def coreDotconsole(args: Any*): typingsJapgolly.freedom.freedom.Console.Console = js.native
  @JSName("core.console")
  var coreDotconsole_Original: FreedomModuleFactoryManager[typingsJapgolly.freedom.freedom.Console.Console] = js.native
  
  // This is the factory constructor for a new instance of a stub/channel to a
  // module.
  @JSName("core.rtcdatachannel")
  def coreDotrtcdatachannel(args: Any*): typingsJapgolly.freedom.freedom.RTCDataChannel.RTCDataChannel = js.native
  @JSName("core.rtcdatachannel")
  var coreDotrtcdatachannel_Original: FreedomModuleFactoryManager[typingsJapgolly.freedom.freedom.RTCDataChannel.RTCDataChannel] = js.native
  
  // This is the factory constructor for a new instance of a stub/channel to a
  // module.
  @JSName("core.rtcpeerconnection")
  def coreDotrtcpeerconnection(args: Any*): typingsJapgolly.freedom.freedom.RTCPeerConnection.RTCPeerConnection = js.native
  @JSName("core.rtcpeerconnection")
  var coreDotrtcpeerconnection_Original: FreedomModuleFactoryManager[typingsJapgolly.freedom.freedom.RTCPeerConnection.RTCPeerConnection] = js.native
  
  // This is the factory constructor for a new instance of a stub/channel to a
  // module.
  @JSName("core.storage")
  def coreDotstorage(args: Any*): typingsJapgolly.freedom.freedom.Storage.Storage = js.native
  @JSName("core.storage")
  var coreDotstorage_Original: FreedomModuleFactoryManager[typingsJapgolly.freedom.freedom.Storage.Storage] = js.native
  
  // This is the factory constructor for a new instance of a stub/channel to a
  // module.
  @JSName("core.tcpsocket")
  def coreDottcpsocket(args: Any*): Socket = js.native
  @JSName("core.tcpsocket")
  var coreDottcpsocket_Original: FreedomModuleFactoryManager[Socket] = js.native
  
  // This is the factory constructor for a new instance of a stub/channel to a
  // module.
  @JSName("core.udpsocket")
  def coreDotudpsocket(args: Any*): typingsJapgolly.freedom.freedom.UdpSocket.Socket = js.native
  @JSName("core.udpsocket")
  var coreDotudpsocket_Original: FreedomModuleFactoryManager[typingsJapgolly.freedom.freedom.UdpSocket.Socket] = js.native
  
  // Creates an interface to the freedom core provider which can be used to
  // create loggers and channels.
  // Note: unlike other providers, core is a getter.
  @JSName("core")
  var core_Original: FreedomModuleFactoryManager[Core] = js.native
  
  // This is the factory constructor for a new instance of a stub/channel to a
  // module.
  def pgp(args: Any*): typingsJapgolly.freedom.freedom.PgpProvider.PgpProvider = js.native
  @JSName("pgp")
  var pgp_Original: FreedomModuleFactoryManager[typingsJapgolly.freedom.freedom.PgpProvider.PgpProvider] = js.native
  
  // This is the factory constructor for a new instance of a stub/channel to a
  // module.
  def portControl(args: Any*): typingsJapgolly.freedom.freedom.PortControl.PortControl = js.native
  @JSName("portControl")
  var portControl_Original: FreedomModuleFactoryManager[typingsJapgolly.freedom.freedom.PortControl.PortControl] = js.native
}
