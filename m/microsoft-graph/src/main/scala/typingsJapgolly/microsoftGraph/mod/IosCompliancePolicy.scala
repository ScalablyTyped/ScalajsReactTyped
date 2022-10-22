package typingsJapgolly.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IosCompliancePolicy
  extends StObject
     with DeviceCompliancePolicy {
  
  // Require that devices have enabled device threat protection .
  var deviceThreatProtectionEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Require Mobile Threat Protection minimum risk level to report noncompliance. Possible values are: unavailable, secured,
    * low, medium, high, notSet.
    */
  var deviceThreatProtectionRequiredSecurityLevel: js.UndefOr[DeviceThreatProtectionLevel] = js.undefined
  
  // Indicates whether or not to require a managed email profile.
  var managedEmailProfileRequired: js.UndefOr[Boolean] = js.undefined
  
  // Maximum IOS version.
  var osMaximumVersion: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Minimum IOS version.
  var osMinimumVersion: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Indicates whether or not to block simple passcodes.
  var passcodeBlockSimple: js.UndefOr[Boolean] = js.undefined
  
  // Number of days before the passcode expires. Valid values 1 to 65535
  var passcodeExpirationDays: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The number of character sets required in the password.
  var passcodeMinimumCharacterSetCount: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Minimum length of passcode. Valid values 4 to 14
  var passcodeMinimumLength: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Minutes of inactivity before a passcode is required.
  var passcodeMinutesOfInactivityBeforeLock: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Number of previous passcodes to block. Valid values 1 to 24
  var passcodePreviousPasscodeBlockCount: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Indicates whether or not to require a passcode.
  var passcodeRequired: js.UndefOr[Boolean] = js.undefined
  
  // The required passcode type. Possible values are: deviceDefault, alphanumeric, numeric.
  var passcodeRequiredType: js.UndefOr[RequiredPasswordType] = js.undefined
  
  // Devices must not be jailbroken or rooted.
  var securityBlockJailbrokenDevices: js.UndefOr[Boolean] = js.undefined
}
object IosCompliancePolicy {
  
