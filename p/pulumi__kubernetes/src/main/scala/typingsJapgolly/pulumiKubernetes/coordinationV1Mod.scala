package typingsJapgolly.pulumiKubernetes

import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/coordination/v1", JSImport.Namespace)
@js.native
object coordinationV1Mod extends js.Object {
  @js.native
  class Lease protected ()
    extends typingsJapgolly.pulumiKubernetes.v1LeaseMod.Lease {
    /**
      * Create a coordination.v1.Lease resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: typingsJapgolly.pulumiKubernetes.inputMod.coordination.v1.Lease) = this()
    def this(
      name: String,
      args: typingsJapgolly.pulumiKubernetes.inputMod.coordination.v1.Lease,
      opts: CustomResourceOptions
    ) = this()
  }
  
  @js.native
  class LeaseList protected ()
    extends typingsJapgolly.pulumiKubernetes.v1LeaseListMod.LeaseList {
    /**
      * Create a coordination.v1.LeaseList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: typingsJapgolly.pulumiKubernetes.inputMod.coordination.v1.LeaseList) = this()
    def this(
      name: String,
      args: typingsJapgolly.pulumiKubernetes.inputMod.coordination.v1.LeaseList,
      opts: CustomResourceOptions
    ) = this()
  }
  
  /* static members */
  @js.native
  object Lease extends js.Object {
    /**
      * Get the state of an existing `Lease` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.v1LeaseMod.Lease = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.v1LeaseMod.Lease = js.native
    /**
      * Returns true if the given object is an instance of Lease.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/coordination/v1/Lease.Lease */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object LeaseList extends js.Object {
    /**
      * Get the state of an existing `LeaseList` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.v1LeaseListMod.LeaseList = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.v1LeaseListMod.LeaseList = js.native
    /**
      * Returns true if the given object is an instance of LeaseList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/coordination/v1/LeaseList.LeaseList */ Boolean = js.native
  }
  
}

