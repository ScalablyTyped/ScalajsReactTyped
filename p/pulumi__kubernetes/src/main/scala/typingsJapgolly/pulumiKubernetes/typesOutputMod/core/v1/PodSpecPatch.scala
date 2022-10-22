package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PodSpec is a description of a pod.
  */
trait PodSpecPatch extends StObject {
  
  /**
    * Optional duration in seconds the pod may be active on the node relative to StartTime before the system will actively try to mark it failed and kill associated containers. Value must be a positive integer.
    */
  var activeDeadlineSeconds: Double
  
  /**
    * If specified, the pod's scheduling constraints
    */
  var affinity: AffinityPatch
  
  /**
    * AutomountServiceAccountToken indicates whether a service account token should be automatically mounted.
    */
  var automountServiceAccountToken: Boolean
  
  /**
    * List of containers belonging to the pod. Containers cannot currently be added or removed. There must be at least one container in a Pod. Cannot be updated.
    */
  var containers: js.Array[ContainerPatch]
  
  /**
    * Specifies the DNS parameters of a pod. Parameters specified here will be merged to the generated DNS configuration based on DNSPolicy.
    */
  var dnsConfig: PodDNSConfigPatch
  
  /**
    * Set DNS policy for the pod. Defaults to "ClusterFirst". Valid values are 'ClusterFirstWithHostNet', 'ClusterFirst', 'Default' or 'None'. DNS parameters given in DNSConfig will be merged with the policy selected with DNSPolicy. To have DNS options set along with hostNetwork, you have to specify DNS policy explicitly to 'ClusterFirstWithHostNet'.
    */
  var dnsPolicy: String
  
  /**
    * EnableServiceLinks indicates whether information about services should be injected into pod's environment variables, matching the syntax of Docker links. Optional: Defaults to true.
    */
  var enableServiceLinks: Boolean
  
  /**
    * List of ephemeral containers run in this pod. Ephemeral containers may be run in an existing pod to perform user-initiated actions such as debugging. This list cannot be specified when creating a pod, and it cannot be modified by updating the pod spec. In order to add an ephemeral container to an existing pod, use the pod's ephemeralcontainers subresource.
    */
  var ephemeralContainers: js.Array[EphemeralContainerPatch]
  
  /**
    * HostAliases is an optional list of hosts and IPs that will be injected into the pod's hosts file if specified. This is only valid for non-hostNetwork pods.
    */
  var hostAliases: js.Array[HostAliasPatch]
  
  /**
    * Use the host's ipc namespace. Optional: Default to false.
    */
  var hostIPC: Boolean
  
  /**
    * Host networking requested for this pod. Use the host's network namespace. If this option is set, the ports that will be used must be specified. Default to false.
    */
  var hostNetwork: Boolean
  
  /**
    * Use the host's pid namespace. Optional: Default to false.
    */
  var hostPID: Boolean
  
  /**
    * Use the host's user namespace. Optional: Default to true. If set to true or not present, the pod will be run in the host user namespace, useful for when the pod needs a feature only available to the host user namespace, such as loading a kernel module with CAP_SYS_MODULE. When set to false, a new userns is created for the pod. Setting false is useful for mitigating container breakout vulnerabilities even allowing users to run their containers as root without actually having root privileges on the host. This field is alpha-level and is only honored by servers that enable the UserNamespacesSupport feature.
    */
  var hostUsers: Boolean
  
  /**
    * Specifies the hostname of the Pod If not specified, the pod's hostname will be set to a system-defined value.
    */
  var hostname: String
  
  /**
    * ImagePullSecrets is an optional list of references to secrets in the same namespace to use for pulling any of the images used by this PodSpec. If specified, these secrets will be passed to individual puller implementations for them to use. More info: https://kubernetes.io/docs/concepts/containers/images#specifying-imagepullsecrets-on-a-pod
    */
  var imagePullSecrets: js.Array[LocalObjectReferencePatch]
  
  /**
    * List of initialization containers belonging to the pod. Init containers are executed in order prior to containers being started. If any init container fails, the pod is considered to have failed and is handled according to its restartPolicy. The name for an init container or normal container must be unique among all containers. Init containers may not have Lifecycle actions, Readiness probes, Liveness probes, or Startup probes. The resourceRequirements of an init container are taken into account during scheduling by finding the highest request/limit for each resource type, and then using the max of of that value or the sum of the normal containers. Limits are applied to init containers in a similar fashion. Init containers cannot currently be added or removed. Cannot be updated. More info: https://kubernetes.io/docs/concepts/workloads/pods/init-containers/
    */
  var initContainers: js.Array[ContainerPatch]
  
