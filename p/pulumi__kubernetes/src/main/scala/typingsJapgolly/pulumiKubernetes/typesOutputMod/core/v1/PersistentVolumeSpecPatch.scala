package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PersistentVolumeSpec is the specification of a persistent volume.
  */
trait PersistentVolumeSpecPatch extends StObject {
  
  /**
    * accessModes contains all ways the volume can be mounted. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes
    */
  var accessModes: js.Array[String]
  
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
  var azureFile: AzureFilePersistentVolumeSourcePatch
  
  /**
    * capacity is the description of the persistent volume's resources and capacity. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#capacity
    */
  var capacity: StringDictionary[String]
  
  /**
    * cephFS represents a Ceph FS mount on the host that shares a pod's lifetime
    */
  var cephfs: CephFSPersistentVolumeSourcePatch
  
  /**
    * cinder represents a cinder volume attached and mounted on kubelets host machine. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
    */
  var cinder: CinderPersistentVolumeSourcePatch
  
  /**
    * claimRef is part of a bi-directional binding between PersistentVolume and PersistentVolumeClaim. Expected to be non-nil when bound. claim.VolumeName is the authoritative bind between PV and PVC. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#binding
    */
  var claimRef: ObjectReferencePatch
  
  /**
    * csi represents storage that is handled by an external CSI driver (Beta feature).
    */
  var csi: CSIPersistentVolumeSourcePatch
  
  /**
    * fc represents a Fibre Channel resource that is attached to a kubelet's host machine and then exposed to the pod.
    */
  var fc: FCVolumeSourcePatch
  
  /**
    * flexVolume represents a generic volume resource that is provisioned/attached using an exec based plugin.
    */
  var flexVolume: FlexPersistentVolumeSourcePatch
  
  /**
    * flocker represents a Flocker volume attached to a kubelet's host machine and exposed to the pod for its usage. This depends on the Flocker control service being running
    */
  var flocker: FlockerVolumeSourcePatch
  
  /**
    * gcePersistentDisk represents a GCE Disk resource that is attached to a kubelet's host machine and then exposed to the pod. Provisioned by an admin. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
    */
  var gcePersistentDisk: GCEPersistentDiskVolumeSourcePatch
  
  /**
    * glusterfs represents a Glusterfs volume that is attached to a host and exposed to the pod. Provisioned by an admin. More info: https://examples.k8s.io/volumes/glusterfs/README.md
    */
  var glusterfs: GlusterfsPersistentVolumeSourcePatch
  
  /**
    * hostPath represents a directory on the host. Provisioned by a developer or tester. This is useful for single-node development and testing only! On-host storage is not supported in any way and WILL NOT WORK in a multi-node cluster. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath
    */
  var hostPath: HostPathVolumeSourcePatch
  
  /**
    * iscsi represents an ISCSI Disk resource that is attached to a kubelet's host machine and then exposed to the pod. Provisioned by an admin.
    */
  var iscsi: ISCSIPersistentVolumeSourcePatch
  
  /**
    * local represents directly-attached storage with node affinity
    */
  var local: LocalVolumeSourcePatch
  
  /**
    * mountOptions is the list of mount options, e.g. ["ro", "soft"]. Not validated - mount will simply fail if one is invalid. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes/#mount-options
    */
  var mountOptions: js.Array[String]
  
  /**
    * nfs represents an NFS mount on the host. Provisioned by an admin. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
    */
  var nfs: NFSVolumeSourcePatch
  
  /**
    * nodeAffinity defines constraints that limit what nodes this volume can be accessed from. This field influences the scheduling of pods that use this volume.
    */
  var nodeAffinity: VolumeNodeAffinityPatch
  
  /**
    * persistentVolumeReclaimPolicy defines what happens to a persistent volume when released from its claim. Valid options are Retain (default for manually created PersistentVolumes), Delete (default for dynamically provisioned PersistentVolumes), and Recycle (deprecated). Recycle must be supported by the volume plugin underlying this PersistentVolume. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#reclaiming
    */
  var persistentVolumeReclaimPolicy: String
  
  /**
    * photonPersistentDisk represents a PhotonController persistent disk attached and mounted on kubelets host machine
    */
  var photonPersistentDisk: PhotonPersistentDiskVolumeSourcePatch
  
  /**
    * portworxVolume represents a portworx volume attached and mounted on kubelets host machine
    */
  var portworxVolume: PortworxVolumeSourcePatch
  
  /**
    * quobyte represents a Quobyte mount on the host that shares a pod's lifetime
    */
  var quobyte: QuobyteVolumeSourcePatch
  
  /**
    * rbd represents a Rados Block Device mount on the host that shares a pod's lifetime. More info: https://examples.k8s.io/volumes/rbd/README.md
    */
  var rbd: RBDPersistentVolumeSourcePatch
  
