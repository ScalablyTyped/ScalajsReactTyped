package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An EphemeralContainer is a temporary container that you may add to an existing Pod for user-initiated activities such as debugging. Ephemeral containers have no resource or scheduling guarantees, and they will not be restarted when they exit or when a Pod is removed or restarted. The kubelet may evict a Pod if an ephemeral container causes the Pod to exceed its resource allocation.
  *
  * To add an ephemeral container, use the ephemeralcontainers subresource of an existing Pod. Ephemeral containers may not be removed or restarted.
  */
trait EphemeralContainerPatch extends StObject {
  
  /**
    * Arguments to the entrypoint. The image's CMD is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. "$$(VAR_NAME)" will produce the string literal "$(VAR_NAME)". Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
    */
  var args: js.Array[String]
  
  /**
    * Entrypoint array. Not executed within a shell. The image's ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. "$$(VAR_NAME)" will produce the string literal "$(VAR_NAME)". Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
    */
  var command: js.Array[String]
  
  /**
    * List of environment variables to set in the container. Cannot be updated.
    */
  var env: js.Array[EnvVarPatch]
  
  /**
    * List of sources to populate environment variables in the container. The keys defined within a source must be a C_IDENTIFIER. All invalid keys will be reported as an event when the container is starting. When a key exists in multiple sources, the value associated with the last source will take precedence. Values defined by an Env with a duplicate key will take precedence. Cannot be updated.
    */
  var envFrom: js.Array[EnvFromSourcePatch]
  
  /**
    * Container image name. More info: https://kubernetes.io/docs/concepts/containers/images
    */
  var image: String
  
  /**
    * Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is specified, or IfNotPresent otherwise. Cannot be updated. More info: https://kubernetes.io/docs/concepts/containers/images#updating-images
    */
  var imagePullPolicy: String
  
  /**
    * Lifecycle is not allowed for ephemeral containers.
    */
  var lifecycle: LifecyclePatch
  
  /**
    * Probes are not allowed for ephemeral containers.
    */
  var livenessProbe: ProbePatch
  
  /**
    * Name of the ephemeral container specified as a DNS_LABEL. This name must be unique among all containers, init containers and ephemeral containers.
    */
  var name: String
  
  /**
    * Ports are not allowed for ephemeral containers.
    */
  var ports: js.Array[ContainerPortPatch]
  
  /**
    * Probes are not allowed for ephemeral containers.
    */
  var readinessProbe: ProbePatch
  
  /**
    * Resources are not allowed for ephemeral containers. Ephemeral containers use spare resources already allocated to the pod.
    */
  var resources: ResourceRequirementsPatch
  
  /**
    * Optional: SecurityContext defines the security options the ephemeral container should be run with. If set, the fields of SecurityContext override the equivalent fields of PodSecurityContext.
    */
  var securityContext: SecurityContextPatch
  
  /**
    * Probes are not allowed for ephemeral containers.
    */
  var startupProbe: ProbePatch
  
  /**
    * Whether this container should allocate a buffer for stdin in the container runtime. If this is not set, reads from stdin in the container will always result in EOF. Default is false.
    */
  var stdin: Boolean
  
  /**
    * Whether the container runtime should close the stdin channel after it has been opened by a single attach. When stdin is true the stdin stream will remain open across multiple attach sessions. If stdinOnce is set to true, stdin is opened on container start, is empty until the first client attaches to stdin, and then remains open and accepts data until the client disconnects, at which time stdin is closed and remains closed until the container is restarted. If this flag is false, a container processes that reads from stdin will never receive an EOF. Default is false
    */
  var stdinOnce: Boolean
  
  /**
    * If set, the name of the container from PodSpec that this ephemeral container targets. The ephemeral container will be run in the namespaces (IPC, PID, etc) of this container. If not set then the ephemeral container uses the namespaces configured in the Pod spec.
    *
    * The container runtime must implement support for this feature. If the runtime does not support namespace targeting then the result of setting this field is undefined.
    */
  var targetContainerName: String
  
  /**
    * Optional: Path at which the file to which the container's termination message will be written is mounted into the container's filesystem. Message written is intended to be brief final status, such as an assertion failure message. Will be truncated by the node if greater than 4096 bytes. The total message length across all containers will be limited to 12kb. Defaults to /dev/termination-log. Cannot be updated.
    */
  var terminationMessagePath: String
  
  /**
    * Indicate how the termination message should be populated. File will use the contents of terminationMessagePath to populate the container status message on both success and failure. FallbackToLogsOnError will use the last chunk of container log output if the termination message file is empty and the container exited with an error. The log output is limited to 2048 bytes or 80 lines, whichever is smaller. Defaults to File. Cannot be updated.
    */
  var terminationMessagePolicy: String
  
  /**
    * Whether this container should allocate a TTY for itself, also requires 'stdin' to be true. Default is false.
    */
  var tty: Boolean
  
  /**
    * volumeDevices is the list of block devices to be used by the container.
    */
  var volumeDevices: js.Array[VolumeDevicePatch]
  
  /**
    * Pod volumes to mount into the container's filesystem. Subpath mounts are not allowed for ephemeral containers. Cannot be updated.
    */
  var volumeMounts: js.Array[VolumeMountPatch]
  
  /**
    * Container's working directory. If not specified, the container runtime's default will be used, which might be configured in the container image. Cannot be updated.
    */
  var workingDir: String
}
object EphemeralContainerPatch {
  
