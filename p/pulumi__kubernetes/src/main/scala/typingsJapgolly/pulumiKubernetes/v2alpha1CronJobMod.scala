package typingsJapgolly.pulumiKubernetes

import typingsJapgolly.pulumiKubernetes.outputMod.batch.v2alpha1.CronJobSpec
import typingsJapgolly.pulumiKubernetes.outputMod.batch.v2alpha1.CronJobStatus
import typingsJapgolly.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.batchSlashv2alpha1
import typingsJapgolly.pulumiPulumi.mod.CustomResource
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.outputMod.Output_
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/batch/v2alpha1/CronJob", JSImport.Namespace)
@js.native
object v2alpha1CronJobMod extends js.Object {
  @js.native
  class CronJob protected () extends CustomResource {
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
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should
      * convert recognized schemas to the latest internal value, and may reject unrecognized
      * values. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: Output_[batchSlashv2alpha1] = js.native
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may
      * infer this from the endpoint the client submits requests to. Cannot be updated. In
      * CamelCase. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output_[typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.CronJob] = js.native
    /**
      * Standard object's metadata. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
      */
    val metadata: Output_[ObjectMeta] = js.native
    /**
      * Specification of the desired behavior of a cron job, including the schedule. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
      */
    val spec: Output_[CronJobSpec] = js.native
    /**
      * Current status of a cron job. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
      */
    val status: Output_[CronJobStatus] = js.native
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
    def get(name: String, id: Input[ID]): CronJob = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): CronJob = js.native
    /**
      * Returns true if the given object is an instance of CronJob.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/batch/v2alpha1/CronJob.CronJob */ Boolean = js.native
  }
  
}

