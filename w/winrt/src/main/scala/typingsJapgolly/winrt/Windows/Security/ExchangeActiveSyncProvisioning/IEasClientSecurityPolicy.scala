package typingsJapgolly.winrt.Windows.Security.ExchangeActiveSyncProvisioning

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEasClientSecurityPolicy extends js.Object {
  var disallowConvenienceLogon: Boolean
  var maxInactivityTimeLock: Double
  var maxPasswordFailedAttempts: Double
  var minPasswordComplexCharacters: Double
  var minPasswordLength: Double
  var passwordExpiration: Double
  var passwordHistory: Double
  var requireEncryption: Boolean
  def applyAsync(): IAsyncOperation[EasComplianceResults]
  def checkCompliance(): EasComplianceResults
}

object IEasClientSecurityPolicy {
  @scala.inline
  def apply(
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
    val __obj = js.Dynamic.literal(disallowConvenienceLogon = disallowConvenienceLogon.asInstanceOf[js.Any], maxInactivityTimeLock = maxInactivityTimeLock.asInstanceOf[js.Any], maxPasswordFailedAttempts = maxPasswordFailedAttempts.asInstanceOf[js.Any], minPasswordComplexCharacters = minPasswordComplexCharacters.asInstanceOf[js.Any], minPasswordLength = minPasswordLength.asInstanceOf[js.Any], passwordExpiration = passwordExpiration.asInstanceOf[js.Any], passwordHistory = passwordHistory.asInstanceOf[js.Any], requireEncryption = requireEncryption.asInstanceOf[js.Any])
    __obj.updateDynamic("applyAsync")(applyAsync.toJsFn)
    __obj.updateDynamic("checkCompliance")(checkCompliance.toJsFn)
    __obj.asInstanceOf[IEasClientSecurityPolicy]
  }
}

