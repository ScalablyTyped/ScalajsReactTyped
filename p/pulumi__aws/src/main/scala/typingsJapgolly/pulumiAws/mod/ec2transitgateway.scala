package typingsJapgolly.pulumiAws.mod

import typingsJapgolly.pulumiAws.ec2transitgatewayRouteMod.RouteArgs
import typingsJapgolly.pulumiAws.ec2transitgatewayRouteMod.RouteState
import typingsJapgolly.pulumiAws.getDirectConnectGatewayAttachmentMod.GetDirectConnectGatewayAttachmentArgs
import typingsJapgolly.pulumiAws.getDirectConnectGatewayAttachmentMod.GetDirectConnectGatewayAttachmentResult
import typingsJapgolly.pulumiAws.getRouteTableMod.GetRouteTableArgs
import typingsJapgolly.pulumiAws.getRouteTableMod.GetRouteTableResult
import typingsJapgolly.pulumiAws.getTransitGatewayMod.GetTransitGatewayArgs
import typingsJapgolly.pulumiAws.getTransitGatewayMod.GetTransitGatewayResult
import typingsJapgolly.pulumiAws.getVpcAttachmentMod.GetVpcAttachmentArgs
import typingsJapgolly.pulumiAws.getVpcAttachmentMod.GetVpcAttachmentResult
import typingsJapgolly.pulumiAws.getVpnAttachmentMod.GetVpnAttachmentArgs
import typingsJapgolly.pulumiAws.getVpnAttachmentMod.GetVpnAttachmentResult
import typingsJapgolly.pulumiAws.routeTableAssociationMod.RouteTableAssociationArgs
import typingsJapgolly.pulumiAws.routeTableAssociationMod.RouteTableAssociationState
import typingsJapgolly.pulumiAws.routeTableMod.RouteTableArgs
import typingsJapgolly.pulumiAws.routeTableMod.RouteTableState
import typingsJapgolly.pulumiAws.routeTablePropagationMod.RouteTablePropagationArgs
import typingsJapgolly.pulumiAws.routeTablePropagationMod.RouteTablePropagationState
import typingsJapgolly.pulumiAws.transitGatewayMod.TransitGatewayArgs
import typingsJapgolly.pulumiAws.transitGatewayMod.TransitGatewayState
import typingsJapgolly.pulumiAws.vpcAttachmentAccepterMod.VpcAttachmentAccepterArgs
import typingsJapgolly.pulumiAws.vpcAttachmentAccepterMod.VpcAttachmentAccepterState
import typingsJapgolly.pulumiAws.vpcAttachmentMod.VpcAttachmentArgs
import typingsJapgolly.pulumiAws.vpcAttachmentMod.VpcAttachmentState
import typingsJapgolly.pulumiPulumi.invokeMod.InvokeOptions
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "ec2transitgateway")
@js.native
object ec2transitgateway extends js.Object {
  @js.native
  class Route protected ()
    extends typingsJapgolly.pulumiAws.ec2transitgatewayMod.Route {
    /**
      * Create a Route resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RouteArgs) = this()
    def this(name: String, args: RouteArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class RouteTable protected ()
    extends typingsJapgolly.pulumiAws.ec2transitgatewayMod.RouteTable {
    /**
      * Create a RouteTable resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RouteTableArgs) = this()
    def this(name: String, args: RouteTableArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class RouteTableAssociation protected ()
    extends typingsJapgolly.pulumiAws.ec2transitgatewayMod.RouteTableAssociation {
    /**
      * Create a RouteTableAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RouteTableAssociationArgs) = this()
    def this(name: String, args: RouteTableAssociationArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class RouteTablePropagation protected ()
    extends typingsJapgolly.pulumiAws.ec2transitgatewayMod.RouteTablePropagation {
    /**
      * Create a RouteTablePropagation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RouteTablePropagationArgs) = this()
    def this(name: String, args: RouteTablePropagationArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class TransitGateway protected ()
    extends typingsJapgolly.pulumiAws.ec2transitgatewayMod.TransitGateway {
    /**
      * Create a TransitGateway resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: TransitGatewayArgs) = this()
    def this(name: String, args: TransitGatewayArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class VpcAttachment protected ()
    extends typingsJapgolly.pulumiAws.ec2transitgatewayMod.VpcAttachment {
    /**
      * Create a VpcAttachment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: VpcAttachmentArgs) = this()
    def this(name: String, args: VpcAttachmentArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class VpcAttachmentAccepter protected ()
    extends typingsJapgolly.pulumiAws.ec2transitgatewayMod.VpcAttachmentAccepter {
    /**
      * Create a VpcAttachmentAccepter resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: VpcAttachmentAccepterArgs) = this()
    def this(name: String, args: VpcAttachmentAccepterArgs, opts: CustomResourceOptions) = this()
  }
  
  def getDirectConnectGatewayAttachment(args: GetDirectConnectGatewayAttachmentArgs): js.Promise[GetDirectConnectGatewayAttachmentResult] with GetDirectConnectGatewayAttachmentResult = js.native
  def getDirectConnectGatewayAttachment(args: GetDirectConnectGatewayAttachmentArgs, opts: InvokeOptions): js.Promise[GetDirectConnectGatewayAttachmentResult] with GetDirectConnectGatewayAttachmentResult = js.native
  def getRouteTable(): js.Promise[GetRouteTableResult] with GetRouteTableResult = js.native
  def getRouteTable(args: GetRouteTableArgs): js.Promise[GetRouteTableResult] with GetRouteTableResult = js.native
  def getRouteTable(args: GetRouteTableArgs, opts: InvokeOptions): js.Promise[GetRouteTableResult] with GetRouteTableResult = js.native
  def getTransitGateway(): js.Promise[GetTransitGatewayResult] with GetTransitGatewayResult = js.native
  def getTransitGateway(args: GetTransitGatewayArgs): js.Promise[GetTransitGatewayResult] with GetTransitGatewayResult = js.native
  def getTransitGateway(args: GetTransitGatewayArgs, opts: InvokeOptions): js.Promise[GetTransitGatewayResult] with GetTransitGatewayResult = js.native
  def getVpcAttachment(): js.Promise[GetVpcAttachmentResult] with GetVpcAttachmentResult = js.native
  def getVpcAttachment(args: GetVpcAttachmentArgs): js.Promise[GetVpcAttachmentResult] with GetVpcAttachmentResult = js.native
  def getVpcAttachment(args: GetVpcAttachmentArgs, opts: InvokeOptions): js.Promise[GetVpcAttachmentResult] with GetVpcAttachmentResult = js.native
  def getVpnAttachment(args: GetVpnAttachmentArgs): js.Promise[GetVpnAttachmentResult] with GetVpnAttachmentResult = js.native
  def getVpnAttachment(args: GetVpnAttachmentArgs, opts: InvokeOptions): js.Promise[GetVpnAttachmentResult] with GetVpnAttachmentResult = js.native
  /* static members */
  @js.native
  object Route extends js.Object {
    /**
      * Get an existing Route resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.ec2transitgatewayRouteMod.Route = js.native
    def get(name: String, id: Input[ID], state: RouteState): typingsJapgolly.pulumiAws.ec2transitgatewayRouteMod.Route = js.native
    def get(name: String, id: Input[ID], state: RouteState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.ec2transitgatewayRouteMod.Route = js.native
    /**
      * Returns true if the given object is an instance of Route.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2transitgateway/route.Route */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object RouteTable extends js.Object {
    /**
      * Get an existing RouteTable resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.routeTableMod.RouteTable = js.native
    def get(name: String, id: Input[ID], state: RouteTableState): typingsJapgolly.pulumiAws.routeTableMod.RouteTable = js.native
    def get(name: String, id: Input[ID], state: RouteTableState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.routeTableMod.RouteTable = js.native
    /**
      * Returns true if the given object is an instance of RouteTable.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2transitgateway/routeTable.RouteTable */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object RouteTableAssociation extends js.Object {
    /**
      * Get an existing RouteTableAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.routeTableAssociationMod.RouteTableAssociation = js.native
    def get(name: String, id: Input[ID], state: RouteTableAssociationState): typingsJapgolly.pulumiAws.routeTableAssociationMod.RouteTableAssociation = js.native
    def get(name: String, id: Input[ID], state: RouteTableAssociationState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.routeTableAssociationMod.RouteTableAssociation = js.native
    /**
      * Returns true if the given object is an instance of RouteTableAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2transitgateway/routeTableAssociation.RouteTableAssociation */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object RouteTablePropagation extends js.Object {
    /**
      * Get an existing RouteTablePropagation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.routeTablePropagationMod.RouteTablePropagation = js.native
    def get(name: String, id: Input[ID], state: RouteTablePropagationState): typingsJapgolly.pulumiAws.routeTablePropagationMod.RouteTablePropagation = js.native
    def get(name: String, id: Input[ID], state: RouteTablePropagationState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.routeTablePropagationMod.RouteTablePropagation = js.native
    /**
      * Returns true if the given object is an instance of RouteTablePropagation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2transitgateway/routeTablePropagation.RouteTablePropagation */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object TransitGateway extends js.Object {
    /**
      * Get an existing TransitGateway resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.transitGatewayMod.TransitGateway = js.native
    def get(name: String, id: Input[ID], state: TransitGatewayState): typingsJapgolly.pulumiAws.transitGatewayMod.TransitGateway = js.native
    def get(name: String, id: Input[ID], state: TransitGatewayState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.transitGatewayMod.TransitGateway = js.native
    /**
      * Returns true if the given object is an instance of TransitGateway.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2transitgateway/transitGateway.TransitGateway */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object VpcAttachment extends js.Object {
    /**
      * Get an existing VpcAttachment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.vpcAttachmentMod.VpcAttachment = js.native
    def get(name: String, id: Input[ID], state: VpcAttachmentState): typingsJapgolly.pulumiAws.vpcAttachmentMod.VpcAttachment = js.native
    def get(name: String, id: Input[ID], state: VpcAttachmentState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.vpcAttachmentMod.VpcAttachment = js.native
    /**
      * Returns true if the given object is an instance of VpcAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2transitgateway/vpcAttachment.VpcAttachment */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object VpcAttachmentAccepter extends js.Object {
    /**
      * Get an existing VpcAttachmentAccepter resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.vpcAttachmentAccepterMod.VpcAttachmentAccepter = js.native
    def get(name: String, id: Input[ID], state: VpcAttachmentAccepterState): typingsJapgolly.pulumiAws.vpcAttachmentAccepterMod.VpcAttachmentAccepter = js.native
    def get(name: String, id: Input[ID], state: VpcAttachmentAccepterState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.vpcAttachmentAccepterMod.VpcAttachmentAccepter = js.native
    /**
      * Returns true if the given object is an instance of VpcAttachmentAccepter.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2transitgateway/vpcAttachmentAccepter.VpcAttachmentAccepter */ Boolean = js.native
  }
  
}

