package typingsJapgolly.pulumiKubernetes.typesOutputMod.batch.v1

import typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1.ObjectReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CronJobStatus represents the current state of a cron job.
  */
trait CronJobStatus extends StObject {
  
  /**
    * A list of pointers to currently running jobs.
    */
  var active: js.Array[ObjectReference]
  
  /**
    * Information when was the last time the job was successfully scheduled.
    */
  var lastScheduleTime: String
  
  /**
    * Information when was the last time the job successfully completed.
    */
  var lastSuccessfulTime: String
}
object CronJobStatus {
  
  inline def apply(active: js.Array[ObjectReference], lastScheduleTime: String, lastSuccessfulTime: String): CronJobStatus = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], lastScheduleTime = lastScheduleTime.asInstanceOf[js.Any], lastSuccessfulTime = lastSuccessfulTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[CronJobStatus]
  }
  
  extension [Self <: CronJobStatus](x: Self) {
    
    inline def setActive(value: js.Array[ObjectReference]): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveVarargs(value: ObjectReference*): Self = StObject.set(x, "active", js.Array(value*))
    
    inline def setLastScheduleTime(value: String): Self = StObject.set(x, "lastScheduleTime", value.asInstanceOf[js.Any])
    
    inline def setLastSuccessfulTime(value: String): Self = StObject.set(x, "lastSuccessfulTime", value.asInstanceOf[js.Any])
  }
}
