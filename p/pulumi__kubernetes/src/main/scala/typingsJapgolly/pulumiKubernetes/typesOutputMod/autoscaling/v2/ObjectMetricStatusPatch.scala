package typingsJapgolly.pulumiKubernetes.typesOutputMod.autoscaling.v2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ObjectMetricStatus indicates the current value of a metric describing a kubernetes object (for example, hits-per-second on an Ingress object).
  */
trait ObjectMetricStatusPatch extends StObject {
  
  /**
    * current contains the current value for the given metric
    */
  var current: MetricValueStatusPatch
  
  /**
    * DescribedObject specifies the descriptions of a object,such as kind,name apiVersion
    */
  var describedObject: CrossVersionObjectReferencePatch
  
  /**
    * metric identifies the target metric by name and selector
    */
  var metric: MetricIdentifierPatch
}
object ObjectMetricStatusPatch {
  
  inline def apply(
    current: MetricValueStatusPatch,
    describedObject: CrossVersionObjectReferencePatch,
    metric: MetricIdentifierPatch
  ): ObjectMetricStatusPatch = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], describedObject = describedObject.asInstanceOf[js.Any], metric = metric.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectMetricStatusPatch]
  }
  
  extension [Self <: ObjectMetricStatusPatch](x: Self) {
    
    inline def setCurrent(value: MetricValueStatusPatch): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setDescribedObject(value: CrossVersionObjectReferencePatch): Self = StObject.set(x, "describedObject", value.asInstanceOf[js.Any])
    
    inline def setMetric(value: MetricIdentifierPatch): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
  }
}
