package typingsJapgolly.grpcGrpcJs

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.grpcGrpcJs.buildSrcCallStreamMod.StatusObject
import typingsJapgolly.grpcGrpcJs.buildSrcChannelOptionsMod.ChannelOptions
import typingsJapgolly.grpcGrpcJs.buildSrcConstantsMod.Status
import typingsJapgolly.grpcGrpcJs.buildSrcFilterMod.Filter
import typingsJapgolly.grpcGrpcJs.buildSrcFilterMod.FilterFactory
import typingsJapgolly.grpcGrpcJs.buildSrcMetadataMod.Metadata
import typingsJapgolly.grpcGrpcJs.buildSrcServiceConfigMod.MethodConfig
import typingsJapgolly.grpcGrpcJs.buildSrcServiceConfigMod.ServiceConfig
import typingsJapgolly.grpcGrpcJs.buildSrcSubchannelAddressMod.SubchannelAddress
import typingsJapgolly.grpcGrpcJs.buildSrcUriParserMod.GrpcUri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcResolverMod {
  
  @JSImport("@grpc/grpc-js/build/src/resolver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createResolver(target: GrpcUri, listener: ResolverListener, options: ChannelOptions): Resolver = (^.asInstanceOf[js.Dynamic].applyDynamic("createResolver")(target.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Resolver]
  
  inline def getDefaultAuthority(target: GrpcUri): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultAuthority")(target.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def mapUriDefaultScheme(target: GrpcUri): GrpcUri | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("mapUriDefaultScheme")(target.asInstanceOf[js.Any]).asInstanceOf[GrpcUri | Null]
  
  inline def registerDefaultScheme(scheme: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerDefaultScheme")(scheme.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def registerResolver(scheme: String, resolverClass: ResolverConstructor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerResolver")(scheme.asInstanceOf[js.Any], resolverClass.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait CallConfig extends StObject {
    
    var dynamicFilterFactories: js.Array[FilterFactory[Filter]]
    
    var methodConfig: MethodConfig
    
    var onCommitted: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var pickInformation: StringDictionary[String]
    
    var status: Status
  }
  object CallConfig {
    
    inline def apply(
      dynamicFilterFactories: js.Array[FilterFactory[Filter]],
      methodConfig: MethodConfig,
      pickInformation: StringDictionary[String],
      status: Status
    ): CallConfig = {
      val __obj = js.Dynamic.literal(dynamicFilterFactories = dynamicFilterFactories.asInstanceOf[js.Any], methodConfig = methodConfig.asInstanceOf[js.Any], pickInformation = pickInformation.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[CallConfig]
    }
    
    extension [Self <: CallConfig](x: Self) {
      
      inline def setDynamicFilterFactories(value: js.Array[FilterFactory[Filter]]): Self = StObject.set(x, "dynamicFilterFactories", value.asInstanceOf[js.Any])
      
      inline def setDynamicFilterFactoriesVarargs(value: FilterFactory[Filter]*): Self = StObject.set(x, "dynamicFilterFactories", js.Array(value*))
      
      inline def setMethodConfig(value: MethodConfig): Self = StObject.set(x, "methodConfig", value.asInstanceOf[js.Any])
      
      inline def setOnCommitted(value: Callback): Self = StObject.set(x, "onCommitted", value.toJsFn)
      
      inline def setOnCommittedUndefined: Self = StObject.set(x, "onCommitted", js.undefined)
      
      inline def setPickInformation(value: StringDictionary[String]): Self = StObject.set(x, "pickInformation", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  type ConfigSelector = js.Function2[/* methodName */ String, /* metadata */ Metadata, CallConfig]
  
  trait Resolver extends StObject {
    
    /**
      * Destroy the resolver. Should be called when the owning channel shuts down.
      */
    def destroy(): Unit
    
    /**
      * Indicates that the caller wants new name resolution data. Calling this
      * function may eventually result in calling one of the `ResolverListener`
      * functions, but that is not guaranteed. Those functions will never be
      * called synchronously with the constructor or updateResolution.
      */
    def updateResolution(): Unit
  }
  object Resolver {
    
    inline def apply(destroy: Callback, updateResolution: Callback): Resolver = {
      val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, updateResolution = updateResolution.toJsFn)
      __obj.asInstanceOf[Resolver]
    }
    
    extension [Self <: Resolver](x: Self) {
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setUpdateResolution(value: Callback): Self = StObject.set(x, "updateResolution", value.toJsFn)
    }
  }
  
  @js.native
  trait ResolverConstructor
    extends StObject
       with Instantiable3[
          /* target */ GrpcUri, 
          /* listener */ ResolverListener, 
          /* channelOptions */ ChannelOptions, 
          Resolver
        ] {
    
    /**
      * Get the default authority for a target. This loosely corresponds to that
      * target's hostname. Throws an error if this resolver class cannot parse the
      * `target`.
      * @param target
      */
    def getDefaultAuthority(target: GrpcUri): String = js.native
  }
  
  @js.native
  trait ResolverListener extends StObject {
    
    /**
      * Called whenever a name resolution attempt fails.
      * @param error Describes how resolution failed
      */
    def onError(error: StatusObject): Unit = js.native
    
    def onSuccessfulResolution(
      addressList: js.Array[SubchannelAddress],
      serviceConfig: Null,
      serviceConfigError: Null,
      configSelector: Null,
      attributes: StringDictionary[Any]
    ): Unit = js.native
    def onSuccessfulResolution(
      addressList: js.Array[SubchannelAddress],
      serviceConfig: Null,
      serviceConfigError: Null,
      configSelector: ConfigSelector,
      attributes: StringDictionary[Any]
    ): Unit = js.native
    def onSuccessfulResolution(
      addressList: js.Array[SubchannelAddress],
      serviceConfig: Null,
      serviceConfigError: StatusObject,
      configSelector: Null,
      attributes: StringDictionary[Any]
    ): Unit = js.native
    def onSuccessfulResolution(
      addressList: js.Array[SubchannelAddress],
      serviceConfig: Null,
      serviceConfigError: StatusObject,
      configSelector: ConfigSelector,
      attributes: StringDictionary[Any]
    ): Unit = js.native
    def onSuccessfulResolution(
      addressList: js.Array[SubchannelAddress],
      serviceConfig: ServiceConfig,
      serviceConfigError: Null,
      configSelector: Null,
      attributes: StringDictionary[Any]
    ): Unit = js.native
    def onSuccessfulResolution(
      addressList: js.Array[SubchannelAddress],
      serviceConfig: ServiceConfig,
      serviceConfigError: Null,
      configSelector: ConfigSelector,
      attributes: StringDictionary[Any]
    ): Unit = js.native
    def onSuccessfulResolution(
      addressList: js.Array[SubchannelAddress],
      serviceConfig: ServiceConfig,
      serviceConfigError: StatusObject,
      configSelector: Null,
      attributes: StringDictionary[Any]
    ): Unit = js.native
    /**
      * Called whenever the resolver has new name resolution results to report
      * @param addressList The new list of backend addresses
      * @param serviceConfig The new service configuration corresponding to the
      *     `addressList`. Will be `null` if no service configuration was
      *     retrieved or if the service configuration was invalid
      * @param serviceConfigError If non-`null`, indicates that the retrieved
      *     service configuration was invalid
      */
    def onSuccessfulResolution(
      addressList: js.Array[SubchannelAddress],
      serviceConfig: ServiceConfig,
      serviceConfigError: StatusObject,
      configSelector: ConfigSelector,
      attributes: StringDictionary[Any]
    ): Unit = js.native
  }
}
