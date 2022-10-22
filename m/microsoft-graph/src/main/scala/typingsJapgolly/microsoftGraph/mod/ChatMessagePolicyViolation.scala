package typingsJapgolly.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChatMessagePolicyViolation extends StObject {
  
  /**
    * The action taken by the DLP provider on the message with sensitive content. Supported values are: NoneNotifySender --
    * Inform the sender of the violation but allow readers to read the message.BlockAccess -- Block readers from reading the
    * message.BlockAccessExternal -- Block users outside the organization from reading the message, while allowing users
    * within the organization to read the message.
    */
  var dlpAction: js.UndefOr[NullableOption[ChatMessagePolicyViolationDlpActionTypes]] = js.undefined
  
  // Justification text provided by the sender of the message when overriding a policy violation.
  var justificationText: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Information to display to the message sender about why the message was flagged as a violation.
  var policyTip: js.UndefOr[NullableOption[ChatMessagePolicyViolationPolicyTip]] = js.undefined
  
  /**
    * Indicates the action taken by the user on a message blocked by the DLP provider. Supported values are:
    * NoneOverrideReportFalsePositiveWhen the DLP provider is updating the message for blocking sensitive content, userAction
    * is not required.
    */
  var userAction: js.UndefOr[NullableOption[ChatMessagePolicyViolationUserActionTypes]] = js.undefined
  
  /**
    * Indicates what actions the sender may take in response to the policy violation. Supported values are:
    * NoneAllowFalsePositiveOverride -- Allows the sender to declare the policyViolation to be an error in the DLP app and
    * its rules, and allow readers to see the message again if the dlpAction had hidden it.AllowOverrideWithoutJustification
    * -- Allows the sender to overriide the DLP violation and allow readers to see the message again if the dlpAction had
    * hidden it, without needing to provide an explanation for doing so. AllowOverrideWithJustification -- Allows the sender
    * to overriide the DLP violation and allow readers to see the message again if the dlpAction had hidden it, after
    * providing an explanation for doing so.AllowOverrideWithoutJustification and AllowOverrideWithJustification are mutually
    * exclusive.
    */
  var verdictDetails: js.UndefOr[NullableOption[ChatMessagePolicyViolationVerdictDetailsTypes]] = js.undefined
}
object ChatMessagePolicyViolation {
  
  inline def apply(): ChatMessagePolicyViolation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChatMessagePolicyViolation]
  }
  
  extension [Self <: ChatMessagePolicyViolation](x: Self) {
    
    inline def setDlpAction(value: NullableOption[ChatMessagePolicyViolationDlpActionTypes]): Self = StObject.set(x, "dlpAction", value.asInstanceOf[js.Any])
    
    inline def setDlpActionNull: Self = StObject.set(x, "dlpAction", null)
    
    inline def setDlpActionUndefined: Self = StObject.set(x, "dlpAction", js.undefined)
    
    inline def setJustificationText(value: NullableOption[String]): Self = StObject.set(x, "justificationText", value.asInstanceOf[js.Any])
    
    inline def setJustificationTextNull: Self = StObject.set(x, "justificationText", null)
    
    inline def setJustificationTextUndefined: Self = StObject.set(x, "justificationText", js.undefined)
    
    inline def setPolicyTip(value: NullableOption[ChatMessagePolicyViolationPolicyTip]): Self = StObject.set(x, "policyTip", value.asInstanceOf[js.Any])
    
    inline def setPolicyTipNull: Self = StObject.set(x, "policyTip", null)
    
    inline def setPolicyTipUndefined: Self = StObject.set(x, "policyTip", js.undefined)
    
    inline def setUserAction(value: NullableOption[ChatMessagePolicyViolationUserActionTypes]): Self = StObject.set(x, "userAction", value.asInstanceOf[js.Any])
    
    inline def setUserActionNull: Self = StObject.set(x, "userAction", null)
    
    inline def setUserActionUndefined: Self = StObject.set(x, "userAction", js.undefined)
    
    inline def setVerdictDetails(value: NullableOption[ChatMessagePolicyViolationVerdictDetailsTypes]): Self = StObject.set(x, "verdictDetails", value.asInstanceOf[js.Any])
    
    inline def setVerdictDetailsNull: Self = StObject.set(x, "verdictDetails", null)
    
    inline def setVerdictDetailsUndefined: Self = StObject.set(x, "verdictDetails", js.undefined)
  }
}
