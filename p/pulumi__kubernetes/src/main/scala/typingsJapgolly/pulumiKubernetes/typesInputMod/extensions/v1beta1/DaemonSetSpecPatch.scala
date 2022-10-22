package typingsJapgolly.pulumiKubernetes.typesInputMod.extensions.v1beta1

import typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1.PodTemplateSpecPatch
import typingsJapgolly.pulumiKubernetes.typesInputMod.meta.v1.LabelSelectorPatch
import typingsJapgolly.pulumiPulumi.outputMod.Input
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
  var minReadySeconds: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * The number of old history to retain to allow rollback. This is a pointer to distinguish between explicit zero and not specified. Defaults to 10.
    */
  var revisionHistoryLimit: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * A label query over pods that are managed by the daemon set. Must match in order to be controlled. If empty, defaulted to labels on Pod template. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
    */
  var selector: js.UndefOr[Input[LabelSelectorPatch]] = js.undefined
  
  /**
    * An object that describes the pod that will be created. The DaemonSet will create exactly one copy of this pod on every node that matches the template's node selector (or on every node if no node selector is specified). More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template
    */
  var template: js.UndefOr[Input[PodTemplateSpecPatch]] = js.undefined
  
  /**
    * DEPRECATED. A sequence number representing a specific generation of the template. Populated by the system. It can be set only during the creation.
    */
  var templateGeneration: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * An update strategy to replace existing DaemonSet pods with new pods.
    */
  var updateStrategy: js.UndefOr[Input[DaemonSetUpdateStrategyPatch]] = js.undefined
}
object DaemonSetSpecPatch {
  
  inline def apply(): DaemonSetSpecPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DaemonSetSpecPatch]
  }
  
  extension [Self <: DaemonSetSpecPatch](x: Self) {
    
    inline def setMinReadySeconds(value: Input[Double]): Self = StObject.set(x, "minReadySeconds", value.asInstanceOf[js.Any])
    
    inline def setMinReadySecondsUndefined: Self = StObject.set(x, "minReadySeconds", js.undefined)
    
    inline def setRevisionHistoryLimit(value: Input[Double]): Self = StObject.set(x, "revisionHistoryLimit", value.asInstanceOf[js.Any])
    
    inline def setRevisionHistoryLimitUndefined: Self = StObject.set(x, "revisionHistoryLimit", js.undefined)
    
    inline def setSelector(value: Input[LabelSelectorPatch]): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    inline def setTemplate(value: Input[PodTemplateSpecPatch]): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateGeneration(value: Input[Double]): Self = StObject.set(x, "templateGeneration", value.asInstanceOf[js.Any])
    
    inline def setTemplateGenerationUndefined: Self = StObject.set(x, "templateGeneration", js.undefined)
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setUpdateStrategy(value: Input[DaemonSetUpdateStrategyPatch]): Self = StObject.set(x, "updateStrategy", value.asInstanceOf[js.Any])
    
    inline def setUpdateStrategyUndefined: Self = StObject.set(x, "updateStrategy", js.undefined)
  }
}
