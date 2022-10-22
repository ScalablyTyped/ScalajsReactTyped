package typingsJapgolly.pulumiKubernetes.typesOutputMod.policy.v1beta1

import typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1.SELinuxOptionsPatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SELinuxStrategyOptions defines the strategy type and any options used to create the strategy.
  */
trait SELinuxStrategyOptionsPatch extends StObject {
  
  /**
    * rule is the strategy that will dictate the allowable labels that may be set.
    */
  var rule: String
  
  /**
    * seLinuxOptions required to run as; required for MustRunAs More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
    */
  var seLinuxOptions: SELinuxOptionsPatch
}
object SELinuxStrategyOptionsPatch {
  
  inline def apply(rule: String, seLinuxOptions: SELinuxOptionsPatch): SELinuxStrategyOptionsPatch = {
    val __obj = js.Dynamic.literal(rule = rule.asInstanceOf[js.Any], seLinuxOptions = seLinuxOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SELinuxStrategyOptionsPatch]
  }
  
  extension [Self <: SELinuxStrategyOptionsPatch](x: Self) {
    
    inline def setRule(value: String): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    inline def setSeLinuxOptions(value: SELinuxOptionsPatch): Self = StObject.set(x, "seLinuxOptions", value.asInstanceOf[js.Any])
  }
}
