package typingsJapgolly.pulumiAws

import typingsJapgolly.pulumiAws.httpNamespaceMod.HttpNamespaceArgs
import typingsJapgolly.pulumiAws.httpNamespaceMod.HttpNamespaceState
import typingsJapgolly.pulumiAws.privateDnsNamespaceMod.PrivateDnsNamespaceArgs
import typingsJapgolly.pulumiAws.privateDnsNamespaceMod.PrivateDnsNamespaceState
import typingsJapgolly.pulumiAws.publicDnsNamespaceMod.PublicDnsNamespaceArgs
import typingsJapgolly.pulumiAws.publicDnsNamespaceMod.PublicDnsNamespaceState
import typingsJapgolly.pulumiAws.servicediscoveryServiceMod.ServiceArgs
import typingsJapgolly.pulumiAws.servicediscoveryServiceMod.ServiceState
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/servicediscovery", JSImport.Namespace)
@js.native
object servicediscoveryMod extends js.Object {
  @js.native
  class HttpNamespace protected ()
    extends typingsJapgolly.pulumiAws.httpNamespaceMod.HttpNamespace {
    /**
      * Create a HttpNamespace resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: HttpNamespaceArgs) = this()
    def this(name: String, args: HttpNamespaceArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class PrivateDnsNamespace protected ()
    extends typingsJapgolly.pulumiAws.privateDnsNamespaceMod.PrivateDnsNamespace {
    /**
      * Create a PrivateDnsNamespace resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: PrivateDnsNamespaceArgs) = this()
    def this(name: String, args: PrivateDnsNamespaceArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class PublicDnsNamespace protected ()
    extends typingsJapgolly.pulumiAws.publicDnsNamespaceMod.PublicDnsNamespace {
    /**
      * Create a PublicDnsNamespace resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: PublicDnsNamespaceArgs) = this()
    def this(name: String, args: PublicDnsNamespaceArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Service protected ()
    extends typingsJapgolly.pulumiAws.servicediscoveryServiceMod.Service {
    /**
      * Create a Service resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ServiceArgs) = this()
    def this(name: String, args: ServiceArgs, opts: CustomResourceOptions) = this()
  }
  
  /* static members */
  @js.native
  object HttpNamespace extends js.Object {
    /**
      * Get an existing HttpNamespace resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.httpNamespaceMod.HttpNamespace = js.native
    def get(name: String, id: Input[ID], state: HttpNamespaceState): typingsJapgolly.pulumiAws.httpNamespaceMod.HttpNamespace = js.native
    def get(name: String, id: Input[ID], state: HttpNamespaceState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.httpNamespaceMod.HttpNamespace = js.native
    /**
      * Returns true if the given object is an instance of HttpNamespace.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/servicediscovery/httpNamespace.HttpNamespace */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object PrivateDnsNamespace extends js.Object {
    /**
      * Get an existing PrivateDnsNamespace resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.privateDnsNamespaceMod.PrivateDnsNamespace = js.native
    def get(name: String, id: Input[ID], state: PrivateDnsNamespaceState): typingsJapgolly.pulumiAws.privateDnsNamespaceMod.PrivateDnsNamespace = js.native
    def get(name: String, id: Input[ID], state: PrivateDnsNamespaceState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.privateDnsNamespaceMod.PrivateDnsNamespace = js.native
    /**
      * Returns true if the given object is an instance of PrivateDnsNamespace.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/servicediscovery/privateDnsNamespace.PrivateDnsNamespace */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object PublicDnsNamespace extends js.Object {
    /**
      * Get an existing PublicDnsNamespace resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.publicDnsNamespaceMod.PublicDnsNamespace = js.native
    def get(name: String, id: Input[ID], state: PublicDnsNamespaceState): typingsJapgolly.pulumiAws.publicDnsNamespaceMod.PublicDnsNamespace = js.native
    def get(name: String, id: Input[ID], state: PublicDnsNamespaceState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.publicDnsNamespaceMod.PublicDnsNamespace = js.native
    /**
      * Returns true if the given object is an instance of PublicDnsNamespace.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/servicediscovery/publicDnsNamespace.PublicDnsNamespace */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Service extends js.Object {
    /**
      * Get an existing Service resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.servicediscoveryServiceMod.Service = js.native
    def get(name: String, id: Input[ID], state: ServiceState): typingsJapgolly.pulumiAws.servicediscoveryServiceMod.Service = js.native
    def get(name: String, id: Input[ID], state: ServiceState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.servicediscoveryServiceMod.Service = js.native
    /**
      * Returns true if the given object is an instance of Service.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/servicediscovery/service.Service */ Boolean = js.native
  }
  
}

