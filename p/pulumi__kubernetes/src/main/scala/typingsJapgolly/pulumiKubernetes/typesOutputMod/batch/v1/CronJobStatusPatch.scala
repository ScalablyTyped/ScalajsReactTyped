package typingsJapgolly.pulumiKubernetes.typesOutputMod.batch.v1

import typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1.ObjectReferencePatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CronJobStatus represents the current state of a cron job.
  */
trait CronJobStatusPatch extends StObject {
  
  /**
    * A list of pointers to currently running jobs.
    */
  var active: js.Array[ObjectReferencePatch]
  
  /**
    * Information when was the last time the job was successfully scheduled.
    */
  var lastScheduleTime: String
  
  /**
    * Information when was the last time the job successfully completed.
    */
  var lastSuccessfulTime: String
}
object CronJobStatusPatch {
  
  inline def apply(active: js.Array[ObjectReferencePatch], lastScheduleTime: String, lastSuccessfulTime: String): CronJobStatusPatch = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], lastScheduleTime = lastScheduleTime.asInstanceOf[js.Any], lastSuccessfulTime = lastSuccessfulTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[CronJobStatusPatch]
  }
  
  extension [Self <: CronJobStatusPatch](x: Self) {
    
    inline def setActive(value: js.Array[ObjectReferencePatch]): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveVarargs(value: ObjectReferencePatch*): Self = StObject.set(x, "active", js.Array(value*))
    
    inline def setLastScheduleTime(value: String): Self = StObject.set(x, "lastScheduleTime", value.asInstanceOf[js.Any])
    
    inline def setLastSuccessfulTime(value: String): Self = StObject.set(x, "lastSuccessfulTime", value.asInstanceOf[js.Any])
  }
}
