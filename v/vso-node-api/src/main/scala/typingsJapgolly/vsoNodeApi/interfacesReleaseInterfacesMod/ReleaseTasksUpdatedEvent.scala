package typingsJapgolly.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReleaseTasksUpdatedEvent
  extends StObject
     with RealtimeReleaseEvent {
  
  var environmentId: Double
  
  var job: ReleaseTask
  
  var releaseDeployPhaseId: Double
  
  var releaseStepId: Double
  
  var tasks: js.Array[ReleaseTask]
}
object ReleaseTasksUpdatedEvent {
  
  inline def apply(
    environmentId: Double,
    job: ReleaseTask,
    projectId: String,
    releaseDeployPhaseId: Double,
    releaseId: Double,
    releaseStepId: Double,
    tasks: js.Array[ReleaseTask]
  ): ReleaseTasksUpdatedEvent = {
    val __obj = js.Dynamic.literal(environmentId = environmentId.asInstanceOf[js.Any], job = job.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], releaseDeployPhaseId = releaseDeployPhaseId.asInstanceOf[js.Any], releaseId = releaseId.asInstanceOf[js.Any], releaseStepId = releaseStepId.asInstanceOf[js.Any], tasks = tasks.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseTasksUpdatedEvent]
  }
  
  extension [Self <: ReleaseTasksUpdatedEvent](x: Self) {
    
    inline def setEnvironmentId(value: Double): Self = StObject.set(x, "environmentId", value.asInstanceOf[js.Any])
    
    inline def setJob(value: ReleaseTask): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
    
    inline def setReleaseDeployPhaseId(value: Double): Self = StObject.set(x, "releaseDeployPhaseId", value.asInstanceOf[js.Any])
    
    inline def setReleaseStepId(value: Double): Self = StObject.set(x, "releaseStepId", value.asInstanceOf[js.Any])
    
    inline def setTasks(value: js.Array[ReleaseTask]): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
    
    inline def setTasksVarargs(value: ReleaseTask*): Self = StObject.set(x, "tasks", js.Array(value*))
  }
}
