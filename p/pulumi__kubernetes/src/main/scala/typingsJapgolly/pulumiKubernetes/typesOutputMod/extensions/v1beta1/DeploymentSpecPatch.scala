package typingsJapgolly.pulumiKubernetes.typesOutputMod.extensions.v1beta1

import typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1.PodTemplateSpecPatch
import typingsJapgolly.pulumiKubernetes.typesOutputMod.meta.v1.LabelSelectorPatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DeploymentSpec is the specification of the desired behavior of the Deployment.
  */
trait DeploymentSpecPatch extends StObject {
  
  /**
    * Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready)
    */
  var minReadySeconds: Double
  
  /**
    * Indicates that the deployment is paused and will not be processed by the deployment controller.
    */
  var paused: Boolean
  
  /**
    * The maximum time in seconds for a deployment to make progress before it is considered to be failed. The deployment controller will continue to process failed deployments and a condition with a ProgressDeadlineExceeded reason will be surfaced in the deployment status. Note that progress will not be estimated during the time a deployment is paused. This is set to the max value of int32 (i.e. 2147483647) by default, which means "no deadline".
    */
  var progressDeadlineSeconds: Double
  
  /**
    * Number of desired pods. This is a pointer to distinguish between explicit zero and not specified. Defaults to 1.
    */
  var replicas: Double
  
  /**
    * The number of old ReplicaSets to retain to allow rollback. This is a pointer to distinguish between explicit zero and not specified. This is set to the max value of int32 (i.e. 2147483647) by default, which means "retaining all old RelicaSets".
    */
  var revisionHistoryLimit: Double
  
  /**
    * DEPRECATED. The config this deployment is rolling back to. Will be cleared after rollback is done.
    */
  var rollbackTo: RollbackConfigPatch
  
  /**
    * Label selector for pods. Existing ReplicaSets whose pods are selected by this will be the ones affected by this deployment.
    */
  var selector: LabelSelectorPatch
  
  /**
    * The deployment strategy to use to replace existing pods with new ones.
    */
  var strategy: DeploymentStrategyPatch
  
  /**
    * Template describes the pods that will be created.
    */
  var template: PodTemplateSpecPatch
}
object DeploymentSpecPatch {
  
  inline def apply(
    minReadySeconds: Double,
    paused: Boolean,
    progressDeadlineSeconds: Double,
    replicas: Double,
    revisionHistoryLimit: Double,
    rollbackTo: RollbackConfigPatch,
    selector: LabelSelectorPatch,
    strategy: DeploymentStrategyPatch,
    template: PodTemplateSpecPatch
  ): DeploymentSpecPatch = {
    val __obj = js.Dynamic.literal(minReadySeconds = minReadySeconds.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any], progressDeadlineSeconds = progressDeadlineSeconds.asInstanceOf[js.Any], replicas = replicas.asInstanceOf[js.Any], revisionHistoryLimit = revisionHistoryLimit.asInstanceOf[js.Any], rollbackTo = rollbackTo.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentSpecPatch]
  }
  
  extension [Self <: DeploymentSpecPatch](x: Self) {
    
    inline def setMinReadySeconds(value: Double): Self = StObject.set(x, "minReadySeconds", value.asInstanceOf[js.Any])
    
    inline def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
    
    inline def setProgressDeadlineSeconds(value: Double): Self = StObject.set(x, "progressDeadlineSeconds", value.asInstanceOf[js.Any])
    
    inline def setReplicas(value: Double): Self = StObject.set(x, "replicas", value.asInstanceOf[js.Any])
    
    inline def setRevisionHistoryLimit(value: Double): Self = StObject.set(x, "revisionHistoryLimit", value.asInstanceOf[js.Any])
    
    inline def setRollbackTo(value: RollbackConfigPatch): Self = StObject.set(x, "rollbackTo", value.asInstanceOf[js.Any])
    
    inline def setSelector(value: LabelSelectorPatch): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setStrategy(value: DeploymentStrategyPatch): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
    
    inline def setTemplate(value: PodTemplateSpecPatch): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
  }
}
