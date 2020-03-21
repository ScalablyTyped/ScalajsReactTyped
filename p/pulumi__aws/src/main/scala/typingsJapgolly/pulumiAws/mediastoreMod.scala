package typingsJapgolly.pulumiAws

import typingsJapgolly.pulumiAws.containerPolicyMod.ContainerPolicyArgs
import typingsJapgolly.pulumiAws.containerPolicyMod.ContainerPolicyState
import typingsJapgolly.pulumiAws.mediastoreContainerMod.ContainerArgs
import typingsJapgolly.pulumiAws.mediastoreContainerMod.ContainerState
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/mediastore", JSImport.Namespace)
@js.native
object mediastoreMod extends js.Object {
  @js.native
  class Container protected ()
    extends typingsJapgolly.pulumiAws.mediastoreContainerMod.Container {
    /**
      * Create a Container resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ContainerArgs) = this()
    def this(name: String, args: ContainerArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class ContainerPolicy protected ()
    extends typingsJapgolly.pulumiAws.containerPolicyMod.ContainerPolicy {
    /**
      * Create a ContainerPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ContainerPolicyArgs) = this()
    def this(name: String, args: ContainerPolicyArgs, opts: CustomResourceOptions) = this()
  }
  
  /* static members */
  @js.native
  object Container extends js.Object {
    /**
      * Get an existing Container resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.mediastoreContainerMod.Container = js.native
    def get(name: String, id: Input[ID], state: ContainerState): typingsJapgolly.pulumiAws.mediastoreContainerMod.Container = js.native
    def get(name: String, id: Input[ID], state: ContainerState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.mediastoreContainerMod.Container = js.native
    /**
      * Returns true if the given object is an instance of Container.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/mediastore/container.Container */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ContainerPolicy extends js.Object {
    /**
      * Get an existing ContainerPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.containerPolicyMod.ContainerPolicy = js.native
    def get(name: String, id: Input[ID], state: ContainerPolicyState): typingsJapgolly.pulumiAws.containerPolicyMod.ContainerPolicy = js.native
    def get(name: String, id: Input[ID], state: ContainerPolicyState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.containerPolicyMod.ContainerPolicy = js.native
    /**
      * Returns true if the given object is an instance of ContainerPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/mediastore/containerPolicy.ContainerPolicy */ Boolean = js.native
  }
  
}

