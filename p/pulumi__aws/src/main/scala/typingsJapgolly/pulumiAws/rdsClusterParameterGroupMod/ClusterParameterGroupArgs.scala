package typingsJapgolly.pulumiAws.rdsClusterParameterGroupMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiAws.inputMod.rds.ClusterParameterGroupParameter
import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterParameterGroupArgs extends js.Object {
  /**
    * The description of the DB cluster parameter group. Defaults to "Managed by Pulumi".
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The family of the DB cluster parameter group.
    */
  val family: Input[String] = js.native
  /**
    * The name of the DB parameter.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
    */
  val namePrefix: js.UndefOr[Input[String]] = js.native
  /**
    * A list of DB parameters to apply. Note that parameters may differ from a family to an other. Full list of all parameters can be discovered via [`aws rds describe-db-cluster-parameters`](https://docs.aws.amazon.com/cli/latest/reference/rds/describe-db-cluster-parameters.html) after initial creation of the group.
    */
  val parameters: js.UndefOr[Input[js.Array[Input[ClusterParameterGroupParameter]]]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object ClusterParameterGroupArgs {
  @scala.inline
  def apply(
    family: Input[String],
    description: Input[String] = null,
    name: Input[String] = null,
    namePrefix: Input[String] = null,
    parameters: Input[js.Array[Input[ClusterParameterGroupParameter]]] = null,
    tags: Input[StringDictionary[_]] = null
  ): ClusterParameterGroupArgs = {
    val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namePrefix != null) __obj.updateDynamic("namePrefix")(namePrefix.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterParameterGroupArgs]
  }
}

