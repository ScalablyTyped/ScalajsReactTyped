package typingsJapgolly.pulumiAws.sesMod

import typingsJapgolly.pulumiAws.templateMod.TemplateArgs
import typingsJapgolly.pulumiAws.templateMod.TemplateState
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ses", "Template")
@js.native
class Template protected ()
  extends typingsJapgolly.pulumiAws.templateMod.Template {
  /**
    * Create a Template resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: TemplateArgs) = this()
  def this(name: String, args: TemplateArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/ses", "Template")
@js.native
object Template extends js.Object {
  /**
    * Get an existing Template resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.templateMod.Template = js.native
  def get(name: String, id: Input[ID], state: TemplateState): typingsJapgolly.pulumiAws.templateMod.Template = js.native
  def get(name: String, id: Input[ID], state: TemplateState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.templateMod.Template = js.native
  /**
    * Returns true if the given object is an instance of Template.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/template.Template */ Boolean = js.native
}

