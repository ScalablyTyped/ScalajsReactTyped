package typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PodSpec is a description of a pod.
  */
trait PodSpec extends StObject {
  
  /**
    * Optional duration in seconds the pod may be active on the node relative to StartTime before the system will actively try to mark it failed and kill associated containers. Value must be a positive integer.
    */
  var activeDeadlineSeconds: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * If specified, the pod's scheduling constraints
    */
  var affinity: js.UndefOr[Input[Affinity]] = js.undefined
  
  /**
    * AutomountServiceAccountToken indicates whether a service account token should be automatically mounted.
    */
  var automountServiceAccountToken: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * List of containers belonging to the pod. Containers cannot currently be added or removed. There must be at least one container in a Pod. Cannot be updated.
    */
  var containers: Input[js.Array[Input[Container]]]
  
  /**
    * Specifies the DNS parameters of a pod. Parameters specified here will be merged to the generated DNS configuration based on DNSPolicy.
    */
  var dnsConfig: js.UndefOr[Input[PodDNSConfig]] = js.undefined
  
  /**
    * Set DNS policy for the pod. Defaults to "ClusterFirst". Valid values are 'ClusterFirstWithHostNet', 'ClusterFirst', 'Default' or 'None'. DNS parameters given in DNSConfig will be merged with the policy selected with DNSPolicy. To have DNS options set along with hostNetwork, you have to specify DNS policy explicitly to 'ClusterFirstWithHostNet'.
    */
  var dnsPolicy: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * EnableServiceLinks indicates whether information about services should be injected into pod's environment variables, matching the syntax of Docker links. Optional: Defaults to true.
    */
  var enableServiceLinks: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * List of ephemeral containers run in this pod. Ephemeral containers may be run in an existing pod to perform user-initiated actions such as debugging. This list cannot be specified when creating a pod, and it cannot be modified by updating the pod spec. In order to add an ephemeral container to an existing pod, use the pod's ephemeralcontainers subresource.
    */
  var ephemeralContainers: js.UndefOr[Input[js.Array[Input[EphemeralContainer]]]] = js.undefined
  
  /**
    * HostAliases is an optional list of hosts and IPs that will be injected into the pod's hosts file if specified. This is only valid for non-hostNetwork pods.
    */
  var hostAliases: js.UndefOr[Input[js.Array[Input[HostAlias]]]] = js.undefined
  
  /**
    * Use the host's ipc namespace. Optional: Default to false.
    */
  var hostIPC: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * Host networking requested for this pod. Use the host's network namespace. If this option is set, the ports that will be used must be specified. Default to false.
    */
  var hostNetwork: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * Use the host's pid namespace. Optional: Default to false.
    */
  var hostPID: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * Use the host's user namespace. Optional: Default to true. If set to true or not present, the pod will be run in the host user namespace, useful for when the pod needs a feature only available to the host user namespace, such as loading a kernel module with CAP_SYS_MODULE. When set to false, a new userns is created for the pod. Setting false is useful for mitigating container breakout vulnerabilities even allowing users to run their containers as root without actually having root privileges on the host. This field is alpha-level and is only honored by servers that enable the UserNamespacesSupport feature.
    */
  var hostUsers: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * Specifies the hostname of the Pod If not specified, the pod's hostname will be set to a system-defined value.
    */
  var hostname: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * ImagePullSecrets is an optional list of references to secrets in the same namespace to use for pulling any of the images used by this PodSpec. If specified, these secrets will be passed to individual puller implementations for them to use. More info: https://kubernetes.io/docs/concepts/containers/images#specifying-imagepullsecrets-on-a-pod
    */
  var imagePullSecrets: js.UndefOr[Input[js.Array[Input[LocalObjectReference]]]] = js.undefined
  
  /**
    * List of initialization containers belonging to the pod. Init containers are executed in order prior to containers being started. If any init container fails, the pod is considered to have failed and is handled according to its restartPolicy. The name for an init container or normal container must be unique among all containers. Init containers may not have Lifecycle actions, Readiness probes, Liveness probes, or Startup probes. The resourceRequirements of an init container are taken into account during scheduling by finding the highest request/limit for each resource type, and then using the max of of that value or the sum of the normal containers. Limits are applied to init containers in a similar fashion. Init containers cannot currently be added or removed. Cannot be updated. More info: https://kubernetes.io/docs/concepts/workloads/pods/init-containers/
    */
  var initContainers: js.UndefOr[Input[js.Array[Input[Container]]]] = js.undefined
  
