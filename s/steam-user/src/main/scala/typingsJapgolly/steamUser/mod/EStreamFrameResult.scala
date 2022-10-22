package typingsJapgolly.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EStreamFrameResult extends StObject
@JSImport("steam-user", "EStreamFrameResult")
@js.native
object EStreamFrameResult extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EStreamFrameResult & Double] = js.native
  
  @js.native
  sealed trait Displayed
    extends StObject
       with EStreamFrameResult
  /* 1 */ val Displayed: typingsJapgolly.steamUser.mod.EStreamFrameResult.Displayed & Double = js.native
  
  @js.native
  sealed trait DroppedDecodeCorrupt
    extends StObject
       with EStreamFrameResult
  /* 5 */ val DroppedDecodeCorrupt: typingsJapgolly.steamUser.mod.EStreamFrameResult.DroppedDecodeCorrupt & Double = js.native
  
  @js.native
  sealed trait DroppedDecodeSlow
    extends StObject
       with EStreamFrameResult
  /* 4 */ val DroppedDecodeSlow: typingsJapgolly.steamUser.mod.EStreamFrameResult.DroppedDecodeSlow & Double = js.native
  
  @js.native
  sealed trait DroppedLate
    extends StObject
       with EStreamFrameResult
  /* 6 */ val DroppedLate: typingsJapgolly.steamUser.mod.EStreamFrameResult.DroppedLate & Double = js.native
  
  @js.native
  sealed trait DroppedNetworkLost
    extends StObject
       with EStreamFrameResult
  /* 3 */ val DroppedNetworkLost: typingsJapgolly.steamUser.mod.EStreamFrameResult.DroppedNetworkLost & Double = js.native
  
  @js.native
  sealed trait DroppedNetworkSlow
    extends StObject
       with EStreamFrameResult
  /* 2 */ val DroppedNetworkSlow: typingsJapgolly.steamUser.mod.EStreamFrameResult.DroppedNetworkSlow & Double = js.native
  
  @js.native
  sealed trait DroppedReset
    extends StObject
       with EStreamFrameResult
  /* 7 */ val DroppedReset: typingsJapgolly.steamUser.mod.EStreamFrameResult.DroppedReset & Double = js.native
  
  @js.native
  sealed trait Pending
    extends StObject
       with EStreamFrameResult
  /* 0 */ val Pending: typingsJapgolly.steamUser.mod.EStreamFrameResult.Pending & Double = js.native
}
