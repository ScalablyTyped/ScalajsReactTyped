package typingsJapgolly.chainsafeLibp2pGossipsub

import typingsJapgolly.chainsafeLibp2pGossipsub.anon.PartialPeerScoreParams
import typingsJapgolly.chainsafeLibp2pGossipsub.anon.PartialPeerScoreThreshold
import typingsJapgolly.chainsafeLibp2pGossipsub.anon.PartialTopicScoreParams
import typingsJapgolly.chainsafeLibp2pGossipsub.distSrcMetricsMod.Metrics
import typingsJapgolly.chainsafeLibp2pGossipsub.distSrcScorePeerScoreMod.PeerScoreOpts
import typingsJapgolly.chainsafeLibp2pGossipsub.distSrcScorePeerScoreParamsMod.PeerScoreParams
import typingsJapgolly.chainsafeLibp2pGossipsub.distSrcScorePeerScoreParamsMod.TopicScoreParams
import typingsJapgolly.chainsafeLibp2pGossipsub.distSrcScorePeerScoreThresholdsMod.PeerScoreThresholds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcScoreMod {
  
  @JSImport("@chainsafe/libp2p-gossipsub/dist/src/score", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@chainsafe/libp2p-gossipsub/dist/src/score", "PeerScore")
  @js.native
  open class PeerScore protected ()
    extends typingsJapgolly.chainsafeLibp2pGossipsub.distSrcScorePeerScoreMod.PeerScore {
    def this(params: PeerScoreParams, metrics: Null, opts: PeerScoreOpts) = this()
    def this(params: PeerScoreParams, metrics: Metrics, opts: PeerScoreOpts) = this()
  }
  
  inline def createPeerScoreParams(): PeerScoreParams = ^.asInstanceOf[js.Dynamic].applyDynamic("createPeerScoreParams")().asInstanceOf[PeerScoreParams]
  inline def createPeerScoreParams(p: PartialPeerScoreParams): PeerScoreParams = ^.asInstanceOf[js.Dynamic].applyDynamic("createPeerScoreParams")(p.asInstanceOf[js.Any]).asInstanceOf[PeerScoreParams]
  
  inline def createPeerScoreThresholds(): PeerScoreThresholds = ^.asInstanceOf[js.Dynamic].applyDynamic("createPeerScoreThresholds")().asInstanceOf[PeerScoreThresholds]
  inline def createPeerScoreThresholds(p: PartialPeerScoreThreshold): PeerScoreThresholds = ^.asInstanceOf[js.Dynamic].applyDynamic("createPeerScoreThresholds")(p.asInstanceOf[js.Any]).asInstanceOf[PeerScoreThresholds]
  
  inline def createTopicScoreParams(): TopicScoreParams = ^.asInstanceOf[js.Dynamic].applyDynamic("createTopicScoreParams")().asInstanceOf[TopicScoreParams]
  inline def createTopicScoreParams(p: PartialTopicScoreParams): TopicScoreParams = ^.asInstanceOf[js.Dynamic].applyDynamic("createTopicScoreParams")(p.asInstanceOf[js.Any]).asInstanceOf[TopicScoreParams]
  
  @JSImport("@chainsafe/libp2p-gossipsub/dist/src/score", "defaultPeerScoreParams")
  @js.native
  val defaultPeerScoreParams: PeerScoreParams = js.native
  
  @JSImport("@chainsafe/libp2p-gossipsub/dist/src/score", "defaultPeerScoreThresholds")
  @js.native
  val defaultPeerScoreThresholds: PeerScoreThresholds = js.native
  
  @JSImport("@chainsafe/libp2p-gossipsub/dist/src/score", "defaultTopicScoreParams")
  @js.native
  val defaultTopicScoreParams: TopicScoreParams = js.native
  
  inline def validatePeerScoreParams(p: PeerScoreParams): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validatePeerScoreParams")(p.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def validatePeerScoreThresholds(p: PeerScoreThresholds): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validatePeerScoreThresholds")(p.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def validateTopicScoreParams(p: TopicScoreParams): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateTopicScoreParams")(p.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