  /**
    * NodeName is a request to schedule this pod onto a specific node. If it is non-empty, the scheduler simply schedules this pod onto that node, assuming that it fits resource requirements.
    */
  var nodeName: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * NodeSelector is a selector which must be true for the pod to fit on a node. Selector which must match a node's labels for the pod to be scheduled on that node. More info: https://kubernetes.io/docs/concepts/configuration/assign-pod-node/
    */
  var nodeSelector: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  
  /**
    * Specifies the OS of the containers in the pod. Some pod and container fields are restricted if this is set.
    *
    * If the OS field is set to linux, the following fields must be unset: -securityContext.windowsOptions
    *
    * If the OS field is set to windows, following fields must be unset: - spec.hostPID - spec.hostIPC - spec.hostUsers - spec.securityContext.seLinuxOptions - spec.securityContext.seccompProfile - spec.securityContext.fsGroup - spec.securityContext.fsGroupChangePolicy - spec.securityContext.sysctls - spec.shareProcessNamespace - spec.securityContext.runAsUser - spec.securityContext.runAsGroup - spec.securityContext.supplementalGroups - spec.containers[*].securityContext.seLinuxOptions - spec.containers[*].securityContext.seccompProfile - spec.containers[*].securityContext.capabilities - spec.containers[*].securityContext.readOnlyRootFilesystem - spec.containers[*].securityContext.privileged - spec.containers[*].securityContext.allowPrivilegeEscalation - spec.containers[*].securityContext.procMount - spec.containers[*].securityContext.runAsUser - spec.containers[*].securityContext.runAsGroup
    */
  var os: js.UndefOr[Input[PodOS]] = js.undefined
  
  /**
    * Overhead represents the resource overhead associated with running a pod for a given RuntimeClass. This field will be autopopulated at admission time by the RuntimeClass admission controller. If the RuntimeClass admission controller is enabled, overhead must not be set in Pod create requests. The RuntimeClass admission controller will reject Pod create requests which have the overhead already set. If RuntimeClass is configured and selected in the PodSpec, Overhead will be set to the value defined in the corresponding RuntimeClass, otherwise it will remain unset and treated as zero. More info: https://git.k8s.io/enhancements/keps/sig-node/688-pod-overhead/README.md
    */
  var overhead: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  
  /**
    * PreemptionPolicy is the Policy for preempting pods with lower priority. One of Never, PreemptLowerPriority. Defaults to PreemptLowerPriority if unset.
    */
  var preemptionPolicy: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The priority value. Various system components use this field to find the priority of the pod. When Priority Admission Controller is enabled, it prevents users from setting this field. The admission controller populates this field from PriorityClassName. The higher the value, the higher the priority.
    */
  var priority: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * If specified, indicates the pod's priority. "system-node-critical" and "system-cluster-critical" are two special keywords which indicate the highest priorities with the former being the highest priority. Any other name must be defined by creating a PriorityClass object with that name. If not specified, the pod priority will be default or zero if there is no default.
    */
  var priorityClassName: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * If specified, all readiness gates will be evaluated for pod readiness. A pod is ready when all its containers are ready AND all conditions specified in the readiness gates have status equal to "True" More info: https://git.k8s.io/enhancements/keps/sig-network/580-pod-readiness-gates
    */
  var readinessGates: js.UndefOr[Input[js.Array[Input[PodReadinessGate]]]] = js.undefined
  
  /**
    * Restart policy for all containers within the pod. One of Always, OnFailure, Never. Default to Always. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy
    */
  var restartPolicy: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * RuntimeClassName refers to a RuntimeClass object in the node.k8s.io group, which should be used to run this pod.  If no RuntimeClass resource matches the named class, the pod will not be run. If unset or empty, the "legacy" RuntimeClass will be used, which is an implicit class with an empty definition that uses the default runtime handler. More info: https://git.k8s.io/enhancements/keps/sig-node/585-runtime-class
    */
  var runtimeClassName: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * If specified, the pod will be dispatched by specified scheduler. If not specified, the pod will be dispatched by default scheduler.
    */
  var schedulerName: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * SecurityContext holds pod-level security attributes and common container settings. Optional: Defaults to empty.  See type description for default values of each field.
    */
  var securityContext: js.UndefOr[Input[PodSecurityContext]] = js.undefined
  
