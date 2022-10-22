package typingsJapgolly.pulumiKubernetes.typesOutputMod.autoscaling.v2beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * MetricSpec specifies how to scale based on a single metric (only `type` and one other matching field should be set at once).
  */
trait MetricSpecPatch extends StObject {
  
  /**
    * container resource refers to a resource metric (such as those specified in requests and limits) known to Kubernetes describing a single container in each pod of the current scale target (e.g. CPU or memory). Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the "pods" source. This is an alpha feature and can be enabled by the HPAContainerMetrics feature flag.
    */
  var containerResource: ContainerResourceMetricSourcePatch
  
  /**
    * external refers to a global metric that is not associated with any Kubernetes object. It allows autoscaling based on information coming from components running outside of cluster (for example length of queue in cloud messaging service, or QPS from loadbalancer running outside of cluster).
    */
  var external: ExternalMetricSourcePatch
  
  /**
    * object refers to a metric describing a single kubernetes object (for example, hits-per-second on an Ingress object).
    */
  var `object`: ObjectMetricSourcePatch
  
  /**
    * pods refers to a metric describing each pod in the current scale target (for example, transactions-processed-per-second).  The values will be averaged together before being compared to the target value.
    */
  var pods: PodsMetricSourcePatch
  
  /**
    * resource refers to a resource metric (such as those specified in requests and limits) known to Kubernetes describing each pod in the current scale target (e.g. CPU or memory). Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the "pods" source.
    */
  var resource: ResourceMetricSourcePatch
  
  /**
    * type is the type of metric source.  It should be one of "ContainerResource", "External", "Object", "Pods" or "Resource", each mapping to a matching field in the object. Note: "ContainerResource" type is available on when the feature-gate HPAContainerMetrics is enabled
    */
  var `type`: String
}
object MetricSpecPatch {
  
  inline def apply(
    containerResource: ContainerResourceMetricSourcePatch,
    external: ExternalMetricSourcePatch,
    `object`: ObjectMetricSourcePatch,
    pods: PodsMetricSourcePatch,
    resource: ResourceMetricSourcePatch,
    `type`: String
  ): MetricSpecPatch = {
    val __obj = js.Dynamic.literal(containerResource = containerResource.asInstanceOf[js.Any], external = external.asInstanceOf[js.Any], pods = pods.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricSpecPatch]
  }
  
  extension [Self <: MetricSpecPatch](x: Self) {
    
    inline def setContainerResource(value: ContainerResourceMetricSourcePatch): Self = StObject.set(x, "containerResource", value.asInstanceOf[js.Any])
    
    inline def setExternal(value: ExternalMetricSourcePatch): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
    
    inline def setObject(value: ObjectMetricSourcePatch): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setPods(value: PodsMetricSourcePatch): Self = StObject.set(x, "pods", value.asInstanceOf[js.Any])
    
    inline def setResource(value: ResourceMetricSourcePatch): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
