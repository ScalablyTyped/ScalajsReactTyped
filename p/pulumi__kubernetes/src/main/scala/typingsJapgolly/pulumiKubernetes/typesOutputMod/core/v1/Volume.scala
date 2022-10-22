package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Volume represents a named volume in a pod that may be accessed by any container in the pod.
  */
trait Volume extends StObject {
  
  /**
    * awsElasticBlockStore represents an AWS Disk resource that is attached to a kubelet's host machine and then exposed to the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
    */
  var awsElasticBlockStore: AWSElasticBlockStoreVolumeSource
  
  /**
    * azureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.
    */
  var azureDisk: AzureDiskVolumeSource
  
  /**
    * azureFile represents an Azure File Service mount on the host and bind mount to the pod.
    */
  var azureFile: AzureFileVolumeSource
  
  /**
    * cephFS represents a Ceph FS mount on the host that shares a pod's lifetime
    */
  var cephfs: CephFSVolumeSource
  
  /**
    * cinder represents a cinder volume attached and mounted on kubelets host machine. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
    */
  var cinder: CinderVolumeSource
  
  /**
    * configMap represents a configMap that should populate this volume
    */
  var configMap: ConfigMapVolumeSource
  
  /**
    * csi (Container Storage Interface) represents ephemeral storage that is handled by certain external CSI drivers (Beta feature).
    */
  var csi: CSIVolumeSource
  
  /**
    * downwardAPI represents downward API about the pod that should populate this volume
    */
  var downwardAPI: DownwardAPIVolumeSource
  
  /**
    * emptyDir represents a temporary directory that shares a pod's lifetime. More info: https://kubernetes.io/docs/concepts/storage/volumes#emptydir
    */
  var emptyDir: EmptyDirVolumeSource
  
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
  var ephemeral: EphemeralVolumeSource
  
  /**
    * fc represents a Fibre Channel resource that is attached to a kubelet's host machine and then exposed to the pod.
    */
  var fc: FCVolumeSource
  
  /**
    * flexVolume represents a generic volume resource that is provisioned/attached using an exec based plugin.
    */
  var flexVolume: FlexVolumeSource
  
  /**
    * flocker represents a Flocker volume attached to a kubelet's host machine. This depends on the Flocker control service being running
    */
  var flocker: FlockerVolumeSource
  
  /**
    * gcePersistentDisk represents a GCE Disk resource that is attached to a kubelet's host machine and then exposed to the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
    */
  var gcePersistentDisk: GCEPersistentDiskVolumeSource
  
  /**
    * gitRepo represents a git repository at a particular revision. DEPRECATED: GitRepo is deprecated. To provision a container with a git repo, mount an EmptyDir into an InitContainer that clones the repo using git, then mount the EmptyDir into the Pod's container.
    */
  var gitRepo: GitRepoVolumeSource
  
  /**
    * glusterfs represents a Glusterfs mount on the host that shares a pod's lifetime. More info: https://examples.k8s.io/volumes/glusterfs/README.md
    */
  var glusterfs: GlusterfsVolumeSource
  
  /**
    * hostPath represents a pre-existing file or directory on the host machine that is directly exposed to the container. This is generally used for system agents or other privileged things that are allowed to see the host machine. Most containers will NOT need this. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath
    */
  var hostPath: HostPathVolumeSource
  
  /**
    * iscsi represents an ISCSI Disk resource that is attached to a kubelet's host machine and then exposed to the pod. More info: https://examples.k8s.io/volumes/iscsi/README.md
    */
  var iscsi: ISCSIVolumeSource
  
  /**
    * name of the volume. Must be a DNS_LABEL and unique within the pod. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
    */
  var name: String
  
  /**
    * nfs represents an NFS mount on the host that shares a pod's lifetime More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
    */
  var nfs: NFSVolumeSource
  
  /**
    * persistentVolumeClaimVolumeSource represents a reference to a PersistentVolumeClaim in the same namespace. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
    */
  var persistentVolumeClaim: PersistentVolumeClaimVolumeSource
  
  /**
    * photonPersistentDisk represents a PhotonController persistent disk attached and mounted on kubelets host machine
    */
  var photonPersistentDisk: PhotonPersistentDiskVolumeSource
  
  /**
    * portworxVolume represents a portworx volume attached and mounted on kubelets host machine
    */
  var portworxVolume: PortworxVolumeSource
  
  /**
    * projected items for all in one resources secrets, configmaps, and downward API
    */
  var projected: ProjectedVolumeSource
  