  /**
    * DeprecatedServiceAccount is a depreciated alias for ServiceAccountName. Deprecated: Use serviceAccountName instead.
    */
  var serviceAccount: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * ServiceAccountName is the name of the ServiceAccount to use to run this pod. More info: https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/
    */
  var serviceAccountName: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * If true the pod's hostname will be configured as the pod's FQDN, rather than the leaf name (the default). In Linux containers, this means setting the FQDN in the hostname field of the kernel (the nodename field of struct utsname). In Windows containers, this means setting the registry value of hostname for the registry key HKEY_LOCAL_MACHINE\SYSTEM\CurrentControlSet\Services\Tcpip\Parameters to FQDN. If a pod does not have FQDN, this has no effect. Default to false.
    */
  var setHostnameAsFQDN: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * Share a single process namespace between all of the containers in a pod. When this is set containers will be able to view and signal processes from other containers in the same pod, and the first process in each container will not be assigned PID 1. HostPID and ShareProcessNamespace cannot both be set. Optional: Default to false.
    */
  var shareProcessNamespace: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * If specified, the fully qualified Pod hostname will be "<hostname>.<subdomain>.<pod namespace>.svc.<cluster domain>". If not specified, the pod will not have a domainname at all.
    */
  var subdomain: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Optional duration in seconds the pod needs to terminate gracefully. May be decreased in delete request. Value must be non-negative integer. The value zero indicates stop immediately via the kill signal (no opportunity to shut down). If this value is nil, the default grace period will be used instead. The grace period is the duration in seconds after the processes running in the pod are sent a termination signal and the time when the processes are forcibly halted with a kill signal. Set this value longer than the expected cleanup time for your process. Defaults to 30 seconds.
    */
  var terminationGracePeriodSeconds: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * If specified, the pod's tolerations.
    */
  var tolerations: js.UndefOr[Input[js.Array[Input[Toleration]]]] = js.undefined
  
  /**
    * TopologySpreadConstraints describes how a group of pods ought to spread across topology domains. Scheduler will schedule pods in a way which abides by the constraints. All topologySpreadConstraints are ANDed.
    */
  var topologySpreadConstraints: js.UndefOr[Input[js.Array[Input[TopologySpreadConstraint]]]] = js.undefined
  
  /**
    * List of volumes that can be mounted by containers belonging to the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes
    */
  var volumes: js.UndefOr[Input[js.Array[Input[Volume]]]] = js.undefined
}
object PodSpec {
  
  inline def apply(containers: Input[js.Array[Input[Container]]]): PodSpec = {
    val __obj = js.Dynamic.literal(containers = containers.asInstanceOf[js.Any])
    __obj.asInstanceOf[PodSpec]
  }
  
  extension [Self <: PodSpec](x: Self) {
    
    inline def setActiveDeadlineSeconds(value: Input[Double]): Self = StObject.set(x, "activeDeadlineSeconds", value.asInstanceOf[js.Any])
    
    inline def setActiveDeadlineSecondsUndefined: Self = StObject.set(x, "activeDeadlineSeconds", js.undefined)
    
    inline def setAffinity(value: Input[Affinity]): Self = StObject.set(x, "affinity", value.asInstanceOf[js.Any])
    
    inline def setAffinityUndefined: Self = StObject.set(x, "affinity", js.undefined)
    
    inline def setAutomountServiceAccountToken(value: Input[Boolean]): Self = StObject.set(x, "automountServiceAccountToken", value.asInstanceOf[js.Any])
    
    inline def setAutomountServiceAccountTokenUndefined: Self = StObject.set(x, "automountServiceAccountToken", js.undefined)
    
    inline def setContainers(value: Input[js.Array[Input[Container]]]): Self = StObject.set(x, "containers", value.asInstanceOf[js.Any])
    
    inline def setContainersVarargs(value: Input[Container]*): Self = StObject.set(x, "containers", js.Array(value*))
    
    inline def setDnsConfig(value: Input[PodDNSConfig]): Self = StObject.set(x, "dnsConfig", value.asInstanceOf[js.Any])
    
    inline def setDnsConfigUndefined: Self = StObject.set(x, "dnsConfig", js.undefined)
    
    inline def setDnsPolicy(value: Input[String]): Self = StObject.set(x, "dnsPolicy", value.asInstanceOf[js.Any])
    
    inline def setDnsPolicyUndefined: Self = StObject.set(x, "dnsPolicy", js.undefined)
    
