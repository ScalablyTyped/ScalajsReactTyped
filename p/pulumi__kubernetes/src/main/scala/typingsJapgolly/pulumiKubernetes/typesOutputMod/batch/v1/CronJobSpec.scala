package typingsJapgolly.pulumiKubernetes.typesOutputMod.batch.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CronJobSpec describes how the job execution will look like and when it will actually run.
  */
trait CronJobSpec extends StObject {
  
  /**
    * Specifies how to treat concurrent executions of a Job. Valid values are: - "Allow" (default): allows CronJobs to run concurrently; - "Forbid": forbids concurrent runs, skipping next run if previous run hasn't finished yet; - "Replace": cancels currently running job and replaces it with a new one
    */
  var concurrencyPolicy: String
  
  /**
    * The number of failed finished jobs to retain. Value must be non-negative integer. Defaults to 1.
    */
  var failedJobsHistoryLimit: Double
  
  /**
    * Specifies the job that will be created when executing a CronJob.
    */
  var jobTemplate: JobTemplateSpec
  
  /**
    * The schedule in Cron format, see https://en.wikipedia.org/wiki/Cron.
    */
  var schedule: String
  
  /**
    * Optional deadline in seconds for starting the job if it misses scheduled time for any reason.  Missed jobs executions will be counted as failed ones.
    */
  var startingDeadlineSeconds: Double
  
  /**
    * The number of successful finished jobs to retain. Value must be non-negative integer. Defaults to 3.
    */
  var successfulJobsHistoryLimit: Double
  
  /**
    * This flag tells the controller to suspend subsequent executions, it does not apply to already started executions.  Defaults to false.
    */
  var suspend: Boolean
  
  /**
    * The time zone name for the given schedule, see https://en.wikipedia.org/wiki/List_of_tz_database_time_zones. If not specified, this will default to the time zone of the kube-controller-manager process. The set of valid time zone names and the time zone offset is loaded from the system-wide time zone database by the API server during CronJob validation and the controller manager during execution. If no system-wide time zone database can be found a bundled version of the database is used instead. If the time zone name becomes invalid during the lifetime of a CronJob or due to a change in host configuration, the controller will stop creating new new Jobs and will create a system event with the reason UnknownTimeZone. More information can be found in https://kubernetes.io/docs/concepts/workloads/controllers/cron-jobs/#time-zones This is beta field and must be enabled via the `CronJobTimeZone` feature gate.
    */
  var timeZone: String
}
object CronJobSpec {
  
  inline def apply(
    concurrencyPolicy: String,
    failedJobsHistoryLimit: Double,
    jobTemplate: JobTemplateSpec,
    schedule: String,
    startingDeadlineSeconds: Double,
    successfulJobsHistoryLimit: Double,
    suspend: Boolean,
    timeZone: String
  ): CronJobSpec = {
    val __obj = js.Dynamic.literal(concurrencyPolicy = concurrencyPolicy.asInstanceOf[js.Any], failedJobsHistoryLimit = failedJobsHistoryLimit.asInstanceOf[js.Any], jobTemplate = jobTemplate.asInstanceOf[js.Any], schedule = schedule.asInstanceOf[js.Any], startingDeadlineSeconds = startingDeadlineSeconds.asInstanceOf[js.Any], successfulJobsHistoryLimit = successfulJobsHistoryLimit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], timeZone = timeZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[CronJobSpec]
  }
  
  extension [Self <: CronJobSpec](x: Self) {
    
    inline def setConcurrencyPolicy(value: String): Self = StObject.set(x, "concurrencyPolicy", value.asInstanceOf[js.Any])
    
    inline def setFailedJobsHistoryLimit(value: Double): Self = StObject.set(x, "failedJobsHistoryLimit", value.asInstanceOf[js.Any])
    
    inline def setJobTemplate(value: JobTemplateSpec): Self = StObject.set(x, "jobTemplate", value.asInstanceOf[js.Any])
    
    inline def setSchedule(value: String): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    inline def setStartingDeadlineSeconds(value: Double): Self = StObject.set(x, "startingDeadlineSeconds", value.asInstanceOf[js.Any])
    
    inline def setSuccessfulJobsHistoryLimit(value: Double): Self = StObject.set(x, "successfulJobsHistoryLimit", value.asInstanceOf[js.Any])
    
    inline def setSuspend(value: Boolean): Self = StObject.set(x, "suspend", value.asInstanceOf[js.Any])
    
    inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
  }
}
