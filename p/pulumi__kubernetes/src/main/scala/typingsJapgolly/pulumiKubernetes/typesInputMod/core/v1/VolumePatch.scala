package typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Volume represents a named volume in a pod that may be accessed by any container in the pod.
  */
trait VolumePatch extends StObject {
  
  /**
    * awsElasticBlockStore represents an AWS Disk resource that is attached to a kubelet's host machine and then exposed to the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
    */
  var awsElasticBlockStore: js.UndefOr[Input[AWSElasticBlockStoreVolumeSourcePatch]] = js.undefined
  
  /**
    * azureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.
    */
  var azureDisk: js.UndefOr[Input[AzureDiskVolumeSourcePatch]] = js.undefined
  
  /**
    * azureFile represents an Azure File Service mount on the host and bind mount to the pod.
    */
  var azureFile: js.UndefOr[Input[AzureFileVolumeSourcePatch]] = js.undefined
  
  /**
    * cephFS represents a Ceph FS mount on the host that shares a pod's lifetime
    */
  var cephfs: js.UndefOr[Input[CephFSVolumeSourcePatch]] = js.undefined
  
  /**
    * cinder represents a cinder volume attached and mounted on kubelets host machine. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
    */
  var cinder: js.UndefOr[Input[CinderVolumeSourcePatch]] = js.undefined
  
  /**
    * configMap represents a configMap that should populate this volume
    */
  var configMap: js.UndefOr[Input[ConfigMapVolumeSourcePatch]] = js.undefined
  
  /**
    * csi (Container Storage Interface) represents ephemeral storage that is handled by certain external CSI drivers (Beta feature).
    */
  var csi: js.UndefOr[Input[CSIVolumeSourcePatch]] = js.undefined
  
  /**
    * downwardAPI represents downward API about the pod that should populate this volume
    */
  var downwardAPI: js.UndefOr[Input[DownwardAPIVolumeSourcePatch]] = js.undefined
  
  /**
    * emptyDir represents a temporary directory that shares a pod's lifetime. More info: https://kubernetes.io/docs/concepts/storage/volumes#emptydir
    */
  var emptyDir: js.UndefOr[Input[EmptyDirVolumeSourcePatch]] = js.undefined
  
  /**
    * ephemeral represents a volume that is handled by a cluster storage driver. The volume's lifecycle is tied to the pod that defines it - it will be created before the pod starts, and deleted when the pod is removed.
    *
    * Use this if: a) the volume is only needed while the pod runs, b) features of normal volumes like restoring from snapshot or capacity
    *    tracking are needed,
    * c) the storage driver is specified through a storage class, and d) the storage driver supports dynamic volume provisioning through
    *    a PersistentVolumeClaim (see EphemeralVolumeSource for more
    *    information on the connection between this volume type
    *    and PersistentVolumeClaim).
    *
    * Use PersistentVolumeClaim or one of the vendor-specific APIs for volumes that persist for longer than the lifecycle of an individual pod.
    *
    * Use CSI for light-weight local ephemeral volumes if the CSI driver is meant to be used that way - see the documentation of the driver for more information.
    *
    * A pod can use both types of ephemeral volumes and persistent volumes at the same time.
    */
  var ephemeral: js.UndefOr[Input[EphemeralVolumeSourcePatch]] = js.undefined
  
  /**
    * fc represents a Fibre Channel resource that is attached to a kubelet's host machine and then exposed to the pod.
    */
  var fc: js.UndefOr[Input[FCVolumeSourcePatch]] = js.undefined
  
  /**
    * flexVolume represents a generic volume resource that is provisioned/attached using an exec based plugin.
    */
  var flexVolume: js.UndefOr[Input[FlexVolumeSourcePatch]] = js.undefined
  
  /**
    * flocker represents a Flocker volume attached to a kubelet's host machine. This depends on the Flocker control service being running
    */
  var flocker: js.UndefOr[Input[FlockerVolumeSourcePatch]] = js.undefined
  
