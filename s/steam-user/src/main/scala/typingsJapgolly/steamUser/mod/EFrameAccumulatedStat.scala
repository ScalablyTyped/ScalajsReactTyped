package typingsJapgolly.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EFrameAccumulatedStat extends StObject
@JSImport("steam-user", "EFrameAccumulatedStat")
@js.native
object EFrameAccumulatedStat extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EFrameAccumulatedStat & Double] = js.native
  
  @js.native
  sealed trait CaptureDurationMS
    extends StObject
       with EFrameAccumulatedStat
  /* 1 */ val CaptureDurationMS: typingsJapgolly.steamUser.mod.EFrameAccumulatedStat.CaptureDurationMS & Double = js.native
  
  @js.native
  sealed trait ClientBitrateKbitPerSec
    extends StObject
       with EFrameAccumulatedStat
  /* 16 */ val ClientBitrateKbitPerSec: typingsJapgolly.steamUser.mod.EFrameAccumulatedStat.ClientBitrateKbitPerSec & Double = js.native
  
  @js.native
  sealed trait ClientDurationMS
    extends StObject
       with EFrameAccumulatedStat
  /* 9 */ val ClientDurationMS: typingsJapgolly.steamUser.mod.EFrameAccumulatedStat.ClientDurationMS & Double = js.native
  
  @js.native
  sealed trait ConvertDurationMS
    extends StObject
       with EFrameAccumulatedStat
  /* 2 */ val ConvertDurationMS: typingsJapgolly.steamUser.mod.EFrameAccumulatedStat.ConvertDurationMS & Double = js.native
  
  @js.native
  sealed trait DecodeDurationMS
    extends StObject
       with EFrameAccumulatedStat
  /* 7 */ val DecodeDurationMS: typingsJapgolly.steamUser.mod.EFrameAccumulatedStat.DecodeDurationMS & Double = js.native
  
  @js.native
  sealed trait DisplayDurationMS
    extends StObject
       with EFrameAccumulatedStat
  /* 8 */ val DisplayDurationMS: typingsJapgolly.steamUser.mod.EFrameAccumulatedStat.DisplayDurationMS & Double = js.native
  
  @js.native
  sealed trait EncodeDurationMS
    extends StObject
       with EFrameAccumulatedStat
  /* 3 */ val EncodeDurationMS: typingsJapgolly.steamUser.mod.EFrameAccumulatedStat.EncodeDurationMS & Double = js.native
  
  @js.native
  sealed trait FPS
    extends StObject
       with EFrameAccumulatedStat
  /* 0 */ val FPS: typingsJapgolly.steamUser.mod.EFrameAccumulatedStat.FPS & Double = js.native
  
  @js.native
  sealed trait FrameDurationMS
    extends StObject
       with EFrameAccumulatedStat
  /* 10 */ val FrameDurationMS: typingsJapgolly.steamUser.mod.EFrameAccumulatedStat.FrameDurationMS & Double = js.native
  
  @js.native
  sealed trait GameLatencyMS
    extends StObject
       with EFrameAccumulatedStat
  /* 12 */ val GameLatencyMS: typingsJapgolly.steamUser.mod.EFrameAccumulatedStat.GameLatencyMS & Double = js.native
  
  @js.native
  sealed trait InputLatencyMS
    extends StObject
       with EFrameAccumulatedStat
  /* 11 */ val InputLatencyMS: typingsJapgolly.steamUser.mod.EFrameAccumulatedStat.InputLatencyMS & Double = js.native
  
  @js.native
  sealed trait LinkBandwidthKbitPerSec
    extends StObject
       with EFrameAccumulatedStat
  /* 17 */ val LinkBandwidthKbitPerSec: typingsJapgolly.steamUser.mod.EFrameAccumulatedStat.LinkBandwidthKbitPerSec & Double = js.native
  
  @js.native
  sealed trait NetworkDurationMS
    extends StObject
       with EFrameAccumulatedStat
  /* 6 */ val NetworkDurationMS: typingsJapgolly.steamUser.mod.EFrameAccumulatedStat.NetworkDurationMS & Double = js.native
  
  @js.native
  sealed trait PacketLossPercentage
    extends StObject
       with EFrameAccumulatedStat
  /* 18 */ val PacketLossPercentage: typingsJapgolly.steamUser.mod.EFrameAccumulatedStat.PacketLossPercentage & Double = js.native
  
  @js.native
  sealed trait PingTimeMS
    extends StObject
       with EFrameAccumulatedStat
  /* 14 */ val PingTimeMS: typingsJapgolly.steamUser.mod.EFrameAccumulatedStat.PingTimeMS & Double = js.native
  
  @js.native
  sealed trait RoundTripLatencyMS
    extends StObject
       with EFrameAccumulatedStat
  /* 13 */ val RoundTripLatencyMS: typingsJapgolly.steamUser.mod.EFrameAccumulatedStat.RoundTripLatencyMS & Double = js.native
  
  @js.native
  sealed trait ServerBitrateKbitPerSec
    extends StObject
       with EFrameAccumulatedStat
  /* 15 */ val ServerBitrateKbitPerSec: typingsJapgolly.steamUser.mod.EFrameAccumulatedStat.ServerBitrateKbitPerSec & Double = js.native
  
  @js.native
  sealed trait ServerDurationMS
    extends StObject
       with EFrameAccumulatedStat
  /* 5 */ val ServerDurationMS: typingsJapgolly.steamUser.mod.EFrameAccumulatedStat.ServerDurationMS & Double = js.native
  
  @js.native
  sealed trait SteamDurationMS
    extends StObject
       with EFrameAccumulatedStat
  /* 4 */ val SteamDurationMS: typingsJapgolly.steamUser.mod.EFrameAccumulatedStat.SteamDurationMS & Double = js.native
}
