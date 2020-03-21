package typingsJapgolly.pulumiAws.mod

import typingsJapgolly.pulumiAws.dmsCertificateMod.CertificateArgs
import typingsJapgolly.pulumiAws.dmsCertificateMod.CertificateState
import typingsJapgolly.pulumiAws.endpointMod.EndpointArgs
import typingsJapgolly.pulumiAws.endpointMod.EndpointState
import typingsJapgolly.pulumiAws.replicationInstanceMod.ReplicationInstanceArgs
import typingsJapgolly.pulumiAws.replicationInstanceMod.ReplicationInstanceState
import typingsJapgolly.pulumiAws.replicationSubnetGroupMod.ReplicationSubnetGroupArgs
import typingsJapgolly.pulumiAws.replicationSubnetGroupMod.ReplicationSubnetGroupState
import typingsJapgolly.pulumiAws.replicationTaskMod.ReplicationTaskArgs
import typingsJapgolly.pulumiAws.replicationTaskMod.ReplicationTaskState
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "dms")
@js.native
object dms extends js.Object {
  @js.native
  class Certificate protected ()
    extends typingsJapgolly.pulumiAws.dmsMod.Certificate {
    /**
      * Create a Certificate resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: CertificateArgs) = this()
    def this(name: String, args: CertificateArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Endpoint protected ()
    extends typingsJapgolly.pulumiAws.dmsMod.Endpoint {
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
  class ReplicationInstance protected ()
    extends typingsJapgolly.pulumiAws.dmsMod.ReplicationInstance {
    /**
      * Create a ReplicationInstance resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ReplicationInstanceArgs) = this()
    def this(name: String, args: ReplicationInstanceArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class ReplicationSubnetGroup protected ()
    extends typingsJapgolly.pulumiAws.dmsMod.ReplicationSubnetGroup {
    /**
      * Create a ReplicationSubnetGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ReplicationSubnetGroupArgs) = this()
    def this(name: String, args: ReplicationSubnetGroupArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class ReplicationTask protected ()
    extends typingsJapgolly.pulumiAws.dmsMod.ReplicationTask {
    /**
      * Create a ReplicationTask resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ReplicationTaskArgs) = this()
    def this(name: String, args: ReplicationTaskArgs, opts: CustomResourceOptions) = this()
  }
  
  /* static members */
  @js.native
  object Certificate extends js.Object {
    /**
      * Get an existing Certificate resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.dmsCertificateMod.Certificate = js.native
    def get(name: String, id: Input[ID], state: CertificateState): typingsJapgolly.pulumiAws.dmsCertificateMod.Certificate = js.native
    def get(name: String, id: Input[ID], state: CertificateState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.dmsCertificateMod.Certificate = js.native
    /**
      * Returns true if the given object is an instance of Certificate.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dms/certificate.Certificate */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.endpointMod.Endpoint = js.native
    def get(name: String, id: Input[ID], state: EndpointState): typingsJapgolly.pulumiAws.endpointMod.Endpoint = js.native
    def get(name: String, id: Input[ID], state: EndpointState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.endpointMod.Endpoint = js.native
    /**
      * Returns true if the given object is an instance of Endpoint.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dms/endpoint.Endpoint */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ReplicationInstance extends js.Object {
    /**
      * Get an existing ReplicationInstance resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.replicationInstanceMod.ReplicationInstance = js.native
    def get(name: String, id: Input[ID], state: ReplicationInstanceState): typingsJapgolly.pulumiAws.replicationInstanceMod.ReplicationInstance = js.native
    def get(name: String, id: Input[ID], state: ReplicationInstanceState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.replicationInstanceMod.ReplicationInstance = js.native
    /**
      * Returns true if the given object is an instance of ReplicationInstance.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dms/replicationInstance.ReplicationInstance */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ReplicationSubnetGroup extends js.Object {
    /**
      * Get an existing ReplicationSubnetGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.replicationSubnetGroupMod.ReplicationSubnetGroup = js.native
    def get(name: String, id: Input[ID], state: ReplicationSubnetGroupState): typingsJapgolly.pulumiAws.replicationSubnetGroupMod.ReplicationSubnetGroup = js.native
    def get(name: String, id: Input[ID], state: ReplicationSubnetGroupState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.replicationSubnetGroupMod.ReplicationSubnetGroup = js.native
    /**
      * Returns true if the given object is an instance of ReplicationSubnetGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dms/replicationSubnetGroup.ReplicationSubnetGroup */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ReplicationTask extends js.Object {
    /**
      * Get an existing ReplicationTask resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.replicationTaskMod.ReplicationTask = js.native
    def get(name: String, id: Input[ID], state: ReplicationTaskState): typingsJapgolly.pulumiAws.replicationTaskMod.ReplicationTask = js.native
    def get(name: String, id: Input[ID], state: ReplicationTaskState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.replicationTaskMod.ReplicationTask = js.native
    /**
      * Returns true if the given object is an instance of ReplicationTask.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dms/replicationTask.ReplicationTask */ Boolean = js.native
  }
  
}

