package typingsJapgolly.pulumiKubernetes

import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/auditregistration", JSImport.Namespace)
@js.native
object auditregistrationMod extends js.Object {
  @js.native
  object v1alpha1 extends js.Object {
    @js.native
    class AuditSink protected ()
      extends typingsJapgolly.pulumiKubernetes.v1alpha1Mod.AuditSink {
      /**
        * Create a auditregistration.v1alpha1.AuditSink resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: typingsJapgolly.pulumiKubernetes.inputMod.auditregistration.v1alpha1.AuditSink) = this()
      def this(
        name: String,
        args: typingsJapgolly.pulumiKubernetes.inputMod.auditregistration.v1alpha1.AuditSink,
        opts: CustomResourceOptions
      ) = this()
    }
    
    @js.native
    class AuditSinkList protected ()
      extends typingsJapgolly.pulumiKubernetes.v1alpha1Mod.AuditSinkList {
      /**
        * Create a auditregistration.v1alpha1.AuditSinkList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(
        name: String,
        args: typingsJapgolly.pulumiKubernetes.inputMod.auditregistration.v1alpha1.AuditSinkList
      ) = this()
      def this(
        name: String,
        args: typingsJapgolly.pulumiKubernetes.inputMod.auditregistration.v1alpha1.AuditSinkList,
        opts: CustomResourceOptions
      ) = this()
    }
    
    /* static members */
    @js.native
    object AuditSink extends js.Object {
      /**
        * Get the state of an existing `AuditSink` resource, as identified by `id`.
        * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
        * Kubernetes convention) the ID becomes `default/<name>`.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.auditSinkMod.AuditSink = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.auditSinkMod.AuditSink = js.native
      /**
        * Returns true if the given object is an instance of AuditSink.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/auditregistration/v1alpha1/AuditSink.AuditSink */ Boolean = js.native
    }
    
    /* static members */
    @js.native
    object AuditSinkList extends js.Object {
      /**
        * Get the state of an existing `AuditSinkList` resource, as identified by `id`.
        * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
        * Kubernetes convention) the ID becomes `default/<name>`.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.auditSinkListMod.AuditSinkList = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.auditSinkListMod.AuditSinkList = js.native
      /**
        * Returns true if the given object is an instance of AuditSinkList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/auditregistration/v1alpha1/AuditSinkList.AuditSinkList */ Boolean = js.native
    }
    
  }
  
}