  /**
    * scaleIO represents a ScaleIO persistent volume attached and mounted on Kubernetes nodes.
    */
  var scaleIO: ScaleIOPersistentVolumeSourcePatch
  
  /**
    * storageClassName is the name of StorageClass to which this persistent volume belongs. Empty value means that this volume does not belong to any StorageClass.
    */
  var storageClassName: String
  
  /**
    * storageOS represents a StorageOS volume that is attached to the kubelet's host machine and mounted into the pod More info: https://examples.k8s.io/volumes/storageos/README.md
    */
  var storageos: StorageOSPersistentVolumeSourcePatch
  
  /**
    * volumeMode defines if a volume is intended to be used with a formatted filesystem or to remain in raw block state. Value of Filesystem is implied when not included in spec.
    */
  var volumeMode: String
  
  /**
    * vsphereVolume represents a vSphere volume attached and mounted on kubelets host machine
    */
  var vsphereVolume: VsphereVirtualDiskVolumeSourcePatch
}
object PersistentVolumeSpecPatch {
  
  inline def apply(
    accessModes: js.Array[String],
    awsElasticBlockStore: AWSElasticBlockStoreVolumeSourcePatch,
    azureDisk: AzureDiskVolumeSourcePatch,
    azureFile: AzureFilePersistentVolumeSourcePatch,
    capacity: StringDictionary[String],
    cephfs: CephFSPersistentVolumeSourcePatch,
    cinder: CinderPersistentVolumeSourcePatch,
    claimRef: ObjectReferencePatch,
    csi: CSIPersistentVolumeSourcePatch,
    fc: FCVolumeSourcePatch,
    flexVolume: FlexPersistentVolumeSourcePatch,
    flocker: FlockerVolumeSourcePatch,
    gcePersistentDisk: GCEPersistentDiskVolumeSourcePatch,
    glusterfs: GlusterfsPersistentVolumeSourcePatch,
    hostPath: HostPathVolumeSourcePatch,
    iscsi: ISCSIPersistentVolumeSourcePatch,
    local: LocalVolumeSourcePatch,
    mountOptions: js.Array[String],
    nfs: NFSVolumeSourcePatch,
    nodeAffinity: VolumeNodeAffinityPatch,
    persistentVolumeReclaimPolicy: String,
    photonPersistentDisk: PhotonPersistentDiskVolumeSourcePatch,
    portworxVolume: PortworxVolumeSourcePatch,
    quobyte: QuobyteVolumeSourcePatch,
    rbd: RBDPersistentVolumeSourcePatch,
    scaleIO: ScaleIOPersistentVolumeSourcePatch,
    storageClassName: String,
    storageos: StorageOSPersistentVolumeSourcePatch,
    volumeMode: String,
    vsphereVolume: VsphereVirtualDiskVolumeSourcePatch
  ): PersistentVolumeSpecPatch = {
    val __obj = js.Dynamic.literal(accessModes = accessModes.asInstanceOf[js.Any], awsElasticBlockStore = awsElasticBlockStore.asInstanceOf[js.Any], azureDisk = azureDisk.asInstanceOf[js.Any], azureFile = azureFile.asInstanceOf[js.Any], capacity = capacity.asInstanceOf[js.Any], cephfs = cephfs.asInstanceOf[js.Any], cinder = cinder.asInstanceOf[js.Any], claimRef = claimRef.asInstanceOf[js.Any], csi = csi.asInstanceOf[js.Any], fc = fc.asInstanceOf[js.Any], flexVolume = flexVolume.asInstanceOf[js.Any], flocker = flocker.asInstanceOf[js.Any], gcePersistentDisk = gcePersistentDisk.asInstanceOf[js.Any], glusterfs = glusterfs.asInstanceOf[js.Any], hostPath = hostPath.asInstanceOf[js.Any], iscsi = iscsi.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], mountOptions = mountOptions.asInstanceOf[js.Any], nfs = nfs.asInstanceOf[js.Any], nodeAffinity = nodeAffinity.asInstanceOf[js.Any], persistentVolumeReclaimPolicy = persistentVolumeReclaimPolicy.asInstanceOf[js.Any], photonPersistentDisk = photonPersistentDisk.asInstanceOf[js.Any], portworxVolume = portworxVolume.asInstanceOf[js.Any], quobyte = quobyte.asInstanceOf[js.Any], rbd = rbd.asInstanceOf[js.Any], scaleIO = scaleIO.asInstanceOf[js.Any], storageClassName = storageClassName.asInstanceOf[js.Any], storageos = storageos.asInstanceOf[js.Any], volumeMode = volumeMode.asInstanceOf[js.Any], vsphereVolume = vsphereVolume.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersistentVolumeSpecPatch]
  }
  
  extension [Self <: PersistentVolumeSpecPatch](x: Self) {
    
    inline def setAccessModes(value: js.Array[String]): Self = StObject.set(x, "accessModes", value.asInstanceOf[js.Any])
    
    inline def setAccessModesVarargs(value: String*): Self = StObject.set(x, "accessModes", js.Array(value*))
    
    inline def setAwsElasticBlockStore(value: AWSElasticBlockStoreVolumeSourcePatch): Self = StObject.set(x, "awsElasticBlockStore", value.asInstanceOf[js.Any])
    
    inline def setAzureDisk(value: AzureDiskVolumeSourcePatch): Self = StObject.set(x, "azureDisk", value.asInstanceOf[js.Any])
    
    inline def setAzureFile(value: AzureFilePersistentVolumeSourcePatch): Self = StObject.set(x, "azureFile", value.asInstanceOf[js.Any])
    
    inline def setCapacity(value: StringDictionary[String]): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
    
    inline def setCephfs(value: CephFSPersistentVolumeSourcePatch): Self = StObject.set(x, "cephfs", value.asInstanceOf[js.Any])
    
    inline def setCinder(value: CinderPersistentVolumeSourcePatch): Self = StObject.set(x, "cinder", value.asInstanceOf[js.Any])
    
    inline def setClaimRef(value: ObjectReferencePatch): Self = StObject.set(x, "claimRef", value.asInstanceOf[js.Any])
    
    inline def setCsi(value: CSIPersistentVolumeSourcePatch): Self = StObject.set(x, "csi", value.asInstanceOf[js.Any])
    
    inline def setFc(value: FCVolumeSourcePatch): Self = StObject.set(x, "fc", value.asInstanceOf[js.Any])
    
    inline def setFlexVolume(value: FlexPersistentVolumeSourcePatch): Self = StObject.set(x, "flexVolume", value.asInstanceOf[js.Any])
    
    inline def setFlocker(value: FlockerVolumeSourcePatch): Self = StObject.set(x, "flocker", value.asInstanceOf[js.Any])
    
    inline def setGcePersistentDisk(value: GCEPersistentDiskVolumeSourcePatch): Self = StObject.set(x, "gcePersistentDisk", value.asInstanceOf[js.Any])
    
    inline def setGlusterfs(value: GlusterfsPersistentVolumeSourcePatch): Self = StObject.set(x, "glusterfs", value.asInstanceOf[js.Any])
    
    inline def setHostPath(value: HostPathVolumeSourcePatch): Self = StObject.set(x, "hostPath", value.asInstanceOf[js.Any])
    
    inline def setIscsi(value: ISCSIPersistentVolumeSourcePatch): Self = StObject.set(x, "iscsi", value.asInstanceOf[js.Any])
    
    inline def setLocal(value: LocalVolumeSourcePatch): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    inline def setMountOptions(value: js.Array[String]): Self = StObject.set(x, "mountOptions", value.asInstanceOf[js.Any])
    
    inline def setMountOptionsVarargs(value: String*): Self = StObject.set(x, "mountOptions", js.Array(value*))
    
    inline def setNfs(value: NFSVolumeSourcePatch): Self = StObject.set(x, "nfs", value.asInstanceOf[js.Any])
    
    inline def setNodeAffinity(value: VolumeNodeAffinityPatch): Self = StObject.set(x, "nodeAffinity", value.asInstanceOf[js.Any])
    
    inline def setPersistentVolumeReclaimPolicy(value: String): Self = StObject.set(x, "persistentVolumeReclaimPolicy", value.asInstanceOf[js.Any])
    
    inline def setPhotonPersistentDisk(value: PhotonPersistentDiskVolumeSourcePatch): Self = StObject.set(x, "photonPersistentDisk", value.asInstanceOf[js.Any])
    
    inline def setPortworxVolume(value: PortworxVolumeSourcePatch): Self = StObject.set(x, "portworxVolume", value.asInstanceOf[js.Any])
    
    inline def setQuobyte(value: QuobyteVolumeSourcePatch): Self = StObject.set(x, "quobyte", value.asInstanceOf[js.Any])
    
    inline def setRbd(value: RBDPersistentVolumeSourcePatch): Self = StObject.set(x, "rbd", value.asInstanceOf[js.Any])
    
    inline def setScaleIO(value: ScaleIOPersistentVolumeSourcePatch): Self = StObject.set(x, "scaleIO", value.asInstanceOf[js.Any])
    
    inline def setStorageClassName(value: String): Self = StObject.set(x, "storageClassName", value.asInstanceOf[js.Any])
    
    inline def setStorageos(value: StorageOSPersistentVolumeSourcePatch): Self = StObject.set(x, "storageos", value.asInstanceOf[js.Any])
    
    inline def setVolumeMode(value: String): Self = StObject.set(x, "volumeMode", value.asInstanceOf[js.Any])
    
    inline def setVsphereVolume(value: VsphereVirtualDiskVolumeSourcePatch): Self = StObject.set(x, "vsphereVolume", value.asInstanceOf[js.Any])
  }
}
