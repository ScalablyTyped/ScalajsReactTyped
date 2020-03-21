package typingsJapgolly.pulumiAws.workgroupMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiAws.inputMod.athena.WorkgroupConfiguration
import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkgroupState extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the workgroup
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * Configuration block with various settings for the workgroup. Documented below.
    */
  val configuration: js.UndefOr[Input[WorkgroupConfiguration]] = js.native
  /**
    * Description of the workgroup.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * Name of the workgroup.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * State of the workgroup. Valid values are `DISABLED` or `ENABLED`. Defaults to `ENABLED`.
    */
  val state: js.UndefOr[Input[String]] = js.native
  /**
    * Key-value mapping of resource tags for the workgroup.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object WorkgroupState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    configuration: Input[WorkgroupConfiguration] = null,
    description: Input[String] = null,
    name: Input[String] = null,
    state: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): WorkgroupState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (configuration != null) __obj.updateDynamic("configuration")(configuration.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkgroupState]
  }
}

