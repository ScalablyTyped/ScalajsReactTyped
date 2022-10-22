package typingsJapgolly.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EResult extends StObject
@JSImport("steam-user", "EResult")
@js.native
object EResult extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EResult & Double] = js.native
  
  @js.native
  sealed trait AccessDenied
    extends StObject
       with EResult
  /* 15 */ val AccessDenied: typingsJapgolly.steamUser.mod.EResult.AccessDenied & Double = js.native
  
  @js.native
  sealed trait AccountActivityLimitExceeded
    extends StObject
       with EResult
  /* 96 */ val AccountActivityLimitExceeded: typingsJapgolly.steamUser.mod.EResult.AccountActivityLimitExceeded & Double = js.native
  
  @js.native
  sealed trait AccountAssociatedToMultiplePartners
    extends StObject
       with EResult
  /* 90 */ val AccountAssociatedToMultiplePartners: typingsJapgolly.steamUser.mod.EResult.AccountAssociatedToMultiplePartners & Double = js.native
  
  @js.native
  sealed trait AccountAssociatedToMultiplePlayers
    extends StObject
       with EResult
  /* 90 */ val AccountAssociatedToMultiplePlayers: typingsJapgolly.steamUser.mod.EResult.AccountAssociatedToMultiplePlayers & Double = js.native
  
  @js.native
  sealed trait AccountDisabled
    extends StObject
       with EResult
  /* 43 */ val AccountDisabled: typingsJapgolly.steamUser.mod.EResult.AccountDisabled & Double = js.native
  
  @js.native
  sealed trait AccountHasAnExistingUserCancelledLicense
    extends StObject
       with EResult
  /* 115 */ val AccountHasAnExistingUserCancelledLicense: typingsJapgolly.steamUser.mod.EResult.AccountHasAnExistingUserCancelledLicense & Double = js.native
  
  @js.native
  sealed trait AccountHasBeenDeleted
    extends StObject
       with EResult
  /* 114 */ val AccountHasBeenDeleted: typingsJapgolly.steamUser.mod.EResult.AccountHasBeenDeleted & Double = js.native
  
  @js.native
  sealed trait AccountLimitExceeded
    extends StObject
       with EResult
  /* 95 */ val AccountLimitExceeded: typingsJapgolly.steamUser.mod.EResult.AccountLimitExceeded & Double = js.native
  
  @js.native
  sealed trait AccountLocked
    extends StObject
       with EResult
  /* 73 */ val AccountLocked: typingsJapgolly.steamUser.mod.EResult.AccountLocked & Double = js.native
  
  @js.native
  sealed trait AccountLockedDown
    extends StObject
       with EResult
  /* 73 */ val AccountLockedDown: typingsJapgolly.steamUser.mod.EResult.AccountLockedDown & Double = js.native
  
  @js.native
  sealed trait AccountLoginDeniedNeedTwoFactor
    extends StObject
       with EResult
  /* 85 */ val AccountLoginDeniedNeedTwoFactor: typingsJapgolly.steamUser.mod.EResult.AccountLoginDeniedNeedTwoFactor & Double = js.native
  
  @js.native
  sealed trait AccountLoginDeniedThrottle
    extends StObject
       with EResult
  /* 87 */ val AccountLoginDeniedThrottle: typingsJapgolly.steamUser.mod.EResult.AccountLoginDeniedThrottle & Double = js.native
  
  @js.native
  sealed trait AccountLogonDenied
    extends StObject
       with EResult
  /* 63 */ val AccountLogonDenied: typingsJapgolly.steamUser.mod.EResult.AccountLogonDenied & Double = js.native
  
  @js.native
  sealed trait AccountLogonDeniedNeedTwoFactorCode
    extends StObject
       with EResult
  /* 85 */ val AccountLogonDeniedNeedTwoFactorCode: typingsJapgolly.steamUser.mod.EResult.AccountLogonDeniedNeedTwoFactorCode & Double = js.native
  
  @js.native
  sealed trait AccountLogonDeniedNoMail
    extends StObject
       with EResult
  /* 66 */ val AccountLogonDeniedNoMail: typingsJapgolly.steamUser.mod.EResult.AccountLogonDeniedNoMail & Double = js.native
  
  @js.native
  sealed trait AccountLogonDeniedNoMailSent
    extends StObject
       with EResult
  /* 66 */ val AccountLogonDeniedNoMailSent: typingsJapgolly.steamUser.mod.EResult.AccountLogonDeniedNoMailSent & Double = js.native
  
  @js.native
  sealed trait AccountLogonDeniedVerifiedEmailRequired
    extends StObject
       with EResult
  /* 74 */ val AccountLogonDeniedVerifiedEmailRequired: typingsJapgolly.steamUser.mod.EResult.AccountLogonDeniedVerifiedEmailRequired & Double = js.native
  
  @js.native
  sealed trait AccountNotFeatured
    extends StObject
       with EResult
  /* 45 */ val AccountNotFeatured: typingsJapgolly.steamUser.mod.EResult.AccountNotFeatured & Double = js.native
  
  @js.native
  sealed trait AccountNotFound
    extends StObject
       with EResult
  /* 18 */ val AccountNotFound: typingsJapgolly.steamUser.mod.EResult.AccountNotFound & Double = js.native
  
  @js.native
  sealed trait AccountNotFriends
    extends StObject
       with EResult
  /* 111 */ val AccountNotFriends: typingsJapgolly.steamUser.mod.EResult.AccountNotFriends & Double = js.native
  
  @js.native
  sealed trait AdministratorOK
    extends StObject
       with EResult
  /* 46 */ val AdministratorOK: typingsJapgolly.steamUser.mod.EResult.AdministratorOK & Double = js.native
  
  @js.native
  sealed trait AlreadyLoggedInElsewhere
    extends StObject
       with EResult
  /* 50 */ val AlreadyLoggedInElsewhere: typingsJapgolly.steamUser.mod.EResult.AlreadyLoggedInElsewhere & Double = js.native
  
  @js.native
  sealed trait AlreadyOwned
    extends StObject
       with EResult
  /* 30 */ val AlreadyOwned: typingsJapgolly.steamUser.mod.EResult.AlreadyOwned & Double = js.native
  
  @js.native
  sealed trait AlreadyRedeemed
    extends StObject
       with EResult
  /* 28 */ val AlreadyRedeemed: typingsJapgolly.steamUser.mod.EResult.AlreadyRedeemed & Double = js.native
  
  @js.native
  sealed trait BadResponse
    extends StObject
       with EResult
  /* 76 */ val BadResponse: typingsJapgolly.steamUser.mod.EResult.BadResponse & Double = js.native
  
  @js.native
  sealed trait Banned
    extends StObject
       with EResult
  /* 17 */ val Banned: typingsJapgolly.steamUser.mod.EResult.Banned & Double = js.native
  
  @js.native
  sealed trait Blocked
    extends StObject
       with EResult
  /* 40 */ val Blocked: typingsJapgolly.steamUser.mod.EResult.Blocked & Double = js.native
  
  @js.native
  sealed trait Busy
    extends StObject
       with EResult
  /* 10 */ val Busy: typingsJapgolly.steamUser.mod.EResult.Busy & Double = js.native
  
  @js.native
  sealed trait Cancelled
    extends StObject
       with EResult
  /* 52 */ val Cancelled: typingsJapgolly.steamUser.mod.EResult.Cancelled & Double = js.native
  
  @js.native
  sealed trait CannotUseOldPassword
    extends StObject
       with EResult
  /* 64 */ val CannotUseOldPassword: typingsJapgolly.steamUser.mod.EResult.CannotUseOldPassword & Double = js.native
  
  @js.native
  sealed trait CantRemoveItem
    extends StObject
       with EResult
  /* 113 */ val CantRemoveItem: typingsJapgolly.steamUser.mod.EResult.CantRemoveItem & Double = js.native
  
  @js.native
  sealed trait ClientNoLongerSupported
    extends StObject
       with EResult
  /* 119 */ val ClientNoLongerSupported: typingsJapgolly.steamUser.mod.EResult.ClientNoLongerSupported & Double = js.native
  
  @js.native
  sealed trait ConnectFailed
    extends StObject
       with EResult
  /* 35 */ val ConnectFailed: typingsJapgolly.steamUser.mod.EResult.ConnectFailed & Double = js.native
  
  @js.native
  sealed trait ContentVersion
    extends StObject
       with EResult
  /* 47 */ val ContentVersion: typingsJapgolly.steamUser.mod.EResult.ContentVersion & Double = js.native
  
  @js.native
  sealed trait DataCorruption
    extends StObject
       with EResult
  /* 53 */ val DataCorruption: typingsJapgolly.steamUser.mod.EResult.DataCorruption & Double = js.native
  
  @js.native
  sealed trait DeniedDueToCommunityCooldown
    extends StObject
       with EResult
  /* 116 */ val DeniedDueToCommunityCooldown: typingsJapgolly.steamUser.mod.EResult.DeniedDueToCommunityCooldown & Double = js.native
  
  @js.native
  sealed trait Disabled
    extends StObject
       with EResult
  /* 80 */ val Disabled: typingsJapgolly.steamUser.mod.EResult.Disabled & Double = js.native
  
  @js.native
  sealed trait DiskFull
    extends StObject
       with EResult
  /* 54 */ val DiskFull: typingsJapgolly.steamUser.mod.EResult.DiskFull & Double = js.native
  
  @js.native
  sealed trait DuplicateName
    extends StObject
       with EResult
  /* 14 */ val DuplicateName: typingsJapgolly.steamUser.mod.EResult.DuplicateName & Double = js.native
  
  @js.native
  sealed trait DuplicateRequest
    extends StObject
       with EResult
  /* 29 */ val DuplicateRequest: typingsJapgolly.steamUser.mod.EResult.DuplicateRequest & Double = js.native
  
  @js.native
  sealed trait EmailSendFailure
    extends StObject
       with EResult
  /* 99 */ val EmailSendFailure: typingsJapgolly.steamUser.mod.EResult.EmailSendFailure & Double = js.native
  
  @js.native
  sealed trait EncryptionFailure
    extends StObject
       with EResult
  /* 23 */ val EncryptionFailure: typingsJapgolly.steamUser.mod.EResult.EncryptionFailure & Double = js.native
  
  @js.native
  sealed trait Expired
    extends StObject
       with EResult
  /* 27 */ val Expired: typingsJapgolly.steamUser.mod.EResult.Expired & Double = js.native
  
  @js.native
  sealed trait ExpiredLoginAuthCode
    extends StObject
       with EResult
  /* 71 */ val ExpiredLoginAuthCode: typingsJapgolly.steamUser.mod.EResult.ExpiredLoginAuthCode & Double = js.native
  
  @js.native
  sealed trait ExternalAccountAlreadyLinked
    extends StObject
       with EResult
  /* 59 */ val ExternalAccountAlreadyLinked: typingsJapgolly.steamUser.mod.EResult.ExternalAccountAlreadyLinked & Double = js.native
  
  @js.native
  sealed trait ExternalAccountUnlinked
    extends StObject
       with EResult
  /* 57 */ val ExternalAccountUnlinked: typingsJapgolly.steamUser.mod.EResult.ExternalAccountUnlinked & Double = js.native
  
  @js.native
  sealed trait FacebookQueryError
    extends StObject
       with EResult
  /* 70 */ val FacebookQueryError: typingsJapgolly.steamUser.mod.EResult.FacebookQueryError & Double = js.native
  
  @js.native
  sealed trait Fail
    extends StObject
       with EResult
  /* 2 */ val Fail: typingsJapgolly.steamUser.mod.EResult.Fail & Double = js.native
  
  @js.native
  sealed trait FileNotFound
    extends StObject
       with EResult
  /* 9 */ val FileNotFound: typingsJapgolly.steamUser.mod.EResult.FileNotFound & Double = js.native
  
  @js.native
  sealed trait GSLTDenied
    extends StObject
       with EResult
  /* 102 */ val GSLTDenied: typingsJapgolly.steamUser.mod.EResult.GSLTDenied & Double = js.native
  
  @js.native
  sealed trait GSLTExpired
    extends StObject
       with EResult
  /* 106 */ val GSLTExpired: typingsJapgolly.steamUser.mod.EResult.GSLTExpired & Double = js.native
  
  @js.native
  sealed trait GSOwnerDenied
    extends StObject
       with EResult
  /* 103 */ val GSOwnerDenied: typingsJapgolly.steamUser.mod.EResult.GSOwnerDenied & Double = js.native
  
  @js.native
  sealed trait HandshakeFailed
    extends StObject
       with EResult
  /* 36 */ val HandshakeFailed: typingsJapgolly.steamUser.mod.EResult.HandshakeFailed & Double = js.native
  
  @js.native
  sealed trait HardwareNotCapableOfIPT
    extends StObject
       with EResult
  /* 67 */ val HardwareNotCapableOfIPT: typingsJapgolly.steamUser.mod.EResult.HardwareNotCapableOfIPT & Double = js.native
  
  @js.native
  sealed trait IOFailure
    extends StObject
       with EResult
  /* 37 */ val IOFailure: typingsJapgolly.steamUser.mod.EResult.IOFailure & Double = js.native
  
  @js.native
  sealed trait IPBanned
    extends StObject
       with EResult
  /* 105 */ val IPBanned: typingsJapgolly.steamUser.mod.EResult.IPBanned & Double = js.native
  
  @js.native
  sealed trait IPLoginRestrictionFailed
    extends StObject
       with EResult
  /* 72 */ val IPLoginRestrictionFailed: typingsJapgolly.steamUser.mod.EResult.IPLoginRestrictionFailed & Double = js.native
  
  @js.native
  sealed trait IPNotFound
    extends StObject
       with EResult
  /* 31 */ val IPNotFound: typingsJapgolly.steamUser.mod.EResult.IPNotFound & Double = js.native
  
  @js.native
  sealed trait IPTInitError
    extends StObject
       with EResult
  /* 68 */ val IPTInitError: typingsJapgolly.steamUser.mod.EResult.IPTInitError & Double = js.native
  
  @js.native
  sealed trait Ignored
    extends StObject
       with EResult
  /* 41 */ val Ignored: typingsJapgolly.steamUser.mod.EResult.Ignored & Double = js.native
  
  @js.native
  sealed trait IllegalPassword
    extends StObject
       with EResult
  /* 61 */ val IllegalPassword: typingsJapgolly.steamUser.mod.EResult.IllegalPassword & Double = js.native
  
  @js.native
  sealed trait InsufficientFunds
    extends StObject
       with EResult
  /* 107 */ val InsufficientFunds: typingsJapgolly.steamUser.mod.EResult.InsufficientFunds & Double = js.native
  
  @js.native
  sealed trait InsufficientPrivilege
    extends StObject
       with EResult
  /* 24 */ val InsufficientPrivilege: typingsJapgolly.steamUser.mod.EResult.InsufficientPrivilege & Double = js.native
  
  @js.native
  sealed trait Invalid
    extends StObject
       with EResult
  /* 0 */ val Invalid: typingsJapgolly.steamUser.mod.EResult.Invalid & Double = js.native
  
  @js.native
  sealed trait InvalidCEGSubmission
    extends StObject
       with EResult
  /* 81 */ val InvalidCEGSubmission: typingsJapgolly.steamUser.mod.EResult.InvalidCEGSubmission & Double = js.native
  
  @js.native
  sealed trait InvalidEmail
    extends StObject
       with EResult
  /* 13 */ val InvalidEmail: typingsJapgolly.steamUser.mod.EResult.InvalidEmail & Double = js.native
  
  @js.native
  sealed trait InvalidItemType
    extends StObject
       with EResult
  /* 104 */ val InvalidItemType: typingsJapgolly.steamUser.mod.EResult.InvalidItemType & Double = js.native
  
  @js.native
  sealed trait InvalidLoginAuthCode
    extends StObject
       with EResult
  /* 65 */ val InvalidLoginAuthCode: typingsJapgolly.steamUser.mod.EResult.InvalidLoginAuthCode & Double = js.native
  
  @js.native
  sealed trait InvalidName
    extends StObject
       with EResult
  /* 12 */ val InvalidName: typingsJapgolly.steamUser.mod.EResult.InvalidName & Double = js.native
  
  @js.native
  sealed trait InvalidParam
    extends StObject
       with EResult
  /* 8 */ val InvalidParam: typingsJapgolly.steamUser.mod.EResult.InvalidParam & Double = js.native
  
  @js.native
  sealed trait InvalidPassword
    extends StObject
       with EResult
  /* 5 */ val InvalidPassword: typingsJapgolly.steamUser.mod.EResult.InvalidPassword & Double = js.native
  
  @js.native
  sealed trait InvalidProtocolVer
    extends StObject
       with EResult
  /* 7 */ val InvalidProtocolVer: typingsJapgolly.steamUser.mod.EResult.InvalidProtocolVer & Double = js.native
  
  @js.native
  sealed trait InvalidState
    extends StObject
       with EResult
  /* 11 */ val InvalidState: typingsJapgolly.steamUser.mod.EResult.InvalidState & Double = js.native
  
  @js.native
  sealed trait InvalidSteamID
    extends StObject
       with EResult
  /* 19 */ val InvalidSteamID: typingsJapgolly.steamUser.mod.EResult.InvalidSteamID & Double = js.native
  
  @js.native
  sealed trait ItemDeleted
    extends StObject
       with EResult
  /* 86 */ val ItemDeleted: typingsJapgolly.steamUser.mod.EResult.ItemDeleted & Double = js.native
  
  @js.native
  sealed trait ItemOrEntryHasBeenDeleted
    extends StObject
       with EResult
  /* 86 */ val ItemOrEntryHasBeenDeleted: typingsJapgolly.steamUser.mod.EResult.ItemOrEntryHasBeenDeleted & Double = js.native
  
  @js.native
  sealed trait LauncherMigrated
    extends StObject
       with EResult
  /* 119 */ val LauncherMigrated: typingsJapgolly.steamUser.mod.EResult.LauncherMigrated & Double = js.native
  
  @js.native
  sealed trait LimitExceeded
    extends StObject
       with EResult
  /* 25 */ val LimitExceeded: typingsJapgolly.steamUser.mod.EResult.LimitExceeded & Double = js.native
  
  @js.native
  sealed trait LimitedUserAccount
    extends StObject
       with EResult
  /* 112 */ val LimitedUserAccount: typingsJapgolly.steamUser.mod.EResult.LimitedUserAccount & Double = js.native
  
  @js.native
  sealed trait LockingFailed
    extends StObject
       with EResult
  /* 33 */ val LockingFailed: typingsJapgolly.steamUser.mod.EResult.LockingFailed & Double = js.native
  
  @js.native
  sealed trait LoggedInElsewhere
    extends StObject
       with EResult
  /* 6 */ val LoggedInElsewhere: typingsJapgolly.steamUser.mod.EResult.LoggedInElsewhere & Double = js.native
  
  @js.native
  sealed trait LogonSessionReplaced
    extends StObject
       with EResult
  /* 34 */ val LogonSessionReplaced: typingsJapgolly.steamUser.mod.EResult.LogonSessionReplaced & Double = js.native
  
  @js.native
  sealed trait MustAgreeToSSA
    extends StObject
       with EResult
  /* 118 */ val MustAgreeToSSA: typingsJapgolly.steamUser.mod.EResult.MustAgreeToSSA & Double = js.native
  
  @js.native
  sealed trait NeedCaptcha
    extends StObject
       with EResult
  /* 101 */ val NeedCaptcha: typingsJapgolly.steamUser.mod.EResult.NeedCaptcha & Double = js.native
  
  @js.native
  sealed trait NoConnection
    extends StObject
       with EResult
  /* 3 */ val NoConnection: typingsJapgolly.steamUser.mod.EResult.NoConnection & Double = js.native
  
  @js.native
  sealed trait NoLauncherSpecified
    extends StObject
       with EResult
  /* 117 */ val NoLauncherSpecified: typingsJapgolly.steamUser.mod.EResult.NoLauncherSpecified & Double = js.native
  
  @js.native
  sealed trait NoMatch
    extends StObject
       with EResult
  /* 42 */ val NoMatch: typingsJapgolly.steamUser.mod.EResult.NoMatch & Double = js.native
  
  @js.native
  sealed trait NoMatchingURL
    extends StObject
       with EResult
  /* 75 */ val NoMatchingURL: typingsJapgolly.steamUser.mod.EResult.NoMatchingURL & Double = js.native
  
  @js.native
  sealed trait NoMobileDevice
    extends StObject
       with EResult
  /* 92 */ val NoMobileDevice: typingsJapgolly.steamUser.mod.EResult.NoMobileDevice & Double = js.native
  
  @js.native
  sealed trait NoMobileDeviceAvailable
    extends StObject
       with EResult
  /* 92 */ val NoMobileDeviceAvailable: typingsJapgolly.steamUser.mod.EResult.NoMobileDeviceAvailable & Double = js.native
  
  @js.native
  sealed trait NoSiteLicensesFound
    extends StObject
       with EResult
  /* 109 */ val NoSiteLicensesFound: typingsJapgolly.steamUser.mod.EResult.NoSiteLicensesFound & Double = js.native
  
  @js.native
  sealed trait NotLoggedOn
    extends StObject
       with EResult
  /* 21 */ val NotLoggedOn: typingsJapgolly.steamUser.mod.EResult.NotLoggedOn & Double = js.native
  
  @js.native
  sealed trait NotModified
    extends StObject
       with EResult
  /* 91 */ val NotModified: typingsJapgolly.steamUser.mod.EResult.NotModified & Double = js.native
  
  @js.native
  sealed trait NotSettled
    extends StObject
       with EResult
  /* 100 */ val NotSettled: typingsJapgolly.steamUser.mod.EResult.NotSettled & Double = js.native
  
  @js.native
  sealed trait OK
    extends StObject
       with EResult
  /* 1 */ val OK: typingsJapgolly.steamUser.mod.EResult.OK & Double = js.native
  
  @js.native
  sealed trait PSNTicketInvalid
    extends StObject
       with EResult
  /* 58 */ val PSNTicketInvalid: typingsJapgolly.steamUser.mod.EResult.PSNTicketInvalid & Double = js.native
  
  @js.native
  sealed trait ParentalControlRestricted
    extends StObject
       with EResult
  /* 69 */ val ParentalControlRestricted: typingsJapgolly.steamUser.mod.EResult.ParentalControlRestricted & Double = js.native
  
  @js.native
  sealed trait PasswordNotSet
    extends StObject
       with EResult
  /* 56 */ val PasswordNotSet: typingsJapgolly.steamUser.mod.EResult.PasswordNotSet & Double = js.native
  
  @js.native
  sealed trait PasswordRequiredToKickSession
    extends StObject
       with EResult
  /* 49 */ val PasswordRequiredToKickSession: typingsJapgolly.steamUser.mod.EResult.PasswordRequiredToKickSession & Double = js.native
  
  @js.native
  sealed trait PasswordUnset
    extends StObject
       with EResult
  /* 56 */ val PasswordUnset: typingsJapgolly.steamUser.mod.EResult.PasswordUnset & Double = js.native
  
  @js.native
  sealed trait Pending
    extends StObject
       with EResult
  /* 22 */ val Pending: typingsJapgolly.steamUser.mod.EResult.Pending & Double = js.native
  
  @js.native
  sealed trait PersistFailed
    extends StObject
       with EResult
  /* 32 */ val PersistFailed: typingsJapgolly.steamUser.mod.EResult.PersistFailed & Double = js.native
  
  @js.native
  sealed trait PhoneActivityLimitExceeded
    extends StObject
       with EResult
  /* 97 */ val PhoneActivityLimitExceeded: typingsJapgolly.steamUser.mod.EResult.PhoneActivityLimitExceeded & Double = js.native
  
  @js.native
  sealed trait RateLimitExceeded
    extends StObject
       with EResult
  /* 84 */ val RateLimitExceeded: typingsJapgolly.steamUser.mod.EResult.RateLimitExceeded & Double = js.native
  
  @js.native
  sealed trait RefundToWallet
    extends StObject
       with EResult
  /* 98 */ val RefundToWallet: typingsJapgolly.steamUser.mod.EResult.RefundToWallet & Double = js.native
  
  @js.native
  sealed trait RegionLocked
    extends StObject
       with EResult
  /* 83 */ val RegionLocked: typingsJapgolly.steamUser.mod.EResult.RegionLocked & Double = js.native
  
  @js.native
  sealed trait RemoteCallFailed
    extends StObject
       with EResult
  /* 55 */ val RemoteCallFailed: typingsJapgolly.steamUser.mod.EResult.RemoteCallFailed & Double = js.native
  
  @js.native
  sealed trait RemoteDisconnect
    extends StObject
       with EResult
  /* 38 */ val RemoteDisconnect: typingsJapgolly.steamUser.mod.EResult.RemoteDisconnect & Double = js.native
  
  @js.native
  sealed trait RemoteFileConflict
    extends StObject
       with EResult
  /* 60 */ val RemoteFileConflict: typingsJapgolly.steamUser.mod.EResult.RemoteFileConflict & Double = js.native
  
  @js.native
  sealed trait RequirePasswordReEntry
    extends StObject
       with EResult
  /* 77 */ val RequirePasswordReEntry: typingsJapgolly.steamUser.mod.EResult.RequirePasswordReEntry & Double = js.native
  
  @js.native
  sealed trait RestrictedDevice
    extends StObject
       with EResult
  /* 82 */ val RestrictedDevice: typingsJapgolly.steamUser.mod.EResult.RestrictedDevice & Double = js.native
  
  @js.native
  sealed trait Revoked
    extends StObject
       with EResult
  /* 26 */ val Revoked: typingsJapgolly.steamUser.mod.EResult.Revoked & Double = js.native
  
  @js.native
  sealed trait SMSCodeFailed
    extends StObject
       with EResult
  /* 94 */ val SMSCodeFailed: typingsJapgolly.steamUser.mod.EResult.SMSCodeFailed & Double = js.native
  
  @js.native
  sealed trait SameAsPreviousValue
    extends StObject
       with EResult
  /* 62 */ val SameAsPreviousValue: typingsJapgolly.steamUser.mod.EResult.SameAsPreviousValue & Double = js.native
  
  @js.native
  sealed trait ServiceReadOnly
    extends StObject
       with EResult
  /* 44 */ val ServiceReadOnly: typingsJapgolly.steamUser.mod.EResult.ServiceReadOnly & Double = js.native
  
  @js.native
  sealed trait ServiceUnavailable
    extends StObject
       with EResult
  /* 20 */ val ServiceUnavailable: typingsJapgolly.steamUser.mod.EResult.ServiceUnavailable & Double = js.native
  
  @js.native
  sealed trait ShoppingCartNotFound
    extends StObject
       with EResult
  /* 39 */ val ShoppingCartNotFound: typingsJapgolly.steamUser.mod.EResult.ShoppingCartNotFound & Double = js.native
  
  @js.native
  sealed trait Suspended
    extends StObject
       with EResult
  /* 51 */ val Suspended: typingsJapgolly.steamUser.mod.EResult.Suspended & Double = js.native
  
  @js.native
  sealed trait TimeIsOutOfSync
    extends StObject
       with EResult
  /* 93 */ val TimeIsOutOfSync: typingsJapgolly.steamUser.mod.EResult.TimeIsOutOfSync & Double = js.native
  
  @js.native
  sealed trait TimeNotSynced
    extends StObject
       with EResult
  /* 93 */ val TimeNotSynced: typingsJapgolly.steamUser.mod.EResult.TimeNotSynced & Double = js.native
  
  @js.native
  sealed trait Timeout
    extends StObject
       with EResult
  /* 16 */ val Timeout: typingsJapgolly.steamUser.mod.EResult.Timeout & Double = js.native
  
  @js.native
  sealed trait TooManyAccountsAccessThisResource
    extends StObject
       with EResult
  /* 95 */ val TooManyAccountsAccessThisResource: typingsJapgolly.steamUser.mod.EResult.TooManyAccountsAccessThisResource & Double = js.native
  
  @js.native
  sealed trait TooManyPending
    extends StObject
       with EResult
  /* 108 */ val TooManyPending: typingsJapgolly.steamUser.mod.EResult.TooManyPending & Double = js.native
  
  @js.native
  sealed trait TryAnotherCM
    extends StObject
       with EResult
  /* 48 */ val TryAnotherCM: typingsJapgolly.steamUser.mod.EResult.TryAnotherCM & Double = js.native
  
  @js.native
  sealed trait TwoFactorActivationCodeMismatch
    extends StObject
       with EResult
  /* 89 */ val TwoFactorActivationCodeMismatch: typingsJapgolly.steamUser.mod.EResult.TwoFactorActivationCodeMismatch & Double = js.native
  
  @js.native
  sealed trait TwoFactorCodeMismatch
    extends StObject
       with EResult
  /* 88 */ val TwoFactorCodeMismatch: typingsJapgolly.steamUser.mod.EResult.TwoFactorCodeMismatch & Double = js.native
  
  @js.native
  sealed trait UnexpectedError
    extends StObject
       with EResult
  /* 79 */ val UnexpectedError: typingsJapgolly.steamUser.mod.EResult.UnexpectedError & Double = js.native
  
  @js.native
  sealed trait ValueOutOfRange
    extends StObject
       with EResult
  /* 78 */ val ValueOutOfRange: typingsJapgolly.steamUser.mod.EResult.ValueOutOfRange & Double = js.native
  
  @js.native
  sealed trait WGNetworkSendExceeded
    extends StObject
       with EResult
  /* 110 */ val WGNetworkSendExceeded: typingsJapgolly.steamUser.mod.EResult.WGNetworkSendExceeded & Double = js.native
}
