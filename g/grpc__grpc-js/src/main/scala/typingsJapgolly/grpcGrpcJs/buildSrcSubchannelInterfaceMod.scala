package typingsJapgolly.grpcGrpcJs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.grpcGrpcJs.buildSrcChannelzMod.SubchannelRef
import typingsJapgolly.grpcGrpcJs.buildSrcConnectivityStateMod.ConnectivityState
import typingsJapgolly.grpcGrpcJs.buildSrcSubchannelMod.Subchannel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcSubchannelInterfaceMod {
  
  /* note: abstract class */ @JSImport("@grpc/grpc-js/build/src/subchannel-interface", "BaseSubchannelWrapper")
  @js.native
  open class BaseSubchannelWrapper protected ()
    extends StObject
       with SubchannelInterface {
    def this(child: SubchannelInterface) = this()
    
    /* CompleteClass */
    override def addConnectivityStateListener(listener: ConnectivityStateListener): Unit = js.native
    
    /* protected */ var child: SubchannelInterface = js.native
    
    /* CompleteClass */
    override def getAddress(): String = js.native
    
    /* CompleteClass */
    override def getChannelzRef(): SubchannelRef = js.native
    
    /* CompleteClass */
    override def getConnectivityState(): ConnectivityState = js.native
    
    /**
      * If this is a wrapper, return the wrapped subchannel, otherwise return this
      */
    /* CompleteClass */
    override def getRealSubchannel(): Subchannel = js.native
    
    /* CompleteClass */
    override def ref(): Unit = js.native
    
    /* CompleteClass */
    override def removeConnectivityStateListener(listener: ConnectivityStateListener): Unit = js.native
    
    /* CompleteClass */
    override def startConnecting(): Unit = js.native
    
    /* CompleteClass */
    override def unref(): Unit = js.native
  }
  
  type ConnectivityStateListener = js.Function3[
    /* subchannel */ SubchannelInterface, 
    /* previousState */ ConnectivityState, 
    /* newState */ ConnectivityState, 
    Unit
  ]
  
  trait SubchannelInterface extends StObject {
    
    def addConnectivityStateListener(listener: ConnectivityStateListener): Unit
    
    def getAddress(): String
    
    def getChannelzRef(): SubchannelRef
    
    def getConnectivityState(): ConnectivityState
    
    /**
      * If this is a wrapper, return the wrapped subchannel, otherwise return this
      */
    def getRealSubchannel(): Subchannel
    
    def ref(): Unit
    
    def removeConnectivityStateListener(listener: ConnectivityStateListener): Unit
    
    def startConnecting(): Unit
    
    def unref(): Unit
  }
  object SubchannelInterface {
    
    inline def apply(
      addConnectivityStateListener: ConnectivityStateListener => Callback,
      getAddress: CallbackTo[String],
      getChannelzRef: CallbackTo[SubchannelRef],
      getConnectivityState: CallbackTo[ConnectivityState],
      getRealSubchannel: CallbackTo[Subchannel],
      ref: Callback,
      removeConnectivityStateListener: ConnectivityStateListener => Callback,
      startConnecting: Callback,
      unref: Callback
    ): SubchannelInterface = {
      val __obj = js.Dynamic.literal(addConnectivityStateListener = js.Any.fromFunction1((t0: ConnectivityStateListener) => addConnectivityStateListener(t0).runNow()), getAddress = getAddress.toJsFn, getChannelzRef = getChannelzRef.toJsFn, getConnectivityState = getConnectivityState.toJsFn, getRealSubchannel = getRealSubchannel.toJsFn, ref = ref.toJsFn, removeConnectivityStateListener = js.Any.fromFunction1((t0: ConnectivityStateListener) => removeConnectivityStateListener(t0).runNow()), startConnecting = startConnecting.toJsFn, unref = unref.toJsFn)
      __obj.asInstanceOf[SubchannelInterface]
    }
    
    extension [Self <: SubchannelInterface](x: Self) {
      
      inline def setAddConnectivityStateListener(value: ConnectivityStateListener => Callback): Self = StObject.set(x, "addConnectivityStateListener", js.Any.fromFunction1((t0: ConnectivityStateListener) => value(t0).runNow()))
      
      inline def setGetAddress(value: CallbackTo[String]): Self = StObject.set(x, "getAddress", value.toJsFn)
      
      inline def setGetChannelzRef(value: CallbackTo[SubchannelRef]): Self = StObject.set(x, "getChannelzRef", value.toJsFn)
      
      inline def setGetConnectivityState(value: CallbackTo[ConnectivityState]): Self = StObject.set(x, "getConnectivityState", value.toJsFn)
      
      inline def setGetRealSubchannel(value: CallbackTo[Subchannel]): Self = StObject.set(x, "getRealSubchannel", value.toJsFn)
      
      inline def setRef(value: Callback): Self = StObject.set(x, "ref", value.toJsFn)
      
      inline def setRemoveConnectivityStateListener(value: ConnectivityStateListener => Callback): Self = StObject.set(x, "removeConnectivityStateListener", js.Any.fromFunction1((t0: ConnectivityStateListener) => value(t0).runNow()))
      
      inline def setStartConnecting(value: Callback): Self = StObject.set(x, "startConnecting", value.toJsFn)
      
      inline def setUnref(value: Callback): Self = StObject.set(x, "unref", value.toJsFn)
    }
  }
}
