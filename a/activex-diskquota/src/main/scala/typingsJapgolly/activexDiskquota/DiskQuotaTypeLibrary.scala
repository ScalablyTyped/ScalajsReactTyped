package typingsJapgolly.activexDiskquota

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexDiskquota.activexDiskquotaInts.`0`
import typingsJapgolly.activexDiskquota.activexDiskquotaInts.`1`
import typingsJapgolly.activexDiskquota.activexDiskquotaInts.`2`
import typingsJapgolly.activexDiskquota.activexDiskquotaInts.`3`
import typingsJapgolly.activexDiskquota.activexDiskquotaInts.`4`
import typingsJapgolly.activexDiskquota.activexDiskquotaInts.`5`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DiskQuotaTypeLibrary {
  
  // eslint-disable-next-line no-const-enum
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.activexDiskquota.activexDiskquotaInts.`2`
    - typingsJapgolly.activexDiskquota.activexDiskquotaInts.`3`
    - typingsJapgolly.activexDiskquota.activexDiskquotaInts.`0`
    - typingsJapgolly.activexDiskquota.activexDiskquotaInts.`1`
    - typingsJapgolly.activexDiskquota.activexDiskquotaInts.`4`
    - typingsJapgolly.activexDiskquota.activexDiskquotaInts.`5`
  */
  trait AccountStatusConstants extends StObject
  object AccountStatusConstants {
    
    inline def dqAcctDeleted: `2` = 2.asInstanceOf[`2`]
    
    inline def dqAcctInvalid: `3` = 3.asInstanceOf[`3`]
    
    inline def dqAcctResolved: `0` = 0.asInstanceOf[`0`]
    
    inline def dqAcctUnavailable: `1` = 1.asInstanceOf[`1`]
    
    inline def dqAcctUnknown: `4` = 4.asInstanceOf[`4`]
    
    inline def dqAcctUnresolved: `5` = 5.asInstanceOf[`5`]
  }
  
  /** Automation interface for DiskQuotaUser */
  trait DIDiskQuotaUser extends StObject {
    
    /** Name of user's account container */
    val AccountContainerName: String
    
    /** Status of user's account */
    val AccountStatus: AccountStatusConstants
    
    /* private */ @JSName("DiskQuotaTypeLibrary.DIDiskQuotaUser_typekey")
    var DiskQuotaTypeLibraryDotDIDiskQuotaUser_typekey: DIDiskQuotaUser
    
    /** User's display name */
    val DisplayName: String
    
    /** Unique ID number */
    val ID: Double
    
    /** Invalidate data cached in user object */
    def Invalidate(): Unit
    
    /** User's logon account name */
    val LogonName: String
    
    /** User's quota limit (bytes) */
    var QuotaLimit: Double
    
    /** User's quota limit (text) */
    val QuotaLimitText: String
    
    /** User's quota warning threshold (bytes) */
    var QuotaThreshold: Double
    
    /** User's quota warning threshold (text) */
    val QuotaThresholdText: String
    
    /** Quota charged to user (bytes) */
    val QuotaUsed: Double
    
    /** Quota charged to user (text) */
    val QuotaUsedText: String
  }
  object DIDiskQuotaUser {
    
    inline def apply(
      AccountContainerName: String,
      AccountStatus: AccountStatusConstants,
      DiskQuotaTypeLibraryDotDIDiskQuotaUser_typekey: DIDiskQuotaUser,
      DisplayName: String,
      ID: Double,
      Invalidate: Callback,
      LogonName: String,
      QuotaLimit: Double,
      QuotaLimitText: String,
      QuotaThreshold: Double,
      QuotaThresholdText: String,
      QuotaUsed: Double,
      QuotaUsedText: String
    ): DIDiskQuotaUser = {
      val __obj = js.Dynamic.literal(AccountContainerName = AccountContainerName.asInstanceOf[js.Any], AccountStatus = AccountStatus.asInstanceOf[js.Any], DisplayName = DisplayName.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Invalidate = Invalidate.toJsFn, LogonName = LogonName.asInstanceOf[js.Any], QuotaLimit = QuotaLimit.asInstanceOf[js.Any], QuotaLimitText = QuotaLimitText.asInstanceOf[js.Any], QuotaThreshold = QuotaThreshold.asInstanceOf[js.Any], QuotaThresholdText = QuotaThresholdText.asInstanceOf[js.Any], QuotaUsed = QuotaUsed.asInstanceOf[js.Any], QuotaUsedText = QuotaUsedText.asInstanceOf[js.Any])
      __obj.updateDynamic("DiskQuotaTypeLibrary.DIDiskQuotaUser_typekey")(DiskQuotaTypeLibraryDotDIDiskQuotaUser_typekey.asInstanceOf[js.Any])
      __obj.asInstanceOf[DIDiskQuotaUser]
    }
    
    extension [Self <: DIDiskQuotaUser](x: Self) {
      
      inline def setAccountContainerName(value: String): Self = StObject.set(x, "AccountContainerName", value.asInstanceOf[js.Any])
      
      inline def setAccountStatus(value: AccountStatusConstants): Self = StObject.set(x, "AccountStatus", value.asInstanceOf[js.Any])
      
      inline def setDiskQuotaTypeLibraryDotDIDiskQuotaUser_typekey(value: DIDiskQuotaUser): Self = StObject.set(x, "DiskQuotaTypeLibrary.DIDiskQuotaUser_typekey", value.asInstanceOf[js.Any])
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
      
      inline def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
      
      inline def setInvalidate(value: Callback): Self = StObject.set(x, "Invalidate", value.toJsFn)
      
      inline def setLogonName(value: String): Self = StObject.set(x, "LogonName", value.asInstanceOf[js.Any])
      
      inline def setQuotaLimit(value: Double): Self = StObject.set(x, "QuotaLimit", value.asInstanceOf[js.Any])
      
      inline def setQuotaLimitText(value: String): Self = StObject.set(x, "QuotaLimitText", value.asInstanceOf[js.Any])
      
      inline def setQuotaThreshold(value: Double): Self = StObject.set(x, "QuotaThreshold", value.asInstanceOf[js.Any])
      
      inline def setQuotaThresholdText(value: String): Self = StObject.set(x, "QuotaThresholdText", value.asInstanceOf[js.Any])
      
      inline def setQuotaUsed(value: Double): Self = StObject.set(x, "QuotaUsed", value.asInstanceOf[js.Any])
      
      inline def setQuotaUsedText(value: String): Self = StObject.set(x, "QuotaUsedText", value.asInstanceOf[js.Any])
    }
  }
  
  /** Microsoft Disk Quota */
  trait DiskQuotaControl extends StObject {
    
    /** Add a user quota entry by Name */
    def AddUser(LogonName: String): DIDiskQuotaUser
    
    /** Default quota limit applied to new volume users (byte value) */
    var DefaultQuotaLimit: Double
    
    /** Default quota limit applied to new volume users (text string) */
    val DefaultQuotaLimitText: String
    
    /** Default warning threshold applied to new volume users (byte value) */
    var DefaultQuotaThreshold: Double
    
    /** Default warning threshold applied to new volume users (text string) */
    val DefaultQuotaThresholdText: String
    
    /** Delete a user quota entry */
    def DeleteUser(pUser: DIDiskQuotaUser): Unit
    
    /* private */ @JSName("DiskQuotaTypeLibrary.DiskQuotaControl_typekey")
    var DiskQuotaTypeLibraryDotDiskQuotaControl_typekey: DiskQuotaControl
    
    /** Find a user quota entry by Name */
    def FindUser(LogonName: String): DIDiskQuotaUser
    
    /** Promote a user quota entry to the head of the name resolution queue */
    def GiveUserNameResolutionPriority(pUser: DIDiskQuotaUser): Unit
    
    /** Initialize the quota control object for a specified volume */
    def Initialize(path: String, bReadWrite: Boolean): Unit
    
    /** Invalidate the cache of user name information */
    def InvalidateSidNameCache(): Unit
    
    /** Write event log entry when user exceeds quota limit */
    var LogQuotaLimit: Boolean
    
    /** Write event log entry when user exceeds quota warning threshold */
    var LogQuotaThreshold: Boolean
    
    /** Indicates if quota information is out of date */
    val QuotaFileIncomplete: Boolean
    
    /** Indicates if quota information is being rebuilt */
    val QuotaFileRebuilding: Boolean
    
    /** State of the volume's disk quota system */
    var QuotaState: QuotaStateConstants
    
    /** Terminate the user name resolution thread */
    def ShutdownNameResolution(): Unit
    
    /** Translates a user logon name to a security ID */
    def TranslateLogonNameToSID(LogonName: String): String
    
    /** Control the resolution of user Security IDs to user Names */
    var UserNameResolution: UserNameResolutionConstants
  }
  object DiskQuotaControl {
    
    inline def apply(
      AddUser: String => DIDiskQuotaUser,
      DefaultQuotaLimit: Double,
      DefaultQuotaLimitText: String,
      DefaultQuotaThreshold: Double,
      DefaultQuotaThresholdText: String,
      DeleteUser: DIDiskQuotaUser => Callback,
      DiskQuotaTypeLibraryDotDiskQuotaControl_typekey: DiskQuotaControl,
      FindUser: String => DIDiskQuotaUser,
      GiveUserNameResolutionPriority: DIDiskQuotaUser => Callback,
      Initialize: (String, Boolean) => Callback,
      InvalidateSidNameCache: Callback,
      LogQuotaLimit: Boolean,
      LogQuotaThreshold: Boolean,
      QuotaFileIncomplete: Boolean,
      QuotaFileRebuilding: Boolean,
      QuotaState: QuotaStateConstants,
      ShutdownNameResolution: Callback,
      TranslateLogonNameToSID: String => String,
      UserNameResolution: UserNameResolutionConstants
    ): DiskQuotaControl = {
      val __obj = js.Dynamic.literal(AddUser = js.Any.fromFunction1(AddUser), DefaultQuotaLimit = DefaultQuotaLimit.asInstanceOf[js.Any], DefaultQuotaLimitText = DefaultQuotaLimitText.asInstanceOf[js.Any], DefaultQuotaThreshold = DefaultQuotaThreshold.asInstanceOf[js.Any], DefaultQuotaThresholdText = DefaultQuotaThresholdText.asInstanceOf[js.Any], DeleteUser = js.Any.fromFunction1((t0: DIDiskQuotaUser) => DeleteUser(t0).runNow()), FindUser = js.Any.fromFunction1(FindUser), GiveUserNameResolutionPriority = js.Any.fromFunction1((t0: DIDiskQuotaUser) => GiveUserNameResolutionPriority(t0).runNow()), Initialize = js.Any.fromFunction2((t0: String, t1: Boolean) => (Initialize(t0, t1)).runNow()), InvalidateSidNameCache = InvalidateSidNameCache.toJsFn, LogQuotaLimit = LogQuotaLimit.asInstanceOf[js.Any], LogQuotaThreshold = LogQuotaThreshold.asInstanceOf[js.Any], QuotaFileIncomplete = QuotaFileIncomplete.asInstanceOf[js.Any], QuotaFileRebuilding = QuotaFileRebuilding.asInstanceOf[js.Any], QuotaState = QuotaState.asInstanceOf[js.Any], ShutdownNameResolution = ShutdownNameResolution.toJsFn, TranslateLogonNameToSID = js.Any.fromFunction1(TranslateLogonNameToSID), UserNameResolution = UserNameResolution.asInstanceOf[js.Any])
      __obj.updateDynamic("DiskQuotaTypeLibrary.DiskQuotaControl_typekey")(DiskQuotaTypeLibraryDotDiskQuotaControl_typekey.asInstanceOf[js.Any])
      __obj.asInstanceOf[DiskQuotaControl]
    }
    
    extension [Self <: DiskQuotaControl](x: Self) {
      
      inline def setAddUser(value: String => DIDiskQuotaUser): Self = StObject.set(x, "AddUser", js.Any.fromFunction1(value))
      
      inline def setDefaultQuotaLimit(value: Double): Self = StObject.set(x, "DefaultQuotaLimit", value.asInstanceOf[js.Any])
      
      inline def setDefaultQuotaLimitText(value: String): Self = StObject.set(x, "DefaultQuotaLimitText", value.asInstanceOf[js.Any])
      
      inline def setDefaultQuotaThreshold(value: Double): Self = StObject.set(x, "DefaultQuotaThreshold", value.asInstanceOf[js.Any])
      
      inline def setDefaultQuotaThresholdText(value: String): Self = StObject.set(x, "DefaultQuotaThresholdText", value.asInstanceOf[js.Any])
      
      inline def setDeleteUser(value: DIDiskQuotaUser => Callback): Self = StObject.set(x, "DeleteUser", js.Any.fromFunction1((t0: DIDiskQuotaUser) => value(t0).runNow()))
      
      inline def setDiskQuotaTypeLibraryDotDiskQuotaControl_typekey(value: DiskQuotaControl): Self = StObject.set(x, "DiskQuotaTypeLibrary.DiskQuotaControl_typekey", value.asInstanceOf[js.Any])
      
      inline def setFindUser(value: String => DIDiskQuotaUser): Self = StObject.set(x, "FindUser", js.Any.fromFunction1(value))
      
      inline def setGiveUserNameResolutionPriority(value: DIDiskQuotaUser => Callback): Self = StObject.set(x, "GiveUserNameResolutionPriority", js.Any.fromFunction1((t0: DIDiskQuotaUser) => value(t0).runNow()))
      
      inline def setInitialize(value: (String, Boolean) => Callback): Self = StObject.set(x, "Initialize", js.Any.fromFunction2((t0: String, t1: Boolean) => (value(t0, t1)).runNow()))
      
      inline def setInvalidateSidNameCache(value: Callback): Self = StObject.set(x, "InvalidateSidNameCache", value.toJsFn)
      
      inline def setLogQuotaLimit(value: Boolean): Self = StObject.set(x, "LogQuotaLimit", value.asInstanceOf[js.Any])
      
      inline def setLogQuotaThreshold(value: Boolean): Self = StObject.set(x, "LogQuotaThreshold", value.asInstanceOf[js.Any])
      
      inline def setQuotaFileIncomplete(value: Boolean): Self = StObject.set(x, "QuotaFileIncomplete", value.asInstanceOf[js.Any])
      
      inline def setQuotaFileRebuilding(value: Boolean): Self = StObject.set(x, "QuotaFileRebuilding", value.asInstanceOf[js.Any])
      
      inline def setQuotaState(value: QuotaStateConstants): Self = StObject.set(x, "QuotaState", value.asInstanceOf[js.Any])
      
      inline def setShutdownNameResolution(value: Callback): Self = StObject.set(x, "ShutdownNameResolution", value.toJsFn)
      
      inline def setTranslateLogonNameToSID(value: String => String): Self = StObject.set(x, "TranslateLogonNameToSID", js.Any.fromFunction1(value))
      
      inline def setUserNameResolution(value: UserNameResolutionConstants): Self = StObject.set(x, "UserNameResolution", value.asInstanceOf[js.Any])
    }
  }
  
  // eslint-disable-next-line no-const-enum
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.activexDiskquota.activexDiskquotaInts.`0`
    - typingsJapgolly.activexDiskquota.activexDiskquotaInts.`2`
    - typingsJapgolly.activexDiskquota.activexDiskquotaInts.`1`
  */
  trait QuotaStateConstants extends StObject
  object QuotaStateConstants {
    
    inline def dqStateDisable: `0` = 0.asInstanceOf[`0`]
    
    inline def dqStateEnforce: `2` = 2.asInstanceOf[`2`]
    
    inline def dqStateTrack: `1` = 1.asInstanceOf[`1`]
  }
  
  // eslint-disable-next-line no-const-enum
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.activexDiskquota.activexDiskquotaInts.`2`
    - typingsJapgolly.activexDiskquota.activexDiskquotaInts.`0`
    - typingsJapgolly.activexDiskquota.activexDiskquotaInts.`1`
  */
  trait UserNameResolutionConstants extends StObject
  object UserNameResolutionConstants {
    
    inline def dqResolveAsync: `2` = 2.asInstanceOf[`2`]
    
    inline def dqResolveNone: `0` = 0.asInstanceOf[`0`]
    
    inline def dqResolveSync: `1` = 1.asInstanceOf[`1`]
  }
}
