package typingsJapgolly.steamcommunity.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PersonaStateFlag extends StObject
@JSImport("steamcommunity", "PersonaStateFlag")
@js.native
object PersonaStateFlag extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PersonaStateFlag & Double] = js.native
  
  @js.native
  sealed trait ClientTypeMobile
    extends StObject
       with PersonaStateFlag
  /* 512 */ val ClientTypeMobile: typingsJapgolly.steamcommunity.mod.PersonaStateFlag.ClientTypeMobile & Double = js.native
  
  @js.native
  sealed trait ClientTypeTenfoot
    extends StObject
       with PersonaStateFlag
  /* 1024 */ val ClientTypeTenfoot: typingsJapgolly.steamcommunity.mod.PersonaStateFlag.ClientTypeTenfoot & Double = js.native
  
  @js.native
  sealed trait ClientTypeVR
    extends StObject
       with PersonaStateFlag
  /* 2048 */ val ClientTypeVR: typingsJapgolly.steamcommunity.mod.PersonaStateFlag.ClientTypeVR & Double = js.native
  
  @js.native
  sealed trait ClientTypeWeb
    extends StObject
       with PersonaStateFlag
  /* 256 */ val ClientTypeWeb: typingsJapgolly.steamcommunity.mod.PersonaStateFlag.ClientTypeWeb & Double = js.native
  
  @js.native
  sealed trait Golden
    extends StObject
       with PersonaStateFlag
  /* 4 */ val Golden: typingsJapgolly.steamcommunity.mod.PersonaStateFlag.Golden & Double = js.native
  
  @js.native
  sealed trait HasRichPresence
    extends StObject
       with PersonaStateFlag
  /* 1 */ val HasRichPresence: typingsJapgolly.steamcommunity.mod.PersonaStateFlag.HasRichPresence & Double = js.native
  
  @js.native
  sealed trait InJoinableGame
    extends StObject
       with PersonaStateFlag
  /* 2 */ val InJoinableGame: typingsJapgolly.steamcommunity.mod.PersonaStateFlag.InJoinableGame & Double = js.native
  
  @js.native
  sealed trait LaunchTypeCompatTool
    extends StObject
       with PersonaStateFlag
  /* 8192 */ val LaunchTypeCompatTool: typingsJapgolly.steamcommunity.mod.PersonaStateFlag.LaunchTypeCompatTool & Double = js.native
  
  @js.native
  sealed trait LaunchTypeGamepad
    extends StObject
       with PersonaStateFlag
  /* 4096 */ val LaunchTypeGamepad: typingsJapgolly.steamcommunity.mod.PersonaStateFlag.LaunchTypeGamepad & Double = js.native
  
  @js.native
  sealed trait OnlineUsingBigPicture
    extends StObject
       with PersonaStateFlag
  /* 1024 */ val OnlineUsingBigPicture: typingsJapgolly.steamcommunity.mod.PersonaStateFlag.OnlineUsingBigPicture & Double = js.native
  
  @js.native
  sealed trait OnlineUsingMobile
    extends StObject
       with PersonaStateFlag
  /* 512 */ val OnlineUsingMobile: typingsJapgolly.steamcommunity.mod.PersonaStateFlag.OnlineUsingMobile & Double = js.native
  
  @js.native
  sealed trait OnlineUsingVR
    extends StObject
       with PersonaStateFlag
  /* 2048 */ val OnlineUsingVR: typingsJapgolly.steamcommunity.mod.PersonaStateFlag.OnlineUsingVR & Double = js.native
  
  @js.native
  sealed trait OnlineUsingWeb
    extends StObject
       with PersonaStateFlag
  /* 256 */ val OnlineUsingWeb: typingsJapgolly.steamcommunity.mod.PersonaStateFlag.OnlineUsingWeb & Double = js.native
  
  @js.native
  sealed trait RemotePlayTogether
    extends StObject
       with PersonaStateFlag
  /* 8 */ val RemotePlayTogether: typingsJapgolly.steamcommunity.mod.PersonaStateFlag.RemotePlayTogether & Double = js.native
}
