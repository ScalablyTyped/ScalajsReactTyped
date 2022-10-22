package typingsJapgolly.pulumiKubernetes.typesInputMod.batch.v1

import typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1.ObjectReference
import typingsJapgolly.pulumiPulumi.outputMod.Input
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
  var active: js.UndefOr[Input[js.Array[Input[ObjectReference]]]] = js.undefined
  
  /**
    * Information when was the last time the job was successfully scheduled.
    */
  var lastScheduleTime: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Information when was the last time the job successfully completed.
    */
  var lastSuccessfulTime: js.UndefOr[Input[String]] = js.undefined
}
object CronJobStatus {
  
  inline def apply(): CronJobStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CronJobStatus]
  }
  
  extension [Self <: CronJobStatus](x: Self) {
    
    inline def setActive(value: Input[js.Array[Input[ObjectReference]]]): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setActiveVarargs(value: Input[ObjectReference]*): Self = StObject.set(x, "active", js.Array(value*))
    
    inline def setLastScheduleTime(value: Input[String]): Self = StObject.set(x, "lastScheduleTime", value.asInstanceOf[js.Any])
    
    inline def setLastScheduleTimeUndefined: Self = StObject.set(x, "lastScheduleTime", js.undefined)
    
    inline def setLastSuccessfulTime(value: Input[String]): Self = StObject.set(x, "lastSuccessfulTime", value.asInstanceOf[js.Any])
    
    inline def setLastSuccessfulTimeUndefined: Self = StObject.set(x, "lastSuccessfulTime", js.undefined)
  }
}
