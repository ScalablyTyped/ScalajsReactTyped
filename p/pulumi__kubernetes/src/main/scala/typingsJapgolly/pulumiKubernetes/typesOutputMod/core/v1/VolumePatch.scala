package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

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
  var awsElasticBlockStore: AWSElasticBlockStoreVolumeSourcePatch
  
  /**
    * azureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.
    */
  var azureDisk: AzureDiskVolumeSourcePatch
  
  /**
    * azureFile represents an Azure File Service mount on the host and bind mount to the pod.
    */
  var azureFile: AzureFileVolumeSourcePatch
  
  /**
    * cephFS represents a Ceph FS mount on the host that shares a pod's lifetime
    */
  var cephfs: CephFSVolumeSourcePatch
  
  /**
    * cinder represents a cinder volume attached and mounted on kubelets host machine. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
    */
  var cinder: CinderVolumeSourcePatch
  
  /**
    * configMap represents a configMap that should populate this volume
    */
  var configMap: ConfigMapVolumeSourcePatch
  
  /**
    * csi (Container Storage Interface) represents ephemeral storage that is handled by certain external CSI drivers (Beta feature).
    */
  var csi: CSIVolumeSourcePatch
  
  /**
    * downwardAPI represents downward API about the pod that should populate this volume
    */
  var downwardAPI: DownwardAPIVolumeSourcePatch
  
  /**
    * emptyDir represents a temporary directory that shares a pod's lifetime. More info: https://kubernetes.io/docs/concepts/storage/volumes#emptydir
    */
  var emptyDir: EmptyDirVolumeSourcePatch
  
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
  var ephemeral: EphemeralVolumeSourcePatch
  
  /**
    * fc represents a Fibre Channel resource that is attached to a kubelet's host machine and then exposed to the pod.
    */
  var fc: FCVolumeSourcePatch
  
  /**
    * flexVolume represents a generic volume resource that is provisioned/attached using an exec based plugin.
    */
  var flexVolume: FlexVolumeSourcePatch
  
  /**
    * flocker represents a Flocker volume attached to a kubelet's host machine. This depends on the Flocker control service being running
    */
  var flocker: FlockerVolumeSourcePatch
  
  /**
    * gcePersistentDisk represents a GCE Disk resource that is attached to a kubelet's host machine and then exposed to the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
    */
  var gcePersistentDisk: GCEPersistentDiskVolumeSourcePatch
  
  /**
    * gitRepo represents a git repository at a particular revision. DEPRECATED: GitRepo is deprecated. To provision a container with a git repo, mount an EmptyDir into an InitContainer that clones the repo using git, then mount the EmptyDir into the Pod's container.
    */
  var gitRepo: GitRepoVolumeSourcePatch
  
  /**
    * glusterfs represents a Glusterfs mount on the host that shares a pod's lifetime. More info: https://examples.k8s.io/volumes/glusterfs/README.md
    */
  var glusterfs: GlusterfsVolumeSourcePatch
  
  /**
    * hostPath represents a pre-existing file or directory on the host machine that is directly exposed to the container. This is generally used for system agents or other privileged things that are allowed to see the host machine. Most containers will NOT need this. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath
    */
  var hostPath: HostPathVolumeSourcePatch
  
  /**
    * iscsi represents an ISCSI Disk resource that is attached to a kubelet's host machine and then exposed to the pod. More info: https://examples.k8s.io/volumes/iscsi/README.md
    */
  var iscsi: ISCSIVolumeSourcePatch
  
  /**
    * name of the volume. Must be a DNS_LABEL and unique within the pod. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
    */
  var name: String
  
  /**
    * nfs represents an NFS mount on the host that shares a pod's lifetime More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
    */
  var nfs: NFSVolumeSourcePatch
  
  /**
    * persistentVolumeClaimVolumeSource represents a reference to a PersistentVolumeClaim in the same namespace. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
    */
  var persistentVolumeClaim: PersistentVolumeClaimVolumeSourcePatch
  
  /**
    * photonPersistentDisk represents a PhotonController persistent disk attached and mounted on kubelets host machine
    */
  var photonPersistentDisk: PhotonPersistentDiskVolumeSourcePatch
  
  /**
    * portworxVolume represents a portworx volume attached and mounted on kubelets host machine
    */
  var portworxVolume: PortworxVolumeSourcePatch
  
  /**
    * projected items for all in one resources secrets, configmaps, and downward API
    */
  var projected: ProjectedVolumeSourcePatch
  
  /**
    * quobyte represents a Quobyte mount on the host that shares a pod's lifetime
    */
  var quobyte: QuobyteVolumeSourcePatch
  
  /**
    * rbd represents a Rados Block Device mount on the host that shares a pod's lifetime. More info: https://examples.k8s.io/volumes/rbd/README.md
    */
  var rbd: RBDVolumeSourcePatch
  
  /**
    * scaleIO represents a ScaleIO persistent volume attached and mounted on Kubernetes nodes.
    */
  var scaleIO: ScaleIOVolumeSourcePatch
  
  /**
    * secret represents a secret that should populate this volume. More info: https://kubernetes.io/docs/concepts/storage/volumes#secret
    */
  var secret: SecretVolumeSourcePatch
  
  /**
    * storageOS represents a StorageOS volume attached and mounted on Kubernetes nodes.
    */
  var storageos: StorageOSVolumeSourcePatch
  
  /**
    * vsphereVolume represents a vSphere volume attached and mounted on kubelets host machine
    */
  var vsphereVolume: VsphereVirtualDiskVolumeSourcePatch
}
object VolumePatch {
  
