package typingsJapgolly.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EChatActionResult extends StObject
@JSImport("steam-client", "EChatActionResult")
@js.native
object EChatActionResult extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EChatActionResult & Double] = js.native
  
  @js.native
  sealed trait ChatDoesntExist
    extends StObject
       with EChatActionResult
  /* 8 */ val ChatDoesntExist: typingsJapgolly.steamClient.mod.EChatActionResult.ChatDoesntExist & Double = js.native
  
  @js.native
  sealed trait ChatFull
    extends StObject
       with EChatActionResult
  /* 9 */ val ChatFull: typingsJapgolly.steamClient.mod.EChatActionResult.ChatFull & Double = js.native
  
  @js.native
  sealed trait Error
    extends StObject
       with EChatActionResult
  /* 2 */ val Error: typingsJapgolly.steamClient.mod.EChatActionResult.Error & Double = js.native
  
  @js.native
  sealed trait NotAllowedOnBannedUser
    extends StObject
       with EChatActionResult
  /* 5 */ val NotAllowedOnBannedUser: typingsJapgolly.steamClient.mod.EChatActionResult.NotAllowedOnBannedUser & Double = js.native
  
  @js.native
  sealed trait NotAllowedOnChatOwner
    extends StObject
       with EChatActionResult
  /* 6 */ val NotAllowedOnChatOwner: typingsJapgolly.steamClient.mod.EChatActionResult.NotAllowedOnChatOwner & Double = js.native
  
  @js.native
  sealed trait NotAllowedOnClanMember
    extends StObject
       with EChatActionResult
  /* 4 */ val NotAllowedOnClanMember: typingsJapgolly.steamClient.mod.EChatActionResult.NotAllowedOnClanMember & Double = js.native
  
  @js.native
  sealed trait NotAllowedOnSelf
    extends StObject
       with EChatActionResult
  /* 7 */ val NotAllowedOnSelf: typingsJapgolly.steamClient.mod.EChatActionResult.NotAllowedOnSelf & Double = js.native
  
  @js.native
  sealed trait NotPermitted
    extends StObject
       with EChatActionResult
  /* 3 */ val NotPermitted: typingsJapgolly.steamClient.mod.EChatActionResult.NotPermitted & Double = js.native
  
  @js.native
  sealed trait Success
    extends StObject
       with EChatActionResult
  /* 1 */ val Success: typingsJapgolly.steamClient.mod.EChatActionResult.Success & Double = js.native
  
  @js.native
  sealed trait VoiceSlotsFull
    extends StObject
       with EChatActionResult
  /* 10 */ val VoiceSlotsFull: typingsJapgolly.steamClient.mod.EChatActionResult.VoiceSlotsFull & Double = js.native
}
