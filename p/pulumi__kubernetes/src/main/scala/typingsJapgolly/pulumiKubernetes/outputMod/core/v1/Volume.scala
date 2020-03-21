package typingsJapgolly.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Volume represents a named volume in a pod that may be accessed by any container in the pod.
  */
trait Volume extends js.Object {
  /**
    * AWSElasticBlockStore represents an AWS Disk resource that is attached to a kubelet's host
    * machine and then exposed to the pod. More info:
    * https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
    */
  val awsElasticBlockStore: AWSElasticBlockStoreVolumeSource
  /**
    * AzureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.
    */
  val azureDisk: AzureDiskVolumeSource
  /**
    * AzureFile represents an Azure File Service mount on the host and bind mount to the pod.
    */
  val azureFile: AzureFileVolumeSource
  /**
    * CephFS represents a Ceph FS mount on the host that shares a pod's lifetime
    */
  val cephfs: CephFSVolumeSource
  /**
    * Cinder represents a cinder volume attached and mounted on kubelets host machine. More info:
    * https://examples.k8s.io/mysql-cinder-pd/README.md
    */
  val cinder: CinderVolumeSource
  /**
    * ConfigMap represents a configMap that should populate this volume
    */
  val configMap: ConfigMapVolumeSource
  /**
    * CSI (Container Storage Interface) represents storage that is handled by an external CSI
    * driver (Alpha feature).
    */
  val csi: CSIVolumeSource
  /**
    * DownwardAPI represents downward API about the pod that should populate this volume
    */
  val downwardAPI: DownwardAPIVolumeSource
  /**
    * EmptyDir represents a temporary directory that shares a pod's lifetime. More info:
    * https://kubernetes.io/docs/concepts/storage/volumes#emptydir
    */
  val emptyDir: EmptyDirVolumeSource
  /**
    * FC represents a Fibre Channel resource that is attached to a kubelet's host machine and
    * then exposed to the pod.
    */
  val fc: FCVolumeSource
  /**
    * FlexVolume represents a generic volume resource that is provisioned/attached using an exec
    * based plugin.
    */
  val flexVolume: FlexVolumeSource
  /**
    * Flocker represents a Flocker volume attached to a kubelet's host machine. This depends on
    * the Flocker control service being running
    */
  val flocker: FlockerVolumeSource
  /**
    * GCEPersistentDisk represents a GCE Disk resource that is attached to a kubelet's host
    * machine and then exposed to the pod. More info:
    * https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
    */
  val gcePersistentDisk: GCEPersistentDiskVolumeSource
  /**
    * GitRepo represents a git repository at a particular revision. DEPRECATED: GitRepo is
    * deprecated. To provision a container with a git repo, mount an EmptyDir into an
    * InitContainer that clones the repo using git, then mount the EmptyDir into the Pod's
    * container.
    */
  val gitRepo: GitRepoVolumeSource
  /**
    * Glusterfs represents a Glusterfs mount on the host that shares a pod's lifetime. More info:
    * https://examples.k8s.io/volumes/glusterfs/README.md
    */
  val glusterfs: GlusterfsVolumeSource
  /**
    * HostPath represents a pre-existing file or directory on the host machine that is directly
    * exposed to the container. This is generally used for system agents or other privileged
    * things that are allowed to see the host machine. Most containers will NOT need this. More
    * info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath
    */
  val hostPath: HostPathVolumeSource
  /**
    * ISCSI represents an ISCSI Disk resource that is attached to a kubelet's host machine and
    * then exposed to the pod. More info: https://examples.k8s.io/volumes/iscsi/README.md
    */
  val iscsi: ISCSIVolumeSource
  /**
    * Volume's name. Must be a DNS_LABEL and unique within the pod. More info:
    * https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
    */
  val name: String
  /**
    * NFS represents an NFS mount on the host that shares a pod's lifetime More info:
    * https://kubernetes.io/docs/concepts/storage/volumes#nfs
    */
  val nfs: NFSVolumeSource
  /**
    * PersistentVolumeClaimVolumeSource represents a reference to a PersistentVolumeClaim in the
    * same namespace. More info:
    * https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
    */
  val persistentVolumeClaim: PersistentVolumeClaimVolumeSource
  /**
    * PhotonPersistentDisk represents a PhotonController persistent disk attached and mounted on
    * kubelets host machine
    */
  val photonPersistentDisk: PhotonPersistentDiskVolumeSource
  /**
    * PortworxVolume represents a portworx volume attached and mounted on kubelets host machine
    */
  val portworxVolume: PortworxVolumeSource
  /**
    * Items for all in one resources secrets, configmaps, and downward API
    */
  val projected: ProjectedVolumeSource
  /**
    * Quobyte represents a Quobyte mount on the host that shares a pod's lifetime
    */
  val quobyte: QuobyteVolumeSource
  /**
    * RBD represents a Rados Block Device mount on the host that shares a pod's lifetime. More
    * info: https://examples.k8s.io/volumes/rbd/README.md
    */
  val rbd: RBDVolumeSource
  /**
    * ScaleIO represents a ScaleIO persistent volume attached and mounted on Kubernetes nodes.
    */
  val scaleIO: ScaleIOVolumeSource
  /**
    * Secret represents a secret that should populate this volume. More info:
    * https://kubernetes.io/docs/concepts/storage/volumes#secret
    */
  val secret: SecretVolumeSource
  /**
    * StorageOS represents a StorageOS volume attached and mounted on Kubernetes nodes.
    */
  val storageos: StorageOSVolumeSource
  /**
    * VsphereVolume represents a vSphere volume attached and mounted on kubelets host machine
    */
  val vsphereVolume: VsphereVirtualDiskVolumeSource
}

