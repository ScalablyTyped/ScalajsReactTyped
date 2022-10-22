package typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SecurityContext holds security configuration that will be applied to a container. Some fields are present in both SecurityContext and PodSecurityContext.  When both are set, the values in SecurityContext take precedence.
  */
trait SecurityContextPatch extends StObject {
  
  /**
    * AllowPrivilegeEscalation controls whether a process can gain more privileges than its parent process. This bool directly controls if the no_new_privs flag will be set on the container process. AllowPrivilegeEscalation is true always when the container is: 1) run as Privileged 2) has CAP_SYS_ADMIN Note that this field cannot be set when spec.os.name is windows.
    */
  var allowPrivilegeEscalation: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * The capabilities to add/drop when running containers. Defaults to the default set of capabilities granted by the container runtime. Note that this field cannot be set when spec.os.name is windows.
    */
  var capabilities: js.UndefOr[Input[CapabilitiesPatch]] = js.undefined
  
  /**
    * Run container in privileged mode. Processes in privileged containers are essentially equivalent to root on the host. Defaults to false. Note that this field cannot be set when spec.os.name is windows.
    */
  var privileged: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * procMount denotes the type of proc mount to use for the containers. The default is DefaultProcMount which uses the container runtime defaults for readonly paths and masked paths. This requires the ProcMountType feature flag to be enabled. Note that this field cannot be set when spec.os.name is windows.
    */
  var procMount: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Whether this container has a read-only root filesystem. Default is false. Note that this field cannot be set when spec.os.name is windows.
    */
  var readOnlyRootFilesystem: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * The GID to run the entrypoint of the container process. Uses runtime default if unset. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. Note that this field cannot be set when spec.os.name is windows.
    */
  var runAsGroup: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * Indicates that the container must run as a non-root user. If true, the Kubelet will validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the container if it does. If unset or false, no such validation will be performed. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
    */
  var runAsNonRoot: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * The UID to run the entrypoint of the container process. Defaults to user specified in image metadata if unspecified. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. Note that this field cannot be set when spec.os.name is windows.
    */
  var runAsUser: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * The SELinux context to be applied to the container. If unspecified, the container runtime will allocate a random SELinux context for each container.  May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. Note that this field cannot be set when spec.os.name is windows.
    */
  var seLinuxOptions: js.UndefOr[Input[SELinuxOptionsPatch]] = js.undefined
  
  /**
    * The seccomp options to use by this container. If seccomp options are provided at both the pod & container level, the container options override the pod options. Note that this field cannot be set when spec.os.name is windows.
    */
  var seccompProfile: js.UndefOr[Input[SeccompProfilePatch]] = js.undefined
  
  /**
    * The Windows specific settings applied to all containers. If unspecified, the options from the PodSecurityContext will be used. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. Note that this field cannot be set when spec.os.name is linux.
    */
  var windowsOptions: js.UndefOr[Input[WindowsSecurityContextOptionsPatch]] = js.undefined
}
object SecurityContextPatch {
  
  inline def apply(): SecurityContextPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityContextPatch]
  }
  
  extension [Self <: SecurityContextPatch](x: Self) {
    
    inline def setAllowPrivilegeEscalation(value: Input[Boolean]): Self = StObject.set(x, "allowPrivilegeEscalation", value.asInstanceOf[js.Any])
    
    inline def setAllowPrivilegeEscalationUndefined: Self = StObject.set(x, "allowPrivilegeEscalation", js.undefined)
    
    inline def setCapabilities(value: Input[CapabilitiesPatch]): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    inline def setCapabilitiesUndefined: Self = StObject.set(x, "capabilities", js.undefined)
    
    inline def setPrivileged(value: Input[Boolean]): Self = StObject.set(x, "privileged", value.asInstanceOf[js.Any])
    
    inline def setPrivilegedUndefined: Self = StObject.set(x, "privileged", js.undefined)
    
    inline def setProcMount(value: Input[String]): Self = StObject.set(x, "procMount", value.asInstanceOf[js.Any])
    
    inline def setProcMountUndefined: Self = StObject.set(x, "procMount", js.undefined)
    
    inline def setReadOnlyRootFilesystem(value: Input[Boolean]): Self = StObject.set(x, "readOnlyRootFilesystem", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyRootFilesystemUndefined: Self = StObject.set(x, "readOnlyRootFilesystem", js.undefined)
    
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
    
    inline def setWindowsOptions(value: Input[WindowsSecurityContextOptionsPatch]): Self = StObject.set(x, "windowsOptions", value.asInstanceOf[js.Any])
    
    inline def setWindowsOptionsUndefined: Self = StObject.set(x, "windowsOptions", js.undefined)
  }
}
