package typingsJapgolly.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EPersonaStateFlag extends StObject
@JSImport("steam-client", "EPersonaStateFlag")
@js.native
object EPersonaStateFlag extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EPersonaStateFlag & Double] = js.native
  
  // removed "renamed to ClientTypeMobile"
  @js.native
  sealed trait ClientTypeMobile
    extends StObject
       with EPersonaStateFlag
  /* 512 */ val ClientTypeMobile: typingsJapgolly.steamClient.mod.EPersonaStateFlag.ClientTypeMobile & Double = js.native
  
  // removed "renamed to ClientTypeTenfoot"
  @js.native
  sealed trait ClientTypeTenfoot
    extends StObject
       with EPersonaStateFlag
  /* 1024 */ val ClientTypeTenfoot: typingsJapgolly.steamClient.mod.EPersonaStateFlag.ClientTypeTenfoot & Double = js.native
  
  // removed "renamed to ClientTypeVR"
  @js.native
  sealed trait ClientTypeVR
    extends StObject
       with EPersonaStateFlag
  /* 2048 */ val ClientTypeVR: typingsJapgolly.steamClient.mod.EPersonaStateFlag.ClientTypeVR & Double = js.native
  
  // removed "renamed to ClientTypeWeb"
  @js.native
  sealed trait ClientTypeWeb
    extends StObject
       with EPersonaStateFlag
  /* 256 */ val ClientTypeWeb: typingsJapgolly.steamClient.mod.EPersonaStateFlag.ClientTypeWeb & Double = js.native
  
  @js.native
  sealed trait Golden
    extends StObject
       with EPersonaStateFlag
  /* 4 */ val Golden: typingsJapgolly.steamClient.mod.EPersonaStateFlag.Golden & Double = js.native
  
  @js.native
  sealed trait HasRichPresence
    extends StObject
       with EPersonaStateFlag
  /* 1 */ val HasRichPresence: typingsJapgolly.steamClient.mod.EPersonaStateFlag.HasRichPresence & Double = js.native
  
  @js.native
  sealed trait InJoinableGame
    extends StObject
       with EPersonaStateFlag
  /* 2 */ val InJoinableGame: typingsJapgolly.steamClient.mod.EPersonaStateFlag.InJoinableGame & Double = js.native
  
  @js.native
  sealed trait LaunchTypeGamepad
    extends StObject
       with EPersonaStateFlag
  /* 4096 */ val LaunchTypeGamepad: typingsJapgolly.steamClient.mod.EPersonaStateFlag.LaunchTypeGamepad & Double = js.native
  
  @js.native
  sealed trait OnlineUsingBigPicture
    extends StObject
       with EPersonaStateFlag
  /* 1024 */ val OnlineUsingBigPicture: typingsJapgolly.steamClient.mod.EPersonaStateFlag.OnlineUsingBigPicture & Double = js.native
  
  @js.native
  sealed trait OnlineUsingMobile
    extends StObject
       with EPersonaStateFlag
  /* 512 */ val OnlineUsingMobile: typingsJapgolly.steamClient.mod.EPersonaStateFlag.OnlineUsingMobile & Double = js.native
  
  @js.native
  sealed trait OnlineUsingVR
    extends StObject
       with EPersonaStateFlag
  /* 2048 */ val OnlineUsingVR: typingsJapgolly.steamClient.mod.EPersonaStateFlag.OnlineUsingVR & Double = js.native
  
  // removed "no longer has any effect"
  @js.native
  sealed trait OnlineUsingWeb
    extends StObject
       with EPersonaStateFlag
  /* 256 */ val OnlineUsingWeb: typingsJapgolly.steamClient.mod.EPersonaStateFlag.OnlineUsingWeb & Double = js.native
}
