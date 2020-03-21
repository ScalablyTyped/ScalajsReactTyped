package typingsJapgolly.pulumiKubernetes

import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/batch", JSImport.Namespace)
@js.native
object batchMod extends js.Object {
  @js.native
  object v1 extends js.Object {
    @js.native
    class Job protected ()
      extends typingsJapgolly.pulumiKubernetes.batchV1Mod.Job {
      /**
        * Create a batch.v1.Job resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: typingsJapgolly.pulumiKubernetes.inputMod.batch.v1.Job) = this()
      def this(
        name: String,
        args: typingsJapgolly.pulumiKubernetes.inputMod.batch.v1.Job,
        opts: CustomResourceOptions
      ) = this()
    }
    
    @js.native
    class JobList protected ()
      extends typingsJapgolly.pulumiKubernetes.batchV1Mod.JobList {
      /**
        * Create a batch.v1.JobList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: typingsJapgolly.pulumiKubernetes.inputMod.batch.v1.JobList) = this()
      def this(
        name: String,
        args: typingsJapgolly.pulumiKubernetes.inputMod.batch.v1.JobList,
        opts: CustomResourceOptions
      ) = this()
    }
    
    /* static members */
    @js.native
    object Job extends js.Object {
      /**
        * Get the state of an existing `Job` resource, as identified by `id`.
        * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
        * Kubernetes convention) the ID becomes `default/<name>`.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.jobMod.Job = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.jobMod.Job = js.native
      /**
        * Returns true if the given object is an instance of Job.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/batch/v1/Job.Job */ Boolean = js.native
    }
    
    /* static members */
    @js.native
    object JobList extends js.Object {
      /**
        * Get the state of an existing `JobList` resource, as identified by `id`.
        * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
        * Kubernetes convention) the ID becomes `default/<name>`.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.jobListMod.JobList = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.jobListMod.JobList = js.native
      /**
        * Returns true if the given object is an instance of JobList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/batch/v1/JobList.JobList */ Boolean = js.native
    }
    
  }
  
  @js.native
  object v1beta1 extends js.Object {
    @js.native
    class CronJob protected ()
      extends typingsJapgolly.pulumiKubernetes.batchV1beta1Mod.CronJob {
      /**
        * Create a batch.v1beta1.CronJob resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: typingsJapgolly.pulumiKubernetes.inputMod.batch.v1beta1.CronJob) = this()
      def this(
        name: String,
        args: typingsJapgolly.pulumiKubernetes.inputMod.batch.v1beta1.CronJob,
        opts: CustomResourceOptions
      ) = this()
    }
    
    @js.native
    class CronJobList protected ()
      extends typingsJapgolly.pulumiKubernetes.batchV1beta1Mod.CronJobList {
      /**
        * Create a batch.v1beta1.CronJobList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: typingsJapgolly.pulumiKubernetes.inputMod.batch.v1beta1.CronJobList) = this()
      def this(
        name: String,
        args: typingsJapgolly.pulumiKubernetes.inputMod.batch.v1beta1.CronJobList,
        opts: CustomResourceOptions
      ) = this()
    }
    
    /* static members */
    @js.native
    object CronJob extends js.Object {
      /**
        * Get the state of an existing `CronJob` resource, as identified by `id`.
        * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
        * Kubernetes convention) the ID becomes `default/<name>`.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.cronJobMod.CronJob = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.cronJobMod.CronJob = js.native
      /**
        * Returns true if the given object is an instance of CronJob.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/batch/v1beta1/CronJob.CronJob */ Boolean = js.native
    }
    
    /* static members */
    @js.native
    object CronJobList extends js.Object {
      /**
        * Get the state of an existing `CronJobList` resource, as identified by `id`.
        * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
        * Kubernetes convention) the ID becomes `default/<name>`.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.cronJobListMod.CronJobList = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.cronJobListMod.CronJobList = js.native
      /**
        * Returns true if the given object is an instance of CronJobList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/batch/v1beta1/CronJobList.CronJobList */ Boolean = js.native
    }
    
  }
  
  @js.native
  object v2alpha1 extends js.Object {
    @js.native
    class CronJob protected ()
      extends typingsJapgolly.pulumiKubernetes.v2alpha1Mod.CronJob {
      /**
        * Create a batch.v2alpha1.CronJob resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: typingsJapgolly.pulumiKubernetes.inputMod.batch.v2alpha1.CronJob) = this()
      def this(
        name: String,
        args: typingsJapgolly.pulumiKubernetes.inputMod.batch.v2alpha1.CronJob,
        opts: CustomResourceOptions
      ) = this()
    }
    
    @js.native
    class CronJobList protected ()
      extends typingsJapgolly.pulumiKubernetes.v2alpha1Mod.CronJobList {
      /**
        * Create a batch.v2alpha1.CronJobList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: typingsJapgolly.pulumiKubernetes.inputMod.batch.v2alpha1.CronJobList) = this()
      def this(
        name: String,
        args: typingsJapgolly.pulumiKubernetes.inputMod.batch.v2alpha1.CronJobList,
        opts: CustomResourceOptions
      ) = this()
    }
    
    /* static members */
    @js.native
    object CronJob extends js.Object {
      /**
        * Get the state of an existing `CronJob` resource, as identified by `id`.
        * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
        * Kubernetes convention) the ID becomes `default/<name>`.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.v2alpha1CronJobMod.CronJob = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.v2alpha1CronJobMod.CronJob = js.native
      /**
        * Returns true if the given object is an instance of CronJob.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/batch/v2alpha1/CronJob.CronJob */ Boolean = js.native
    }
    
    /* static members */
    @js.native
    object CronJobList extends js.Object {
      /**
        * Get the state of an existing `CronJobList` resource, as identified by `id`.
        * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
        * Kubernetes convention) the ID becomes `default/<name>`.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.v2alpha1CronJobListMod.CronJobList = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.v2alpha1CronJobListMod.CronJobList = js.native
      /**
        * Returns true if the given object is an instance of CronJobList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/batch/v2alpha1/CronJobList.CronJobList */ Boolean = js.native
    }
    
  }
  
}

