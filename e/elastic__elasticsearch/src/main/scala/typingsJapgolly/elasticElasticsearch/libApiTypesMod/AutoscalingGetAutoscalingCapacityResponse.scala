package typingsJapgolly.elasticElasticsearch.libApiTypesMod

import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoscalingGetAutoscalingCapacityResponse extends StObject {
  
  var policies: Record[String, AutoscalingGetAutoscalingCapacityAutoscalingDeciders]
}
object AutoscalingGetAutoscalingCapacityResponse {
  
  inline def apply(policies: Record[String, AutoscalingGetAutoscalingCapacityAutoscalingDeciders]): AutoscalingGetAutoscalingCapacityResponse = {
    val __obj = js.Dynamic.literal(policies = policies.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoscalingGetAutoscalingCapacityResponse]
  }
  
  extension [Self <: AutoscalingGetAutoscalingCapacityResponse](x: Self) {
    
    inline def setPolicies(value: Record[String, AutoscalingGetAutoscalingCapacityAutoscalingDeciders]): Self = StObject.set(x, "policies", value.asInstanceOf[js.Any])
  }
}
