package typingsJapgolly.pulumiKubernetes.typesInputMod.autoscaling.v2

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * MetricSpec specifies how to scale based on a single metric (only `type` and one other matching field should be set at once).
  */
trait MetricSpec extends StObject {
  
  /**
    * containerResource refers to a resource metric (such as those specified in requests and limits) known to Kubernetes describing a single container in each pod of the current scale target (e.g. CPU or memory). Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the "pods" source. This is an alpha feature and can be enabled by the HPAContainerMetrics feature flag.
    */
  var containerResource: js.UndefOr[Input[ContainerResourceMetricSource]] = js.undefined
  
  /**
    * external refers to a global metric that is not associated with any Kubernetes object. It allows autoscaling based on information coming from components running outside of cluster (for example length of queue in cloud messaging service, or QPS from loadbalancer running outside of cluster).
    */
  var external: js.UndefOr[Input[ExternalMetricSource]] = js.undefined
  
  /**
    * object refers to a metric describing a single kubernetes object (for example, hits-per-second on an Ingress object).
    */
  var `object`: js.UndefOr[Input[ObjectMetricSource]] = js.undefined
  
  /**
    * pods refers to a metric describing each pod in the current scale target (for example, transactions-processed-per-second).  The values will be averaged together before being compared to the target value.
    */
  var pods: js.UndefOr[Input[PodsMetricSource]] = js.undefined
  
  /**
    * resource refers to a resource metric (such as those specified in requests and limits) known to Kubernetes describing each pod in the current scale target (e.g. CPU or memory). Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the "pods" source.
    */
  var resource: js.UndefOr[Input[ResourceMetricSource]] = js.undefined
  
  /**
    * type is the type of metric source.  It should be one of "ContainerResource", "External", "Object", "Pods" or "Resource", each mapping to a matching field in the object. Note: "ContainerResource" type is available on when the feature-gate HPAContainerMetrics is enabled
    */
  var `type`: Input[String]
}
object MetricSpec {
  
  inline def apply(`type`: Input[String]): MetricSpec = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricSpec]
  }
  
  extension [Self <: MetricSpec](x: Self) {
    
    inline def setContainerResource(value: Input[ContainerResourceMetricSource]): Self = StObject.set(x, "containerResource", value.asInstanceOf[js.Any])
    
    inline def setContainerResourceUndefined: Self = StObject.set(x, "containerResource", js.undefined)
    
    inline def setExternal(value: Input[ExternalMetricSource]): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
    
    inline def setExternalUndefined: Self = StObject.set(x, "external", js.undefined)
    
    inline def setObject(value: Input[ObjectMetricSource]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
    
    inline def setPods(value: Input[PodsMetricSource]): Self = StObject.set(x, "pods", value.asInstanceOf[js.Any])
    
    inline def setPodsUndefined: Self = StObject.set(x, "pods", js.undefined)
    
    inline def setResource(value: Input[ResourceMetricSource]): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
