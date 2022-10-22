package typingsJapgolly.pulumiKubernetes.typesInputMod.batch

import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.batchSlashv2alpha1
import typingsJapgolly.pulumiKubernetes.typesInputMod.batch.v1.JobSpec
import typingsJapgolly.pulumiKubernetes.typesInputMod.batch.v1.JobSpecPatch
import typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1.ObjectReference
import typingsJapgolly.pulumiKubernetes.typesInputMod.meta.v1.ObjectMeta
import typingsJapgolly.pulumiKubernetes.typesInputMod.meta.v1.ObjectMetaPatch
import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v2alpha1 {
  
  /**
    * CronJob represents the configuration of a single cron job.
    */
  trait CronJob extends StObject {
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    var apiVersion: js.UndefOr[Input[batchSlashv2alpha1]] = js.undefined
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    var kind: js.UndefOr[Input[typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.CronJob]] = js.undefined
    
    /**
      * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
      */
    var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
    
    /**
      * Specification of the desired behavior of a cron job, including the schedule. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
      */
    var spec: js.UndefOr[Input[CronJobSpec]] = js.undefined
    
    /**
      * Current status of a cron job. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
      */
    var status: js.UndefOr[Input[CronJobStatus]] = js.undefined
  }
  object CronJob {
    
    inline def apply(): CronJob = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CronJob]
    }
    
    extension [Self <: CronJob](x: Self) {
      
      inline def setApiVersion(value: Input[batchSlashv2alpha1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      inline def setKind(value: Input[typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.CronJob]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      inline def setMetadata(value: Input[ObjectMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setSpec(value: Input[CronJobSpec]): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      inline def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
      
      inline def setStatus(value: Input[CronJobStatus]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  /**
    * CronJobSpec describes how the job execution will look like and when it will actually run.
    */
  trait CronJobSpec extends StObject {
    
    /**
      * Specifies how to treat concurrent executions of a Job. Valid values are: - "Allow" (default): allows CronJobs to run concurrently; - "Forbid": forbids concurrent runs, skipping next run if previous run hasn't finished yet; - "Replace": cancels currently running job and replaces it with a new one
      */
    var concurrencyPolicy: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The number of failed finished jobs to retain. This is a pointer to distinguish between explicit zero and not specified.
      */
    var failedJobsHistoryLimit: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * Specifies the job that will be created when executing a CronJob.
      */
    var jobTemplate: Input[JobTemplateSpec]
    
    /**
      * The schedule in Cron format, see https://en.wikipedia.org/wiki/Cron.
      */
    var schedule: Input[String]
    
    /**
      * Optional deadline in seconds for starting the job if it misses scheduled time for any reason.  Missed jobs executions will be counted as failed ones.
      */
    var startingDeadlineSeconds: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The number of successful finished jobs to retain. This is a pointer to distinguish between explicit zero and not specified.
      */
    var successfulJobsHistoryLimit: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * This flag tells the controller to suspend subsequent executions, it does not apply to already started executions.  Defaults to false.
      */
    var suspend: js.UndefOr[Input[Boolean]] = js.undefined
  }
  object CronJobSpec {
    
    inline def apply(jobTemplate: Input[JobTemplateSpec], schedule: Input[String]): CronJobSpec = {
      val __obj = js.Dynamic.literal(jobTemplate = jobTemplate.asInstanceOf[js.Any], schedule = schedule.asInstanceOf[js.Any])
      __obj.asInstanceOf[CronJobSpec]
    }
    
    extension [Self <: CronJobSpec](x: Self) {
      
      inline def setConcurrencyPolicy(value: Input[String]): Self = StObject.set(x, "concurrencyPolicy", value.asInstanceOf[js.Any])
      
      inline def setConcurrencyPolicyUndefined: Self = StObject.set(x, "concurrencyPolicy", js.undefined)
      
      inline def setFailedJobsHistoryLimit(value: Input[Double]): Self = StObject.set(x, "failedJobsHistoryLimit", value.asInstanceOf[js.Any])
      
      inline def setFailedJobsHistoryLimitUndefined: Self = StObject.set(x, "failedJobsHistoryLimit", js.undefined)
      
      inline def setJobTemplate(value: Input[JobTemplateSpec]): Self = StObject.set(x, "jobTemplate", value.asInstanceOf[js.Any])
      
      inline def setSchedule(value: Input[String]): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
      
      inline def setStartingDeadlineSeconds(value: Input[Double]): Self = StObject.set(x, "startingDeadlineSeconds", value.asInstanceOf[js.Any])
      
      inline def setStartingDeadlineSecondsUndefined: Self = StObject.set(x, "startingDeadlineSeconds", js.undefined)
      
      inline def setSuccessfulJobsHistoryLimit(value: Input[Double]): Self = StObject.set(x, "successfulJobsHistoryLimit", value.asInstanceOf[js.Any])
      
      inline def setSuccessfulJobsHistoryLimitUndefined: Self = StObject.set(x, "successfulJobsHistoryLimit", js.undefined)
      
      inline def setSuspend(value: Input[Boolean]): Self = StObject.set(x, "suspend", value.asInstanceOf[js.Any])
      
      inline def setSuspendUndefined: Self = StObject.set(x, "suspend", js.undefined)
    }
  }
  
  /**
    * CronJobSpec describes how the job execution will look like and when it will actually run.
    */
  trait CronJobSpecPatch extends StObject {
    
    /**
      * Specifies how to treat concurrent executions of a Job. Valid values are: - "Allow" (default): allows CronJobs to run concurrently; - "Forbid": forbids concurrent runs, skipping next run if previous run hasn't finished yet; - "Replace": cancels currently running job and replaces it with a new one
      */
    var concurrencyPolicy: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The number of failed finished jobs to retain. This is a pointer to distinguish between explicit zero and not specified.
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
      * The number of successful finished jobs to retain. This is a pointer to distinguish between explicit zero and not specified.
      */
    var successfulJobsHistoryLimit: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * This flag tells the controller to suspend subsequent executions, it does not apply to already started executions.  Defaults to false.
      */
    var suspend: js.UndefOr[Input[Boolean]] = js.undefined
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
    }
  }
  
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
    }
  }
  
  /**
    * JobTemplateSpec describes the data a Job should have when created from a template
    */
  trait JobTemplateSpec extends StObject {
    
    /**
      * Standard object's metadata of the jobs created from this template. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
      */
    var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
    
    /**
      * Specification of the desired behavior of the job. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
      */
    var spec: js.UndefOr[Input[JobSpec]] = js.undefined
  }
  object JobTemplateSpec {
    
    inline def apply(): JobTemplateSpec = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JobTemplateSpec]
    }
    
    extension [Self <: JobTemplateSpec](x: Self) {
      
      inline def setMetadata(value: Input[ObjectMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setSpec(value: Input[JobSpec]): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      inline def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
    }
  }
  
  /**
    * JobTemplateSpec describes the data a Job should have when created from a template
    */
  trait JobTemplateSpecPatch extends StObject {
    
    /**
      * Standard object's metadata of the jobs created from this template. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
      */
    var metadata: js.UndefOr[Input[ObjectMetaPatch]] = js.undefined
    
    /**
      * Specification of the desired behavior of the job. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
      */
    var spec: js.UndefOr[Input[JobSpecPatch]] = js.undefined
  }
  object JobTemplateSpecPatch {
    
    inline def apply(): JobTemplateSpecPatch = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JobTemplateSpecPatch]
    }
    
    extension [Self <: JobTemplateSpecPatch](x: Self) {
      
      inline def setMetadata(value: Input[ObjectMetaPatch]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setSpec(value: Input[JobSpecPatch]): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      inline def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
    }
  }
}