  /**
    * NodeName is a request to schedule this pod onto a specific node. If it is non-empty, the scheduler simply schedules this pod onto that node, assuming that it fits resource requirements.
    */
  var nodeName: String
  
  /**
    * NodeSelector is a selector which must be true for the pod to fit on a node. Selector which must match a node's labels for the pod to be scheduled on that node. More info: https://kubernetes.io/docs/concepts/configuration/assign-pod-node/
    */
  var nodeSelector: StringDictionary[String]
  
  /**
    * Specifies the OS of the containers in the pod. Some pod and container fields are restricted if this is set.
    *
    * If the OS field is set to linux, the following fields must be unset: -securityContext.windowsOptions
    *
    * If the OS field is set to windows, following fields must be unset: - spec.hostPID - spec.hostIPC - spec.hostUsers - spec.securityContext.seLinuxOptions - spec.securityContext.seccompProfile - spec.securityContext.fsGroup - spec.securityContext.fsGroupChangePolicy - spec.securityContext.sysctls - spec.shareProcessNamespace - spec.securityContext.runAsUser - spec.securityContext.runAsGroup - spec.securityContext.supplementalGroups - spec.containers[*].securityContext.seLinuxOptions - spec.containers[*].securityContext.seccompProfile - spec.containers[*].securityContext.capabilities - spec.containers[*].securityContext.readOnlyRootFilesystem - spec.containers[*].securityContext.privileged - spec.containers[*].securityContext.allowPrivilegeEscalation - spec.containers[*].securityContext.procMount - spec.containers[*].securityContext.runAsUser - spec.containers[*].securityContext.runAsGroup
    */
  var os: PodOSPatch
  
  /**
    * Overhead represents the resource overhead associated with running a pod for a given RuntimeClass. This field will be autopopulated at admission time by the RuntimeClass admission controller. If the RuntimeClass admission controller is enabled, overhead must not be set in Pod create requests. The RuntimeClass admission controller will reject Pod create requests which have the overhead already set. If RuntimeClass is configured and selected in the PodSpec, Overhead will be set to the value defined in the corresponding RuntimeClass, otherwise it will remain unset and treated as zero. More info: https://git.k8s.io/enhancements/keps/sig-node/688-pod-overhead/README.md
    */
  var overhead: StringDictionary[String]
  
  /**
    * PreemptionPolicy is the Policy for preempting pods with lower priority. One of Never, PreemptLowerPriority. Defaults to PreemptLowerPriority if unset.
    */
  var preemptionPolicy: String
  
  /**
    * The priority value. Various system components use this field to find the priority of the pod. When Priority Admission Controller is enabled, it prevents users from setting this field. The admission controller populates this field from PriorityClassName. The higher the value, the higher the priority.
    */
  var priority: Double
  
  /**
    * If specified, indicates the pod's priority. "system-node-critical" and "system-cluster-critical" are two special keywords which indicate the highest priorities with the former being the highest priority. Any other name must be defined by creating a PriorityClass object with that name. If not specified, the pod priority will be default or zero if there is no default.
    */
  var priorityClassName: String
  
  /**
    * If specified, all readiness gates will be evaluated for pod readiness. A pod is ready when all its containers are ready AND all conditions specified in the readiness gates have status equal to "True" More info: https://git.k8s.io/enhancements/keps/sig-network/580-pod-readiness-gates
    */
  var readinessGates: js.Array[PodReadinessGatePatch]
  
  /**
    * Restart policy for all containers within the pod. One of Always, OnFailure, Never. Default to Always. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy
    */
  var restartPolicy: String
  
  /**
    * RuntimeClassName refers to a RuntimeClass object in the node.k8s.io group, which should be used to run this pod.  If no RuntimeClass resource matches the named class, the pod will not be run. If unset or empty, the "legacy" RuntimeClass will be used, which is an implicit class with an empty definition that uses the default runtime handler. More info: https://git.k8s.io/enhancements/keps/sig-node/585-runtime-class
    */
  var runtimeClassName: String
  
