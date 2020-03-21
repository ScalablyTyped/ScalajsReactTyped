package typingsJapgolly.pulumiAws

import typingsJapgolly.pulumiAws.getUserPoolsMod.GetUserPoolsArgs
import typingsJapgolly.pulumiAws.getUserPoolsMod.GetUserPoolsResult
import typingsJapgolly.pulumiAws.identityPoolMod.IdentityPoolArgs
import typingsJapgolly.pulumiAws.identityPoolMod.IdentityPoolState
import typingsJapgolly.pulumiAws.identityPoolRoleAttachmentMod.IdentityPoolRoleAttachmentArgs
import typingsJapgolly.pulumiAws.identityPoolRoleAttachmentMod.IdentityPoolRoleAttachmentState
import typingsJapgolly.pulumiAws.identityProviderMod.IdentityProviderArgs
import typingsJapgolly.pulumiAws.identityProviderMod.IdentityProviderState
import typingsJapgolly.pulumiAws.resourceServerMod.ResourceServerArgs
import typingsJapgolly.pulumiAws.resourceServerMod.ResourceServerState
import typingsJapgolly.pulumiAws.userGroupMod.UserGroupArgs
import typingsJapgolly.pulumiAws.userGroupMod.UserGroupState
import typingsJapgolly.pulumiAws.userPoolClientMod.UserPoolClientArgs
import typingsJapgolly.pulumiAws.userPoolClientMod.UserPoolClientState
import typingsJapgolly.pulumiAws.userPoolDomainMod.UserPoolDomainArgs
import typingsJapgolly.pulumiAws.userPoolDomainMod.UserPoolDomainState
import typingsJapgolly.pulumiAws.userPoolMod.UserPoolArgs
import typingsJapgolly.pulumiAws.userPoolMod.UserPoolState
import typingsJapgolly.pulumiPulumi.invokeMod.InvokeOptions
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cognito", JSImport.Namespace)
@js.native
object cognitoMod extends js.Object {
  @js.native
  class IdentityPool protected ()
    extends typingsJapgolly.pulumiAws.identityPoolMod.IdentityPool {
    /**
      * Create a IdentityPool resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: IdentityPoolArgs) = this()
    def this(name: String, args: IdentityPoolArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class IdentityPoolRoleAttachment protected ()
    extends typingsJapgolly.pulumiAws.identityPoolRoleAttachmentMod.IdentityPoolRoleAttachment {
    /**
      * Create a IdentityPoolRoleAttachment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: IdentityPoolRoleAttachmentArgs) = this()
    def this(name: String, args: IdentityPoolRoleAttachmentArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class IdentityProvider protected ()
    extends typingsJapgolly.pulumiAws.identityProviderMod.IdentityProvider {
    /**
      * Create a IdentityProvider resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: IdentityProviderArgs) = this()
    def this(name: String, args: IdentityProviderArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class ResourceServer protected ()
    extends typingsJapgolly.pulumiAws.resourceServerMod.ResourceServer {
    /**
      * Create a ResourceServer resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ResourceServerArgs) = this()
    def this(name: String, args: ResourceServerArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class UserGroup protected ()
    extends typingsJapgolly.pulumiAws.userGroupMod.UserGroup {
    /**
      * Create a UserGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: UserGroupArgs) = this()
    def this(name: String, args: UserGroupArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class UserPool protected ()
    extends typingsJapgolly.pulumiAws.userPoolMod.UserPool {
    /**
      * Create a UserPool resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: UserPoolArgs) = this()
    def this(name: String, args: UserPoolArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class UserPoolClient protected ()
    extends typingsJapgolly.pulumiAws.userPoolClientMod.UserPoolClient {
    /**
      * Create a UserPoolClient resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: UserPoolClientArgs) = this()
    def this(name: String, args: UserPoolClientArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class UserPoolDomain protected ()
    extends typingsJapgolly.pulumiAws.userPoolDomainMod.UserPoolDomain {
    /**
      * Create a UserPoolDomain resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: UserPoolDomainArgs) = this()
    def this(name: String, args: UserPoolDomainArgs, opts: CustomResourceOptions) = this()
  }
  
  def getUserPools(args: GetUserPoolsArgs): js.Promise[GetUserPoolsResult] with GetUserPoolsResult = js.native
  def getUserPools(args: GetUserPoolsArgs, opts: InvokeOptions): js.Promise[GetUserPoolsResult] with GetUserPoolsResult = js.native
  /* static members */
  @js.native
  object IdentityPool extends js.Object {
    /**
      * Get an existing IdentityPool resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.identityPoolMod.IdentityPool = js.native
    def get(name: String, id: Input[ID], state: IdentityPoolState): typingsJapgolly.pulumiAws.identityPoolMod.IdentityPool = js.native
    def get(name: String, id: Input[ID], state: IdentityPoolState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.identityPoolMod.IdentityPool = js.native
    /**
      * Returns true if the given object is an instance of IdentityPool.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cognito/identityPool.IdentityPool */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object IdentityPoolRoleAttachment extends js.Object {
    /**
      * Get an existing IdentityPoolRoleAttachment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.identityPoolRoleAttachmentMod.IdentityPoolRoleAttachment = js.native
    def get(name: String, id: Input[ID], state: IdentityPoolRoleAttachmentState): typingsJapgolly.pulumiAws.identityPoolRoleAttachmentMod.IdentityPoolRoleAttachment = js.native
    def get(name: String, id: Input[ID], state: IdentityPoolRoleAttachmentState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.identityPoolRoleAttachmentMod.IdentityPoolRoleAttachment = js.native
    /**
      * Returns true if the given object is an instance of IdentityPoolRoleAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cognito/identityPoolRoleAttachment.IdentityPoolRoleAttachment */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object IdentityProvider extends js.Object {
    /**
      * Get an existing IdentityProvider resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.identityProviderMod.IdentityProvider = js.native
    def get(name: String, id: Input[ID], state: IdentityProviderState): typingsJapgolly.pulumiAws.identityProviderMod.IdentityProvider = js.native
    def get(name: String, id: Input[ID], state: IdentityProviderState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.identityProviderMod.IdentityProvider = js.native
    /**
      * Returns true if the given object is an instance of IdentityProvider.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cognito/identityProvider.IdentityProvider */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ResourceServer extends js.Object {
    /**
      * Get an existing ResourceServer resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.resourceServerMod.ResourceServer = js.native
    def get(name: String, id: Input[ID], state: ResourceServerState): typingsJapgolly.pulumiAws.resourceServerMod.ResourceServer = js.native
    def get(name: String, id: Input[ID], state: ResourceServerState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.resourceServerMod.ResourceServer = js.native
    /**
      * Returns true if the given object is an instance of ResourceServer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cognito/resourceServer.ResourceServer */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object UserGroup extends js.Object {
    /**
      * Get an existing UserGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.userGroupMod.UserGroup = js.native
    def get(name: String, id: Input[ID], state: UserGroupState): typingsJapgolly.pulumiAws.userGroupMod.UserGroup = js.native
    def get(name: String, id: Input[ID], state: UserGroupState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.userGroupMod.UserGroup = js.native
    /**
      * Returns true if the given object is an instance of UserGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cognito/userGroup.UserGroup */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object UserPool extends js.Object {
    /**
      * Get an existing UserPool resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.userPoolMod.UserPool = js.native
    def get(name: String, id: Input[ID], state: UserPoolState): typingsJapgolly.pulumiAws.userPoolMod.UserPool = js.native
    def get(name: String, id: Input[ID], state: UserPoolState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.userPoolMod.UserPool = js.native
    /**
      * Returns true if the given object is an instance of UserPool.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cognito/userPool.UserPool */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object UserPoolClient extends js.Object {
    /**
      * Get an existing UserPoolClient resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.userPoolClientMod.UserPoolClient = js.native
    def get(name: String, id: Input[ID], state: UserPoolClientState): typingsJapgolly.pulumiAws.userPoolClientMod.UserPoolClient = js.native
    def get(name: String, id: Input[ID], state: UserPoolClientState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.userPoolClientMod.UserPoolClient = js.native
    /**
      * Returns true if the given object is an instance of UserPoolClient.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cognito/userPoolClient.UserPoolClient */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object UserPoolDomain extends js.Object {
    /**
      * Get an existing UserPoolDomain resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.userPoolDomainMod.UserPoolDomain = js.native
    def get(name: String, id: Input[ID], state: UserPoolDomainState): typingsJapgolly.pulumiAws.userPoolDomainMod.UserPoolDomain = js.native
    def get(name: String, id: Input[ID], state: UserPoolDomainState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.userPoolDomainMod.UserPoolDomain = js.native
    /**
      * Returns true if the given object is an instance of UserPoolDomain.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cognito/userPoolDomain.UserPoolDomain */ Boolean = js.native
  }
  
}