  /**
    * gcePersistentDisk represents a GCE Disk resource that is attached to a kubelet's host machine and then exposed to the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
    */
  var gcePersistentDisk: js.UndefOr[Input[GCEPersistentDiskVolumeSourcePatch]] = js.undefined
  
  /**
    * gitRepo represents a git repository at a particular revision. DEPRECATED: GitRepo is deprecated. To provision a container with a git repo, mount an EmptyDir into an InitContainer that clones the repo using git, then mount the EmptyDir into the Pod's container.
    */
  var gitRepo: js.UndefOr[Input[GitRepoVolumeSourcePatch]] = js.undefined
  
  /**
    * glusterfs represents a Glusterfs mount on the host that shares a pod's lifetime. More info: https://examples.k8s.io/volumes/glusterfs/README.md
    */
  var glusterfs: js.UndefOr[Input[GlusterfsVolumeSourcePatch]] = js.undefined
  
  /**
    * hostPath represents a pre-existing file or directory on the host machine that is directly exposed to the container. This is generally used for system agents or other privileged things that are allowed to see the host machine. Most containers will NOT need this. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath
    */
  var hostPath: js.UndefOr[Input[HostPathVolumeSourcePatch]] = js.undefined
  
  /**
    * iscsi represents an ISCSI Disk resource that is attached to a kubelet's host machine and then exposed to the pod. More info: https://examples.k8s.io/volumes/iscsi/README.md
    */
  var iscsi: js.UndefOr[Input[ISCSIVolumeSourcePatch]] = js.undefined
  
  /**
    * name of the volume. Must be a DNS_LABEL and unique within the pod. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
    */
  var name: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * nfs represents an NFS mount on the host that shares a pod's lifetime More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
    */
  var nfs: js.UndefOr[Input[NFSVolumeSourcePatch]] = js.undefined
  
  /**
    * persistentVolumeClaimVolumeSource represents a reference to a PersistentVolumeClaim in the same namespace. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
    */
  var persistentVolumeClaim: js.UndefOr[Input[PersistentVolumeClaimVolumeSourcePatch]] = js.undefined
  
  /**
    * photonPersistentDisk represents a PhotonController persistent disk attached and mounted on kubelets host machine
    */
  var photonPersistentDisk: js.UndefOr[Input[PhotonPersistentDiskVolumeSourcePatch]] = js.undefined
  
  /**
    * portworxVolume represents a portworx volume attached and mounted on kubelets host machine
    */
  var portworxVolume: js.UndefOr[Input[PortworxVolumeSourcePatch]] = js.undefined
  
  /**
    * projected items for all in one resources secrets, configmaps, and downward API
    */
  var projected: js.UndefOr[Input[ProjectedVolumeSourcePatch]] = js.undefined
  
  /**
    * quobyte represents a Quobyte mount on the host that shares a pod's lifetime
    */
  var quobyte: js.UndefOr[Input[QuobyteVolumeSourcePatch]] = js.undefined
  
  /**
    * rbd represents a Rados Block Device mount on the host that shares a pod's lifetime. More info: https://examples.k8s.io/volumes/rbd/README.md
    */
  var rbd: js.UndefOr[Input[RBDVolumeSourcePatch]] = js.undefined
  
  /**
    * scaleIO represents a ScaleIO persistent volume attached and mounted on Kubernetes nodes.
    */
  var scaleIO: js.UndefOr[Input[ScaleIOVolumeSourcePatch]] = js.undefined
  
  /**
    * secret represents a secret that should populate this volume. More info: https://kubernetes.io/docs/concepts/storage/volumes#secret
    */
  var secret: js.UndefOr[Input[SecretVolumeSourcePatch]] = js.undefined
  
  /**
    * storageOS represents a StorageOS volume attached and mounted on Kubernetes nodes.
    */
  var storageos: js.UndefOr[Input[StorageOSVolumeSourcePatch]] = js.undefined
  
  /**
    * vsphereVolume represents a vSphere volume attached and mounted on kubelets host machine
    */
  var vsphereVolume: js.UndefOr[Input[VsphereVirtualDiskVolumeSourcePatch]] = js.undefined
}
object VolumePatch {
  
