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

object distTypesEndpointsConfigUtilsGetEndpointFromRegionMod {
  
  @JSImport("@aws-sdk/config-resolver/dist-types/endpointsConfig/utils/getEndpointFromRegion", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointFromRegion(input: GetEndpointFromRegionOptions): js.Promise[Endpoint] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointFromRegion")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Endpoint]]
  
  trait GetEndpointFromRegionOptions extends StObject {
    
    def region(): js.Promise[String]
    
    def regionInfoProvider(region: String): js.Promise[js.UndefOr[RegionInfo]]
    def regionInfoProvider(region: String, options: RegionInfoProviderOptions): js.Promise[js.UndefOr[RegionInfo]]
    @JSName("regionInfoProvider")
    var regionInfoProvider_Original: RegionInfoProvider
    
    @JSName("region")
    var region_Original: Provider[String]
    
    var tls: js.UndefOr[Boolean] = js.undefined
    
    def urlParser(url: String): Endpoint
    def urlParser(url: URL): Endpoint
    @JSName("urlParser")
    var urlParser_Original: UrlParser
    
    def useDualstackEndpoint(): js.Promise[Boolean]
    @JSName("useDualstackEndpoint")
    var useDualstackEndpoint_Original: Provider[Boolean]
    
    def useFipsEndpoint(): js.Promise[Boolean]
    @JSName("useFipsEndpoint")
    var useFipsEndpoint_Original: Provider[Boolean]
  }
  object GetEndpointFromRegionOptions {
    
    inline def apply(
      region: CallbackTo[js.Promise[String]],
      regionInfoProvider: (/* region */ String, /* options */ js.UndefOr[RegionInfoProviderOptions]) => js.Promise[js.UndefOr[RegionInfo]],
      urlParser: /* url */ String | URL => Endpoint,
      useDualstackEndpoint: CallbackTo[js.Promise[Boolean]],
      useFipsEndpoint: CallbackTo[js.Promise[Boolean]]
    ): GetEndpointFromRegionOptions = {
      val __obj = js.Dynamic.literal(region = region.toJsFn, regionInfoProvider = js.Any.fromFunction2(regionInfoProvider), urlParser = js.Any.fromFunction1(urlParser), useDualstackEndpoint = useDualstackEndpoint.toJsFn, useFipsEndpoint = useFipsEndpoint.toJsFn)
      __obj.asInstanceOf[GetEndpointFromRegionOptions]
    }
    
    extension [Self <: GetEndpointFromRegionOptions](x: Self) {
      
      inline def setRegion(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "region", value.toJsFn)
      
      inline def setRegionInfoProvider(
        value: (/* region */ String, /* options */ js.UndefOr[RegionInfoProviderOptions]) => js.Promise[js.UndefOr[RegionInfo]]
      ): Self = StObject.set(x, "regionInfoProvider", js.Any.fromFunction2(value))
      
      inline def setTls(value: Boolean): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
      
      inline def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
      
      inline def setUrlParser(value: /* url */ String | URL => Endpoint): Self = StObject.set(x, "urlParser", js.Any.fromFunction1(value))
      
      inline def setUseDualstackEndpoint(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "useDualstackEndpoint", value.toJsFn)
      
      inline def setUseFipsEndpoint(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "useFipsEndpoint", value.toJsFn)
    }
  }
}
