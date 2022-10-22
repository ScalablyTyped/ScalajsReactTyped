package typingsJapgolly.steamcommunity.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EResult extends StObject
@JSImport("steamcommunity", "EResult")
@js.native
object EResult extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EResult & Double] = js.native
  
  @js.native
  sealed trait AccessDenied
    extends StObject
       with EResult
  /* 15 */ val AccessDenied: typingsJapgolly.steamcommunity.mod.EResult.AccessDenied & Double = js.native
  
  @js.native
  sealed trait AccountActivityLimitExceeded
    extends StObject
       with EResult
  /* 96 */ val AccountActivityLimitExceeded: typingsJapgolly.steamcommunity.mod.EResult.AccountActivityLimitExceeded & Double = js.native
  
  // removed "renamed to AccountAssociatedToMultiplePartners
  @js.native
  sealed trait AccountAssociatedToMultiplePartners
    extends StObject
       with EResult
  /* 90 */ val AccountAssociatedToMultiplePartners: typingsJapgolly.steamcommunity.mod.EResult.AccountAssociatedToMultiplePartners & Double = js.native
  
  @js.native
  sealed trait AccountAssociatedToMultiplePlayers
    extends StObject
       with EResult
  /* 90 */ val AccountAssociatedToMultiplePlayers: typingsJapgolly.steamcommunity.mod.EResult.AccountAssociatedToMultiplePlayers & Double = js.native
  
  @js.native
  sealed trait AccountDisabled
    extends StObject
       with EResult
  /* 43 */ val AccountDisabled: typingsJapgolly.steamcommunity.mod.EResult.AccountDisabled & Double = js.native
  
  @js.native
  sealed trait AccountHasAnExistingUserCancelledLicense
    extends StObject
       with EResult
  /* 115 */ val AccountHasAnExistingUserCancelledLicense: typingsJapgolly.steamcommunity.mod.EResult.AccountHasAnExistingUserCancelledLicense & Double = js.native
  
  @js.native
  sealed trait AccountHasBeenDeleted
    extends StObject
       with EResult
  /* 114 */ val AccountHasBeenDeleted: typingsJapgolly.steamcommunity.mod.EResult.AccountHasBeenDeleted & Double = js.native
  
  // removed "renamed to AccountLimitExceeded
  @js.native
  sealed trait AccountLimitExceeded
    extends StObject
       with EResult
  /* 95 */ val AccountLimitExceeded: typingsJapgolly.steamcommunity.mod.EResult.AccountLimitExceeded & Double = js.native
  
  @js.native
  sealed trait AccountLocked
    extends StObject
       with EResult
  /* 73 */ val AccountLocked: typingsJapgolly.steamcommunity.mod.EResult.AccountLocked & Double = js.native
  
  // removed "renamed to AccountLockedDown
  @js.native
  sealed trait AccountLockedDown
    extends StObject
       with EResult
  /* 73 */ val AccountLockedDown: typingsJapgolly.steamcommunity.mod.EResult.AccountLockedDown & Double = js.native
  
  // removed "renamed to AccountLoginDeniedNeedTwoFactor
  @js.native
  sealed trait AccountLoginDeniedNeedTwoFactor
    extends StObject
       with EResult
  /* 85 */ val AccountLoginDeniedNeedTwoFactor: typingsJapgolly.steamcommunity.mod.EResult.AccountLoginDeniedNeedTwoFactor & Double = js.native
  
  @js.native
  sealed trait AccountLoginDeniedThrottle
    extends StObject
       with EResult
  /* 87 */ val AccountLoginDeniedThrottle: typingsJapgolly.steamcommunity.mod.EResult.AccountLoginDeniedThrottle & Double = js.native
  
  @js.native
  sealed trait AccountLogonDenied
    extends StObject
       with EResult
  /* 63 */ val AccountLogonDenied: typingsJapgolly.steamcommunity.mod.EResult.AccountLogonDenied & Double = js.native
  
  @js.native
  sealed trait AccountLogonDeniedNeedTwoFactorCode
    extends StObject
       with EResult
  /* 85 */ val AccountLogonDeniedNeedTwoFactorCode: typingsJapgolly.steamcommunity.mod.EResult.AccountLogonDeniedNeedTwoFactorCode & Double = js.native
  
  // removed "renamed to AccountLogonDeniedNoMail
  @js.native
  sealed trait AccountLogonDeniedNoMail
    extends StObject
       with EResult
  /* 66 */ val AccountLogonDeniedNoMail: typingsJapgolly.steamcommunity.mod.EResult.AccountLogonDeniedNoMail & Double = js.native
  
  @js.native
  sealed trait AccountLogonDeniedNoMailSent
    extends StObject
       with EResult
  /* 66 */ val AccountLogonDeniedNoMailSent: typingsJapgolly.steamcommunity.mod.EResult.AccountLogonDeniedNoMailSent & Double = js.native
  
  @js.native
  sealed trait AccountLogonDeniedVerifiedEmailRequired
    extends StObject
       with EResult
  /* 74 */ val AccountLogonDeniedVerifiedEmailRequired: typingsJapgolly.steamcommunity.mod.EResult.AccountLogonDeniedVerifiedEmailRequired & Double = js.native
  
  @js.native
  sealed trait AccountNotFeatured
    extends StObject
       with EResult
  /* 45 */ val AccountNotFeatured: typingsJapgolly.steamcommunity.mod.EResult.AccountNotFeatured & Double = js.native
  
  @js.native
  sealed trait AccountNotFound
    extends StObject
       with EResult
  /* 18 */ val AccountNotFound: typingsJapgolly.steamcommunity.mod.EResult.AccountNotFound & Double = js.native
  
  @js.native
  sealed trait AccountNotFriends
    extends StObject
       with EResult
  /* 111 */ val AccountNotFriends: typingsJapgolly.steamcommunity.mod.EResult.AccountNotFriends & Double = js.native
  
  @js.native
  sealed trait AdministratorOK
    extends StObject
       with EResult
  /* 46 */ val AdministratorOK: typingsJapgolly.steamcommunity.mod.EResult.AdministratorOK & Double = js.native
  
  @js.native
  sealed trait AlreadyLoggedInElsewhere
    extends StObject
       with EResult
  /* 50 */ val AlreadyLoggedInElsewhere: typingsJapgolly.steamcommunity.mod.EResult.AlreadyLoggedInElsewhere & Double = js.native
  
  @js.native
  sealed trait AlreadyOwned
    extends StObject
       with EResult
  /* 30 */ val AlreadyOwned: typingsJapgolly.steamcommunity.mod.EResult.AlreadyOwned & Double = js.native
  
  @js.native
  sealed trait AlreadyRedeemed
    extends StObject
       with EResult
  /* 28 */ val AlreadyRedeemed: typingsJapgolly.steamcommunity.mod.EResult.AlreadyRedeemed & Double = js.native
  
  @js.native
  sealed trait BadResponse
    extends StObject
       with EResult
  /* 76 */ val BadResponse: typingsJapgolly.steamcommunity.mod.EResult.BadResponse & Double = js.native
  
  @js.native
  sealed trait Banned
    extends StObject
       with EResult
  /* 17 */ val Banned: typingsJapgolly.steamcommunity.mod.EResult.Banned & Double = js.native
  
  @js.native
  sealed trait Blocked
    extends StObject
       with EResult
  /* 40 */ val Blocked: typingsJapgolly.steamcommunity.mod.EResult.Blocked & Double = js.native
  
  @js.native
  sealed trait Busy
    extends StObject
       with EResult
  /* 10 */ val Busy: typingsJapgolly.steamcommunity.mod.EResult.Busy & Double = js.native
  
  @js.native
  sealed trait Cancelled
    extends StObject
       with EResult
  /* 52 */ val Cancelled: typingsJapgolly.steamcommunity.mod.EResult.Cancelled & Double = js.native
  
  @js.native
  sealed trait CannotUseOldPassword
    extends StObject
       with EResult
  /* 64 */ val CannotUseOldPassword: typingsJapgolly.steamcommunity.mod.EResult.CannotUseOldPassword & Double = js.native
  
  @js.native
  sealed trait CantRemoveItem
    extends StObject
       with EResult
  /* 113 */ val CantRemoveItem: typingsJapgolly.steamcommunity.mod.EResult.CantRemoveItem & Double = js.native
  
  @js.native
  sealed trait ClientNoLongerSupported
    extends StObject
       with EResult
  /* 119 */ val ClientNoLongerSupported: typingsJapgolly.steamcommunity.mod.EResult.ClientNoLongerSupported & Double = js.native
  
  @js.native
  sealed trait ConnectFailed
    extends StObject
       with EResult
  /* 35 */ val ConnectFailed: typingsJapgolly.steamcommunity.mod.EResult.ConnectFailed & Double = js.native
  
  @js.native
  sealed trait ContentVersion
    extends StObject
       with EResult
  /* 47 */ val ContentVersion: typingsJapgolly.steamcommunity.mod.EResult.ContentVersion & Double = js.native
  
  @js.native
  sealed trait DataCorruption
    extends StObject
       with EResult
  /* 53 */ val DataCorruption: typingsJapgolly.steamcommunity.mod.EResult.DataCorruption & Double = js.native
  
  @js.native
  sealed trait DeniedDueToCommunityCooldown
    extends StObject
       with EResult
  /* 116 */ val DeniedDueToCommunityCooldown: typingsJapgolly.steamcommunity.mod.EResult.DeniedDueToCommunityCooldown & Double = js.native
  
  @js.native
  sealed trait Disabled
    extends StObject
       with EResult
  /* 80 */ val Disabled: typingsJapgolly.steamcommunity.mod.EResult.Disabled & Double = js.native
  
  @js.native
  sealed trait DiskFull
    extends StObject
       with EResult
  /* 54 */ val DiskFull: typingsJapgolly.steamcommunity.mod.EResult.DiskFull & Double = js.native
  
  @js.native
  sealed trait DuplicateName
    extends StObject
       with EResult
  /* 14 */ val DuplicateName: typingsJapgolly.steamcommunity.mod.EResult.DuplicateName & Double = js.native
  
  @js.native
  sealed trait DuplicateRequest
    extends StObject
       with EResult
  /* 29 */ val DuplicateRequest: typingsJapgolly.steamcommunity.mod.EResult.DuplicateRequest & Double = js.native
  
  @js.native
  sealed trait EmailSendFailure
    extends StObject
       with EResult
  /* 99 */ val EmailSendFailure: typingsJapgolly.steamcommunity.mod.EResult.EmailSendFailure & Double = js.native
  
  @js.native
  sealed trait EncryptionFailure
    extends StObject
       with EResult
  /* 23 */ val EncryptionFailure: typingsJapgolly.steamcommunity.mod.EResult.EncryptionFailure & Double = js.native
  
  @js.native
  sealed trait Expired
    extends StObject
       with EResult
  /* 27 */ val Expired: typingsJapgolly.steamcommunity.mod.EResult.Expired & Double = js.native
  
  @js.native
  sealed trait ExpiredLoginAuthCode
    extends StObject
       with EResult
  /* 71 */ val ExpiredLoginAuthCode: typingsJapgolly.steamcommunity.mod.EResult.ExpiredLoginAuthCode & Double = js.native
  
  @js.native
  sealed trait ExternalAccountAlreadyLinked
    extends StObject
       with EResult
  /* 59 */ val ExternalAccountAlreadyLinked: typingsJapgolly.steamcommunity.mod.EResult.ExternalAccountAlreadyLinked & Double = js.native
  
  @js.native
  sealed trait ExternalAccountUnlinked
    extends StObject
       with EResult
  /* 57 */ val ExternalAccountUnlinked: typingsJapgolly.steamcommunity.mod.EResult.ExternalAccountUnlinked & Double = js.native
  
  @js.native
  sealed trait FacebookQueryError
    extends StObject
       with EResult
  /* 70 */ val FacebookQueryError: typingsJapgolly.steamcommunity.mod.EResult.FacebookQueryError & Double = js.native
  
  @js.native
  sealed trait Fail
    extends StObject
       with EResult
  /* 2 */ val Fail: typingsJapgolly.steamcommunity.mod.EResult.Fail & Double = js.native
  
  @js.native
  sealed trait FileNotFound
    extends StObject
       with EResult
  /* 9 */ val FileNotFound: typingsJapgolly.steamcommunity.mod.EResult.FileNotFound & Double = js.native
  
  @js.native
  sealed trait GSLTDenied
    extends StObject
       with EResult
  /* 102 */ val GSLTDenied: typingsJapgolly.steamcommunity.mod.EResult.GSLTDenied & Double = js.native
  
  @js.native
  sealed trait GSLTExpired
    extends StObject
       with EResult
  /* 106 */ val GSLTExpired: typingsJapgolly.steamcommunity.mod.EResult.GSLTExpired & Double = js.native
  
  @js.native
  sealed trait GSOwnerDenied
    extends StObject
       with EResult
  /* 103 */ val GSOwnerDenied: typingsJapgolly.steamcommunity.mod.EResult.GSOwnerDenied & Double = js.native
  
  @js.native
  sealed trait HandshakeFailed
    extends StObject
       with EResult
  /* 36 */ val HandshakeFailed: typingsJapgolly.steamcommunity.mod.EResult.HandshakeFailed & Double = js.native
  
  @js.native
  sealed trait HardwareNotCapableOfIPT
    extends StObject
       with EResult
  /* 67 */ val HardwareNotCapableOfIPT: typingsJapgolly.steamcommunity.mod.EResult.HardwareNotCapableOfIPT & Double = js.native
  
  @js.native
  sealed trait IOFailure
    extends StObject
       with EResult
  /* 37 */ val IOFailure: typingsJapgolly.steamcommunity.mod.EResult.IOFailure & Double = js.native
  
  @js.native
  sealed trait IPBanned
    extends StObject
       with EResult
  /* 105 */ val IPBanned: typingsJapgolly.steamcommunity.mod.EResult.IPBanned & Double = js.native
  
  @js.native
  sealed trait IPLoginRestrictionFailed
    extends StObject
       with EResult
  /* 72 */ val IPLoginRestrictionFailed: typingsJapgolly.steamcommunity.mod.EResult.IPLoginRestrictionFailed & Double = js.native
  
  @js.native
  sealed trait IPNotFound
    extends StObject
       with EResult
  /* 31 */ val IPNotFound: typingsJapgolly.steamcommunity.mod.EResult.IPNotFound & Double = js.native
  
  @js.native
  sealed trait IPTInitError
    extends StObject
       with EResult
  /* 68 */ val IPTInitError: typingsJapgolly.steamcommunity.mod.EResult.IPTInitError & Double = js.native
  
  @js.native
  sealed trait Ignored
    extends StObject
       with EResult
  /* 41 */ val Ignored: typingsJapgolly.steamcommunity.mod.EResult.Ignored & Double = js.native
  
  @js.native
  sealed trait IllegalPassword
    extends StObject
       with EResult
  /* 61 */ val IllegalPassword: typingsJapgolly.steamcommunity.mod.EResult.IllegalPassword & Double = js.native
  
  @js.native
  sealed trait InsufficientFunds
    extends StObject
       with EResult
  /* 107 */ val InsufficientFunds: typingsJapgolly.steamcommunity.mod.EResult.InsufficientFunds & Double = js.native
  
  @js.native
  sealed trait InsufficientPrivilege
    extends StObject
       with EResult
  /* 24 */ val InsufficientPrivilege: typingsJapgolly.steamcommunity.mod.EResult.InsufficientPrivilege & Double = js.native
  
  @js.native
  sealed trait Invalid
    extends StObject
       with EResult
  /* 0 */ val Invalid: typingsJapgolly.steamcommunity.mod.EResult.Invalid & Double = js.native
  
  @js.native
  sealed trait InvalidCEGSubmission
    extends StObject
       with EResult
  /* 81 */ val InvalidCEGSubmission: typingsJapgolly.steamcommunity.mod.EResult.InvalidCEGSubmission & Double = js.native
  
  @js.native
  sealed trait InvalidEmail
    extends StObject
       with EResult
  /* 13 */ val InvalidEmail: typingsJapgolly.steamcommunity.mod.EResult.InvalidEmail & Double = js.native
  
  @js.native
  sealed trait InvalidItemType
    extends StObject
       with EResult
  /* 104 */ val InvalidItemType: typingsJapgolly.steamcommunity.mod.EResult.InvalidItemType & Double = js.native
  
  @js.native
  sealed trait InvalidLoginAuthCode
    extends StObject
       with EResult
  /* 65 */ val InvalidLoginAuthCode: typingsJapgolly.steamcommunity.mod.EResult.InvalidLoginAuthCode & Double = js.native
  
  @js.native
  sealed trait InvalidName
    extends StObject
       with EResult
  /* 12 */ val InvalidName: typingsJapgolly.steamcommunity.mod.EResult.InvalidName & Double = js.native
  
  @js.native
  sealed trait InvalidParam
    extends StObject
       with EResult
  /* 8 */ val InvalidParam: typingsJapgolly.steamcommunity.mod.EResult.InvalidParam & Double = js.native
  
  @js.native
  sealed trait InvalidPassword
    extends StObject
       with EResult
  /* 5 */ val InvalidPassword: typingsJapgolly.steamcommunity.mod.EResult.InvalidPassword & Double = js.native
  
  @js.native
  sealed trait InvalidProtocolVer
    extends StObject
       with EResult
  /* 7 */ val InvalidProtocolVer: typingsJapgolly.steamcommunity.mod.EResult.InvalidProtocolVer & Double = js.native
  
  @js.native
  sealed trait InvalidState
    extends StObject
       with EResult
  /* 11 */ val InvalidState: typingsJapgolly.steamcommunity.mod.EResult.InvalidState & Double = js.native
  
  @js.native
  sealed trait InvalidSteamID
    extends StObject
       with EResult
  /* 19 */ val InvalidSteamID: typingsJapgolly.steamcommunity.mod.EResult.InvalidSteamID & Double = js.native
  
  // removed "renamed to ItemDeleted
  @js.native
  sealed trait ItemDeleted
    extends StObject
       with EResult
  /* 86 */ val ItemDeleted: typingsJapgolly.steamcommunity.mod.EResult.ItemDeleted & Double = js.native
  
  @js.native
  sealed trait ItemOrEntryHasBeenDeleted
    extends StObject
       with EResult
  /* 86 */ val ItemOrEntryHasBeenDeleted: typingsJapgolly.steamcommunity.mod.EResult.ItemOrEntryHasBeenDeleted & Double = js.native
  
  @js.native
  sealed trait LimitExceeded
    extends StObject
       with EResult
  /* 25 */ val LimitExceeded: typingsJapgolly.steamcommunity.mod.EResult.LimitExceeded & Double = js.native
  
  @js.native
  sealed trait LimitedUserAccount
    extends StObject
       with EResult
  /* 112 */ val LimitedUserAccount: typingsJapgolly.steamcommunity.mod.EResult.LimitedUserAccount & Double = js.native
  
  @js.native
  sealed trait LockingFailed
    extends StObject
       with EResult
  /* 33 */ val LockingFailed: typingsJapgolly.steamcommunity.mod.EResult.LockingFailed & Double = js.native
  
  @js.native
  sealed trait LoggedInElsewhere
    extends StObject
       with EResult
  /* 6 */ val LoggedInElsewhere: typingsJapgolly.steamcommunity.mod.EResult.LoggedInElsewhere & Double = js.native
  
  @js.native
  sealed trait LogonSessionReplaced
    extends StObject
       with EResult
  /* 34 */ val LogonSessionReplaced: typingsJapgolly.steamcommunity.mod.EResult.LogonSessionReplaced & Double = js.native
  
  @js.native
  sealed trait MustAgreeToSSA
    extends StObject
       with EResult
  /* 118 */ val MustAgreeToSSA: typingsJapgolly.steamcommunity.mod.EResult.MustAgreeToSSA & Double = js.native
  
  @js.native
  sealed trait NeedCaptcha
    extends StObject
       with EResult
  /* 101 */ val NeedCaptcha: typingsJapgolly.steamcommunity.mod.EResult.NeedCaptcha & Double = js.native
  
  @js.native
  sealed trait NoConnection
    extends StObject
       with EResult
  /* 3 */ val NoConnection: typingsJapgolly.steamcommunity.mod.EResult.NoConnection & Double = js.native
  
  @js.native
  sealed trait NoLauncherSpecified
    extends StObject
       with EResult
  /* 117 */ val NoLauncherSpecified: typingsJapgolly.steamcommunity.mod.EResult.NoLauncherSpecified & Double = js.native
  
  @js.native
  sealed trait NoMatch
    extends StObject
       with EResult
  /* 42 */ val NoMatch: typingsJapgolly.steamcommunity.mod.EResult.NoMatch & Double = js.native
  
  @js.native
  sealed trait NoMatchingURL
    extends StObject
       with EResult
  /* 75 */ val NoMatchingURL: typingsJapgolly.steamcommunity.mod.EResult.NoMatchingURL & Double = js.native
  
  // removed "renamed to NoMobileDevice
  @js.native
  sealed trait NoMobileDevice
    extends StObject
       with EResult
  /* 92 */ val NoMobileDevice: typingsJapgolly.steamcommunity.mod.EResult.NoMobileDevice & Double = js.native
  
  @js.native
  sealed trait NoMobileDeviceAvailable
    extends StObject
       with EResult
  /* 92 */ val NoMobileDeviceAvailable: typingsJapgolly.steamcommunity.mod.EResult.NoMobileDeviceAvailable & Double = js.native
  
  @js.native
  sealed trait NoSiteLicensesFound
    extends StObject
       with EResult
  /* 109 */ val NoSiteLicensesFound: typingsJapgolly.steamcommunity.mod.EResult.NoSiteLicensesFound & Double = js.native
  
  @js.native
  sealed trait NotLoggedOn
    extends StObject
       with EResult
  /* 21 */ val NotLoggedOn: typingsJapgolly.steamcommunity.mod.EResult.NotLoggedOn & Double = js.native
  
  @js.native
  sealed trait NotModified
    extends StObject
       with EResult
  /* 91 */ val NotModified: typingsJapgolly.steamcommunity.mod.EResult.NotModified & Double = js.native
  
  @js.native
  sealed trait NotSettled
    extends StObject
       with EResult
  /* 100 */ val NotSettled: typingsJapgolly.steamcommunity.mod.EResult.NotSettled & Double = js.native
  
  @js.native
  sealed trait OK
    extends StObject
       with EResult
  /* 1 */ val OK: typingsJapgolly.steamcommunity.mod.EResult.OK & Double = js.native
  
  @js.native
  sealed trait PSNTicketInvalid
    extends StObject
       with EResult
  /* 58 */ val PSNTicketInvalid: typingsJapgolly.steamcommunity.mod.EResult.PSNTicketInvalid & Double = js.native
  
  @js.native
  sealed trait ParentalControlRestricted
    extends StObject
       with EResult
  /* 69 */ val ParentalControlRestricted: typingsJapgolly.steamcommunity.mod.EResult.ParentalControlRestricted & Double = js.native
  
  @js.native
  sealed trait PasswordNotSet
    extends StObject
       with EResult
  /* 56 */ val PasswordNotSet: typingsJapgolly.steamcommunity.mod.EResult.PasswordNotSet & Double = js.native
  
  @js.native
  sealed trait PasswordRequiredToKickSession
    extends StObject
       with EResult
  /* 49 */ val PasswordRequiredToKickSession: typingsJapgolly.steamcommunity.mod.EResult.PasswordRequiredToKickSession & Double = js.native
  
  // removed "renamed to PasswordUnset
  @js.native
  sealed trait PasswordUnset
    extends StObject
       with EResult
  /* 56 */ val PasswordUnset: typingsJapgolly.steamcommunity.mod.EResult.PasswordUnset & Double = js.native
  
  @js.native
  sealed trait Pending
    extends StObject
       with EResult
  /* 22 */ val Pending: typingsJapgolly.steamcommunity.mod.EResult.Pending & Double = js.native
  
  @js.native
  sealed trait PersistFailed
    extends StObject
       with EResult
  /* 32 */ val PersistFailed: typingsJapgolly.steamcommunity.mod.EResult.PersistFailed & Double = js.native
  
  @js.native
  sealed trait PhoneActivityLimitExceeded
    extends StObject
       with EResult
  /* 97 */ val PhoneActivityLimitExceeded: typingsJapgolly.steamcommunity.mod.EResult.PhoneActivityLimitExceeded & Double = js.native
  
  @js.native
  sealed trait RateLimitExceeded
    extends StObject
       with EResult
  /* 84 */ val RateLimitExceeded: typingsJapgolly.steamcommunity.mod.EResult.RateLimitExceeded & Double = js.native
  
  @js.native
  sealed trait RefundToWallet
    extends StObject
       with EResult
  /* 98 */ val RefundToWallet: typingsJapgolly.steamcommunity.mod.EResult.RefundToWallet & Double = js.native
  
  @js.native
  sealed trait RegionLocked
    extends StObject
       with EResult
  /* 83 */ val RegionLocked: typingsJapgolly.steamcommunity.mod.EResult.RegionLocked & Double = js.native
  
  @js.native
  sealed trait RemoteCallFailed
    extends StObject
       with EResult
  /* 55 */ val RemoteCallFailed: typingsJapgolly.steamcommunity.mod.EResult.RemoteCallFailed & Double = js.native
  
  @js.native
  sealed trait RemoteDisconnect
    extends StObject
       with EResult
  /* 38 */ val RemoteDisconnect: typingsJapgolly.steamcommunity.mod.EResult.RemoteDisconnect & Double = js.native
  
  @js.native
  sealed trait RemoteFileConflict
    extends StObject
       with EResult
  /* 60 */ val RemoteFileConflict: typingsJapgolly.steamcommunity.mod.EResult.RemoteFileConflict & Double = js.native
  
  @js.native
  sealed trait RequirePasswordReEntry
    extends StObject
       with EResult
  /* 77 */ val RequirePasswordReEntry: typingsJapgolly.steamcommunity.mod.EResult.RequirePasswordReEntry & Double = js.native
  
  @js.native
  sealed trait RestrictedDevice
    extends StObject
       with EResult
  /* 82 */ val RestrictedDevice: typingsJapgolly.steamcommunity.mod.EResult.RestrictedDevice & Double = js.native
  
  @js.native
  sealed trait Revoked
    extends StObject
       with EResult
  /* 26 */ val Revoked: typingsJapgolly.steamcommunity.mod.EResult.Revoked & Double = js.native
  
  @js.native
  sealed trait SMSCodeFailed
    extends StObject
       with EResult
  /* 94 */ val SMSCodeFailed: typingsJapgolly.steamcommunity.mod.EResult.SMSCodeFailed & Double = js.native
  
  @js.native
  sealed trait SameAsPreviousValue
    extends StObject
       with EResult
  /* 62 */ val SameAsPreviousValue: typingsJapgolly.steamcommunity.mod.EResult.SameAsPreviousValue & Double = js.native
  
  @js.native
  sealed trait ServiceReadOnly
    extends StObject
       with EResult
  /* 44 */ val ServiceReadOnly: typingsJapgolly.steamcommunity.mod.EResult.ServiceReadOnly & Double = js.native
  
  @js.native
  sealed trait ServiceUnavailable
    extends StObject
       with EResult
  /* 20 */ val ServiceUnavailable: typingsJapgolly.steamcommunity.mod.EResult.ServiceUnavailable & Double = js.native
  
  @js.native
  sealed trait ShoppingCartNotFound
    extends StObject
       with EResult
  /* 39 */ val ShoppingCartNotFound: typingsJapgolly.steamcommunity.mod.EResult.ShoppingCartNotFound & Double = js.native
  
  @js.native
  sealed trait Suspended
    extends StObject
       with EResult
  /* 51 */ val Suspended: typingsJapgolly.steamcommunity.mod.EResult.Suspended & Double = js.native
  
  @js.native
  sealed trait TimeIsOutOfSync
    extends StObject
       with EResult
  /* 93 */ val TimeIsOutOfSync: typingsJapgolly.steamcommunity.mod.EResult.TimeIsOutOfSync & Double = js.native
  
  // removed "renamed to TimeNotSynced
  @js.native
  sealed trait TimeNotSynced
    extends StObject
       with EResult
  /* 93 */ val TimeNotSynced: typingsJapgolly.steamcommunity.mod.EResult.TimeNotSynced & Double = js.native
  
  @js.native
  sealed trait Timeout
    extends StObject
       with EResult
  /* 16 */ val Timeout: typingsJapgolly.steamcommunity.mod.EResult.Timeout & Double = js.native
  
  @js.native
  sealed trait TooManyAccountsAccessThisResource
    extends StObject
       with EResult
  /* 95 */ val TooManyAccountsAccessThisResource: typingsJapgolly.steamcommunity.mod.EResult.TooManyAccountsAccessThisResource & Double = js.native
  
  @js.native
  sealed trait TooManyPending
    extends StObject
       with EResult
  /* 108 */ val TooManyPending: typingsJapgolly.steamcommunity.mod.EResult.TooManyPending & Double = js.native
  
  @js.native
  sealed trait TryAnotherCM
    extends StObject
       with EResult
  /* 48 */ val TryAnotherCM: typingsJapgolly.steamcommunity.mod.EResult.TryAnotherCM & Double = js.native
  
  @js.native
  sealed trait TwoFactorActivationCodeMismatch
    extends StObject
       with EResult
  /* 89 */ val TwoFactorActivationCodeMismatch: typingsJapgolly.steamcommunity.mod.EResult.TwoFactorActivationCodeMismatch & Double = js.native
  
  @js.native
  sealed trait TwoFactorCodeMismatch
    extends StObject
       with EResult
  /* 88 */ val TwoFactorCodeMismatch: typingsJapgolly.steamcommunity.mod.EResult.TwoFactorCodeMismatch & Double = js.native
  
  @js.native
  sealed trait UnexpectedError
    extends StObject
       with EResult
  /* 79 */ val UnexpectedError: typingsJapgolly.steamcommunity.mod.EResult.UnexpectedError & Double = js.native
  
  @js.native
  sealed trait ValueOutOfRange
    extends StObject
       with EResult
  /* 78 */ val ValueOutOfRange: typingsJapgolly.steamcommunity.mod.EResult.ValueOutOfRange & Double = js.native
  
  @js.native
  sealed trait WGNetworkSendExceeded
    extends StObject
       with EResult
  /* 110 */ val WGNetworkSendExceeded: typingsJapgolly.steamcommunity.mod.EResult.WGNetworkSendExceeded & Double = js.native
}
