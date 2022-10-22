package typingsJapgolly.achingbrainNatPortMapper

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.achingbrainNatPortMapper.achingbrainNatPortMapperStrings.TCP
import typingsJapgolly.achingbrainNatPortMapper.achingbrainNatPortMapperStrings.UDP
import typingsJapgolly.achingbrainNatPortMapper.anon.PartialMapPortOptions
import typingsJapgolly.achingbrainNatPortMapper.anon.PartialNatAPIOptions
import typingsJapgolly.achingbrainNatPortMapper.anon.PartialUnmapPortOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@achingbrain/nat-port-mapper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@achingbrain/nat-port-mapper", "NatAPI")
  @js.native
  open class NatAPI protected () extends StObject {
    def this(opts: Unit, client: Client) = this()
    def this(opts: NatAPIOptions, client: Client) = this()
    
    /* private */ val client: Any = js.native
    
    def close(): js.Promise[Unit] = js.native
    
    /* private */ val description: Any = js.native
    
    /* private */ val destroyed: Any = js.native
    
    def externalIp(): js.Promise[String] = js.native
    
    /* private */ val gateway: Any = js.native
    
    /* private */ val keepAlive: Any = js.native
    
    /* private */ val keepAliveInterval: Any = js.native
    
    def map(): js.Promise[Unit] = js.native
    def map(options: PartialMapPortOptions): js.Promise[Unit] = js.native
    
    /* private */ var openPorts: Any = js.native
    
    /* private */ val ttl: Any = js.native
    
    def unmap(options: PartialUnmapPortOptions): js.Promise[Unit] = js.native
    
    /* private */ val updateIntervals: Any = js.native
    
    def validateInput(): MapPortOptions = js.native
    def validateInput(options: PartialMapPortOptions): MapPortOptions = js.native
  }
  
  inline def pmpNat(): js.Promise[NatAPI] = ^.asInstanceOf[js.Dynamic].applyDynamic("pmpNat")().asInstanceOf[js.Promise[NatAPI]]
  inline def pmpNat(options: PartialNatAPIOptions): js.Promise[NatAPI] = ^.asInstanceOf[js.Dynamic].applyDynamic("pmpNat")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[NatAPI]]
  
  inline def upnpNat(): js.Promise[NatAPI] = ^.asInstanceOf[js.Dynamic].applyDynamic("upnpNat")().asInstanceOf[js.Promise[NatAPI]]
  inline def upnpNat(options: PartialNatAPIOptions): js.Promise[NatAPI] = ^.asInstanceOf[js.Dynamic].applyDynamic("upnpNat")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[NatAPI]]
  
  trait Client extends StObject {
    
    def close(): js.Promise[Unit]
    
    def externalIp(): js.Promise[String]
    
    def map(options: MapPortOptions): js.Promise[Unit]
    
    def unmap(options: UnmapPortOptions): js.Promise[Unit]
  }
  object Client {
    
    inline def apply(
      close: CallbackTo[js.Promise[Unit]],
      externalIp: CallbackTo[js.Promise[String]],
      map: MapPortOptions => js.Promise[Unit],
      unmap: UnmapPortOptions => js.Promise[Unit]
    ): Client = {
      val __obj = js.Dynamic.literal(close = close.toJsFn, externalIp = externalIp.toJsFn, map = js.Any.fromFunction1(map), unmap = js.Any.fromFunction1(unmap))
      __obj.asInstanceOf[Client]
    }
    
    extension [Self <: Client](x: Self) {
      
      inline def setClose(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "close", value.toJsFn)
      
      inline def setExternalIp(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "externalIp", value.toJsFn)
      
      inline def setMap(value: MapPortOptions => js.Promise[Unit]): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
      
      inline def setUnmap(value: UnmapPortOptions => js.Promise[Unit]): Self = StObject.set(x, "unmap", js.Any.fromFunction1(value))
    }
  }
  
  trait MapPortOptions extends StObject {
    
    var description: String
    
    var gateway: js.UndefOr[String] = js.undefined
    
    var localAddress: String
    
    var localPort: Double
    
    var protocol: TCP | UDP
    
    var publicPort: Double
    
    var ttl: Double
  }
  object MapPortOptions {
    
    inline def apply(
      description: String,
      localAddress: String,
      localPort: Double,
      protocol: TCP | UDP,
      publicPort: Double,
      ttl: Double
    ): MapPortOptions = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], localAddress = localAddress.asInstanceOf[js.Any], localPort = localPort.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], publicPort = publicPort.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
      __obj.asInstanceOf[MapPortOptions]
    }
    
    extension [Self <: MapPortOptions](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setGateway(value: String): Self = StObject.set(x, "gateway", value.asInstanceOf[js.Any])
      
      inline def setGatewayUndefined: Self = StObject.set(x, "gateway", js.undefined)
      
      inline def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
      
      inline def setLocalPort(value: Double): Self = StObject.set(x, "localPort", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: TCP | UDP): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setPublicPort(value: Double): Self = StObject.set(x, "publicPort", value.asInstanceOf[js.Any])
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    }
  }
  
  trait NatAPIOptions extends StObject {
    
    var description: js.UndefOr[String] = js.undefined
    
    var gateway: js.UndefOr[String] = js.undefined
    
    var keepAlive: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Minimum 20 minutes, default 2 hours
      */
    var ttl: js.UndefOr[Double] = js.undefined
  }
  object NatAPIOptions {
    
    inline def apply(): NatAPIOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NatAPIOptions]
    }
    
    extension [Self <: NatAPIOptions](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setGateway(value: String): Self = StObject.set(x, "gateway", value.asInstanceOf[js.Any])
      
      inline def setGatewayUndefined: Self = StObject.set(x, "gateway", js.undefined)
      
      inline def setKeepAlive(value: Boolean): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
      
      inline def setKeepAliveUndefined: Self = StObject.set(x, "keepAlive", js.undefined)
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    }
  }
  
  trait UnmapPortOptions extends StObject {
    
    var localPort: Double
    
    var protocol: TCP | UDP
    
    var publicPort: Double
  }
  object UnmapPortOptions {
    
    inline def apply(localPort: Double, protocol: TCP | UDP, publicPort: Double): UnmapPortOptions = {
      val __obj = js.Dynamic.literal(localPort = localPort.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], publicPort = publicPort.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmapPortOptions]
    }
    
    extension [Self <: UnmapPortOptions](x: Self) {
      
      inline def setLocalPort(value: Double): Self = StObject.set(x, "localPort", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: TCP | UDP): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setPublicPort(value: Double): Self = StObject.set(x, "publicPort", value.asInstanceOf[js.Any])
    }
  }
}
