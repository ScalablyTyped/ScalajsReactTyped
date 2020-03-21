package typingsJapgolly.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTemplateInput extends js.Object {
  /**
    * The name or Amazon Resource Name (ARN) of a change set for which AWS CloudFormation returns the associated template. If you specify a name, you must also specify the StackName.
    */
  var ChangeSetName: js.UndefOr[ChangeSetNameOrId] = js.native
  /**
    * The name or the unique stack ID that is associated with the stack, which are not always interchangeable:   Running stacks: You can specify either the stack's name or its unique stack ID.   Deleted stacks: You must specify the unique stack ID.   Default: There is no default value.
    */
  var StackName: js.UndefOr[typingsJapgolly.awsSdk.cloudformationMod.StackName] = js.native
  /**
    * For templates that include transforms, the stage of the template that AWS CloudFormation returns. To get the user-submitted template, specify Original. To get the template after AWS CloudFormation has processed all transforms, specify Processed.  If the template doesn't include transforms, Original and Processed return the same template. By default, AWS CloudFormation specifies Original. 
    */
  var TemplateStage: js.UndefOr[typingsJapgolly.awsSdk.cloudformationMod.TemplateStage] = js.native
}

object GetTemplateInput {
  @scala.inline
  def apply(
    ChangeSetName: ChangeSetNameOrId = null,
    StackName: StackName = null,
    TemplateStage: TemplateStage = null
  ): GetTemplateInput = {
    val __obj = js.Dynamic.literal()
    if (ChangeSetName != null) __obj.updateDynamic("ChangeSetName")(ChangeSetName.asInstanceOf[js.Any])
    if (StackName != null) __obj.updateDynamic("StackName")(StackName.asInstanceOf[js.Any])
    if (TemplateStage != null) __obj.updateDynamic("TemplateStage")(TemplateStage.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTemplateInput]
  }
}

