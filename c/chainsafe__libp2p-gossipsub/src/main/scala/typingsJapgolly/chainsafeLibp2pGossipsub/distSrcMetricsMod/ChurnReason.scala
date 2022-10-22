package typingsJapgolly.chainsafeLibp2pGossipsub.distSrcMetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChurnReason extends StObject
@JSImport("@chainsafe/libp2p-gossipsub/dist/src/metrics", "ChurnReason")
@js.native
object ChurnReason extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChurnReason & String] = js.native
  
  @js.native
  sealed trait BadScore
    extends StObject
       with ChurnReason
  /* "bad_score" */ val BadScore: typingsJapgolly.chainsafeLibp2pGossipsub.distSrcMetricsMod.ChurnReason.BadScore & String = js.native
  
  @js.native
  sealed trait Dc
    extends StObject
       with ChurnReason
  /* "disconnected" */ val Dc: typingsJapgolly.chainsafeLibp2pGossipsub.distSrcMetricsMod.ChurnReason.Dc & String = js.native
  
  @js.native
  sealed trait Excess
    extends StObject
       with ChurnReason
  /* "excess" */ val Excess: typingsJapgolly.chainsafeLibp2pGossipsub.distSrcMetricsMod.ChurnReason.Excess & String = js.native
  
  @js.native
  sealed trait Prune
    extends StObject
       with ChurnReason
  /* "prune" */ val Prune: typingsJapgolly.chainsafeLibp2pGossipsub.distSrcMetricsMod.ChurnReason.Prune & String = js.native
  
  @js.native
  sealed trait Unsub
    extends StObject
       with ChurnReason
  /* "unsubscribed" */ val Unsub: typingsJapgolly.chainsafeLibp2pGossipsub.distSrcMetricsMod.ChurnReason.Unsub & String = js.native
}