object Volume {
  @scala.inline
  def apply(
    awsElasticBlockStore: AWSElasticBlockStoreVolumeSource,
    azureDisk: AzureDiskVolumeSource,
    azureFile: AzureFileVolumeSource,
    cephfs: CephFSVolumeSource,
    cinder: CinderVolumeSource,
    configMap: ConfigMapVolumeSource,
    csi: CSIVolumeSource,
    downwardAPI: DownwardAPIVolumeSource,
    emptyDir: EmptyDirVolumeSource,
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
    val __obj = js.Dynamic.literal(awsElasticBlockStore = awsElasticBlockStore.asInstanceOf[js.Any], azureDisk = azureDisk.asInstanceOf[js.Any], azureFile = azureFile.asInstanceOf[js.Any], cephfs = cephfs.asInstanceOf[js.Any], cinder = cinder.asInstanceOf[js.Any], configMap = configMap.asInstanceOf[js.Any], csi = csi.asInstanceOf[js.Any], downwardAPI = downwardAPI.asInstanceOf[js.Any], emptyDir = emptyDir.asInstanceOf[js.Any], fc = fc.asInstanceOf[js.Any], flexVolume = flexVolume.asInstanceOf[js.Any], flocker = flocker.asInstanceOf[js.Any], gcePersistentDisk = gcePersistentDisk.asInstanceOf[js.Any], gitRepo = gitRepo.asInstanceOf[js.Any], glusterfs = glusterfs.asInstanceOf[js.Any], hostPath = hostPath.asInstanceOf[js.Any], iscsi = iscsi.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nfs = nfs.asInstanceOf[js.Any], persistentVolumeClaim = persistentVolumeClaim.asInstanceOf[js.Any], photonPersistentDisk = photonPersistentDisk.asInstanceOf[js.Any], portworxVolume = portworxVolume.asInstanceOf[js.Any], projected = projected.asInstanceOf[js.Any], quobyte = quobyte.asInstanceOf[js.Any], rbd = rbd.asInstanceOf[js.Any], scaleIO = scaleIO.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any], storageos = storageos.asInstanceOf[js.Any], vsphereVolume = vsphereVolume.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Volume]
  }
}

