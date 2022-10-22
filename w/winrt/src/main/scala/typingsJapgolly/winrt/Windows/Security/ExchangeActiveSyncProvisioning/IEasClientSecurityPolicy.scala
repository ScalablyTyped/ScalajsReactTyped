package typingsJapgolly.winrt.Windows.Security.ExchangeActiveSyncProvisioning

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEasClientSecurityPolicy extends StObject {
  
  def applyAsync(): IAsyncOperation[EasComplianceResults]
  
  def checkCompliance(): EasComplianceResults
  
  var disallowConvenienceLogon: Boolean
  
  var maxInactivityTimeLock: Double
  
  var maxPasswordFailedAttempts: Double
  
  var minPasswordComplexCharacters: Double
  
  var minPasswordLength: Double
  
  var passwordExpiration: Double
  
  var passwordHistory: Double
  
  var requireEncryption: Boolean
}
object IEasClientSecurityPolicy {
  
  inline def apply(
    applyAsync: CallbackTo[IAsyncOperation[EasComplianceResults]],
    checkCompliance: CallbackTo[EasComplianceResults],
    disallowConvenienceLogon: Boolean,
    maxInactivityTimeLock: Double,
    maxPasswordFailedAttempts: Double,
    minPasswordComplexCharacters: Double,
    minPasswordLength: Double,
    passwordExpiration: Double,
    passwordHistory: Double,
    requireEncryption: Boolean
  ): IEasClientSecurityPolicy = {
    val __obj = js.Dynamic.literal(applyAsync = applyAsync.toJsFn, checkCompliance = checkCompliance.toJsFn, disallowConvenienceLogon = disallowConvenienceLogon.asInstanceOf[js.Any], maxInactivityTimeLock = maxInactivityTimeLock.asInstanceOf[js.Any], maxPasswordFailedAttempts = maxPasswordFailedAttempts.asInstanceOf[js.Any], minPasswordComplexCharacters = minPasswordComplexCharacters.asInstanceOf[js.Any], minPasswordLength = minPasswordLength.asInstanceOf[js.Any], passwordExpiration = passwordExpiration.asInstanceOf[js.Any], passwordHistory = passwordHistory.asInstanceOf[js.Any], requireEncryption = requireEncryption.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEasClientSecurityPolicy]
  }
  
  extension [Self <: IEasClientSecurityPolicy](x: Self) {
    
    inline def setApplyAsync(value: CallbackTo[IAsyncOperation[EasComplianceResults]]): Self = StObject.set(x, "applyAsync", value.toJsFn)
    
    inline def setCheckCompliance(value: CallbackTo[EasComplianceResults]): Self = StObject.set(x, "checkCompliance", value.toJsFn)
    
    inline def setDisallowConvenienceLogon(value: Boolean): Self = StObject.set(x, "disallowConvenienceLogon", value.asInstanceOf[js.Any])
    
    inline def setMaxInactivityTimeLock(value: Double): Self = StObject.set(x, "maxInactivityTimeLock", value.asInstanceOf[js.Any])
    
    inline def setMaxPasswordFailedAttempts(value: Double): Self = StObject.set(x, "maxPasswordFailedAttempts", value.asInstanceOf[js.Any])
    
    inline def setMinPasswordComplexCharacters(value: Double): Self = StObject.set(x, "minPasswordComplexCharacters", value.asInstanceOf[js.Any])
    
    inline def setMinPasswordLength(value: Double): Self = StObject.set(x, "minPasswordLength", value.asInstanceOf[js.Any])
    
    inline def setPasswordExpiration(value: Double): Self = StObject.set(x, "passwordExpiration", value.asInstanceOf[js.Any])
    
    inline def setPasswordHistory(value: Double): Self = StObject.set(x, "passwordHistory", value.asInstanceOf[js.Any])
    
    inline def setRequireEncryption(value: Boolean): Self = StObject.set(x, "requireEncryption", value.asInstanceOf[js.Any])
  }
}