    inline def setEnableServiceLinks(value: Input[Boolean]): Self = StObject.set(x, "enableServiceLinks", value.asInstanceOf[js.Any])
    
    inline def setEnableServiceLinksUndefined: Self = StObject.set(x, "enableServiceLinks", js.undefined)
    
    inline def setEphemeralContainers(value: Input[js.Array[Input[EphemeralContainer]]]): Self = StObject.set(x, "ephemeralContainers", value.asInstanceOf[js.Any])
    
    inline def setEphemeralContainersUndefined: Self = StObject.set(x, "ephemeralContainers", js.undefined)
    
    inline def setEphemeralContainersVarargs(value: Input[EphemeralContainer]*): Self = StObject.set(x, "ephemeralContainers", js.Array(value*))
    
    inline def setHostAliases(value: Input[js.Array[Input[HostAlias]]]): Self = StObject.set(x, "hostAliases", value.asInstanceOf[js.Any])
    
    inline def setHostAliasesUndefined: Self = StObject.set(x, "hostAliases", js.undefined)
    
    inline def setHostAliasesVarargs(value: Input[HostAlias]*): Self = StObject.set(x, "hostAliases", js.Array(value*))
    
    inline def setHostIPC(value: Input[Boolean]): Self = StObject.set(x, "hostIPC", value.asInstanceOf[js.Any])
    
    inline def setHostIPCUndefined: Self = StObject.set(x, "hostIPC", js.undefined)
    
    inline def setHostNetwork(value: Input[Boolean]): Self = StObject.set(x, "hostNetwork", value.asInstanceOf[js.Any])
    
    inline def setHostNetworkUndefined: Self = StObject.set(x, "hostNetwork", js.undefined)
    
    inline def setHostPID(value: Input[Boolean]): Self = StObject.set(x, "hostPID", value.asInstanceOf[js.Any])
    
    inline def setHostPIDUndefined: Self = StObject.set(x, "hostPID", js.undefined)
    
    inline def setHostUsers(value: Input[Boolean]): Self = StObject.set(x, "hostUsers", value.asInstanceOf[js.Any])
    
    inline def setHostUsersUndefined: Self = StObject.set(x, "hostUsers", js.undefined)
    
    inline def setHostname(value: Input[String]): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
    
    inline def setImagePullSecrets(value: Input[js.Array[Input[LocalObjectReference]]]): Self = StObject.set(x, "imagePullSecrets", value.asInstanceOf[js.Any])
    
    inline def setImagePullSecretsUndefined: Self = StObject.set(x, "imagePullSecrets", js.undefined)
    
    inline def setImagePullSecretsVarargs(value: Input[LocalObjectReference]*): Self = StObject.set(x, "imagePullSecrets", js.Array(value*))
    
    inline def setInitContainers(value: Input[js.Array[Input[Container]]]): Self = StObject.set(x, "initContainers", value.asInstanceOf[js.Any])
    
    inline def setInitContainersUndefined: Self = StObject.set(x, "initContainers", js.undefined)
    
    inline def setInitContainersVarargs(value: Input[Container]*): Self = StObject.set(x, "initContainers", js.Array(value*))
    
    inline def setNodeName(value: Input[String]): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
    
    inline def setNodeNameUndefined: Self = StObject.set(x, "nodeName", js.undefined)
    
    inline def setNodeSelector(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "nodeSelector", value.asInstanceOf[js.Any])
    
    inline def setNodeSelectorUndefined: Self = StObject.set(x, "nodeSelector", js.undefined)
    
    inline def setOs(value: Input[PodOS]): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
    
    inline def setOsUndefined: Self = StObject.set(x, "os", js.undefined)
    
    inline def setOverhead(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "overhead", value.asInstanceOf[js.Any])
    
    inline def setOverheadUndefined: Self = StObject.set(x, "overhead", js.undefined)
    
    inline def setPreemptionPolicy(value: Input[String]): Self = StObject.set(x, "preemptionPolicy", value.asInstanceOf[js.Any])
    
    inline def setPreemptionPolicyUndefined: Self = StObject.set(x, "preemptionPolicy", js.undefined)
    
    inline def setPriority(value: Input[Double]): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityClassName(value: Input[String]): Self = StObject.set(x, "priorityClassName", value.asInstanceOf[js.Any])
    
