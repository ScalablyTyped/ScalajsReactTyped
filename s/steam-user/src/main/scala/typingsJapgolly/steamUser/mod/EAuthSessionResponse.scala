package typingsJapgolly.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EAuthSessionResponse extends StObject
@JSImport("steam-user", "EAuthSessionResponse")
@js.native
object EAuthSessionResponse extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EAuthSessionResponse & Double] = js.native
  
  @js.native
  sealed trait AuthTicketCanceled
    extends StObject
       with EAuthSessionResponse
  /* 6 */ val AuthTicketCanceled: typingsJapgolly.steamUser.mod.EAuthSessionResponse.AuthTicketCanceled & Double = js.native
  
  @js.native
  sealed trait AuthTicketInvalid
    extends StObject
       with EAuthSessionResponse
  /* 8 */ val AuthTicketInvalid: typingsJapgolly.steamUser.mod.EAuthSessionResponse.AuthTicketInvalid & Double = js.native
  
  @js.native
  sealed trait AuthTicketInvalidAlreadyUsed
    extends StObject
       with EAuthSessionResponse
  /* 7 */ val AuthTicketInvalidAlreadyUsed: typingsJapgolly.steamUser.mod.EAuthSessionResponse.AuthTicketInvalidAlreadyUsed & Double = js.native
  
  @js.native
  sealed trait LoggedInElseWhere
    extends StObject
       with EAuthSessionResponse
  /* 4 */ val LoggedInElseWhere: typingsJapgolly.steamUser.mod.EAuthSessionResponse.LoggedInElseWhere & Double = js.native
  
  @js.native
  sealed trait NoLicenseOrExpired
    extends StObject
       with EAuthSessionResponse
  /* 2 */ val NoLicenseOrExpired: typingsJapgolly.steamUser.mod.EAuthSessionResponse.NoLicenseOrExpired & Double = js.native
  
  @js.native
  sealed trait OK
    extends StObject
       with EAuthSessionResponse
  /* 0 */ val OK: typingsJapgolly.steamUser.mod.EAuthSessionResponse.OK & Double = js.native
  
  @js.native
  sealed trait PublisherIssuedBan
    extends StObject
       with EAuthSessionResponse
  /* 9 */ val PublisherIssuedBan: typingsJapgolly.steamUser.mod.EAuthSessionResponse.PublisherIssuedBan & Double = js.native
  
  @js.native
  sealed trait UserNotConnectedToSteam
    extends StObject
       with EAuthSessionResponse
  /* 1 */ val UserNotConnectedToSteam: typingsJapgolly.steamUser.mod.EAuthSessionResponse.UserNotConnectedToSteam & Double = js.native
  
  @js.native
  sealed trait VACBanned
    extends StObject
       with EAuthSessionResponse
  /* 3 */ val VACBanned: typingsJapgolly.steamUser.mod.EAuthSessionResponse.VACBanned & Double = js.native
  
  @js.native
  sealed trait VACCheckTimedOut
    extends StObject
       with EAuthSessionResponse
  /* 5 */ val VACCheckTimedOut: typingsJapgolly.steamUser.mod.EAuthSessionResponse.VACCheckTimedOut & Double = js.native
}
