package typingsJapgolly.pulumiAws.neptuneParameterGroupMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiAws.inputMod.neptune.ParameterGroupParameter
import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParameterGroupArgs extends js.Object {
  /**
    * The description of the Neptune parameter group. Defaults to "Managed by Pulumi".
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The family of the Neptune parameter group.
    */
  val family: Input[String] = js.native
  /**
    * The name of the Neptune parameter.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * A list of Neptune parameters to apply.
    */
  val parameters: js.UndefOr[Input[js.Array[Input[ParameterGroupParameter]]]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object ParameterGroupArgs {
  @scala.inline
  def apply(
    family: Input[String],
    description: Input[String] = null,
    name: Input[String] = null,
    parameters: Input[js.Array[Input[ParameterGroupParameter]]] = null,
    tags: Input[StringDictionary[_]] = null
  ): ParameterGroupArgs = {
    val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterGroupArgs]
  }
}

