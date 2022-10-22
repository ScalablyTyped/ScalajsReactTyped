package typingsJapgolly.pulumiKubernetes.typesInputMod.extensions.v1beta1

import typingsJapgolly.pulumiPulumi.outputMod.Input
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
  var allowPrivilegeEscalation: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * AllowedCSIDrivers is a whitelist of inline CSI drivers that must be explicitly set to be embedded within a pod spec. An empty value indicates that any CSI driver can be used for inline ephemeral volumes.
    */
  var allowedCSIDrivers: js.UndefOr[Input[js.Array[Input[AllowedCSIDriverPatch]]]] = js.undefined
  
  /**
    * allowedCapabilities is a list of capabilities that can be requested to add to the container. Capabilities in this field may be added at the pod author's discretion. You must not list a capability in both allowedCapabilities and requiredDropCapabilities.
    */
  var allowedCapabilities: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  
  /**
    * allowedFlexVolumes is a whitelist of allowed Flexvolumes.  Empty or nil indicates that all Flexvolumes may be used.  This parameter is effective only when the usage of the Flexvolumes is allowed in the "volumes" field.
    */
  var allowedFlexVolumes: js.UndefOr[Input[js.Array[Input[AllowedFlexVolumePatch]]]] = js.undefined
  
  /**
    * allowedHostPaths is a white list of allowed host paths. Empty indicates that all host paths may be used.
    */
  var allowedHostPaths: js.UndefOr[Input[js.Array[Input[AllowedHostPathPatch]]]] = js.undefined
  
  /**
    * AllowedProcMountTypes is a whitelist of allowed ProcMountTypes. Empty or nil indicates that only the DefaultProcMountType may be used. This requires the ProcMountType feature flag to be enabled.
    */
  var allowedProcMountTypes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  
  /**
    * allowedUnsafeSysctls is a list of explicitly allowed unsafe sysctls, defaults to none. Each entry is either a plain sysctl name or ends in "*" in which case it is considered as a prefix of allowed sysctls. Single * means all unsafe sysctls are allowed. Kubelet has to whitelist all allowed unsafe sysctls explicitly to avoid rejection.
    *
    * Examples: e.g. "foo/ *" allows "foo/bar", "foo/baz", etc. e.g. "foo.*" allows "foo.bar", "foo.baz", etc.
    */
  var allowedUnsafeSysctls: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  
  /**
    * defaultAddCapabilities is the default set of capabilities that will be added to the container unless the pod spec specifically drops the capability.  You may not list a capability in both defaultAddCapabilities and requiredDropCapabilities. Capabilities added here are implicitly allowed, and need not be included in the allowedCapabilities list.
    */
  var defaultAddCapabilities: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  
  /**
    * defaultAllowPrivilegeEscalation controls the default setting for whether a process can gain more privileges than its parent process.
    */
  var defaultAllowPrivilegeEscalation: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * forbiddenSysctls is a list of explicitly forbidden sysctls, defaults to none. Each entry is either a plain sysctl name or ends in "*" in which case it is considered as a prefix of forbidden sysctls. Single * means all sysctls are forbidden.
    *
    * Examples: e.g. "foo/ *" forbids "foo/bar", "foo/baz", etc. e.g. "foo.*" forbids "foo.bar", "foo.baz", etc.
    */
  var forbiddenSysctls: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  
  /**
    * fsGroup is the strategy that will dictate what fs group is used by the SecurityContext.
    */
  var fsGroup: js.UndefOr[Input[FSGroupStrategyOptionsPatch]] = js.undefined
  
  /**
    * hostIPC determines if the policy allows the use of HostIPC in the pod spec.
    */
  var hostIPC: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * hostNetwork determines if the policy allows the use of HostNetwork in the pod spec.
    */
  var hostNetwork: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * hostPID determines if the policy allows the use of HostPID in the pod spec.
    */
  var hostPID: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * hostPorts determines which host port ranges are allowed to be exposed.
    */
  var hostPorts: js.UndefOr[Input[js.Array[Input[HostPortRangePatch]]]] = js.undefined
  
  /**
    * privileged determines if a pod can request to be run as privileged.
    */
  var privileged: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * readOnlyRootFilesystem when set to true will force containers to run with a read only root file system.  If the container specifically requests to run with a non-read only root file system the PSP should deny the pod. If set to false the container may run with a read only root file system if it wishes but it will not be forced to.
    */
  var readOnlyRootFilesystem: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * requiredDropCapabilities are the capabilities that will be dropped from the container.  These are required to be dropped and cannot be added.
    */
  var requiredDropCapabilities: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  
  /**
    * RunAsGroup is the strategy that will dictate the allowable RunAsGroup values that may be set. If this field is omitted, the pod's RunAsGroup can take any value. This field requires the RunAsGroup feature gate to be enabled.
    */
  var runAsGroup: js.UndefOr[Input[RunAsGroupStrategyOptionsPatch]] = js.undefined
  
  /**
    * runAsUser is the strategy that will dictate the allowable RunAsUser values that may be set.
    */
  var runAsUser: js.UndefOr[Input[RunAsUserStrategyOptionsPatch]] = js.undefined
  
  /**
    * runtimeClass is the strategy that will dictate the allowable RuntimeClasses for a pod. If this field is omitted, the pod's runtimeClassName field is unrestricted. Enforcement of this field depends on the RuntimeClass feature gate being enabled.
    */
  var runtimeClass: js.UndefOr[Input[RuntimeClassStrategyOptionsPatch]] = js.undefined
  
  /**
    * seLinux is the strategy that will dictate the allowable labels that may be set.
    */
  var seLinux: js.UndefOr[Input[SELinuxStrategyOptionsPatch]] = js.undefined
  
  /**
    * supplementalGroups is the strategy that will dictate what supplemental groups are used by the SecurityContext.
    */
  var supplementalGroups: js.UndefOr[Input[SupplementalGroupsStrategyOptionsPatch]] = js.undefined
  
  /**
    * volumes is a white list of allowed volume plugins. Empty indicates that no volumes may be used. To allow all volumes you may use '*'.
    */
  var volumes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
}
object PodSecurityPolicySpecPatch {
  
  inline def apply(): PodSecurityPolicySpecPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PodSecurityPolicySpecPatch]
  }
  
  extension [Self <: PodSecurityPolicySpecPatch](x: Self) {
    
    inline def setAllowPrivilegeEscalation(value: Input[Boolean]): Self = StObject.set(x, "allowPrivilegeEscalation", value.asInstanceOf[js.Any])
    
    inline def setAllowPrivilegeEscalationUndefined: Self = StObject.set(x, "allowPrivilegeEscalation", js.undefined)
    
    inline def setAllowedCSIDrivers(value: Input[js.Array[Input[AllowedCSIDriverPatch]]]): Self = StObject.set(x, "allowedCSIDrivers", value.asInstanceOf[js.Any])
    
    inline def setAllowedCSIDriversUndefined: Self = StObject.set(x, "allowedCSIDrivers", js.undefined)
    
    inline def setAllowedCSIDriversVarargs(value: Input[AllowedCSIDriverPatch]*): Self = StObject.set(x, "allowedCSIDrivers", js.Array(value*))
    
    inline def setAllowedCapabilities(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "allowedCapabilities", value.asInstanceOf[js.Any])
    
    inline def setAllowedCapabilitiesUndefined: Self = StObject.set(x, "allowedCapabilities", js.undefined)
    
    inline def setAllowedCapabilitiesVarargs(value: Input[String]*): Self = StObject.set(x, "allowedCapabilities", js.Array(value*))
    
    inline def setAllowedFlexVolumes(value: Input[js.Array[Input[AllowedFlexVolumePatch]]]): Self = StObject.set(x, "allowedFlexVolumes", value.asInstanceOf[js.Any])
    
    inline def setAllowedFlexVolumesUndefined: Self = StObject.set(x, "allowedFlexVolumes", js.undefined)
    
    inline def setAllowedFlexVolumesVarargs(value: Input[AllowedFlexVolumePatch]*): Self = StObject.set(x, "allowedFlexVolumes", js.Array(value*))
    
    inline def setAllowedHostPaths(value: Input[js.Array[Input[AllowedHostPathPatch]]]): Self = StObject.set(x, "allowedHostPaths", value.asInstanceOf[js.Any])
    
    inline def setAllowedHostPathsUndefined: Self = StObject.set(x, "allowedHostPaths", js.undefined)
    
    inline def setAllowedHostPathsVarargs(value: Input[AllowedHostPathPatch]*): Self = StObject.set(x, "allowedHostPaths", js.Array(value*))
    
    inline def setAllowedProcMountTypes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "allowedProcMountTypes", value.asInstanceOf[js.Any])
    
    inline def setAllowedProcMountTypesUndefined: Self = StObject.set(x, "allowedProcMountTypes", js.undefined)
    
    inline def setAllowedProcMountTypesVarargs(value: Input[String]*): Self = StObject.set(x, "allowedProcMountTypes", js.Array(value*))
    
    inline def setAllowedUnsafeSysctls(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "allowedUnsafeSysctls", value.asInstanceOf[js.Any])
    
    inline def setAllowedUnsafeSysctlsUndefined: Self = StObject.set(x, "allowedUnsafeSysctls", js.undefined)
    
    inline def setAllowedUnsafeSysctlsVarargs(value: Input[String]*): Self = StObject.set(x, "allowedUnsafeSysctls", js.Array(value*))
    
    inline def setDefaultAddCapabilities(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "defaultAddCapabilities", value.asInstanceOf[js.Any])
    
    inline def setDefaultAddCapabilitiesUndefined: Self = StObject.set(x, "defaultAddCapabilities", js.undefined)
    
    inline def setDefaultAddCapabilitiesVarargs(value: Input[String]*): Self = StObject.set(x, "defaultAddCapabilities", js.Array(value*))
    
    inline def setDefaultAllowPrivilegeEscalation(value: Input[Boolean]): Self = StObject.set(x, "defaultAllowPrivilegeEscalation", value.asInstanceOf[js.Any])
    
    inline def setDefaultAllowPrivilegeEscalationUndefined: Self = StObject.set(x, "defaultAllowPrivilegeEscalation", js.undefined)
    
    inline def setForbiddenSysctls(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "forbiddenSysctls", value.asInstanceOf[js.Any])
    
    inline def setForbiddenSysctlsUndefined: Self = StObject.set(x, "forbiddenSysctls", js.undefined)
    
    inline def setForbiddenSysctlsVarargs(value: Input[String]*): Self = StObject.set(x, "forbiddenSysctls", js.Array(value*))
    
    inline def setFsGroup(value: Input[FSGroupStrategyOptionsPatch]): Self = StObject.set(x, "fsGroup", value.asInstanceOf[js.Any])
    
    inline def setFsGroupUndefined: Self = StObject.set(x, "fsGroup", js.undefined)
    
    inline def setHostIPC(value: Input[Boolean]): Self = StObject.set(x, "hostIPC", value.asInstanceOf[js.Any])
    
    inline def setHostIPCUndefined: Self = StObject.set(x, "hostIPC", js.undefined)
    
    inline def setHostNetwork(value: Input[Boolean]): Self = StObject.set(x, "hostNetwork", value.asInstanceOf[js.Any])
    
    inline def setHostNetworkUndefined: Self = StObject.set(x, "hostNetwork", js.undefined)
    
    inline def setHostPID(value: Input[Boolean]): Self = StObject.set(x, "hostPID", value.asInstanceOf[js.Any])
    
    inline def setHostPIDUndefined: Self = StObject.set(x, "hostPID", js.undefined)
    
    inline def setHostPorts(value: Input[js.Array[Input[HostPortRangePatch]]]): Self = StObject.set(x, "hostPorts", value.asInstanceOf[js.Any])
    
    inline def setHostPortsUndefined: Self = StObject.set(x, "hostPorts", js.undefined)
    
    inline def setHostPortsVarargs(value: Input[HostPortRangePatch]*): Self = StObject.set(x, "hostPorts", js.Array(value*))
    
    inline def setPrivileged(value: Input[Boolean]): Self = StObject.set(x, "privileged", value.asInstanceOf[js.Any])
    
    inline def setPrivilegedUndefined: Self = StObject.set(x, "privileged", js.undefined)
    
    inline def setReadOnlyRootFilesystem(value: Input[Boolean]): Self = StObject.set(x, "readOnlyRootFilesystem", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyRootFilesystemUndefined: Self = StObject.set(x, "readOnlyRootFilesystem", js.undefined)
    
    inline def setRequiredDropCapabilities(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "requiredDropCapabilities", value.asInstanceOf[js.Any])
    
    inline def setRequiredDropCapabilitiesUndefined: Self = StObject.set(x, "requiredDropCapabilities", js.undefined)
    
    inline def setRequiredDropCapabilitiesVarargs(value: Input[String]*): Self = StObject.set(x, "requiredDropCapabilities", js.Array(value*))
    
    inline def setRunAsGroup(value: Input[RunAsGroupStrategyOptionsPatch]): Self = StObject.set(x, "runAsGroup", value.asInstanceOf[js.Any])
    
    inline def setRunAsGroupUndefined: Self = StObject.set(x, "runAsGroup", js.undefined)
    
    inline def setRunAsUser(value: Input[RunAsUserStrategyOptionsPatch]): Self = StObject.set(x, "runAsUser", value.asInstanceOf[js.Any])
    
    inline def setRunAsUserUndefined: Self = StObject.set(x, "runAsUser", js.undefined)
    
    inline def setRuntimeClass(value: Input[RuntimeClassStrategyOptionsPatch]): Self = StObject.set(x, "runtimeClass", value.asInstanceOf[js.Any])
    
    inline def setRuntimeClassUndefined: Self = StObject.set(x, "runtimeClass", js.undefined)
    
    inline def setSeLinux(value: Input[SELinuxStrategyOptionsPatch]): Self = StObject.set(x, "seLinux", value.asInstanceOf[js.Any])
    
    inline def setSeLinuxUndefined: Self = StObject.set(x, "seLinux", js.undefined)
    
    inline def setSupplementalGroups(value: Input[SupplementalGroupsStrategyOptionsPatch]): Self = StObject.set(x, "supplementalGroups", value.asInstanceOf[js.Any])
    
    inline def setSupplementalGroupsUndefined: Self = StObject.set(x, "supplementalGroups", js.undefined)
    
    inline def setVolumes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "volumes", value.asInstanceOf[js.Any])
    
    inline def setVolumesUndefined: Self = StObject.set(x, "volumes", js.undefined)
    
    inline def setVolumesVarargs(value: Input[String]*): Self = StObject.set(x, "volumes", js.Array(value*))
  }
}
