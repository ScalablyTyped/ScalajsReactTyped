package typingsJapgolly.pulumiKubernetes.typesOutputMod.extensions.v1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PodSecurityPolicySpec defines the policy enforced. Deprecated: use PodSecurityPolicySpec from policy API Group instead.
  */
trait PodSecurityPolicySpecPatch extends StObject {
  
  /**
    * allowPrivilegeEscalation determines if a pod can request to allow privilege escalation. If unspecified, defaults to true.
    */
  var allowPrivilegeEscalation: Boolean
  
  /**
    * AllowedCSIDrivers is a whitelist of inline CSI drivers that must be explicitly set to be embedded within a pod spec. An empty value indicates that any CSI driver can be used for inline ephemeral volumes.
    */
  var allowedCSIDrivers: js.Array[AllowedCSIDriverPatch]
  
  /**
    * allowedCapabilities is a list of capabilities that can be requested to add to the container. Capabilities in this field may be added at the pod author's discretion. You must not list a capability in both allowedCapabilities and requiredDropCapabilities.
    */
  var allowedCapabilities: js.Array[String]
  
  /**
    * allowedFlexVolumes is a whitelist of allowed Flexvolumes.  Empty or nil indicates that all Flexvolumes may be used.  This parameter is effective only when the usage of the Flexvolumes is allowed in the "volumes" field.
    */
  var allowedFlexVolumes: js.Array[AllowedFlexVolumePatch]
  
  /**
    * allowedHostPaths is a white list of allowed host paths. Empty indicates that all host paths may be used.
    */
  var allowedHostPaths: js.Array[AllowedHostPathPatch]
  
  /**
    * AllowedProcMountTypes is a whitelist of allowed ProcMountTypes. Empty or nil indicates that only the DefaultProcMountType may be used. This requires the ProcMountType feature flag to be enabled.
    */
  var allowedProcMountTypes: js.Array[String]
  
  /**
    * allowedUnsafeSysctls is a list of explicitly allowed unsafe sysctls, defaults to none. Each entry is either a plain sysctl name or ends in "*" in which case it is considered as a prefix of allowed sysctls. Single * means all unsafe sysctls are allowed. Kubelet has to whitelist all allowed unsafe sysctls explicitly to avoid rejection.
    *
    * Examples: e.g. "foo/ *" allows "foo/bar", "foo/baz", etc. e.g. "foo.*" allows "foo.bar", "foo.baz", etc.
    */
  var allowedUnsafeSysctls: js.Array[String]
  
  /**
    * defaultAddCapabilities is the default set of capabilities that will be added to the container unless the pod spec specifically drops the capability.  You may not list a capability in both defaultAddCapabilities and requiredDropCapabilities. Capabilities added here are implicitly allowed, and need not be included in the allowedCapabilities list.
    */
  var defaultAddCapabilities: js.Array[String]
  
  /**
    * defaultAllowPrivilegeEscalation controls the default setting for whether a process can gain more privileges than its parent process.
    */
  var defaultAllowPrivilegeEscalation: Boolean
  
  /**
    * forbiddenSysctls is a list of explicitly forbidden sysctls, defaults to none. Each entry is either a plain sysctl name or ends in "*" in which case it is considered as a prefix of forbidden sysctls. Single * means all sysctls are forbidden.
    *
    * Examples: e.g. "foo/ *" forbids "foo/bar", "foo/baz", etc. e.g. "foo.*" forbids "foo.bar", "foo.baz", etc.
    */
  var forbiddenSysctls: js.Array[String]
  
  /**
    * fsGroup is the strategy that will dictate what fs group is used by the SecurityContext.
    */
  var fsGroup: FSGroupStrategyOptionsPatch
  
  /**
    * hostIPC determines if the policy allows the use of HostIPC in the pod spec.
    */
  var hostIPC: Boolean
  
  /**
    * hostNetwork determines if the policy allows the use of HostNetwork in the pod spec.
    */
  var hostNetwork: Boolean
  
  /**
    * hostPID determines if the policy allows the use of HostPID in the pod spec.
    */
  var hostPID: Boolean
  
  /**
    * hostPorts determines which host port ranges are allowed to be exposed.
    */
  var hostPorts: js.Array[HostPortRangePatch]
  
  /**
    * privileged determines if a pod can request to be run as privileged.
    */
  var privileged: Boolean
  
  /**
    * readOnlyRootFilesystem when set to true will force containers to run with a read only root file system.  If the container specifically requests to run with a non-read only root file system the PSP should deny the pod. If set to false the container may run with a read only root file system if it wishes but it will not be forced to.
    */
  var readOnlyRootFilesystem: Boolean
  
  /**
    * requiredDropCapabilities are the capabilities that will be dropped from the container.  These are required to be dropped and cannot be added.
    */
  var requiredDropCapabilities: js.Array[String]
  
  /**
    * RunAsGroup is the strategy that will dictate the allowable RunAsGroup values that may be set. If this field is omitted, the pod's RunAsGroup can take any value. This field requires the RunAsGroup feature gate to be enabled.
    */
  var runAsGroup: RunAsGroupStrategyOptionsPatch
  
