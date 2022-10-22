package typingsJapgolly.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessControlRule extends StObject {
  
  /**
    * Access protocol actions to include in the rule. Valid values include ActiveSync, AutoDiscover, EWS, IMAP, SMTP, WindowsOutlook, and WebMail.
    */
  var Actions: js.UndefOr[ActionsList] = js.undefined
  
  /**
    * The date that the rule was created.
    */
  var DateCreated: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date that the rule was modified.
    */
  var DateModified: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The rule description.
    */
  var Description: js.UndefOr[AccessControlRuleDescription] = js.undefined
  
  /**
    * The rule effect.
    */
  var Effect: js.UndefOr[AccessControlRuleEffect] = js.undefined
  
  /**
    * Impersonation role IDs to include in the rule.
    */
  var ImpersonationRoleIds: js.UndefOr[ImpersonationRoleIdList] = js.undefined
  
  /**
    * IPv4 CIDR ranges to include in the rule.
    */
  var IpRanges: js.UndefOr[IpRangeList] = js.undefined
  
  /**
    * The rule name.
    */
  var Name: js.UndefOr[AccessControlRuleName] = js.undefined
  
  /**
    * Access protocol actions to exclude from the rule. Valid values include ActiveSync, AutoDiscover, EWS, IMAP, SMTP, WindowsOutlook, and WebMail.
    */
  var NotActions: js.UndefOr[ActionsList] = js.undefined
  
  /**
    * Impersonation role IDs to exclude from the rule.
    */
  var NotImpersonationRoleIds: js.UndefOr[ImpersonationRoleIdList] = js.undefined
  
  /**
    * IPv4 CIDR ranges to exclude from the rule.
    */
  var NotIpRanges: js.UndefOr[IpRangeList] = js.undefined
  
  /**
    * User IDs to exclude from the rule.
    */
  var NotUserIds: js.UndefOr[UserIdList] = js.undefined
  
  /**
    * User IDs to include in the rule.
    */
  var UserIds: js.UndefOr[UserIdList] = js.undefined
}
object AccessControlRule {
  
  inline def apply(): AccessControlRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessControlRule]
  }
  
  extension [Self <: AccessControlRule](x: Self) {
    
    inline def setActions(value: ActionsList): Self = StObject.set(x, "Actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "Actions", js.undefined)
    
    inline def setActionsVarargs(value: AccessControlRuleAction*): Self = StObject.set(x, "Actions", js.Array(value*))
    
    inline def setDateCreated(value: js.Date): Self = StObject.set(x, "DateCreated", value.asInstanceOf[js.Any])
    
    inline def setDateCreatedUndefined: Self = StObject.set(x, "DateCreated", js.undefined)
    
    inline def setDateModified(value: js.Date): Self = StObject.set(x, "DateModified", value.asInstanceOf[js.Any])
    
    inline def setDateModifiedUndefined: Self = StObject.set(x, "DateModified", js.undefined)
    
    inline def setDescription(value: AccessControlRuleDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEffect(value: AccessControlRuleEffect): Self = StObject.set(x, "Effect", value.asInstanceOf[js.Any])
    
    inline def setEffectUndefined: Self = StObject.set(x, "Effect", js.undefined)
    
    inline def setImpersonationRoleIds(value: ImpersonationRoleIdList): Self = StObject.set(x, "ImpersonationRoleIds", value.asInstanceOf[js.Any])
    
    inline def setImpersonationRoleIdsUndefined: Self = StObject.set(x, "ImpersonationRoleIds", js.undefined)
    
    inline def setImpersonationRoleIdsVarargs(value: ImpersonationRoleId*): Self = StObject.set(x, "ImpersonationRoleIds", js.Array(value*))
    
    inline def setIpRanges(value: IpRangeList): Self = StObject.set(x, "IpRanges", value.asInstanceOf[js.Any])
    
    inline def setIpRangesUndefined: Self = StObject.set(x, "IpRanges", js.undefined)
    
    inline def setIpRangesVarargs(value: IpRange*): Self = StObject.set(x, "IpRanges", js.Array(value*))
    
    inline def setName(value: AccessControlRuleName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setNotActions(value: ActionsList): Self = StObject.set(x, "NotActions", value.asInstanceOf[js.Any])
    
    inline def setNotActionsUndefined: Self = StObject.set(x, "NotActions", js.undefined)
    
    inline def setNotActionsVarargs(value: AccessControlRuleAction*): Self = StObject.set(x, "NotActions", js.Array(value*))
    
    inline def setNotImpersonationRoleIds(value: ImpersonationRoleIdList): Self = StObject.set(x, "NotImpersonationRoleIds", value.asInstanceOf[js.Any])
    
    inline def setNotImpersonationRoleIdsUndefined: Self = StObject.set(x, "NotImpersonationRoleIds", js.undefined)
    
    inline def setNotImpersonationRoleIdsVarargs(value: ImpersonationRoleId*): Self = StObject.set(x, "NotImpersonationRoleIds", js.Array(value*))
    
    inline def setNotIpRanges(value: IpRangeList): Self = StObject.set(x, "NotIpRanges", value.asInstanceOf[js.Any])
    
    inline def setNotIpRangesUndefined: Self = StObject.set(x, "NotIpRanges", js.undefined)
    
    inline def setNotIpRangesVarargs(value: IpRange*): Self = StObject.set(x, "NotIpRanges", js.Array(value*))
    
    inline def setNotUserIds(value: UserIdList): Self = StObject.set(x, "NotUserIds", value.asInstanceOf[js.Any])
    
    inline def setNotUserIdsUndefined: Self = StObject.set(x, "NotUserIds", js.undefined)
    
    inline def setNotUserIdsVarargs(value: WorkMailIdentifier*): Self = StObject.set(x, "NotUserIds", js.Array(value*))
    
    inline def setUserIds(value: UserIdList): Self = StObject.set(x, "UserIds", value.asInstanceOf[js.Any])
    
    inline def setUserIdsUndefined: Self = StObject.set(x, "UserIds", js.undefined)
    
    inline def setUserIdsVarargs(value: WorkMailIdentifier*): Self = StObject.set(x, "UserIds", js.Array(value*))
  }
}
