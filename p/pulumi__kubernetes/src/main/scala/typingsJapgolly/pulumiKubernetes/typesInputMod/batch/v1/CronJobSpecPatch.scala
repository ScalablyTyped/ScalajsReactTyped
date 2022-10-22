package typingsJapgolly.pulumiKubernetes.typesInputMod.batch.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CronJobSpec describes how the job execution will look like and when it will actually run.
  */
trait CronJobSpecPatch extends StObject {
  
  /**
    * Specifies how to treat concurrent executions of a Job. Valid values are: - "Allow" (default): allows CronJobs to run concurrently; - "Forbid": forbids concurrent runs, skipping next run if previous run hasn't finished yet; - "Replace": cancels currently running job and replaces it with a new one
    */
  var concurrencyPolicy: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The number of failed finished jobs to retain. Value must be non-negative integer. Defaults to 1.
    */
  var failedJobsHistoryLimit: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * Specifies the job that will be created when executing a CronJob.
    */
  var jobTemplate: js.UndefOr[Input[JobTemplateSpecPatch]] = js.undefined
  
  /**
    * The schedule in Cron format, see https://en.wikipedia.org/wiki/Cron.
    */
  var schedule: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Optional deadline in seconds for starting the job if it misses scheduled time for any reason.  Missed jobs executions will be counted as failed ones.
    */
  var startingDeadlineSeconds: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * The number of successful finished jobs to retain. Value must be non-negative integer. Defaults to 3.
    */
  var successfulJobsHistoryLimit: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * This flag tells the controller to suspend subsequent executions, it does not apply to already started executions.  Defaults to false.
    */
  var suspend: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * The time zone name for the given schedule, see https://en.wikipedia.org/wiki/List_of_tz_database_time_zones. If not specified, this will default to the time zone of the kube-controller-manager process. The set of valid time zone names and the time zone offset is loaded from the system-wide time zone database by the API server during CronJob validation and the controller manager during execution. If no system-wide time zone database can be found a bundled version of the database is used instead. If the time zone name becomes invalid during the lifetime of a CronJob or due to a change in host configuration, the controller will stop creating new new Jobs and will create a system event with the reason UnknownTimeZone. More information can be found in https://kubernetes.io/docs/concepts/workloads/controllers/cron-jobs/#time-zones This is beta field and must be enabled via the `CronJobTimeZone` feature gate.
    */
  var timeZone: js.UndefOr[Input[String]] = js.undefined
}
object CronJobSpecPatch {
  
  inline def apply(): CronJobSpecPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CronJobSpecPatch]
  }
  
  extension [Self <: CronJobSpecPatch](x: Self) {
    
    inline def setConcurrencyPolicy(value: Input[String]): Self = StObject.set(x, "concurrencyPolicy", value.asInstanceOf[js.Any])
    
    inline def setConcurrencyPolicyUndefined: Self = StObject.set(x, "concurrencyPolicy", js.undefined)
    
    inline def setFailedJobsHistoryLimit(value: Input[Double]): Self = StObject.set(x, "failedJobsHistoryLimit", value.asInstanceOf[js.Any])
    
    inline def setFailedJobsHistoryLimitUndefined: Self = StObject.set(x, "failedJobsHistoryLimit", js.undefined)
    
    inline def setJobTemplate(value: Input[JobTemplateSpecPatch]): Self = StObject.set(x, "jobTemplate", value.asInstanceOf[js.Any])
    
    inline def setJobTemplateUndefined: Self = StObject.set(x, "jobTemplate", js.undefined)
    
    inline def setSchedule(value: Input[String]): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    inline def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
    
    inline def setStartingDeadlineSeconds(value: Input[Double]): Self = StObject.set(x, "startingDeadlineSeconds", value.asInstanceOf[js.Any])
    
    inline def setStartingDeadlineSecondsUndefined: Self = StObject.set(x, "startingDeadlineSeconds", js.undefined)
    
    inline def setSuccessfulJobsHistoryLimit(value: Input[Double]): Self = StObject.set(x, "successfulJobsHistoryLimit", value.asInstanceOf[js.Any])
    
    inline def setSuccessfulJobsHistoryLimitUndefined: Self = StObject.set(x, "successfulJobsHistoryLimit", js.undefined)
    
    inline def setSuspend(value: Input[Boolean]): Self = StObject.set(x, "suspend", value.asInstanceOf[js.Any])
    
    inline def setSuspendUndefined: Self = StObject.set(x, "suspend", js.undefined)
    
    inline def setTimeZone(value: Input[String]): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
  }
}
