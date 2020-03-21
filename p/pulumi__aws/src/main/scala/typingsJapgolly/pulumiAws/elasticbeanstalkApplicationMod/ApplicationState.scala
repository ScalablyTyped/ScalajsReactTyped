package typingsJapgolly.pulumiAws.elasticbeanstalkApplicationMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiAws.inputMod.elasticbeanstalk.ApplicationAppversionLifecycle
import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationState extends js.Object {
  val appversionLifecycle: js.UndefOr[Input[ApplicationAppversionLifecycle]] = js.native
  /**
    * The ARN assigned by AWS for this Elastic Beanstalk Application.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * Short description of the application
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the application, must be unique within your account
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Key-value mapping of tags for the Elastic Beanstalk Application.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object ApplicationState {
  @scala.inline
  def apply(
    appversionLifecycle: Input[ApplicationAppversionLifecycle] = null,
    arn: Input[String] = null,
    description: Input[String] = null,
    name: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): ApplicationState = {
    val __obj = js.Dynamic.literal()
    if (appversionLifecycle != null) __obj.updateDynamic("appversionLifecycle")(appversionLifecycle.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationState]
  }
}

