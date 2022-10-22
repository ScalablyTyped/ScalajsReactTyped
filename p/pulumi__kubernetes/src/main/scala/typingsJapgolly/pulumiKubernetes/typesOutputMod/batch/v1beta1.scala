package typingsJapgolly.pulumiKubernetes.typesOutputMod.batch

import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.batchSlashv1beta1
import typingsJapgolly.pulumiKubernetes.typesOutputMod.batch.v1.JobSpec
import typingsJapgolly.pulumiKubernetes.typesOutputMod.batch.v1.JobSpecPatch
import typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1.ObjectReference
import typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1.ObjectReferencePatch
import typingsJapgolly.pulumiKubernetes.typesOutputMod.meta.v1.ObjectMeta
import typingsJapgolly.pulumiKubernetes.typesOutputMod.meta.v1.ObjectMetaPatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v1beta1 {
  
  /**
    * CronJob represents the configuration of a single cron job.
    */
  trait CronJob extends StObject {
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    var apiVersion: batchSlashv1beta1
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    var kind: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.CronJob
    
    /**
      * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
      */
    var metadata: ObjectMeta
    
    /**
      * Specification of the desired behavior of a cron job, including the schedule. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
      */
    var spec: CronJobSpec
    
    /**
      * Current status of a cron job. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
      */
    var status: CronJobStatus
  }
  object CronJob {
    
    inline def apply(metadata: ObjectMeta, spec: CronJobSpec, status: CronJobStatus): CronJob = {
      val __obj = js.Dynamic.literal(apiVersion = "batch/v1beta1", kind = "CronJob", metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[CronJob]
    }
    
    extension [Self <: CronJob](x: Self) {
      
      inline def setApiVersion(value: batchSlashv1beta1): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setKind(value: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.CronJob): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: ObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setSpec(value: CronJobSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: CronJobStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * CronJobSpec describes how the job execution will look like and when it will actually run.
    */
  trait CronJobSpec extends StObject {
    
    /**
      * Specifies how to treat concurrent executions of a Job. Valid values are: - "Allow" (default): allows CronJobs to run concurrently; - "Forbid": forbids concurrent runs, skipping next run if previous run hasn't finished yet; - "Replace": cancels currently running job and replaces it with a new one
      */
    var concurrencyPolicy: String
    
    /**
      * The number of failed finished jobs to retain. This is a pointer to distinguish between explicit zero and not specified. Defaults to 1.
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
      * The number of successful finished jobs to retain. This is a pointer to distinguish between explicit zero and not specified. Defaults to 3.
      */
    var successfulJobsHistoryLimit: Double
    
    /**
      * This flag tells the controller to suspend subsequent executions, it does not apply to already started executions.  Defaults to false.
      */
    var suspend: Boolean
  }
  object CronJobSpec {
    
    inline def apply(
      concurrencyPolicy: String,
      failedJobsHistoryLimit: Double,
      jobTemplate: JobTemplateSpec,
      schedule: String,
      startingDeadlineSeconds: Double,
      successfulJobsHistoryLimit: Double,
      suspend: Boolean
    ): CronJobSpec = {
      val __obj = js.Dynamic.literal(concurrencyPolicy = concurrencyPolicy.asInstanceOf[js.Any], failedJobsHistoryLimit = failedJobsHistoryLimit.asInstanceOf[js.Any], jobTemplate = jobTemplate.asInstanceOf[js.Any], schedule = schedule.asInstanceOf[js.Any], startingDeadlineSeconds = startingDeadlineSeconds.asInstanceOf[js.Any], successfulJobsHistoryLimit = successfulJobsHistoryLimit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any])
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
    }
  }
  
  /**
    * CronJobSpec describes how the job execution will look like and when it will actually run.
    */
  trait CronJobSpecPatch extends StObject {
    
    /**
      * Specifies how to treat concurrent executions of a Job. Valid values are: - "Allow" (default): allows CronJobs to run concurrently; - "Forbid": forbids concurrent runs, skipping next run if previous run hasn't finished yet; - "Replace": cancels currently running job and replaces it with a new one
      */
    var concurrencyPolicy: String
    
    /**
      * The number of failed finished jobs to retain. This is a pointer to distinguish between explicit zero and not specified. Defaults to 1.
      */
    var failedJobsHistoryLimit: Double
    
    /**
      * Specifies the job that will be created when executing a CronJob.
      */
    var jobTemplate: JobTemplateSpecPatch
    
    /**
      * The schedule in Cron format, see https://en.wikipedia.org/wiki/Cron.
      */
    var schedule: String
    
    /**
      * Optional deadline in seconds for starting the job if it misses scheduled time for any reason.  Missed jobs executions will be counted as failed ones.
      */
    var startingDeadlineSeconds: Double
    
    /**
      * The number of successful finished jobs to retain. This is a pointer to distinguish between explicit zero and not specified. Defaults to 3.
      */
    var successfulJobsHistoryLimit: Double
    
    /**
      * This flag tells the controller to suspend subsequent executions, it does not apply to already started executions.  Defaults to false.
      */
    var suspend: Boolean
  }
  object CronJobSpecPatch {
    
    inline def apply(
      concurrencyPolicy: String,
      failedJobsHistoryLimit: Double,
      jobTemplate: JobTemplateSpecPatch,
      schedule: String,
      startingDeadlineSeconds: Double,
      successfulJobsHistoryLimit: Double,
      suspend: Boolean
    ): CronJobSpecPatch = {
      val __obj = js.Dynamic.literal(concurrencyPolicy = concurrencyPolicy.asInstanceOf[js.Any], failedJobsHistoryLimit = failedJobsHistoryLimit.asInstanceOf[js.Any], jobTemplate = jobTemplate.asInstanceOf[js.Any], schedule = schedule.asInstanceOf[js.Any], startingDeadlineSeconds = startingDeadlineSeconds.asInstanceOf[js.Any], successfulJobsHistoryLimit = successfulJobsHistoryLimit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any])
      __obj.asInstanceOf[CronJobSpecPatch]
    }
    
    extension [Self <: CronJobSpecPatch](x: Self) {
      
      inline def setConcurrencyPolicy(value: String): Self = StObject.set(x, "concurrencyPolicy", value.asInstanceOf[js.Any])
      
      inline def setFailedJobsHistoryLimit(value: Double): Self = StObject.set(x, "failedJobsHistoryLimit", value.asInstanceOf[js.Any])
      
      inline def setJobTemplate(value: JobTemplateSpecPatch): Self = StObject.set(x, "jobTemplate", value.asInstanceOf[js.Any])
      
      inline def setSchedule(value: String): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
      
      inline def setStartingDeadlineSeconds(value: Double): Self = StObject.set(x, "startingDeadlineSeconds", value.asInstanceOf[js.Any])
      
      inline def setSuccessfulJobsHistoryLimit(value: Double): Self = StObject.set(x, "successfulJobsHistoryLimit", value.asInstanceOf[js.Any])
      
      inline def setSuspend(value: Boolean): Self = StObject.set(x, "suspend", value.asInstanceOf[js.Any])
    }
  }
  
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
  }
  object CronJobStatus {
    
    inline def apply(active: js.Array[ObjectReference], lastScheduleTime: String): CronJobStatus = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], lastScheduleTime = lastScheduleTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[CronJobStatus]
    }
    
    extension [Self <: CronJobStatus](x: Self) {
      
      inline def setActive(value: js.Array[ObjectReference]): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveVarargs(value: ObjectReference*): Self = StObject.set(x, "active", js.Array(value*))
      
      inline def setLastScheduleTime(value: String): Self = StObject.set(x, "lastScheduleTime", value.asInstanceOf[js.Any])
    }
  }
  
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
  }
  object CronJobStatusPatch {
    
    inline def apply(active: js.Array[ObjectReferencePatch], lastScheduleTime: String): CronJobStatusPatch = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], lastScheduleTime = lastScheduleTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[CronJobStatusPatch]
    }
    
    extension [Self <: CronJobStatusPatch](x: Self) {
      
      inline def setActive(value: js.Array[ObjectReferencePatch]): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveVarargs(value: ObjectReferencePatch*): Self = StObject.set(x, "active", js.Array(value*))
      
      inline def setLastScheduleTime(value: String): Self = StObject.set(x, "lastScheduleTime", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * JobTemplateSpec describes the data a Job should have when created from a template
    */
  trait JobTemplateSpec extends StObject {
    
    /**
      * Standard object's metadata of the jobs created from this template. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
      */
    var metadata: ObjectMeta
    
    /**
      * Specification of the desired behavior of the job. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
      */
    var spec: JobSpec
  }
  object JobTemplateSpec {
    
    inline def apply(metadata: ObjectMeta, spec: JobSpec): JobTemplateSpec = {
      val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
      __obj.asInstanceOf[JobTemplateSpec]
    }
    
    extension [Self <: JobTemplateSpec](x: Self) {
      
      inline def setMetadata(value: ObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setSpec(value: JobSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * JobTemplateSpec describes the data a Job should have when created from a template
    */
  trait JobTemplateSpecPatch extends StObject {
    
    /**
      * Standard object's metadata of the jobs created from this template. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
      */
    var metadata: ObjectMetaPatch
    
    /**
      * Specification of the desired behavior of the job. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
      */
    var spec: JobSpecPatch
  }
  object JobTemplateSpecPatch {
    
    inline def apply(metadata: ObjectMetaPatch, spec: JobSpecPatch): JobTemplateSpecPatch = {
      val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
      __obj.asInstanceOf[JobTemplateSpecPatch]
    }
    
    extension [Self <: JobTemplateSpecPatch](x: Self) {
      
      inline def setMetadata(value: ObjectMetaPatch): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setSpec(value: JobSpecPatch): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    }
  }
}
