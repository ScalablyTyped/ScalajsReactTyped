package typingsJapgolly.pulumiKubernetes.typesOutputMod.extensions.v1beta1

import typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1.PodTemplateSpecPatch
import typingsJapgolly.pulumiKubernetes.typesOutputMod.meta.v1.LabelSelectorPatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DaemonSetSpec is the specification of a daemon set.
  */
trait DaemonSetSpecPatch extends StObject {
  
  /**
    * The minimum number of seconds for which a newly created DaemonSet pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready).
    */
  var minReadySeconds: Double
  
  /**
    * The number of old history to retain to allow rollback. This is a pointer to distinguish between explicit zero and not specified. Defaults to 10.
    */
  var revisionHistoryLimit: Double
  
  /**
    * A label query over pods that are managed by the daemon set. Must match in order to be controlled. If empty, defaulted to labels on Pod template. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
    */
  var selector: LabelSelectorPatch
  
  /**
    * An object that describes the pod that will be created. The DaemonSet will create exactly one copy of this pod on every node that matches the template's node selector (or on every node if no node selector is specified). More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template
    */
  var template: PodTemplateSpecPatch
  
  /**
    * DEPRECATED. A sequence number representing a specific generation of the template. Populated by the system. It can be set only during the creation.
    */
  var templateGeneration: Double
  
  /**
    * An update strategy to replace existing DaemonSet pods with new pods.
    */
  var updateStrategy: DaemonSetUpdateStrategyPatch
}
object DaemonSetSpecPatch {
  
  inline def apply(
    minReadySeconds: Double,
    revisionHistoryLimit: Double,
    selector: LabelSelectorPatch,
    template: PodTemplateSpecPatch,
    templateGeneration: Double,
    updateStrategy: DaemonSetUpdateStrategyPatch
  ): DaemonSetSpecPatch = {
    val __obj = js.Dynamic.literal(minReadySeconds = minReadySeconds.asInstanceOf[js.Any], revisionHistoryLimit = revisionHistoryLimit.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], templateGeneration = templateGeneration.asInstanceOf[js.Any], updateStrategy = updateStrategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[DaemonSetSpecPatch]
  }
  
  extension [Self <: DaemonSetSpecPatch](x: Self) {
    
    inline def setMinReadySeconds(value: Double): Self = StObject.set(x, "minReadySeconds", value.asInstanceOf[js.Any])
    
    inline def setRevisionHistoryLimit(value: Double): Self = StObject.set(x, "revisionHistoryLimit", value.asInstanceOf[js.Any])
    
    inline def setSelector(value: LabelSelectorPatch): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setTemplate(value: PodTemplateSpecPatch): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateGeneration(value: Double): Self = StObject.set(x, "templateGeneration", value.asInstanceOf[js.Any])
    
    inline def setUpdateStrategy(value: DaemonSetUpdateStrategyPatch): Self = StObject.set(x, "updateStrategy", value.asInstanceOf[js.Any])
  }
}
