package typingsJapgolly.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EAccountFlags extends StObject
@JSImport("steam-client", "EAccountFlags")
@js.native
object EAccountFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EAccountFlags & Double] = js.native
  
  @js.native
  sealed trait Admin
    extends StObject
       with EAccountFlags
  /* 16 */ val Admin: typingsJapgolly.steamClient.mod.EAccountFlags.Admin & Double = js.native
  
  @js.native
  sealed trait AppEditor
    extends StObject
       with EAccountFlags
  /* 64 */ val AppEditor: typingsJapgolly.steamClient.mod.EAccountFlags.AppEditor & Double = js.native
  
  @js.native
  sealed trait BannedFromWebAPI
    extends StObject
       with EAccountFlags
  /* 33554432 */ val BannedFromWebAPI: typingsJapgolly.steamClient.mod.EAccountFlags.BannedFromWebAPI & Double = js.native
  
  @js.native
  sealed trait ClansOnlyFromFriends
    extends StObject
       with EAccountFlags
  /* 67108864 */ val ClansOnlyFromFriends: typingsJapgolly.steamClient.mod.EAccountFlags.ClansOnlyFromFriends & Double = js.native
  
  @js.native
  sealed trait Debug
    extends StObject
       with EAccountFlags
  /* 1024 */ val Debug: typingsJapgolly.steamClient.mod.EAccountFlags.Debug & Double = js.native
  
  @js.native
  sealed trait Disabled
    extends StObject
       with EAccountFlags
  /* 2048 */ val Disabled: typingsJapgolly.steamClient.mod.EAccountFlags.Disabled & Double = js.native
  
  @js.native
  sealed trait EmailValidated
    extends StObject
       with EAccountFlags
  /* 16384 */ val EmailValidated: typingsJapgolly.steamClient.mod.EAccountFlags.EmailValidated & Double = js.native
  
  @js.native
  sealed trait ForceEmailVerification
    extends StObject
       with EAccountFlags
  /* 262144 */ val ForceEmailVerification: typingsJapgolly.steamClient.mod.EAccountFlags.ForceEmailVerification & Double = js.native
  
  @js.native
  sealed trait ForcePasswordChange
    extends StObject
       with EAccountFlags
  /* 131072 */ val ForcePasswordChange: typingsJapgolly.steamClient.mod.EAccountFlags.ForcePasswordChange & Double = js.native
  
  @js.native
  sealed trait GlobalModerator
    extends StObject
       with EAccountFlags
  /* 134217728 */ val GlobalModerator: typingsJapgolly.steamClient.mod.EAccountFlags.GlobalModerator & Double = js.native
  
  @js.native
  sealed trait HWIDSet
    extends StObject
       with EAccountFlags
  /* 128 */ val HWIDSet: typingsJapgolly.steamClient.mod.EAccountFlags.HWIDSet & Double = js.native
  
  @js.native
  sealed trait LimitedUser
    extends StObject
       with EAccountFlags
  /* 4096 */ val LimitedUser: typingsJapgolly.steamClient.mod.EAccountFlags.LimitedUser & Double = js.native
  
  @js.native
  sealed trait LimitedUserForce
    extends StObject
       with EAccountFlags
  /* 8192 */ val LimitedUserForce: typingsJapgolly.steamClient.mod.EAccountFlags.LimitedUserForce & Double = js.native
  
  @js.native
  sealed trait Lockdown
    extends StObject
       with EAccountFlags
  /* 8388608 */ val Lockdown: typingsJapgolly.steamClient.mod.EAccountFlags.Lockdown & Double = js.native
  
  @js.native
  sealed trait LogonExtraSecurity
    extends StObject
       with EAccountFlags
  /* 524288 */ val LogonExtraSecurity: typingsJapgolly.steamClient.mod.EAccountFlags.LogonExtraSecurity & Double = js.native
  
  @js.native
  sealed trait LogonExtraSecurityDisabled
    extends StObject
       with EAccountFlags
  /* 1048576 */ val LogonExtraSecurityDisabled: typingsJapgolly.steamClient.mod.EAccountFlags.LogonExtraSecurityDisabled & Double = js.native
  
  @js.native
  sealed trait MarketingTreatment
    extends StObject
       with EAccountFlags
  /* 32768 */ val MarketingTreatment: typingsJapgolly.steamClient.mod.EAccountFlags.MarketingTreatment & Double = js.native
  
  @js.native
  sealed trait MasterAppEditor
    extends StObject
       with EAccountFlags
  /* 16777216 */ val MasterAppEditor: typingsJapgolly.steamClient.mod.EAccountFlags.MasterAppEditor & Double = js.native
  
  @js.native
  sealed trait NeedLogs
    extends StObject
       with EAccountFlags
  /* 4194304 */ val NeedLogs: typingsJapgolly.steamClient.mod.EAccountFlags.NeedLogs & Double = js.native
  
  @js.native
  sealed trait NeedsSSANextSteamLogon
    extends StObject
       with EAccountFlags
  /* 1073741824 */ val NeedsSSANextSteamLogon: typingsJapgolly.steamClient.mod.EAccountFlags.NeedsSSANextSteamLogon & Double = js.native
  
  @js.native
  sealed trait NormalUser
    extends StObject
       with EAccountFlags
  /* 0 */ val NormalUser: typingsJapgolly.steamClient.mod.EAccountFlags.NormalUser & Double = js.native
  
  @js.native
  sealed trait OGGInviteOptOut
    extends StObject
       with EAccountFlags
  /* 65536 */ val OGGInviteOptOut: typingsJapgolly.steamClient.mod.EAccountFlags.OGGInviteOptOut & Double = js.native
  
  @js.native
  sealed trait ParentalSettings
    extends StObject
       with EAccountFlags
  /* 268435456 */ val ParentalSettings: typingsJapgolly.steamClient.mod.EAccountFlags.ParentalSettings & Double = js.native
  
  @js.native
  sealed trait PasswordSet
    extends StObject
       with EAccountFlags
  /* 4 */ val PasswordSet: typingsJapgolly.steamClient.mod.EAccountFlags.PasswordSet & Double = js.native
  
  @js.native
  sealed trait PersonaNameSet
    extends StObject
       with EAccountFlags
  /* 1 */ val PersonaNameSet: typingsJapgolly.steamClient.mod.EAccountFlags.PersonaNameSet & Double = js.native
  
  @js.native
  sealed trait PersonalQASet
    extends StObject
       with EAccountFlags
  /* 256 */ val PersonalQASet: typingsJapgolly.steamClient.mod.EAccountFlags.PersonalQASet & Double = js.native
  
  @js.native
  sealed trait Steam2MigrationComplete
    extends StObject
       with EAccountFlags
  /* 2097152 */ val Steam2MigrationComplete: typingsJapgolly.steamClient.mod.EAccountFlags.Steam2MigrationComplete & Double = js.native
  
  @js.native
  sealed trait Supervisor
    extends StObject
       with EAccountFlags
  /* 32 */ val Supervisor: typingsJapgolly.steamClient.mod.EAccountFlags.Supervisor & Double = js.native
  
  @js.native
  sealed trait Support
    extends StObject
       with EAccountFlags
  /* 8 */ val Support: typingsJapgolly.steamClient.mod.EAccountFlags.Support & Double = js.native
  
  @js.native
  sealed trait ThirdPartySupport
    extends StObject
       with EAccountFlags
  /* 536870912 */ val ThirdPartySupport: typingsJapgolly.steamClient.mod.EAccountFlags.ThirdPartySupport & Double = js.native
  
  @js.native
  sealed trait Unbannable
    extends StObject
       with EAccountFlags
  /* 2 */ val Unbannable: typingsJapgolly.steamClient.mod.EAccountFlags.Unbannable & Double = js.native
  
  @js.native
  sealed trait VacBeta
    extends StObject
       with EAccountFlags
  /* 512 */ val VacBeta: typingsJapgolly.steamClient.mod.EAccountFlags.VacBeta & Double = js.native
}
