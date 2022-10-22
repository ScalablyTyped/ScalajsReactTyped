package typingsJapgolly.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EPersonaStateFlag extends StObject
@JSImport("steam-user", "EPersonaStateFlag")
@js.native
object EPersonaStateFlag extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EPersonaStateFlag & Double] = js.native
  
  @js.native
  sealed trait ClientTypeMobile
    extends StObject
       with EPersonaStateFlag
  /* 512 */ val ClientTypeMobile: typingsJapgolly.steamUser.mod.EPersonaStateFlag.ClientTypeMobile & Double = js.native
  
  @js.native
  sealed trait ClientTypeTenfoot
    extends StObject
       with EPersonaStateFlag
  /* 1024 */ val ClientTypeTenfoot: typingsJapgolly.steamUser.mod.EPersonaStateFlag.ClientTypeTenfoot & Double = js.native
  
  @js.native
  sealed trait ClientTypeVR
    extends StObject
       with EPersonaStateFlag
  /* 2048 */ val ClientTypeVR: typingsJapgolly.steamUser.mod.EPersonaStateFlag.ClientTypeVR & Double = js.native
  
  @js.native
  sealed trait ClientTypeWeb
    extends StObject
       with EPersonaStateFlag
  /* 256 */ val ClientTypeWeb: typingsJapgolly.steamUser.mod.EPersonaStateFlag.ClientTypeWeb & Double = js.native
  
  @js.native
  sealed trait Golden
    extends StObject
       with EPersonaStateFlag
  /* 4 */ val Golden: typingsJapgolly.steamUser.mod.EPersonaStateFlag.Golden & Double = js.native
  
  @js.native
  sealed trait HasRichPresence
    extends StObject
       with EPersonaStateFlag
  /* 1 */ val HasRichPresence: typingsJapgolly.steamUser.mod.EPersonaStateFlag.HasRichPresence & Double = js.native
  
  @js.native
  sealed trait InJoinableGame
    extends StObject
       with EPersonaStateFlag
  /* 2 */ val InJoinableGame: typingsJapgolly.steamUser.mod.EPersonaStateFlag.InJoinableGame & Double = js.native
  
  @js.native
  sealed trait LaunchTypeCompatTool
    extends StObject
       with EPersonaStateFlag
  /* 8192 */ val LaunchTypeCompatTool: typingsJapgolly.steamUser.mod.EPersonaStateFlag.LaunchTypeCompatTool & Double = js.native
  
  @js.native
  sealed trait LaunchTypeGamepad
    extends StObject
       with EPersonaStateFlag
  /* 4096 */ val LaunchTypeGamepad: typingsJapgolly.steamUser.mod.EPersonaStateFlag.LaunchTypeGamepad & Double = js.native
  
  @js.native
  sealed trait OnlineUsingBigPicture
    extends StObject
       with EPersonaStateFlag
  /* 1024 */ val OnlineUsingBigPicture: typingsJapgolly.steamUser.mod.EPersonaStateFlag.OnlineUsingBigPicture & Double = js.native
  
  @js.native
  sealed trait OnlineUsingMobile
    extends StObject
       with EPersonaStateFlag
  /* 512 */ val OnlineUsingMobile: typingsJapgolly.steamUser.mod.EPersonaStateFlag.OnlineUsingMobile & Double = js.native
  
  @js.native
  sealed trait OnlineUsingVR
    extends StObject
       with EPersonaStateFlag
  /* 2048 */ val OnlineUsingVR: typingsJapgolly.steamUser.mod.EPersonaStateFlag.OnlineUsingVR & Double = js.native
  
  @js.native
  sealed trait OnlineUsingWeb
    extends StObject
       with EPersonaStateFlag
  /* 256 */ val OnlineUsingWeb: typingsJapgolly.steamUser.mod.EPersonaStateFlag.OnlineUsingWeb & Double = js.native
  
  @js.native
  sealed trait RemotePlayTogether
    extends StObject
       with EPersonaStateFlag
  /* 8 */ val RemotePlayTogether: typingsJapgolly.steamUser.mod.EPersonaStateFlag.RemotePlayTogether & Double = js.native
}
