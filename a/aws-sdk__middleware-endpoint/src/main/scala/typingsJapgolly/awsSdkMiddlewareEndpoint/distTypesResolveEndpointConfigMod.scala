package typingsJapgolly.awsSdkMiddlewareEndpoint

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.URL
import typingsJapgolly.awsSdkMiddlewareEndpoint.anon.Logger
import typingsJapgolly.awsSdkTypes.distTypesEndpointMod.EndpointParameters
import typingsJapgolly.awsSdkTypes.distTypesEndpointMod.EndpointV2
import typingsJapgolly.awsSdkTypes.distTypesHttpMod.Endpoint
import typingsJapgolly.awsSdkTypes.distTypesUtilMod.Provider
import typingsJapgolly.awsSdkTypes.distTypesUtilMod.UrlParser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResolveEndpointConfigMod {
  
  @JSImport("@aws-sdk/middleware-endpoint/dist-types/resolveEndpointConfig", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolveEndpointConfig[T, P /* <: EndpointParameters */](input: T & EndpointInputConfig[P] & PreviouslyResolved[P]): T & EndpointResolvedConfig[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveEndpointConfig")(input.asInstanceOf[js.Any]).asInstanceOf[T & EndpointResolvedConfig[P]]
  
  trait EndpointInputConfig[T /* <: EndpointParameters */] extends StObject {
    
    /**
      * The fully qualified endpoint of the webservice. This is only required when using
      * a custom endpoint (for example, when using a local version of S3).
      */
    var endpoint: js.UndefOr[String | Endpoint | (Provider[Endpoint | EndpointV2]) | EndpointV2] = js.undefined
    
    var endpointProvider: js.UndefOr[js.Function2[/* params */ T, /* context */ js.UndefOr[Logger], EndpointV2]] = js.undefined
    
    /**
      * Whether TLS is enabled for requests.
      * @deprecated
      */
    var tls: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enables IPv6/IPv4 dualstack endpoint.
      */
    var useDualstackEndpoint: js.UndefOr[Boolean | Provider[Boolean]] = js.undefined
    
    /**
      * Enables FIPS compatible endpoints.
      */
    var useFipsEndpoint: js.UndefOr[Boolean | Provider[Boolean]] = js.undefined
  }
  object EndpointInputConfig {
    
    inline def apply[T /* <: EndpointParameters */](): EndpointInputConfig[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EndpointInputConfig[T]]
    }
    
    extension [Self <: EndpointInputConfig[?], T /* <: EndpointParameters */](x: Self & EndpointInputConfig[T]) {
      
      inline def setEndpoint(value: String | Endpoint | (Provider[Endpoint | EndpointV2]) | EndpointV2): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      inline def setEndpointCallbackTo(value: CallbackTo[js.Promise[Endpoint | EndpointV2]]): Self = StObject.set(x, "endpoint", value.toJsFn)
      
      inline def setEndpointProvider(value: (/* params */ T, /* context */ js.UndefOr[Logger]) => EndpointV2): Self = StObject.set(x, "endpointProvider", js.Any.fromFunction2(value))
      
      inline def setEndpointProviderUndefined: Self = StObject.set(x, "endpointProvider", js.undefined)
      
      inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
      
      inline def setTls(value: Boolean): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
      
      inline def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
      
      inline def setUseDualstackEndpoint(value: Boolean | Provider[Boolean]): Self = StObject.set(x, "useDualstackEndpoint", value.asInstanceOf[js.Any])
      
      inline def setUseDualstackEndpointCallbackTo(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "useDualstackEndpoint", value.toJsFn)
      
      inline def setUseDualstackEndpointUndefined: Self = StObject.set(x, "useDualstackEndpoint", js.undefined)
      
      inline def setUseFipsEndpoint(value: Boolean | Provider[Boolean]): Self = StObject.set(x, "useFipsEndpoint", value.asInstanceOf[js.Any])
      
      inline def setUseFipsEndpointCallbackTo(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "useFipsEndpoint", value.toJsFn)
      
      inline def setUseFipsEndpointUndefined: Self = StObject.set(x, "useFipsEndpoint", js.undefined)
    }
  }
  
  @js.native
  trait EndpointResolvedConfig[T /* <: EndpointParameters */] extends StObject {
    
    /**
      * Resolved value for input {@link EndpointsInputConfig.endpoint}
      * @deprecated Use {@link EndpointResolvedConfig.endpointProvider} instead
      */
    def endpoint(): js.Promise[Endpoint] = js.native
    
    def endpointProvider(params: T): EndpointV2 = js.native
    def endpointProvider(params: T, context: Logger): EndpointV2 = js.native
    
    /**
      * Resolved value for input {@link EndpointsInputConfig.endpoint}
      * @deprecated Use {@link EndpointResolvedConfig.endpointProvider} instead
      */
    @JSName("endpoint")
    var endpoint_Original: Provider[Endpoint] = js.native
    
    /**
      * Whether the endpoint is specified by caller.
      * @internal
      * @deprecated
      */
    var isCustomEndpoint: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether TLS is enabled for requests.
      * @deprecated
      */
    var tls: Boolean = js.native
    
    /**
      * Resolved value for input {@link EndpointsInputConfig.useDualstackEndpoint}
      */
    def useDualstackEndpoint(): js.Promise[Boolean] = js.native
    /**
      * Resolved value for input {@link EndpointsInputConfig.useDualstackEndpoint}
      */
    @JSName("useDualstackEndpoint")
    var useDualstackEndpoint_Original: Provider[Boolean] = js.native
    
    /**
      * Resolved value for input {@link EndpointsInputConfig.useFipsEndpoint}
      */
    def useFipsEndpoint(): js.Promise[Boolean] = js.native
    /**
      * Resolved value for input {@link EndpointsInputConfig.useFipsEndpoint}
      */
    @JSName("useFipsEndpoint")
    var useFipsEndpoint_Original: Provider[Boolean] = js.native
  }
  
  @js.native
  trait PreviouslyResolved[T /* <: EndpointParameters */] extends StObject {
    
    def endpointProvider(params: T): EndpointV2 = js.native
    def endpointProvider(params: T, context: Logger): EndpointV2 = js.native
    
    var logger: js.UndefOr[typingsJapgolly.awsSdkTypes.distTypesLoggerMod.Logger] = js.native
    
    def region(): js.Promise[String] = js.native
    @JSName("region")
    var region_Original: Provider[String] = js.native
    
    def urlParser(url: String): Endpoint = js.native
    def urlParser(url: URL): Endpoint = js.native
    @JSName("urlParser")
    var urlParser_Original: UrlParser = js.native
  }
}
