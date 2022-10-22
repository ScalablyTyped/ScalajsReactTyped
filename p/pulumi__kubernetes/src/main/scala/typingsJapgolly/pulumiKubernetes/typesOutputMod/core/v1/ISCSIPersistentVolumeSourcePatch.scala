package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ISCSIPersistentVolumeSource represents an ISCSI disk. ISCSI volumes can only be mounted as read/write once. ISCSI volumes support ownership management and SELinux relabeling.
  */
trait ISCSIPersistentVolumeSourcePatch extends StObject {
  
  /**
    * chapAuthDiscovery defines whether support iSCSI Discovery CHAP authentication
    */
  var chapAuthDiscovery: Boolean
  
  /**
    * chapAuthSession defines whether support iSCSI Session CHAP authentication
    */
  var chapAuthSession: Boolean
  
  /**
    * fsType is the filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#iscsi
    */
  var fsType: String
  
  /**
    * initiatorName is the custom iSCSI Initiator Name. If initiatorName is specified with iscsiInterface simultaneously, new iSCSI interface <target portal>:<volume name> will be created for the connection.
    */
  var initiatorName: String
  
  /**
    * iqn is Target iSCSI Qualified Name.
    */
  var iqn: String
  
  /**
    * iscsiInterface is the interface Name that uses an iSCSI transport. Defaults to 'default' (tcp).
    */
  var iscsiInterface: String
  
  /**
    * lun is iSCSI Target Lun number.
    */
  var lun: Double
  
  /**
    * portals is the iSCSI Target Portal List. The Portal is either an IP or ip_addr:port if the port is other than default (typically TCP ports 860 and 3260).
    */
  var portals: js.Array[String]
  
  /**
    * readOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false.
    */
  var readOnly: Boolean
  
  /**
    * secretRef is the CHAP Secret for iSCSI target and initiator authentication
    */
  var secretRef: SecretReferencePatch
  
  /**
    * targetPortal is iSCSI Target Portal. The Portal is either an IP or ip_addr:port if the port is other than default (typically TCP ports 860 and 3260).
    */
  var targetPortal: String
}
object ISCSIPersistentVolumeSourcePatch {
  
  inline def apply(
    chapAuthDiscovery: Boolean,
    chapAuthSession: Boolean,
    fsType: String,
    initiatorName: String,
    iqn: String,
    iscsiInterface: String,
    lun: Double,
    portals: js.Array[String],
    readOnly: Boolean,
    secretRef: SecretReferencePatch,
    targetPortal: String
  ): ISCSIPersistentVolumeSourcePatch = {
    val __obj = js.Dynamic.literal(chapAuthDiscovery = chapAuthDiscovery.asInstanceOf[js.Any], chapAuthSession = chapAuthSession.asInstanceOf[js.Any], fsType = fsType.asInstanceOf[js.Any], initiatorName = initiatorName.asInstanceOf[js.Any], iqn = iqn.asInstanceOf[js.Any], iscsiInterface = iscsiInterface.asInstanceOf[js.Any], lun = lun.asInstanceOf[js.Any], portals = portals.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], secretRef = secretRef.asInstanceOf[js.Any], targetPortal = targetPortal.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISCSIPersistentVolumeSourcePatch]
  }
  
  extension [Self <: ISCSIPersistentVolumeSourcePatch](x: Self) {
    
    inline def setChapAuthDiscovery(value: Boolean): Self = StObject.set(x, "chapAuthDiscovery", value.asInstanceOf[js.Any])
    
    inline def setChapAuthSession(value: Boolean): Self = StObject.set(x, "chapAuthSession", value.asInstanceOf[js.Any])
    
    inline def setFsType(value: String): Self = StObject.set(x, "fsType", value.asInstanceOf[js.Any])
    
    inline def setInitiatorName(value: String): Self = StObject.set(x, "initiatorName", value.asInstanceOf[js.Any])
    
    inline def setIqn(value: String): Self = StObject.set(x, "iqn", value.asInstanceOf[js.Any])
    
    inline def setIscsiInterface(value: String): Self = StObject.set(x, "iscsiInterface", value.asInstanceOf[js.Any])
    
    inline def setLun(value: Double): Self = StObject.set(x, "lun", value.asInstanceOf[js.Any])
    
    inline def setPortals(value: js.Array[String]): Self = StObject.set(x, "portals", value.asInstanceOf[js.Any])
    
    inline def setPortalsVarargs(value: String*): Self = StObject.set(x, "portals", js.Array(value*))
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setSecretRef(value: SecretReferencePatch): Self = StObject.set(x, "secretRef", value.asInstanceOf[js.Any])
    
    inline def setTargetPortal(value: String): Self = StObject.set(x, "targetPortal", value.asInstanceOf[js.Any])
  }
}
