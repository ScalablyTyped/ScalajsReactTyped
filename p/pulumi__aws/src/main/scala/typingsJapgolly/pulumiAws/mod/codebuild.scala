package typingsJapgolly.pulumiAws.mod

import typingsJapgolly.pulumiAws.projectMod.ProjectArgs
import typingsJapgolly.pulumiAws.projectMod.ProjectState
import typingsJapgolly.pulumiAws.sourceCredentialMod.SourceCredentialArgs
import typingsJapgolly.pulumiAws.sourceCredentialMod.SourceCredentialState
import typingsJapgolly.pulumiAws.webhookMod.WebhookArgs
import typingsJapgolly.pulumiAws.webhookMod.WebhookState
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "codebuild")
@js.native
object codebuild extends js.Object {
  @js.native
  class Project protected ()
    extends typingsJapgolly.pulumiAws.codebuildMod.Project {
    /**
      * Create a Project resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ProjectArgs) = this()
    def this(name: String, args: ProjectArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class SourceCredential protected ()
    extends typingsJapgolly.pulumiAws.codebuildMod.SourceCredential {
    /**
      * Create a SourceCredential resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SourceCredentialArgs) = this()
    def this(name: String, args: SourceCredentialArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Webhook protected ()
    extends typingsJapgolly.pulumiAws.codebuildMod.Webhook {
    /**
      * Create a Webhook resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: WebhookArgs) = this()
    def this(name: String, args: WebhookArgs, opts: CustomResourceOptions) = this()
  }
  
  /* static members */
  @js.native
  object Project extends js.Object {
    /**
      * Get an existing Project resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.projectMod.Project = js.native
    def get(name: String, id: Input[ID], state: ProjectState): typingsJapgolly.pulumiAws.projectMod.Project = js.native
    def get(name: String, id: Input[ID], state: ProjectState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.projectMod.Project = js.native
    /**
      * Returns true if the given object is an instance of Project.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codebuild/project.Project */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object SourceCredential extends js.Object {
    /**
      * Get an existing SourceCredential resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.sourceCredentialMod.SourceCredential = js.native
    def get(name: String, id: Input[ID], state: SourceCredentialState): typingsJapgolly.pulumiAws.sourceCredentialMod.SourceCredential = js.native
    def get(name: String, id: Input[ID], state: SourceCredentialState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.sourceCredentialMod.SourceCredential = js.native
    /**
      * Returns true if the given object is an instance of SourceCredential.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codebuild/sourceCredential.SourceCredential */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Webhook extends js.Object {
    /**
      * Get an existing Webhook resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.webhookMod.Webhook = js.native
    def get(name: String, id: Input[ID], state: WebhookState): typingsJapgolly.pulumiAws.webhookMod.Webhook = js.native
    def get(name: String, id: Input[ID], state: WebhookState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.webhookMod.Webhook = js.native
    /**
      * Returns true if the given object is an instance of Webhook.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codebuild/webhook.Webhook */ Boolean = js.native
  }
  
}