  inline def apply(
    awsElasticBlockStore: AWSElasticBlockStoreVolumeSourcePatch,
    azureDisk: AzureDiskVolumeSourcePatch,
    azureFile: AzureFileVolumeSourcePatch,
    cephfs: CephFSVolumeSourcePatch,
    cinder: CinderVolumeSourcePatch,
    configMap: ConfigMapVolumeSourcePatch,
    csi: CSIVolumeSourcePatch,
    downwardAPI: DownwardAPIVolumeSourcePatch,
    emptyDir: EmptyDirVolumeSourcePatch,
    ephemeral: EphemeralVolumeSourcePatch,
    fc: FCVolumeSourcePatch,
    flexVolume: FlexVolumeSourcePatch,
    flocker: FlockerVolumeSourcePatch,
    gcePersistentDisk: GCEPersistentDiskVolumeSourcePatch,
    gitRepo: GitRepoVolumeSourcePatch,
    glusterfs: GlusterfsVolumeSourcePatch,
    hostPath: HostPathVolumeSourcePatch,
    iscsi: ISCSIVolumeSourcePatch,
    name: String,
    nfs: NFSVolumeSourcePatch,
    persistentVolumeClaim: PersistentVolumeClaimVolumeSourcePatch,
    photonPersistentDisk: PhotonPersistentDiskVolumeSourcePatch,
    portworxVolume: PortworxVolumeSourcePatch,
    projected: ProjectedVolumeSourcePatch,
    quobyte: QuobyteVolumeSourcePatch,
    rbd: RBDVolumeSourcePatch,
    scaleIO: ScaleIOVolumeSourcePatch,
    secret: SecretVolumeSourcePatch,
    storageos: StorageOSVolumeSourcePatch,
    vsphereVolume: VsphereVirtualDiskVolumeSourcePatch
  ): VolumePatch = {
    val __obj = js.Dynamic.literal(awsElasticBlockStore = awsElasticBlockStore.asInstanceOf[js.Any], azureDisk = azureDisk.asInstanceOf[js.Any], azureFile = azureFile.asInstanceOf[js.Any], cephfs = cephfs.asInstanceOf[js.Any], cinder = cinder.asInstanceOf[js.Any], configMap = configMap.asInstanceOf[js.Any], csi = csi.asInstanceOf[js.Any], downwardAPI = downwardAPI.asInstanceOf[js.Any], emptyDir = emptyDir.asInstanceOf[js.Any], ephemeral = ephemeral.asInstanceOf[js.Any], fc = fc.asInstanceOf[js.Any], flexVolume = flexVolume.asInstanceOf[js.Any], flocker = flocker.asInstanceOf[js.Any], gcePersistentDisk = gcePersistentDisk.asInstanceOf[js.Any], gitRepo = gitRepo.asInstanceOf[js.Any], glusterfs = glusterfs.asInstanceOf[js.Any], hostPath = hostPath.asInstanceOf[js.Any], iscsi = iscsi.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nfs = nfs.asInstanceOf[js.Any], persistentVolumeClaim = persistentVolumeClaim.asInstanceOf[js.Any], photonPersistentDisk = photonPersistentDisk.asInstanceOf[js.Any], portworxVolume = portworxVolume.asInstanceOf[js.Any], projected = projected.asInstanceOf[js.Any], quobyte = quobyte.asInstanceOf[js.Any], rbd = rbd.asInstanceOf[js.Any], scaleIO = scaleIO.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any], storageos = storageos.asInstanceOf[js.Any], vsphereVolume = vsphereVolume.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumePatch]
  }
  
  extension [Self <: VolumePatch](x: Self) {
    
    inline def setAwsElasticBlockStore(value: AWSElasticBlockStoreVolumeSourcePatch): Self = StObject.set(x, "awsElasticBlockStore", value.asInstanceOf[js.Any])
    
    inline def setAzureDisk(value: AzureDiskVolumeSourcePatch): Self = StObject.set(x, "azureDisk", value.asInstanceOf[js.Any])
    
    inline def setAzureFile(value: AzureFileVolumeSourcePatch): Self = StObject.set(x, "azureFile", value.asInstanceOf[js.Any])
    
    inline def setCephfs(value: CephFSVolumeSourcePatch): Self = StObject.set(x, "cephfs", value.asInstanceOf[js.Any])
    
    inline def setCinder(value: CinderVolumeSourcePatch): Self = StObject.set(x, "cinder", value.asInstanceOf[js.Any])
    
    inline def setConfigMap(value: ConfigMapVolumeSourcePatch): Self = StObject.set(x, "configMap", value.asInstanceOf[js.Any])
    
    inline def setCsi(value: CSIVolumeSourcePatch): Self = StObject.set(x, "csi", value.asInstanceOf[js.Any])
    
    inline def setDownwardAPI(value: DownwardAPIVolumeSourcePatch): Self = StObject.set(x, "downwardAPI", value.asInstanceOf[js.Any])
    
    inline def setEmptyDir(value: EmptyDirVolumeSourcePatch): Self = StObject.set(x, "emptyDir", value.asInstanceOf[js.Any])
    
    inline def setEphemeral(value: EphemeralVolumeSourcePatch): Self = StObject.set(x, "ephemeral", value.asInstanceOf[js.Any])
    
    inline def setFc(value: FCVolumeSourcePatch): Self = StObject.set(x, "fc", value.asInstanceOf[js.Any])
    
    inline def setFlexVolume(value: FlexVolumeSourcePatch): Self = StObject.set(x, "flexVolume", value.asInstanceOf[js.Any])
    
    inline def setFlocker(value: FlockerVolumeSourcePatch): Self = StObject.set(x, "flocker", value.asInstanceOf[js.Any])
    
    inline def setGcePersistentDisk(value: GCEPersistentDiskVolumeSourcePatch): Self = StObject.set(x, "gcePersistentDisk", value.asInstanceOf[js.Any])
    
    inline def setGitRepo(value: GitRepoVolumeSourcePatch): Self = StObject.set(x, "gitRepo", value.asInstanceOf[js.Any])
    
    inline def setGlusterfs(value: GlusterfsVolumeSourcePatch): Self = StObject.set(x, "glusterfs", value.asInstanceOf[js.Any])
    
    inline def setHostPath(value: HostPathVolumeSourcePatch): Self = StObject.set(x, "hostPath", value.asInstanceOf[js.Any])
    
    inline def setIscsi(value: ISCSIVolumeSourcePatch): Self = StObject.set(x, "iscsi", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNfs(value: NFSVolumeSourcePatch): Self = StObject.set(x, "nfs", value.asInstanceOf[js.Any])
    
    inline def setPersistentVolumeClaim(value: PersistentVolumeClaimVolumeSourcePatch): Self = StObject.set(x, "persistentVolumeClaim", value.asInstanceOf[js.Any])
    
    inline def setPhotonPersistentDisk(value: PhotonPersistentDiskVolumeSourcePatch): Self = StObject.set(x, "photonPersistentDisk", value.asInstanceOf[js.Any])
    
    inline def setPortworxVolume(value: PortworxVolumeSourcePatch): Self = StObject.set(x, "portworxVolume", value.asInstanceOf[js.Any])
    
    inline def setProjected(value: ProjectedVolumeSourcePatch): Self = StObject.set(x, "projected", value.asInstanceOf[js.Any])
    
    inline def setQuobyte(value: QuobyteVolumeSourcePatch): Self = StObject.set(x, "quobyte", value.asInstanceOf[js.Any])
    
    inline def setRbd(value: RBDVolumeSourcePatch): Self = StObject.set(x, "rbd", value.asInstanceOf[js.Any])
    
    inline def setScaleIO(value: ScaleIOVolumeSourcePatch): Self = StObject.set(x, "scaleIO", value.asInstanceOf[js.Any])
    
    inline def setSecret(value: SecretVolumeSourcePatch): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    inline def setStorageos(value: StorageOSVolumeSourcePatch): Self = StObject.set(x, "storageos", value.asInstanceOf[js.Any])
    
    inline def setVsphereVolume(value: VsphereVirtualDiskVolumeSourcePatch): Self = StObject.set(x, "vsphereVolume", value.asInstanceOf[js.Any])
  }
}