  inline def apply(): IosCompliancePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosCompliancePolicy]
  }
  
  extension [Self <: IosCompliancePolicy](x: Self) {
    
    inline def setDeviceThreatProtectionEnabled(value: Boolean): Self = StObject.set(x, "deviceThreatProtectionEnabled", value.asInstanceOf[js.Any])
    
    inline def setDeviceThreatProtectionEnabledUndefined: Self = StObject.set(x, "deviceThreatProtectionEnabled", js.undefined)
    
    inline def setDeviceThreatProtectionRequiredSecurityLevel(value: DeviceThreatProtectionLevel): Self = StObject.set(x, "deviceThreatProtectionRequiredSecurityLevel", value.asInstanceOf[js.Any])
    
    inline def setDeviceThreatProtectionRequiredSecurityLevelUndefined: Self = StObject.set(x, "deviceThreatProtectionRequiredSecurityLevel", js.undefined)
    
    inline def setManagedEmailProfileRequired(value: Boolean): Self = StObject.set(x, "managedEmailProfileRequired", value.asInstanceOf[js.Any])
    
    inline def setManagedEmailProfileRequiredUndefined: Self = StObject.set(x, "managedEmailProfileRequired", js.undefined)
    
    inline def setOsMaximumVersion(value: NullableOption[String]): Self = StObject.set(x, "osMaximumVersion", value.asInstanceOf[js.Any])
    
    inline def setOsMaximumVersionNull: Self = StObject.set(x, "osMaximumVersion", null)
    
    inline def setOsMaximumVersionUndefined: Self = StObject.set(x, "osMaximumVersion", js.undefined)
    
    inline def setOsMinimumVersion(value: NullableOption[String]): Self = StObject.set(x, "osMinimumVersion", value.asInstanceOf[js.Any])
    
    inline def setOsMinimumVersionNull: Self = StObject.set(x, "osMinimumVersion", null)
    
    inline def setOsMinimumVersionUndefined: Self = StObject.set(x, "osMinimumVersion", js.undefined)
    
    inline def setPasscodeBlockSimple(value: Boolean): Self = StObject.set(x, "passcodeBlockSimple", value.asInstanceOf[js.Any])
    
    inline def setPasscodeBlockSimpleUndefined: Self = StObject.set(x, "passcodeBlockSimple", js.undefined)
    
    inline def setPasscodeExpirationDays(value: NullableOption[Double]): Self = StObject.set(x, "passcodeExpirationDays", value.asInstanceOf[js.Any])
    
    inline def setPasscodeExpirationDaysNull: Self = StObject.set(x, "passcodeExpirationDays", null)
    
    inline def setPasscodeExpirationDaysUndefined: Self = StObject.set(x, "passcodeExpirationDays", js.undefined)
    
    inline def setPasscodeMinimumCharacterSetCount(value: NullableOption[Double]): Self = StObject.set(x, "passcodeMinimumCharacterSetCount", value.asInstanceOf[js.Any])
    
    inline def setPasscodeMinimumCharacterSetCountNull: Self = StObject.set(x, "passcodeMinimumCharacterSetCount", null)
    
    inline def setPasscodeMinimumCharacterSetCountUndefined: Self = StObject.set(x, "passcodeMinimumCharacterSetCount", js.undefined)
    
    inline def setPasscodeMinimumLength(value: NullableOption[Double]): Self = StObject.set(x, "passcodeMinimumLength", value.asInstanceOf[js.Any])
    
    inline def setPasscodeMinimumLengthNull: Self = StObject.set(x, "passcodeMinimumLength", null)
    
    inline def setPasscodeMinimumLengthUndefined: Self = StObject.set(x, "passcodeMinimumLength", js.undefined)
    
    inline def setPasscodeMinutesOfInactivityBeforeLock(value: NullableOption[Double]): Self = StObject.set(x, "passcodeMinutesOfInactivityBeforeLock", value.asInstanceOf[js.Any])
    
    inline def setPasscodeMinutesOfInactivityBeforeLockNull: Self = StObject.set(x, "passcodeMinutesOfInactivityBeforeLock", null)
    
    inline def setPasscodeMinutesOfInactivityBeforeLockUndefined: Self = StObject.set(x, "passcodeMinutesOfInactivityBeforeLock", js.undefined)
    
    inline def setPasscodePreviousPasscodeBlockCount(value: NullableOption[Double]): Self = StObject.set(x, "passcodePreviousPasscodeBlockCount", value.asInstanceOf[js.Any])
    
    inline def setPasscodePreviousPasscodeBlockCountNull: Self = StObject.set(x, "passcodePreviousPasscodeBlockCount", null)
    
    inline def setPasscodePreviousPasscodeBlockCountUndefined: Self = StObject.set(x, "passcodePreviousPasscodeBlockCount", js.undefined)
    
    inline def setPasscodeRequired(value: Boolean): Self = StObject.set(x, "passcodeRequired", value.asInstanceOf[js.Any])
    
    inline def setPasscodeRequiredType(value: RequiredPasswordType): Self = StObject.set(x, "passcodeRequiredType", value.asInstanceOf[js.Any])
    
    inline def setPasscodeRequiredTypeUndefined: Self = StObject.set(x, "passcodeRequiredType", js.undefined)
    
    inline def setPasscodeRequiredUndefined: Self = StObject.set(x, "passcodeRequired", js.undefined)
    
    inline def setSecurityBlockJailbrokenDevices(value: Boolean): Self = StObject.set(x, "securityBlockJailbrokenDevices", value.asInstanceOf[js.Any])
    
    inline def setSecurityBlockJailbrokenDevicesUndefined: Self = StObject.set(x, "securityBlockJailbrokenDevices", js.undefined)
  }
}
