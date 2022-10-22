package typingsJapgolly.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateSkillWithSkillGroupRequest extends StObject {
  
  /**
    * The ARN of the skill group to associate the skill to. Required.
    */
  var SkillGroupArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The unique identifier of the skill.
    */
  var SkillId: typingsJapgolly.awsSdk.clientsAlexaforbusinessMod.SkillId
}
object AssociateSkillWithSkillGroupRequest {
  
  inline def apply(SkillId: SkillId): AssociateSkillWithSkillGroupRequest = {
    val __obj = js.Dynamic.literal(SkillId = SkillId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateSkillWithSkillGroupRequest]
  }
  
  extension [Self <: AssociateSkillWithSkillGroupRequest](x: Self) {
    
    inline def setSkillGroupArn(value: Arn): Self = StObject.set(x, "SkillGroupArn", value.asInstanceOf[js.Any])
    
    inline def setSkillGroupArnUndefined: Self = StObject.set(x, "SkillGroupArn", js.undefined)
    
    inline def setSkillId(value: SkillId): Self = StObject.set(x, "SkillId", value.asInstanceOf[js.Any])
  }
}