  /**
    * runAsUser is the strategy that will dictate the allowable RunAsUser values that may be set.
    */
  var runAsUser: RunAsUserStrategyOptionsPatch
  
  /**
    * runtimeClass is the strategy that will dictate the allowable RuntimeClasses for a pod. If this field is omitted, the pod's runtimeClassName field is unrestricted. Enforcement of this field depends on the RuntimeClass feature gate being enabled.
    */
  var runtimeClass: RuntimeClassStrategyOptionsPatch
  
  /**
    * seLinux is the strategy that will dictate the allowable labels that may be set.
    */
  var seLinux: SELinuxStrategyOptionsPatch
  
  /**
    * supplementalGroups is the strategy that will dictate what supplemental groups are used by the SecurityContext.
    */
  var supplementalGroups: SupplementalGroupsStrategyOptionsPatch
  
  /**
    * volumes is a white list of allowed volume plugins. Empty indicates that no volumes may be used. To allow all volumes you may use '*'.
    */
  var volumes: js.Array[String]
}
object PodSecurityPolicySpecPatch {
  
  inline def apply(
    allowPrivilegeEscalation: Boolean,
    allowedCSIDrivers: js.Array[AllowedCSIDriverPatch],
    allowedCapabilities: js.Array[String],
    allowedFlexVolumes: js.Array[AllowedFlexVolumePatch],
    allowedHostPaths: js.Array[AllowedHostPathPatch],
    allowedProcMountTypes: js.Array[String],
    allowedUnsafeSysctls: js.Array[String],
    defaultAddCapabilities: js.Array[String],
    defaultAllowPrivilegeEscalation: Boolean,
    forbiddenSysctls: js.Array[String],
    fsGroup: FSGroupStrategyOptionsPatch,
    hostIPC: Boolean,
    hostNetwork: Boolean,
    hostPID: Boolean,
    hostPorts: js.Array[HostPortRangePatch],
    privileged: Boolean,
    readOnlyRootFilesystem: Boolean,
    requiredDropCapabilities: js.Array[String],
    runAsGroup: RunAsGroupStrategyOptionsPatch,
    runAsUser: RunAsUserStrategyOptionsPatch,
    runtimeClass: RuntimeClassStrategyOptionsPatch,
    seLinux: SELinuxStrategyOptionsPatch,
    supplementalGroups: SupplementalGroupsStrategyOptionsPatch,
    volumes: js.Array[String]
  ): PodSecurityPolicySpecPatch = {
    val __obj = js.Dynamic.literal(allowPrivilegeEscalation = allowPrivilegeEscalation.asInstanceOf[js.Any], allowedCSIDrivers = allowedCSIDrivers.asInstanceOf[js.Any], allowedCapabilities = allowedCapabilities.asInstanceOf[js.Any], allowedFlexVolumes = allowedFlexVolumes.asInstanceOf[js.Any], allowedHostPaths = allowedHostPaths.asInstanceOf[js.Any], allowedProcMountTypes = allowedProcMountTypes.asInstanceOf[js.Any], allowedUnsafeSysctls = allowedUnsafeSysctls.asInstanceOf[js.Any], defaultAddCapabilities = defaultAddCapabilities.asInstanceOf[js.Any], defaultAllowPrivilegeEscalation = defaultAllowPrivilegeEscalation.asInstanceOf[js.Any], forbiddenSysctls = forbiddenSysctls.asInstanceOf[js.Any], fsGroup = fsGroup.asInstanceOf[js.Any], hostIPC = hostIPC.asInstanceOf[js.Any], hostNetwork = hostNetwork.asInstanceOf[js.Any], hostPID = hostPID.asInstanceOf[js.Any], hostPorts = hostPorts.asInstanceOf[js.Any], privileged = privileged.asInstanceOf[js.Any], readOnlyRootFilesystem = readOnlyRootFilesystem.asInstanceOf[js.Any], requiredDropCapabilities = requiredDropCapabilities.asInstanceOf[js.Any], runAsGroup = runAsGroup.asInstanceOf[js.Any], runAsUser = runAsUser.asInstanceOf[js.Any], runtimeClass = runtimeClass.asInstanceOf[js.Any], seLinux = seLinux.asInstanceOf[js.Any], supplementalGroups = supplementalGroups.asInstanceOf[js.Any], volumes = volumes.asInstanceOf[js.Any])
    __obj.asInstanceOf[PodSecurityPolicySpecPatch]
  }
  
  extension [Self <: PodSecurityPolicySpecPatch](x: Self) {
    
    inline def setAllowPrivilegeEscalation(value: Boolean): Self = StObject.set(x, "allowPrivilegeEscalation", value.asInstanceOf[js.Any])
    
    inline def setAllowedCSIDrivers(value: js.Array[AllowedCSIDriverPatch]): Self = StObject.set(x, "allowedCSIDrivers", value.asInstanceOf[js.Any])
    
    inline def setAllowedCSIDriversVarargs(value: AllowedCSIDriverPatch*): Self = StObject.set(x, "allowedCSIDrivers", js.Array(value*))
    
