package typingsJapgolly.pulumiKubernetes.typesInputMod.apps.v1beta1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * StatefulSetCondition describes the state of a statefulset at a certain point.
  */
trait StatefulSetCondition extends StObject {
  
  /**
    * Last time the condition transitioned from one status to another.
    */
  var lastTransitionTime: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * A human readable message indicating details about the transition.
    */
  var message: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The reason for the condition's last transition.
    */
  var reason: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Status of the condition, one of True, False, Unknown.
    */
  var status: Input[String]
  
  /**
    * Type of statefulset condition.
    */
  var `type`: Input[String]
}
object StatefulSetCondition {
  
  inline def apply(status: Input[String], `type`: Input[String]): StatefulSetCondition = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatefulSetCondition]
  }
  
  extension [Self <: StatefulSetCondition](x: Self) {
    
    inline def setLastTransitionTime(value: Input[String]): Self = StObject.set(x, "lastTransitionTime", value.asInstanceOf[js.Any])
    
    inline def setLastTransitionTimeUndefined: Self = StObject.set(x, "lastTransitionTime", js.undefined)
    
    inline def setMessage(value: Input[String]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setReason(value: Input[String]): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setStatus(value: Input[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
