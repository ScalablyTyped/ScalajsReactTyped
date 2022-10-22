package typingsJapgolly.grpcGrpcJs.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.grpcGrpcJs.buildSrcChannelOptionsMod.ChannelOptions
import typingsJapgolly.grpcGrpcJs.buildSrcChannelzMod.ChannelRef
import typingsJapgolly.grpcGrpcJs.buildSrcChannelzMod.SubchannelRef
import typingsJapgolly.grpcGrpcJs.buildSrcConnectivityStateMod.ConnectivityState
import typingsJapgolly.grpcGrpcJs.buildSrcPickerMod.Picker
import typingsJapgolly.grpcGrpcJs.buildSrcSubchannelAddressMod.SubchannelAddress
import typingsJapgolly.grpcGrpcJs.buildSrcSubchannelInterfaceMod.SubchannelInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@grpc/grpc-js.@grpc/grpc-js/build/src/load-balancer.ChannelControlHelper> */
trait PartialChannelControlHelp extends StObject {
  
  var addChannelzChild: js.UndefOr[js.Function1[/* child */ ChannelRef | SubchannelRef, Unit]] = js.undefined
  
  var createSubchannel: js.UndefOr[
    js.Function2[
      /* subchannelAddress */ SubchannelAddress, 
      /* subchannelArgs */ ChannelOptions, 
      SubchannelInterface
    ]
  ] = js.undefined
  
  var removeChannelzChild: js.UndefOr[js.Function1[/* child */ ChannelRef | SubchannelRef, Unit]] = js.undefined
  
  var requestReresolution: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var updateState: js.UndefOr[
    js.Function2[/* connectivityState */ ConnectivityState, /* picker */ Picker, Unit]
  ] = js.undefined
}
object PartialChannelControlHelp {
  
  inline def apply(): PartialChannelControlHelp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialChannelControlHelp]
  }
  
  extension [Self <: PartialChannelControlHelp](x: Self) {
    
    inline def setAddChannelzChild(value: /* child */ ChannelRef | SubchannelRef => Callback): Self = StObject.set(x, "addChannelzChild", js.Any.fromFunction1((t0: /* child */ ChannelRef | SubchannelRef) => value(t0).runNow()))
    
    inline def setAddChannelzChildUndefined: Self = StObject.set(x, "addChannelzChild", js.undefined)
    
    inline def setCreateSubchannel(
      value: (/* subchannelAddress */ SubchannelAddress, /* subchannelArgs */ ChannelOptions) => SubchannelInterface
    ): Self = StObject.set(x, "createSubchannel", js.Any.fromFunction2(value))
    
    inline def setCreateSubchannelUndefined: Self = StObject.set(x, "createSubchannel", js.undefined)
    
    inline def setRemoveChannelzChild(value: /* child */ ChannelRef | SubchannelRef => Callback): Self = StObject.set(x, "removeChannelzChild", js.Any.fromFunction1((t0: /* child */ ChannelRef | SubchannelRef) => value(t0).runNow()))
    
    inline def setRemoveChannelzChildUndefined: Self = StObject.set(x, "removeChannelzChild", js.undefined)
    
    inline def setRequestReresolution(value: Callback): Self = StObject.set(x, "requestReresolution", value.toJsFn)
    
    inline def setRequestReresolutionUndefined: Self = StObject.set(x, "requestReresolution", js.undefined)
    
    inline def setUpdateState(value: (/* connectivityState */ ConnectivityState, /* picker */ Picker) => Callback): Self = StObject.set(x, "updateState", js.Any.fromFunction2((t0: /* connectivityState */ ConnectivityState, t1: /* picker */ Picker) => (value(t0, t1)).runNow()))
    
    inline def setUpdateStateUndefined: Self = StObject.set(x, "updateState", js.undefined)
  }
}
