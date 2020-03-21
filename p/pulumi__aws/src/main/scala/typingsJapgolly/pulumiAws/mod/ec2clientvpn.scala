package typingsJapgolly.pulumiAws.mod

import typingsJapgolly.pulumiAws.ec2clientvpnEndpointMod.EndpointArgs
import typingsJapgolly.pulumiAws.ec2clientvpnEndpointMod.EndpointState
import typingsJapgolly.pulumiAws.networkAssociationMod.NetworkAssociationArgs
import typingsJapgolly.pulumiAws.networkAssociationMod.NetworkAssociationState
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "ec2clientvpn")
@js.native
object ec2clientvpn extends js.Object {
  @js.native
  class Endpoint protected ()
    extends typingsJapgolly.pulumiAws.ec2clientvpnMod.Endpoint {
    /**
      * Create a Endpoint resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: EndpointArgs) = this()
    def this(name: String, args: EndpointArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class NetworkAssociation protected ()
    extends typingsJapgolly.pulumiAws.ec2clientvpnMod.NetworkAssociation {
    /**
      * Create a NetworkAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: NetworkAssociationArgs) = this()
    def this(name: String, args: NetworkAssociationArgs, opts: CustomResourceOptions) = this()
  }
  
  /* static members */
  @js.native
  object Endpoint extends js.Object {
    /**
      * Get an existing Endpoint resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.ec2clientvpnEndpointMod.Endpoint = js.native
    def get(name: String, id: Input[ID], state: EndpointState): typingsJapgolly.pulumiAws.ec2clientvpnEndpointMod.Endpoint = js.native
    def get(name: String, id: Input[ID], state: EndpointState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.ec2clientvpnEndpointMod.Endpoint = js.native
    /**
      * Returns true if the given object is an instance of Endpoint.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2clientvpn/endpoint.Endpoint */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object NetworkAssociation extends js.Object {
    /**
      * Get an existing NetworkAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.networkAssociationMod.NetworkAssociation = js.native
    def get(name: String, id: Input[ID], state: NetworkAssociationState): typingsJapgolly.pulumiAws.networkAssociationMod.NetworkAssociation = js.native
    def get(name: String, id: Input[ID], state: NetworkAssociationState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.networkAssociationMod.NetworkAssociation = js.native
    /**
      * Returns true if the given object is an instance of NetworkAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2clientvpn/networkAssociation.NetworkAssociation */ Boolean = js.native
  }
  
}

