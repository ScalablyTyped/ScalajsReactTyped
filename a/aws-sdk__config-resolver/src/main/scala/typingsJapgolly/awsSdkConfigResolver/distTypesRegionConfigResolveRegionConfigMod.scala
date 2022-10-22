package typingsJapgolly.awsSdkConfigResolver

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.awsSdkTypes.distTypesUtilMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRegionConfigResolveRegionConfigMod {
  
  @JSImport("@aws-sdk/config-resolver/dist-types/regionConfig/resolveRegionConfig", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolveRegionConfig[T](input: T & RegionInputConfig & PreviouslyResolved): T & RegionResolvedConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveRegionConfig")(input.asInstanceOf[js.Any]).asInstanceOf[T & RegionResolvedConfig]
  
  trait PreviouslyResolved extends StObject
  
  trait RegionInputConfig extends StObject {
    
    /**
      * The AWS region to which this client will send requests
      */
    var region: js.UndefOr[String | Provider[String]] = js.undefined
    
    /**
      * Enables FIPS compatible endpoints.
      */
    var useFipsEndpoint: js.UndefOr[Boolean | Provider[Boolean]] = js.undefined
  }
  object RegionInputConfig {
    
    inline def apply(): RegionInputConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RegionInputConfig]
    }
    
    extension [Self <: RegionInputConfig](x: Self) {
      
      inline def setRegion(value: String | Provider[String]): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionCallbackTo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "region", value.toJsFn)
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setUseFipsEndpoint(value: Boolean | Provider[Boolean]): Self = StObject.set(x, "useFipsEndpoint", value.asInstanceOf[js.Any])
      
      inline def setUseFipsEndpointCallbackTo(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "useFipsEndpoint", value.toJsFn)
      
      inline def setUseFipsEndpointUndefined: Self = StObject.set(x, "useFipsEndpoint", js.undefined)
    }
  }
  
  trait RegionResolvedConfig extends StObject {
    
    /**
      * Resolved value for input config {@link RegionInputConfig.region}
      */
    def region(): js.Promise[String]
    /**
      * Resolved value for input config {@link RegionInputConfig.region}
      */
    @JSName("region")
    var region_Original: Provider[String]
    
    /**
      * Resolved value for input {@link RegionInputConfig.useFipsEndpoint}
      */
    def useFipsEndpoint(): js.Promise[Boolean]
    /**
      * Resolved value for input {@link RegionInputConfig.useFipsEndpoint}
      */
    @JSName("useFipsEndpoint")
    var useFipsEndpoint_Original: Provider[Boolean]
  }
  object RegionResolvedConfig {
    
    inline def apply(region: CallbackTo[js.Promise[String]], useFipsEndpoint: CallbackTo[js.Promise[Boolean]]): RegionResolvedConfig = {
      val __obj = js.Dynamic.literal(region = region.toJsFn, useFipsEndpoint = useFipsEndpoint.toJsFn)
      __obj.asInstanceOf[RegionResolvedConfig]
    }
    
    extension [Self <: RegionResolvedConfig](x: Self) {
      
      inline def setRegion(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "region", value.toJsFn)
      
      inline def setUseFipsEndpoint(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "useFipsEndpoint", value.toJsFn)
    }
  }
}
