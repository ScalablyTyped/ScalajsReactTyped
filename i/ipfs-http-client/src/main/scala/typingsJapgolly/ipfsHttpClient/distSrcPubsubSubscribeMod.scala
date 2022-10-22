package typingsJapgolly.ipfsHttpClient

import typingsJapgolly.ipfsHttpClient.anon.OnError
import typingsJapgolly.ipfsHttpClient.distSrcPubsubSubscriptionTrackerMod.SubscriptionTracker
import typingsJapgolly.libp2pInterfaces.distSrcEventsMod.EventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcPubsubSubscribeMod {
  
  @JSImport("ipfs-http-client/dist/src/pubsub/subscribe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createSubscribe(options: Options, subsTracker: SubscriptionTracker): js.Function3[
    /* topic */ String, 
    /* handler */ EventHandler[typingsJapgolly.libp2pInterfacePubsub.mod.Message], 
    /* options */ js.UndefOr[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_pubsub.SubscribeOptions */ Any) & typingsJapgolly.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions & OnError
    ], 
    js.Promise[Unit]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSubscribe")(options.asInstanceOf[js.Any], subsTracker.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* topic */ String, 
    /* handler */ EventHandler[typingsJapgolly.libp2pInterfacePubsub.mod.Message], 
    /* options */ js.UndefOr[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_pubsub.SubscribeOptions */ Any) & typingsJapgolly.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions & OnError
    ], 
    js.Promise[Unit]
  ]]
  
  type ErrorHandlerFn = js.Function3[/* err */ js.Error, /* fatal */ Boolean, /* msg */ js.UndefOr[Message], Unit]
  
  type HTTPClientExtraOptions = typingsJapgolly.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
  
  type Message = typingsJapgolly.libp2pInterfacePubsub.mod.Message
  
  type Options = typingsJapgolly.ipfsHttpClient.distSrcTypesMod.Options
  
  type PubsubAPI = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_pubsub.API<HTTPClientExtraOptions & {  onError :ErrorHandlerFn | undefined}> */ Any
}
