package typingsJapgolly.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReleaseGates extends StObject {
  
  var deploymentJobs: js.Array[DeploymentJob]
  
  var id: Double
  
  var lastModifiedOn: js.Date
  
  var runPlanId: String
  
  var stabilizationCompletedOn: js.Date
  
  var startedOn: js.Date
  
  var status: GateStatus
}
object ReleaseGates {
  
  inline def apply(
    deploymentJobs: js.Array[DeploymentJob],
    id: Double,
    lastModifiedOn: js.Date,
    runPlanId: String,
    stabilizationCompletedOn: js.Date,
    startedOn: js.Date,
    status: GateStatus
  ): ReleaseGates = {
    val __obj = js.Dynamic.literal(deploymentJobs = deploymentJobs.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastModifiedOn = lastModifiedOn.asInstanceOf[js.Any], runPlanId = runPlanId.asInstanceOf[js.Any], stabilizationCompletedOn = stabilizationCompletedOn.asInstanceOf[js.Any], startedOn = startedOn.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseGates]
  }
  
  extension [Self <: ReleaseGates](x: Self) {
    
    inline def setDeploymentJobs(value: js.Array[DeploymentJob]): Self = StObject.set(x, "deploymentJobs", value.asInstanceOf[js.Any])
    
    inline def setDeploymentJobsVarargs(value: DeploymentJob*): Self = StObject.set(x, "deploymentJobs", js.Array(value*))
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedOn(value: js.Date): Self = StObject.set(x, "lastModifiedOn", value.asInstanceOf[js.Any])
    
    inline def setRunPlanId(value: String): Self = StObject.set(x, "runPlanId", value.asInstanceOf[js.Any])
    
    inline def setStabilizationCompletedOn(value: js.Date): Self = StObject.set(x, "stabilizationCompletedOn", value.asInstanceOf[js.Any])
    
    inline def setStartedOn(value: js.Date): Self = StObject.set(x, "startedOn", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: GateStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
