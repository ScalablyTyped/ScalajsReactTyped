package typingsJapgolly.pulumiKubernetes.typesInputMod.apps.v1

import typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1.PersistentVolumeClaim
import typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1.PodTemplateSpec
import typingsJapgolly.pulumiKubernetes.typesInputMod.meta.v1.LabelSelector
import typingsJapgolly.pulumiPulumi.outputMod.Input
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
  var minReadySeconds: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * persistentVolumeClaimRetentionPolicy describes the lifecycle of persistent volume claims created from volumeClaimTemplates. By default, all persistent volume claims are created as needed and retained until manually deleted. This policy allows the lifecycle to be altered, for example by deleting persistent volume claims when their stateful set is deleted, or when their pod is scaled down. This requires the StatefulSetAutoDeletePVC feature gate to be enabled, which is alpha.  +optional
    */
  var persistentVolumeClaimRetentionPolicy: js.UndefOr[Input[StatefulSetPersistentVolumeClaimRetentionPolicy]] = js.undefined
  
  /**
    * podManagementPolicy controls how pods are created during initial scale up, when replacing pods on nodes, or when scaling down. The default policy is `OrderedReady`, where pods are created in increasing order (pod-0, then pod-1, etc) and the controller will wait until each pod is ready before continuing. When scaling down, the pods are removed in the opposite order. The alternative policy is `Parallel` which will create pods in parallel to match the desired scale without waiting, and on scale down will delete all pods at once.
    */
  var podManagementPolicy: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * replicas is the desired number of replicas of the given Template. These are replicas in the sense that they are instantiations of the same Template, but individual replicas also have a consistent identity. If unspecified, defaults to 1.
    */
  var replicas: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * revisionHistoryLimit is the maximum number of revisions that will be maintained in the StatefulSet's revision history. The revision history consists of all revisions not represented by a currently applied StatefulSetSpec version. The default value is 10.
    */
  var revisionHistoryLimit: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * selector is a label query over pods that should match the replica count. It must match the pod template's labels. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
    */
  var selector: Input[LabelSelector]
  
  /**
    * serviceName is the name of the service that governs this StatefulSet. This service must exist before the StatefulSet, and is responsible for the network identity of the set. Pods get DNS/hostnames that follow the pattern: pod-specific-string.serviceName.default.svc.cluster.local where "pod-specific-string" is managed by the StatefulSet controller.
    */
  var serviceName: Input[String]
  
  /**
    * template is the object that describes the pod that will be created if insufficient replicas are detected. Each pod stamped out by the StatefulSet will fulfill this Template, but have a unique identity from the rest of the StatefulSet.
    */
  var template: Input[PodTemplateSpec]
  
  /**
    * updateStrategy indicates the StatefulSetUpdateStrategy that will be employed to update Pods in the StatefulSet when a revision is made to Template.
    */
  var updateStrategy: js.UndefOr[Input[StatefulSetUpdateStrategy]] = js.undefined
  
  /**
    * volumeClaimTemplates is a list of claims that pods are allowed to reference. The StatefulSet controller is responsible for mapping network identities to claims in a way that maintains the identity of a pod. Every claim in this list must have at least one matching (by name) volumeMount in one container in the template. A claim in this list takes precedence over any volumes in the template, with the same name.
    */
  var volumeClaimTemplates: js.UndefOr[Input[js.Array[Input[PersistentVolumeClaim]]]] = js.undefined
}
object StatefulSetSpec {
  
  inline def apply(selector: Input[LabelSelector], serviceName: Input[String], template: Input[PodTemplateSpec]): StatefulSetSpec = {
    val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatefulSetSpec]
  }
  
  extension [Self <: StatefulSetSpec](x: Self) {
    
    inline def setMinReadySeconds(value: Input[Double]): Self = StObject.set(x, "minReadySeconds", value.asInstanceOf[js.Any])
    
    inline def setMinReadySecondsUndefined: Self = StObject.set(x, "minReadySeconds", js.undefined)
    
    inline def setPersistentVolumeClaimRetentionPolicy(value: Input[StatefulSetPersistentVolumeClaimRetentionPolicy]): Self = StObject.set(x, "persistentVolumeClaimRetentionPolicy", value.asInstanceOf[js.Any])
    
    inline def setPersistentVolumeClaimRetentionPolicyUndefined: Self = StObject.set(x, "persistentVolumeClaimRetentionPolicy", js.undefined)
    
    inline def setPodManagementPolicy(value: Input[String]): Self = StObject.set(x, "podManagementPolicy", value.asInstanceOf[js.Any])
    
    inline def setPodManagementPolicyUndefined: Self = StObject.set(x, "podManagementPolicy", js.undefined)
    
    inline def setReplicas(value: Input[Double]): Self = StObject.set(x, "replicas", value.asInstanceOf[js.Any])
    
    inline def setReplicasUndefined: Self = StObject.set(x, "replicas", js.undefined)
    
    inline def setRevisionHistoryLimit(value: Input[Double]): Self = StObject.set(x, "revisionHistoryLimit", value.asInstanceOf[js.Any])
    
    inline def setRevisionHistoryLimitUndefined: Self = StObject.set(x, "revisionHistoryLimit", js.undefined)
    
    inline def setSelector(value: Input[LabelSelector]): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setServiceName(value: Input[String]): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    inline def setTemplate(value: Input[PodTemplateSpec]): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setUpdateStrategy(value: Input[StatefulSetUpdateStrategy]): Self = StObject.set(x, "updateStrategy", value.asInstanceOf[js.Any])
    
    inline def setUpdateStrategyUndefined: Self = StObject.set(x, "updateStrategy", js.undefined)
    
    inline def setVolumeClaimTemplates(value: Input[js.Array[Input[PersistentVolumeClaim]]]): Self = StObject.set(x, "volumeClaimTemplates", value.asInstanceOf[js.Any])
    
    inline def setVolumeClaimTemplatesUndefined: Self = StObject.set(x, "volumeClaimTemplates", js.undefined)
    
    inline def setVolumeClaimTemplatesVarargs(value: Input[PersistentVolumeClaim]*): Self = StObject.set(x, "volumeClaimTemplates", js.Array(value*))
  }
}
