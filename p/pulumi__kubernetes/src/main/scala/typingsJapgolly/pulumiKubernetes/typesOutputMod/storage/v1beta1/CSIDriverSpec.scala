package typingsJapgolly.pulumiKubernetes.typesOutputMod.storage.v1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CSIDriverSpec is the specification of a CSIDriver.
  */
trait CSIDriverSpec extends StObject {
  
  /**
    * attachRequired indicates this CSI volume driver requires an attach operation (because it implements the CSI ControllerPublishVolume() method), and that the Kubernetes attach detach controller should call the attach volume interface which checks the volumeattachment status and waits until the volume is attached before proceeding to mounting. The CSI external-attacher coordinates with CSI volume driver and updates the volumeattachment status when the attach operation is complete. If the CSIDriverRegistry feature gate is enabled and the value is specified to false, the attach operation will be skipped. Otherwise the attach operation will be called.
    */
  var attachRequired: Boolean
  
  /**
    * Defines if the underlying volume supports changing ownership and permission of the volume before being mounted. Refer to the specific FSGroupPolicy values for additional details. This field is alpha-level, and is only honored by servers that enable the CSIVolumeFSGroupPolicy feature gate.
    */
  var fsGroupPolicy: String
  
  /**
    * If set to true, podInfoOnMount indicates this CSI volume driver requires additional pod information (like podName, podUID, etc.) during mount operations. If set to false, pod information will not be passed on mount. Default is false. The CSI driver specifies podInfoOnMount as part of driver deployment. If true, Kubelet will pass pod information as VolumeContext in the CSI NodePublishVolume() calls. The CSI driver is responsible for parsing and validating the information passed in as VolumeContext. The following VolumeConext will be passed if podInfoOnMount is set to true. This list might grow, but the prefix will be used. "csi.storage.k8s.io/pod.name": pod.Name "csi.storage.k8s.io/pod.namespace": pod.Namespace "csi.storage.k8s.io/pod.uid": string(pod.UID) "csi.storage.k8s.io/ephemeral": "true" iff the volume is an ephemeral inline volume
    *                                 defined by a CSIVolumeSource, otherwise "false"
    *
    * "csi.storage.k8s.io/ephemeral" is a new feature in Kubernetes 1.16. It is only required for drivers which support both the "Persistent" and "Ephemeral" VolumeLifecycleMode. Other drivers can leave pod info disabled and/or ignore this field. As Kubernetes 1.15 doesn't support this field, drivers can only support one mode when deployed on such a cluster and the deployment determines which mode that is, for example via a command line parameter of the driver.
    */
  var podInfoOnMount: Boolean
  
  /**
    * RequiresRepublish indicates the CSI driver wants `NodePublishVolume` being periodically called to reflect any possible change in the mounted volume. This field defaults to false.
    *
    * Note: After a successful initial NodePublishVolume call, subsequent calls to NodePublishVolume should only update the contents of the volume. New mount points will not be seen by a running container.
    *
    * This is an alpha feature and only available when the CSIServiceAccountToken feature is enabled.
    */
  var requiresRepublish: Boolean
  
  /**
    * If set to true, storageCapacity indicates that the CSI volume driver wants pod scheduling to consider the storage capacity that the driver deployment will report by creating CSIStorageCapacity objects with capacity information.
    *
    * The check can be enabled immediately when deploying a driver. In that case, provisioning new volumes with late binding will pause until the driver deployment has published some suitable CSIStorageCapacity object.
    *
    * Alternatively, the driver can be deployed with the field unset or false and it can be flipped later when storage capacity information has been published.
    *
    * This is an alpha field and only available when the CSIStorageCapacity feature is enabled. The default is false.
    */
  var storageCapacity: Boolean
  
  /**
    * TokenRequests indicates the CSI driver needs pods' service account tokens it is mounting volume for to do necessary authentication. Kubelet will pass the tokens in VolumeContext in the CSI NodePublishVolume calls. The CSI driver should parse and validate the following VolumeContext: "csi.storage.k8s.io/serviceAccount.tokens": {
    *   "<audience>": {
    *     "token": <token>,
    *     "expirationTimestamp": <expiration timestamp in RFC3339>,
    *   },
    *   ...
    * }
    *
    * Note: Audience in each TokenRequest should be different and at most one token is empty string. To receive a new token after expiry, RequiresRepublish can be used to trigger NodePublishVolume periodically.
    *
    * This is an alpha feature and only available when the CSIServiceAccountToken feature is enabled.
    */
  var tokenRequests: js.Array[TokenRequest]
  
  /**
    * VolumeLifecycleModes defines what kind of volumes this CSI volume driver supports. The default if the list is empty is "Persistent", which is the usage defined by the CSI specification and implemented in Kubernetes via the usual PV/PVC mechanism. The other mode is "Ephemeral". In this mode, volumes are defined inline inside the pod spec with CSIVolumeSource and their lifecycle is tied to the lifecycle of that pod. A driver has to be aware of this because it is only going to get a NodePublishVolume call for such a volume. For more information about implementing this mode, see https://kubernetes-csi.github.io/docs/ephemeral-local-volumes.html A driver can support one or more of these modes and more modes may be added in the future.
    */
  var volumeLifecycleModes: js.Array[String]
}
object CSIDriverSpec {
  
  inline def apply(
    attachRequired: Boolean,
    fsGroupPolicy: String,
    podInfoOnMount: Boolean,
    requiresRepublish: Boolean,
    storageCapacity: Boolean,
    tokenRequests: js.Array[TokenRequest],
    volumeLifecycleModes: js.Array[String]
  ): CSIDriverSpec = {
    val __obj = js.Dynamic.literal(attachRequired = attachRequired.asInstanceOf[js.Any], fsGroupPolicy = fsGroupPolicy.asInstanceOf[js.Any], podInfoOnMount = podInfoOnMount.asInstanceOf[js.Any], requiresRepublish = requiresRepublish.asInstanceOf[js.Any], storageCapacity = storageCapacity.asInstanceOf[js.Any], tokenRequests = tokenRequests.asInstanceOf[js.Any], volumeLifecycleModes = volumeLifecycleModes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSIDriverSpec]
  }
  
  extension [Self <: CSIDriverSpec](x: Self) {
    
    inline def setAttachRequired(value: Boolean): Self = StObject.set(x, "attachRequired", value.asInstanceOf[js.Any])
    
    inline def setFsGroupPolicy(value: String): Self = StObject.set(x, "fsGroupPolicy", value.asInstanceOf[js.Any])
    
    inline def setPodInfoOnMount(value: Boolean): Self = StObject.set(x, "podInfoOnMount", value.asInstanceOf[js.Any])
    
    inline def setRequiresRepublish(value: Boolean): Self = StObject.set(x, "requiresRepublish", value.asInstanceOf[js.Any])
    
    inline def setStorageCapacity(value: Boolean): Self = StObject.set(x, "storageCapacity", value.asInstanceOf[js.Any])
    
    inline def setTokenRequests(value: js.Array[TokenRequest]): Self = StObject.set(x, "tokenRequests", value.asInstanceOf[js.Any])
    
    inline def setTokenRequestsVarargs(value: TokenRequest*): Self = StObject.set(x, "tokenRequests", js.Array(value*))
    
    inline def setVolumeLifecycleModes(value: js.Array[String]): Self = StObject.set(x, "volumeLifecycleModes", value.asInstanceOf[js.Any])
    
    inline def setVolumeLifecycleModesVarargs(value: String*): Self = StObject.set(x, "volumeLifecycleModes", js.Array(value*))
  }
}
