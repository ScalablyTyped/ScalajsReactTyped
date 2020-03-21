package typingsJapgolly.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EasMinPasswordLengthResult extends js.Object

/** Represents the minimum length result for passwords. These values are mapped against the HRESULT codes returned from the EAS policy engine. */
@JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult")
@js.native
object EasMinPasswordLengthResult extends js.Object {
  /** One or more admins are not allowed to change their passwords. */
  @js.native
  sealed trait adminsCannotChangePassword extends EasMinPasswordLengthResult
  
  /** The EAS password policies cannot be evaluated as one or more admins have blank passwords. */
  @js.native
  sealed trait adminsHaveBlankPassword extends EasMinPasswordLengthResult
  
  /** This computer can be compliant by using the ApplyAsync method. */
  @js.native
  sealed trait canBeCompliant extends EasMinPasswordLengthResult
  
  /** There is at least one administrator whose connected account password must be changed for EAS password policy compliance. */
  @js.native
  sealed trait changeConnectedAdminsPassword extends EasMinPasswordLengthResult
  
  /** The connected account password for the current user must be changed for EAS password policy compliance. */
  @js.native
  sealed trait changeConnectedUserPassword extends EasMinPasswordLengthResult
  
  /** This computer is compliant to the policy. */
  @js.native
  sealed trait compliant extends EasMinPasswordLengthResult
  
  /** The EAS password policy cannot be enforced by the connected account provider of at least one administrator. */
  @js.native
  sealed trait connectedAdminsProviderPolicyIsWeak extends EasMinPasswordLengthResult
  
  /** The EAS password policy cannot be enforced by the connected account provider of the current user. */
  @js.native
  sealed trait connectedUserProviderPolicyIsWeak extends EasMinPasswordLengthResult
  
  /** The EAS password policies for the user cannot be evaluated as the user has a blank password. */
  @js.native
  sealed trait currentUserHasBlankPassword extends EasMinPasswordLengthResult
  
  /** The policy value is not in a valid range. */
  @js.native
  sealed trait invalidParameter extends EasMinPasswordLengthResult
  
  /** There are other standard users present who are not allowed to change their passwords. */
  @js.native
  sealed trait localControlledUsersCannotChangePassword extends EasMinPasswordLengthResult
  
  /** The policy is not set for evaluation. */
  @js.native
  sealed trait notEvaluated extends EasMinPasswordLengthResult
  
  /** The requested policy is stricter than the computer policies. */
  @js.native
  sealed trait requestedPolicyIsStricter extends EasMinPasswordLengthResult
  
  /** The EAS policy being evaluated cannot be enforced by the system. */
  @js.native
  sealed trait requestedPolicyNotEnforceable extends EasMinPasswordLengthResult
  
  /** The user is not allowed to change the password. */
  @js.native
  sealed trait userCannotChangePassword extends EasMinPasswordLengthResult
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EasMinPasswordLengthResult with Double] = js.native
  /* 9 */ @js.native
  object adminsCannotChangePassword extends TopLevel[adminsCannotChangePassword with Double]
  
  /* 7 */ @js.native
  object adminsHaveBlankPassword extends TopLevel[adminsHaveBlankPassword with Double]
  
  /* 2 */ @js.native
  object canBeCompliant extends TopLevel[canBeCompliant with Double]
  
  /* 13 */ @js.native
  object changeConnectedAdminsPassword extends TopLevel[changeConnectedAdminsPassword with Double]
  
  /* 14 */ @js.native
  object changeConnectedUserPassword extends TopLevel[changeConnectedUserPassword with Double]
  
  /* 1 */ @js.native
  object compliant extends TopLevel[compliant with Double]
  
  /* 11 */ @js.native
  object connectedAdminsProviderPolicyIsWeak extends TopLevel[connectedAdminsProviderPolicyIsWeak with Double]
  
  /* 12 */ @js.native
  object connectedUserProviderPolicyIsWeak extends TopLevel[connectedUserProviderPolicyIsWeak with Double]
  
  /* 6 */ @js.native
  object currentUserHasBlankPassword extends TopLevel[currentUserHasBlankPassword with Double]
  
  /* 5 */ @js.native
  object invalidParameter extends TopLevel[invalidParameter with Double]
  
  /* 10 */ @js.native
  object localControlledUsersCannotChangePassword extends TopLevel[localControlledUsersCannotChangePassword with Double]
  
  /* 0 */ @js.native
  object notEvaluated extends TopLevel[notEvaluated with Double]
  
  /* 3 */ @js.native
  object requestedPolicyIsStricter extends TopLevel[requestedPolicyIsStricter with Double]
  
  /* 4 */ @js.native
  object requestedPolicyNotEnforceable extends TopLevel[requestedPolicyNotEnforceable with Double]
  
  /* 8 */ @js.native
  object userCannotChangePassword extends TopLevel[userCannotChangePassword with Double]
  
}

