package typingsJapgolly.pulumiPulumi.automationEventsMod

import typingsJapgolly.pulumiPulumi.pulumiPulumiStrings.mandatory
import typingsJapgolly.pulumiPulumi.pulumiPulumiStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolicyEvent extends StObject {
  
  var color: String
  
  var enforcementLevel: warning | mandatory
  
  var message: String
  
  var policyName: String
  
  var policyPackName: String
  
  var policyPackVersion: String
  
  var policyPackVersionTag: String
  
  var resourceUrn: js.UndefOr[String] = js.undefined
}
object PolicyEvent {
  
  inline def apply(
    color: String,
    enforcementLevel: warning | mandatory,
    message: String,
    policyName: String,
    policyPackName: String,
    policyPackVersion: String,
    policyPackVersionTag: String
  ): PolicyEvent = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], enforcementLevel = enforcementLevel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], policyName = policyName.asInstanceOf[js.Any], policyPackName = policyPackName.asInstanceOf[js.Any], policyPackVersion = policyPackVersion.asInstanceOf[js.Any], policyPackVersionTag = policyPackVersionTag.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyEvent]
  }
  
  extension [Self <: PolicyEvent](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setEnforcementLevel(value: warning | mandatory): Self = StObject.set(x, "enforcementLevel", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setPolicyName(value: String): Self = StObject.set(x, "policyName", value.asInstanceOf[js.Any])
    
    inline def setPolicyPackName(value: String): Self = StObject.set(x, "policyPackName", value.asInstanceOf[js.Any])
    
    inline def setPolicyPackVersion(value: String): Self = StObject.set(x, "policyPackVersion", value.asInstanceOf[js.Any])
    
    inline def setPolicyPackVersionTag(value: String): Self = StObject.set(x, "policyPackVersionTag", value.asInstanceOf[js.Any])
    
    inline def setResourceUrn(value: String): Self = StObject.set(x, "resourceUrn", value.asInstanceOf[js.Any])
    
    inline def setResourceUrnUndefined: Self = StObject.set(x, "resourceUrn", js.undefined)
  }
}
