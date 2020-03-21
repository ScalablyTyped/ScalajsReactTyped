package typingsJapgolly.pulumiAws.assessmentTemplateMod

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssessmentTemplateState extends js.Object {
  /**
    * The template assessment ARN.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The duration of the inspector run.
    */
  val duration: js.UndefOr[Input[Double]] = js.native
  /**
    * The name of the assessment template.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The rules to be used during the run.
    */
  val rulesPackageArns: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The assessment target ARN to attach the template to.
    */
  val targetArn: js.UndefOr[Input[String]] = js.native
}

object AssessmentTemplateState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    duration: Input[Double] = null,
    name: Input[String] = null,
    rulesPackageArns: Input[js.Array[Input[String]]] = null,
    targetArn: Input[String] = null
  ): AssessmentTemplateState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (rulesPackageArns != null) __obj.updateDynamic("rulesPackageArns")(rulesPackageArns.asInstanceOf[js.Any])
    if (targetArn != null) __obj.updateDynamic("targetArn")(targetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssessmentTemplateState]
  }
}

