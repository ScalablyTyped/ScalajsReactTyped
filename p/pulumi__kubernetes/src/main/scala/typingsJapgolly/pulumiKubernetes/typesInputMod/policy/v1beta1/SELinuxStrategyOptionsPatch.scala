package typingsJapgolly.pulumiKubernetes.typesInputMod.policy.v1beta1

import typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1.SELinuxOptionsPatch
import typingsJapgolly.pulumiPulumi.outputMod.Input
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
  var rule: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * seLinuxOptions required to run as; required for MustRunAs More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
    */
  var seLinuxOptions: js.UndefOr[Input[SELinuxOptionsPatch]] = js.undefined
}
object SELinuxStrategyOptionsPatch {
  
  inline def apply(): SELinuxStrategyOptionsPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SELinuxStrategyOptionsPatch]
  }
  
  extension [Self <: SELinuxStrategyOptionsPatch](x: Self) {
    
    inline def setRule(value: Input[String]): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    inline def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
    
    inline def setSeLinuxOptions(value: Input[SELinuxOptionsPatch]): Self = StObject.set(x, "seLinuxOptions", value.asInstanceOf[js.Any])
    
    inline def setSeLinuxOptionsUndefined: Self = StObject.set(x, "seLinuxOptions", js.undefined)
  }
}
