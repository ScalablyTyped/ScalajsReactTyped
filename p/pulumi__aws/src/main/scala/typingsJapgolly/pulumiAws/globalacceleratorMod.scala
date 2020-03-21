package typingsJapgolly.pulumiAws

import typingsJapgolly.pulumiAws.acceleratorMod.AcceleratorArgs
import typingsJapgolly.pulumiAws.acceleratorMod.AcceleratorState
import typingsJapgolly.pulumiAws.endpointGroupMod.EndpointGroupArgs
import typingsJapgolly.pulumiAws.endpointGroupMod.EndpointGroupState
import typingsJapgolly.pulumiAws.globalacceleratorListenerMod.ListenerArgs
import typingsJapgolly.pulumiAws.globalacceleratorListenerMod.ListenerState
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/globalaccelerator", JSImport.Namespace)
@js.native
object globalacceleratorMod extends js.Object {
  @js.native
  class Accelerator protected ()
    extends typingsJapgolly.pulumiAws.acceleratorMod.Accelerator {
    /**
      * Create a Accelerator resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: AcceleratorArgs) = this()
    def this(name: String, args: AcceleratorArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class EndpointGroup protected ()
    extends typingsJapgolly.pulumiAws.endpointGroupMod.EndpointGroup {
    /**
      * Create a EndpointGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: EndpointGroupArgs) = this()
    def this(name: String, args: EndpointGroupArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Listener protected ()
    extends typingsJapgolly.pulumiAws.globalacceleratorListenerMod.Listener {
    /**
      * Create a Listener resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ListenerArgs) = this()
    def this(name: String, args: ListenerArgs, opts: CustomResourceOptions) = this()
  }
  
  /* static members */
  @js.native
  object Accelerator extends js.Object {
    /**
      * Get an existing Accelerator resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.acceleratorMod.Accelerator = js.native
    def get(name: String, id: Input[ID], state: AcceleratorState): typingsJapgolly.pulumiAws.acceleratorMod.Accelerator = js.native
    def get(name: String, id: Input[ID], state: AcceleratorState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.acceleratorMod.Accelerator = js.native
    /**
      * Returns true if the given object is an instance of Accelerator.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/globalaccelerator/accelerator.Accelerator */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object EndpointGroup extends js.Object {
    /**
      * Get an existing EndpointGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.endpointGroupMod.EndpointGroup = js.native
    def get(name: String, id: Input[ID], state: EndpointGroupState): typingsJapgolly.pulumiAws.endpointGroupMod.EndpointGroup = js.native
    def get(name: String, id: Input[ID], state: EndpointGroupState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.endpointGroupMod.EndpointGroup = js.native
    /**
      * Returns true if the given object is an instance of EndpointGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/globalaccelerator/endpointGroup.EndpointGroup */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Listener extends js.Object {
    /**
      * Get an existing Listener resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.globalacceleratorListenerMod.Listener = js.native
    def get(name: String, id: Input[ID], state: ListenerState): typingsJapgolly.pulumiAws.globalacceleratorListenerMod.Listener = js.native
    def get(name: String, id: Input[ID], state: ListenerState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.globalacceleratorListenerMod.Listener = js.native
    /**
      * Returns true if the given object is an instance of Listener.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/globalaccelerator/listener.Listener */ Boolean = js.native
  }
  
}

