package typingsJapgolly.pulumiKubernetes.typesOutputMod.apiextensions.v1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CustomResourceDefinitionCondition contains details for the current condition of this pod.
  */
trait CustomResourceDefinitionConditionPatch extends StObject {
  
  /**
    * lastTransitionTime last time the condition transitioned from one status to another.
    */
  var lastTransitionTime: String
  
  /**
    * message is a human-readable message indicating details about last transition.
    */
  var message: String
  
  /**
    * reason is a unique, one-word, CamelCase reason for the condition's last transition.
    */
  var reason: String
  
  /**
    * status is the status of the condition. Can be True, False, Unknown.
    */
  var status: String
  
  /**
    * type is the type of the condition. Types include Established, NamesAccepted and Terminating.
    */
  var `type`: String
}
object CustomResourceDefinitionConditionPatch {
  
  inline def apply(lastTransitionTime: String, message: String, reason: String, status: String, `type`: String): CustomResourceDefinitionConditionPatch = {
    val __obj = js.Dynamic.literal(lastTransitionTime = lastTransitionTime.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomResourceDefinitionConditionPatch]
  }
  
  extension [Self <: CustomResourceDefinitionConditionPatch](x: Self) {
    
    inline def setLastTransitionTime(value: String): Self = StObject.set(x, "lastTransitionTime", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
