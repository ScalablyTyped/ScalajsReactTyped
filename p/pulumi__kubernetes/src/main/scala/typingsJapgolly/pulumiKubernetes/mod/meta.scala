package typingsJapgolly.pulumiKubernetes.mod

import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes", "meta")
@js.native
object meta extends js.Object {
  @js.native
  object v1 extends js.Object {
    @js.native
    class Status protected ()
      extends typingsJapgolly.pulumiKubernetes.metaMod.v1.Status {
      /**
        * Create a meta.v1.Status resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: typingsJapgolly.pulumiKubernetes.inputMod.meta.v1.Status) = this()
      def this(
        name: String,
        args: typingsJapgolly.pulumiKubernetes.inputMod.meta.v1.Status,
        opts: CustomResourceOptions
      ) = this()
    }
    
    /* static members */
    @js.native
    object Status extends js.Object {
      /**
        * Get the state of an existing `Status` resource, as identified by `id`.
        * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
        * Kubernetes convention) the ID becomes `default/<name>`.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.statusMod.Status = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.statusMod.Status = js.native
      /**
        * Returns true if the given object is an instance of Status.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/meta/v1/Status.Status */ Boolean = js.native
    }
    
  }
  
}

