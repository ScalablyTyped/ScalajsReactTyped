package typingsJapgolly.grpcGrpcJs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.grpcGrpcJs.anon.PartialChannelControlHelp
import typingsJapgolly.grpcGrpcJs.buildSrcChannelOptionsMod.ChannelOptions
import typingsJapgolly.grpcGrpcJs.buildSrcChannelzMod.ChannelRef
import typingsJapgolly.grpcGrpcJs.buildSrcChannelzMod.SubchannelRef
import typingsJapgolly.grpcGrpcJs.buildSrcConnectivityStateMod.ConnectivityState
import typingsJapgolly.grpcGrpcJs.buildSrcPickerMod.Picker
import typingsJapgolly.grpcGrpcJs.buildSrcSubchannelAddressMod.SubchannelAddress
import typingsJapgolly.grpcGrpcJs.buildSrcSubchannelInterfaceMod.SubchannelInterface
import typingsJapgolly.grpcGrpcJs.grpcGrpcJsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcLoadBalancerMod {
  
  @JSImport("@grpc/grpc-js/build/src/load-balancer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createChildChannelControlHelper(parent: ChannelControlHelper, overrides: PartialChannelControlHelp): ChannelControlHelper = (^.asInstanceOf[js.Dynamic].applyDynamic("createChildChannelControlHelper")(parent.asInstanceOf[js.Any], overrides.asInstanceOf[js.Any])).asInstanceOf[ChannelControlHelper]
  
  inline def createLoadBalancer(config: LoadBalancingConfig, channelControlHelper: ChannelControlHelper): LoadBalancer | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("createLoadBalancer")(config.asInstanceOf[js.Any], channelControlHelper.asInstanceOf[js.Any])).asInstanceOf[LoadBalancer | Null]
  
  inline def getFirstUsableConfig(configs: js.Array[LoadBalancingConfig]): LoadBalancingConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirstUsableConfig")(configs.asInstanceOf[js.Any]).asInstanceOf[LoadBalancingConfig]
  
  inline def getFirstUsableConfig_true(configs: js.Array[LoadBalancingConfig], fallbackTodefault: `true`): LoadBalancingConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("getFirstUsableConfig")(configs.asInstanceOf[js.Any], fallbackTodefault.asInstanceOf[js.Any])).asInstanceOf[LoadBalancingConfig]
  
  inline def isLoadBalancerNameRegistered(typeName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLoadBalancerNameRegistered")(typeName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def registerDefaultLoadBalancerType(typeName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerDefaultLoadBalancerType")(typeName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def registerLoadBalancerType(
    typeName: String,
    loadBalancerType: LoadBalancerConstructor,
    loadBalancingConfigType: LoadBalancingConfigConstructor
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerLoadBalancerType")(typeName.asInstanceOf[js.Any], loadBalancerType.asInstanceOf[js.Any], loadBalancingConfigType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def validateLoadBalancingConfig(obj: Any): LoadBalancingConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("validateLoadBalancingConfig")(obj.asInstanceOf[js.Any]).asInstanceOf[LoadBalancingConfig]
  
  @js.native
  trait ChannelControlHelper extends StObject {
    
    def addChannelzChild(child: ChannelRef): Unit = js.native
    def addChannelzChild(child: SubchannelRef): Unit = js.native
    
    /**
      * Returns a subchannel connected to the specified address.
      * @param subchannelAddress The address to connect to
      * @param subchannelArgs Extra channel arguments specified by the load balancer
      */
    def createSubchannel(subchannelAddress: SubchannelAddress, subchannelArgs: ChannelOptions): SubchannelInterface = js.native
    
    def removeChannelzChild(child: ChannelRef): Unit = js.native
    def removeChannelzChild(child: SubchannelRef): Unit = js.native
    
    /**
      * Request new data from the resolver.
      */
    def requestReresolution(): Unit = js.native
    
    /**
      * Passes a new subchannel picker up to the channel. This is called if either
      * the connectivity state changes or if a different picker is needed for any
      * other reason.
      * @param connectivityState New connectivity state
      * @param picker New picker
      */
    def updateState(connectivityState: ConnectivityState, picker: Picker): Unit = js.native
  }
  
  trait LoadBalancer extends StObject {
    
    /**
      * The load balancer unrefs all of its subchannels and stops calling methods
      * of its channel control helper.
      */
    def destroy(): Unit
    
    /**
      * If the load balancer is currently in the IDLE state, start connecting.
      */
    def exitIdle(): Unit
    
    /**
      * Get the type name for this load balancer type. Must be constant across an
      * entire load balancer implementation class and must match the name that the
      * balancer implementation class was registered with.
      */
    def getTypeName(): String
    
    /**
      * If the load balancer is currently in the CONNECTING or TRANSIENT_FAILURE
      * state, reset the current connection backoff timeout to its base value and
      * transition to CONNECTING if in TRANSIENT_FAILURE.
      */
    def resetBackoff(): Unit
    
    /**
      * Gives the load balancer a new list of addresses to start connecting to.
      * The load balancer will start establishing connections with the new list,
      * but will continue using any existing connections until the new connections
      * are established
      * @param addressList The new list of addresses to connect to
      * @param lbConfig The load balancing config object from the service config,
      *     if one was provided
      */
    def updateAddressList(
      addressList: js.Array[SubchannelAddress],
      lbConfig: LoadBalancingConfig,
      attributes: StringDictionary[Any]
    ): Unit
  }
  object LoadBalancer {
    
    inline def apply(
      destroy: Callback,
      exitIdle: Callback,
      getTypeName: CallbackTo[String],
      resetBackoff: Callback,
      updateAddressList: (js.Array[SubchannelAddress], LoadBalancingConfig, StringDictionary[Any]) => Callback
    ): LoadBalancer = {
      val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, exitIdle = exitIdle.toJsFn, getTypeName = getTypeName.toJsFn, resetBackoff = resetBackoff.toJsFn, updateAddressList = js.Any.fromFunction3((t0: js.Array[SubchannelAddress], t1: LoadBalancingConfig, t2: StringDictionary[Any]) => (updateAddressList(t0, t1, t2)).runNow()))
      __obj.asInstanceOf[LoadBalancer]
    }
    
    extension [Self <: LoadBalancer](x: Self) {
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setExitIdle(value: Callback): Self = StObject.set(x, "exitIdle", value.toJsFn)
      
      inline def setGetTypeName(value: CallbackTo[String]): Self = StObject.set(x, "getTypeName", value.toJsFn)
      
      inline def setResetBackoff(value: Callback): Self = StObject.set(x, "resetBackoff", value.toJsFn)
      
      inline def setUpdateAddressList(value: (js.Array[SubchannelAddress], LoadBalancingConfig, StringDictionary[Any]) => Callback): Self = StObject.set(x, "updateAddressList", js.Any.fromFunction3((t0: js.Array[SubchannelAddress], t1: LoadBalancingConfig, t2: StringDictionary[Any]) => (value(t0, t1, t2)).runNow()))
    }
  }
  
  @js.native
  trait LoadBalancerConstructor
    extends StObject
       with Instantiable1[/* channelControlHelper */ ChannelControlHelper, LoadBalancer]
  
  trait LoadBalancingConfig extends StObject {
    
    def getLoadBalancerName(): String
    
    def toJsonObject(): js.Object
  }
  object LoadBalancingConfig {
    
    inline def apply(getLoadBalancerName: CallbackTo[String], toJsonObject: CallbackTo[js.Object]): LoadBalancingConfig = {
      val __obj = js.Dynamic.literal(getLoadBalancerName = getLoadBalancerName.toJsFn, toJsonObject = toJsonObject.toJsFn)
      __obj.asInstanceOf[LoadBalancingConfig]
    }
    
    extension [Self <: LoadBalancingConfig](x: Self) {
      
      inline def setGetLoadBalancerName(value: CallbackTo[String]): Self = StObject.set(x, "getLoadBalancerName", value.toJsFn)
      
      inline def setToJsonObject(value: CallbackTo[js.Object]): Self = StObject.set(x, "toJsonObject", value.toJsFn)
    }
  }
  
  @js.native
  trait LoadBalancingConfigConstructor
    extends StObject
       with Instantiable1[/* args */ Any, LoadBalancingConfig] {
    
    def createFromJson(obj: Any): LoadBalancingConfig = js.native
  }
}