  inline def apply(): VolumePatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumePatch]
  }
  
  extension [Self <: VolumePatch](x: Self) {
    
    inline def setAwsElasticBlockStore(value: Input[AWSElasticBlockStoreVolumeSourcePatch]): Self = StObject.set(x, "awsElasticBlockStore", value.asInstanceOf[js.Any])
    
    inline def setAwsElasticBlockStoreUndefined: Self = StObject.set(x, "awsElasticBlockStore", js.undefined)
    
    inline def setAzureDisk(value: Input[AzureDiskVolumeSourcePatch]): Self = StObject.set(x, "azureDisk", value.asInstanceOf[js.Any])
    
    inline def setAzureDiskUndefined: Self = StObject.set(x, "azureDisk", js.undefined)
    
    inline def setAzureFile(value: Input[AzureFileVolumeSourcePatch]): Self = StObject.set(x, "azureFile", value.asInstanceOf[js.Any])
    
    inline def setAzureFileUndefined: Self = StObject.set(x, "azureFile", js.undefined)
    
    inline def setCephfs(value: Input[CephFSVolumeSourcePatch]): Self = StObject.set(x, "cephfs", value.asInstanceOf[js.Any])
    
    inline def setCephfsUndefined: Self = StObject.set(x, "cephfs", js.undefined)
    
    inline def setCinder(value: Input[CinderVolumeSourcePatch]): Self = StObject.set(x, "cinder", value.asInstanceOf[js.Any])
    
    inline def setCinderUndefined: Self = StObject.set(x, "cinder", js.undefined)
    
    inline def setConfigMap(value: Input[ConfigMapVolumeSourcePatch]): Self = StObject.set(x, "configMap", value.asInstanceOf[js.Any])
    
    inline def setConfigMapUndefined: Self = StObject.set(x, "configMap", js.undefined)
    
    inline def setCsi(value: Input[CSIVolumeSourcePatch]): Self = StObject.set(x, "csi", value.asInstanceOf[js.Any])
    
    inline def setCsiUndefined: Self = StObject.set(x, "csi", js.undefined)
    
    inline def setDownwardAPI(value: Input[DownwardAPIVolumeSourcePatch]): Self = StObject.set(x, "downwardAPI", value.asInstanceOf[js.Any])
    
    inline def setDownwardAPIUndefined: Self = StObject.set(x, "downwardAPI", js.undefined)
    
    inline def setEmptyDir(value: Input[EmptyDirVolumeSourcePatch]): Self = StObject.set(x, "emptyDir", value.asInstanceOf[js.Any])
    
    inline def setEmptyDirUndefined: Self = StObject.set(x, "emptyDir", js.undefined)
    
    inline def setEphemeral(value: Input[EphemeralVolumeSourcePatch]): Self = StObject.set(x, "ephemeral", value.asInstanceOf[js.Any])
    
    inline def setEphemeralUndefined: Self = StObject.set(x, "ephemeral", js.undefined)
    
    inline def setFc(value: Input[FCVolumeSourcePatch]): Self = StObject.set(x, "fc", value.asInstanceOf[js.Any])
    
    inline def setFcUndefined: Self = StObject.set(x, "fc", js.undefined)
    
    inline def setFlexVolume(value: Input[FlexVolumeSourcePatch]): Self = StObject.set(x, "flexVolume", value.asInstanceOf[js.Any])
    
    inline def setFlexVolumeUndefined: Self = StObject.set(x, "flexVolume", js.undefined)
    
    inline def setFlocker(value: Input[FlockerVolumeSourcePatch]): Self = StObject.set(x, "flocker", value.asInstanceOf[js.Any])
    
    inline def setFlockerUndefined: Self = StObject.set(x, "flocker", js.undefined)
    
    inline def setGcePersistentDisk(value: Input[GCEPersistentDiskVolumeSourcePatch]): Self = StObject.set(x, "gcePersistentDisk", value.asInstanceOf[js.Any])
    
    inline def setGcePersistentDiskUndefined: Self = StObject.set(x, "gcePersistentDisk", js.undefined)
    
    inline def setGitRepo(value: Input[GitRepoVolumeSourcePatch]): Self = StObject.set(x, "gitRepo", value.asInstanceOf[js.Any])
    
    inline def setGitRepoUndefined: Self = StObject.set(x, "gitRepo", js.undefined)
    
    inline def setGlusterfs(value: Input[GlusterfsVolumeSourcePatch]): Self = StObject.set(x, "glusterfs", value.asInstanceOf[js.Any])
    
    inline def setGlusterfsUndefined: Self = StObject.set(x, "glusterfs", js.undefined)
    
    inline def setHostPath(value: Input[HostPathVolumeSourcePatch]): Self = StObject.set(x, "hostPath", value.asInstanceOf[js.Any])
    
    inline def setHostPathUndefined: Self = StObject.set(x, "hostPath", js.undefined)
    
    inline def setIscsi(value: Input[ISCSIVolumeSourcePatch]): Self = StObject.set(x, "iscsi", value.asInstanceOf[js.Any])
    
    inline def setIscsiUndefined: Self = StObject.set(x, "iscsi", js.undefined)
    
    inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNfs(value: Input[NFSVolumeSourcePatch]): Self = StObject.set(x, "nfs", value.asInstanceOf[js.Any])
    
    inline def setNfsUndefined: Self = StObject.set(x, "nfs", js.undefined)
    
    inline def setPersistentVolumeClaim(value: Input[PersistentVolumeClaimVolumeSourcePatch]): Self = StObject.set(x, "persistentVolumeClaim", value.asInstanceOf[js.Any])
    
    inline def setPersistentVolumeClaimUndefined: Self = StObject.set(x, "persistentVolumeClaim", js.undefined)
    
    inline def setPhotonPersistentDisk(value: Input[PhotonPersistentDiskVolumeSourcePatch]): Self = StObject.set(x, "photonPersistentDisk", value.asInstanceOf[js.Any])
    
    inline def setPhotonPersistentDiskUndefined: Self = StObject.set(x, "photonPersistentDisk", js.undefined)
    
    inline def setPortworxVolume(value: Input[PortworxVolumeSourcePatch]): Self = StObject.set(x, "portworxVolume", value.asInstanceOf[js.Any])
    
    inline def setPortworxVolumeUndefined: Self = StObject.set(x, "portworxVolume", js.undefined)
    
    inline def setProjected(value: Input[ProjectedVolumeSourcePatch]): Self = StObject.set(x, "projected", value.asInstanceOf[js.Any])
    
    inline def setProjectedUndefined: Self = StObject.set(x, "projected", js.undefined)
    
    inline def setQuobyte(value: Input[QuobyteVolumeSourcePatch]): Self = StObject.set(x, "quobyte", value.asInstanceOf[js.Any])
    
    inline def setQuobyteUndefined: Self = StObject.set(x, "quobyte", js.undefined)
    
    inline def setRbd(value: Input[RBDVolumeSourcePatch]): Self = StObject.set(x, "rbd", value.asInstanceOf[js.Any])
    
    inline def setRbdUndefined: Self = StObject.set(x, "rbd", js.undefined)
    
    inline def setScaleIO(value: Input[ScaleIOVolumeSourcePatch]): Self = StObject.set(x, "scaleIO", value.asInstanceOf[js.Any])
    
    inline def setScaleIOUndefined: Self = StObject.set(x, "scaleIO", js.undefined)
    
    inline def setSecret(value: Input[SecretVolumeSourcePatch]): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    inline def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
    
    inline def setStorageos(value: Input[StorageOSVolumeSourcePatch]): Self = StObject.set(x, "storageos", value.asInstanceOf[js.Any])
    
    inline def setStorageosUndefined: Self = StObject.set(x, "storageos", js.undefined)
    
    inline def setVsphereVolume(value: Input[VsphereVirtualDiskVolumeSourcePatch]): Self = StObject.set(x, "vsphereVolume", value.asInstanceOf[js.Any])
    
    inline def setVsphereVolumeUndefined: Self = StObject.set(x, "vsphereVolume", js.undefined)
  }
}
