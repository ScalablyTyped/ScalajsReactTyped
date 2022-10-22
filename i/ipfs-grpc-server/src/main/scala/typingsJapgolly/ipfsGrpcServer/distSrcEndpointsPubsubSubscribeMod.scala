package typingsJapgolly.ipfsGrpcServer

import typingsJapgolly.ipfsCoreTypes.mod.IPFS
import typingsJapgolly.ipfsGrpcServer.distSrcTypesMod.Options
import typingsJapgolly.itPushable.mod.Pushable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcEndpointsPubsubSubscribeMod {
  
  @JSImport("ipfs-grpc-server/dist/src/endpoints/pubsub/subscribe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def grpcPubsubSubscribe(ipfs: IPFS[js.Object]): js.Function3[/* request */ Any, /* sink */ Pushable_[Any], /* metadata */ Any, js.Promise[Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("grpcPubsubSubscribe")(ipfs.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* request */ Any, /* sink */ Pushable_[Any], /* metadata */ Any, js.Promise[Unit]]]
  inline def grpcPubsubSubscribe(ipfs: IPFS[js.Object], options: Options): js.Function3[/* request */ Any, /* sink */ Pushable_[Any], /* metadata */ Any, js.Promise[Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("grpcPubsubSubscribe")(ipfs.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function3[/* request */ Any, /* sink */ Pushable_[Any], /* metadata */ Any, js.Promise[Unit]]]
  
  type Message = typingsJapgolly.libp2pInterfacePubsub.mod.Message
}
