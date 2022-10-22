package typingsJapgolly.chainsafeLibp2pGossipsub

import typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.PublishConfig
import typingsJapgolly.libp2pInterfacePeerId.mod.PeerId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsPublishConfigMod {
  
  @JSImport("@chainsafe/libp2p-gossipsub/dist/src/utils/publishConfig", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPublishConfigFromPeerId(signaturePolicy: /* "StrictSign" */ /* "StrictNoSign" */ String): js.Promise[PublishConfig] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPublishConfigFromPeerId")(signaturePolicy.asInstanceOf[js.Any]).asInstanceOf[js.Promise[PublishConfig]]
  inline def getPublishConfigFromPeerId(signaturePolicy: /* "StrictSign" */ /* "StrictNoSign" */ String, peerId: PeerId): js.Promise[PublishConfig] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPublishConfigFromPeerId")(signaturePolicy.asInstanceOf[js.Any], peerId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PublishConfig]]
}