  /**
    * quobyte represents a Quobyte mount on the host that shares a pod's lifetime
    */
  var quobyte: QuobyteVolumeSource
  
  /**
    * rbd represents a Rados Block Device mount on the host that shares a pod's lifetime. More info: https://examples.k8s.io/volumes/rbd/README.md
    */
  var rbd: RBDVolumeSource
  
  /**
    * scaleIO represents a ScaleIO persistent volume attached and mounted on Kubernetes nodes.
    */
  var scaleIO: ScaleIOVolumeSource
  
  /**
    * secret represents a secret that should populate this volume. More info: https://kubernetes.io/docs/concepts/storage/volumes#secret
    */
  var secret: SecretVolumeSource
  
  /**
    * storageOS represents a StorageOS volume attached and mounted on Kubernetes nodes.
    */
  var storageos: StorageOSVolumeSource
  
  /**
    * vsphereVolume represents a vSphere volume attached and mounted on kubelets host machine
    */
  var vsphereVolume: VsphereVirtualDiskVolumeSource
}
object Volume {
  
  inline def apply(
    awsElasticBlockStore: AWSElasticBlockStoreVolumeSource,
    azureDisk: AzureDiskVolumeSource,
    azureFile: AzureFileVolumeSource,
    cephfs: CephFSVolumeSource,
    cinder: CinderVolumeSource,
    configMap: ConfigMapVolumeSource,
    csi: CSIVolumeSource,
    downwardAPI: DownwardAPIVolumeSource,
    emptyDir: EmptyDirVolumeSource,
    ephemeral: EphemeralVolumeSource,
    fc: FCVolumeSource,
    flexVolume: FlexVolumeSource,
    flocker: FlockerVolumeSource,
    gcePersistentDisk: GCEPersistentDiskVolumeSource,
    gitRepo: GitRepoVolumeSource,
    glusterfs: GlusterfsVolumeSource,
    hostPath: HostPathVolumeSource,
    iscsi: ISCSIVolumeSource,
    name: String,
    nfs: NFSVolumeSource,
    persistentVolumeClaim: PersistentVolumeClaimVolumeSource,
    photonPersistentDisk: PhotonPersistentDiskVolumeSource,
    portworxVolume: PortworxVolumeSource,
    projected: ProjectedVolumeSource,
    quobyte: QuobyteVolumeSource,
    rbd: RBDVolumeSource,
    scaleIO: ScaleIOVolumeSource,
    secret: SecretVolumeSource,
    storageos: StorageOSVolumeSource,
    vsphereVolume: VsphereVirtualDiskVolumeSource
  ): Volume = {
    val __obj = js.Dynamic.literal(awsElasticBlockStore = awsElasticBlockStore.asInstanceOf[js.Any], azureDisk = azureDisk.asInstanceOf[js.Any], azureFile = azureFile.asInstanceOf[js.Any], cephfs = cephfs.asInstanceOf[js.Any], cinder = cinder.asInstanceOf[js.Any], configMap = configMap.asInstanceOf[js.Any], csi = csi.asInstanceOf[js.Any], downwardAPI = downwardAPI.asInstanceOf[js.Any], emptyDir = emptyDir.asInstanceOf[js.Any], ephemeral = ephemeral.asInstanceOf[js.Any], fc = fc.asInstanceOf[js.Any], flexVolume = flexVolume.asInstanceOf[js.Any], flocker = flocker.asInstanceOf[js.Any], gcePersistentDisk = gcePersistentDisk.asInstanceOf[js.Any], gitRepo = gitRepo.asInstanceOf[js.Any], glusterfs = glusterfs.asInstanceOf[js.Any], hostPath = hostPath.asInstanceOf[js.Any], iscsi = iscsi.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nfs = nfs.asInstanceOf[js.Any], persistentVolumeClaim = persistentVolumeClaim.asInstanceOf[js.Any], photonPersistentDisk = photonPersistentDisk.asInstanceOf[js.Any], portworxVolume = portworxVolume.asInstanceOf[js.Any], projected = projected.asInstanceOf[js.Any], quobyte = quobyte.asInstanceOf[js.Any], rbd = rbd.asInstanceOf[js.Any], scaleIO = scaleIO.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any], storageos = storageos.asInstanceOf[js.Any], vsphereVolume = vsphereVolume.asInstanceOf[js.Any])
    __obj.asInstanceOf[Volume]
  }
  
  extension [Self <: Volume](x: Self) {
    
    inline def setAwsElasticBlockStore(value: AWSElasticBlockStoreVolumeSource): Self = StObject.set(x, "awsElasticBlockStore", value.asInstanceOf[js.Any])
    
    inline def setAzureDisk(value: AzureDiskVolumeSource): Self = StObject.set(x, "azureDisk", value.asInstanceOf[js.Any])
    
    inline def setAzureFile(value: AzureFileVolumeSource): Self = StObject.set(x, "azureFile", value.asInstanceOf[js.Any])
    
    inline def setCephfs(value: CephFSVolumeSource): Self = StObject.set(x, "cephfs", value.asInstanceOf[js.Any])
    
    inline def setCinder(value: CinderVolumeSource): Self = StObject.set(x, "cinder", value.asInstanceOf[js.Any])
    
    inline def setConfigMap(value: ConfigMapVolumeSource): Self = StObject.set(x, "configMap", value.asInstanceOf[js.Any])
    
    inline def setCsi(value: CSIVolumeSource): Self = StObject.set(x, "csi", value.asInstanceOf[js.Any])
    
    inline def setDownwardAPI(value: DownwardAPIVolumeSource): Self = StObject.set(x, "downwardAPI", value.asInstanceOf[js.Any])
    
    inline def setEmptyDir(value: EmptyDirVolumeSource): Self = StObject.set(x, "emptyDir", value.asInstanceOf[js.Any])
    
    inline def setEphemeral(value: EphemeralVolumeSource): Self = StObject.set(x, "ephemeral", value.asInstanceOf[js.Any])
    
    inline def setFc(value: FCVolumeSource): Self = StObject.set(x, "fc", value.asInstanceOf[js.Any])
    
    inline def setFlexVolume(value: FlexVolumeSource): Self = StObject.set(x, "flexVolume", value.asInstanceOf[js.Any])
    
    inline def setFlocker(value: FlockerVolumeSource): Self = StObject.set(x, "flocker", value.asInstanceOf[js.Any])
    
    inline def setGcePersistentDisk(value: GCEPersistentDiskVolumeSource): Self = StObject.set(x, "gcePersistentDisk", value.asInstanceOf[js.Any])
    
    inline def setGitRepo(value: GitRepoVolumeSource): Self = StObject.set(x, "gitRepo", value.asInstanceOf[js.Any])
    
    inline def setGlusterfs(value: GlusterfsVolumeSource): Self = StObject.set(x, "glusterfs", value.asInstanceOf[js.Any])
    
    inline def setHostPath(value: HostPathVolumeSource): Self = StObject.set(x, "hostPath", value.asInstanceOf[js.Any])
    
    inline def setIscsi(value: ISCSIVolumeSource): Self = StObject.set(x, "iscsi", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNfs(value: NFSVolumeSource): Self = StObject.set(x, "nfs", value.asInstanceOf[js.Any])
    
    inline def setPersistentVolumeClaim(value: PersistentVolumeClaimVolumeSource): Self = StObject.set(x, "persistentVolumeClaim", value.asInstanceOf[js.Any])
    
    inline def setPhotonPersistentDisk(value: PhotonPersistentDiskVolumeSource): Self = StObject.set(x, "photonPersistentDisk", value.asInstanceOf[js.Any])
    
    inline def setPortworxVolume(value: PortworxVolumeSource): Self = StObject.set(x, "portworxVolume", value.asInstanceOf[js.Any])
    
    inline def setProjected(value: ProjectedVolumeSource): Self = StObject.set(x, "projected", value.asInstanceOf[js.Any])
    
    inline def setQuobyte(value: QuobyteVolumeSource): Self = StObject.set(x, "quobyte", value.asInstanceOf[js.Any])
    
    inline def setRbd(value: RBDVolumeSource): Self = StObject.set(x, "rbd", value.asInstanceOf[js.Any])
    
    inline def setScaleIO(value: ScaleIOVolumeSource): Self = StObject.set(x, "scaleIO", value.asInstanceOf[js.Any])
    
    inline def setSecret(value: SecretVolumeSource): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    inline def setStorageos(value: StorageOSVolumeSource): Self = StObject.set(x, "storageos", value.asInstanceOf[js.Any])
    
    inline def setVsphereVolume(value: VsphereVirtualDiskVolumeSource): Self = StObject.set(x, "vsphereVolume", value.asInstanceOf[js.Any])
  }
}