    inline def setPriorityClassNameUndefined: Self = StObject.set(x, "priorityClassName", js.undefined)
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setReadinessGates(value: Input[js.Array[Input[PodReadinessGate]]]): Self = StObject.set(x, "readinessGates", value.asInstanceOf[js.Any])
    
    inline def setReadinessGatesUndefined: Self = StObject.set(x, "readinessGates", js.undefined)
    
    inline def setReadinessGatesVarargs(value: Input[PodReadinessGate]*): Self = StObject.set(x, "readinessGates", js.Array(value*))
    
    inline def setRestartPolicy(value: Input[String]): Self = StObject.set(x, "restartPolicy", value.asInstanceOf[js.Any])
    
    inline def setRestartPolicyUndefined: Self = StObject.set(x, "restartPolicy", js.undefined)
    
    inline def setRuntimeClassName(value: Input[String]): Self = StObject.set(x, "runtimeClassName", value.asInstanceOf[js.Any])
    
    inline def setRuntimeClassNameUndefined: Self = StObject.set(x, "runtimeClassName", js.undefined)
    
    inline def setSchedulerName(value: Input[String]): Self = StObject.set(x, "schedulerName", value.asInstanceOf[js.Any])
    
    inline def setSchedulerNameUndefined: Self = StObject.set(x, "schedulerName", js.undefined)
    
    inline def setSecurityContext(value: Input[PodSecurityContext]): Self = StObject.set(x, "securityContext", value.asInstanceOf[js.Any])
    
    inline def setSecurityContextUndefined: Self = StObject.set(x, "securityContext", js.undefined)
    
    inline def setServiceAccount(value: Input[String]): Self = StObject.set(x, "serviceAccount", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountName(value: Input[String]): Self = StObject.set(x, "serviceAccountName", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountNameUndefined: Self = StObject.set(x, "serviceAccountName", js.undefined)
    
    inline def setServiceAccountUndefined: Self = StObject.set(x, "serviceAccount", js.undefined)
    
    inline def setSetHostnameAsFQDN(value: Input[Boolean]): Self = StObject.set(x, "setHostnameAsFQDN", value.asInstanceOf[js.Any])
    
    inline def setSetHostnameAsFQDNUndefined: Self = StObject.set(x, "setHostnameAsFQDN", js.undefined)
    
    inline def setShareProcessNamespace(value: Input[Boolean]): Self = StObject.set(x, "shareProcessNamespace", value.asInstanceOf[js.Any])
    
    inline def setShareProcessNamespaceUndefined: Self = StObject.set(x, "shareProcessNamespace", js.undefined)
    
    inline def setSubdomain(value: Input[String]): Self = StObject.set(x, "subdomain", value.asInstanceOf[js.Any])
    
    inline def setSubdomainUndefined: Self = StObject.set(x, "subdomain", js.undefined)
    
    inline def setTerminationGracePeriodSeconds(value: Input[Double]): Self = StObject.set(x, "terminationGracePeriodSeconds", value.asInstanceOf[js.Any])
    
    inline def setTerminationGracePeriodSecondsUndefined: Self = StObject.set(x, "terminationGracePeriodSeconds", js.undefined)
    
    inline def setTolerations(value: Input[js.Array[Input[Toleration]]]): Self = StObject.set(x, "tolerations", value.asInstanceOf[js.Any])
    
    inline def setTolerationsUndefined: Self = StObject.set(x, "tolerations", js.undefined)
    
    inline def setTolerationsVarargs(value: Input[Toleration]*): Self = StObject.set(x, "tolerations", js.Array(value*))
    
    inline def setTopologySpreadConstraints(value: Input[js.Array[Input[TopologySpreadConstraint]]]): Self = StObject.set(x, "topologySpreadConstraints", value.asInstanceOf[js.Any])
    
    inline def setTopologySpreadConstraintsUndefined: Self = StObject.set(x, "topologySpreadConstraints", js.undefined)
    
    inline def setTopologySpreadConstraintsVarargs(value: Input[TopologySpreadConstraint]*): Self = StObject.set(x, "topologySpreadConstraints", js.Array(value*))
    
    inline def setVolumes(value: Input[js.Array[Input[Volume]]]): Self = StObject.set(x, "volumes", value.asInstanceOf[js.Any])
    
    inline def setVolumesUndefined: Self = StObject.set(x, "volumes", js.undefined)
    
    inline def setVolumesVarargs(value: Input[Volume]*): Self = StObject.set(x, "volumes", js.Array(value*))
  }
}
