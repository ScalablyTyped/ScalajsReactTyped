package typingsJapgolly.grpcGrpcJs

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.grpcGrpcJs.buildSrcLoadBalancerMod.ChannelControlHelper
import typingsJapgolly.grpcGrpcJs.buildSrcLoadBalancerMod.LoadBalancer
import typingsJapgolly.grpcGrpcJs.buildSrcLoadBalancerMod.LoadBalancingConfig
import typingsJapgolly.grpcGrpcJs.buildSrcSubchannelAddressMod.SubchannelAddress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcLoadBalancerChildHandlerMod {
  
  @JSImport("@grpc/grpc-js/build/src/load-balancer-child-handler", "ChildLoadBalancerHandler")
  @js.native
  open class ChildLoadBalancerHandler protected ()
    extends StObject
       with LoadBalancer {
    def this(channelControlHelper: ChannelControlHelper) = this()
    
    /* private */ var ChildPolicyHelper: Any = js.native
    
    /* private */ val channelControlHelper: Any = js.native
    
    /* private */ var currentChild: Any = js.native
    
    /**
      * The load balancer unrefs all of its subchannels and stops calling methods
      * of its channel control helper.
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /**
      * If the load balancer is currently in the IDLE state, start connecting.
      */
    /* CompleteClass */
    override def exitIdle(): Unit = js.native
    
    /**
      * Get the type name for this load balancer type. Must be constant across an
      * entire load balancer implementation class and must match the name that the
      * balancer implementation class was registered with.
      */
    /* CompleteClass */
    override def getTypeName(): String = js.native
    
    /* private */ var pendingChild: Any = js.native
    
    /**
      * If the load balancer is currently in the CONNECTING or TRANSIENT_FAILURE
      * state, reset the current connection backoff timeout to its base value and
      * transition to CONNECTING if in TRANSIENT_FAILURE.
      */
    /* CompleteClass */
    override def resetBackoff(): Unit = js.native
    
    /**
      * Gives the load balancer a new list of addresses to start connecting to.
      * The load balancer will start establishing connections with the new list,
      * but will continue using any existing connections until the new connections
      * are established
      * @param addressList The new list of addresses to connect to
      * @param lbConfig The load balancing config object from the service config,
      *     if one was provided
      */
    /* CompleteClass */
    override def updateAddressList(
      addressList: js.Array[SubchannelAddress],
      lbConfig: LoadBalancingConfig,
      attributes: StringDictionary[Any]
    ): Unit = js.native
  }
}
