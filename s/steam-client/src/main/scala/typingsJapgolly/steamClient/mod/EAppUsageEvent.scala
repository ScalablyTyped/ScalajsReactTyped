package typingsJapgolly.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EAppUsageEvent extends StObject
@JSImport("steam-client", "EAppUsageEvent")
@js.native
object EAppUsageEvent extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EAppUsageEvent & Double] = js.native
  
  @js.native
  sealed trait GameLaunch
    extends StObject
       with EAppUsageEvent
  /* 1 */ val GameLaunch: typingsJapgolly.steamClient.mod.EAppUsageEvent.GameLaunch & Double = js.native
  
  @js.native
  sealed trait GameLaunchFreeWeekend
    extends StObject
       with EAppUsageEvent
  /* 8 */ val GameLaunchFreeWeekend: typingsJapgolly.steamClient.mod.EAppUsageEvent.GameLaunchFreeWeekend & Double = js.native
  
  @js.native
  sealed trait GameLaunchTrial
    extends StObject
       with EAppUsageEvent
  /* 2 */ val GameLaunchTrial: typingsJapgolly.steamClient.mod.EAppUsageEvent.GameLaunchTrial & Double = js.native
  
  @js.native
  sealed trait InGameAdViewed
    extends StObject
       with EAppUsageEvent
  /* 7 */ val InGameAdViewed: typingsJapgolly.steamClient.mod.EAppUsageEvent.InGameAdViewed & Double = js.native
  
  @js.native
  sealed trait MarketingMessageView
    extends StObject
       with EAppUsageEvent
  /* 6 */ val MarketingMessageView: typingsJapgolly.steamClient.mod.EAppUsageEvent.MarketingMessageView & Double = js.native
  
  @js.native
  sealed trait Media
    extends StObject
       with EAppUsageEvent
  /* 3 */ val Media: typingsJapgolly.steamClient.mod.EAppUsageEvent.Media & Double = js.native
  
  @js.native
  sealed trait PreloadFinish
    extends StObject
       with EAppUsageEvent
  /* 5 */ val PreloadFinish: typingsJapgolly.steamClient.mod.EAppUsageEvent.PreloadFinish & Double = js.native
  
  @js.native
  sealed trait PreloadStart
    extends StObject
       with EAppUsageEvent
  /* 4 */ val PreloadStart: typingsJapgolly.steamClient.mod.EAppUsageEvent.PreloadStart & Double = js.native
}
