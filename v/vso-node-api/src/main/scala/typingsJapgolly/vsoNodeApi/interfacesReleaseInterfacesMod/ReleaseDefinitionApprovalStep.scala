package typingsJapgolly.vsoNodeApi.interfacesReleaseInterfacesMod

import typingsJapgolly.vsoNodeApi.interfacesCommonVssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReleaseDefinitionApprovalStep
  extends StObject
     with ReleaseDefinitionEnvironmentStep {
  
  var approver: IdentityRef
  
  var isAutomated: Boolean
  
  var isNotificationOn: Boolean
  
  var rank: Double
}
object ReleaseDefinitionApprovalStep {
  
  inline def apply(approver: IdentityRef, id: Double, isAutomated: Boolean, isNotificationOn: Boolean, rank: Double): ReleaseDefinitionApprovalStep = {
    val __obj = js.Dynamic.literal(approver = approver.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isAutomated = isAutomated.asInstanceOf[js.Any], isNotificationOn = isNotificationOn.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseDefinitionApprovalStep]
  }
  
  extension [Self <: ReleaseDefinitionApprovalStep](x: Self) {
    
    inline def setApprover(value: IdentityRef): Self = StObject.set(x, "approver", value.asInstanceOf[js.Any])
    
    inline def setIsAutomated(value: Boolean): Self = StObject.set(x, "isAutomated", value.asInstanceOf[js.Any])
    
    inline def setIsNotificationOn(value: Boolean): Self = StObject.set(x, "isNotificationOn", value.asInstanceOf[js.Any])
    
    inline def setRank(value: Double): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
  }
}
