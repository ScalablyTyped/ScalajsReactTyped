package typingsJapgolly.pulumiAws.mod

import typingsJapgolly.pulumiAws.ecrGetRepositoryMod.GetRepositoryArgs
import typingsJapgolly.pulumiAws.ecrGetRepositoryMod.GetRepositoryResult
import typingsJapgolly.pulumiAws.ecrLifecyclePolicyMod.LifecyclePolicyArgs
import typingsJapgolly.pulumiAws.ecrLifecyclePolicyMod.LifecyclePolicyState
import typingsJapgolly.pulumiAws.ecrRepositoryMod.RepositoryArgs
import typingsJapgolly.pulumiAws.ecrRepositoryMod.RepositoryState
import typingsJapgolly.pulumiAws.getCredentialsMod.GetCredentialsArgs
import typingsJapgolly.pulumiAws.getCredentialsMod.GetCredentialsResult
import typingsJapgolly.pulumiAws.getImageMod.GetImageArgs
import typingsJapgolly.pulumiAws.getImageMod.GetImageResult
import typingsJapgolly.pulumiAws.repositoryPolicyMod.RepositoryPolicyArgs
import typingsJapgolly.pulumiAws.repositoryPolicyMod.RepositoryPolicyState
import typingsJapgolly.pulumiPulumi.invokeMod.InvokeOptions
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "ecr")
@js.native
object ecr extends js.Object {
  @js.native
  class LifecyclePolicy protected ()
    extends typingsJapgolly.pulumiAws.ecrMod.LifecyclePolicy {
    /**
      * Create a LifecyclePolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: LifecyclePolicyArgs) = this()
    def this(name: String, args: LifecyclePolicyArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Repository protected ()
    extends typingsJapgolly.pulumiAws.ecrMod.Repository {
    /**
      * Create a Repository resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: RepositoryArgs) = this()
    def this(name: String, args: RepositoryArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class RepositoryPolicy protected ()
    extends typingsJapgolly.pulumiAws.ecrMod.RepositoryPolicy {
    /**
      * Create a RepositoryPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RepositoryPolicyArgs) = this()
    def this(name: String, args: RepositoryPolicyArgs, opts: CustomResourceOptions) = this()
  }
  
  def getCredentials(args: GetCredentialsArgs): js.Promise[GetCredentialsResult] with GetCredentialsResult = js.native
  def getCredentials(args: GetCredentialsArgs, opts: InvokeOptions): js.Promise[GetCredentialsResult] with GetCredentialsResult = js.native
  def getImage(args: GetImageArgs): js.Promise[GetImageResult] with GetImageResult = js.native
  def getImage(args: GetImageArgs, opts: InvokeOptions): js.Promise[GetImageResult] with GetImageResult = js.native
  def getRepository(args: GetRepositoryArgs): js.Promise[GetRepositoryResult] with GetRepositoryResult = js.native
  def getRepository(args: GetRepositoryArgs, opts: InvokeOptions): js.Promise[GetRepositoryResult] with GetRepositoryResult = js.native
  /* static members */
  @js.native
  object LifecyclePolicy extends js.Object {
    /**
      * Get an existing LifecyclePolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.ecrLifecyclePolicyMod.LifecyclePolicy = js.native
    def get(name: String, id: Input[ID], state: LifecyclePolicyState): typingsJapgolly.pulumiAws.ecrLifecyclePolicyMod.LifecyclePolicy = js.native
    def get(name: String, id: Input[ID], state: LifecyclePolicyState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.ecrLifecyclePolicyMod.LifecyclePolicy = js.native
    /**
      * Returns true if the given object is an instance of LifecyclePolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ecr/lifecyclePolicy.LifecyclePolicy */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Repository extends js.Object {
    /**
      * Get an existing Repository resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.ecrRepositoryMod.Repository = js.native
    def get(name: String, id: Input[ID], state: RepositoryState): typingsJapgolly.pulumiAws.ecrRepositoryMod.Repository = js.native
    def get(name: String, id: Input[ID], state: RepositoryState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.ecrRepositoryMod.Repository = js.native
    /**
      * Returns true if the given object is an instance of Repository.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ecr/repository.Repository */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object RepositoryPolicy extends js.Object {
    /**
      * Get an existing RepositoryPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.repositoryPolicyMod.RepositoryPolicy = js.native
    def get(name: String, id: Input[ID], state: RepositoryPolicyState): typingsJapgolly.pulumiAws.repositoryPolicyMod.RepositoryPolicy = js.native
    def get(name: String, id: Input[ID], state: RepositoryPolicyState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.repositoryPolicyMod.RepositoryPolicy = js.native
    /**
      * Returns true if the given object is an instance of RepositoryPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ecr/repositoryPolicy.RepositoryPolicy */ Boolean = js.native
  }
  
}

