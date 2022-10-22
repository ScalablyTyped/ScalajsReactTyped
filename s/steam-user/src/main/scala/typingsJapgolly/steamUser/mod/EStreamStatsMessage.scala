package typingsJapgolly.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EStreamStatsMessage extends StObject
@JSImport("steam-user", "EStreamStatsMessage")
@js.native
object EStreamStatsMessage extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EStreamStatsMessage & Double] = js.native
  
  @js.native
  sealed trait DebugDump
    extends StObject
       with EStreamStatsMessage
  /* 2 */ val DebugDump: typingsJapgolly.steamUser.mod.EStreamStatsMessage.DebugDump & Double = js.native
  
  @js.native
  sealed trait FrameEvents
    extends StObject
       with EStreamStatsMessage
  /* 1 */ val FrameEvents: typingsJapgolly.steamUser.mod.EStreamStatsMessage.FrameEvents & Double = js.native
  
  @js.native
  sealed trait LogMessage
    extends StObject
       with EStreamStatsMessage
  /* 3 */ val LogMessage: typingsJapgolly.steamUser.mod.EStreamStatsMessage.LogMessage & Double = js.native
  
  @js.native
  sealed trait LogUploadBegin
    extends StObject
       with EStreamStatsMessage
  /* 4 */ val LogUploadBegin: typingsJapgolly.steamUser.mod.EStreamStatsMessage.LogUploadBegin & Double = js.native
  
  @js.native
  sealed trait LogUploadComplete
    extends StObject
       with EStreamStatsMessage
  /* 6 */ val LogUploadComplete: typingsJapgolly.steamUser.mod.EStreamStatsMessage.LogUploadComplete & Double = js.native
  
  @js.native
  sealed trait LogUploadData
    extends StObject
       with EStreamStatsMessage
  /* 5 */ val LogUploadData: typingsJapgolly.steamUser.mod.EStreamStatsMessage.LogUploadData & Double = js.native
}
