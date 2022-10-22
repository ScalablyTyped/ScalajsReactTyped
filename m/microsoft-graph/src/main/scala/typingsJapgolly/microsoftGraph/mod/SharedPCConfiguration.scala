package typingsJapgolly.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharedPCConfiguration
  extends StObject
     with DeviceConfiguration {
  
  // Specifies how accounts are managed on a shared PC. Only applies when disableAccountManager is false.
  var accountManagerPolicy: js.UndefOr[NullableOption[SharedPCAccountManagerPolicy]] = js.undefined
  
  // Specifies whether local storage is allowed on a shared PC.
  var allowLocalStorage: js.UndefOr[Boolean] = js.undefined
  
  // Indicates which type of accounts are allowed to use on a shared PC. Possible values are: guest, domain.
  var allowedAccounts: js.UndefOr[SharedPCAllowedAccountType] = js.undefined
  
  // Disables the account manager for shared PC mode.
  var disableAccountManager: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether the default shared PC education environment policies should be disabled. For Windows 10 RS2 and
    * later, this policy will be applied without setting Enabled to true.
    */
  var disableEduPolicies: js.UndefOr[Boolean] = js.undefined
  
  // Specifies whether the default shared PC power policies should be disabled.
  var disablePowerPolicies: js.UndefOr[Boolean] = js.undefined
  
  // Disables the requirement to sign in whenever the device wakes up from sleep mode.
  var disableSignInOnResume: js.UndefOr[Boolean] = js.undefined
  
  // Enables shared PC mode and applies the shared pc policies.
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the time in seconds that a device must sit idle before the PC goes to sleep. Setting this value to 0 prevents
    * the sleep timeout from occurring.
    */
  var idleTimeBeforeSleepInSeconds: js.UndefOr[NullableOption[Double]] = js.undefined
  
  /**
    * Specifies the display text for the account shown on the sign-in screen which launches the app specified by
    * SetKioskAppUserModelId. Only applies when KioskAppUserModelId is set.
    */
  var kioskAppDisplayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Specifies the application user model ID of the app to use with assigned access.
  var kioskAppUserModelId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Specifies the daily start time of maintenance hour.
  var maintenanceStartTime: js.UndefOr[NullableOption[String]] = js.undefined
}
object SharedPCConfiguration {
  
  inline def apply(): SharedPCConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedPCConfiguration]
  }
  
  extension [Self <: SharedPCConfiguration](x: Self) {
    
    inline def setAccountManagerPolicy(value: NullableOption[SharedPCAccountManagerPolicy]): Self = StObject.set(x, "accountManagerPolicy", value.asInstanceOf[js.Any])
    
    inline def setAccountManagerPolicyNull: Self = StObject.set(x, "accountManagerPolicy", null)
    
    inline def setAccountManagerPolicyUndefined: Self = StObject.set(x, "accountManagerPolicy", js.undefined)
    
    inline def setAllowLocalStorage(value: Boolean): Self = StObject.set(x, "allowLocalStorage", value.asInstanceOf[js.Any])
    
    inline def setAllowLocalStorageUndefined: Self = StObject.set(x, "allowLocalStorage", js.undefined)
    
    inline def setAllowedAccounts(value: SharedPCAllowedAccountType): Self = StObject.set(x, "allowedAccounts", value.asInstanceOf[js.Any])
    
    inline def setAllowedAccountsUndefined: Self = StObject.set(x, "allowedAccounts", js.undefined)
    
    inline def setDisableAccountManager(value: Boolean): Self = StObject.set(x, "disableAccountManager", value.asInstanceOf[js.Any])
    
    inline def setDisableAccountManagerUndefined: Self = StObject.set(x, "disableAccountManager", js.undefined)
    
    inline def setDisableEduPolicies(value: Boolean): Self = StObject.set(x, "disableEduPolicies", value.asInstanceOf[js.Any])
    
    inline def setDisableEduPoliciesUndefined: Self = StObject.set(x, "disableEduPolicies", js.undefined)
    
    inline def setDisablePowerPolicies(value: Boolean): Self = StObject.set(x, "disablePowerPolicies", value.asInstanceOf[js.Any])
    
    inline def setDisablePowerPoliciesUndefined: Self = StObject.set(x, "disablePowerPolicies", js.undefined)
    
    inline def setDisableSignInOnResume(value: Boolean): Self = StObject.set(x, "disableSignInOnResume", value.asInstanceOf[js.Any])
    
    inline def setDisableSignInOnResumeUndefined: Self = StObject.set(x, "disableSignInOnResume", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setIdleTimeBeforeSleepInSeconds(value: NullableOption[Double]): Self = StObject.set(x, "idleTimeBeforeSleepInSeconds", value.asInstanceOf[js.Any])
    
    inline def setIdleTimeBeforeSleepInSecondsNull: Self = StObject.set(x, "idleTimeBeforeSleepInSeconds", null)
    
    inline def setIdleTimeBeforeSleepInSecondsUndefined: Self = StObject.set(x, "idleTimeBeforeSleepInSeconds", js.undefined)
    
    inline def setKioskAppDisplayName(value: NullableOption[String]): Self = StObject.set(x, "kioskAppDisplayName", value.asInstanceOf[js.Any])
    
    inline def setKioskAppDisplayNameNull: Self = StObject.set(x, "kioskAppDisplayName", null)
    
    inline def setKioskAppDisplayNameUndefined: Self = StObject.set(x, "kioskAppDisplayName", js.undefined)
    
    inline def setKioskAppUserModelId(value: NullableOption[String]): Self = StObject.set(x, "kioskAppUserModelId", value.asInstanceOf[js.Any])
    
    inline def setKioskAppUserModelIdNull: Self = StObject.set(x, "kioskAppUserModelId", null)
    
    inline def setKioskAppUserModelIdUndefined: Self = StObject.set(x, "kioskAppUserModelId", js.undefined)
    
    inline def setMaintenanceStartTime(value: NullableOption[String]): Self = StObject.set(x, "maintenanceStartTime", value.asInstanceOf[js.Any])
    
    inline def setMaintenanceStartTimeNull: Self = StObject.set(x, "maintenanceStartTime", null)
    
    inline def setMaintenanceStartTimeUndefined: Self = StObject.set(x, "maintenanceStartTime", js.undefined)
  }
}
