package typingsJapgolly.awsSdk.clientsMediastoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricPolicy extends StObject {
  
  /**
    * A setting to enable or disable metrics at the container level.
    */
  var ContainerLevelMetrics: typingsJapgolly.awsSdk.clientsMediastoreMod.ContainerLevelMetrics
  
  /**
    * A parameter that holds an array of rules that enable metrics at the object level. This parameter is optional, but if you choose to include it, you must also include at least one rule. By default, you can include up to five rules. You can also request a quota increase to allow up to 300 rules per policy.
    */
  var MetricPolicyRules: js.UndefOr[typingsJapgolly.awsSdk.clientsMediastoreMod.MetricPolicyRules] = js.undefined
}
object MetricPolicy {
  
  inline def apply(ContainerLevelMetrics: ContainerLevelMetrics): MetricPolicy = {
    val __obj = js.Dynamic.literal(ContainerLevelMetrics = ContainerLevelMetrics.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricPolicy]
  }
  
  extension [Self <: MetricPolicy](x: Self) {
    
    inline def setContainerLevelMetrics(value: ContainerLevelMetrics): Self = StObject.set(x, "ContainerLevelMetrics", value.asInstanceOf[js.Any])
    
    inline def setMetricPolicyRules(value: MetricPolicyRules): Self = StObject.set(x, "MetricPolicyRules", value.asInstanceOf[js.Any])
    
    inline def setMetricPolicyRulesUndefined: Self = StObject.set(x, "MetricPolicyRules", js.undefined)
    
    inline def setMetricPolicyRulesVarargs(value: MetricPolicyRule*): Self = StObject.set(x, "MetricPolicyRules", js.Array(value*))
  }
}