  /**
    * If specified, the pod will be dispatched by specified scheduler. If not specified, the pod will be dispatched by default scheduler.
    */
  var schedulerName: String
  
  /**
    * SecurityContext holds pod-level security attributes and common container settings. Optional: Defaults to empty.  See type description for default values of each field.
    */
  var securityContext: PodSecurityContextPatch
  
  /**
    * DeprecatedServiceAccount is a depreciated alias for ServiceAccountName. Deprecated: Use serviceAccountName instead.
    */
  var serviceAccount: String
  
  /**
    * ServiceAccountName is the name of the ServiceAccount to use to run this pod. More info: https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/
    */
  var serviceAccountName: String
  
  /**
    * If true the pod's hostname will be configured as the pod's FQDN, rather than the leaf name (the default). In Linux containers, this means setting the FQDN in the hostname field of the kernel (the nodename field of struct utsname). In Windows containers, this means setting the registry value of hostname for the registry key HKEY_LOCAL_MACHINE\SYSTEM\CurrentControlSet\Services\Tcpip\Parameters to FQDN. If a pod does not have FQDN, this has no effect. Default to false.
    */
  var setHostnameAsFQDN: Boolean
  
  /**
    * Share a single process namespace between all of the containers in a pod. When this is set containers will be able to view and signal processes from other containers in the same pod, and the first process in each container will not be assigned PID 1. HostPID and ShareProcessNamespace cannot both be set. Optional: Default to false.
    */
  var shareProcessNamespace: Boolean
  
  /**
    * If specified, the fully qualified Pod hostname will be "<hostname>.<subdomain>.<pod namespace>.svc.<cluster domain>". If not specified, the pod will not have a domainname at all.
    */
  var subdomain: String
  
  /**
    * Optional duration in seconds the pod needs to terminate gracefully. May be decreased in delete request. Value must be non-negative integer. The value zero indicates stop immediately via the kill signal (no opportunity to shut down). If this value is nil, the default grace period will be used instead. The grace period is the duration in seconds after the processes running in the pod are sent a termination signal and the time when the processes are forcibly halted with a kill signal. Set this value longer than the expected cleanup time for your process. Defaults to 30 seconds.
    */
  var terminationGracePeriodSeconds: Double
  
  /**
    * If specified, the pod's tolerations.
    */
  var tolerations: js.Array[TolerationPatch]
  
  /**
    * TopologySpreadConstraints describes how a group of pods ought to spread across topology domains. Scheduler will schedule pods in a way which abides by the constraints. All topologySpreadConstraints are ANDed.
    */
  var topologySpreadConstraints: js.Array[TopologySpreadConstraintPatch]
  
  /**
    * List of volumes that can be mounted by containers belonging to the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes
    */
  var volumes: js.Array[VolumePatch]
}
object PodSpecPatch {
  
