package typingsJapgolly.pulumiAws

import typingsJapgolly.pulumiAws.meshMod.MeshArgs
import typingsJapgolly.pulumiAws.meshMod.MeshState
import typingsJapgolly.pulumiAws.routeMod.RouteArgs
import typingsJapgolly.pulumiAws.routeMod.RouteState
import typingsJapgolly.pulumiAws.virtualNodeMod.VirtualNodeArgs
import typingsJapgolly.pulumiAws.virtualNodeMod.VirtualNodeState
import typingsJapgolly.pulumiAws.virtualRouterMod.VirtualRouterArgs
import typingsJapgolly.pulumiAws.virtualRouterMod.VirtualRouterState
import typingsJapgolly.pulumiAws.virtualServiceMod.VirtualServiceArgs
import typingsJapgolly.pulumiAws.virtualServiceMod.VirtualServiceState
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/appmesh", JSImport.Namespace)
@js.native
object appmeshMod extends js.Object {
  @js.native
  class Mesh protected ()
    extends typingsJapgolly.pulumiAws.meshMod.Mesh {
    /**
      * Create a Mesh resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: MeshArgs) = this()
    def this(name: String, args: MeshArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Route protected ()
    extends typingsJapgolly.pulumiAws.routeMod.Route {
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
  class VirtualNode protected ()
    extends typingsJapgolly.pulumiAws.virtualNodeMod.VirtualNode {
    /**
      * Create a VirtualNode resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: VirtualNodeArgs) = this()
    def this(name: String, args: VirtualNodeArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class VirtualRouter protected ()
    extends typingsJapgolly.pulumiAws.virtualRouterMod.VirtualRouter {
    /**
      * Create a VirtualRouter resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: VirtualRouterArgs) = this()
    def this(name: String, args: VirtualRouterArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class VirtualService protected ()
    extends typingsJapgolly.pulumiAws.virtualServiceMod.VirtualService {
    /**
      * Create a VirtualService resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: VirtualServiceArgs) = this()
    def this(name: String, args: VirtualServiceArgs, opts: CustomResourceOptions) = this()
  }
  
  /* static members */
  @js.native
  object Mesh extends js.Object {
    /**
      * Get an existing Mesh resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.meshMod.Mesh = js.native
    def get(name: String, id: Input[ID], state: MeshState): typingsJapgolly.pulumiAws.meshMod.Mesh = js.native
    def get(name: String, id: Input[ID], state: MeshState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.meshMod.Mesh = js.native
    /**
      * Returns true if the given object is an instance of Mesh.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appmesh/mesh.Mesh */ Boolean = js.native
  }
  
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
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.routeMod.Route = js.native
    def get(name: String, id: Input[ID], state: RouteState): typingsJapgolly.pulumiAws.routeMod.Route = js.native
    def get(name: String, id: Input[ID], state: RouteState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.routeMod.Route = js.native
    /**
      * Returns true if the given object is an instance of Route.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appmesh/route.Route */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object VirtualNode extends js.Object {
    /**
      * Get an existing VirtualNode resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.virtualNodeMod.VirtualNode = js.native
    def get(name: String, id: Input[ID], state: VirtualNodeState): typingsJapgolly.pulumiAws.virtualNodeMod.VirtualNode = js.native
    def get(name: String, id: Input[ID], state: VirtualNodeState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.virtualNodeMod.VirtualNode = js.native
    /**
      * Returns true if the given object is an instance of VirtualNode.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appmesh/virtualNode.VirtualNode */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object VirtualRouter extends js.Object {
    /**
      * Get an existing VirtualRouter resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.virtualRouterMod.VirtualRouter = js.native
    def get(name: String, id: Input[ID], state: VirtualRouterState): typingsJapgolly.pulumiAws.virtualRouterMod.VirtualRouter = js.native
    def get(name: String, id: Input[ID], state: VirtualRouterState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.virtualRouterMod.VirtualRouter = js.native
    /**
      * Returns true if the given object is an instance of VirtualRouter.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appmesh/virtualRouter.VirtualRouter */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object VirtualService extends js.Object {
    /**
      * Get an existing VirtualService resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.virtualServiceMod.VirtualService = js.native
    def get(name: String, id: Input[ID], state: VirtualServiceState): typingsJapgolly.pulumiAws.virtualServiceMod.VirtualService = js.native
    def get(name: String, id: Input[ID], state: VirtualServiceState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.virtualServiceMod.VirtualService = js.native
    /**
      * Returns true if the given object is an instance of VirtualService.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appmesh/virtualService.VirtualService */ Boolean = js.native
  }
  
}

