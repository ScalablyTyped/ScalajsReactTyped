package typingsJapgolly.pulumiKubernetes.typesOutputMod.apps.v1

import typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1.PersistentVolumeClaim
import typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1.PodTemplateSpec
import typingsJapgolly.pulumiKubernetes.typesOutputMod.meta.v1.LabelSelector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A StatefulSetSpec is the specification of a StatefulSet.
  */
trait StatefulSetSpec extends StObject {
  
  /**
    * Minimum number of seconds for which a newly created pod should be ready without any of its container crashing for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready)
    */
  var minReadySeconds: Double
  
  /**
    * persistentVolumeClaimRetentionPolicy describes the lifecycle of persistent volume claims created from volumeClaimTemplates. By default, all persistent volume claims are created as needed and retained until manually deleted. This policy allows the lifecycle to be altered, for example by deleting persistent volume claims when their stateful set is deleted, or when their pod is scaled down. This requires the StatefulSetAutoDeletePVC feature gate to be enabled, which is alpha.  +optional
    */
  var persistentVolumeClaimRetentionPolicy: StatefulSetPersistentVolumeClaimRetentionPolicy
  
  /**
    * podManagementPolicy controls how pods are created during initial scale up, when replacing pods on nodes, or when scaling down. The default policy is `OrderedReady`, where pods are created in increasing order (pod-0, then pod-1, etc) and the controller will wait until each pod is ready before continuing. When scaling down, the pods are removed in the opposite order. The alternative policy is `Parallel` which will create pods in parallel to match the desired scale without waiting, and on scale down will delete all pods at once.
    */
  var podManagementPolicy: String
  
  /**
    * replicas is the desired number of replicas of the given Template. These are replicas in the sense that they are instantiations of the same Template, but individual replicas also have a consistent identity. If unspecified, defaults to 1.
    */
  var replicas: Double
  
  /**
    * revisionHistoryLimit is the maximum number of revisions that will be maintained in the StatefulSet's revision history. The revision history consists of all revisions not represented by a currently applied StatefulSetSpec version. The default value is 10.
    */
  var revisionHistoryLimit: Double
  
  /**
    * selector is a label query over pods that should match the replica count. It must match the pod template's labels. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
    */
  var selector: LabelSelector
  
  /**
    * serviceName is the name of the service that governs this StatefulSet. This service must exist before the StatefulSet, and is responsible for the network identity of the set. Pods get DNS/hostnames that follow the pattern: pod-specific-string.serviceName.default.svc.cluster.local where "pod-specific-string" is managed by the StatefulSet controller.
    */
  var serviceName: String
  
  /**
    * template is the object that describes the pod that will be created if insufficient replicas are detected. Each pod stamped out by the StatefulSet will fulfill this Template, but have a unique identity from the rest of the StatefulSet.
    */
  var template: PodTemplateSpec
  
  /**
    * updateStrategy indicates the StatefulSetUpdateStrategy that will be employed to update Pods in the StatefulSet when a revision is made to Template.
    */
  var updateStrategy: StatefulSetUpdateStrategy
  
  /**
    * volumeClaimTemplates is a list of claims that pods are allowed to reference. The StatefulSet controller is responsible for mapping network identities to claims in a way that maintains the identity of a pod. Every claim in this list must have at least one matching (by name) volumeMount in one container in the template. A claim in this list takes precedence over any volumes in the template, with the same name.
    */
  var volumeClaimTemplates: js.Array[PersistentVolumeClaim]
}
object StatefulSetSpec {
  
  inline def apply(
    minReadySeconds: Double,
    persistentVolumeClaimRetentionPolicy: StatefulSetPersistentVolumeClaimRetentionPolicy,
    podManagementPolicy: String,
    replicas: Double,
    revisionHistoryLimit: Double,
    selector: LabelSelector,
    serviceName: String,
    template: PodTemplateSpec,
    updateStrategy: StatefulSetUpdateStrategy,
    volumeClaimTemplates: js.Array[PersistentVolumeClaim]
  ): StatefulSetSpec = {
    val __obj = js.Dynamic.literal(minReadySeconds = minReadySeconds.asInstanceOf[js.Any], persistentVolumeClaimRetentionPolicy = persistentVolumeClaimRetentionPolicy.asInstanceOf[js.Any], podManagementPolicy = podManagementPolicy.asInstanceOf[js.Any], replicas = replicas.asInstanceOf[js.Any], revisionHistoryLimit = revisionHistoryLimit.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], updateStrategy = updateStrategy.asInstanceOf[js.Any], volumeClaimTemplates = volumeClaimTemplates.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatefulSetSpec]
  }
  
  extension [Self <: StatefulSetSpec](x: Self) {
    
    inline def setMinReadySeconds(value: Double): Self = StObject.set(x, "minReadySeconds", value.asInstanceOf[js.Any])
    
    inline def setPersistentVolumeClaimRetentionPolicy(value: StatefulSetPersistentVolumeClaimRetentionPolicy): Self = StObject.set(x, "persistentVolumeClaimRetentionPolicy", value.asInstanceOf[js.Any])
    
    inline def setPodManagementPolicy(value: String): Self = StObject.set(x, "podManagementPolicy", value.asInstanceOf[js.Any])
    
    inline def setReplicas(value: Double): Self = StObject.set(x, "replicas", value.asInstanceOf[js.Any])
    
    inline def setRevisionHistoryLimit(value: Double): Self = StObject.set(x, "revisionHistoryLimit", value.asInstanceOf[js.Any])
    
    inline def setSelector(value: LabelSelector): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    inline def setTemplate(value: PodTemplateSpec): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setUpdateStrategy(value: StatefulSetUpdateStrategy): Self = StObject.set(x, "updateStrategy", value.asInstanceOf[js.Any])
    
    inline def setVolumeClaimTemplates(value: js.Array[PersistentVolumeClaim]): Self = StObject.set(x, "volumeClaimTemplates", value.asInstanceOf[js.Any])
    
    inline def setVolumeClaimTemplatesVarargs(value: PersistentVolumeClaim*): Self = StObject.set(x, "volumeClaimTemplates", js.Array(value*))
  }
}