  inline def apply(
    args: js.Array[String],
    command: js.Array[String],
    env: js.Array[EnvVarPatch],
    envFrom: js.Array[EnvFromSourcePatch],
    image: String,
    imagePullPolicy: String,
    lifecycle: LifecyclePatch,
    livenessProbe: ProbePatch,
    name: String,
    ports: js.Array[ContainerPortPatch],
    readinessProbe: ProbePatch,
    resources: ResourceRequirementsPatch,
    securityContext: SecurityContextPatch,
    startupProbe: ProbePatch,
    stdin: Boolean,
    stdinOnce: Boolean,
    targetContainerName: String,
    terminationMessagePath: String,
    terminationMessagePolicy: String,
    tty: Boolean,
    volumeDevices: js.Array[VolumeDevicePatch],
    volumeMounts: js.Array[VolumeMountPatch],
    workingDir: String
  ): EphemeralContainerPatch = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], envFrom = envFrom.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], imagePullPolicy = imagePullPolicy.asInstanceOf[js.Any], lifecycle = lifecycle.asInstanceOf[js.Any], livenessProbe = livenessProbe.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ports = ports.asInstanceOf[js.Any], readinessProbe = readinessProbe.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], securityContext = securityContext.asInstanceOf[js.Any], startupProbe = startupProbe.asInstanceOf[js.Any], stdin = stdin.asInstanceOf[js.Any], stdinOnce = stdinOnce.asInstanceOf[js.Any], targetContainerName = targetContainerName.asInstanceOf[js.Any], terminationMessagePath = terminationMessagePath.asInstanceOf[js.Any], terminationMessagePolicy = terminationMessagePolicy.asInstanceOf[js.Any], tty = tty.asInstanceOf[js.Any], volumeDevices = volumeDevices.asInstanceOf[js.Any], volumeMounts = volumeMounts.asInstanceOf[js.Any], workingDir = workingDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[EphemeralContainerPatch]
  }
  
  extension [Self <: EphemeralContainerPatch](x: Self) {
    
    inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setCommand(value: js.Array[String]): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setCommandVarargs(value: String*): Self = StObject.set(x, "command", js.Array(value*))
    
    inline def setEnv(value: js.Array[EnvVarPatch]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setEnvFrom(value: js.Array[EnvFromSourcePatch]): Self = StObject.set(x, "envFrom", value.asInstanceOf[js.Any])
    
    inline def setEnvFromVarargs(value: EnvFromSourcePatch*): Self = StObject.set(x, "envFrom", js.Array(value*))
    
    inline def setEnvVarargs(value: EnvVarPatch*): Self = StObject.set(x, "env", js.Array(value*))
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImagePullPolicy(value: String): Self = StObject.set(x, "imagePullPolicy", value.asInstanceOf[js.Any])
    
    inline def setLifecycle(value: LifecyclePatch): Self = StObject.set(x, "lifecycle", value.asInstanceOf[js.Any])
    
    inline def setLivenessProbe(value: ProbePatch): Self = StObject.set(x, "livenessProbe", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPorts(value: js.Array[ContainerPortPatch]): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
    
    inline def setPortsVarargs(value: ContainerPortPatch*): Self = StObject.set(x, "ports", js.Array(value*))
    
    inline def setReadinessProbe(value: ProbePatch): Self = StObject.set(x, "readinessProbe", value.asInstanceOf[js.Any])
    
    inline def setResources(value: ResourceRequirementsPatch): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setSecurityContext(value: SecurityContextPatch): Self = StObject.set(x, "securityContext", value.asInstanceOf[js.Any])
    
    inline def setStartupProbe(value: ProbePatch): Self = StObject.set(x, "startupProbe", value.asInstanceOf[js.Any])
    
    inline def setStdin(value: Boolean): Self = StObject.set(x, "stdin", value.asInstanceOf[js.Any])
    
    inline def setStdinOnce(value: Boolean): Self = StObject.set(x, "stdinOnce", value.asInstanceOf[js.Any])
    
    inline def setTargetContainerName(value: String): Self = StObject.set(x, "targetContainerName", value.asInstanceOf[js.Any])
    
    inline def setTerminationMessagePath(value: String): Self = StObject.set(x, "terminationMessagePath", value.asInstanceOf[js.Any])
    
    inline def setTerminationMessagePolicy(value: String): Self = StObject.set(x, "terminationMessagePolicy", value.asInstanceOf[js.Any])
    
    inline def setTty(value: Boolean): Self = StObject.set(x, "tty", value.asInstanceOf[js.Any])
    
    inline def setVolumeDevices(value: js.Array[VolumeDevicePatch]): Self = StObject.set(x, "volumeDevices", value.asInstanceOf[js.Any])
    
    inline def setVolumeDevicesVarargs(value: VolumeDevicePatch*): Self = StObject.set(x, "volumeDevices", js.Array(value*))
    
    inline def setVolumeMounts(value: js.Array[VolumeMountPatch]): Self = StObject.set(x, "volumeMounts", value.asInstanceOf[js.Any])
    
    inline def setVolumeMountsVarargs(value: VolumeMountPatch*): Self = StObject.set(x, "volumeMounts", js.Array(value*))
    
    inline def setWorkingDir(value: String): Self = StObject.set(x, "workingDir", value.asInstanceOf[js.Any])
  }
}
