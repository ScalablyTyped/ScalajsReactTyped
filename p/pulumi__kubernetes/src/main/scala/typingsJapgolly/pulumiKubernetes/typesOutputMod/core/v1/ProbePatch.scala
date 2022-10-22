package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Probe describes a health check to be performed against a container to determine whether it is alive or ready to receive traffic.
  */
trait ProbePatch extends StObject {
  
  /**
    * Exec specifies the action to take.
    */
  var exec: ExecActionPatch
  
  /**
    * Minimum consecutive failures for the probe to be considered failed after having succeeded. Defaults to 3. Minimum value is 1.
    */
  var failureThreshold: Double
  
  /**
    * GRPC specifies an action involving a GRPC port. This is a beta field and requires enabling GRPCContainerProbe feature gate.
    */
  var grpc: GRPCActionPatch
  
  /**
    * HTTPGet specifies the http request to perform.
    */
  var httpGet: HTTPGetActionPatch
  
  /**
    * Number of seconds after the container has started before liveness probes are initiated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
    */
  var initialDelaySeconds: Double
  
  /**
    * How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1.
    */
  var periodSeconds: Double
  
  /**
    * Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1. Must be 1 for liveness and startup. Minimum value is 1.
    */
  var successThreshold: Double
  
  /**
    * TCPSocket specifies an action involving a TCP port.
    */
  var tcpSocket: TCPSocketActionPatch
  
  /**
    * Optional duration in seconds the pod needs to terminate gracefully upon probe failure. The grace period is the duration in seconds after the processes running in the pod are sent a termination signal and the time when the processes are forcibly halted with a kill signal. Set this value longer than the expected cleanup time for your process. If this value is nil, the pod's terminationGracePeriodSeconds will be used. Otherwise, this value overrides the value provided by the pod spec. Value must be non-negative integer. The value zero indicates stop immediately via the kill signal (no opportunity to shut down). This is a beta field and requires enabling ProbeTerminationGracePeriod feature gate. Minimum value is 1. spec.terminationGracePeriodSeconds is used if unset.
    */
  var terminationGracePeriodSeconds: Double
  
  /**
    * Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is 1. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
    */
  var timeoutSeconds: Double
}
object ProbePatch {
  
  inline def apply(
    exec: ExecActionPatch,
    failureThreshold: Double,
    grpc: GRPCActionPatch,
    httpGet: HTTPGetActionPatch,
    initialDelaySeconds: Double,
    periodSeconds: Double,
    successThreshold: Double,
    tcpSocket: TCPSocketActionPatch,
    terminationGracePeriodSeconds: Double,
    timeoutSeconds: Double
  ): ProbePatch = {
    val __obj = js.Dynamic.literal(exec = exec.asInstanceOf[js.Any], failureThreshold = failureThreshold.asInstanceOf[js.Any], grpc = grpc.asInstanceOf[js.Any], httpGet = httpGet.asInstanceOf[js.Any], initialDelaySeconds = initialDelaySeconds.asInstanceOf[js.Any], periodSeconds = periodSeconds.asInstanceOf[js.Any], successThreshold = successThreshold.asInstanceOf[js.Any], tcpSocket = tcpSocket.asInstanceOf[js.Any], terminationGracePeriodSeconds = terminationGracePeriodSeconds.asInstanceOf[js.Any], timeoutSeconds = timeoutSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProbePatch]
  }
  
  extension [Self <: ProbePatch](x: Self) {
    
    inline def setExec(value: ExecActionPatch): Self = StObject.set(x, "exec", value.asInstanceOf[js.Any])
    
    inline def setFailureThreshold(value: Double): Self = StObject.set(x, "failureThreshold", value.asInstanceOf[js.Any])
    
    inline def setGrpc(value: GRPCActionPatch): Self = StObject.set(x, "grpc", value.asInstanceOf[js.Any])
    
    inline def setHttpGet(value: HTTPGetActionPatch): Self = StObject.set(x, "httpGet", value.asInstanceOf[js.Any])
    
    inline def setInitialDelaySeconds(value: Double): Self = StObject.set(x, "initialDelaySeconds", value.asInstanceOf[js.Any])
    
    inline def setPeriodSeconds(value: Double): Self = StObject.set(x, "periodSeconds", value.asInstanceOf[js.Any])
    
    inline def setSuccessThreshold(value: Double): Self = StObject.set(x, "successThreshold", value.asInstanceOf[js.Any])
    
    inline def setTcpSocket(value: TCPSocketActionPatch): Self = StObject.set(x, "tcpSocket", value.asInstanceOf[js.Any])
    
    inline def setTerminationGracePeriodSeconds(value: Double): Self = StObject.set(x, "terminationGracePeriodSeconds", value.asInstanceOf[js.Any])
    
    inline def setTimeoutSeconds(value: Double): Self = StObject.set(x, "timeoutSeconds", value.asInstanceOf[js.Any])
  }
}
