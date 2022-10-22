package typingsJapgolly.achingbrainNatPortMapper

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.achingbrainNatPortMapper.distSrcUpnpDeviceMod.InternetGatewayDevice
import typingsJapgolly.achingbrainSsdp.mod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcDiscoveryMod {
  
  @JSImport("@achingbrain/nat-port-mapper/dist/src/discovery", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def discoverGateway(): js.Function0[DiscoverGateway_] = ^.asInstanceOf[js.Dynamic].applyDynamic("discoverGateway")().asInstanceOf[js.Function0[DiscoverGateway_]]
  inline def discoverGateway(options: DiscoveryOptions): js.Function0[DiscoverGateway_] = ^.asInstanceOf[js.Dynamic].applyDynamic("discoverGateway")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function0[DiscoverGateway_]]
  
  trait DiscoverGateway_ extends StObject {
    
    def cancel(): js.Promise[Unit]
    
    def gateway(): js.Promise[Service[InternetGatewayDevice]]
  }
  object DiscoverGateway_ {
    
    inline def apply(
      cancel: CallbackTo[js.Promise[Unit]],
      gateway: CallbackTo[js.Promise[Service[InternetGatewayDevice]]]
    ): DiscoverGateway_ = {
      val __obj = js.Dynamic.literal(cancel = cancel.toJsFn, gateway = gateway.toJsFn)
      __obj.asInstanceOf[DiscoverGateway_]
    }
    
    extension [Self <: DiscoverGateway_](x: Self) {
      
      inline def setCancel(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "cancel", value.toJsFn)
      
      inline def setGateway(value: CallbackTo[js.Promise[Service[InternetGatewayDevice]]]): Self = StObject.set(x, "gateway", value.toJsFn)
    }
  }
  
  trait DiscoveryOptions extends StObject {
    
    /**
      * Only search the network for this long
      */
    var discoveryTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * Do not search the network for a gateway, use this instead
      */
    var gateway: js.UndefOr[String] = js.undefined
    
    /**
      * Rediscover gateway after this number of ms
      */
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object DiscoveryOptions {
    
    inline def apply(): DiscoveryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DiscoveryOptions]
    }
    
    extension [Self <: DiscoveryOptions](x: Self) {
      
      inline def setDiscoveryTimeout(value: Double): Self = StObject.set(x, "discoveryTimeout", value.asInstanceOf[js.Any])
      
      inline def setDiscoveryTimeoutUndefined: Self = StObject.set(x, "discoveryTimeout", js.undefined)
      
      inline def setGateway(value: String): Self = StObject.set(x, "gateway", value.asInstanceOf[js.Any])
      
      inline def setGatewayUndefined: Self = StObject.set(x, "gateway", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
