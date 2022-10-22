package typingsJapgolly.achingbrainSsdp

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.URL
import typingsJapgolly.achingbrainSsdp.achingbrainSsdpStrings.`ssdpColonm-search`
import typingsJapgolly.achingbrainSsdp.achingbrainSsdpStrings.`ssdpColonsearch-response`
import typingsJapgolly.achingbrainSsdp.achingbrainSsdpStrings.`ssdpColonsend-message`
import typingsJapgolly.achingbrainSsdp.achingbrainSsdpStrings.`transportColonincoming-message`
import typingsJapgolly.achingbrainSsdp.achingbrainSsdpStrings.`transportColonoutgoing-message`
import typingsJapgolly.achingbrainSsdp.achingbrainSsdpStrings.error
import typingsJapgolly.achingbrainSsdp.achingbrainSsdpStrings.serviceColondiscover
import typingsJapgolly.achingbrainSsdp.achingbrainSsdpStrings.serviceColonremove
import typingsJapgolly.achingbrainSsdp.achingbrainSsdpStrings.serviceColonupdate
import typingsJapgolly.achingbrainSsdp.achingbrainSsdpStrings.ssdpColonalive
import typingsJapgolly.achingbrainSsdp.achingbrainSsdpStrings.ssdpColonbyebye
import typingsJapgolly.achingbrainSsdp.achingbrainSsdpStrings.ssdpColonnotify
import typingsJapgolly.achingbrainSsdp.achingbrainSsdpStrings.udp4
import typingsJapgolly.achingbrainSsdp.achingbrainSsdpStrings.udp6
import typingsJapgolly.achingbrainSsdp.anon.PartialSSDPOptions
import typingsJapgolly.achingbrainSsdp.distSrcAdvertsMod.CachedAdvert
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.dgramMod.Socket
import typingsJapgolly.std.AsyncIterable
import typingsJapgolly.std.Parameters
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@achingbrain/ssdp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Promise[SSDP] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Promise[SSDP]]
  inline def default(options: PartialSSDPOptions): js.Promise[SSDP] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SSDP]]
  
  trait Advertisment extends StObject {
    
    var details: (Record[String, Any]) | (js.Function0[js.Promise[Record[String, Any]]])
    
    var usn: String
  }
  object Advertisment {
    
    inline def apply(details: (Record[String, Any]) | (js.Function0[js.Promise[Record[String, Any]]]), usn: String): Advertisment = {
      val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], usn = usn.asInstanceOf[js.Any])
      __obj.asInstanceOf[Advertisment]
    }
    
    extension [Self <: Advertisment](x: Self) {
      
      inline def setDetails(value: (Record[String, Any]) | (js.Function0[js.Promise[Record[String, Any]]])): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      inline def setDetailsCallbackTo(value: CallbackTo[js.Promise[Record[String, Any]]]): Self = StObject.set(x, "details", value.toJsFn)
      
      inline def setUsn(value: String): Self = StObject.set(x, "usn", value.asInstanceOf[js.Any])
    }
  }
  
  trait NetworkAddress extends StObject {
    
    var address: String
    
    var port: Double
  }
  object NetworkAddress {
    
    inline def apply(address: String, port: Double): NetworkAddress = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[NetworkAddress]
    }
    
    extension [Self <: NetworkAddress](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
  
  trait NotfiyMessage extends StObject {
    
    var LOCATION: String
    
    var NT: String
    
    var NTS: ssdpColonalive | ssdpColonbyebye
    
    var USN: String
    
    def ttl(): Double
  }
  object NotfiyMessage {
    
    inline def apply(
      LOCATION: String,
      NT: String,
      NTS: ssdpColonalive | ssdpColonbyebye,
      USN: String,
      ttl: CallbackTo[Double]
    ): NotfiyMessage = {
      val __obj = js.Dynamic.literal(LOCATION = LOCATION.asInstanceOf[js.Any], NT = NT.asInstanceOf[js.Any], NTS = NTS.asInstanceOf[js.Any], USN = USN.asInstanceOf[js.Any], ttl = ttl.toJsFn)
      __obj.asInstanceOf[NotfiyMessage]
    }
    
    extension [Self <: NotfiyMessage](x: Self) {
      
      inline def setLOCATION(value: String): Self = StObject.set(x, "LOCATION", value.asInstanceOf[js.Any])
      
      inline def setNT(value: String): Self = StObject.set(x, "NT", value.asInstanceOf[js.Any])
      
      inline def setNTS(value: ssdpColonalive | ssdpColonbyebye): Self = StObject.set(x, "NTS", value.asInstanceOf[js.Any])
      
      inline def setTtl(value: CallbackTo[Double]): Self = StObject.set(x, "ttl", value.toJsFn)
      
      inline def setUSN(value: String): Self = StObject.set(x, "USN", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SSDP extends StObject {
    
    def advertise(advert: Advertisment): js.Promise[CachedAdvert] = js.native
    
    def discover[Details](): AsyncIterable[Service[Details]] = js.native
    def discover[Details](serviceType: String): AsyncIterable[Service[Details]] = js.native
    
    def emit[U /* <: /* keyof @achingbrain/ssdp.@achingbrain/ssdp.SSDPEvents */ `transportColonincoming-message` | `transportColonoutgoing-message` | `ssdpColonsend-message` | `ssdpColonm-search` | ssdpColonnotify | `ssdpColonsearch-response` | serviceColondiscover | serviceColonupdate | serviceColonremove | error */](
      event: U,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<SSDPEvents[U]> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: @achingbrain/ssdp.@achingbrain/ssdp.SSDPEvents[U] */ js.Any
        ]
    ): Boolean = js.native
    
    def off[U /* <: /* keyof @achingbrain/ssdp.@achingbrain/ssdp.SSDPEvents */ `transportColonincoming-message` | `transportColonoutgoing-message` | `ssdpColonsend-message` | `ssdpColonm-search` | ssdpColonnotify | `ssdpColonsearch-response` | serviceColondiscover | serviceColonupdate | serviceColonremove | error */](
      event: U,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: @achingbrain/ssdp.@achingbrain/ssdp.SSDPEvents[U] */ js.Any
    ): this.type = js.native
    
    def on[U /* <: /* keyof @achingbrain/ssdp.@achingbrain/ssdp.SSDPEvents */ `transportColonincoming-message` | `transportColonoutgoing-message` | `ssdpColonsend-message` | `ssdpColonm-search` | ssdpColonnotify | `ssdpColonsearch-response` | serviceColondiscover | serviceColonupdate | serviceColonremove | error */](
      event: U,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: @achingbrain/ssdp.@achingbrain/ssdp.SSDPEvents[U] */ js.Any
    ): this.type = js.native
    
    def once[U /* <: /* keyof @achingbrain/ssdp.@achingbrain/ssdp.SSDPEvents */ `transportColonincoming-message` | `transportColonoutgoing-message` | `ssdpColonsend-message` | `ssdpColonm-search` | ssdpColonnotify | `ssdpColonsearch-response` | serviceColondiscover | serviceColonupdate | serviceColonremove | error */](
      event: U,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: @achingbrain/ssdp.@achingbrain/ssdp.SSDPEvents[U] */ js.Any
    ): this.type = js.native
    
    /**
      * Options passed to the constructor
      */
    var options: SSDPOptions = js.native
    
    /**
      * A user-agent style string to identify the implementation
      */
    var signature: String = js.native
    
    /**
      * Currently open sockets
      */
    var sockets: js.Array[SSDPSocket] = js.native
    
    def start(): js.Promise[Unit] = js.native
    
    def stop(): js.Promise[Unit] = js.native
    
    /**
      * Unique device name - identifies the device and must the same over time for a specific device instance
      */
    var udn: String = js.native
  }
  
  @js.native
  trait SSDPEvents extends StObject {
    
    def error(err: js.Error): Unit = js.native
    
    @JSName("service:discover")
    def serviceColondiscover(service: Service[Record[String, Any]]): Unit = js.native
    
    @JSName("service:remove")
    def serviceColonremove(usn: String): Unit = js.native
    
    @JSName("service:update")
    def serviceColonupdate(service: Service[Record[String, Any]]): Unit = js.native
    
    @JSName("ssdp:m-search")
    def `ssdpColonm-search`(message: SearchMessage, from: NetworkAddress): Unit = js.native
    
    @JSName("ssdp:notify")
    def ssdpColonnotify(message: NotfiyMessage, from: NetworkAddress): Unit = js.native
    
    @JSName("ssdp:search-response")
    def `ssdpColonsearch-response`(message: SearchMessage, from: NetworkAddress): Unit = js.native
    
    @JSName("ssdp:send-message")
    def `ssdpColonsend-message`(status: String, headers: Record[String, Any]): Unit = js.native
    @JSName("ssdp:send-message")
    def `ssdpColonsend-message`(status: String, headers: Record[String, Any], to: NetworkAddress): Unit = js.native
    
    @JSName("transport:incoming-message")
    def `transportColonincoming-message`(buffer: Buffer, from: NetworkAddress): Unit = js.native
    
    @JSName("transport:outgoing-message")
    def `transportColonoutgoing-message`(socket: SSDPSocket, buffer: Buffer, to: NetworkAddress): Unit = js.native
  }
  
  trait SSDPOptions extends StObject {
    
    var signature: String
    
    var sockets: js.Array[SSDPSocketOptions]
    
    var start: Boolean
    
    var udn: String
  }
  object SSDPOptions {
    
    inline def apply(signature: String, sockets: js.Array[SSDPSocketOptions], start: Boolean, udn: String): SSDPOptions = {
      val __obj = js.Dynamic.literal(signature = signature.asInstanceOf[js.Any], sockets = sockets.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], udn = udn.asInstanceOf[js.Any])
      __obj.asInstanceOf[SSDPOptions]
    }
    
    extension [Self <: SSDPOptions](x: Self) {
      
      inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
      
      inline def setSockets(value: js.Array[SSDPSocketOptions]): Self = StObject.set(x, "sockets", value.asInstanceOf[js.Any])
      
      inline def setSocketsVarargs(value: SSDPSocketOptions*): Self = StObject.set(x, "sockets", js.Array(value*))
      
      inline def setStart(value: Boolean): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setUdn(value: String): Self = StObject.set(x, "udn", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SSDPSocket extends Socket {
    
    var closed: Boolean = js.native
    
    var options: SSDPSocketOptions = js.native
    
    var `type`: udp4 | udp6 = js.native
  }
  
  trait SSDPSocketOptions extends StObject {
    
    var bind: NetworkAddress
    
    var broadcast: NetworkAddress
    
    var maxHops: Double
    
    var `type`: udp4 | udp6
  }
  object SSDPSocketOptions {
    
    inline def apply(bind: NetworkAddress, broadcast: NetworkAddress, maxHops: Double, `type`: udp4 | udp6): SSDPSocketOptions = {
      val __obj = js.Dynamic.literal(bind = bind.asInstanceOf[js.Any], broadcast = broadcast.asInstanceOf[js.Any], maxHops = maxHops.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SSDPSocketOptions]
    }
    
    extension [Self <: SSDPSocketOptions](x: Self) {
      
      inline def setBind(value: NetworkAddress): Self = StObject.set(x, "bind", value.asInstanceOf[js.Any])
      
      inline def setBroadcast(value: NetworkAddress): Self = StObject.set(x, "broadcast", value.asInstanceOf[js.Any])
      
      inline def setMaxHops(value: Double): Self = StObject.set(x, "maxHops", value.asInstanceOf[js.Any])
      
      inline def setType(value: udp4 | udp6): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait SearchMessage extends StObject {
    
    var LOCATION: String
    
    var ST: String
    
    var USN: String
    
    def ttl(): Double
  }
  object SearchMessage {
    
    inline def apply(LOCATION: String, ST: String, USN: String, ttl: CallbackTo[Double]): SearchMessage = {
      val __obj = js.Dynamic.literal(LOCATION = LOCATION.asInstanceOf[js.Any], ST = ST.asInstanceOf[js.Any], USN = USN.asInstanceOf[js.Any], ttl = ttl.toJsFn)
      __obj.asInstanceOf[SearchMessage]
    }
    
    extension [Self <: SearchMessage](x: Self) {
      
      inline def setLOCATION(value: String): Self = StObject.set(x, "LOCATION", value.asInstanceOf[js.Any])
      
      inline def setST(value: String): Self = StObject.set(x, "ST", value.asInstanceOf[js.Any])
      
      inline def setTtl(value: CallbackTo[Double]): Self = StObject.set(x, "ttl", value.toJsFn)
      
      inline def setUSN(value: String): Self = StObject.set(x, "USN", value.asInstanceOf[js.Any])
    }
  }
  
  trait Service[DeviceDescription] extends StObject {
    
    var details: DeviceDescription
    
    var expires: Double
    
    var location: URL
    
    var serviceType: String
    
    var uniqueServiceName: String
  }
  object Service {
    
    inline def apply[DeviceDescription](
      details: DeviceDescription,
      expires: Double,
      location: URL,
      serviceType: String,
      uniqueServiceName: String
    ): Service[DeviceDescription] = {
      val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], serviceType = serviceType.asInstanceOf[js.Any], uniqueServiceName = uniqueServiceName.asInstanceOf[js.Any])
      __obj.asInstanceOf[Service[DeviceDescription]]
    }
    
    extension [Self <: Service[?], DeviceDescription](x: Self & Service[DeviceDescription]) {
      
      inline def setDetails(value: DeviceDescription): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      inline def setExpires(value: Double): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: URL): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setServiceType(value: String): Self = StObject.set(x, "serviceType", value.asInstanceOf[js.Any])
      
      inline def setUniqueServiceName(value: String): Self = StObject.set(x, "uniqueServiceName", value.asInstanceOf[js.Any])
    }
  }
}