    inline def setAllowedCapabilities(value: js.Array[String]): Self = StObject.set(x, "allowedCapabilities", value.asInstanceOf[js.Any])
    
    inline def setAllowedCapabilitiesVarargs(value: String*): Self = StObject.set(x, "allowedCapabilities", js.Array(value*))
    
    inline def setAllowedFlexVolumes(value: js.Array[AllowedFlexVolumePatch]): Self = StObject.set(x, "allowedFlexVolumes", value.asInstanceOf[js.Any])
    
    inline def setAllowedFlexVolumesVarargs(value: AllowedFlexVolumePatch*): Self = StObject.set(x, "allowedFlexVolumes", js.Array(value*))
    
    inline def setAllowedHostPaths(value: js.Array[AllowedHostPathPatch]): Self = StObject.set(x, "allowedHostPaths", value.asInstanceOf[js.Any])
    
    inline def setAllowedHostPathsVarargs(value: AllowedHostPathPatch*): Self = StObject.set(x, "allowedHostPaths", js.Array(value*))
    
    inline def setAllowedProcMountTypes(value: js.Array[String]): Self = StObject.set(x, "allowedProcMountTypes", value.asInstanceOf[js.Any])
    
    inline def setAllowedProcMountTypesVarargs(value: String*): Self = StObject.set(x, "allowedProcMountTypes", js.Array(value*))
    
    inline def setAllowedUnsafeSysctls(value: js.Array[String]): Self = StObject.set(x, "allowedUnsafeSysctls", value.asInstanceOf[js.Any])
    
    inline def setAllowedUnsafeSysctlsVarargs(value: String*): Self = StObject.set(x, "allowedUnsafeSysctls", js.Array(value*))
    
    inline def setDefaultAddCapabilities(value: js.Array[String]): Self = StObject.set(x, "defaultAddCapabilities", value.asInstanceOf[js.Any])
    
    inline def setDefaultAddCapabilitiesVarargs(value: String*): Self = StObject.set(x, "defaultAddCapabilities", js.Array(value*))
    
    inline def setDefaultAllowPrivilegeEscalation(value: Boolean): Self = StObject.set(x, "defaultAllowPrivilegeEscalation", value.asInstanceOf[js.Any])
    
    inline def setForbiddenSysctls(value: js.Array[String]): Self = StObject.set(x, "forbiddenSysctls", value.asInstanceOf[js.Any])
    
    inline def setForbiddenSysctlsVarargs(value: String*): Self = StObject.set(x, "forbiddenSysctls", js.Array(value*))
    
    inline def setFsGroup(value: FSGroupStrategyOptionsPatch): Self = StObject.set(x, "fsGroup", value.asInstanceOf[js.Any])
    
    inline def setHostIPC(value: Boolean): Self = StObject.set(x, "hostIPC", value.asInstanceOf[js.Any])
    
    inline def setHostNetwork(value: Boolean): Self = StObject.set(x, "hostNetwork", value.asInstanceOf[js.Any])
    
    inline def setHostPID(value: Boolean): Self = StObject.set(x, "hostPID", value.asInstanceOf[js.Any])
    
    inline def setHostPorts(value: js.Array[HostPortRangePatch]): Self = StObject.set(x, "hostPorts", value.asInstanceOf[js.Any])
    
    inline def setHostPortsVarargs(value: HostPortRangePatch*): Self = StObject.set(x, "hostPorts", js.Array(value*))
    
    inline def setPrivileged(value: Boolean): Self = StObject.set(x, "privileged", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyRootFilesystem(value: Boolean): Self = StObject.set(x, "readOnlyRootFilesystem", value.asInstanceOf[js.Any])
    
    inline def setRequiredDropCapabilities(value: js.Array[String]): Self = StObject.set(x, "requiredDropCapabilities", value.asInstanceOf[js.Any])
    
    inline def setRequiredDropCapabilitiesVarargs(value: String*): Self = StObject.set(x, "requiredDropCapabilities", js.Array(value*))
    
    inline def setRunAsGroup(value: RunAsGroupStrategyOptionsPatch): Self = StObject.set(x, "runAsGroup", value.asInstanceOf[js.Any])
    
    inline def setRunAsUser(value: RunAsUserStrategyOptionsPatch): Self = StObject.set(x, "runAsUser", value.asInstanceOf[js.Any])
    
    inline def setRuntimeClass(value: RuntimeClassStrategyOptionsPatch): Self = StObject.set(x, "runtimeClass", value.asInstanceOf[js.Any])
    
    inline def setSeLinux(value: SELinuxStrategyOptionsPatch): Self = StObject.set(x, "seLinux", value.asInstanceOf[js.Any])
    
    inline def setSupplementalGroups(value: SupplementalGroupsStrategyOptionsPatch): Self = StObject.set(x, "supplementalGroups", value.asInstanceOf[js.Any])
    
    inline def setVolumes(value: js.Array[String]): Self = StObject.set(x, "volumes", value.asInstanceOf[js.Any])
    
    inline def setVolumesVarargs(value: String*): Self = StObject.set(x, "volumes", js.Array(value*))
  }
}
