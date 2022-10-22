package typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PodSecurityContext holds pod-level security attributes and common container settings. Some fields are also present in container.securityContext.  Field values of container.securityContext take precedence over field values of PodSecurityContext.
  */
trait PodSecurityContextPatch extends StObject {
  
  /**
    * A special supplemental group that applies to all containers in a pod. Some volume types allow the Kubelet to change the ownership of that volume to be owned by the pod:
    *
    * 1. The owning GID will be the FSGroup 2. The setgid bit is set (new files created in the volume will be owned by FSGroup) 3. The permission bits are OR'd with rw-rw----
    *
    * If unset, the Kubelet will not modify the ownership and permissions of any volume. Note that this field cannot be set when spec.os.name is windows.
    */
  var fsGroup: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * fsGroupChangePolicy defines behavior of changing ownership and permission of the volume before being exposed inside Pod. This field will only apply to volume types which support fsGroup based ownership(and permissions). It will have no effect on ephemeral volume types such as: secret, configmaps and emptydir. Valid values are "OnRootMismatch" and "Always". If not specified, "Always" is used. Note that this field cannot be set when spec.os.name is windows.
    */
  var fsGroupChangePolicy: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The GID to run the entrypoint of the container process. Uses runtime default if unset. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container. Note that this field cannot be set when spec.os.name is windows.
    */
  var runAsGroup: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * Indicates that the container must run as a non-root user. If true, the Kubelet will validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the container if it does. If unset or false, no such validation will be performed. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
    */
  var runAsNonRoot: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * The UID to run the entrypoint of the container process. Defaults to user specified in image metadata if unspecified. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container. Note that this field cannot be set when spec.os.name is windows.
    */
  var runAsUser: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * The SELinux context to be applied to all containers. If unspecified, the container runtime will allocate a random SELinux context for each container.  May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container. Note that this field cannot be set when spec.os.name is windows.
    */
  var seLinuxOptions: js.UndefOr[Input[SELinuxOptionsPatch]] = js.undefined
  
  /**
    * The seccomp options to use by the containers in this pod. Note that this field cannot be set when spec.os.name is windows.
    */
  var seccompProfile: js.UndefOr[Input[SeccompProfilePatch]] = js.undefined
  
  /**
    * A list of groups applied to the first process run in each container, in addition to the container's primary GID.  If unspecified, no groups will be added to any container. Note that this field cannot be set when spec.os.name is windows.
    */
  var supplementalGroups: js.UndefOr[Input[js.Array[Input[Double]]]] = js.undefined
  
  /**
    * Sysctls hold a list of namespaced sysctls used for the pod. Pods with unsupported sysctls (by the container runtime) might fail to launch. Note that this field cannot be set when spec.os.name is windows.
    */
  var sysctls: js.UndefOr[Input[js.Array[Input[SysctlPatch]]]] = js.undefined
  
  /**
    * The Windows specific settings applied to all containers. If unspecified, the options within a container's SecurityContext will be used. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. Note that this field cannot be set when spec.os.name is linux.
    */
  var windowsOptions: js.UndefOr[Input[WindowsSecurityContextOptionsPatch]] = js.undefined
}
object PodSecurityContextPatch {
  
  inline def apply(): PodSecurityContextPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PodSecurityContextPatch]
  }
  
  extension [Self <: PodSecurityContextPatch](x: Self) {
    
    inline def setFsGroup(value: Input[Double]): Self = StObject.set(x, "fsGroup", value.asInstanceOf[js.Any])
    
    inline def setFsGroupChangePolicy(value: Input[String]): Self = StObject.set(x, "fsGroupChangePolicy", value.asInstanceOf[js.Any])
    
    inline def setFsGroupChangePolicyUndefined: Self = StObject.set(x, "fsGroupChangePolicy", js.undefined)
    
    inline def setFsGroupUndefined: Self = StObject.set(x, "fsGroup", js.undefined)
    
    inline def setRunAsGroup(value: Input[Double]): Self = StObject.set(x, "runAsGroup", value.asInstanceOf[js.Any])
    
    inline def setRunAsGroupUndefined: Self = StObject.set(x, "runAsGroup", js.undefined)
    
    inline def setRunAsNonRoot(value: Input[Boolean]): Self = StObject.set(x, "runAsNonRoot", value.asInstanceOf[js.Any])
    
    inline def setRunAsNonRootUndefined: Self = StObject.set(x, "runAsNonRoot", js.undefined)
    
    inline def setRunAsUser(value: Input[Double]): Self = StObject.set(x, "runAsUser", value.asInstanceOf[js.Any])
    
    inline def setRunAsUserUndefined: Self = StObject.set(x, "runAsUser", js.undefined)
    
    inline def setSeLinuxOptions(value: Input[SELinuxOptionsPatch]): Self = StObject.set(x, "seLinuxOptions", value.asInstanceOf[js.Any])
    
    inline def setSeLinuxOptionsUndefined: Self = StObject.set(x, "seLinuxOptions", js.undefined)
    
    inline def setSeccompProfile(value: Input[SeccompProfilePatch]): Self = StObject.set(x, "seccompProfile", value.asInstanceOf[js.Any])
    
    inline def setSeccompProfileUndefined: Self = StObject.set(x, "seccompProfile", js.undefined)
    
    inline def setSupplementalGroups(value: Input[js.Array[Input[Double]]]): Self = StObject.set(x, "supplementalGroups", value.asInstanceOf[js.Any])
    
    inline def setSupplementalGroupsUndefined: Self = StObject.set(x, "supplementalGroups", js.undefined)
    
    inline def setSupplementalGroupsVarargs(value: Input[Double]*): Self = StObject.set(x, "supplementalGroups", js.Array(value*))
    
    inline def setSysctls(value: Input[js.Array[Input[SysctlPatch]]]): Self = StObject.set(x, "sysctls", value.asInstanceOf[js.Any])
    
    inline def setSysctlsUndefined: Self = StObject.set(x, "sysctls", js.undefined)
    
    inline def setSysctlsVarargs(value: Input[SysctlPatch]*): Self = StObject.set(x, "sysctls", js.Array(value*))
    
    inline def setWindowsOptions(value: Input[WindowsSecurityContextOptionsPatch]): Self = StObject.set(x, "windowsOptions", value.asInstanceOf[js.Any])
    
    inline def setWindowsOptionsUndefined: Self = StObject.set(x, "windowsOptions", js.undefined)
  }
}
