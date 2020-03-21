package typingsJapgolly.pulumiAws.mod

import typingsJapgolly.pulumiAws.lightsailDomainMod.DomainArgs
import typingsJapgolly.pulumiAws.lightsailDomainMod.DomainState
import typingsJapgolly.pulumiAws.lightsailInstanceMod.InstanceArgs
import typingsJapgolly.pulumiAws.lightsailInstanceMod.InstanceState
import typingsJapgolly.pulumiAws.lightsailKeyPairMod.KeyPairArgs
import typingsJapgolly.pulumiAws.lightsailKeyPairMod.KeyPairState
import typingsJapgolly.pulumiAws.staticIpAttachmentMod.StaticIpAttachmentArgs
import typingsJapgolly.pulumiAws.staticIpAttachmentMod.StaticIpAttachmentState
import typingsJapgolly.pulumiAws.staticIpMod.StaticIpArgs
import typingsJapgolly.pulumiAws.staticIpMod.StaticIpState
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "lightsail")
@js.native
object lightsail extends js.Object {
  @js.native
  class Domain protected ()
    extends typingsJapgolly.pulumiAws.lightsailMod.Domain {
    /**
      * Create a Domain resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DomainArgs) = this()
    def this(name: String, args: DomainArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Instance protected ()
    extends typingsJapgolly.pulumiAws.lightsailMod.Instance {
    /**
      * Create a Instance resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: InstanceArgs) = this()
    def this(name: String, args: InstanceArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class KeyPair protected ()
    extends typingsJapgolly.pulumiAws.lightsailMod.KeyPair {
    /**
      * Create a KeyPair resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: KeyPairArgs) = this()
    def this(name: String, args: KeyPairArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class StaticIp protected ()
    extends typingsJapgolly.pulumiAws.lightsailMod.StaticIp {
    /**
      * Create a StaticIp resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: StaticIpArgs) = this()
    def this(name: String, args: StaticIpArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class StaticIpAttachment protected ()
    extends typingsJapgolly.pulumiAws.lightsailMod.StaticIpAttachment {
    /**
      * Create a StaticIpAttachment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: StaticIpAttachmentArgs) = this()
    def this(name: String, args: StaticIpAttachmentArgs, opts: CustomResourceOptions) = this()
  }
  
  /* static members */
  @js.native
  object Domain extends js.Object {
    /**
      * Get an existing Domain resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.lightsailDomainMod.Domain = js.native
    def get(name: String, id: Input[ID], state: DomainState): typingsJapgolly.pulumiAws.lightsailDomainMod.Domain = js.native
    def get(name: String, id: Input[ID], state: DomainState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.lightsailDomainMod.Domain = js.native
    /**
      * Returns true if the given object is an instance of Domain.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lightsail/domain.Domain */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Instance extends js.Object {
    /**
      * Get an existing Instance resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.lightsailInstanceMod.Instance = js.native
    def get(name: String, id: Input[ID], state: InstanceState): typingsJapgolly.pulumiAws.lightsailInstanceMod.Instance = js.native
    def get(name: String, id: Input[ID], state: InstanceState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.lightsailInstanceMod.Instance = js.native
    /**
      * Returns true if the given object is an instance of Instance.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lightsail/instance.Instance */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object KeyPair extends js.Object {
    /**
      * Get an existing KeyPair resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.lightsailKeyPairMod.KeyPair = js.native
    def get(name: String, id: Input[ID], state: KeyPairState): typingsJapgolly.pulumiAws.lightsailKeyPairMod.KeyPair = js.native
    def get(name: String, id: Input[ID], state: KeyPairState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.lightsailKeyPairMod.KeyPair = js.native
    /**
      * Returns true if the given object is an instance of KeyPair.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lightsail/keyPair.KeyPair */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object StaticIp extends js.Object {
    /**
      * Get an existing StaticIp resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.staticIpMod.StaticIp = js.native
    def get(name: String, id: Input[ID], state: StaticIpState): typingsJapgolly.pulumiAws.staticIpMod.StaticIp = js.native
    def get(name: String, id: Input[ID], state: StaticIpState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.staticIpMod.StaticIp = js.native
    /**
      * Returns true if the given object is an instance of StaticIp.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lightsail/staticIp.StaticIp */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object StaticIpAttachment extends js.Object {
    /**
      * Get an existing StaticIpAttachment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.staticIpAttachmentMod.StaticIpAttachment = js.native
    def get(name: String, id: Input[ID], state: StaticIpAttachmentState): typingsJapgolly.pulumiAws.staticIpAttachmentMod.StaticIpAttachment = js.native
    def get(name: String, id: Input[ID], state: StaticIpAttachmentState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.staticIpAttachmentMod.StaticIpAttachment = js.native
    /**
      * Returns true if the given object is an instance of StaticIpAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lightsail/staticIpAttachment.StaticIpAttachment */ Boolean = js.native
  }
  
}