  inline def apply(
    activeDeadlineSeconds: Double,
    affinity: AffinityPatch,
    automountServiceAccountToken: Boolean,
    containers: js.Array[ContainerPatch],
    dnsConfig: PodDNSConfigPatch,
    dnsPolicy: String,
    enableServiceLinks: Boolean,
    ephemeralContainers: js.Array[EphemeralContainerPatch],
    hostAliases: js.Array[HostAliasPatch],
    hostIPC: Boolean,
    hostNetwork: Boolean,
    hostPID: Boolean,
    hostUsers: Boolean,
    hostname: String,
    imagePullSecrets: js.Array[LocalObjectReferencePatch],
    initContainers: js.Array[ContainerPatch],
    nodeName: String,
    nodeSelector: StringDictionary[String],
    os: PodOSPatch,
    overhead: StringDictionary[String],
    preemptionPolicy: String,
    priority: Double,
    priorityClassName: String,
    readinessGates: js.Array[PodReadinessGatePatch],
    restartPolicy: String,
    runtimeClassName: String,
    schedulerName: String,
    securityContext: PodSecurityContextPatch,
    serviceAccount: String,
    serviceAccountName: String,
    setHostnameAsFQDN: Boolean,
    shareProcessNamespace: Boolean,
    subdomain: String,
    terminationGracePeriodSeconds: Double,
    tolerations: js.Array[TolerationPatch],
    topologySpreadConstraints: js.Array[TopologySpreadConstraintPatch],
    volumes: js.Array[VolumePatch]
  ): PodSpecPatch = {
    val __obj = js.Dynamic.literal(activeDeadlineSeconds = activeDeadlineSeconds.asInstanceOf[js.Any], affinity = affinity.asInstanceOf[js.Any], automountServiceAccountToken = automountServiceAccountToken.asInstanceOf[js.Any], containers = containers.asInstanceOf[js.Any], dnsConfig = dnsConfig.asInstanceOf[js.Any], dnsPolicy = dnsPolicy.asInstanceOf[js.Any], enableServiceLinks = enableServiceLinks.asInstanceOf[js.Any], ephemeralContainers = ephemeralContainers.asInstanceOf[js.Any], hostAliases = hostAliases.asInstanceOf[js.Any], hostIPC = hostIPC.asInstanceOf[js.Any], hostNetwork = hostNetwork.asInstanceOf[js.Any], hostPID = hostPID.asInstanceOf[js.Any], hostUsers = hostUsers.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], imagePullSecrets = imagePullSecrets.asInstanceOf[js.Any], initContainers = initContainers.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], nodeSelector = nodeSelector.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], overhead = overhead.asInstanceOf[js.Any], preemptionPolicy = preemptionPolicy.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], priorityClassName = priorityClassName.asInstanceOf[js.Any], readinessGates = readinessGates.asInstanceOf[js.Any], restartPolicy = restartPolicy.asInstanceOf[js.Any], runtimeClassName = runtimeClassName.asInstanceOf[js.Any], schedulerName = schedulerName.asInstanceOf[js.Any], securityContext = securityContext.asInstanceOf[js.Any], serviceAccount = serviceAccount.asInstanceOf[js.Any], serviceAccountName = serviceAccountName.asInstanceOf[js.Any], setHostnameAsFQDN = setHostnameAsFQDN.asInstanceOf[js.Any], shareProcessNamespace = shareProcessNamespace.asInstanceOf[js.Any], subdomain = subdomain.asInstanceOf[js.Any], terminationGracePeriodSeconds = terminationGracePeriodSeconds.asInstanceOf[js.Any], tolerations = tolerations.asInstanceOf[js.Any], topologySpreadConstraints = topologySpreadConstraints.asInstanceOf[js.Any], volumes = volumes.asInstanceOf[js.Any])
    __obj.asInstanceOf[PodSpecPatch]
  }
  
  extension [Self <: PodSpecPatch](x: Self) {
    
    inline def setActiveDeadlineSeconds(value: Double): Self = StObject.set(x, "activeDeadlineSeconds", value.asInstanceOf[js.Any])
    
    inline def setAffinity(value: AffinityPatch): Self = StObject.set(x, "affinity", value.asInstanceOf[js.Any])
    
    inline def setAutomountServiceAccountToken(value: Boolean): Self = StObject.set(x, "automountServiceAccountToken", value.asInstanceOf[js.Any])
    
    inline def setContainers(value: js.Array[ContainerPatch]): Self = StObject.set(x, "containers", value.asInstanceOf[js.Any])
    
    inline def setContainersVarargs(value: ContainerPatch*): Self = StObject.set(x, "containers", js.Array(value*))
    
    inline def setDnsConfig(value: PodDNSConfigPatch): Self = StObject.set(x, "dnsConfig", value.asInstanceOf[js.Any])
    
    inline def setDnsPolicy(value: String): Self = StObject.set(x, "dnsPolicy", value.asInstanceOf[js.Any])
    
    inline def setEnableServiceLinks(value: Boolean): Self = StObject.set(x, "enableServiceLinks", value.asInstanceOf[js.Any])
    
    inline def setEphemeralContainers(value: js.Array[EphemeralContainerPatch]): Self = StObject.set(x, "ephemeralContainers", value.asInstanceOf[js.Any])
    
    inline def setEphemeralContainersVarargs(value: EphemeralContainerPatch*): Self = StObject.set(x, "ephemeralContainers", js.Array(value*))
    
    inline def setHostAliases(value: js.Array[HostAliasPatch]): Self = StObject.set(x, "hostAliases", value.asInstanceOf[js.Any])
    
    inline def setHostAliasesVarargs(value: HostAliasPatch*): Self = StObject.set(x, "hostAliases", js.Array(value*))
    
    inline def setHostIPC(value: Boolean): Self = StObject.set(x, "hostIPC", value.asInstanceOf[js.Any])
    
    inline def setHostNetwork(value: Boolean): Self = StObject.set(x, "hostNetwork", value.asInstanceOf[js.Any])
    
    inline def setHostPID(value: Boolean): Self = StObject.set(x, "hostPID", value.asInstanceOf[js.Any])
    
    inline def setHostUsers(value: Boolean): Self = StObject.set(x, "hostUsers", value.asInstanceOf[js.Any])
    
    inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    inline def setImagePullSecrets(value: js.Array[LocalObjectReferencePatch]): Self = StObject.set(x, "imagePullSecrets", value.asInstanceOf[js.Any])
    
    inline def setImagePullSecretsVarargs(value: LocalObjectReferencePatch*): Self = StObject.set(x, "imagePullSecrets", js.Array(value*))
    
    inline def setInitContainers(value: js.Array[ContainerPatch]): Self = StObject.set(x, "initContainers", value.asInstanceOf[js.Any])
    
    inline def setInitContainersVarargs(value: ContainerPatch*): Self = StObject.set(x, "initContainers", js.Array(value*))
    
    inline def setNodeName(value: String): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
    
    inline def setNodeSelector(value: StringDictionary[String]): Self = StObject.set(x, "nodeSelector", value.asInstanceOf[js.Any])
    
    inline def setOs(value: PodOSPatch): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
    
    inline def setOverhead(value: StringDictionary[String]): Self = StObject.set(x, "overhead", value.asInstanceOf[js.Any])
    
    inline def setPreemptionPolicy(value: String): Self = StObject.set(x, "preemptionPolicy", value.asInstanceOf[js.Any])
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityClassName(value: String): Self = StObject.set(x, "priorityClassName", value.asInstanceOf[js.Any])
    
    inline def setReadinessGates(value: js.Array[PodReadinessGatePatch]): Self = StObject.set(x, "readinessGates", value.asInstanceOf[js.Any])
    
    inline def setReadinessGatesVarargs(value: PodReadinessGatePatch*): Self = StObject.set(x, "readinessGates", js.Array(value*))
    
    inline def setRestartPolicy(value: String): Self = StObject.set(x, "restartPolicy", value.asInstanceOf[js.Any])
    
    inline def setRuntimeClassName(value: String): Self = StObject.set(x, "runtimeClassName", value.asInstanceOf[js.Any])
    
    inline def setSchedulerName(value: String): Self = StObject.set(x, "schedulerName", value.asInstanceOf[js.Any])
    
    inline def setSecurityContext(value: PodSecurityContextPatch): Self = StObject.set(x, "securityContext", value.asInstanceOf[js.Any])
    
    inline def setServiceAccount(value: String): Self = StObject.set(x, "serviceAccount", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountName(value: String): Self = StObject.set(x, "serviceAccountName", value.asInstanceOf[js.Any])
    
    inline def setSetHostnameAsFQDN(value: Boolean): Self = StObject.set(x, "setHostnameAsFQDN", value.asInstanceOf[js.Any])
    
    inline def setShareProcessNamespace(value: Boolean): Self = StObject.set(x, "shareProcessNamespace", value.asInstanceOf[js.Any])
    
    inline def setSubdomain(value: String): Self = StObject.set(x, "subdomain", value.asInstanceOf[js.Any])
    
    inline def setTerminationGracePeriodSeconds(value: Double): Self = StObject.set(x, "terminationGracePeriodSeconds", value.asInstanceOf[js.Any])
    
    inline def setTolerations(value: js.Array[TolerationPatch]): Self = StObject.set(x, "tolerations", value.asInstanceOf[js.Any])
    
    inline def setTolerationsVarargs(value: TolerationPatch*): Self = StObject.set(x, "tolerations", js.Array(value*))
    
    inline def setTopologySpreadConstraints(value: js.Array[TopologySpreadConstraintPatch]): Self = StObject.set(x, "topologySpreadConstraints", value.asInstanceOf[js.Any])
    
    inline def setTopologySpreadConstraintsVarargs(value: TopologySpreadConstraintPatch*): Self = StObject.set(x, "topologySpreadConstraints", js.Array(value*))
    
    inline def setVolumes(value: js.Array[VolumePatch]): Self = StObject.set(x, "volumes", value.asInstanceOf[js.Any])
    
    inline def setVolumesVarargs(value: VolumePatch*): Self = StObject.set(x, "volumes", js.Array(value*))
  }
}
