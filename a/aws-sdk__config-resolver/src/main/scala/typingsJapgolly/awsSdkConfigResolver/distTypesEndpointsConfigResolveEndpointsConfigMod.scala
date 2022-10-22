package typingsJapgolly.awsSdkConfigResolver

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.URL
import typingsJapgolly.awsSdkTypes.distTypesHttpMod.Endpoint
import typingsJapgolly.awsSdkTypes.distTypesUtilMod.Provider
import typingsJapgolly.awsSdkTypes.distTypesUtilMod.RegionInfo
import typingsJapgolly.awsSdkTypes.distTypesUtilMod.RegionInfoProvider
import typingsJapgolly.awsSdkTypes.distTypesUtilMod.RegionInfoProviderOptions
import typingsJapgolly.awsSdkTypes.distTypesUtilMod.UrlParser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesEndpointsConfigResolveEndpointsConfigMod {
  
  @JSImport("@aws-sdk/config-resolver/dist-types/endpointsConfig/resolveEndpointsConfig", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolveEndpointsConfig[T](input: T & EndpointsInputConfig & PreviouslyResolved): T & EndpointsResolvedConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveEndpointsConfig")(input.asInstanceOf[js.Any]).asInstanceOf[T & EndpointsResolvedConfig]
  
  trait EndpointsInputConfig extends StObject {
    
    /**
      * The fully qualified endpoint of the webservice. This is only required when using
      * a custom endpoint (for example, when using a local version of S3).
      */
    var endpoint: js.UndefOr[String | Endpoint | Provider[Endpoint]] = js.undefined
    
    /**
      * Whether TLS is enabled for requests.
      */
    var tls: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enables IPv6/IPv4 dualstack endpoint.
      */
    var useDualstackEndpoint: js.UndefOr[Boolean | Provider[Boolean]] = js.undefined
  }
  object EndpointsInputConfig {
    
    inline def apply(): EndpointsInputConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EndpointsInputConfig]
    }
    
    extension [Self <: EndpointsInputConfig](x: Self) {
      
      inline def setEndpoint(value: String | Endpoint | Provider[Endpoint]): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      inline def setEndpointCallbackTo(value: CallbackTo[js.Promise[Endpoint]]): Self = StObject.set(x, "endpoint", value.toJsFn)
      
      inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
      
      inline def setTls(value: Boolean): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
      
      inline def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
      
      inline def setUseDualstackEndpoint(value: Boolean | Provider[Boolean]): Self = StObject.set(x, "useDualstackEndpoint", value.asInstanceOf[js.Any])
      
      inline def setUseDualstackEndpointCallbackTo(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "useDualstackEndpoint", value.toJsFn)
      
      inline def setUseDualstackEndpointUndefined: Self = StObject.set(x, "useDualstackEndpoint", js.undefined)
    }
  }
  
  /* Inlined parent std.Required<@aws-sdk/config-resolver.@aws-sdk/config-resolver/dist-types/endpointsConfig/resolveEndpointsConfig.EndpointsInputConfig> */
  trait EndpointsResolvedConfig extends StObject {
    
    /**
      * Resolved value for input {@link EndpointsInputConfig.endpoint}
      */
    def endpoint(): js.Promise[Endpoint]
    /**
      * Resolved value for input {@link EndpointsInputConfig.endpoint}
      */
    @JSName("endpoint")
    var endpoint_Original: Provider[Endpoint]
    
    /**
      * Whether the endpoint is specified by caller.
      * @internal
      */
    var isCustomEndpoint: Boolean
    
    var tls: Boolean
    
    /**
      * Resolved value for input {@link EndpointsInputConfig.useDualstackEndpoint}
      */
    def useDualstackEndpoint(): js.Promise[Boolean]
    /**
      * Resolved value for input {@link EndpointsInputConfig.useDualstackEndpoint}
      */
    @JSName("useDualstackEndpoint")
    var useDualstackEndpoint_Original: Provider[Boolean]
  }
  object EndpointsResolvedConfig {
    
    inline def apply(
      endpoint: CallbackTo[js.Promise[Endpoint]],
      isCustomEndpoint: Boolean,
      tls: Boolean,
      useDualstackEndpoint: CallbackTo[js.Promise[Boolean]]
    ): EndpointsResolvedConfig = {
      val __obj = js.Dynamic.literal(endpoint = endpoint.toJsFn, isCustomEndpoint = isCustomEndpoint.asInstanceOf[js.Any], tls = tls.asInstanceOf[js.Any], useDualstackEndpoint = useDualstackEndpoint.toJsFn)
      __obj.asInstanceOf[EndpointsResolvedConfig]
    }
    
    extension [Self <: EndpointsResolvedConfig](x: Self) {
      
      inline def setEndpoint(value: CallbackTo[js.Promise[Endpoint]]): Self = StObject.set(x, "endpoint", value.toJsFn)
      
      inline def setIsCustomEndpoint(value: Boolean): Self = StObject.set(x, "isCustomEndpoint", value.asInstanceOf[js.Any])
      
      inline def setTls(value: Boolean): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
      
      inline def setUseDualstackEndpoint(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "useDualstackEndpoint", value.toJsFn)
    }
  }
  
  trait PreviouslyResolved extends StObject {
    
    def region(): js.Promise[String]
    
    def regionInfoProvider(region: String): js.Promise[js.UndefOr[RegionInfo]]
    def regionInfoProvider(region: String, options: RegionInfoProviderOptions): js.Promise[js.UndefOr[RegionInfo]]
    @JSName("regionInfoProvider")
    var regionInfoProvider_Original: RegionInfoProvider
    
    @JSName("region")
    var region_Original: Provider[String]
    
    def urlParser(url: String): Endpoint
    def urlParser(url: URL): Endpoint
    @JSName("urlParser")
    var urlParser_Original: UrlParser
    
    def useFipsEndpoint(): js.Promise[Boolean]
    @JSName("useFipsEndpoint")
    var useFipsEndpoint_Original: Provider[Boolean]
  }
  object PreviouslyResolved {
    
    inline def apply(
      region: CallbackTo[js.Promise[String]],
      regionInfoProvider: (/* region */ String, /* options */ js.UndefOr[RegionInfoProviderOptions]) => js.Promise[js.UndefOr[RegionInfo]],
      urlParser: /* url */ String | URL => Endpoint,
      useFipsEndpoint: CallbackTo[js.Promise[Boolean]]
    ): PreviouslyResolved = {
      val __obj = js.Dynamic.literal(region = region.toJsFn, regionInfoProvider = js.Any.fromFunction2(regionInfoProvider), urlParser = js.Any.fromFunction1(urlParser), useFipsEndpoint = useFipsEndpoint.toJsFn)
      __obj.asInstanceOf[PreviouslyResolved]
    }
    
    extension [Self <: PreviouslyResolved](x: Self) {
      
      inline def setRegion(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "region", value.toJsFn)
      
      inline def setRegionInfoProvider(
        value: (/* region */ String, /* options */ js.UndefOr[RegionInfoProviderOptions]) => js.Promise[js.UndefOr[RegionInfo]]
      ): Self = StObject.set(x, "regionInfoProvider", js.Any.fromFunction2(value))
      
      inline def setUrlParser(value: /* url */ String | URL => Endpoint): Self = StObject.set(x, "urlParser", js.Any.fromFunction1(value))
      
      inline def setUseFipsEndpoint(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "useFipsEndpoint", value.toJsFn)
    }
  }
}
