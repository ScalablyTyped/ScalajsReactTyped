package typingsJapgolly.awsSdkTypes

import org.scalajs.dom.URL
import typingsJapgolly.awsSdkTypes.anon.ForceRefresh
import typingsJapgolly.awsSdkTypes.distTypesHttpMod.Endpoint
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.FinalizeHandler
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.FinalizeHandlerArguments
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.FinalizeHandlerOutput
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.MetadataBearer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilMod {
  
  type BodyLengthCalculator = js.Function1[/* body */ Any, js.UndefOr[Double]]
  
  type Decoder = js.Function1[/* input */ String, js.typedarray.Uint8Array]
  
  type Encoder = js.Function1[/* input */ js.typedarray.Uint8Array, String]
  
  type MemoizedProvider[T] = js.Function1[/* options */ js.UndefOr[ForceRefresh], js.Promise[T]]
  
  type Provider[T] = js.Function0[js.Promise[T]]
  
  trait RegionInfo extends StObject {
    
    var hostname: String
    
    var partition: String
    
    var path: js.UndefOr[String] = js.undefined
    
    var signingRegion: js.UndefOr[String] = js.undefined
    
    var signingService: js.UndefOr[String] = js.undefined
  }
  object RegionInfo {
    
    inline def apply(hostname: String, partition: String): RegionInfo = {
      val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any], partition = partition.asInstanceOf[js.Any])
      __obj.asInstanceOf[RegionInfo]
    }
    
    extension [Self <: RegionInfo](x: Self) {
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setPartition(value: String): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setSigningRegion(value: String): Self = StObject.set(x, "signingRegion", value.asInstanceOf[js.Any])
      
      inline def setSigningRegionUndefined: Self = StObject.set(x, "signingRegion", js.undefined)
      
      inline def setSigningService(value: String): Self = StObject.set(x, "signingService", value.asInstanceOf[js.Any])
      
      inline def setSigningServiceUndefined: Self = StObject.set(x, "signingService", js.undefined)
    }
  }
  
  type RegionInfoProvider = js.Function2[
    /* region */ String, 
    /* options */ js.UndefOr[RegionInfoProviderOptions], 
    js.Promise[js.UndefOr[RegionInfo]]
  ]
  
  trait RegionInfoProviderOptions extends StObject {
    
    /**
      * Enables IPv6/IPv4 dualstack endpoint.
      * @default false
      */
    var useDualstackEndpoint: Boolean
    
    /**
      * Enables FIPS compatible endpoints.
      * @default false
      */
    var useFipsEndpoint: Boolean
  }
  object RegionInfoProviderOptions {
    
    inline def apply(useDualstackEndpoint: Boolean, useFipsEndpoint: Boolean): RegionInfoProviderOptions = {
      val __obj = js.Dynamic.literal(useDualstackEndpoint = useDualstackEndpoint.asInstanceOf[js.Any], useFipsEndpoint = useFipsEndpoint.asInstanceOf[js.Any])
      __obj.asInstanceOf[RegionInfoProviderOptions]
    }
    
    extension [Self <: RegionInfoProviderOptions](x: Self) {
      
      inline def setUseDualstackEndpoint(value: Boolean): Self = StObject.set(x, "useDualstackEndpoint", value.asInstanceOf[js.Any])
      
      inline def setUseFipsEndpoint(value: Boolean): Self = StObject.set(x, "useFipsEndpoint", value.asInstanceOf[js.Any])
    }
  }
  
  trait RetryStrategy extends StObject {
    
    /**
      * The retry mode describing how the retry strategy control the traffic flow.
      */
    var mode: js.UndefOr[String] = js.undefined
    
    /**
      * the retry behavior the will invoke the next handler and handle the retry accordingly.
      * This function should also update the $metadata from the response accordingly.
      * @see {@link ResponseMetadata}
      */
    def retry[Input /* <: js.Object */, Output /* <: MetadataBearer */](next: FinalizeHandler[Input, Output], args: FinalizeHandlerArguments[Input]): js.Promise[FinalizeHandlerOutput[Output]]
  }
  object RetryStrategy {
    
    inline def apply(
      retry: (FinalizeHandler[Any, Any], FinalizeHandlerArguments[Any]) => js.Promise[FinalizeHandlerOutput[Any]]
    ): RetryStrategy = {
      val __obj = js.Dynamic.literal(retry = js.Any.fromFunction2(retry))
      __obj.asInstanceOf[RetryStrategy]
    }
    
    extension [Self <: RetryStrategy](x: Self) {
      
      inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setRetry(
        value: (FinalizeHandler[Any, Any], FinalizeHandlerArguments[Any]) => js.Promise[FinalizeHandlerOutput[Any]]
      ): Self = StObject.set(x, "retry", js.Any.fromFunction2(value))
    }
  }
  
  type UrlParser = js.Function1[/* url */ String | URL, Endpoint]
  
  type UserAgent = js.Array[UserAgentPair]
  
  type UserAgentPair = js.Tuple2[/* name */ String, /* version */ js.UndefOr[String]]
}
